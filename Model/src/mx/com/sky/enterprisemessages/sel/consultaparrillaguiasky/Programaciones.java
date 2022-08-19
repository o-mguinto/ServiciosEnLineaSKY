
package mx.com.sky.enterprisemessages.sel.consultaparrillaguiasky;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Programaciones complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Programaciones"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element name="Programacion" type="{http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky}Programacion"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Programaciones", propOrder = { "programacion" })
public class Programaciones {

    @XmlElement(name = "Programacion", required = true)
    protected List<Programacion> programacion;

    /**
     * Gets the value of the programacion property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the programacion property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgramacion().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Programacion }
     *
     *
     */
    public List<Programacion> getProgramacion() {
        if (programacion == null) {
            programacion = new ArrayList<Programacion>();
        }
        return this.programacion;
    }

}
