package uk.ac.manchester.cs.owl.owlapi;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import org.semanticweb.owlapi.model.OWLClass;

import org.semanticweb.owlapi.model.OWLRelation;


public class OWLRelationInstanceContainer{

	List<OWLRelationInstance> relationInstances;
	Map<String,String> containedRelations = new HashMap<String, String>();
	
	public OWLRelationInstanceContainer(){
		relationInstances = new ArrayList<OWLRelationInstance>();
	}


	public void push(OWLRelationInstance el){
		if(!doesContain(el)){
			containedRelations.put(el.toString(),"YES");
			relationInstances.add(el);
		}
	}

	public boolean doesContain(OWLRelationInstance el){
		if(containedRelations.get(el.toString()) == null)
			return false;
		else
			return true;
	}

	public void printRelationInstances(){
		System.out.println("All relation ships are:");
		for(OWLRelationInstance ins : relationInstances){
			System.out.println("    " + ins.toString().split("~")[0] + " --> " + ins.toString().split("~")[1]);
		}
	}
	
	public Set<OWLClass> getAllOwlClasses(){
		Set<OWLClass> related = new HashSet<OWLClass>();
		for(OWLRelationInstance ins : relationInstances){
			related.add(ins.getRelatedTo());
		}
		return related;
	}
	
	public Map<String,String> getEdgeLabelMap(){
		Map<String,String> edgeMap = new HashMap<String,String>();
		for(OWLRelationInstance ins : relationInstances){
			if(edgeMap.containsKey(ins.getRelatedTo().toStringID())){
				edgeMap.put(ins.getRelatedTo().toStringID(),edgeMap.get(ins.getRelatedTo().toStringID()) + "&" + ins.toRelationName());
			}
			else
				edgeMap.put(ins.getRelatedTo().toStringID(),ins.toRelationName());
		}
		return edgeMap;
	}
	
}