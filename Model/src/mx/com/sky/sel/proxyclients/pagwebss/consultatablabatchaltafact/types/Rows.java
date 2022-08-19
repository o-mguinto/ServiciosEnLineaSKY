
package mx.com.sky.sel.proxyclients.pagwebss.consultatablabatchaltafact.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Rows complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Rows"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Solicitud" type="{http://xmlns.oracle.com/ConsultaTablaBatchSSAltaFacturacion}Row" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rows", propOrder = { "solicitud" })
public class Rows {

    @XmlElement(name = "Solicitud")
    protected List<Row> solicitud;

    /**
     * Gets the value of the solicitud property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the solicitud property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSolicitud().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Row }
     *
     *
     */
    public List<Row> getSolicitud() {
        if (solicitud == null) {
            solicitud = new ArrayList<Row>();
        }
        return this.solicitud;
    }

}
