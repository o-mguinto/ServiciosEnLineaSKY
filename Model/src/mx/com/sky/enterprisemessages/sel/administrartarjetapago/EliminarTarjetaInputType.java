
package mx.com.sky.enterprisemessages.sel.administrartarjetapago;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EliminarTarjetaInputType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="EliminarTarjetaInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroCuentaCliente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IdTarjeta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sistemaProducto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EliminarTarjetaInputType",
         propOrder = { "numeroCuentaCliente", "idTarjeta", "sistemaProducto"
    })
public class EliminarTarjetaInputType {

    @XmlElement(required = true)
    protected String numeroCuentaCliente;
    @XmlElement(name = "IdTarjeta", required = true)
    protected String idTarjeta;
    @XmlElement(required = true)
    protected String sistemaProducto;

    /**
     * Gets the value of the numeroCuentaCliente property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroCuentaCliente() {
        return numeroCuentaCliente;
    }

    /**
     * Sets the value of the numeroCuentaCliente property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroCuentaCliente(String value) {
        this.numeroCuentaCliente = value;
    }

    /**
     * Gets the value of the idTarjeta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdTarjeta() {
        return idTarjeta;
    }

    /**
     * Sets the value of the idTarjeta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdTarjeta(String value) {
        this.idTarjeta = value;
    }

    /**
     * Gets the value of the sistemaProducto property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSistemaProducto() {
        return sistemaProducto;
    }

    /**
     * Sets the value of the sistemaProducto property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSistemaProducto(String value) {
        this.sistemaProducto = value;
    }

}
