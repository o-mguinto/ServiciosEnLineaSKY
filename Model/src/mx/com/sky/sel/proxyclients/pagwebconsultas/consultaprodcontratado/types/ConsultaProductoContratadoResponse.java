
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultaprodcontratado.types;

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
 *         &lt;element name="CodigoError" type="{http://xmlns.oracle.com/SKYConsultas/ConsultaProductoContratado/ConsultaProductoContratado}CodigoError"/&gt;
 *         &lt;element name="ProductoContratado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "codigoError", "productoContratado" })
@XmlRootElement(name = "consultaProductoContratadoResponse")
public class ConsultaProductoContratadoResponse {

    @XmlElement(name = "CodigoError", required = true)
    protected CodigoError codigoError;
    @XmlElement(name = "ProductoContratado", required = true)
    protected String productoContratado;

    /**
     * Gets the value of the codigoError property.
     *
     * @return
     *     possible object is
     *     {@link CodigoError }
     *
     */
    public CodigoError getCodigoError() {
        return codigoError;
    }

    /**
     * Sets the value of the codigoError property.
     *
     * @param value
     *     allowed object is
     *     {@link CodigoError }
     *
     */
    public void setCodigoError(CodigoError value) {
        this.codigoError = value;
    }

    /**
     * Gets the value of the productoContratado property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProductoContratado() {
        return productoContratado;
    }

    /**
     * Sets the value of the productoContratado property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProductoContratado(String value) {
        this.productoContratado = value;
    }

}
