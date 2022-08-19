
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultapagosporevento.types;

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
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="result_code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PPE" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CHANNEL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CHANNEL_DISPLAY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="DISPLAY_VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SINOPSIS_VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="IMG" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="IDIOMA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SUBTITULOS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="TITULO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="MENSAJE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "", propOrder = { "result", "resultCode", "ppe" })
@XmlRootElement(name = "ConsultaPagosPorEventoProcessResponse")
public class ConsultaPagosPorEventoProcessResponse {

    @XmlElement(required = true)
    protected String result;
    @XmlElement(name = "result_code", required = true)
    protected String resultCode;
    @XmlElement(name = "PPE", required = true)
    protected List<ConsultaPagosPorEventoProcessResponse.PPE> ppe;

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
     * Gets the value of the ppe property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ppe property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPPE().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultaPagosPorEventoProcessResponse.PPE }
     *
     *
     */
    public List<ConsultaPagosPorEventoProcessResponse.PPE> getPPE() {
        if (ppe == null) {
            ppe = new ArrayList<ConsultaPagosPorEventoProcessResponse.PPE>();
        }
        return this.ppe;
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
     *         &lt;element name="CHANNEL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CHANNEL_DISPLAY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="DISPLAY_VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SINOPSIS_VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="IMG" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="IDIOMA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SUBTITULOS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="TITULO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="MENSAJE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
             { "channel", "channeldisplay", "displayvalue", "sinopsisvalue", "img", "price", "idioma", "subtitulos",
               "titulo", "mensaje"
        })
    public static class PPE {

        @XmlElement(name = "CHANNEL", required = true, nillable = true)
        protected String channel;
        @XmlElement(name = "CHANNEL_DISPLAY", required = true)
        protected String channeldisplay;
        @XmlElement(name = "DISPLAY_VALUE", required = true, nillable = true)
        protected String displayvalue;
        @XmlElement(name = "SINOPSIS_VALUE", required = true)
        protected String sinopsisvalue;
        @XmlElement(name = "IMG", required = true)
        protected String img;
        @XmlElement(name = "PRICE", required = true, nillable = true)
        protected String price;
        @XmlElement(name = "IDIOMA", required = true, nillable = true)
        protected String idioma;
        @XmlElement(name = "SUBTITULOS", required = true, nillable = true)
        protected String subtitulos;
        @XmlElement(name = "TITULO", required = true, nillable = true)
        protected String titulo;
        @XmlElement(name = "MENSAJE", required = true, nillable = true)
        protected String mensaje;

        /**
         * Gets the value of the channel property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCHANNEL() {
            return channel;
        }

        /**
         * Sets the value of the channel property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCHANNEL(String value) {
            this.channel = value;
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
         * Gets the value of the sinopsisvalue property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getSINOPSISVALUE() {
            return sinopsisvalue;
        }

        /**
         * Sets the value of the sinopsisvalue property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setSINOPSISVALUE(String value) {
            this.sinopsisvalue = value;
        }

        /**
         * Gets the value of the img property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getIMG() {
            return img;
        }

        /**
         * Sets the value of the img property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setIMG(String value) {
            this.img = value;
        }

        /**
         * Gets the value of the price property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPRICE() {
            return price;
        }

        /**
         * Sets the value of the price property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPRICE(String value) {
            this.price = value;
        }

        /**
         * Gets the value of the idioma property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getIDIOMA() {
            return idioma;
        }

        /**
         * Sets the value of the idioma property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setIDIOMA(String value) {
            this.idioma = value;
        }

        /**
         * Gets the value of the subtitulos property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getSUBTITULOS() {
            return subtitulos;
        }

        /**
         * Sets the value of the subtitulos property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setSUBTITULOS(String value) {
            this.subtitulos = value;
        }

        /**
         * Gets the value of the titulo property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getTITULO() {
            return titulo;
        }

        /**
         * Sets the value of the titulo property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setTITULO(String value) {
            this.titulo = value;
        }

        /**
         * Gets the value of the mensaje property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getMENSAJE() {
            return mensaje;
        }

        /**
         * Sets the value of the mensaje property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setMENSAJE(String value) {
            this.mensaje = value;
        }

    }

}
