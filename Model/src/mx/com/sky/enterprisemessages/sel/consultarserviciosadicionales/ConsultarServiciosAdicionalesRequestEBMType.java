
package mx.com.sky.enterprisemessages.sel.consultarserviciosadicionales;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;


/**
 * <p>Java class for ConsultarServiciosAdicionalesRequestEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarServiciosAdicionalesRequestEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/&gt;
 *         &lt;element name="ConsultarServiciosAdicionalesRequest" type="{http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultarServiciosAdicionales}ConsultarServiciosAdicionalesRequestType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarServiciosAdicionalesRequestEBMType",
         propOrder = { "ebmHeaderRequest", "consultarServiciosAdicionalesRequest" })
public class ConsultarServiciosAdicionalesRequestEBMType {

    @XmlElement(name = "EBMHeaderRequest", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "ConsultarServiciosAdicionalesRequest", required = true)
    protected ConsultarServiciosAdicionalesRequestType consultarServiciosAdicionalesRequest;

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
     * Gets the value of the consultarServiciosAdicionalesRequest property.
     *
     * @return
     *     possible object is
     *     {@link ConsultarServiciosAdicionalesRequestType }
     *
     */
    public ConsultarServiciosAdicionalesRequestType getConsultarServiciosAdicionalesRequest() {
        return consultarServiciosAdicionalesRequest;
    }

    /**
     * Sets the value of the consultarServiciosAdicionalesRequest property.
     *
     * @param value
     *     allowed object is
     *     {@link ConsultarServiciosAdicionalesRequestType }
     *
     */
    public void setConsultarServiciosAdicionalesRequest(ConsultarServiciosAdicionalesRequestType value) {
        this.consultarServiciosAdicionalesRequest = value;
    }

}
