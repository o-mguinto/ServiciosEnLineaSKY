
package mx.com.sky.sel.proxyclients.pagweb.opinionsugerencias.types;

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
 *         &lt;element name="Sugerencias" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="REGISTRATION_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="SUGGESTION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NUMBER_SS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "", propOrder = { "respuesta", "respuestadesc", "sugerencias" })
@XmlRootElement(name = "Opinion_SugerenciasProcessResponse")
public class OpinionSugerenciasProcessResponse {

    @XmlElement(required = true)
    protected String respuesta;
    @XmlElement(required = true)
    protected String respuestadesc;
    @XmlElement(name = "Sugerencias", required = true)
    protected List<OpinionSugerenciasProcessResponse.Sugerencias> sugerencias;

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
     * Gets the value of the sugerencias property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sugerencias property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSugerencias().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpinionSugerenciasProcessResponse.Sugerencias }
     *
     *
     */
    public List<OpinionSugerenciasProcessResponse.Sugerencias> getSugerencias() {
        if (sugerencias == null) {
            sugerencias = new ArrayList<OpinionSugerenciasProcessResponse.Sugerencias>();
        }
        return this.sugerencias;
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
     *         &lt;element name="REGISTRATION_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="SUGGESTION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NUMBER_SS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "registrationdate", "suggestion", "numberss" })
    public static class Sugerencias {

        @XmlElement(name = "REGISTRATION_DATE", required = true, nillable = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar registrationdate;
        @XmlElement(name = "SUGGESTION", required = true, nillable = true)
        protected String suggestion;
        @XmlElement(name = "NUMBER_SS", required = true, nillable = true)
        protected String numberss;

        /**
         * Gets the value of the registrationdate property.
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getREGISTRATIONDATE() {
            return registrationdate;
        }

        /**
         * Sets the value of the registrationdate property.
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setREGISTRATIONDATE(XMLGregorianCalendar value) {
            this.registrationdate = value;
        }

        /**
         * Gets the value of the suggestion property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getSUGGESTION() {
            return suggestion;
        }

        /**
         * Sets the value of the suggestion property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setSUGGESTION(String value) {
            this.suggestion = value;
        }

        /**
         * Gets the value of the numberss property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNUMBERSS() {
            return numberss;
        }

        /**
         * Sets the value of the numberss property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNUMBERSS(String value) {
            this.numberss = value;
        }

    }

}
