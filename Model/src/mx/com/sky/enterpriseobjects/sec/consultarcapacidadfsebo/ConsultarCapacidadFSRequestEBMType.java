
package mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsebo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarCapacidadFSRequestEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarCapacidadFSRequestEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsultarCapacidadFSRequest" type="{http://www.sky.com.mx/EnterpriseObjects/Sec/ConsultarCapacidadFSEBO}ConsultarCapacidadFSRequestType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarCapacidadFSRequestEBMType", propOrder = { "consultarCapacidadFSRequest" })
public class ConsultarCapacidadFSRequestEBMType {

    @XmlElement(name = "ConsultarCapacidadFSRequest", required = true)
    protected ConsultarCapacidadFSRequestType consultarCapacidadFSRequest;

    /**
     * Gets the value of the consultarCapacidadFSRequest property.
     *
     * @return
     *     possible object is
     *     {@link ConsultarCapacidadFSRequestType }
     *
     */
    public ConsultarCapacidadFSRequestType getConsultarCapacidadFSRequest() {
        return consultarCapacidadFSRequest;
    }

    /**
     * Sets the value of the consultarCapacidadFSRequest property.
     *
     * @param value
     *     allowed object is
     *     {@link ConsultarCapacidadFSRequestType }
     *
     */
    public void setConsultarCapacidadFSRequest(ConsultarCapacidadFSRequestType value) {
        this.consultarCapacidadFSRequest = value;
    }

}
