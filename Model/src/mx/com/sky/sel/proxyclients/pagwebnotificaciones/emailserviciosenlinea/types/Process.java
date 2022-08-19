
package mx.com.sky.sel.proxyclients.pagwebnotificaciones.emailserviciosenlinea.types;

import java.util.ArrayList;
import java.util.List;

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
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="correo_destino" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="parametros" type="{http://xmlns.oracle.com/SKYNotificaciones/EmailServiciosLinea/EmailServiciosEnLinea}parametroType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ATTACHMENTS" type="{http://xmlns.oracle.com/SKYNotificaciones/EmailServiciosLinea/EmailServiciosEnLinea}AttachmentType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "codigo", "correoDestino", "pais", "parametros", "attachments" })
@XmlRootElement(name = "process")
public class Process {

    @XmlElement(required = true)
    protected String codigo;
    @XmlElement(name = "correo_destino", required = true)
    protected String correoDestino;
    @XmlElement(required = true)
    protected String pais;
    @XmlElement(required = true)
    protected List<ParametroType> parametros;
    @XmlElement(name = "ATTACHMENTS", required = true)
    protected List<AttachmentType> attachments;

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
     * Gets the value of the correoDestino property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCorreoDestino() {
        return correoDestino;
    }

    /**
     * Sets the value of the correoDestino property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCorreoDestino(String value) {
        this.correoDestino = value;
    }

    /**
     * Gets the value of the pais property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPais() {
        return pais;
    }

    /**
     * Sets the value of the pais property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Gets the value of the parametros property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parametros property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParametros().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametroType }
     *
     *
     */
    public List<ParametroType> getParametros() {
        if (parametros == null) {
            parametros = new ArrayList<ParametroType>();
        }
        return this.parametros;
    }

    /**
     * Gets the value of the attachments property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachments property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATTACHMENTS().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentType }
     *
     *
     */
    public List<AttachmentType> getATTACHMENTS() {
        if (attachments == null) {
            attachments = new ArrayList<AttachmentType>();
        }
        return this.attachments;
    }

}
