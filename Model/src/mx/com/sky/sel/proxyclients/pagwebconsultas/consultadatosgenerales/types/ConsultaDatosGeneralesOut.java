
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultadatosgenerales.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="respuesta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="respuestadesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RowId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RowIdContacto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BillingCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CuentaSKY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StatusCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Organizacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NombreSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MarketClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MarketType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrganizationType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PromocionActivacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Paquete" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StatusRecarga" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Pais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DiferenciaHoraria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BanderaNoOPPV" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BanderaNoIPPV" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BanderaHD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SKY_MODEM_INTERNET" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SKY_PAQUETE_INTERNET" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NO_TC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NUM_RECARGA_VETV" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RazonSocial" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RFC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",
         propOrder =
         { "respuesta", "respuestadesc", "rowId", "rowIdContacto", "billingCode", "cuentaSKY", "statusCuenta",
           "organizacion", "currencyCode", "nombreSuscriptor", "marketClass", "marketType", "organizationType",
           "promocionActivacion", "paquete", "statusRecarga", "pais", "diferenciaHoraria", "banderaNoOPPV",
           "banderaNoIPPV", "banderaHD", "skymodeminternet", "skypaqueteinternet", "notc", "numrecargavetv",
           "razonSocial", "rfc"
    })
@XmlRootElement(name = "ConsultaDatosGeneralesOut")
public class ConsultaDatosGeneralesOut {

    @XmlElement(required = true)
    protected String respuesta;
    @XmlElement(required = true)
    protected String respuestadesc;
    @XmlElement(name = "RowId", required = true)
    protected String rowId;
    @XmlElement(name = "RowIdContacto", required = true)
    protected String rowIdContacto;
    @XmlElement(name = "BillingCode", required = true)
    protected String billingCode;
    @XmlElement(name = "CuentaSKY", required = true)
    protected String cuentaSKY;
    @XmlElement(name = "StatusCuenta", required = true)
    protected String statusCuenta;
    @XmlElement(name = "Organizacion", required = true)
    protected String organizacion;
    @XmlElement(name = "CurrencyCode", required = true)
    protected String currencyCode;
    @XmlElement(name = "NombreSuscriptor", required = true)
    protected String nombreSuscriptor;
    @XmlElement(name = "MarketClass", required = true)
    protected String marketClass;
    @XmlElement(name = "MarketType", required = true)
    protected String marketType;
    @XmlElement(name = "OrganizationType", required = true)
    protected String organizationType;
    @XmlElement(name = "PromocionActivacion", required = true)
    protected String promocionActivacion;
    @XmlElement(name = "Paquete", required = true)
    protected String paquete;
    @XmlElement(name = "StatusRecarga", required = true)
    protected String statusRecarga;
    @XmlElement(name = "Pais", required = true)
    protected String pais;
    @XmlElement(name = "DiferenciaHoraria", required = true)
    protected String diferenciaHoraria;
    @XmlElement(name = "BanderaNoOPPV", required = true)
    protected String banderaNoOPPV;
    @XmlElement(name = "BanderaNoIPPV", required = true)
    protected String banderaNoIPPV;
    @XmlElement(name = "BanderaHD", required = true)
    protected String banderaHD;
    @XmlElement(name = "SKY_MODEM_INTERNET", required = true)
    protected String skymodeminternet;
    @XmlElement(name = "SKY_PAQUETE_INTERNET", required = true)
    protected String skypaqueteinternet;
    @XmlElement(name = "NO_TC", required = true)
    protected String notc;
    @XmlElement(name = "NUM_RECARGA_VETV", required = true)
    protected String numrecargavetv;
    @XmlElement(name = "RazonSocial", required = true)
    protected String razonSocial;
    @XmlElement(name = "RFC", required = true)
    protected String rfc;

    /**
     * Gets the value of the respuesta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * Sets the value of the respuesta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRespuesta(String value) {
        this.respuesta = value;
    }

    /**
     * Gets the value of the respuestadesc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRespuestadesc() {
        return respuestadesc;
    }

    /**
     * Sets the value of the respuestadesc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRespuestadesc(String value) {
        this.respuestadesc = value;
    }

    /**
     * Gets the value of the rowId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRowId() {
        return rowId;
    }

    /**
     * Sets the value of the rowId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRowId(String value) {
        this.rowId = value;
    }

    /**
     * Gets the value of the rowIdContacto property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRowIdContacto() {
        return rowIdContacto;
    }

    /**
     * Sets the value of the rowIdContacto property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRowIdContacto(String value) {
        this.rowIdContacto = value;
    }

    /**
     * Gets the value of the billingCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBillingCode() {
        return billingCode;
    }

    /**
     * Sets the value of the billingCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBillingCode(String value) {
        this.billingCode = value;
    }

    /**
     * Gets the value of the cuentaSKY property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCuentaSKY() {
        return cuentaSKY;
    }

    /**
     * Sets the value of the cuentaSKY property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCuentaSKY(String value) {
        this.cuentaSKY = value;
    }

    /**
     * Gets the value of the statusCuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatusCuenta() {
        return statusCuenta;
    }

    /**
     * Sets the value of the statusCuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatusCuenta(String value) {
        this.statusCuenta = value;
    }

    /**
     * Gets the value of the organizacion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrganizacion() {
        return organizacion;
    }

    /**
     * Sets the value of the organizacion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrganizacion(String value) {
        this.organizacion = value;
    }

    /**
     * Gets the value of the currencyCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the nombreSuscriptor property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombreSuscriptor() {
        return nombreSuscriptor;
    }

    /**
     * Sets the value of the nombreSuscriptor property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombreSuscriptor(String value) {
        this.nombreSuscriptor = value;
    }

    /**
     * Gets the value of the marketClass property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMarketClass() {
        return marketClass;
    }

    /**
     * Sets the value of the marketClass property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMarketClass(String value) {
        this.marketClass = value;
    }

    /**
     * Gets the value of the marketType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMarketType() {
        return marketType;
    }

    /**
     * Sets the value of the marketType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMarketType(String value) {
        this.marketType = value;
    }

    /**
     * Gets the value of the organizationType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrganizationType() {
        return organizationType;
    }

    /**
     * Sets the value of the organizationType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrganizationType(String value) {
        this.organizationType = value;
    }

    /**
     * Gets the value of the promocionActivacion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPromocionActivacion() {
        return promocionActivacion;
    }

    /**
     * Sets the value of the promocionActivacion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPromocionActivacion(String value) {
        this.promocionActivacion = value;
    }

    /**
     * Gets the value of the paquete property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaquete() {
        return paquete;
    }

    /**
     * Sets the value of the paquete property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaquete(String value) {
        this.paquete = value;
    }

    /**
     * Gets the value of the statusRecarga property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatusRecarga() {
        return statusRecarga;
    }

    /**
     * Sets the value of the statusRecarga property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatusRecarga(String value) {
        this.statusRecarga = value;
    }

    /**
     * Gets the value of the pais property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPais() {
        return pais;
    }

    /**
     * Sets the value of the pais property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Gets the value of the diferenciaHoraria property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDiferenciaHoraria() {
        return diferenciaHoraria;
    }

    /**
     * Sets the value of the diferenciaHoraria property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDiferenciaHoraria(String value) {
        this.diferenciaHoraria = value;
    }

    /**
     * Gets the value of the banderaNoOPPV property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBanderaNoOPPV() {
        return banderaNoOPPV;
    }

    /**
     * Sets the value of the banderaNoOPPV property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBanderaNoOPPV(String value) {
        this.banderaNoOPPV = value;
    }

    /**
     * Gets the value of the banderaNoIPPV property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBanderaNoIPPV() {
        return banderaNoIPPV;
    }

    /**
     * Sets the value of the banderaNoIPPV property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBanderaNoIPPV(String value) {
        this.banderaNoIPPV = value;
    }

    /**
     * Gets the value of the banderaHD property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBanderaHD() {
        return banderaHD;
    }

    /**
     * Sets the value of the banderaHD property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBanderaHD(String value) {
        this.banderaHD = value;
    }

    /**
     * Gets the value of the skymodeminternet property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSKYMODEMINTERNET() {
        return skymodeminternet;
    }

    /**
     * Sets the value of the skymodeminternet property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSKYMODEMINTERNET(String value) {
        this.skymodeminternet = value;
    }

    /**
     * Gets the value of the skypaqueteinternet property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSKYPAQUETEINTERNET() {
        return skypaqueteinternet;
    }

    /**
     * Sets the value of the skypaqueteinternet property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSKYPAQUETEINTERNET(String value) {
        this.skypaqueteinternet = value;
    }

    /**
     * Gets the value of the notc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNOTC() {
        return notc;
    }

    /**
     * Sets the value of the notc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNOTC(String value) {
        this.notc = value;
    }

    /**
     * Gets the value of the numrecargavetv property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNUMRECARGAVETV() {
        return numrecargavetv;
    }

    /**
     * Sets the value of the numrecargavetv property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNUMRECARGAVETV(String value) {
        this.numrecargavetv = value;
    }

    /**
     * Gets the value of the razonSocial property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Sets the value of the razonSocial property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRazonSocial(String value) {
        this.razonSocial = value;
    }

    /**
     * Gets the value of the rfc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRFC() {
        return rfc;
    }

    /**
     * Sets the value of the rfc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRFC(String value) {
        this.rfc = value;
    }

}
