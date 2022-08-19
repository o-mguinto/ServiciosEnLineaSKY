
package mx.com.sky.enterpriseobjects.soa.gestionarsscomprardatosinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderResponseType;


/**
 * <p>Java class for GestionarSSComprarDatosResponseEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GestionarSSComprarDatosResponseEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseMessages/Soa/GestionarSSComprarDatos}GestionarSSComprarDatosResponseEBM"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GestionarSSComprarDatosResponseEBMType",
         propOrder = { "ebmHeaderResponse", "gestionarSSComprarDatosResponseEBM"
    })
public class GestionarSSComprarDatosResponseEBMType {

    @XmlElement(name = "EBMHeaderResponse",
                namespace =
                "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "GestionarSSComprarDatosResponseEBM",
                namespace =
                "http://www.sky.com.mx/EnterpriseMessages/Soa/GestionarSSComprarDatos",
                required = true)
    protected mx.com.sky.enterprisemessages.soa.gestionarsscomprardatos.GestionarSSComprarDatosResponseEBMType gestionarSSComprarDatosResponseEBM;

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
     * Gets the value of the gestionarSSComprarDatosResponseEBM property.
     *
     * @return
     *     possible object is
     *     {@link mx.com.sky.enterprisemessages.soa.gestionarsscomprardatos.GestionarSSComprarDatosResponseEBMType }
     *
     */
    public mx.com.sky.enterprisemessages.soa.gestionarsscomprardatos.GestionarSSComprarDatosResponseEBMType getGestionarSSComprarDatosResponseEBM() {
        return gestionarSSComprarDatosResponseEBM;
    }

    /**
     * Sets the value of the gestionarSSComprarDatosResponseEBM property.
     *
     * @param value
     *     allowed object is
     *     {@link mx.com.sky.enterprisemessages.soa.gestionarsscomprardatos.GestionarSSComprarDatosResponseEBMType }
     *
     */
    public void setGestionarSSComprarDatosResponseEBM(mx.com.sky.enterprisemessages.soa.gestionarsscomprardatos.GestionarSSComprarDatosResponseEBMType value) {
        this.gestionarSSComprarDatosResponseEBM = value;
    }

}
