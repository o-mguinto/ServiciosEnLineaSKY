
package mx.com.sky.sel.proxyclients.ejb.replicareventosom.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for replicatorBean complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="replicatorBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="errorDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exito" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="operacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "replicatorBean", propOrder = { "correo", "error", "errorDescripcion", "exito", "operacion" })
public class ReplicatorBean {

    protected String correo;
    protected String error;
    protected String errorDescripcion;
    protected Boolean exito;
    protected String operacion;

    /**
     * Gets the value of the correo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Sets the value of the correo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCorreo(String value) {
        this.correo = value;
    }

    /**
     * Gets the value of the error property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Gets the value of the errorDescripcion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getErrorDescripcion() {
        return errorDescripcion;
    }

    /**
     * Sets the value of the errorDescripcion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setErrorDescripcion(String value) {
        this.errorDescripcion = value;
    }

    /**
     * Gets the value of the exito property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isExito() {
        return exito;
    }

    /**
     * Sets the value of the exito property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setExito(Boolean value) {
        this.exito = value;
    }

    /**
     * Gets the value of the operacion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     * Sets the value of the operacion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOperacion(String value) {
        this.operacion = value;
    }

}
