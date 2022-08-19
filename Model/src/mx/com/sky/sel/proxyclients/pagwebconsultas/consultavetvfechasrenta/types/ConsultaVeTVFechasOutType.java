
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultavetvfechasrenta.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultaVeTVFechasOutType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultaVeTVFechasOutType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="respuesta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="respuestadesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ConsultaFechasSIEBELOutput" type="{http://xmlns.oracle.com/SKYConsultas/ConsultaVeTVFechasRenta/ConsultaVeTVFechasRenta}ConsultaFechasSIEBELOutType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaVeTVFechasOutType", propOrder = { "respuesta", "respuestadesc", "consultaFechasSIEBELOutput" })
public class ConsultaVeTVFechasOutType {

    @XmlElement(required = true)
    protected String respuesta;
    @XmlElement(required = true)
    protected String respuestadesc;
    @XmlElement(name = "ConsultaFechasSIEBELOutput")
    protected List<ConsultaFechasSIEBELOutType> consultaFechasSIEBELOutput;

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
     * Gets the value of the consultaFechasSIEBELOutput property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consultaFechasSIEBELOutput property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsultaFechasSIEBELOutput().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultaFechasSIEBELOutType }
     *
     *
     */
    public List<ConsultaFechasSIEBELOutType> getConsultaFechasSIEBELOutput() {
        if (consultaFechasSIEBELOutput == null) {
            consultaFechasSIEBELOutput = new ArrayList<ConsultaFechasSIEBELOutType>();
        }
        return this.consultaFechasSIEBELOutput;
    }

}
