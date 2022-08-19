
package mx.com.sky.sel.proxyclients.pagweb.dwhcuentamigrada.types;

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
 *         &lt;element name="input" type="{http://xmlns.oracle.com/PAGWEB_BAM/PAGWEB_BAM/BPEL_DWH_CUENTA_MIGRADA}datosCuenta"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "input" })
@XmlRootElement(name = "process")
public class Process {

    @XmlElement(required = true)
    protected DatosCuenta input;

    /**
     * Gets the value of the input property.
     *
     * @return
     *     possible object is
     *     {@link DatosCuenta }
     *
     */
    public DatosCuenta getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     *
     * @param value
     *     allowed object is
     *     {@link DatosCuenta }
     *
     */
    public void setInput(DatosCuenta value) {
        this.input = value;
    }

}
