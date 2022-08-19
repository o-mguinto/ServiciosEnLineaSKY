
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
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contrasenaActual" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "usuario", "contrasenaActual" })
@XmlRootElement(name = "proceso",
                namespace =
                "http://xmlns.oracle.com/SKYPortal/SELAutenticarCambioContrasena/SELAutenticarCambioContrasena")
public class Proceso {

    @XmlElement(namespace =
                "http://xmlns.oracle.com/SKYPortal/SELAutenticarCambioContrasena/SELAutenticarCambioContrasena",
                required = true)
    protected String usuario;
    @XmlElement(namespace =
                "http://xmlns.oracle.com/SKYPortal/SELAutenticarCambioContrasena/SELAutenticarCambioContrasena",
                required = true)
    protected String contrasenaActual;

    /**
     * Gets the value of the usuario property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Gets the value of the contrasenaActual property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContrasenaActual() {
        return contrasenaActual;
    }

    /**
     * Sets the value of the contrasenaActual property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContrasenaActual(String value) {
        this.contrasenaActual = value;
    }

}
