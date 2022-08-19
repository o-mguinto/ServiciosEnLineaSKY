
package mx.com.sky.enterpriseflowmessage.sel.registrardatosfiscales;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderResponseType;


/**
 * <p>Java class for RegistrarDatosFiscalesResponseType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RegistrarDatosFiscalesResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/RegistrarDatosFiscales}RegistrarDatosFiscalesResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrarDatosFiscalesResponseType",
         propOrder = { "ebmHeaderResponse", "registrarDatosFiscalesResponse" })
public class RegistrarDatosFiscalesResponseType {

    @XmlElement(name = "EBMHeaderResponse", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "RegistrarDatosFiscalesResponse",
                namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/RegistrarDatosFiscales", required = true)
    protected mx.com.sky.enterpriseobjects.sel.registrardatosfiscales.RegistrarDatosFiscalesResponseType registrarDatosFiscalesResponse;

    /**
     * Gets the value of the ebmHeaderResponse property.
     *
     * @return
     *     possible object is
     *     {@link EBMHeaderResponseType }
     *
     */
    public EBMHeaderResponseType getEBMHeaderResponse() {
        return ebmHeaderResponse;
    }

    /**
     * Sets the value of the ebmHeaderResponse property.
     *
     * @param value
     *     allowed object is
     *     {@link EBMHeaderResponseType }
     *
     */
    public void setEBMHeaderResponse(EBMHeaderResponseType value) {
        this.ebmHeaderResponse = value;
    }

    /**
     * Gets the value of the registrarDatosFiscalesResponse property.
     *
     * @return
     *     possible object is
     *     {@link mx.com.sky.enterpriseobjects.sel.registrardatosfiscales.RegistrarDatosFiscalesResponseType }
     *
     */
    public mx.com.sky.enterpriseobjects.sel.registrardatosfiscales.RegistrarDatosFiscalesResponseType getRegistrarDatosFiscalesResponse() {
        return registrarDatosFiscalesResponse;
    }

    /**
     * Sets the value of the registrarDatosFiscalesResponse property.
     *
     * @param value
     *     allowed object is
     *     {@link mx.com.sky.enterpriseobjects.sel.registrardatosfiscales.RegistrarDatosFiscalesResponseType }
     *
     */
    public void setRegistrarDatosFiscalesResponse(mx.com.sky.enterpriseobjects.sel.registrardatosfiscales.RegistrarDatosFiscalesResponseType value) {
        this.registrarDatosFiscalesResponse = value;
    }

}
