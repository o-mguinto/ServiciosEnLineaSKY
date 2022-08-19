
package mx.com.sky.enterpriseobjects.sec.common.v1;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EBMHeaderType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="EBMHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Operacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Sistema" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Seguridad" type="{http://www.sky.com.mx/EnterpriseObjects/Sec/Common/V1}SeguridadType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EBMHeaderType", propOrder = { "operacion", "sistema", "seguridad" })
public class EBMHeaderType {

    @XmlElement(name = "Operacion", required = true)
    protected String operacion;
    @XmlElement(name = "Sistema", required = true)
    protected String sistema;
    @XmlElement(name = "Seguridad")
    protected List<SeguridadType> seguridad;

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

    /**
     * Gets the value of the sistema property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSistema() {
        return sistema;
    }

    /**
     * Sets the value of the sistema property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSistema(String value) {
        this.sistema = value;
    }

    /**
     * Gets the value of the seguridad property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seguridad property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeguridad().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeguridadType }
     *
     *
     */
    public List<SeguridadType> getSeguridad() {
        if (seguridad == null) {
            seguridad = new ArrayList<SeguridadType>();
        }
        return this.seguridad;
    }

}
