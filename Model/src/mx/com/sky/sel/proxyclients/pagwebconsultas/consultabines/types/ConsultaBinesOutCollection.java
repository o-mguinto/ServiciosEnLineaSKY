
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultabines.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultaBinesOutCollection complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultaBinesOutCollection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsultaOut" type="{http://xmlns.oracle.com/ConsultaBines}ConsultaBinesOut" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaBinesOutCollection", propOrder = { "consultaOut" })
public class ConsultaBinesOutCollection {

    @XmlElement(name = "ConsultaOut", required = true)
    protected List<ConsultaBinesOut> consultaOut;

    /**
     * Gets the value of the consultaOut property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consultaOut property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsultaOut().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultaBinesOut }
     *
     *
     */
    public List<ConsultaBinesOut> getConsultaOut() {
        if (consultaOut == null) {
            consultaOut = new ArrayList<ConsultaBinesOut>();
        }
        return this.consultaOut;
    }

}
