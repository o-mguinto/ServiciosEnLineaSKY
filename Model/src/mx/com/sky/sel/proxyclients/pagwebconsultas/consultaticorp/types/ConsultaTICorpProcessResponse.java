
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultaticorp.types;

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
 *         &lt;element name="ListaTarjetasInteligentes" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NumeroTarjetaInteligente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="DescripcionUbicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "", propOrder = { "resultado", "resultadodesc", "listaTarjetasInteligentes" })
@XmlRootElement(name = "ConsultaTI_CorpProcessResponse")
public class ConsultaTICorpProcessResponse {

    @XmlElement(required = true)
    protected String resultado;
    @XmlElement(required = true)
    protected String resultadodesc;
    @XmlElement(name = "ListaTarjetasInteligentes", required = true)
    protected List<ConsultaTICorpProcessResponse.ListaTarjetasInteligentes> listaTarjetasInteligentes;

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
     * Gets the value of the listaTarjetasInteligentes property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaTarjetasInteligentes property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaTarjetasInteligentes().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultaTICorpProcessResponse.ListaTarjetasInteligentes }
     *
     *
     */
    public List<ConsultaTICorpProcessResponse.ListaTarjetasInteligentes> getListaTarjetasInteligentes() {
        if (listaTarjetasInteligentes == null) {
            listaTarjetasInteligentes = new ArrayList<ConsultaTICorpProcessResponse.ListaTarjetasInteligentes>();
        }
        return this.listaTarjetasInteligentes;
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
     *         &lt;element name="NumeroTarjetaInteligente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="DescripcionUbicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "numeroTarjetaInteligente", "descripcionUbicacion" })
    public static class ListaTarjetasInteligentes {

        @XmlElement(name = "NumeroTarjetaInteligente", required = true)
        protected String numeroTarjetaInteligente;
        @XmlElement(name = "DescripcionUbicacion", required = true)
        protected String descripcionUbicacion;

        /**
         * Gets the value of the numeroTarjetaInteligente property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNumeroTarjetaInteligente() {
            return numeroTarjetaInteligente;
        }

        /**
         * Sets the value of the numeroTarjetaInteligente property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNumeroTarjetaInteligente(String value) {
            this.numeroTarjetaInteligente = value;
        }

        /**
         * Gets the value of the descripcionUbicacion property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getDescripcionUbicacion() {
            return descripcionUbicacion;
        }

        /**
         * Sets the value of the descripcionUbicacion property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDescripcionUbicacion(String value) {
            this.descripcionUbicacion = value;
        }

    }

}
