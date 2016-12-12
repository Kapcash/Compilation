/**
 * generated by Xtext 2.10.0
 */
package esir.compilation.whileComp.impl;

import esir.compilation.whileComp.Commands;
import esir.compilation.whileComp.Definition;
import esir.compilation.whileComp.Read;
import esir.compilation.whileComp.WhileCompPackage;
import esir.compilation.whileComp.Write;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link esir.compilation.whileComp.impl.DefinitionImpl#getRead <em>Read</em>}</li>
 *   <li>{@link esir.compilation.whileComp.impl.DefinitionImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link esir.compilation.whileComp.impl.DefinitionImpl#getWrite <em>Write</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinitionImpl extends MinimalEObjectImpl.Container implements Definition
{
  /**
   * The cached value of the '{@link #getRead() <em>Read</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRead()
   * @generated
   * @ordered
   */
  protected Read read;

  /**
   * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommands()
   * @generated
   * @ordered
   */
  protected Commands commands;

  /**
   * The cached value of the '{@link #getWrite() <em>Write</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWrite()
   * @generated
   * @ordered
   */
  protected Write write;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefinitionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return WhileCompPackage.Literals.DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Read getRead()
  {
    return read;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRead(Read newRead, NotificationChain msgs)
  {
    Read oldRead = read;
    read = newRead;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCompPackage.DEFINITION__READ, oldRead, newRead);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRead(Read newRead)
  {
    if (newRead != read)
    {
      NotificationChain msgs = null;
      if (read != null)
        msgs = ((InternalEObject)read).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCompPackage.DEFINITION__READ, null, msgs);
      if (newRead != null)
        msgs = ((InternalEObject)newRead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCompPackage.DEFINITION__READ, null, msgs);
      msgs = basicSetRead(newRead, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCompPackage.DEFINITION__READ, newRead, newRead));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commands getCommands()
  {
    return commands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCommands(Commands newCommands, NotificationChain msgs)
  {
    Commands oldCommands = commands;
    commands = newCommands;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCompPackage.DEFINITION__COMMANDS, oldCommands, newCommands);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCommands(Commands newCommands)
  {
    if (newCommands != commands)
    {
      NotificationChain msgs = null;
      if (commands != null)
        msgs = ((InternalEObject)commands).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCompPackage.DEFINITION__COMMANDS, null, msgs);
      if (newCommands != null)
        msgs = ((InternalEObject)newCommands).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCompPackage.DEFINITION__COMMANDS, null, msgs);
      msgs = basicSetCommands(newCommands, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCompPackage.DEFINITION__COMMANDS, newCommands, newCommands));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Write getWrite()
  {
    return write;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWrite(Write newWrite, NotificationChain msgs)
  {
    Write oldWrite = write;
    write = newWrite;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCompPackage.DEFINITION__WRITE, oldWrite, newWrite);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWrite(Write newWrite)
  {
    if (newWrite != write)
    {
      NotificationChain msgs = null;
      if (write != null)
        msgs = ((InternalEObject)write).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCompPackage.DEFINITION__WRITE, null, msgs);
      if (newWrite != null)
        msgs = ((InternalEObject)newWrite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCompPackage.DEFINITION__WRITE, null, msgs);
      msgs = basicSetWrite(newWrite, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCompPackage.DEFINITION__WRITE, newWrite, newWrite));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case WhileCompPackage.DEFINITION__READ:
        return basicSetRead(null, msgs);
      case WhileCompPackage.DEFINITION__COMMANDS:
        return basicSetCommands(null, msgs);
      case WhileCompPackage.DEFINITION__WRITE:
        return basicSetWrite(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case WhileCompPackage.DEFINITION__READ:
        return getRead();
      case WhileCompPackage.DEFINITION__COMMANDS:
        return getCommands();
      case WhileCompPackage.DEFINITION__WRITE:
        return getWrite();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WhileCompPackage.DEFINITION__READ:
        setRead((Read)newValue);
        return;
      case WhileCompPackage.DEFINITION__COMMANDS:
        setCommands((Commands)newValue);
        return;
      case WhileCompPackage.DEFINITION__WRITE:
        setWrite((Write)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case WhileCompPackage.DEFINITION__READ:
        setRead((Read)null);
        return;
      case WhileCompPackage.DEFINITION__COMMANDS:
        setCommands((Commands)null);
        return;
      case WhileCompPackage.DEFINITION__WRITE:
        setWrite((Write)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case WhileCompPackage.DEFINITION__READ:
        return read != null;
      case WhileCompPackage.DEFINITION__COMMANDS:
        return commands != null;
      case WhileCompPackage.DEFINITION__WRITE:
        return write != null;
    }
    return super.eIsSet(featureID);
  }

} //DefinitionImpl
