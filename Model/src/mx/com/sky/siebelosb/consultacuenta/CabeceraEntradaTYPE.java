
package mx.com.sky.siebelosb.consultacuenta;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cabecera_Entrada_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Cabecera_Entrada_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OPERACION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="APLICATIVO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PARAMETRO" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="VALOR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "Cabecera_Entrada_TYPE", propOrder = { "operacion", "aplicativo", "parametro" })
public class CabeceraEntradaTYPE {

    @XmlElement(name = "OPERACION", required = true)
    protected String operacion;
    @XmlElement(name = "APLICATIVO", required = true)
    protected String aplicativo;
    @XmlElement(name = "PARAMETRO")
    protected List<CabeceraEntradaTYPE.PARAMETRO> parametro;

    /**
     * Gets the value of the operacion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOPERACION() {
        return operacion;
    }

    /**
     * Sets the value of the operacion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOPERACION(String value) {
        this.operacion = value;
    }

    /**
     * Gets the value of the aplicativo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAPLICATIVO() {
        return aplicativo;
    }

    /**
     * Sets the value of the aplicativo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAPLICATIVO(String value) {
        this.aplicativo = value;
    }

    /**
     * Gets the value of the parametro property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parametro property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARAMETRO().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabeceraEntradaTYPE.PARAMETRO }
     *
     *
     */
    public List<CabeceraEntradaTYPE.PARAMETRO> getPARAMETRO() {
        if (parametro == null) {
            parametro = new ArrayList<CabeceraEntradaTYPE.PARAMETRO>();
        }
        return this.parametro;
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
     *         &lt;element name="NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="VALOR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "nombre", "valor" })
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
