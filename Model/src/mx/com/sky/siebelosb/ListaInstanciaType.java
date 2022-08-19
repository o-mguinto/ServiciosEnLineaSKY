
package mx.com.sky.siebelosb;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListaInstancia_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ListaInstancia_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Instancia" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TarjetaInteligente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="IRD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Jerarquia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ListaProducto" type="{http://www.sky.com.mx/SiebelOSB}ListaProducto_Type" minOccurs="0"/&gt;
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
@XmlType(name = "ListaInstancia_Type", propOrder = { "instancia" })
public class ListaInstanciaType {

    @XmlElement(name = "Instancia")
    protected List<ListaInstanciaType.Instancia> instancia;

    /**
     * Gets the value of the instancia property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instancia property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstancia().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListaInstanciaType.Instancia }
     *
     *
     */
    public List<ListaInstanciaType.Instancia> getInstancia() {
        if (instancia == null) {
            instancia = new ArrayList<ListaInstanciaType.Instancia>();
        }
        return this.instancia;
    }

    /**
     * @param instancia
     */
    public void setInstancia(List<ListaInstanciaType.Instancia> instancia) {
        this.instancia = instancia;
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
     *         &lt;element name="TarjetaInteligente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="IRD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Jerarquia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ListaProducto" type="{http://www.sky.com.mx/SiebelOSB}ListaProducto_Type" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "tarjetaInteligente", "ird", "jerarquia", "listaProducto" })
    public static class Instancia {

        @XmlElement(name = "TarjetaInteligente", required = true)
        protected String tarjetaInteligente;
        @XmlElement(name = "IRD", required = true)
        protected String ird;
        @XmlElement(name = "Jerarquia", required = true)
        protected String jerarquia;
        @XmlElement(name = "ListaProducto")
        protected ListaProductoType listaProducto;

        /**
         * Gets the value of the tarjetaInteligente property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getTarjetaInteligente() {
            return tarjetaInteligente;
        }

        /**
         * Sets the value of the tarjetaInteligente property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setTarjetaInteligente(String value) {
            this.tarjetaInteligente = value;
        }

        /**
         * Gets the value of the ird property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getIRD() {
            return ird;
        }

        /**
         * Sets the value of the ird property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setIRD(String value) {
            this.ird = value;
        }

        /**
         * Gets the value of the jerarquia property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getJerarquia() {
            return jerarquia;
        }

        /**
         * Sets the value of the jerarquia property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setJerarquia(String value) {
            this.jerarquia = value;
        }

        /**
         * Gets the value of the listaProducto property.
         *
         * @return
         *     possible object is
         *     {@link ListaProductoType }
         *
         */
        public ListaProductoType getListaProducto() {
            return listaProducto;
        }

        /**
         * Sets the value of the listaProducto property.
         *
         * @param value
         *     allowed object is
         *     {@link ListaProductoType }
         *
         */
        public void setListaProducto(ListaProductoType value) {
            this.listaProducto = value;
        }

    }

}
