
package mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderResponseType;


/**
 * <p>Java class for ConsultarCapacidadFSResponseEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarCapacidadFSResponseEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sec/ConsultarCapacidadFSEBO}ConsultarCapacidadFSResponseEBM"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarCapacidadFSResponseEBMType",
         propOrder = { "ebmHeaderResponse", "consultarCapacidadFSResponseEBM" })
public class ConsultarCapacidadFSResponseEBMType {

    @XmlElement(name = "EBMHeaderResponse", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "ConsultarCapacidadFSResponseEBM",
                namespace = "http://www.sky.com.mx/EnterpriseObjects/Sec/ConsultarCapacidadFSEBO", required = true)
    protected mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsebo.ConsultarCapacidadFSResponseEBMType consultarCapacidadFSResponseEBM;

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
     * Gets the value of the consultarCapacidadFSResponseEBM property.
     *
     * @return
     *     possible object is
     *     {@link mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsebo.ConsultarCapacidadFSResponseEBMType }
     *
     */
    public mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsebo.ConsultarCapacidadFSResponseEBMType getConsultarCapacidadFSResponseEBM() {
        return consultarCapacidadFSResponseEBM;
    }

    /**
     * Sets the value of the consultarCapacidadFSResponseEBM property.
     *
     * @param value
     *     allowed object is
     *     {@link mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsebo.ConsultarCapacidadFSResponseEBMType }
     *
     */
    public void setConsultarCapacidadFSResponseEBM(mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsebo.ConsultarCapacidadFSResponseEBMType value) {
        this.consultarCapacidadFSResponseEBM = value;
    }

}
