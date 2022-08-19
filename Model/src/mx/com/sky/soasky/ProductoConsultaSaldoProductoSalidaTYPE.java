
package mx.com.sky.soasky;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Producto_consultaSaldoProducto_Salida_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Producto_consultaSaldoProducto_Salida_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PART_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="COSTO" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Producto_consultaSaldoProducto_Salida_TYPE", propOrder = { "partnumber", "costo" })
public class ProductoConsultaSaldoProductoSalidaTYPE {

    @XmlElement(name = "PART_NUMBER", required = true)
    protected String partnumber;
    @XmlElement(name = "COSTO", required = true)
    protected BigDecimal costo;

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

    /**
     * Gets the value of the costo property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCOSTO() {
        return costo;
    }

    /**
     * Sets the value of the costo property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCOSTO(BigDecimal value) {
        this.costo = value;
    }

}
