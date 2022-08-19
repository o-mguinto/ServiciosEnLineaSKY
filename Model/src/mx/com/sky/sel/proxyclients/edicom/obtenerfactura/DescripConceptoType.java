
package mx.com.sky.sel.proxyclients.edicom.obtenerfactura;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for descripConceptoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="descripConceptoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descripcion" type="{http://factura.edicom.factura.sky.com.mx}descripcionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "descripConceptoType", propOrder = {
    "descripcion"
})
public class DescripConceptoType {

    protected List<DescripcionType> descripcion;

    /**
     * Gets the value of the descripcion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descripcion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescripcion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescripcionType }
     * 
     * 
     */
    public List<DescripcionType> getDescripcion() {
        if (descripcion == null) {
            descripcion = new ArrayList<DescripcionType>();
        }
        return this.descripcion;
    }

}
