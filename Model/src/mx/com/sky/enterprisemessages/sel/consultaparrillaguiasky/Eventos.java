
package mx.com.sky.enterprisemessages.sel.consultaparrillaguiasky;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Eventos complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Eventos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Evento" type="{http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky}Evento" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Eventos", propOrder = { "evento" })
public class Eventos {

    @XmlElement(name = "Evento")
    protected List<Evento> evento;

    /**
     * Gets the value of the evento property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evento property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvento().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Evento }
     *
     *
     */
    public List<Evento> getEvento() {
        if (evento == null) {
            evento = new ArrayList<Evento>();
        }
        return this.evento;
    }

}
