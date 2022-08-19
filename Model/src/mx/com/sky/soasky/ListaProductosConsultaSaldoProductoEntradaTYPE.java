
package mx.com.sky.soasky;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Lista_Productos_consultaSaldoProducto_Entrada_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Lista_Productos_consultaSaldoProducto_Entrada_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PRODUCTO" type="{http://www.sky.com.mx/soasky}Producto_consultaSaldoProducto_Entrada_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lista_Productos_consultaSaldoProducto_Entrada_TYPE", propOrder = { "producto" })
public class ListaProductosConsultaSaldoProductoEntradaTYPE {

    @XmlElement(name = "PRODUCTO")
    protected List<ProductoConsultaSaldoProductoEntradaTYPE> producto;

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
     *    getPRODUCTO().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductoConsultaSaldoProductoEntradaTYPE }
     *
     *
     */
    public List<ProductoConsultaSaldoProductoEntradaTYPE> getPRODUCTO() {
        if (producto == null) {
            producto = new ArrayList<ProductoConsultaSaldoProductoEntradaTYPE>();
        }
        return this.producto;
    }

    public void setProducto(List<ProductoConsultaSaldoProductoEntradaTYPE> producto) {
        this.producto = producto;
    }

}
