
package mx.com.sky.enterpriseflowmessage.soasap.obtenerfacturapdf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sap.common.v3.EBMHeaderResponseType;


/**
 * <p>Java class for ObtenerFacturaPDFResponseType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ObtenerFacturaPDFResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sap/Common/V3}EBMHeaderResponse"/&gt;
 *         &lt;element name="ObtenerFacturaPDFResponse" type="{http://www.sky.com.mx/EnterpriseFlowMessage/SoaSap/ObtenerFacturaPDF}ObtenerFacturaPDFResType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObtenerFacturaPDFResponseType", propOrder = { "ebmHeaderResponse", "obtenerFacturaPDFResponse" })
public class ObtenerFacturaPDFResponseType {

    @XmlElement(name = "EBMHeaderResponse", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sap/Common/V3",
                required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "ObtenerFacturaPDFResponse")
    protected ObtenerFacturaPDFResType obtenerFacturaPDFResponse;

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
     * Gets the value of the obtenerFacturaPDFResponse property.
     *
     * @return
     *     possible object is
     *     {@link ObtenerFacturaPDFResType }
     *
     */
    public ObtenerFacturaPDFResType getObtenerFacturaPDFResponse() {
        return obtenerFacturaPDFResponse;
    }

    /**
     * Sets the value of the obtenerFacturaPDFResponse property.
     *
     * @param value
     *     allowed object is
     *     {@link ObtenerFacturaPDFResType }
     *
     */
    public void setObtenerFacturaPDFResponse(ObtenerFacturaPDFResType value) {
        this.obtenerFacturaPDFResponse = value;
    }

}
