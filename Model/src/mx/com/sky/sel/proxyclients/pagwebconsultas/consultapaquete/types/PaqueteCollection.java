
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaquete.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaqueteCollection complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PaqueteCollection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Paquete" type="{http://xmlns.oracle.com/ConsultaPaquete}Paquete" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaqueteCollection", propOrder = { "paquete" })
public class PaqueteCollection {

    @XmlElement(name = "Paquete")
    protected List<Paquete> paquete;

    /**
     * Gets the value of the paquete property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paquete property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaquete().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Paquete }
     *
     *
     */
    public List<Paquete> getPaquete() {
        if (paquete == null) {
            paquete = new ArrayList<Paquete>();
        }
        return this.paquete;
    }

}
