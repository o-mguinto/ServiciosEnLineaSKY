
package mx.com.sky.sel.proxyclients.edicom.obtenerfactura;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conceptoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conceptoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUMLIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valorUnitario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="importe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IEPS" type="{http://factura.edicom.factura.sky.com.mx}IEPSType" minOccurs="0"/>
 *         &lt;element name="IVA" type="{http://factura.edicom.factura.sky.com.mx}IVAType" minOccurs="0"/>
 *         &lt;element name="Descuento" type="{http://factura.edicom.factura.sky.com.mx}DescuentoType" minOccurs="0"/>
 *         &lt;element name="descripcionConcepto" type="{http://factura.edicom.factura.sky.com.mx}descripConceptoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="predial" type="{http://factura.edicom.factura.sky.com.mx}predialType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conceptoType", propOrder = {
    "numlin",
    "cantidad",
    "unidad",
    "noIdentificacion",
    "descripcion",
    "valorUnitario",
    "importe",
    "ieps",
    "iva",
    "descuento",
    "descripcionConcepto",
    "predial"
})
public class ConceptoType {

    @XmlElement(name = "NUMLIN", required = true)
    protected String numlin;
    @XmlElement(required = true)
    protected String cantidad;
    protected String unidad;
    protected String noIdentificacion;
    @XmlElement(required = true)
    protected String descripcion;
    @XmlElement(required = true)
    protected String valorUnitario;
    @XmlElement(required = true)
    protected String importe;
    @XmlElement(name = "IEPS")
    protected IEPSType ieps;
    @XmlElement(name = "IVA")
    protected IVAType iva;
    @XmlElement(name = "Descuento")
    protected DescuentoType descuento;
    protected List<DescripConceptoType> descripcionConcepto;
    protected List<PredialType> predial;

    /**
     * Gets the value of the numlin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMLIN() {
        return numlin;
    }

    /**
     * Sets the value of the numlin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMLIN(String value) {
        this.numlin = value;
    }

    /**
     * Gets the value of the cantidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * Sets the value of the cantidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidad(String value) {
        this.cantidad = value;
    }

    /**
     * Gets the value of the unidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidad() {
        return unidad;
    }

    /**
     * Sets the value of the unidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidad(String value) {
        this.unidad = value;
    }

    /**
     * Gets the value of the noIdentificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoIdentificacion() {
        return noIdentificacion;
    }

    /**
     * Sets the value of the noIdentificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoIdentificacion(String value) {
        this.noIdentificacion = value;
    }

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the valorUnitario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorUnitario() {
        return valorUnitario;
    }

    /**
     * Sets the value of the valorUnitario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorUnitario(String value) {
        this.valorUnitario = value;
    }

    /**
     * Gets the value of the importe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporte() {
        return importe;
    }

    /**
     * Sets the value of the importe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporte(String value) {
        this.importe = value;
    }

    /**
     * Gets the value of the ieps property.
     * 
     * @return
     *     possible object is
     *     {@link IEPSType }
     *     
     */
    public IEPSType getIEPS() {
        return ieps;
    }

    /**
     * Sets the value of the ieps property.
     * 
     * @param value
     *     allowed object is
     *     {@link IEPSType }
     *     
     */
    public void setIEPS(IEPSType value) {
        this.ieps = value;
    }

    /**
     * Gets the value of the iva property.
     * 
     * @return
     *     possible object is
     *     {@link IVAType }
     *     
     */
    public IVAType getIVA() {
        return iva;
    }

    /**
     * Sets the value of the iva property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVAType }
     *     
     */
    public void setIVA(IVAType value) {
        this.iva = value;
    }

    /**
     * Gets the value of the descuento property.
     * 
     * @return
     *     possible object is
     *     {@link DescuentoType }
     *     
     */
    public DescuentoType getDescuento() {
        return descuento;
    }

    /**
     * Sets the value of the descuento property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescuentoType }
     *     
     */
    public void setDescuento(DescuentoType value) {
        this.descuento = value;
    }

    /**
     * Gets the value of the descripcionConcepto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descripcionConcepto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescripcionConcepto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescripConceptoType }
     * 
     * 
     */
    public List<DescripConceptoType> getDescripcionConcepto() {
        if (descripcionConcepto == null) {
            descripcionConcepto = new ArrayList<DescripConceptoType>();
        }
        return this.descripcionConcepto;
    }

    /**
     * Gets the value of the predial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PredialType }
     * 
     * 
     */
    public List<PredialType> getPredial() {
        if (predial == null) {
            predial = new ArrayList<PredialType>();
        }
        return this.predial;
    }

}
