
package mx.com.sky.sel.proxyclients.rnsoa.generaurlchat.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PARAMETRO_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PARAMETRO_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="PARAMETRO"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="VALOR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PARAMETRO_TYPE", propOrder = {


    })
public class PARAMETROTYPE {

    @XmlElement(name = "PARAMETRO", required = true)
    protected PARAMETROTYPE.PARAMETRO parametro;

    /**
     * Gets the value of the parametro property.
     *
     * @return
     *     possible object is
     *     {@link PARAMETROTYPE.PARAMETRO }
     *
     */
    public PARAMETROTYPE.PARAMETRO getPARAMETRO() {
        return parametro;
    }

    /**
     * Sets the value of the parametro property.
     *
     * @param value
     *     allowed object is
     *     {@link PARAMETROTYPE.PARAMETRO }
     *
     */
    public void setPARAMETRO(PARAMETROTYPE.PARAMETRO value) {
        this.parametro = value;
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
     *       &lt;all&gt;
     *         &lt;element name="NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="VALOR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {


        })
    public static class PARAMETRO {

        @XmlElement(name = "NOMBRE", required = true)
        protected String nombre;
        @XmlElement(name = "VALOR", required = true)
        protected String valor;

        /**
         * Gets the value of the nombre property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNOMBRE() {
            return nombre;
        }

        /**
         * Sets the value of the nombre property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNOMBRE(String value) {
            this.nombre = value;
        }

        /**
         * Gets the value of the valor property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getVALOR() {
            return valor;
        }

        /**
         * Sets the value of the valor property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setVALOR(String value) {
            this.valor = value;
        }

    }

}
