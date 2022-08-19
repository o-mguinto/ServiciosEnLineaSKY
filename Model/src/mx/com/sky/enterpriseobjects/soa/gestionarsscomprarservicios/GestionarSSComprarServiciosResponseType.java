
package mx.com.sky.enterpriseobjects.soa.gestionarsscomprarservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterprisemessages.soa.gestionarsscomprarservicios.GestionarSSComprarServiciosResponseEBMType;
import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderResponseType;


/**
 * <p>Java class for GestionarSSComprarServiciosResponseType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GestionarSSComprarServiciosResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseMessages/Soa/GestionarSSComprarServicios}GestionarSSComprarServiciosResponseEBM"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GestionarSSComprarServiciosResponseType",
         propOrder = { "ebmHeaderResponse", "gestionarSSComprarServiciosResponseEBM" })
public class GestionarSSComprarServiciosResponseType {

    @XmlElement(name = "EBMHeaderResponse", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "GestionarSSComprarServiciosResponseEBM",
                namespace = "http://www.sky.com.mx/EnterpriseMessages/Soa/GestionarSSComprarServicios", required = true)
    protected GestionarSSComprarServiciosResponseEBMType gestionarSSComprarServiciosResponseEBM;

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
     * Gets the value of the gestionarSSComprarServiciosResponseEBM property.
     *
     * @return
     *     possible object is
     *     {@link GestionarSSComprarServiciosResponseEBMType }
     *
     */
    public GestionarSSComprarServiciosResponseEBMType getGestionarSSComprarServiciosResponseEBM() {
        return gestionarSSComprarServiciosResponseEBM;
    }

    /**
     * Sets the value of the gestionarSSComprarServiciosResponseEBM property.
     *
     * @param value
     *     allowed object is
     *     {@link GestionarSSComprarServiciosResponseEBMType }
     *
     */
    public void setGestionarSSComprarServiciosResponseEBM(GestionarSSComprarServiciosResponseEBMType value) {
        this.gestionarSSComprarServiciosResponseEBM = value;
    }

}
