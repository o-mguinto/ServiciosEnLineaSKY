
package mx.com.sky.enterpriseflowmessage.sel.certificaconcesionbeneficio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertificaConcesionBeneficioOutputMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CertificaConcesionBeneficioOutputMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumeroSolicitud" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FechaRegistro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FechaInicioBeneficio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FechaFinBeneficio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificaConcesionBeneficioOutputMessageType",
         propOrder = { "numeroSolicitud", "fechaRegistro", "fechaInicioBeneficio", "fechaFinBeneficio"
    })
public class CertificaConcesionBeneficioOutputMessageType {

    @XmlElement(name = "NumeroSolicitud", required = true)
    protected String numeroSolicitud;
    @XmlElement(name = "FechaRegistro", required = true)
    protected String fechaRegistro;
    @XmlElement(name = "FechaInicioBeneficio", required = true)
    protected String fechaInicioBeneficio;
    @XmlElement(name = "FechaFinBeneficio", required = true)
    protected String fechaFinBeneficio;

    /**
     * Gets the value of the numeroSolicitud property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroSolicitud() {
        return numeroSolicitud;
    }

    /**
     * Sets the value of the numeroSolicitud property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroSolicitud(String value) {
        this.numeroSolicitud = value;
    }

    /**
     * Gets the value of the fechaRegistro property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Sets the value of the fechaRegistro property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaRegistro(String value) {
        this.fechaRegistro = value;
    }

    /**
     * Gets the value of the fechaInicioBeneficio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaInicioBeneficio() {
        return fechaInicioBeneficio;
    }

    /**
     * Sets the value of the fechaInicioBeneficio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaInicioBeneficio(String value) {
        this.fechaInicioBeneficio = value;
    }

    /**
     * Gets the value of the fechaFinBeneficio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaFinBeneficio() {
        return fechaFinBeneficio;
    }

    /**
     * Sets the value of the fechaFinBeneficio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaFinBeneficio(String value) {
        this.fechaFinBeneficio = value;
    }

}
