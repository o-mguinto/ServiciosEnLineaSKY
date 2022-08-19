
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultappecontratados.types;

import java.math.BigDecimal;

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
 *         &lt;element name="PPEContratados" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PPEOrderID" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="ServiceOrderID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CtaSKY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SMARTCARD_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Canal" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="EVENTO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="TIPO_PPV" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="PRECIO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="PAIS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="HoraEvento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="HoraPedido" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="HoraExpiracion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="ESTATUS_EVENTO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="FECHA_TRANSMISION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NUMERO_ORDEN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="FECHA_ORDEN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ESTATUS_ORDEN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "", propOrder = { "respuesta", "respuestadesc", "ppeContratados" })
@XmlRootElement(name = "ConsultaPPEContratadosProcessResponse")
public class ConsultaPPEContratadosProcessResponse {

    @XmlElement(required = true)
    protected String respuesta;
    @XmlElement(required = true)
    protected String respuestadesc;
    @XmlElement(name = "PPEContratados", required = true)
    protected List<ConsultaPPEContratadosProcessResponse.PPEContratados> ppeContratados;

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
     * Gets the value of the ppeContratados property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ppeContratados property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPPEContratados().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultaPPEContratadosProcessResponse.PPEContratados }
     *
     *
     */
    public List<ConsultaPPEContratadosProcessResponse.PPEContratados> getPPEContratados() {
        if (ppeContratados == null) {
            ppeContratados = new ArrayList<ConsultaPPEContratadosProcessResponse.PPEContratados>();
        }
        return this.ppeContratados;
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
     *         &lt;element name="PPEOrderID" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="ServiceOrderID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CtaSKY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SMARTCARD_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Canal" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="EVENTO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="TIPO_PPV" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="PRECIO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="PAIS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="HoraEvento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="HoraPedido" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="HoraExpiracion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="ESTATUS_EVENTO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="FECHA_TRANSMISION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NUMERO_ORDEN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="FECHA_ORDEN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ESTATUS_ORDEN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
             { "ppeOrderID", "serviceOrderID", "ctaSKY", "smartcardid", "canal", "evento", "tipoppv", "precio", "pais",
               "currency", "horaEvento", "horaPedido", "horaExpiracion", "estatusevento", "fechatransmision",
               "numeroorden", "fechaorden", "estatusorden"
        })
    public static class PPEContratados {

        @XmlElement(name = "PPEOrderID", required = true, nillable = true)
        protected BigDecimal ppeOrderID;
        @XmlElement(name = "ServiceOrderID", required = true, nillable = true)
        protected String serviceOrderID;
        @XmlElement(name = "CtaSKY", required = true, nillable = true)
        protected String ctaSKY;
        @XmlElement(name = "SMARTCARD_ID", required = true, nillable = true)
        protected String smartcardid;
        @XmlElement(name = "Canal", required = true, nillable = true)
        protected BigDecimal canal;
        @XmlElement(name = "EVENTO", required = true, nillable = true)
        protected String evento;
        @XmlElement(name = "TIPO_PPV", required = true, nillable = true)
        protected String tipoppv;
        @XmlElement(name = "PRECIO", required = true, nillable = true)
        protected String precio;
        @XmlElement(name = "PAIS", required = true, nillable = true)
        protected String pais;
        @XmlElement(name = "Currency", required = true, nillable = true)
        protected BigDecimal currency;
        @XmlElement(name = "HoraEvento", required = true, nillable = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar horaEvento;
        @XmlElement(name = "HoraPedido", required = true, nillable = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar horaPedido;
        @XmlElement(name = "HoraExpiracion", required = true, nillable = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar horaExpiracion;
        @XmlElement(name = "ESTATUS_EVENTO", required = true, nillable = true)
        protected String estatusevento;
        @XmlElement(name = "FECHA_TRANSMISION", required = true, nillable = true)
        protected String fechatransmision;
        @XmlElement(name = "NUMERO_ORDEN", required = true, nillable = true)
        protected String numeroorden;
        @XmlElement(name = "FECHA_ORDEN", required = true, nillable = true)
        protected String fechaorden;
        @XmlElement(name = "ESTATUS_ORDEN", required = true, nillable = true)
        protected String estatusorden;

        /**
         * Gets the value of the ppeOrderID property.
         *
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *
         */
        public BigDecimal getPPEOrderID() {
            return ppeOrderID;
        }

        /**
         * Sets the value of the ppeOrderID property.
         *
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *
         */
        public void setPPEOrderID(BigDecimal value) {
            this.ppeOrderID = value;
        }

        /**
         * Gets the value of the serviceOrderID property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getServiceOrderID() {
            return serviceOrderID;
        }

        /**
         * Sets the value of the serviceOrderID property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setServiceOrderID(String value) {
            this.serviceOrderID = value;
        }

        /**
         * Gets the value of the ctaSKY property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCtaSKY() {
            return ctaSKY;
        }

        /**
         * Sets the value of the ctaSKY property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCtaSKY(String value) {
            this.ctaSKY = value;
        }

        /**
         * Gets the value of the smartcardid property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getSMARTCARDID() {
            return smartcardid;
        }

        /**
         * Sets the value of the smartcardid property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setSMARTCARDID(String value) {
            this.smartcardid = value;
        }

        /**
         * Gets the value of the canal property.
         *
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *
         */
        public BigDecimal getCanal() {
            return canal;
        }

        /**
         * Sets the value of the canal property.
         *
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *
         */
        public void setCanal(BigDecimal value) {
            this.canal = value;
        }

        /**
         * Gets the value of the evento property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getEVENTO() {
            return evento;
        }

        /**
         * Sets the value of the evento property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setEVENTO(String value) {
            this.evento = value;
        }

        /**
         * Gets the value of the tipoppv property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getTIPOPPV() {
            return tipoppv;
        }

        /**
         * Sets the value of the tipoppv property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setTIPOPPV(String value) {
            this.tipoppv = value;
        }

        /**
         * Gets the value of the precio property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPRECIO() {
            return precio;
        }

        /**
         * Sets the value of the precio property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPRECIO(String value) {
            this.precio = value;
        }

        /**
         * Gets the value of the pais property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPAIS() {
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
        public void setPAIS(String value) {
            this.pais = value;
        }

        /**
         * Gets the value of the currency property.
         *
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *
         */
        public BigDecimal getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         *
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *
         */
        public void setCurrency(BigDecimal value) {
            this.currency = value;
        }

        /**
         * Gets the value of the horaEvento property.
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getHoraEvento() {
            return horaEvento;
        }

        /**
         * Sets the value of the horaEvento property.
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setHoraEvento(XMLGregorianCalendar value) {
            this.horaEvento = value;
        }

        /**
         * Gets the value of the horaPedido property.
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getHoraPedido() {
            return horaPedido;
        }

        /**
         * Sets the value of the horaPedido property.
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setHoraPedido(XMLGregorianCalendar value) {
            this.horaPedido = value;
        }

        /**
         * Gets the value of the horaExpiracion property.
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getHoraExpiracion() {
            return horaExpiracion;
        }

        /**
         * Sets the value of the horaExpiracion property.
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setHoraExpiracion(XMLGregorianCalendar value) {
            this.horaExpiracion = value;
        }

        /**
         * Gets the value of the estatusevento property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getESTATUSEVENTO() {
            return estatusevento;
        }

        /**
         * Sets the value of the estatusevento property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setESTATUSEVENTO(String value) {
            this.estatusevento = value;
        }

        /**
         * Gets the value of the fechatransmision property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getFECHATRANSMISION() {
            return fechatransmision;
        }

        /**
         * Sets the value of the fechatransmision property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setFECHATRANSMISION(String value) {
            this.fechatransmision = value;
        }

        /**
         * Gets the value of the numeroorden property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNUMEROORDEN() {
            return numeroorden;
        }

        /**
         * Sets the value of the numeroorden property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNUMEROORDEN(String value) {
            this.numeroorden = value;
        }

        /**
         * Gets the value of the fechaorden property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getFECHAORDEN() {
            return fechaorden;
        }

        /**
         * Sets the value of the fechaorden property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setFECHAORDEN(String value) {
            this.fechaorden = value;
        }

        /**
         * Gets the value of the estatusorden property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getESTATUSORDEN() {
            return estatusorden;
        }

        /**
         * Sets the value of the estatusorden property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setESTATUSORDEN(String value) {
            this.estatusorden = value;
        }

    }

}
