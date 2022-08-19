
package mx.com.sky.enterprisemessages.soa.gestionarsscomprarservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.soa.common.v1.EBMHeaderRequestType;


/**
 * <p>Java class for GestionarSSComprarServiciosRequestEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GestionarSSComprarServiciosRequestEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Soa/Common/V1}EBMHeaderRequest"/&gt;
 *         &lt;element name="ServiceInfoRequest" type="{http://www.sky.com.mx/EnterpriseMessages/Soa/GestionarSSComprarServicios}ServiceInfoRequestType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GestionarSSComprarServiciosRequestEBMType", propOrder = { "ebmHeaderRequest", "serviceInfoRequest" })
public class GestionarSSComprarServiciosRequestEBMType {

    @XmlElement(name = "EBMHeaderRequest", namespace = "http://www.sky.com.mx/EnterpriseObjects/Soa/Common/V1",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "ServiceInfoRequest", required = true)
    protected ServiceInfoRequestType serviceInfoRequest;

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
     * Gets the value of the serviceInfoRequest property.
     *
     * @return
     *     possible object is
     *     {@link ServiceInfoRequestType }
     *
     */
    public ServiceInfoRequestType getServiceInfoRequest() {
        return serviceInfoRequest;
    }

    /**
     * Sets the value of the serviceInfoRequest property.
     *
     * @param value
     *     allowed object is
     *     {@link ServiceInfoRequestType }
     *
     */
    public void setServiceInfoRequest(ServiceInfoRequestType value) {
        this.serviceInfoRequest = value;
    }

}
