
package mx.com.sky.enterpriseflowmessage.sel.registrardatosfiscales;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;


/**
 * <p>Java class for RegistrarDatosFiscalesRequestType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RegistrarDatosFiscalesRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/RegistrarDatosFiscales}RegistrarDatosFiscalesRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrarDatosFiscalesRequestType",
         propOrder = { "ebmHeaderRequest", "registrarDatosFiscalesRequest" })
public class RegistrarDatosFiscalesRequestType {

    @XmlElement(name = "EBMHeaderRequest", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "RegistrarDatosFiscalesRequest",
                namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/RegistrarDatosFiscales", required = true)
    protected mx.com.sky.enterpriseobjects.sel.registrardatosfiscales.RegistrarDatosFiscalesRequestType registrarDatosFiscalesRequest;

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
     * Gets the value of the registrarDatosFiscalesRequest property.
     *
     * @return
     *     possible object is
     *     {@link mx.com.sky.enterpriseobjects.sel.registrardatosfiscales.RegistrarDatosFiscalesRequestType }
     *
     */
    public mx.com.sky.enterpriseobjects.sel.registrardatosfiscales.RegistrarDatosFiscalesRequestType getRegistrarDatosFiscalesRequest() {
        return registrarDatosFiscalesRequest;
    }

    /**
     * Sets the value of the registrarDatosFiscalesRequest property.
     *
     * @param value
     *     allowed object is
     *     {@link mx.com.sky.enterpriseobjects.sel.registrardatosfiscales.RegistrarDatosFiscalesRequestType }
     *
     */
    public void setRegistrarDatosFiscalesRequest(mx.com.sky.enterpriseobjects.sel.registrardatosfiscales.RegistrarDatosFiscalesRequestType value) {
        this.registrarDatosFiscalesRequest = value;
    }

}
