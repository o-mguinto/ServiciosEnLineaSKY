
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultamundialactivo.types;

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
 *         &lt;element name="CodigoError" type="{http://xmlns.oracle.com/SKYConsultas/ConsultaMundialActivo/ConsultaMundialActivo}CodigoError"/&gt;
 *         &lt;element name="MundialActivo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "codigoError", "mundialActivo" })
@XmlRootElement(name = "consultaMundialActivoResponse")
public class ConsultaMundialActivoResponse {

    @XmlElement(name = "CodigoError", required = true)
    protected CodigoError codigoError;
    @XmlElement(name = "MundialActivo", required = true)
    protected String mundialActivo;

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
     * Gets the value of the mundialActivo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMundialActivo() {
        return mundialActivo;
    }

    /**
     * Sets the value of the mundialActivo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMundialActivo(String value) {
        this.mundialActivo = value;
    }

}
