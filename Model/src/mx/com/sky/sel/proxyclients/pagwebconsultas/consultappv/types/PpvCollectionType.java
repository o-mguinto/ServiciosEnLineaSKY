
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultappv.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ppvCollectionType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ppvCollectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element name="ppv" type="{http://xmlns.oracle.com/ConsultaPPV}ppvType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ppvCollectionType", propOrder = { "ppv" })
public class PpvCollectionType {

    @XmlElement(required = true)
    protected List<PpvType> ppv;

    /**
     * Gets the value of the ppv property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ppv property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPpv().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PpvType }
     *
     *
     */
    public List<PpvType> getPpv() {
        if (ppv == null) {
            ppv = new ArrayList<PpvType>();
        }
        return this.ppv;
    }

}
