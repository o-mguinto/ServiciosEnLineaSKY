
package mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContratacionServicios complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ContratacionServicios"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaqueteActual" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ServicioAContratar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NombreCanalALaCarta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NoCanalALaCarta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PrecioCanalALaCarta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PenalizacionVETVCA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContratacionServicios",
         propOrder =
         { "paqueteActual", "servicioAContratar", "nombreCanalALaCarta", "noCanalALaCarta", "precioCanalALaCarta",
           "penalizacionVETVCA"
    })
public class ContratacionServicios {

    @XmlElement(name = "PaqueteActual", required = true)
    protected String paqueteActual;
    @XmlElement(name = "ServicioAContratar", required = true)
    protected String servicioAContratar;
    @XmlElement(name = "NombreCanalALaCarta", required = true)
    protected String nombreCanalALaCarta;
    @XmlElement(name = "NoCanalALaCarta", required = true)
    protected String noCanalALaCarta;
    @XmlElement(name = "PrecioCanalALaCarta", required = true)
    protected String precioCanalALaCarta;
    @XmlElement(name = "PenalizacionVETVCA", required = true)
    protected String penalizacionVETVCA;

    /**
     * Gets the value of the paqueteActual property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaqueteActual() {
        return paqueteActual;
    }

    /**
     * Sets the value of the paqueteActual property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaqueteActual(String value) {
        this.paqueteActual = value;
    }

    /**
     * Gets the value of the servicioAContratar property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getServicioAContratar() {
        return servicioAContratar;
    }

    /**
     * Sets the value of the servicioAContratar property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setServicioAContratar(String value) {
        this.servicioAContratar = value;
    }

    /**
     * Gets the value of the nombreCanalALaCarta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombreCanalALaCarta() {
        return nombreCanalALaCarta;
    }

    /**
     * Sets the value of the nombreCanalALaCarta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombreCanalALaCarta(String value) {
        this.nombreCanalALaCarta = value;
    }

    /**
     * Gets the value of the noCanalALaCarta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNoCanalALaCarta() {
        return noCanalALaCarta;
    }

    /**
     * Sets the value of the noCanalALaCarta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNoCanalALaCarta(String value) {
        this.noCanalALaCarta = value;
    }

    /**
     * Gets the value of the precioCanalALaCarta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPrecioCanalALaCarta() {
        return precioCanalALaCarta;
    }

    /**
     * Sets the value of the precioCanalALaCarta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPrecioCanalALaCarta(String value) {
        this.precioCanalALaCarta = value;
    }

    /**
     * Gets the value of the penalizacionVETVCA property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPenalizacionVETVCA() {
        return penalizacionVETVCA;
    }

    /**
     * Sets the value of the penalizacionVETVCA property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPenalizacionVETVCA(String value) {
        this.penalizacionVETVCA = value;
    }

}
