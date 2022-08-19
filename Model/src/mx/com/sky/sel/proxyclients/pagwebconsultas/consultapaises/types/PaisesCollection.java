
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaises.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaisesCollection complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PaisesCollection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pais" type="{http://xmlns.oracle.com/ConsultaPaises}Pais" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaisesCollection", propOrder = { "pais" })
public class PaisesCollection {

    @XmlElement(name = "Pais", required = true)
    protected List<Pais> pais;

    /**
     * Gets the value of the pais property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pais property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPais().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pais }
     *
     *
     */
    public List<Pais> getPais() {
        if (pais == null) {
            pais = new ArrayList<Pais>();
        }
        return this.pais;
    }

}
