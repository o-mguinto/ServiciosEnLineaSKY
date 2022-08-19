
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultacrdirecciones.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DireccionCollection complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DireccionCollection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Direccion" type="{http://xmlns.oracle.com/ConsultaControlRemotoDirecciones}Direccion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DireccionCollection", propOrder = { "direccion" })
public class DireccionCollection {

    @XmlElement(name = "Direccion")
    protected List<Direccion> direccion;

    /**
     * Gets the value of the direccion property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the direccion property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDireccion().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Direccion }
     *
     *
     */
    public List<Direccion> getDireccion() {
        if (direccion == null) {
            direccion = new ArrayList<Direccion>();
        }
        return this.direccion;
    }

}
