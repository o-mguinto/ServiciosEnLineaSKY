
package mx.com.sky.sel.proxyclients.pagweb.admonmodulares.types;

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
 *         &lt;element name="TarjetaInt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NumCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AddModule" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RemoveModule" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "tarjetaInt", "numCuenta", "addModule", "removeModule", "action" })
@XmlRootElement(name = "AdmonModularesProcessRequest")
public class AdmonModularesProcessRequest {

    @XmlElement(name = "TarjetaInt", required = true)
    protected String tarjetaInt;
    @XmlElement(name = "NumCuenta", required = true)
    protected String numCuenta;
    @XmlElement(name = "AddModule", required = true)
    protected String addModule;
    @XmlElement(name = "RemoveModule", required = true)
    protected String removeModule;
    @XmlElement(name = "Action", required = true)
    protected String action;

    /**
     * Gets the value of the tarjetaInt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTarjetaInt() {
        return tarjetaInt;
    }

    /**
     * Sets the value of the tarjetaInt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTarjetaInt(String value) {
        this.tarjetaInt = value;
    }

    /**
     * Gets the value of the numCuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumCuenta() {
        return numCuenta;
    }

    /**
     * Sets the value of the numCuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumCuenta(String value) {
        this.numCuenta = value;
    }

    /**
     * Gets the value of the addModule property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddModule() {
        return addModule;
    }

    /**
     * Sets the value of the addModule property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddModule(String value) {
        this.addModule = value;
    }

    /**
     * Gets the value of the removeModule property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRemoveModule() {
        return removeModule;
    }

    /**
     * Sets the value of the removeModule property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRemoveModule(String value) {
        this.removeModule = value;
    }

    /**
     * Gets the value of the action property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAction(String value) {
        this.action = value;
    }

}
