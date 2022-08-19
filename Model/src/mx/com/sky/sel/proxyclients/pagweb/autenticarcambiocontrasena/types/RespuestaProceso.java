
package mx.com.sky.sel.proxyclients.pagweb.autenticarcambiocontrasena.types;

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
 *         &lt;element name="codError" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "codError", "codDesc" })
@XmlRootElement(name = "respuestaProceso",
                namespace =
                "http://xmlns.oracle.com/SKYPortal/SELAutenticarCambioContrasena/SELAutenticarCambioContrasena")
public class RespuestaProceso {

    @XmlElement(namespace =
                "http://xmlns.oracle.com/SKYPortal/SELAutenticarCambioContrasena/SELAutenticarCambioContrasena",
                required = true)
    protected String codError;
    @XmlElement(namespace =
                "http://xmlns.oracle.com/SKYPortal/SELAutenticarCambioContrasena/SELAutenticarCambioContrasena",
                required = true)
    protected String codDesc;

    /**
     * Gets the value of the codError property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodError() {
        return codError;
    }

    /**
     * Sets the value of the codError property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodError(String value) {
        this.codError = value;
    }

    /**
     * Gets the value of the codDesc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodDesc() {
        return codDesc;
    }

    /**
     * Sets the value of the codDesc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodDesc(String value) {
        this.codDesc = value;
    }

}
