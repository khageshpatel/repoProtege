package uk.ac.man.cs.mig.coode.owlviz.ui;

import org.protege.editor.core.prefs.Preferences;
import org.protege.editor.core.prefs.PreferencesManager;
/*
* Copyright (C) 2007, University of Manchester
*
* Modifications to the initial code base are copyright of their
* respective authors, or their employers as appropriate.  Authorship
* of the modifications may be determined from the ChangeLog placed at
* the end of this file.
*
* This library is free software; you can redistribute it and/or
* modify it under the terms of the GNU Lesser General Public
* License as published by the Free Software Foundation; either
* version 2.1 of the License, or (at your option) any later version.

* This library is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
* Lesser General Public License for more details.

* You should have received a copy of the GNU Lesser General Public
* License along with this library; if not, write to the Free Software
* Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
*/

/**
 * Author: drummond<br>
 * http://www.cs.man.ac.uk/~drummond/<br><br>
 * <p/>
 * The University Of Manchester<br>
 * Bio Health Informatics Group<br>
 * Date: Dec 10, 2008<br><br>
 */
public class OWLVizPreferences {

    private static OWLVizPreferences instance;

    private static final String KEY = "uk.ac.man.cs.mig.coode.owlviz";

    private static final String TRACKING = "TRACKING";

    private static final String RADIUS = "RADIUS";


    public static synchronized OWLVizPreferences getInstance() {
        if(instance == null) {
            instance = new OWLVizPreferences();
        }
        return instance;
    }

    private Preferences getPrefs() {
        return PreferencesManager.getInstance().getApplicationPreferences(KEY);
    }


    public boolean isTrackingModeDefault() {
        return getPrefs().getBoolean(TRACKING, true);
    }


    public void setTrackingModeDefault(boolean b) {
        getPrefs().putBoolean(TRACKING, b);
    }


    public int getDefaultTrackerRadius() {
        return getPrefs().getInt(RADIUS, 2);
    }

    
    public void setDefaultTrackerRadius(int radius){
        getPrefs().putInt(RADIUS, radius);
    }
}
