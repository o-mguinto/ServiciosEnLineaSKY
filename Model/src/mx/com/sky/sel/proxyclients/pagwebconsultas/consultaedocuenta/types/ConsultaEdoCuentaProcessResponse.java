
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultaedocuenta.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="EstadosCuenta" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NumCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ReferenciaEdoCta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Cargos" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="PorPagar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Ajustes" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Pagos" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="FechaEdoCuenta" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                   &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
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
@XmlType(name = "", propOrder = { "respuesta", "respuestadesc", "estadosCuenta" })
@XmlRootElement(name = "ConsultaEdoCuentaProcessResponse")
public class ConsultaEdoCuentaProcessResponse {

    @XmlElement(required = true)
    protected String respuesta;
    @XmlElement(required = true)
    protected String respuestadesc;
    @XmlElement(name = "EstadosCuenta", required = true)
    protected List<ConsultaEdoCuentaProcessResponse.EstadosCuenta> estadosCuenta;

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
     * Gets the value of the estadosCuenta property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estadosCuenta property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstadosCuenta().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultaEdoCuentaProcessResponse.EstadosCuenta }
     *
     *
     */
    public List<ConsultaEdoCuentaProcessResponse.EstadosCuenta> getEstadosCuenta() {
        if (estadosCuenta == null) {
            estadosCuenta = new ArrayList<ConsultaEdoCuentaProcessResponse.EstadosCuenta>();
        }
        return this.estadosCuenta;
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
     *         &lt;element name="NumCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ReferenciaEdoCta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Cargos" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="PorPagar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Ajustes" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Pagos" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="FechaEdoCuenta" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *         &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
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
             { "numCuenta", "referenciaEdoCta", "cargos", "porPagar", "ajustes", "pagos", "fechaEdoCuenta",
               "fechaVencimiento"
        })
    public static class EstadosCuenta {

        @XmlElement(name = "NumCuenta", required = true)
        protected String numCuenta;
        @XmlElement(name = "ReferenciaEdoCta", required = true)
        protected String referenciaEdoCta;
        @XmlElement(name = "Cargos", required = true)
        protected String cargos;
        @XmlElement(name = "PorPagar", required = true)
        protected String porPagar;
        @XmlElement(name = "Ajustes", required = true)
        protected String ajustes;
        @XmlElement(name = "Pagos", required = true)
        protected String pagos;
        @XmlElement(name = "FechaEdoCuenta", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fechaEdoCuenta;
        @XmlElement(name = "FechaVencimiento", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fechaVencimiento;

        /**
         * Gets the value of the numCuenta property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNumCuenta() {
            return numCuenta;
        }

        /**
         * Sets the value of the numCuenta property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNumCuenta(String value) {
            this.numCuenta = value;
        }

        /**
         * Gets the value of the referenciaEdoCta property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getReferenciaEdoCta() {
            return referenciaEdoCta;
        }

        /**
         * Sets the value of the referenciaEdoCta property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setReferenciaEdoCta(String value) {
            this.referenciaEdoCta = value;
        }

        /**
         * Gets the value of the cargos property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCargos() {
            return cargos;
        }

        /**
         * Sets the value of the cargos property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCargos(String value) {
            this.cargos = value;
        }

        /**
         * Gets the value of the porPagar property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPorPagar() {
            return porPagar;
        }

        /**
         * Sets the value of the porPagar property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPorPagar(String value) {
            this.porPagar = value;
        }

        /**
         * Gets the value of the ajustes property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getAjustes() {
            return ajustes;
        }

        /**
         * Sets the value of the ajustes property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setAjustes(String value) {
            this.ajustes = value;
        }

        /**
         * Gets the value of the pagos property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPagos() {
            return pagos;
        }

        /**
         * Sets the value of the pagos property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPagos(String value) {
            this.pagos = value;
        }

        /**
         * Gets the value of the fechaEdoCuenta property.
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getFechaEdoCuenta() {
            return fechaEdoCuenta;
        }

        /**
         * Sets the value of the fechaEdoCuenta property.
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setFechaEdoCuenta(XMLGregorianCalendar value) {
            this.fechaEdoCuenta = value;
        }

        /**
         * Gets the value of the fechaVencimiento property.
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getFechaVencimiento() {
            return fechaVencimiento;
        }

        /**
         * Sets the value of the fechaVencimiento property.
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setFechaVencimiento(XMLGregorianCalendar value) {
            this.fechaVencimiento = value;
        }

    }

}
