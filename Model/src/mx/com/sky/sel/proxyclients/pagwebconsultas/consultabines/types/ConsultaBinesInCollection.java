
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultabines.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultaBinesInCollection complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultaBinesInCollection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bines" type="{http://xmlns.oracle.com/ConsultaBines}ConsultaBinesIn" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaBinesInCollection", propOrder = { "bines" })
public class ConsultaBinesInCollection {

    @XmlElement(name = "Bines", required = true)
    protected List<ConsultaBinesIn> bines;

    /**
     * Gets the value of the bines property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bines property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBines().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultaBinesIn }
     *
     *
     */
    public List<ConsultaBinesIn> getBines() {
        if (bines == null) {
            bines = new ArrayList<ConsultaBinesIn>();
        }
        return this.bines;
    }

}
