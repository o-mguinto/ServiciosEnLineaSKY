
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultaapg.types;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TIpo_Programacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Fecha_hora_Inicio" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Canal_Inicial" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Canal_Final" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Cuantas_Horas" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "tIpoProgramacion", "fechaHoraInicio", "canalInicial", "canalFinal", "cuantasHoras" })
@XmlRootElement(name = "INPUT")
public class INPUT {

    @XmlElement(name = "TIpo_Programacion", required = true)
    protected String tIpoProgramacion;
    @XmlElement(name = "Fecha_hora_Inicio", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraInicio;
    @XmlElement(name = "Canal_Inicial", required = true, nillable = true)
    protected BigInteger canalInicial;
    @XmlElement(name = "Canal_Final", required = true, nillable = true)
    protected BigInteger canalFinal;
    @XmlElement(name = "Cuantas_Horas", required = true, nillable = true)
    protected BigInteger cuantasHoras;

    /**
     * Gets the value of the tIpoProgramacion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTIpoProgramacion() {
        return tIpoProgramacion;
    }

    /**
     * Sets the value of the tIpoProgramacion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTIpoProgramacion(String value) {
        this.tIpoProgramacion = value;
    }

    /**
     * Gets the value of the fechaHoraInicio property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    /**
     * Sets the value of the fechaHoraInicio property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFechaHoraInicio(XMLGregorianCalendar value) {
        this.fechaHoraInicio = value;
    }

    /**
     * Gets the value of the canalInicial property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getCanalInicial() {
        return canalInicial;
    }

    /**
     * Sets the value of the canalInicial property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setCanalInicial(BigInteger value) {
        this.canalInicial = value;
    }

    /**
     * Gets the value of the canalFinal property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getCanalFinal() {
        return canalFinal;
    }

    /**
     * Sets the value of the canalFinal property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setCanalFinal(BigInteger value) {
        this.canalFinal = value;
    }

    /**
     * Gets the value of the cuantasHoras property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getCuantasHoras() {
        return cuantasHoras;
    }

    /**
     * Sets the value of the cuantasHoras property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setCuantasHoras(BigInteger value) {
        this.cuantasHoras = value;
    }

}
