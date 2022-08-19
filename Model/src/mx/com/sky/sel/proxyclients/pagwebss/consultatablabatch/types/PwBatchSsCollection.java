
package mx.com.sky.sel.proxyclients.pagwebss.consultatablabatch.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PwBatchSsCollection complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PwBatchSsCollection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PwBatchSs" type="{http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS}PwBatchSs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PwBatchSsCollection", propOrder = { "pwBatchSs" })
public class PwBatchSsCollection {

    @XmlElement(name = "PwBatchSs")
    protected List<PwBatchSs> pwBatchSs;

    /**
     * Gets the value of the pwBatchSs property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pwBatchSs property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPwBatchSs().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PwBatchSs }
     *
     *
     */
    public List<PwBatchSs> getPwBatchSs() {
        if (pwBatchSs == null) {
            pwBatchSs = new ArrayList<PwBatchSs>();
        }
        return this.pwBatchSs;
    }

}
