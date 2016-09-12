package desafio.ejb.tipoEquipamento;

import java.util.Date;

import javax.ejb.CreateException;
import javax.ejb.EntityBean;

import weblogic.ejb.GenericEntityBean;
import weblogic.ejbgen.CmpField;
import weblogic.ejbgen.Constants;
import weblogic.ejbgen.Entity;
import weblogic.ejbgen.FileGeneration;
import weblogic.ejbgen.JndiName;
import weblogic.ejbgen.LocalMethod;

/**
 * GenericEntityBean subclass automatically generated by OEPE.
 *
 * Please update the ejbCreate and ejbPostCreate methods as needed to properly initialize new instances
 * of your bean. Also, review primary key field methods and the Entity and JndiName annotations
 * to ensure the settings match the bean's intended use.
 */
@Entity(ejbName = "TipoEquipamentoBean", dataSourceName = "oracledb", tableName = "TIPO_EQUIPAMENTO", primKeyClass = "java.lang.Integer")
@JndiName(local = "ejb.TipoEquipamentoBeanLocalHome")
@FileGeneration(localClass = Constants.Bool.TRUE, localHome = Constants.Bool.TRUE, remoteClass = Constants.Bool.FALSE, remoteHome = Constants.Bool.FALSE, valueClass = Constants.Bool.TRUE)
abstract public class TipoEquipamentoBean extends GenericEntityBean implements
		EntityBean {

	private static final long serialVersionUID = 1L;
	/**
	 * IMPORTANT: Automatically generated ejbCreate() method.
	 * Please change as appropriate.
	 */
	public java.lang.Integer ejbCreate(java.lang.Integer id)
			throws CreateException {
		setId(id);
		return null;
	}

	/**
	 * IMPORTANT: Automatically generated ejbPostCreate() method.
	 * Please change as appropriate.
	 */
	public void ejbPostCreate(java.lang.Integer key) {
	}

	@CmpField(column = "ID", primkeyField = Constants.Bool.TRUE)
	@LocalMethod()
	public abstract Integer getId();
	@LocalMethod()
	public abstract void setId(Integer id);
	
	@CmpField(column = "NOME")
	@LocalMethod()
	public abstract String getNome();
	@LocalMethod()
	public abstract void setNome(String nome);
	
	@CmpField(column = "PESO")
	@LocalMethod()
	public abstract Float getPeso();
	@LocalMethod()
	public abstract void setPeso(Float peso);
	
	@CmpField(column = "VALIDADE")
	@LocalMethod()
	public abstract Date getValidade();
	@LocalMethod()
	public abstract void setValidade(Date validade);
}