
package mx.com.sky.enterpriseobjects.sel.validarpreregistroselinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.oracle.xmlns.pcbpel.adapter.db.dbvalidarpreregistrosel.DbValidarPreRegistroSelInput;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;


/**
 * <p>Java class for ValidarPreRegistroSelEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ValidarPreRegistroSelEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/pcbpel/adapter/db/DbValidarPreRegistroSel}DbValidarPreRegistroSelInput"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidarPreRegistroSelEBMType", propOrder = { "ebmHeaderRequest", "dbValidarPreRegistroSelInput" })
public class ValidarPreRegistroSelEBMType {

    @XmlElement(name = "EBMHeaderRequest", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "DbValidarPreRegistroSelInput",
                namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/DbValidarPreRegistroSel", required = true)
    protected DbValidarPreRegistroSelInput dbValidarPreRegistroSelInput;

    /**
     * Gets the value of the ebmHeaderRequest property.
     *
     * @return
     *     possible object is
     *     {@link EBMHeaderRequestType }
     *
     */
    public EBMHeaderRequestType getEBMHeaderRequest() {
        return ebmHeaderRequest;
    }

    /**
     * Sets the value of the ebmHeaderRequest property.
     *
     * @param value
     *     allowed object is
     *     {@link EBMHeaderRequestType }
     *
     */
    public void setEBMHeaderRequest(EBMHeaderRequestType value) {
        this.ebmHeaderRequest = value;
    }

    /**
     * Gets the value of the dbValidarPreRegistroSelInput property.
     *
     * @return
     *     possible object is
     *     {@link DbValidarPreRegistroSelInput }
     *
     */
    public DbValidarPreRegistroSelInput getDbValidarPreRegistroSelInput() {
        return dbValidarPreRegistroSelInput;
    }

    /**
     * Sets the value of the dbValidarPreRegistroSelInput property.
     *
     * @param value
     *     allowed object is
     *     {@link DbValidarPreRegistroSelInput }
     *
     */
    public void setDbValidarPreRegistroSelInput(DbValidarPreRegistroSelInput value) {
        this.dbValidarPreRegistroSelInput = value;
    }

}
