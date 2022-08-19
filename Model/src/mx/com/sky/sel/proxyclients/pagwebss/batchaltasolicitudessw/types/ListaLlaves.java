
package mx.com.sky.sel.proxyclients.pagwebss.batchaltasolicitudessw.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListaLlaves complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ListaLlaves"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Llave" type="{http://xmlns.oracle.com/BatchAltaSolicitudesDeServicioWeb}Llave" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaLlaves", propOrder = { "llave" })
public class ListaLlaves {

    @XmlElement(name = "Llave")
    protected List<Llave> llave;

    /**
     * Gets the value of the llave property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the llave property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLlave().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Llave }
     *
     *
     */
    public List<Llave> getLlave() {
        if (llave == null) {
            llave = new ArrayList<Llave>();
        }
        return this.llave;
    }

}
