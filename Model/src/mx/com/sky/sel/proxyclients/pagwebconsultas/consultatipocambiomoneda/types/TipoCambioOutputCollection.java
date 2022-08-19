
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultatipocambiomoneda.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoCambioOutputCollection complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TipoCambioOutputCollection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoCambioOutput" type="{http://xmlns.oracle.com/SKYConsultas/ConsultaTipoCambio/ConsultaTipoCambioMoneda}TipoCambioOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoCambioOutputCollection", propOrder = { "tipoCambioOutput" })
public class TipoCambioOutputCollection {

    @XmlElement(name = "TipoCambioOutput")
    protected List<TipoCambioOutput> tipoCambioOutput;

    /**
     * Gets the value of the tipoCambioOutput property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipoCambioOutput property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipoCambioOutput().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoCambioOutput }
     *
     *
     */
    public List<TipoCambioOutput> getTipoCambioOutput() {
        if (tipoCambioOutput == null) {
            tipoCambioOutput = new ArrayList<TipoCambioOutput>();
        }
        return this.tipoCambioOutput;
    }

}
