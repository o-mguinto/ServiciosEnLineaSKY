
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultainformacionfiscal.types;

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
 *         &lt;element name="InformacionFiscal" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DetalleSolicitudDeServicio"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NumeroDeSolicitud" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="FechaCreacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Comentario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="SubAarea" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RazonSocial" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="RFC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="MetodoEnvio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="TipoFactura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CalleFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NumeroExtFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NumeroIntFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ColoniaFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CiudadFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="DelMunFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="EstadoFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CPFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "", propOrder = { "resultado", "resultadodesc", "informacionFiscal" })
@XmlRootElement(name = "ConsultaInformacionFiscalProcessResponse")
public class ConsultaInformacionFiscalProcessResponse {

    @XmlElement(required = true)
    protected String resultado;
    @XmlElement(required = true)
    protected String resultadodesc;
    @XmlElement(name = "InformacionFiscal", required = true)
    protected List<ConsultaInformacionFiscalProcessResponse.InformacionFiscal> informacionFiscal;

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
     * Gets the value of the informacionFiscal property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informacionFiscal property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformacionFiscal().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultaInformacionFiscalProcessResponse.InformacionFiscal }
     *
     *
     */
    public List<ConsultaInformacionFiscalProcessResponse.InformacionFiscal> getInformacionFiscal() {
        if (informacionFiscal == null) {
            informacionFiscal = new ArrayList<ConsultaInformacionFiscalProcessResponse.InformacionFiscal>();
        }
        return this.informacionFiscal;
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
     *         &lt;element name="DetalleSolicitudDeServicio"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NumeroDeSolicitud" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="FechaCreacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Comentario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="SubAarea" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RazonSocial" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="RFC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="MetodoEnvio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="TipoFactura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CalleFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NumeroExtFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NumeroIntFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ColoniaFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CiudadFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="DelMunFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="EstadoFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CPFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
             { "detalleSolicitudDeServicio", "razonSocial", "rfc", "metodoEnvio", "tipoFactura", "calleFiscal",
               "numeroExtFiscal", "numeroIntFiscal", "coloniaFiscal", "ciudadFiscal", "delMunFiscal", "estadoFiscal",
               "cpFiscal"
        })
    public static class InformacionFiscal {

        @XmlElement(name = "DetalleSolicitudDeServicio", required = true)
        protected ConsultaInformacionFiscalProcessResponse.InformacionFiscal.DetalleSolicitudDeServicio detalleSolicitudDeServicio;
        @XmlElement(name = "RazonSocial", required = true)
        protected String razonSocial;
        @XmlElement(name = "RFC", required = true)
        protected String rfc;
        @XmlElement(name = "MetodoEnvio", required = true)
        protected String metodoEnvio;
        @XmlElement(name = "TipoFactura", required = true)
        protected String tipoFactura;
        @XmlElement(name = "CalleFiscal", required = true)
        protected String calleFiscal;
        @XmlElement(name = "NumeroExtFiscal", required = true)
        protected String numeroExtFiscal;
        @XmlElement(name = "NumeroIntFiscal", required = true)
        protected String numeroIntFiscal;
        @XmlElement(name = "ColoniaFiscal", required = true)
        protected String coloniaFiscal;
        @XmlElement(name = "CiudadFiscal", required = true)
        protected String ciudadFiscal;
        @XmlElement(name = "DelMunFiscal", required = true)
        protected String delMunFiscal;
        @XmlElement(name = "EstadoFiscal", required = true)
        protected String estadoFiscal;
        @XmlElement(name = "CPFiscal", required = true)
        protected String cpFiscal;

        /**
         * Gets the value of the detalleSolicitudDeServicio property.
         *
         * @return
         *     possible object is
         *     {@link ConsultaInformacionFiscalProcessResponse.InformacionFiscal.DetalleSolicitudDeServicio }
         *
         */
        public ConsultaInformacionFiscalProcessResponse.InformacionFiscal.DetalleSolicitudDeServicio getDetalleSolicitudDeServicio() {
            return detalleSolicitudDeServicio;
        }

        /**
         * Sets the value of the detalleSolicitudDeServicio property.
         *
         * @param value
         *     allowed object is
         *     {@link ConsultaInformacionFiscalProcessResponse.InformacionFiscal.DetalleSolicitudDeServicio }
         *
         */
        public void setDetalleSolicitudDeServicio(ConsultaInformacionFiscalProcessResponse.InformacionFiscal.DetalleSolicitudDeServicio value) {
            this.detalleSolicitudDeServicio = value;
        }

        /**
         * Gets the value of the razonSocial property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getRazonSocial() {
            return razonSocial;
        }

        /**
         * Sets the value of the razonSocial property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setRazonSocial(String value) {
            this.razonSocial = value;
        }

        /**
         * Gets the value of the rfc property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getRFC() {
            return rfc;
        }

        /**
         * Sets the value of the rfc property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setRFC(String value) {
            this.rfc = value;
        }

        /**
         * Gets the value of the metodoEnvio property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getMetodoEnvio() {
            return metodoEnvio;
        }

        /**
         * Sets the value of the metodoEnvio property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setMetodoEnvio(String value) {
            this.metodoEnvio = value;
        }

        /**
         * Gets the value of the tipoFactura property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getTipoFactura() {
            return tipoFactura;
        }

        /**
         * Sets the value of the tipoFactura property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setTipoFactura(String value) {
            this.tipoFactura = value;
        }

        /**
         * Gets the value of the calleFiscal property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCalleFiscal() {
            return calleFiscal;
        }

        /**
         * Sets the value of the calleFiscal property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCalleFiscal(String value) {
            this.calleFiscal = value;
        }

        /**
         * Gets the value of the numeroExtFiscal property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNumeroExtFiscal() {
            return numeroExtFiscal;
        }

        /**
         * Sets the value of the numeroExtFiscal property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNumeroExtFiscal(String value) {
            this.numeroExtFiscal = value;
        }

        /**
         * Gets the value of the numeroIntFiscal property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNumeroIntFiscal() {
            return numeroIntFiscal;
        }

        /**
         * Sets the value of the numeroIntFiscal property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNumeroIntFiscal(String value) {
            this.numeroIntFiscal = value;
        }

        /**
         * Gets the value of the coloniaFiscal property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getColoniaFiscal() {
            return coloniaFiscal;
        }

        /**
         * Sets the value of the coloniaFiscal property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setColoniaFiscal(String value) {
            this.coloniaFiscal = value;
        }

        /**
         * Gets the value of the ciudadFiscal property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCiudadFiscal() {
            return ciudadFiscal;
        }

        /**
         * Sets the value of the ciudadFiscal property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCiudadFiscal(String value) {
            this.ciudadFiscal = value;
        }

        /**
         * Gets the value of the delMunFiscal property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getDelMunFiscal() {
            return delMunFiscal;
        }

        /**
         * Sets the value of the delMunFiscal property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDelMunFiscal(String value) {
            this.delMunFiscal = value;
        }

        /**
         * Gets the value of the estadoFiscal property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getEstadoFiscal() {
            return estadoFiscal;
        }

        /**
         * Sets the value of the estadoFiscal property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setEstadoFiscal(String value) {
            this.estadoFiscal = value;
        }

        /**
         * Gets the value of the cpFiscal property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCPFiscal() {
            return cpFiscal;
        }

        /**
         * Sets the value of the cpFiscal property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCPFiscal(String value) {
            this.cpFiscal = value;
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
         *         &lt;element name="FechaCreacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Comentario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="SubAarea" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = { "numeroDeSolicitud", "fechaCreacion", "comentario", "area", "subAarea" })
        public static class DetalleSolicitudDeServicio {

            @XmlElement(name = "NumeroDeSolicitud", required = true)
            protected String numeroDeSolicitud;
            @XmlElement(name = "FechaCreacion", required = true)
            protected String fechaCreacion;
            @XmlElement(name = "Comentario", required = true)
            protected String comentario;
            @XmlElement(name = "Area", required = true)
            protected String area;
            @XmlElement(name = "SubAarea", required = true)
            protected String subAarea;

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

        }

    }

}
