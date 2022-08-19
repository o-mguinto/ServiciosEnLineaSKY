
package mx.com.sky.sel.proxyclients.edicom.obtenerfactura;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for facturaEdicomInType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="facturaEdicomInType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NoFacturaSap" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FechaC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentoSap" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SERIE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FOLIO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ACLARACIONFACT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NREMISION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formaDePago" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="condicionesDePago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subTotal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IEPS" type="{http://factura.edicom.factura.sky.com.mx}IEPSType" minOccurs="0"/>
 *         &lt;element name="descuento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motivoDescuento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoCambio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoDeComprobante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="metodoDePago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lugarExpedicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NUMCTAPAGO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emisor" type="{http://factura.edicom.factura.sky.com.mx}datosType"/>
 *         &lt;element name="receptor" type="{http://factura.edicom.factura.sky.com.mx}datosType"/>
 *         &lt;element name="regimen" type="{http://factura.edicom.factura.sky.com.mx}regimenType"/>
 *         &lt;element name="conceptos" type="{http://factura.edicom.factura.sky.com.mx}conceptoType" maxOccurs="unbounded"/>
 *         &lt;element name="impuestos" type="{http://factura.edicom.factura.sky.com.mx}impuestosType"/>
 *         &lt;element name="Email" type="{http://factura.edicom.factura.sky.com.mx}EmailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NUMACREEDOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adulfac" type="{http://factura.edicom.factura.sky.com.mx}adulfac" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cine" type="{http://factura.edicom.factura.sky.com.mx}cine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="centidad" type="{http://factura.edicom.factura.sky.com.mx}centidad" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cconta" type="{http://factura.edicom.factura.sky.com.mx}cconta" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ccomext" type="{http://factura.edicom.factura.sky.com.mx}ccomext" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "facturaEdicomInType", propOrder = {
    "noFacturaSap",
    "fechaC",
    "documentoSap",
    "serie",
    "folio",
    "aclaracionfact",
    "nremision",
    "formaDePago",
    "condicionesDePago",
    "subTotal",
    "ieps",
    "descuento",
    "motivoDescuento",
    "tipoCambio",
    "moneda",
    "total",
    "tipoDeComprobante",
    "metodoDePago",
    "lugarExpedicion",
    "numctapago",
    "emisor",
    "receptor",
    "regimen",
    "conceptos",
    "impuestos",
    "email",
    "numacreedor",
    "adulfac",
    "cine",
    "centidad",
    "cconta",
    "ccomext"
})
public class FacturaEdicomInType {

    @XmlElement(name = "NoFacturaSap", required = true)
    protected String noFacturaSap;
    @XmlElement(name = "FechaC", required = true)
    protected String fechaC;
    @XmlElement(name = "DocumentoSap", required = true)
    protected String documentoSap;
    @XmlElement(name = "SERIE")
    protected String serie;
    @XmlElement(name = "FOLIO", required = true)
    protected String folio;
    @XmlElement(name = "ACLARACIONFACT")
    protected String aclaracionfact;
    @XmlElement(name = "NREMISION")
    protected String nremision;
    @XmlElement(required = true)
    protected String formaDePago;
    protected String condicionesDePago;
    @XmlElement(required = true)
    protected String subTotal;
    @XmlElement(name = "IEPS")
    protected IEPSType ieps;
    protected String descuento;
    protected String motivoDescuento;
    protected String tipoCambio;
    protected String moneda;
    @XmlElement(required = true)
    protected String total;
    @XmlElement(required = true)
    protected String tipoDeComprobante;
    protected String metodoDePago;
    protected String lugarExpedicion;
    @XmlElement(name = "NUMCTAPAGO")
    protected String numctapago;
    @XmlElement(required = true)
    protected DatosType emisor;
    @XmlElement(required = true)
    protected DatosType receptor;
    @XmlElement(required = true)
    protected RegimenType regimen;
    @XmlElement(required = true)
    protected List<ConceptoType> conceptos;
    @XmlElement(required = true)
    protected ImpuestosType impuestos;
    @XmlElement(name = "Email")
    protected List<EmailType> email;
    @XmlElement(name = "NUMACREEDOR")
    protected String numacreedor;
    protected List<Adulfac> adulfac;
    protected List<Cine> cine;
    protected List<Centidad> centidad;
    protected List<Cconta> cconta;
    protected List<Ccomext> ccomext;

    /**
     * Gets the value of the noFacturaSap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoFacturaSap() {
        return noFacturaSap;
    }

    /**
     * Sets the value of the noFacturaSap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoFacturaSap(String value) {
        this.noFacturaSap = value;
    }

    /**
     * Gets the value of the fechaC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaC() {
        return fechaC;
    }

    /**
     * Sets the value of the fechaC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaC(String value) {
        this.fechaC = value;
    }

    /**
     * Gets the value of the documentoSap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentoSap() {
        return documentoSap;
    }

    /**
     * Sets the value of the documentoSap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentoSap(String value) {
        this.documentoSap = value;
    }

    /**
     * Gets the value of the serie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERIE() {
        return serie;
    }

    /**
     * Sets the value of the serie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERIE(String value) {
        this.serie = value;
    }

    /**
     * Gets the value of the folio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOLIO() {
        return folio;
    }

    /**
     * Sets the value of the folio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOLIO(String value) {
        this.folio = value;
    }

    /**
     * Gets the value of the aclaracionfact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACLARACIONFACT() {
        return aclaracionfact;
    }

    /**
     * Sets the value of the aclaracionfact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACLARACIONFACT(String value) {
        this.aclaracionfact = value;
    }

    /**
     * Gets the value of the nremision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNREMISION() {
        return nremision;
    }

    /**
     * Sets the value of the nremision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNREMISION(String value) {
        this.nremision = value;
    }

    /**
     * Gets the value of the formaDePago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaDePago() {
        return formaDePago;
    }

    /**
     * Sets the value of the formaDePago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaDePago(String value) {
        this.formaDePago = value;
    }

    /**
     * Gets the value of the condicionesDePago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondicionesDePago() {
        return condicionesDePago;
    }

    /**
     * Sets the value of the condicionesDePago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondicionesDePago(String value) {
        this.condicionesDePago = value;
    }

    /**
     * Gets the value of the subTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTotal() {
        return subTotal;
    }

    /**
     * Sets the value of the subTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTotal(String value) {
        this.subTotal = value;
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
     * Gets the value of the descuento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescuento() {
        return descuento;
    }

    /**
     * Sets the value of the descuento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescuento(String value) {
        this.descuento = value;
    }

    /**
     * Gets the value of the motivoDescuento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoDescuento() {
        return motivoDescuento;
    }

    /**
     * Sets the value of the motivoDescuento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoDescuento(String value) {
        this.motivoDescuento = value;
    }

    /**
     * Gets the value of the tipoCambio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCambio() {
        return tipoCambio;
    }

    /**
     * Sets the value of the tipoCambio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCambio(String value) {
        this.tipoCambio = value;
    }

    /**
     * Gets the value of the moneda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * Sets the value of the moneda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneda(String value) {
        this.moneda = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotal(String value) {
        this.total = value;
    }

    /**
     * Gets the value of the tipoDeComprobante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeComprobante() {
        return tipoDeComprobante;
    }

    /**
     * Sets the value of the tipoDeComprobante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeComprobante(String value) {
        this.tipoDeComprobante = value;
    }

    /**
     * Gets the value of the metodoDePago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetodoDePago() {
        return metodoDePago;
    }

    /**
     * Sets the value of the metodoDePago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetodoDePago(String value) {
        this.metodoDePago = value;
    }

    /**
     * Gets the value of the lugarExpedicion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarExpedicion() {
        return lugarExpedicion;
    }

    /**
     * Sets the value of the lugarExpedicion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarExpedicion(String value) {
        this.lugarExpedicion = value;
    }

    /**
     * Gets the value of the numctapago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMCTAPAGO() {
        return numctapago;
    }

    /**
     * Sets the value of the numctapago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMCTAPAGO(String value) {
        this.numctapago = value;
    }

    /**
     * Gets the value of the emisor property.
     * 
     * @return
     *     possible object is
     *     {@link DatosType }
     *     
     */
    public DatosType getEmisor() {
        return emisor;
    }

    /**
     * Sets the value of the emisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosType }
     *     
     */
    public void setEmisor(DatosType value) {
        this.emisor = value;
    }

    /**
     * Gets the value of the receptor property.
     * 
     * @return
     *     possible object is
     *     {@link DatosType }
     *     
     */
    public DatosType getReceptor() {
        return receptor;
    }

    /**
     * Sets the value of the receptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosType }
     *     
     */
    public void setReceptor(DatosType value) {
        this.receptor = value;
    }

    /**
     * Gets the value of the regimen property.
     * 
     * @return
     *     possible object is
     *     {@link RegimenType }
     *     
     */
    public RegimenType getRegimen() {
        return regimen;
    }

    /**
     * Sets the value of the regimen property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegimenType }
     *     
     */
    public void setRegimen(RegimenType value) {
        this.regimen = value;
    }

    /**
     * Gets the value of the conceptos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conceptos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConceptos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConceptoType }
     * 
     * 
     */
    public List<ConceptoType> getConceptos() {
        if (conceptos == null) {
            conceptos = new ArrayList<ConceptoType>();
        }
        return this.conceptos;
    }

    /**
     * Gets the value of the impuestos property.
     * 
     * @return
     *     possible object is
     *     {@link ImpuestosType }
     *     
     */
    public ImpuestosType getImpuestos() {
        return impuestos;
    }

    /**
     * Sets the value of the impuestos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpuestosType }
     *     
     */
    public void setImpuestos(ImpuestosType value) {
        this.impuestos = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailType }
     * 
     * 
     */
    public List<EmailType> getEmail() {
        if (email == null) {
            email = new ArrayList<EmailType>();
        }
        return this.email;
    }

    /**
     * Gets the value of the numacreedor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMACREEDOR() {
        return numacreedor;
    }

    /**
     * Sets the value of the numacreedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMACREEDOR(String value) {
        this.numacreedor = value;
    }

    /**
     * Gets the value of the adulfac property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adulfac property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdulfac().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Adulfac }
     * 
     * 
     */
    public List<Adulfac> getAdulfac() {
        if (adulfac == null) {
            adulfac = new ArrayList<Adulfac>();
        }
        return this.adulfac;
    }

    /**
     * Gets the value of the cine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cine }
     * 
     * 
     */
    public List<Cine> getCine() {
        if (cine == null) {
            cine = new ArrayList<Cine>();
        }
        return this.cine;
    }

    /**
     * Gets the value of the centidad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the centidad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCentidad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Centidad }
     * 
     * 
     */
    public List<Centidad> getCentidad() {
        if (centidad == null) {
            centidad = new ArrayList<Centidad>();
        }
        return this.centidad;
    }

    /**
     * Gets the value of the cconta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cconta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCconta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cconta }
     * 
     * 
     */
    public List<Cconta> getCconta() {
        if (cconta == null) {
            cconta = new ArrayList<Cconta>();
        }
        return this.cconta;
    }

    /**
     * Gets the value of the ccomext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccomext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcomext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ccomext }
     * 
     * 
     */
    public List<Ccomext> getCcomext() {
        if (ccomext == null) {
            ccomext = new ArrayList<Ccomext>();
        }
        return this.ccomext;
    }

}
