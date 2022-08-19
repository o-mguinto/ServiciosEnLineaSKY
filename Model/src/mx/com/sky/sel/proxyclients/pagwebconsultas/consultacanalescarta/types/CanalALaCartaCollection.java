
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultacanalescarta.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CanalALaCartaCollection complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CanalALaCartaCollection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanalALaCarta" type="{http://xmlns.oracle.com/ConsultaCanalesALaCarta}CanalALaCarta" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CanalALaCartaCollection", propOrder = { "canalALaCarta" })
public class CanalALaCartaCollection {

    @XmlElement(name = "CanalALaCarta")
    protected List<CanalALaCarta> canalALaCarta;

    /**
     * Gets the value of the canalALaCarta property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the canalALaCarta property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCanalALaCarta().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CanalALaCarta }
     *
     *
     */
    public List<CanalALaCarta> getCanalALaCarta() {
        if (canalALaCarta == null) {
            canalALaCarta = new ArrayList<CanalALaCarta>();
        }
        return this.canalALaCarta;
    }

}
