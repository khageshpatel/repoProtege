package uk.ac.man.cs.mig.util.graph.controller;

import uk.ac.man.cs.mig.util.graph.event.GraphGeneratorListener;
import uk.ac.man.cs.mig.util.graph.graph.Graph;
import uk.ac.man.cs.mig.util.graph.graph.Node;

import java.beans.PropertyChangeListener;
import java.util.Iterator;

/**
 * User: matthewhorridge<br>
 * The Univeristy Of Manchester<br>
 * Medical Informatics Group<br>
 * Date: Dec 27, 2003<br><br>
 *
 * matthew.horridge@cs.man.ac.uk<br>
 * www.cs.man.ac.uk/~horridgm<br><br>
 *
 * Creates/updates the graph containing visualised
 * nodes and edges.  Listeners can register themselves with
 * the <code>GraphGenerator</code> so that they are informed
 * about changes to the <code>Graph</code>.
 */
public interface GraphGenerator extends PropertyChangeListener
{
	/**
	 * Retrieves the <code>VisualisedObjectManager</code>, which graphs
	 * are based upon.
	 * @return The <code>VisualisedObjectManager</code>
	 */
	public VisualisedObjectManager getVisualisedObjectManager();

	/**
	 * Sets the <code>VisualisedObjectManager</code>, which the <code>GraphGenerator</code>
	 * bases the <code>Graph</code> on.
	 * @param manager The <code>VisualisedObjectManager</code> to use.
	 */
	public void setVisualisedObjectManager(VisualisedObjectManager manager);

	/**
	 * Gets the <code>Graph</code> based upon the
	 * visible objects in the <code>VisualisedObjectManager</code>.
	 * @return A Graph representing visible objects.  Note that this
	 * <code>Graph</code> may or may not be newly created.
	 */
	public Graph getGraph();

	/**
	 * Returns the <code>Node<code> that represents the given object.
	 * @param obj The object.
	 * @return The <code>Node</code> that represents the object, or
	 * <code>null</code> if the <code>Graph</code> does not contain
	 * a <code>Node</code> that represents the given object.
	 */
	public Node getNodeForObject(Object obj);

	/**
	 * Causes the <code>Graph</code> to be rebuilt.
	 */
	public void invalidateGraph();

	/**
	 * Adds a listener that is informed of events generated by the
	 * <code>GraphGenerator</code>, such as a 'graph changed' event.
	 * @param lsnr The listener to be added.
	 */
	public void addGraphGeneratorListener(GraphGeneratorListener lsnr);

	/**
	 * Removes a previously added <code>GraphGeneratedListener</code>
	 * @param lsnr The listener to be removed.
	 */
	public void removeGraphGeneratorListener(GraphGeneratorListener lsnr);

	/**
	 * Gets an <code>Iterator</code> that can be used to traverse the
	 * listeners.
	 * @return The <code>Iterator</code>, which can also be used to
	 * add and remove listeners.
	 */
	public Iterator getGraphGeneratorListeners();


}
