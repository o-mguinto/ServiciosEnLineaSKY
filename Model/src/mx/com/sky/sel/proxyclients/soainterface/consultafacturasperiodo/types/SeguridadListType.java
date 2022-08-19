
package mx.com.sky.sel.proxyclients.soainterface.consultafacturasperiodo.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeguridadListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeguridadListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SeguridadItem" type="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}SeguridadItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeguridadListType", propOrder = {
    "seguridadItem"
})
public class SeguridadListType {

    @XmlElement(name = "SeguridadItem")
    protected List<SeguridadItemType> seguridadItem;

    /**
     * Gets the value of the seguridadItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seguridadItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeguridadItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeguridadItemType }
     * 
     * 
     */
    public List<SeguridadItemType> getSeguridadItem() {
        if (seguridadItem == null) {
            seguridadItem = new ArrayList<SeguridadItemType>();
        }
        return this.seguridadItem;
    }

}
