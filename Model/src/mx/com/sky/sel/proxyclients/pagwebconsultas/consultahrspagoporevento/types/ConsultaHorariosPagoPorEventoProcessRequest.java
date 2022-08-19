
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultahrspagoporevento.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Canal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NombrePelicula" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TipoEvento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Pais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DiferenciaGMT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "canal", "nombrePelicula", "tipoEvento", "pais", "diferenciaGMT" })
@XmlRootElement(name = "ConsultaHorariosPagoPorEventoProcessRequest")
public class ConsultaHorariosPagoPorEventoProcessRequest {

    @XmlElement(name = "Canal", required = true)
    protected String canal;
    @XmlElement(name = "NombrePelicula", required = true)
    protected String nombrePelicula;
    @XmlElement(name = "TipoEvento", required = true)
    protected String tipoEvento;
    @XmlElement(name = "Pais", required = true)
    protected String pais;
    @XmlElement(name = "DiferenciaGMT", required = true)
    protected String diferenciaGMT;

    /**
     * Gets the value of the canal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCanal() {
        return canal;
    }

    /**
     * Sets the value of the canal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCanal(String value) {
        this.canal = value;
    }

    /**
     * Gets the value of the nombrePelicula property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombrePelicula() {
        return nombrePelicula;
    }

    /**
     * Sets the value of the nombrePelicula property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombrePelicula(String value) {
        this.nombrePelicula = value;
    }

    /**
     * Gets the value of the tipoEvento property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoEvento() {
        return tipoEvento;
    }

    /**
     * Sets the value of the tipoEvento property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoEvento(String value) {
        this.tipoEvento = value;
    }

    /**
     * Gets the value of the pais property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPais() {
        return pais;
    }

    /**
     * Sets the value of the pais property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Gets the value of the diferenciaGMT property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDiferenciaGMT() {
        return diferenciaGMT;
    }

    /**
     * Sets the value of the diferenciaGMT property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDiferenciaGMT(String value) {
        this.diferenciaGMT = value;
    }

}
