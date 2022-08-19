
package mx.com.sky.enterpriseflowmessages.sel.gestionarpagocontdc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatosTransaccionPagoOutputMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DatosTransaccionPagoOutputMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idSolicitudServicio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numeroSolicitudServicio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="identificadorUnicoPago" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosTransaccionPagoOutputMessageType",
         propOrder =
         { "idSolicitudServicio", "numeroSolicitudServicio",
           "identificadorUnicoPago"
    })
public class DatosTransaccionPagoOutputMessageType {

    @XmlElement(required = true)
    protected String idSolicitudServicio;
    @XmlElement(required = true)
    protected String numeroSolicitudServicio;
    @XmlElement(required = true)
    protected String identificadorUnicoPago;

    /**
     * Gets the value of the idSolicitudServicio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdSolicitudServicio() {
        return idSolicitudServicio;
    }

    /**
     * Sets the value of the idSolicitudServicio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdSolicitudServicio(String value) {
        this.idSolicitudServicio = value;
    }

    /**
     * Gets the value of the numeroSolicitudServicio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroSolicitudServicio() {
        return numeroSolicitudServicio;
    }

    /**
     * Sets the value of the numeroSolicitudServicio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroSolicitudServicio(String value) {
        this.numeroSolicitudServicio = value;
    }

    /**
     * Gets the value of the identificadorUnicoPago property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdentificadorUnicoPago() {
        return identificadorUnicoPago;
    }

    /**
     * Sets the value of the identificadorUnicoPago property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdentificadorUnicoPago(String value) {
        this.identificadorUnicoPago = value;
    }

}
