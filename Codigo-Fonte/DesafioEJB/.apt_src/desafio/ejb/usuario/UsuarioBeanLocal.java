package desafio.ejb.usuario;


/*
  ** This file was automatically generated by 
  ** EJBGen WebLogic Server 10.3.6.0  Tue Nov 15 08:52:36 PST 2011 1441050 
*/


import javax.ejb.EJBLocalObject;

// BEGIN imports from bean class
import javax.ejb.CreateException;
import javax.ejb.EntityBean;
import weblogic.ejb.GenericEntityBean;
import weblogic.ejbgen.CmpField;
import weblogic.ejbgen.Constants;
import weblogic.ejbgen.Entity;
import weblogic.ejbgen.FileGeneration;
import weblogic.ejbgen.JndiName;
import weblogic.ejbgen.LocalMethod;
// END imports from bean class


/**
 * * 
 * GenericEntityBean subclass automatically generated by OEPE.
 * Please update the ejbCreate and ejbPostCreate methods as needed to properly initialize new instances
 * of your bean. Also, review primary key field methods and the Entity and JndiName annotations
 * to ensure the settings match the bean's intended use.
 
 */

public interface UsuarioBeanLocal extends EJBLocalObject {


  /**
   * @weblogic.ejbgen.LocalMethod 
   * @weblogic.ejbgen.CmpField ID
   */
  public Integer getId() ;
  /**
   * @weblogic.ejbgen.LocalMethod 
   * @weblogic.ejbgen.CmpField NOME
   */
  public String getNome() ;
  /**
   * @weblogic.ejbgen.LocalMethod 
   */
  public void setId(Integer id) ;
  /**
   * @weblogic.ejbgen.LocalMethod 
   */
  public void setNome(String nome) ;
}
