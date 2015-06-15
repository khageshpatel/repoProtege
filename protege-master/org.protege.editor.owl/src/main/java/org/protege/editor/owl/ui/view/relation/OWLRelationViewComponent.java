package org.protege.editor.owl.ui.view.relation;

import org.protege.editor.owl.ui.list.OWLAxiomList;
import org.protege.editor.owl.ui.list.OWLObjectList;
import org.protege.editor.core.ui.util.ComponentFactory;
import org.semanticweb.owlapi.model.*;
import javax.swing.JList;
import org.protege.editor.owl.model.util.OWLDataTypeUtils;
import org.protege.editor.owl.model.util.OWLEntityDeleter;
import java.util.Collections;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import org.protege.editor.core.ui.view.DisposableAction;
import org.protege.editor.owl.ui.view.OWLSelectionViewAction;
import org.protege.editor.owl.ui.OWLIcons;


import java.awt.BorderLayout;
import org.apache.log4j.Logger;
import org.protege.editor.owl.ui.view.AbstractOWLViewComponent;

public class OWLRelationViewComponent extends AbstractOWLViewComponent {
    private static final long serialVersionUID = -4515710047558710080L;
    private static final Logger log = Logger.getLogger(OWLRelationViewComponent.class);
	private OWLObjectList<OWLDatatype> list;
	
    @Override
    protected void initialiseOWLView() throws Exception {
        setLayout(new BorderLayout());
		list = new OWLObjectList<OWLDatatype>(getOWLEditorKit());
		//String[] selections = { "green", "red", "orange", "dark blue", "green", "red", "orange", "dark blue", "green", "red", "orange", "dark blue" };
		//JList list = new JList(selections);
        //add(metricsComponent, BorderLayout.CENTER);
		//add(ComponentFactory.createScrollPane(new OWLAxiomList(getOWLEditorKit())));
		//add(ComponentFactory.createScrollPane(new OWLObjectList<OWLDatatype>(getOWLEditorKit())));
		reload();
		setupActions();
		add(ComponentFactory.createScrollPane(list));
        log.info("Example View Component initialized");
    }

	@Override
	protected void disposeOWLView() {
	}
	
	private void reload(){
        // Add all known datatypes including built in ones
        final OWLOntologyManager mngr = getOWLModelManager().getOWLOntologyManager();
        java.util.List<OWLDatatype> datatypeList = new ArrayList<OWLDatatype>(new OWLDataTypeUtils(mngr).getKnownDatatypes(getOWLModelManager().getActiveOntologies()));
        Collections.sort(datatypeList, getOWLModelManager().getOWLObjectComparator());

        list.setListData(datatypeList.toArray(new OWLDatatype[datatypeList.size()]));
        final OWLDatatype sel = getOWLWorkspace().getOWLSelectionModel().getLastSelectedDatatype();
        if (datatypeList.contains(sel)){
            list.setSelectedValue(sel, true);
        }
    }
	
	    private void setupActions() {
        final DisposableAction addDatatypeAction = new DisposableAction("Add datatype", OWLIcons.getIcon("datarange.add.png")) {
            /**
             * 
             */
            private static final long serialVersionUID = 7152977701137488187L;

            public void actionPerformed(ActionEvent event) {
                createNewRelation();
            }

            public void dispose() {
                // do nothing
            }
        };

        final OWLSelectionViewAction deleteDatatypeAction = new OWLSelectionViewAction("Delete datatype", OWLIcons.getIcon("datarange.remove.png")) {

            /**
             * 
             */
            private static final long serialVersionUID = 5359788681251086828L;


            public void actionPerformed(ActionEvent event) {
                deleteRelation();
            }


            public void updateState() {
                // @@TODO should check if this is a built in datatype
                setEnabled(list.getSelectedIndex() != -1);
            }


            public void dispose() {
                // do nothing
            }
        };

        addAction(addDatatypeAction, "A", "A");
        addAction(deleteDatatypeAction, "B", "A");
    }

	public void createNewRelation(){
		System.out.println("Create relation called");
	}
	
	public void deleteRelation(){
		System.out.println("Delete relation called");
	}
}
