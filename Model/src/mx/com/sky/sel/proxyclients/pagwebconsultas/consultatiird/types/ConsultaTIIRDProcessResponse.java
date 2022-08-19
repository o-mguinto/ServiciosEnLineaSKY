
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultatiird.types;

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
 *         &lt;element name="Tarjeta" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TarjetaInteligente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="IRD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Ubicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Jerarquia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Categoria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Flg_funcionalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "", propOrder = { "respuesta", "respuestadesc", "tarjeta" })
@XmlRootElement(name = "ConsultaTI_IRDProcessResponse")
public class ConsultaTIIRDProcessResponse {

    @XmlElement(required = true)
    protected String respuesta;
    @XmlElement(required = true)
    protected String respuestadesc;
    @XmlElement(name = "Tarjeta", required = true)
    protected List<ConsultaTIIRDProcessResponse.Tarjeta> tarjeta;

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
     * Gets the value of the tarjeta property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tarjeta property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTarjeta().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultaTIIRDProcessResponse.Tarjeta }
     *
     *
     */
    public List<ConsultaTIIRDProcessResponse.Tarjeta> getTarjeta() {
        if (tarjeta == null) {
            tarjeta = new ArrayList<ConsultaTIIRDProcessResponse.Tarjeta>();
        }
        return this.tarjeta;
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
     *         &lt;element name="TarjetaInteligente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="IRD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Ubicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Jerarquia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Categoria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Flg_funcionalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "",
             propOrder =
             { "tarjetaInteligente", "ird", "ubicacion", "status", "jerarquia", "categoria", "flgFuncionalidad" })
    public static class Tarjeta {

        @XmlElement(name = "TarjetaInteligente", required = true)
        protected String tarjetaInteligente;
        @XmlElement(name = "IRD", required = true)
        protected String ird;
        @XmlElement(name = "Ubicacion", required = true)
        protected String ubicacion;
        @XmlElement(name = "Status", required = true)
        protected String status;
        @XmlElement(name = "Jerarquia", required = true)
        protected String jerarquia;
        @XmlElement(name = "Categoria", required = true)
        protected String categoria;
        @XmlElement(name = "Flg_funcionalidad")
        protected String flgFuncionalidad;

        /**
         * Gets the value of the tarjetaInteligente property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getTarjetaInteligente() {
            return tarjetaInteligente;
        }

        /**
         * Sets the value of the tarjetaInteligente property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setTarjetaInteligente(String value) {
            this.tarjetaInteligente = value;
        }

        /**
         * Gets the value of the ird property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getIRD() {
            return ird;
        }

        /**
         * Sets the value of the ird property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setIRD(String value) {
            this.ird = value;
        }

        /**
         * Gets the value of the ubicacion property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getUbicacion() {
            return ubicacion;
        }

        /**
         * Sets the value of the ubicacion property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setUbicacion(String value) {
            this.ubicacion = value;
        }

        /**
         * Gets the value of the status property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * Gets the value of the jerarquia property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getJerarquia() {
            return jerarquia;
        }

        /**
         * Sets the value of the jerarquia property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setJerarquia(String value) {
            this.jerarquia = value;
        }

        /**
         * Gets the value of the categoria property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCategoria() {
            return categoria;
        }

        /**
         * Sets the value of the categoria property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCategoria(String value) {
            this.categoria = value;
        }

        /**
         * Gets the value of the flgFuncionalidad property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getFlgFuncionalidad() {
            return flgFuncionalidad;
        }

        /**
         * Sets the value of the flgFuncionalidad property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setFlgFuncionalidad(String value) {
            this.flgFuncionalidad = value;
        }

    }

}
