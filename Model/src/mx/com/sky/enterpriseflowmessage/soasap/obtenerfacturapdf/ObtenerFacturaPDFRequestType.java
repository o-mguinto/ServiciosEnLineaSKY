
package mx.com.sky.enterpriseflowmessage.soasap.obtenerfacturapdf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sap.common.v3.EBMHeaderRequestType;


/**
 * <p>Java class for ObtenerFacturaPDFRequestType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ObtenerFacturaPDFRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sap/Common/V3}EBMHeaderRequest"/&gt;
 *         &lt;element name="ObtenerFacturaPDFRequest" type="{http://www.sky.com.mx/EnterpriseFlowMessage/SoaSap/ObtenerFacturaPDF}ObtenerFacturaPDFReqType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObtenerFacturaPDFRequestType", propOrder = { "ebmHeaderRequest", "obtenerFacturaPDFRequest" })
public class ObtenerFacturaPDFRequestType {

    @XmlElement(name = "EBMHeaderRequest", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sap/Common/V3",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "ObtenerFacturaPDFRequest")
    protected ObtenerFacturaPDFReqType obtenerFacturaPDFRequest;

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
     * Gets the value of the obtenerFacturaPDFRequest property.
     *
     * @return
     *     possible object is
     *     {@link ObtenerFacturaPDFReqType }
     *
     */
    public ObtenerFacturaPDFReqType getObtenerFacturaPDFRequest() {
        return obtenerFacturaPDFRequest;
    }

    /**
     * Sets the value of the obtenerFacturaPDFRequest property.
     *
     * @param value
     *     allowed object is
     *     {@link ObtenerFacturaPDFReqType }
     *
     */
    public void setObtenerFacturaPDFRequest(ObtenerFacturaPDFReqType value) {
        this.obtenerFacturaPDFRequest = value;
    }

}
