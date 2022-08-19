
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultappepermisos.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultaPermisosInType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="consultaPermisosInType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="paquete" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoPPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaPermisosInType", propOrder = { "pais", "paquete", "tipoPPE" })
public class ConsultaPermisosInType {

    @XmlElement(required = true)
    protected String pais;
    @XmlElement(required = true)
    protected String paquete;
    @XmlElement(required = true)
    protected String tipoPPE;

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
     * Gets the value of the paquete property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaquete() {
        return paquete;
    }

    /**
     * Sets the value of the paquete property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaquete(String value) {
        this.paquete = value;
    }

    /**
     * Gets the value of the tipoPPE property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoPPE() {
        return tipoPPE;
    }

    /**
     * Sets the value of the tipoPPE property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoPPE(String value) {
        this.tipoPPE = value;
    }

}
