
package mx.com.sky.sel.proxyclients.pagwebss.consultasolicitudservicioindividual.types;

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
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resultadodesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DetalleSolicitudDeServicio" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NumeroDeSolicitud" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SubAarea" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Comentario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="FechaCreacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "", propOrder = { "resultado", "resultadodesc", "detalleSolicitudDeServicio" })
@XmlRootElement(name = "ConsultaSolicitudDeServicioIndividualProcessResponse")
public class ConsultaSolicitudDeServicioIndividualProcessResponse {

    @XmlElement(required = true)
    protected String resultado;
    @XmlElement(required = true)
    protected String resultadodesc;
    @XmlElement(name = "DetalleSolicitudDeServicio", required = true)
    protected List<ConsultaSolicitudDeServicioIndividualProcessResponse.DetalleSolicitudDeServicio> detalleSolicitudDeServicio;

    /**
     * Gets the value of the resultado property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * Sets the value of the resultado property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResultado(String value) {
        this.resultado = value;
    }

    /**
     * Gets the value of the resultadodesc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResultadodesc() {
        return resultadodesc;
    }

    /**
     * Sets the value of the resultadodesc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResultadodesc(String value) {
        this.resultadodesc = value;
    }

    /**
     * Gets the value of the detalleSolicitudDeServicio property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detalleSolicitudDeServicio property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetalleSolicitudDeServicio().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultaSolicitudDeServicioIndividualProcessResponse.DetalleSolicitudDeServicio }
     *
     *
     */
    public List<ConsultaSolicitudDeServicioIndividualProcessResponse.DetalleSolicitudDeServicio> getDetalleSolicitudDeServicio() {
        if (detalleSolicitudDeServicio == null) {
            detalleSolicitudDeServicio =
                new ArrayList<ConsultaSolicitudDeServicioIndividualProcessResponse.DetalleSolicitudDeServicio>();
        }
        return this.detalleSolicitudDeServicio;
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
     *         &lt;element name="NumeroDeSolicitud" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SubAarea" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Comentario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="FechaCreacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "numeroDeSolicitud", "area", "subAarea", "comentario", "fechaCreacion" })
    public static class DetalleSolicitudDeServicio {

        @XmlElement(name = "NumeroDeSolicitud", required = true)
        protected String numeroDeSolicitud;
        @XmlElement(name = "Area", required = true)
        protected String area;
        @XmlElement(name = "SubAarea", required = true)
        protected String subAarea;
        @XmlElement(name = "Comentario", required = true)
        protected String comentario;
        @XmlElement(name = "FechaCreacion", required = true)
        protected String fechaCreacion;

        /**
         * Gets the value of the numeroDeSolicitud property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNumeroDeSolicitud() {
            return numeroDeSolicitud;
        }

        /**
         * Sets the value of the numeroDeSolicitud property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNumeroDeSolicitud(String value) {
            this.numeroDeSolicitud = value;
        }

        /**
         * Gets the value of the area property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getArea() {
            return area;
        }

        /**
         * Sets the value of the area property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setArea(String value) {
            this.area = value;
        }

        /**
         * Gets the value of the subAarea property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getSubAarea() {
            return subAarea;
        }

        /**
         * Sets the value of the subAarea property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setSubAarea(String value) {
            this.subAarea = value;
        }

        /**
         * Gets the value of the comentario property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getComentario() {
            return comentario;
        }

        /**
         * Sets the value of the comentario property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setComentario(String value) {
            this.comentario = value;
        }

        /**
         * Gets the value of the fechaCreacion property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getFechaCreacion() {
            return fechaCreacion;
        }

        /**
         * Sets the value of the fechaCreacion property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setFechaCreacion(String value) {
            this.fechaCreacion = value;
        }

    }

}
