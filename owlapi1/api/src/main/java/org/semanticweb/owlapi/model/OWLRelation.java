package org.semanticweb.owlapi.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


public class OWLRelation{

	String relationName;
	String nsName;
	
	public OWLRelation(String ns, String name){
		setName(ns, name);
	}

	public void setName(String ns, String name){
		this.relationName = name;
		this.nsName       = ns;
	}

	public String getName(){
		return relationName;
	}

	public String getNS(){
		return nsName;
	}
	
	public String toString() {
		if(getNS().equals(""))
			return nsName + relationName;
		else
			return nsName + "#" + relationName;
	}

}