
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultavetvfechasrenta.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultaVeTVFechasInType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultaVeTVFechasInType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CUENTA_SKY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaVeTVFechasInType", propOrder = { "cuentasky" })
public class ConsultaVeTVFechasInType {

    @XmlElement(name = "CUENTA_SKY", required = true, nillable = true)
    protected String cuentasky;

    /**
     * Gets the value of the cuentasky property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCUENTASKY() {
        return cuentasky;
    }

    /**
     * Sets the value of the cuentasky property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCUENTASKY(String value) {
        this.cuentasky = value;
    }

}
