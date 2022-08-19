
package mx.com.sky.enterpriseobjects.sel.paqadicionaldatos;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListProductFacturacion_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ListProductFacturacion_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductFacturacion" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NombreProductoFactura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="PartNumberFactura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "ListProductFacturacion_Type",
         propOrder = { "productFacturacion" })
public class ListProductFacturacionType {

    @XmlElement(name = "ProductFacturacion")
    protected List<ListProductFacturacionType.ProductFacturacion> productFacturacion;

    /**
     * Gets the value of the productFacturacion property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productFacturacion property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductFacturacion().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListProductFacturacionType.ProductFacturacion }
     *
     *
     */
    public List<ListProductFacturacionType.ProductFacturacion> getProductFacturacion() {
        if (productFacturacion == null) {
            productFacturacion =
                new ArrayList<ListProductFacturacionType.ProductFacturacion>();
        }
        return this.productFacturacion;
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
     *         &lt;element name="NombreProductoFactura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="PartNumberFactura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
             propOrder = { "nombreProductoFactura", "partNumberFactura" })
    public static class ProductFacturacion {

        @XmlElement(name = "NombreProductoFactura", required = true)
        protected String nombreProductoFactura;
        @XmlElement(name = "PartNumberFactura", required = true)
        protected String partNumberFactura;

        /**
         * Gets the value of the nombreProductoFactura property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNombreProductoFactura() {
            return nombreProductoFactura;
        }

        /**
         * Sets the value of the nombreProductoFactura property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNombreProductoFactura(String value) {
            this.nombreProductoFactura = value;
        }

        /**
         * Gets the value of the partNumberFactura property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPartNumberFactura() {
            return partNumberFactura;
        }

        /**
         * Sets the value of the partNumberFactura property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPartNumberFactura(String value) {
            this.partNumberFactura = value;
        }

    }

}
