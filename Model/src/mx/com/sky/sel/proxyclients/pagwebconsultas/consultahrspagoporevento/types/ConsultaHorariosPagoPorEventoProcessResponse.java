
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultahrspagoporevento.types;

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
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="result_code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Horarios" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PPV_EVENT_ID" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="START_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="END_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="EXPIRY_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="TOKEN_VALUE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="DURATION" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="CHANNEL" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="DISPLAY_VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CURRENCY_CODE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="CUSTOMER_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SPECIAL_EVENT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="PPV_CONTENT_ID" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="PPV_GENRE_ID" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="FECHAREGISTRO" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="IMAGEN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SINOPSIS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CHANNEL_DISPLAY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="DEFINITION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CHANNEL_TITLE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="IS_PACKAGE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="PREVIEW_MINUTES" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="PSC_TOKEN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="FREE_MINUTES" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="FREE_EVENT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="LAST_ORDER_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="SUBJECT_MATTER_RATING" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ORDER_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="PROVIDER_EVENT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="PPV_CLASS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SKYTrackingId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "", propOrder = { "result", "resultCode", "horarios" })
@XmlRootElement(name = "ConsultaHorariosPagoPorEventoProcessResponse")
public class ConsultaHorariosPagoPorEventoProcessResponse {

    @XmlElement(required = true)
    protected String result;
    @XmlElement(name = "result_code", required = true)
    protected String resultCode;
    @XmlElement(name = "Horarios", required = true)
    protected List<ConsultaHorariosPagoPorEventoProcessResponse.Horarios> horarios;

    /**
     * Gets the value of the result property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Gets the value of the resultCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResultCode(String value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the horarios property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the horarios property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHorarios().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultaHorariosPagoPorEventoProcessResponse.Horarios }
     *
     *
     */
    public List<ConsultaHorariosPagoPorEventoProcessResponse.Horarios> getHorarios() {
        if (horarios == null) {
            horarios = new ArrayList<ConsultaHorariosPagoPorEventoProcessResponse.Horarios>();
        }
        return this.horarios;
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
     *         &lt;element name="PPV_EVENT_ID" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="START_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="END_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="EXPIRY_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="TOKEN_VALUE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="DURATION" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="CHANNEL" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="DISPLAY_VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CURRENCY_CODE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="CUSTOMER_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SPECIAL_EVENT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="PPV_CONTENT_ID" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="PPV_GENRE_ID" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="FECHAREGISTRO" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="IMAGEN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SINOPSIS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CHANNEL_DISPLAY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="DEFINITION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CHANNEL_TITLE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="IS_PACKAGE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="PREVIEW_MINUTES" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="PSC_TOKEN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="FREE_MINUTES" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="FREE_EVENT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="LAST_ORDER_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="SUBJECT_MATTER_RATING" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ORDER_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="PROVIDER_EVENT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="PPV_CLASS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SKYTrackingId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
             { "ppveventid", "startdate", "enddate", "expirydate", "tokenvalue", "duration", "channel", "displayvalue",
               "price", "country", "currencycode", "customertype", "specialevent", "ppvcontentid", "ppvgenreid",
               "fecharegistro", "imagen", "sinopsis", "channeldisplay", "definition", "channeltitle", "ispackage",
               "previewminutes", "psctoken", "freeminutes", "freeevent", "lastorderdate", "subjectmatterrating",
               "ordertype", "providereventid", "ppvclass", "skyTrackingId"
        })
    public static class Horarios {

        @XmlElement(name = "PPV_EVENT_ID", required = true, nillable = true)
        protected BigDecimal ppveventid;
        @XmlElement(name = "START_DATE", required = true, nillable = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar startdate;
        @XmlElement(name = "END_DATE", required = true, nillable = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar enddate;
        @XmlElement(name = "EXPIRY_DATE", required = true, nillable = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar expirydate;
        @XmlElement(name = "TOKEN_VALUE", required = true)
        protected BigDecimal tokenvalue;
        @XmlElement(name = "DURATION", required = true, nillable = true)
        protected BigDecimal duration;
        @XmlElement(name = "CHANNEL", required = true, nillable = true)
        protected BigDecimal channel;
        @XmlElement(name = "DISPLAY_VALUE", required = true, nillable = true)
        protected String displayvalue;
        @XmlElement(name = "PRICE", required = true, nillable = true)
        protected BigDecimal price;
        @XmlElement(name = "COUNTRY", required = true, nillable = true)
        protected String country;
        @XmlElement(name = "CURRENCY_CODE", required = true, nillable = true)
        protected BigDecimal currencycode;
        @XmlElement(name = "CUSTOMER_TYPE", required = true, nillable = true)
        protected String customertype;
        @XmlElement(name = "SPECIAL_EVENT", required = true, nillable = true)
        protected BigDecimal specialevent;
        @XmlElement(name = "PPV_CONTENT_ID", required = true, nillable = true)
        protected BigDecimal ppvcontentid;
        @XmlElement(name = "PPV_GENRE_ID", required = true, nillable = true)
        protected BigDecimal ppvgenreid;
        @XmlElement(name = "FECHAREGISTRO", required = true, nillable = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fecharegistro;
        @XmlElement(name = "IMAGEN", required = true, nillable = true)
        protected String imagen;
        @XmlElement(name = "SINOPSIS", required = true, nillable = true)
        protected String sinopsis;
        @XmlElement(name = "CHANNEL_DISPLAY", required = true, nillable = true)
        protected String channeldisplay;
        @XmlElement(name = "DEFINITION", required = true, nillable = true)
        protected String definition;
        @XmlElement(name = "CHANNEL_TITLE", required = true, nillable = true)
        protected String channeltitle;
        @XmlElement(name = "IS_PACKAGE", required = true, nillable = true)
        protected String ispackage;
        @XmlElement(name = "PREVIEW_MINUTES", required = true, nillable = true)
        protected String previewminutes;
        @XmlElement(name = "PSC_TOKEN", required = true, nillable = true)
        protected String psctoken;
        @XmlElement(name = "FREE_MINUTES", required = true, nillable = true)
        protected String freeminutes;
        @XmlElement(name = "FREE_EVENT", required = true, nillable = true)
        protected String freeevent;
        @XmlElement(name = "LAST_ORDER_DATE", required = true, nillable = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastorderdate;
        @XmlElement(name = "SUBJECT_MATTER_RATING", required = true, nillable = true)
        protected String subjectmatterrating;
        @XmlElement(name = "ORDER_TYPE", required = true, nillable = true)
        protected String ordertype;
        @XmlElement(name = "PROVIDER_EVENT_ID", required = true, nillable = true)
        protected String providereventid;
        @XmlElement(name = "PPV_CLASS", required = true, nillable = true)
        protected String ppvclass;
        @XmlElement(name = "SKYTrackingId", required = true, nillable = true)
        protected String skyTrackingId;

        /**
         * Gets the value of the ppveventid property.
         *
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *
         */
        public BigDecimal getPPVEVENTID() {
            return ppveventid;
        }

        /**
         * Sets the value of the ppveventid property.
         *
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *
         */
        public void setPPVEVENTID(BigDecimal value) {
            this.ppveventid = value;
        }

        /**
         * Gets the value of the startdate property.
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getSTARTDATE() {
            return startdate;
        }

        /**
         * Sets the value of the startdate property.
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setSTARTDATE(XMLGregorianCalendar value) {
            this.startdate = value;
        }

        /**
         * Gets the value of the enddate property.
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getENDDATE() {
            return enddate;
        }

        /**
         * Sets the value of the enddate property.
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setENDDATE(XMLGregorianCalendar value) {
            this.enddate = value;
        }

        /**
         * Gets the value of the expirydate property.
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getEXPIRYDATE() {
            return expirydate;
        }

        /**
         * Sets the value of the expirydate property.
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setEXPIRYDATE(XMLGregorianCalendar value) {
            this.expirydate = value;
        }

        /**
         * Gets the value of the tokenvalue property.
         *
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *
         */
        public BigDecimal getTOKENVALUE() {
            return tokenvalue;
        }

        /**
         * Sets the value of the tokenvalue property.
         *
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *
         */
        public void setTOKENVALUE(BigDecimal value) {
            this.tokenvalue = value;
        }

        /**
         * Gets the value of the duration property.
         *
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *
         */
        public BigDecimal getDURATION() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         *
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *
         */
        public void setDURATION(BigDecimal value) {
            this.duration = value;
        }

        /**
         * Gets the value of the channel property.
         *
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *
         */
        public BigDecimal getCHANNEL() {
            return channel;
        }

        /**
         * Sets the value of the channel property.
         *
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *
         */
        public void setCHANNEL(BigDecimal value) {
            this.channel = value;
        }

        /**
         * Gets the value of the displayvalue property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getDISPLAYVALUE() {
            return displayvalue;
        }

        /**
         * Sets the value of the displayvalue property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDISPLAYVALUE(String value) {
            this.displayvalue = value;
        }

        /**
         * Gets the value of the price property.
         *
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *
         */
        public BigDecimal getPRICE() {
            return price;
        }

        /**
         * Sets the value of the price property.
         *
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *
         */
        public void setPRICE(BigDecimal value) {
            this.price = value;
        }

        /**
         * Gets the value of the country property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCOUNTRY() {
            return country;
        }

        /**
         * Sets the value of the country property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCOUNTRY(String value) {
            this.country = value;
        }

        /**
         * Gets the value of the currencycode property.
         *
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *
         */
        public BigDecimal getCURRENCYCODE() {
            return currencycode;
        }

        /**
         * Sets the value of the currencycode property.
         *
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *
         */
        public void setCURRENCYCODE(BigDecimal value) {
            this.currencycode = value;
        }

        /**
         * Gets the value of the customertype property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCUSTOMERTYPE() {
            return customertype;
        }

        /**
         * Sets the value of the customertype property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCUSTOMERTYPE(String value) {
            this.customertype = value;
        }

        /**
         * Gets the value of the specialevent property.
         *
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *
         */
        public BigDecimal getSPECIALEVENT() {
            return specialevent;
        }

        /**
         * Sets the value of the specialevent property.
         *
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *
         */
        public void setSPECIALEVENT(BigDecimal value) {
            this.specialevent = value;
        }

        /**
         * Gets the value of the ppvcontentid property.
         *
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *
         */
        public BigDecimal getPPVCONTENTID() {
            return ppvcontentid;
        }

        /**
         * Sets the value of the ppvcontentid property.
         *
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *
         */
        public void setPPVCONTENTID(BigDecimal value) {
            this.ppvcontentid = value;
        }

        /**
         * Gets the value of the ppvgenreid property.
         *
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *
         */
        public BigDecimal getPPVGENREID() {
            return ppvgenreid;
        }

        /**
         * Sets the value of the ppvgenreid property.
         *
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *
         */
        public void setPPVGENREID(BigDecimal value) {
            this.ppvgenreid = value;
        }

        /**
         * Gets the value of the fecharegistro property.
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getFECHAREGISTRO() {
            return fecharegistro;
        }

        /**
         * Sets the value of the fecharegistro property.
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setFECHAREGISTRO(XMLGregorianCalendar value) {
            this.fecharegistro = value;
        }

        /**
         * Gets the value of the imagen property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getIMAGEN() {
            return imagen;
        }

        /**
         * Sets the value of the imagen property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setIMAGEN(String value) {
            this.imagen = value;
        }

        /**
         * Gets the value of the sinopsis property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getSINOPSIS() {
            return sinopsis;
        }

        /**
         * Sets the value of the sinopsis property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setSINOPSIS(String value) {
            this.sinopsis = value;
        }

        /**
         * Gets the value of the channeldisplay property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCHANNELDISPLAY() {
            return channeldisplay;
        }

        /**
         * Sets the value of the channeldisplay property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCHANNELDISPLAY(String value) {
            this.channeldisplay = value;
        }

        /**
         * Gets the value of the definition property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getDEFINITION() {
            return definition;
        }

        /**
         * Sets the value of the definition property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDEFINITION(String value) {
            this.definition = value;
        }

        /**
         * Gets the value of the channeltitle property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCHANNELTITLE() {
            return channeltitle;
        }

        /**
         * Sets the value of the channeltitle property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCHANNELTITLE(String value) {
            this.channeltitle = value;
        }

        /**
         * Gets the value of the ispackage property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getISPACKAGE() {
            return ispackage;
        }

        /**
         * Sets the value of the ispackage property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setISPACKAGE(String value) {
            this.ispackage = value;
        }

        /**
         * Gets the value of the previewminutes property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPREVIEWMINUTES() {
            return previewminutes;
        }

        /**
         * Sets the value of the previewminutes property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPREVIEWMINUTES(String value) {
            this.previewminutes = value;
        }

        /**
         * Gets the value of the psctoken property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPSCTOKEN() {
            return psctoken;
        }

        /**
         * Sets the value of the psctoken property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPSCTOKEN(String value) {
            this.psctoken = value;
        }

        /**
         * Gets the value of the freeminutes property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getFREEMINUTES() {
            return freeminutes;
        }

        /**
         * Sets the value of the freeminutes property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setFREEMINUTES(String value) {
            this.freeminutes = value;
        }

        /**
         * Gets the value of the freeevent property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getFREEEVENT() {
            return freeevent;
        }

        /**
         * Sets the value of the freeevent property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setFREEEVENT(String value) {
            this.freeevent = value;
        }

        /**
         * Gets the value of the lastorderdate property.
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getLASTORDERDATE() {
            return lastorderdate;
        }

        /**
         * Sets the value of the lastorderdate property.
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setLASTORDERDATE(XMLGregorianCalendar value) {
            this.lastorderdate = value;
        }

        /**
         * Gets the value of the subjectmatterrating property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getSUBJECTMATTERRATING() {
            return subjectmatterrating;
        }

        /**
         * Sets the value of the subjectmatterrating property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setSUBJECTMATTERRATING(String value) {
            this.subjectmatterrating = value;
        }

        /**
         * Gets the value of the ordertype property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getORDERTYPE() {
            return ordertype;
        }

        /**
         * Sets the value of the ordertype property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setORDERTYPE(String value) {
            this.ordertype = value;
        }

        /**
         * Gets the value of the providereventid property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPROVIDEREVENTID() {
            return providereventid;
        }

        /**
         * Sets the value of the providereventid property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPROVIDEREVENTID(String value) {
            this.providereventid = value;
        }

        /**
         * Gets the value of the ppvclass property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPPVCLASS() {
            return ppvclass;
        }

        /**
         * Sets the value of the ppvclass property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPPVCLASS(String value) {
            this.ppvclass = value;
        }

        /**
         * Gets the value of the skyTrackingId property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getSKYTrackingId() {
            return skyTrackingId;
        }

        /**
         * Sets the value of the skyTrackingId property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setSKYTrackingId(String value) {
            this.skyTrackingId = value;
        }

    }

}
