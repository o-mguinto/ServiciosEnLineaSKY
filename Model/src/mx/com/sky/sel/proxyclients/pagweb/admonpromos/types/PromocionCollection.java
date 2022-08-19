
package mx.com.sky.sel.proxyclients.pagweb.admonpromos.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromocionCollection complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PromocionCollection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Promocion" type="{http://xmlns.oracle.com/AdmonPromociones}Promocion" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromocionCollection", propOrder = { "promocion" })
public class PromocionCollection {

    @XmlElement(name = "Promocion", required = true)
    protected List<Promocion> promocion;

    /**
     * Gets the value of the promocion property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promocion property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromocion().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Promocion }
     *
     *
     */
    public List<Promocion> getPromocion() {
        if (promocion == null) {
            promocion = new ArrayList<Promocion>();
        }
        return this.promocion;
    }

}
