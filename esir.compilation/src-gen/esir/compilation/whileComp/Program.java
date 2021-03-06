/**
 * generated by Xtext 2.10.0
 */
package esir.compilation.whileComp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esir.compilation.whileComp.Program#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @see esir.compilation.whileComp.WhileCompPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link esir.compilation.whileComp.Function}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see esir.compilation.whileComp.WhileCompPackage#getProgram_Functions()
   * @model containment="true"
   * @generated
   */
  EList<Function> getFunctions();

} // Program
