
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultaflagtccuenta.types;

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
 *         &lt;element name="ERROR_COD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ERROR_DESC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "errorcod", "errordesc" })
@XmlRootElement(name = "processResponse")
public class ProcessResponse {

    @XmlElement(name = "ERROR_COD", required = true)
    protected String errorcod;
    @XmlElement(name = "ERROR_DESC", required = true)
    protected String errordesc;

    /**
     * Gets the value of the errorcod property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getERRORCOD() {
        return errorcod;
    }

    /**
     * Sets the value of the errorcod property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setERRORCOD(String value) {
        this.errorcod = value;
    }

    /**
     * Gets the value of the errordesc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getERRORDESC() {
        return errordesc;
    }

    /**
     * Sets the value of the errordesc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setERRORDESC(String value) {
        this.errordesc = value;
    }

}
