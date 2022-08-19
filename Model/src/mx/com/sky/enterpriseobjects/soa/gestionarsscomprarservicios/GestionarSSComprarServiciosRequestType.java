
package mx.com.sky.enterpriseobjects.soa.gestionarsscomprarservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterprisemessages.soa.gestionarsscomprarservicios.GestionarSSComprarServiciosRequestEBMType;
import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;


/**
 * <p>Java class for GestionarSSComprarServiciosRequestType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GestionarSSComprarServiciosRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseMessages/Soa/GestionarSSComprarServicios}GestionarSSComprarServiciosRequestEBM"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GestionarSSComprarServiciosRequestType",
         propOrder = { "ebmHeaderRequest", "gestionarSSComprarServiciosRequestEBM" })
public class GestionarSSComprarServiciosRequestType {

    @XmlElement(name = "EBMHeaderRequest", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "GestionarSSComprarServiciosRequestEBM",
                namespace = "http://www.sky.com.mx/EnterpriseMessages/Soa/GestionarSSComprarServicios", required = true)
    protected GestionarSSComprarServiciosRequestEBMType gestionarSSComprarServiciosRequestEBM;

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
     * Gets the value of the gestionarSSComprarServiciosRequestEBM property.
     *
     * @return
     *     possible object is
     *     {@link GestionarSSComprarServiciosRequestEBMType }
     *
     */
    public GestionarSSComprarServiciosRequestEBMType getGestionarSSComprarServiciosRequestEBM() {
        return gestionarSSComprarServiciosRequestEBM;
    }

    /**
     * Sets the value of the gestionarSSComprarServiciosRequestEBM property.
     *
     * @param value
     *     allowed object is
     *     {@link GestionarSSComprarServiciosRequestEBMType }
     *
     */
    public void setGestionarSSComprarServiciosRequestEBM(GestionarSSComprarServiciosRequestEBMType value) {
        this.gestionarSSComprarServiciosRequestEBM = value;
    }

}
