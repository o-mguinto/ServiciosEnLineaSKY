
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultaordenmod.types;

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
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="errorDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ordenModificacionPendiente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "errorCode", "errorDesc", "ordenModificacionPendiente" })
@XmlRootElement(name = "consultaOrdenModificacionResponse")
public class ConsultaOrdenModificacionResponse {

    @XmlElement(required = true)
    protected String errorCode;
    @XmlElement(required = true)
    protected String errorDesc;
    @XmlElement(required = true)
    protected String ordenModificacionPendiente;

    /**
     * Gets the value of the errorCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorDesc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getErrorDesc() {
        return errorDesc;
    }

    /**
     * Sets the value of the errorDesc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setErrorDesc(String value) {
        this.errorDesc = value;
    }

    /**
     * Gets the value of the ordenModificacionPendiente property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrdenModificacionPendiente() {
        return ordenModificacionPendiente;
    }

    /**
     * Sets the value of the ordenModificacionPendiente property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrdenModificacionPendiente(String value) {
        this.ordenModificacionPendiente = value;
    }

}
