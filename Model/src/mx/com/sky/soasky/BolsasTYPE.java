
package mx.com.sky.soasky;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Bolsas_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Bolsas_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Nombre_Bolsa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Fecha_Efectiva" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Fecha_Expiracion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Total_Datos" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Datos_Disponibles" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Total_Datos_Comprados" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Datos_Disponibles_Comprados" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Total_Por_Comprar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bolsas_TYPE",
         propOrder =
         { "nombreBolsa", "oferta", "fechaEfectiva", "fechaExpiracion", "totalDatos", "datosDisponibles",
           "totalDatosComprados", "datosDisponiblesComprados", "totalPorComprar"
    })
public class BolsasTYPE {

    @XmlElement(name = "Nombre_Bolsa", required = true)
    protected String nombreBolsa;
    @XmlElement(name = "Fecha_Efectiva", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEfectiva;
    @XmlElement(name = "Fecha_Expiracion", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String fechaExpiracion;
    @XmlElement(name = "Total_Datos", required = true)
    protected String totalDatos;
    @XmlElement(name = "Datos_Disponibles", required = true)
    protected String datosDisponibles;
    @XmlElement(name = "Total_Datos_Comprados", required = true)
    protected String totalDatosComprados;
    @XmlElement(name = "Datos_Disponibles_Comprados", required = true)
    protected String datosDisponiblesComprados;
    @XmlElement(name = "Total_Por_Comprar", required = true)
    protected String totalPorComprar;
    @XmlElement(name = "Oferta", required = true)
    protected String oferta;

    /**
     * Gets the value of the nombreBolsa property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombreBolsa() {
        return nombreBolsa;
    }

    /**
     * Sets the value of the nombreBolsa property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombreBolsa(String value) {
        this.nombreBolsa = value;
    }

    /**
     * Gets the value of the fechaEfectiva property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaEfectiva() {
        return fechaEfectiva;
    }

    /**
     * Sets the value of the fechaEfectiva property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFechaEfectiva(XMLGregorianCalendar value) {
        this.fechaEfectiva = value;
    }

    /**
     * Gets the value of the fechaExpiracion property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public String getFechaExpiracion() {
        /*return fechaExpiracion;*/

        return this.fechaExpiracion;
    }

    /**
     * Sets the value of the fechaExpiracion property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFechaExpiracion(String value) {
        this.fechaExpiracion = value;
    }


    /**
     * Gets the value of the totalDatos property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTotalDatos() {
        return totalDatos;
    }

    /**
     * Sets the value of the totalDatos property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTotalDatos(String value) {
        this.totalDatos = value;
    }

    /**
     * Gets the value of the datosDisponibles property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDatosDisponibles() {
        return datosDisponibles;
    }

    /**
     * Sets the value of the datosDisponibles property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDatosDisponibles(String value) {
        this.datosDisponibles = value;
    }

    /**
     * Gets the value of the totalDatosComprados property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTotalDatosComprados() {
        return totalDatosComprados;
    }

    /**
     * Sets the value of the totalDatosComprados property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTotalDatosComprados(String value) {
        this.totalDatosComprados = value;
    }

    /**
     * Gets the value of the datosDisponiblesComprados property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDatosDisponiblesComprados() {
        return datosDisponiblesComprados;
    }

    /**
     * Sets the value of the datosDisponiblesComprados property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDatosDisponiblesComprados(String value) {
        this.datosDisponiblesComprados = value;
    }

    /**
     * Gets the value of the totalPorComprar property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTotalPorComprar() {
        return totalPorComprar;
    }

    /**
     * Sets the value of the totalPorComprar property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTotalPorComprar(String value) {
        this.totalPorComprar = value;
    }

    /**
     * Gets the value of the oferta property.
     *
     * @return
     * possible object is
     * {@link String}
     *
     */
    public String getOferta() {
        return oferta;
    }

    /**
     * Sets the value of the oferta property.
     *
     * @param value
     * allowed object is
     * {@link String}
     *
     */
    public void setOferta(String value) {
        this.oferta = value;
    }

}
