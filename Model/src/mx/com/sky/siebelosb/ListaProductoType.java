
package mx.com.sky.siebelosb;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListaProducto_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ListaProducto_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Producto" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="FechaInicio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="FechaFin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "ListaProducto_Type", propOrder = { "producto" })
public class ListaProductoType {

    @XmlElement(name = "Producto")
    protected List<ListaProductoType.Producto> producto;

    /**
     * Gets the value of the producto property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the producto property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducto().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListaProductoType.Producto }
     *
     *
     */
    public List<ListaProductoType.Producto> getProducto() {
        if (producto == null) {
            producto = new ArrayList<ListaProductoType.Producto>();
        }
        return this.producto;
    }

    /**
     * @param producto
     */
    public void setProducto(List<ListaProductoType.Producto> producto) {
        this.producto = producto;
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
     *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="FechaInicio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="FechaFin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "nombre", "fechaInicio", "fechaFin", "action" })
    public static class Producto {

        @XmlElement(name = "Nombre", required = true)
        protected String nombre;
        @XmlElement(name = "FechaInicio", required = true)
        protected String fechaInicio;
        @XmlElement(name = "FechaFin", required = true)
        protected String fechaFin;
        @XmlElement(name = "Action", required = true)
        protected String action;

        /**
         * Gets the value of the nombre property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNombre() {
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
        public void setNombre(String value) {
            this.nombre = value;
        }

        /**
         * Gets the value of the fechaInicio property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getFechaInicio() {
            return fechaInicio;
        }

        /**
         * Sets the value of the fechaInicio property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setFechaInicio(String value) {
            this.fechaInicio = value;
        }

        /**
         * Gets the value of the fechaFin property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getFechaFin() {
            return fechaFin;
        }

        /**
         * Sets the value of the fechaFin property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setFechaFin(String value) {
            this.fechaFin = value;
        }

        /**
         * Gets the value of the action property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getAction() {
            return action;
        }

        /**
         * Sets the value of the action property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setAction(String value) {
            this.action = value;
        }

    }

}
