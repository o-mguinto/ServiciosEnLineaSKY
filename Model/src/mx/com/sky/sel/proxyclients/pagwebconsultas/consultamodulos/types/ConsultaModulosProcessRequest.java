
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultamodulos.types;

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
 *         &lt;element name="TipoConsulta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CuentaSKY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "tipoConsulta", "cuentaSKY" })
@XmlRootElement(name = "ConsultaModulosProcessRequest")
public class ConsultaModulosProcessRequest {

    @XmlElement(name = "TipoConsulta", required = true)
    protected String tipoConsulta;
    @XmlElement(name = "CuentaSKY", required = true)
    protected String cuentaSKY;

    /**
     * Gets the value of the tipoConsulta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoConsulta() {
        return tipoConsulta;
    }

    /**
     * Sets the value of the tipoConsulta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoConsulta(String value) {
        this.tipoConsulta = value;
    }

    /**
     * Gets the value of the cuentaSKY property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCuentaSKY() {
        return cuentaSKY;
    }

    /**
     * Sets the value of the cuentaSKY property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCuentaSKY(String value) {
        this.cuentaSKY = value;
    }

}
