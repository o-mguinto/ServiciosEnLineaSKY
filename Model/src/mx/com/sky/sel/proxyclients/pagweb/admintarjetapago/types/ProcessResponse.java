
package mx.com.sky.sel.proxyclients.pagweb.admintarjetapago.types;

import java.math.BigDecimal;

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
 *         &lt;element name="Tarjetas" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="ccName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ccNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ccType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="expYear" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="expMonth" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ccCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "", propOrder = { "respuesta", "respuestadesc", "tarjetas" })
@XmlRootElement(name = "processResponse")
public class ProcessResponse {

    @XmlElement(required = true)
    protected String respuesta;
    @XmlElement(required = true)
    protected String respuestadesc;
    @XmlElement(name = "Tarjetas", required = true)
    protected List<ProcessResponse.Tarjetas> tarjetas;

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
     * Gets the value of the tarjetas property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tarjetas property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTarjetas().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessResponse.Tarjetas }
     *
     *
     */
    public List<ProcessResponse.Tarjetas> getTarjetas() {
        if (tarjetas == null) {
            tarjetas = new ArrayList<ProcessResponse.Tarjetas>();
        }
        return this.tarjetas;
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
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="ccName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ccNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ccType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="expYear" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="expMonth" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ccCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "id", "ccName", "ccNumber", "ccType", "expYear", "expMonth", "userId", "ccCd" })
    public static class Tarjetas {

        @XmlElement(required = true)
        protected BigDecimal id;
        @XmlElement(required = true)
        protected String ccName;
        @XmlElement(required = true)
        protected String ccNumber;
        @XmlElement(required = true)
        protected String ccType;
        @XmlElement(required = true)
        protected String expYear;
        @XmlElement(required = true)
        protected String expMonth;
        @XmlElement(required = true)
        protected String userId;
        @XmlElement(required = true)
        protected String ccCd;

        /**
         * Gets the value of the id property.
         *
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *
         */
        public BigDecimal getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         *
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *
         */
        public void setId(BigDecimal value) {
            this.id = value;
        }

        /**
         * Gets the value of the ccName property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCcName() {
            return ccName;
        }

        /**
         * Sets the value of the ccName property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCcName(String value) {
            this.ccName = value;
        }

        /**
         * Gets the value of the ccNumber property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCcNumber() {
            return ccNumber;
        }

        /**
         * Sets the value of the ccNumber property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCcNumber(String value) {
            this.ccNumber = value;
        }

        /**
         * Gets the value of the ccType property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCcType() {
            return ccType;
        }

        /**
         * Sets the value of the ccType property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCcType(String value) {
            this.ccType = value;
        }

        /**
         * Gets the value of the expYear property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getExpYear() {
            return expYear;
        }

        /**
         * Sets the value of the expYear property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setExpYear(String value) {
            this.expYear = value;
        }

        /**
         * Gets the value of the expMonth property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getExpMonth() {
            return expMonth;
        }

        /**
         * Sets the value of the expMonth property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setExpMonth(String value) {
            this.expMonth = value;
        }

        /**
         * Gets the value of the userId property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getUserId() {
            return userId;
        }

        /**
         * Sets the value of the userId property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setUserId(String value) {
            this.userId = value;
        }

        /**
         * Gets the value of the ccCd property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCcCd() {
            return ccCd;
        }

        /**
         * Sets the value of the ccCd property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCcCd(String value) {
            this.ccCd = value;
        }

    }

}
