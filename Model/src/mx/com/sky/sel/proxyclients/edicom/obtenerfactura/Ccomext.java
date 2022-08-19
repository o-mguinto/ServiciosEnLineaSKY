
package mx.com.sky.sel.proxyclients.edicom.obtenerfactura;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ccomext complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ccomext">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipooperac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claveped" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certorigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numcertorigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numexportador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incoterm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subdivision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tcusd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalusd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="curp_e" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="curp_r" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numregid_r" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numregid_d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rfc_d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="curp_d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre_d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calle_d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numext_d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numint_d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colonia_d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localidad_d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referencia_d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delmun_d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado_d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pais_d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cp_d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motiv_tras" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numregid_p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resfiscal_p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cmerc" type="{http://factura.edicom.factura.sky.com.mx}cmerc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ccepropaux" type="{http://factura.edicom.factura.sky.com.mx}ccepropaux" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ccedestaux" type="{http://factura.edicom.factura.sky.com.mx}ccedestaux" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ccomext", propOrder = {
    "id",
    "tipooperac",
    "claveped",
    "certorigen",
    "numcertorigen",
    "numexportador",
    "incoterm",
    "subdivision",
    "observaciones",
    "tcusd",
    "totalusd",
    "curpE",
    "curpR",
    "numregidR",
    "numregidD",
    "rfcD",
    "curpD",
    "nombreD",
    "calleD",
    "numextD",
    "numintD",
    "coloniaD",
    "localidadD",
    "referenciaD",
    "delmunD",
    "estadoD",
    "paisD",
    "cpD",
    "version",
    "motivTras",
    "numregidP",
    "resfiscalP",
    "cmerc",
    "ccepropaux",
    "ccedestaux"
})
public class Ccomext {

    protected String id;
    protected String tipooperac;
    protected String claveped;
    protected String certorigen;
    protected String numcertorigen;
    protected String numexportador;
    protected String incoterm;
    protected String subdivision;
    protected String observaciones;
    protected String tcusd;
    protected String totalusd;
    @XmlElement(name = "curp_e")
    protected String curpE;
    @XmlElement(name = "curp_r")
    protected String curpR;
    @XmlElement(name = "numregid_r")
    protected String numregidR;
    @XmlElement(name = "numregid_d")
    protected String numregidD;
    @XmlElement(name = "rfc_d")
    protected String rfcD;
    @XmlElement(name = "curp_d")
    protected String curpD;
    @XmlElement(name = "nombre_d")
    protected String nombreD;
    @XmlElement(name = "calle_d")
    protected String calleD;
    @XmlElement(name = "numext_d")
    protected String numextD;
    @XmlElement(name = "numint_d")
    protected String numintD;
    @XmlElement(name = "colonia_d")
    protected String coloniaD;
    @XmlElement(name = "localidad_d")
    protected String localidadD;
    @XmlElement(name = "referencia_d")
    protected String referenciaD;
    @XmlElement(name = "delmun_d")
    protected String delmunD;
    @XmlElement(name = "estado_d")
    protected String estadoD;
    @XmlElement(name = "pais_d")
    protected String paisD;
    @XmlElement(name = "cp_d")
    protected String cpD;
    protected String version;
    @XmlElement(name = "motiv_tras")
    protected String motivTras;
    @XmlElement(name = "numregid_p")
    protected String numregidP;
    @XmlElement(name = "resfiscal_p")
    protected String resfiscalP;
    protected List<Cmerc> cmerc;
    protected List<Ccepropaux> ccepropaux;
    protected List<Ccedestaux> ccedestaux;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the tipooperac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipooperac() {
        return tipooperac;
    }

    /**
     * Sets the value of the tipooperac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipooperac(String value) {
        this.tipooperac = value;
    }

    /**
     * Gets the value of the claveped property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveped() {
        return claveped;
    }

    /**
     * Sets the value of the claveped property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveped(String value) {
        this.claveped = value;
    }

    /**
     * Gets the value of the certorigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertorigen() {
        return certorigen;
    }

    /**
     * Sets the value of the certorigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertorigen(String value) {
        this.certorigen = value;
    }

    /**
     * Gets the value of the numcertorigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumcertorigen() {
        return numcertorigen;
    }

    /**
     * Sets the value of the numcertorigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumcertorigen(String value) {
        this.numcertorigen = value;
    }

    /**
     * Gets the value of the numexportador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumexportador() {
        return numexportador;
    }

    /**
     * Sets the value of the numexportador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumexportador(String value) {
        this.numexportador = value;
    }

    /**
     * Gets the value of the incoterm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncoterm() {
        return incoterm;
    }

    /**
     * Sets the value of the incoterm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncoterm(String value) {
        this.incoterm = value;
    }

    /**
     * Gets the value of the subdivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubdivision() {
        return subdivision;
    }

    /**
     * Sets the value of the subdivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubdivision(String value) {
        this.subdivision = value;
    }

    /**
     * Gets the value of the observaciones property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Sets the value of the observaciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservaciones(String value) {
        this.observaciones = value;
    }

    /**
     * Gets the value of the tcusd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcusd() {
        return tcusd;
    }

    /**
     * Sets the value of the tcusd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcusd(String value) {
        this.tcusd = value;
    }

    /**
     * Gets the value of the totalusd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalusd() {
        return totalusd;
    }

    /**
     * Sets the value of the totalusd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalusd(String value) {
        this.totalusd = value;
    }

    /**
     * Gets the value of the curpE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurpE() {
        return curpE;
    }

    /**
     * Sets the value of the curpE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurpE(String value) {
        this.curpE = value;
    }

    /**
     * Gets the value of the curpR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurpR() {
        return curpR;
    }

    /**
     * Sets the value of the curpR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurpR(String value) {
        this.curpR = value;
    }

    /**
     * Gets the value of the numregidR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumregidR() {
        return numregidR;
    }

    /**
     * Sets the value of the numregidR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumregidR(String value) {
        this.numregidR = value;
    }

    /**
     * Gets the value of the numregidD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumregidD() {
        return numregidD;
    }

    /**
     * Sets the value of the numregidD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumregidD(String value) {
        this.numregidD = value;
    }

    /**
     * Gets the value of the rfcD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcD() {
        return rfcD;
    }

    /**
     * Sets the value of the rfcD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcD(String value) {
        this.rfcD = value;
    }

    /**
     * Gets the value of the curpD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurpD() {
        return curpD;
    }

    /**
     * Sets the value of the curpD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurpD(String value) {
        this.curpD = value;
    }

    /**
     * Gets the value of the nombreD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreD() {
        return nombreD;
    }

    /**
     * Sets the value of the nombreD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreD(String value) {
        this.nombreD = value;
    }

    /**
     * Gets the value of the calleD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalleD() {
        return calleD;
    }

    /**
     * Sets the value of the calleD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalleD(String value) {
        this.calleD = value;
    }

    /**
     * Gets the value of the numextD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumextD() {
        return numextD;
    }

    /**
     * Sets the value of the numextD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumextD(String value) {
        this.numextD = value;
    }

    /**
     * Gets the value of the numintD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumintD() {
        return numintD;
    }

    /**
     * Sets the value of the numintD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumintD(String value) {
        this.numintD = value;
    }

    /**
     * Gets the value of the coloniaD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColoniaD() {
        return coloniaD;
    }

    /**
     * Sets the value of the coloniaD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColoniaD(String value) {
        this.coloniaD = value;
    }

    /**
     * Gets the value of the localidadD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalidadD() {
        return localidadD;
    }

    /**
     * Sets the value of the localidadD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalidadD(String value) {
        this.localidadD = value;
    }

    /**
     * Gets the value of the referenciaD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaD() {
        return referenciaD;
    }

    /**
     * Sets the value of the referenciaD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaD(String value) {
        this.referenciaD = value;
    }

    /**
     * Gets the value of the delmunD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelmunD() {
        return delmunD;
    }

    /**
     * Sets the value of the delmunD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelmunD(String value) {
        this.delmunD = value;
    }

    /**
     * Gets the value of the estadoD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoD() {
        return estadoD;
    }

    /**
     * Sets the value of the estadoD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoD(String value) {
        this.estadoD = value;
    }

    /**
     * Gets the value of the paisD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisD() {
        return paisD;
    }

    /**
     * Sets the value of the paisD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisD(String value) {
        this.paisD = value;
    }

    /**
     * Gets the value of the cpD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpD() {
        return cpD;
    }

    /**
     * Sets the value of the cpD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpD(String value) {
        this.cpD = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the motivTras property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivTras() {
        return motivTras;
    }

    /**
     * Sets the value of the motivTras property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivTras(String value) {
        this.motivTras = value;
    }

    /**
     * Gets the value of the numregidP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumregidP() {
        return numregidP;
    }

    /**
     * Sets the value of the numregidP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumregidP(String value) {
        this.numregidP = value;
    }

    /**
     * Gets the value of the resfiscalP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResfiscalP() {
        return resfiscalP;
    }

    /**
     * Sets the value of the resfiscalP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResfiscalP(String value) {
        this.resfiscalP = value;
    }

    /**
     * Gets the value of the cmerc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cmerc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmerc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cmerc }
     * 
     * 
     */
    public List<Cmerc> getCmerc() {
        if (cmerc == null) {
            cmerc = new ArrayList<Cmerc>();
        }
        return this.cmerc;
    }

    /**
     * Gets the value of the ccepropaux property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccepropaux property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcepropaux().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ccepropaux }
     * 
     * 
     */
    public List<Ccepropaux> getCcepropaux() {
        if (ccepropaux == null) {
            ccepropaux = new ArrayList<Ccepropaux>();
        }
        return this.ccepropaux;
    }

    /**
     * Gets the value of the ccedestaux property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccedestaux property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcedestaux().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ccedestaux }
     * 
     * 
     */
    public List<Ccedestaux> getCcedestaux() {
        if (ccedestaux == null) {
            ccedestaux = new ArrayList<Ccedestaux>();
        }
        return this.ccedestaux;
    }

}
