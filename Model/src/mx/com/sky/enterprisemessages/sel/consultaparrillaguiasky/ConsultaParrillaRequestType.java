
package mx.com.sky.enterprisemessages.sel.consultaparrillaguiasky;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultaParrillaRequestType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultaParrillaRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FECHA_INICIO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FECHA_FIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PAQUETE_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaParrillaRequestType",
         propOrder = { "fechainicio", "fechafin", "paqueteid"
    })
public class ConsultaParrillaRequestType {

    @XmlElement(name = "FECHA_INICIO", required = true)
    protected String fechainicio;
    @XmlElement(name = "FECHA_FIN", required = true)
    protected String fechafin;
    @XmlElement(name = "PAQUETE_ID", required = true, nillable = true)
    protected String paqueteid;

    /**
     * Gets the value of the fechainicio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFECHAINICIO() {
        return fechainicio;
    }

    /**
     * Sets the value of the fechainicio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFECHAINICIO(String value) {
        this.fechainicio = value;
    }

    /**
     * Gets the value of the fechafin property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFECHAFIN() {
        return fechafin;
    }

    /**
     * Sets the value of the fechafin property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFECHAFIN(String value) {
        this.fechafin = value;
    }

    /**
     * Gets the value of the paqueteid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPAQUETEID() {
        return paqueteid;
    }

    /**
     * Sets the value of the paqueteid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPAQUETEID(String value) {
        this.paqueteid = value;
    }

}
