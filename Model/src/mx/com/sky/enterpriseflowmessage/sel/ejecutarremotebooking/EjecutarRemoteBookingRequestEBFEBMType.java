
package mx.com.sky.enterpriseflowmessage.sel.ejecutarremotebooking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;


/**
 * <p>Java class for EjecutarRemoteBookingRequestEBFEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="EjecutarRemoteBookingRequestEBFEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/&gt;
 *         &lt;element name="EjecutarRemoteBookingRequest" type="{http://www.sky.com.mx/EnterpriseFlowMessage/Sel/EjecutarRemoteBooking}RemoteBookingRequestEBMType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EjecutarRemoteBookingRequestEBFEBMType",
         propOrder = { "ebmHeaderRequest", "ejecutarRemoteBookingRequest"
    })
public class EjecutarRemoteBookingRequestEBFEBMType {

    @XmlElement(name = "EBMHeaderRequest",
                namespace =
                "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "EjecutarRemoteBookingRequest", required = true)
    protected RemoteBookingRequestEBMType ejecutarRemoteBookingRequest;

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
     * Gets the value of the ejecutarRemoteBookingRequest property.
     *
     * @return
     *     possible object is
     *     {@link RemoteBookingRequestEBMType }
     *
     */
    public RemoteBookingRequestEBMType getEjecutarRemoteBookingRequest() {
        return ejecutarRemoteBookingRequest;
    }

    /**
     * Sets the value of the ejecutarRemoteBookingRequest property.
     *
     * @param value
     *     allowed object is
     *     {@link RemoteBookingRequestEBMType }
     *
     */
    public void setEjecutarRemoteBookingRequest(RemoteBookingRequestEBMType value) {
        this.ejecutarRemoteBookingRequest = value;
    }

}
