
package mx.com.sky.siebelosb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Gestionacomponente_Salida_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Gestionacomponente_Salida_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CABECERA"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="COD_ERROR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MSG_ERROR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "Gestionacomponente_Salida_TYPE", propOrder = { "cabecera" })
public class GestionacomponenteSalidaTYPE {

    @XmlElement(name = "CABECERA", required = true)
    protected GestionacomponenteSalidaTYPE.CABECERA cabecera;

    /**
     * Gets the value of the cabecera property.
     *
     * @return
     *     possible object is
     *     {@link GestionacomponenteSalidaTYPE.CABECERA }
     *
     */
    public GestionacomponenteSalidaTYPE.CABECERA getCABECERA() {
        return cabecera;
    }

    /**
     * Sets the value of the cabecera property.
     *
     * @param value
     *     allowed object is
     *     {@link GestionacomponenteSalidaTYPE.CABECERA }
     *
     */
    public void setCABECERA(GestionacomponenteSalidaTYPE.CABECERA value) {
        this.cabecera = value;
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
     *         &lt;element name="COD_ERROR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MSG_ERROR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "coderror", "msgerror" })
    public static class CABECERA {

        @XmlElement(name = "COD_ERROR")
        protected String coderror;
        @XmlElement(name = "MSG_ERROR")
        protected String msgerror;

        /**
         * Gets the value of the coderror property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCODERROR() {
            return coderror;
        }

        /**
         * Sets the value of the coderror property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCODERROR(String value) {
            this.coderror = value;
        }

        /**
         * Gets the value of the msgerror property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getMSGERROR() {
            return msgerror;
        }

        /**
         * Sets the value of the msgerror property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setMSGERROR(String value) {
            this.msgerror = value;
        }

    }

}
