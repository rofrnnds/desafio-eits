package desafio.ejb.localizacao;


/*
  ** This file was automatically generated by 
  ** EJBGen WebLogic Server 10.3.6.0  Tue Nov 15 08:52:36 PST 2011 1441050 
*/


import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
import javax.ejb.FinderException;
import java.util.Collection;

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

public interface LocalizacaoBeanLocalHome extends EJBLocalHome {

  public LocalizacaoBeanLocal findByPrimaryKey(Integer primaryKey)  throws FinderException;





  /**
   * * 
 * IMPORTANT: Automatically generated ejbCreate() method.
 * Please change as appropriate.
 
   */
  public LocalizacaoBeanLocal create(Integer key)     throws CreateException, javax.ejb.CreateException;



}
