
package mx.com.sky.enterprisemessages.soa.gestionarsscomprarservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.soa.common.v1.EBMHeaderResponseType;


/**
 * <p>Java class for GestionarSSComprarServiciosResponseEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GestionarSSComprarServiciosResponseEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Soa/Common/V1}EBMHeaderResponse"/&gt;
 *         &lt;element name="ServiceInfoResponse" type="{http://www.sky.com.mx/EnterpriseMessages/Soa/GestionarSSComprarServicios}ServiceInfoResponseType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GestionarSSComprarServiciosResponseEBMType",
         propOrder = { "ebmHeaderResponse", "serviceInfoResponse" })
public class GestionarSSComprarServiciosResponseEBMType {

    @XmlElement(name = "EBMHeaderResponse", namespace = "http://www.sky.com.mx/EnterpriseObjects/Soa/Common/V1",
                required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "ServiceInfoResponse", required = true)
    protected ServiceInfoResponseType serviceInfoResponse;

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
     * Gets the value of the serviceInfoResponse property.
     *
     * @return
     *     possible object is
     *     {@link ServiceInfoResponseType }
     *
     */
    public ServiceInfoResponseType getServiceInfoResponse() {
        return serviceInfoResponse;
    }

    /**
     * Sets the value of the serviceInfoResponse property.
     *
     * @param value
     *     allowed object is
     *     {@link ServiceInfoResponseType }
     *
     */
    public void setServiceInfoResponse(ServiceInfoResponseType value) {
        this.serviceInfoResponse = value;
    }

}
