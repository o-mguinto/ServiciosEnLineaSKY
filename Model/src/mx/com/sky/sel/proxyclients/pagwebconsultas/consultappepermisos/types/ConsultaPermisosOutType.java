
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultappepermisos.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultaPermisosOutType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="consultaPermisosOutType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="respuesta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="respuestadesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="consultaPPEPermisos" type="{http://www.sky.com.mx/consulta/permisos/ppe}ConsultaPPEPermisosType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaPermisosOutType", propOrder = { "respuesta", "respuestadesc", "consultaPPEPermisos" })
public class ConsultaPermisosOutType {

    @XmlElement(required = true)
    protected String respuesta;
    @XmlElement(required = true)
    protected String respuestadesc;
    protected List<ConsultaPPEPermisosType> consultaPPEPermisos;

    /**
     * Gets the value of the respuesta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * Sets the value of the respuesta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRespuesta(String value) {
        this.respuesta = value;
    }

    /**
     * Gets the value of the respuestadesc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRespuestadesc() {
        return respuestadesc;
    }

    /**
     * Sets the value of the respuestadesc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRespuestadesc(String value) {
        this.respuestadesc = value;
    }

    /**
     * Gets the value of the consultaPPEPermisos property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consultaPPEPermisos property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsultaPPEPermisos().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultaPPEPermisosType }
     *
     *
     */
    public List<ConsultaPPEPermisosType> getConsultaPPEPermisos() {
        if (consultaPPEPermisos == null) {
            consultaPPEPermisos = new ArrayList<ConsultaPPEPermisosType>();
        }
        return this.consultaPPEPermisos;
    }

}
