
package mx.com.sky.enterprisemessages.sicof.consultarfactura;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;


/**
 * <p>Java class for ConsultarFacturaRequestEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarFacturaRequestEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/&gt;
 *         &lt;element name="ConsultarFacturaRequest" type="{http://www.sky.com.mx/EnterpriseMessages/Sicof/ConsultarFactura}ConsultarFacturaRequestType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarFacturaRequestEBMType", propOrder = { "ebmHeaderRequest", "consultarFacturaRequest" })
public class ConsultarFacturaRequestEBMType {

    @XmlElement(name = "EBMHeaderRequest", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "ConsultarFacturaRequest", required = true)
    protected ConsultarFacturaRequestType consultarFacturaRequest;

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
     * Gets the value of the consultarFacturaRequest property.
     *
     * @return
     *     possible object is
     *     {@link ConsultarFacturaRequestType }
     *
     */
    public ConsultarFacturaRequestType getConsultarFacturaRequest() {
        return consultarFacturaRequest;
    }

    /**
     * Sets the value of the consultarFacturaRequest property.
     *
     * @param value
     *     allowed object is
     *     {@link ConsultarFacturaRequestType }
     *
     */
    public void setConsultarFacturaRequest(ConsultarFacturaRequestType value) {
        this.consultarFacturaRequest = value;
    }

}
