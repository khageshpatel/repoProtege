package org.protege.editor.core.ui.tabbedpane;

import javax.swing.JTabbedPane;


/**
 * Author: Matthew Horridge<br>
 * The University Of Manchester<br>
 * Medical Informatics Group<br>
 * Date: Mar 23, 2006<br><br>
 * <p/>
 * matthew.horridge@cs.man.ac.uk<br>
 * www.cs.man.ac.uk/~horridgm<br><br>
 */
public class ViewTabbedPane extends JTabbedPane {

    /**
     * 
     */
    private static final long serialVersionUID = 2680625953922313629L;


    public ViewTabbedPane() {
        setUI(new CloseableTabbedPaneUI(
                CloseableTabbedPaneUI.TabClosability.NOT_CLOSEABLE,
                new NullTabCloseHandler()));
        setBorder(null);
    }

    public void updateUI() {
//        super.updateUI();
    }
}
