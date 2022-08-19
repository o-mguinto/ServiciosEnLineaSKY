
package mx.com.sky.sel.proxyclients.edicom.obtenerfactura;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for impuestosType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="impuestosType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalImpuestosTrasladados" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalImpuestosRetenidos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retenciones" type="{http://factura.edicom.factura.sky.com.mx}retencionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="trasladados" type="{http://factura.edicom.factura.sky.com.mx}trasladadoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "impuestosType", propOrder = {
    "totalImpuestosTrasladados",
    "totalImpuestosRetenidos",
    "retenciones",
    "trasladados"
})
public class ImpuestosType {

    protected String totalImpuestosTrasladados;
    protected String totalImpuestosRetenidos;
    protected List<RetencionType> retenciones;
    protected List<TrasladadoType> trasladados;

    /**
     * Gets the value of the totalImpuestosTrasladados property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalImpuestosTrasladados() {
        return totalImpuestosTrasladados;
    }

    /**
     * Sets the value of the totalImpuestosTrasladados property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalImpuestosTrasladados(String value) {
        this.totalImpuestosTrasladados = value;
    }

    /**
     * Gets the value of the totalImpuestosRetenidos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalImpuestosRetenidos() {
        return totalImpuestosRetenidos;
    }

    /**
     * Sets the value of the totalImpuestosRetenidos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalImpuestosRetenidos(String value) {
        this.totalImpuestosRetenidos = value;
    }

    /**
     * Gets the value of the retenciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retenciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetenciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetencionType }
     * 
     * 
     */
    public List<RetencionType> getRetenciones() {
        if (retenciones == null) {
            retenciones = new ArrayList<RetencionType>();
        }
        return this.retenciones;
    }

    /**
     * Gets the value of the trasladados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trasladados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrasladados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrasladadoType }
     * 
     * 
     */
    public List<TrasladadoType> getTrasladados() {
        if (trasladados == null) {
            trasladados = new ArrayList<TrasladadoType>();
        }
        return this.trasladados;
    }

}
