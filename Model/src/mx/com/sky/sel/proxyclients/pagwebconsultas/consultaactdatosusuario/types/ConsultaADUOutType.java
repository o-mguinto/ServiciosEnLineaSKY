
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultaactdatosusuario.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultaADUOutType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultaADUOutType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="respuesta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="respuestaDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Select_ActualizaDatosUsuarioOutput" type="{http://xmlns.oracle.com/SKYConsultas/ConsultaActualizaDatosUsuario/ConsultaActualizaDatosUsuario}Select_ActualizaDatosUsuarioOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaADUOutType", propOrder = { "respuesta", "respuestaDesc", "selectActualizaDatosUsuarioOutput" })
public class ConsultaADUOutType {

    @XmlElement(required = true)
    protected String respuesta;
    @XmlElement(required = true)
    protected String respuestaDesc;
    @XmlElement(name = "Select_ActualizaDatosUsuarioOutput")
    protected List<SelectActualizaDatosUsuarioOutput> selectActualizaDatosUsuarioOutput;

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
     * Gets the value of the respuestaDesc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRespuestaDesc() {
        return respuestaDesc;
    }

    /**
     * Sets the value of the respuestaDesc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRespuestaDesc(String value) {
        this.respuestaDesc = value;
    }

    /**
     * Gets the value of the selectActualizaDatosUsuarioOutput property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectActualizaDatosUsuarioOutput property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectActualizaDatosUsuarioOutput().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectActualizaDatosUsuarioOutput }
     *
     *
     */
    public List<SelectActualizaDatosUsuarioOutput> getSelectActualizaDatosUsuarioOutput() {
        if (selectActualizaDatosUsuarioOutput == null) {
            selectActualizaDatosUsuarioOutput = new ArrayList<SelectActualizaDatosUsuarioOutput>();
        }
        return this.selectActualizaDatosUsuarioOutput;
    }

}
