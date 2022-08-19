
package mx.com.sky.enterpriseflowmessage.soasap.obtenerfacturapdf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObtenerFacturaPDFResType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ObtenerFacturaPDFResType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pdf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="respuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="respuestaDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObtenerFacturaPDFResType", propOrder = { "pdf", "respuesta", "respuestaDesc" })
public class ObtenerFacturaPDFResType {

    protected String pdf;
    protected String respuesta;
    protected String respuestaDesc;

    /**
     * Gets the value of the pdf property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPdf() {
        return pdf;
    }

    /**
     * Sets the value of the pdf property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPdf(String value) {
        this.pdf = value;
    }

    /**
     * Gets the value of the respuesta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * Sets the value of the respuesta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRespuesta(String value) {
        this.respuesta = value;
    }

    /**
     * Gets the value of the respuestaDesc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRespuestaDesc() {
        return respuestaDesc;
    }

    /**
     * Sets the value of the respuestaDesc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRespuestaDesc(String value) {
        this.respuestaDesc = value;
    }

}
