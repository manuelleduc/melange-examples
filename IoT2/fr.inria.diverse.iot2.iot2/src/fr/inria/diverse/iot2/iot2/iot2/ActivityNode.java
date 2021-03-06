/**
 */
package fr.inria.diverse.iot2.iot2.iot2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.ActivityNode#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.ActivityNode#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.ActivityNode#getActivity <em>Activity</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.ActivityNode#isRunning <em>Running</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getActivityNode()
 * @model
 * @generated
 */
public interface ActivityNode extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.diverse.iot2.iot2.iot2.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.iot2.iot2.iot2.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getActivityNode_Outgoing()
	 * @see fr.inria.diverse.iot2.iot2.iot2.ActivityEdge#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<ActivityEdge> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.diverse.iot2.iot2.iot2.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.iot2.iot2.iot2.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getActivityNode_Incoming()
	 * @see fr.inria.diverse.iot2.iot2.iot2.ActivityEdge#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<ActivityEdge> getIncoming();

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.iot2.iot2.iot2.Activity#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' container reference.
	 * @see #setActivity(Activity)
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getActivityNode_Activity()
	 * @see fr.inria.diverse.iot2.iot2.iot2.Activity#getNodes
	 * @model opposite="nodes" required="true" transient="false"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.iot2.iot2.iot2.ActivityNode#getActivity <em>Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' container reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running</em>' attribute.
	 * @see #setRunning(boolean)
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getActivityNode_Running()
	 * @model required="true"
	 * @generated
	 */
	boolean isRunning();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.iot2.iot2.iot2.ActivityNode#isRunning <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running</em>' attribute.
	 * @see #isRunning()
	 * @generated
	 */
	void setRunning(boolean value);

} // ActivityNode
