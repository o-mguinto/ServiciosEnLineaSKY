
package mx.com.sky.enterpriseflowmessage.sel.recuperarpasswordusrebf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecuperarPasswordUsrResponseType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RecuperarPasswordUsrResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecuperarPasswordUsrResponseType", propOrder = { "codigo", "mensaje" })
public class RecuperarPasswordUsrResponseType {

    @XmlElement(required = true)
    protected String codigo;
    @XmlElement(required = true)
    protected String mensaje;

    /**
     * Gets the value of the codigo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the mensaje property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Sets the value of the mensaje property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

}
