
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultapreciopaquete.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollectionPartNum complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CollectionPartNum"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element name="PartNum" type="{http://www.example.org}PartNum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectionPartNum", propOrder = { "partNum" })
public class CollectionPartNum {

    @XmlElement(name = "PartNum")
    protected List<PartNum> partNum;

    /**
     * Gets the value of the partNum property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partNum property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartNum().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartNum }
     *
     *
     */
    public List<PartNum> getPartNum() {
        if (partNum == null) {
            partNum = new ArrayList<PartNum>();
        }
        return this.partNum;
    }

}
