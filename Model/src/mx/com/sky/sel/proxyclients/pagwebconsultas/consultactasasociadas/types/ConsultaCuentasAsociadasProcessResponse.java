
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultactasasociadas.types;

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
 *         &lt;element name="ListaCuentas"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Cuenta" type="{http://xmlns.oracle.com/ConsultaCuentasAsociadas}Cuenta" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "", propOrder = { "resultado", "resultadodesc", "listaCuentas" })
@XmlRootElement(name = "ConsultaCuentasAsociadasProcessResponse")
public class ConsultaCuentasAsociadasProcessResponse {

    @XmlElement(required = true)
    protected String resultado;
    @XmlElement(required = true)
    protected String resultadodesc;
    @XmlElement(name = "ListaCuentas", required = true)
    protected ConsultaCuentasAsociadasProcessResponse.ListaCuentas listaCuentas;

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
     * Gets the value of the listaCuentas property.
     *
     * @return
     *     possible object is
     *     {@link ConsultaCuentasAsociadasProcessResponse.ListaCuentas }
     *
     */
    public ConsultaCuentasAsociadasProcessResponse.ListaCuentas getListaCuentas() {
        return listaCuentas;
    }

    /**
     * Sets the value of the listaCuentas property.
     *
     * @param value
     *     allowed object is
     *     {@link ConsultaCuentasAsociadasProcessResponse.ListaCuentas }
     *
     */
    public void setListaCuentas(ConsultaCuentasAsociadasProcessResponse.ListaCuentas value) {
        this.listaCuentas = value;
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
     *         &lt;element name="Cuenta" type="{http://xmlns.oracle.com/ConsultaCuentasAsociadas}Cuenta" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "cuenta" })
    public static class ListaCuentas {

        @XmlElement(name = "Cuenta")
        protected List<Cuenta> cuenta;

        /**
         * Gets the value of the cuenta property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cuenta property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCuenta().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Cuenta }
         *
         *
         */
        public List<Cuenta> getCuenta() {
            if (cuenta == null) {
                cuenta = new ArrayList<Cuenta>();
            }
            return this.cuenta;
        }

    }

}
