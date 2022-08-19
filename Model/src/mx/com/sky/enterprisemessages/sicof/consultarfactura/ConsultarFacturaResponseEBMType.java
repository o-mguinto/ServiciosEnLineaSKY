
package mx.com.sky.enterprisemessages.sicof.consultarfactura;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderResponseType;
import mx.com.sky.enterpriseobjects.sicof.consultarfactura.ConsultarFacturaListType;


/**
 * <p>Java class for ConsultarFacturaResponseEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarFacturaResponseEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/&gt;
 *         &lt;element name="ConsultarFactura" type="{http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura}ConsultarFacturaListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarFacturaResponseEBMType", propOrder = { "ebmHeaderResponse", "consultarFactura" })
public class ConsultarFacturaResponseEBMType {

    @XmlElement(name = "EBMHeaderResponse", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "ConsultarFactura", required = true)
    protected ConsultarFacturaListType consultarFactura;

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
     * Gets the value of the consultarFactura property.
     *
     * @return
     *     possible object is
     *     {@link ConsultarFacturaListType }
     *
     */
    public ConsultarFacturaListType getConsultarFactura() {
        return consultarFactura;
    }

    /**
     * Sets the value of the consultarFactura property.
     *
     * @param value
     *     allowed object is
     *     {@link ConsultarFacturaListType }
     *
     */
    public void setConsultarFactura(ConsultarFacturaListType value) {
        this.consultarFactura = value;
    }

}
