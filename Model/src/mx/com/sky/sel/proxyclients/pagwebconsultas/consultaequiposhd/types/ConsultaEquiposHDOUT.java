
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultaequiposhd.types;

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
 *         &lt;element name="respuesta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="respuestadesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HDFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="equipos" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="tipoEquipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "respuesta", "respuestadesc", "hdFlag", "equipos" })
@XmlRootElement(name = "ConsultaEquiposHD_OUT")
public class ConsultaEquiposHDOUT {

    @XmlElement(required = true)
    protected String respuesta;
    @XmlElement(required = true)
    protected String respuestadesc;
    @XmlElement(name = "HDFlag", required = true)
    protected String hdFlag;
    @XmlElement(required = true)
    protected List<ConsultaEquiposHDOUT.Equipos> equipos;

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
     * Gets the value of the hdFlag property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHDFlag() {
        return hdFlag;
    }

    /**
     * Sets the value of the hdFlag property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHDFlag(String value) {
        this.hdFlag = value;
    }

    /**
     * Gets the value of the equipos property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipos property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipos().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultaEquiposHDOUT.Equipos }
     *
     *
     */
    public List<ConsultaEquiposHDOUT.Equipos> getEquipos() {
        if (equipos == null) {
            equipos = new ArrayList<ConsultaEquiposHDOUT.Equipos>();
        }
        return this.equipos;
    }


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
     *         &lt;element name="tipoEquipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "tipoEquipo" })
    public static class Equipos {

        @XmlElement(required = true)
        protected String tipoEquipo;

        /**
         * Gets the value of the tipoEquipo property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getTipoEquipo() {
            return tipoEquipo;
        }

        /**
         * Sets the value of the tipoEquipo property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setTipoEquipo(String value) {
            this.tipoEquipo = value;
        }

    }

}
