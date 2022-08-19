
package mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;


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
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sec/ConsultarCapacidadFSEBO}ConsultarCapacidadFSRequestEBM"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarCapacidadFSRequestEBMType",
         propOrder = { "ebmHeaderRequest", "consultarCapacidadFSRequestEBM" })
public class ConsultarCapacidadFSRequestEBMType {

    @XmlElement(name = "EBMHeaderRequest", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "ConsultarCapacidadFSRequestEBM",
                namespace = "http://www.sky.com.mx/EnterpriseObjects/Sec/ConsultarCapacidadFSEBO", required = true)
    protected mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsebo.ConsultarCapacidadFSRequestEBMType consultarCapacidadFSRequestEBM;

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
     * Gets the value of the consultarCapacidadFSRequestEBM property.
     *
     * @return
     *     possible object is
     *     {@link mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsebo.ConsultarCapacidadFSRequestEBMType }
     *
     */
    public mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsebo.ConsultarCapacidadFSRequestEBMType getConsultarCapacidadFSRequestEBM() {
        return consultarCapacidadFSRequestEBM;
    }

    /**
     * Sets the value of the consultarCapacidadFSRequestEBM property.
     *
     * @param value
     *     allowed object is
     *     {@link mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsebo.ConsultarCapacidadFSRequestEBMType }
     *
     */
    public void setConsultarCapacidadFSRequestEBM(mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsebo.ConsultarCapacidadFSRequestEBMType value) {
        this.consultarCapacidadFSRequestEBM = value;
    }

}
