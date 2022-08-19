
package mx.com.sky.enterpriseobjects.soa.gestionarsscomprardatosinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;


/**
 * <p>Java class for GestionarSSComprarDatosRequestEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GestionarSSComprarDatosRequestEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseMessages/Soa/GestionarSSComprarDatos}GestionarSSComprarDatosRequestEBM"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GestionarSSComprarDatosRequestEBMType",
         propOrder = { "ebmHeaderRequest", "gestionarSSComprarDatosRequestEBM"
    })
public class GestionarSSComprarDatosRequestEBMType {

    @XmlElement(name = "EBMHeaderRequest",
                namespace =
                "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "GestionarSSComprarDatosRequestEBM",
                namespace =
                "http://www.sky.com.mx/EnterpriseMessages/Soa/GestionarSSComprarDatos",
                required = true)
    protected mx.com.sky.enterprisemessages.soa.gestionarsscomprardatos.GestionarSSComprarDatosRequestEBMType gestionarSSComprarDatosRequestEBM;

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
     * Gets the value of the gestionarSSComprarDatosRequestEBM property.
     *
     * @return
     *     possible object is
     *     {@link mx.com.sky.enterprisemessages.soa.gestionarsscomprardatos.GestionarSSComprarDatosRequestEBMType }
     *
     */
    public mx.com.sky.enterprisemessages.soa.gestionarsscomprardatos.GestionarSSComprarDatosRequestEBMType getGestionarSSComprarDatosRequestEBM() {
        return gestionarSSComprarDatosRequestEBM;
    }

    /**
     * Sets the value of the gestionarSSComprarDatosRequestEBM property.
     *
     * @param value
     *     allowed object is
     *     {@link mx.com.sky.enterprisemessages.soa.gestionarsscomprardatos.GestionarSSComprarDatosRequestEBMType }
     *
     */
    public void setGestionarSSComprarDatosRequestEBM(mx.com.sky.enterprisemessages.soa.gestionarsscomprardatos.GestionarSSComprarDatosRequestEBMType value) {
        this.gestionarSSComprarDatosRequestEBM = value;
    }

}
