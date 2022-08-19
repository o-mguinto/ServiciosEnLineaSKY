
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultaapg.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OUTPUT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="OUTPUT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Programaciones" type="{http://xmlns.oracle.com/consultaProgramacion}Programaciones"/&gt;
 *         &lt;element name="CodigoError" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MensajeError" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OUTPUT", propOrder = { "programaciones", "codigoError", "mensajeError" })
public class OUTPUT {

    @XmlElement(name = "Programaciones", required = true)
    protected Programaciones programaciones;
    @XmlElement(name = "CodigoError", required = true)
    protected String codigoError;
    @XmlElement(name = "MensajeError", required = true)
    protected String mensajeError;

    /**
     * Gets the value of the programaciones property.
     *
     * @return
     *     possible object is
     *     {@link Programaciones }
     *
     */
    public Programaciones getProgramaciones() {
        return programaciones;
    }

    /**
     * Sets the value of the programaciones property.
     *
     * @param value
     *     allowed object is
     *     {@link Programaciones }
     *
     */
    public void setProgramaciones(Programaciones value) {
        this.programaciones = value;
    }

    /**
     * Gets the value of the codigoError property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoError() {
        return codigoError;
    }

    /**
     * Sets the value of the codigoError property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoError(String value) {
        this.codigoError = value;
    }

    /**
     * Gets the value of the mensajeError property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMensajeError() {
        return mensajeError;
    }

    /**
     * Sets the value of the mensajeError property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMensajeError(String value) {
        this.mensajeError = value;
    }

}
