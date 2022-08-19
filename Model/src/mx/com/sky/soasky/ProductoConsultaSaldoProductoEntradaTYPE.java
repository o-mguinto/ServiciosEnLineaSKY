
package mx.com.sky.soasky;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Producto_consultaSaldoProducto_Entrada_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Producto_consultaSaldoProducto_Entrada_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PART_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Producto_consultaSaldoProducto_Entrada_TYPE", propOrder = { "partnumber" })
public class ProductoConsultaSaldoProductoEntradaTYPE {

    @XmlElement(name = "PART_NUMBER", required = true)
    protected String partnumber;

    /**
     * Gets the value of the partnumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPARTNUMBER() {
        return partnumber;
    }

    /**
     * Sets the value of the partnumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPARTNUMBER(String value) {
        this.partnumber = value;
    }

}
