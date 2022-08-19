
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultactaespecial.types;

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
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resultadodesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RowId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CuentaSKY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RowIdCuentaPadre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CuentaSKYPadre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NombreGrupo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FlagCorporativo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FlagVIP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TipoCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CodigoPais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
         { "resultado", "resultadodesc", "rowId", "cuentaSKY", "rowIdCuentaPadre", "cuentaSKYPadre", "nombreGrupo",
           "flagCorporativo", "flagVIP", "tipoCuenta", "codigoPais"
    })
@XmlRootElement(name = "ConsultaCuentaEspecialProcessResponse")
public class ConsultaCuentaEspecialProcessResponse {

    @XmlElement(required = true)
    protected String resultado;
    @XmlElement(required = true)
    protected String resultadodesc;
    @XmlElement(name = "RowId", required = true)
    protected String rowId;
    @XmlElement(name = "CuentaSKY", required = true)
    protected String cuentaSKY;
    @XmlElement(name = "RowIdCuentaPadre", required = true)
    protected String rowIdCuentaPadre;
    @XmlElement(name = "CuentaSKYPadre", required = true)
    protected String cuentaSKYPadre;
    @XmlElement(name = "NombreGrupo", required = true)
    protected String nombreGrupo;
    @XmlElement(name = "FlagCorporativo", required = true)
    protected String flagCorporativo;
    @XmlElement(name = "FlagVIP", required = true)
    protected String flagVIP;
    @XmlElement(name = "TipoCuenta", required = true)
    protected String tipoCuenta;
    @XmlElement(name = "CodigoPais", required = true)
    protected String codigoPais;

    /**
     * Gets the value of the resultado property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * Sets the value of the resultado property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResultado(String value) {
        this.resultado = value;
    }

    /**
     * Gets the value of the resultadodesc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResultadodesc() {
        return resultadodesc;
    }

    /**
     * Sets the value of the resultadodesc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResultadodesc(String value) {
        this.resultadodesc = value;
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
     * Gets the value of the rowIdCuentaPadre property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRowIdCuentaPadre() {
        return rowIdCuentaPadre;
    }

    /**
     * Sets the value of the rowIdCuentaPadre property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRowIdCuentaPadre(String value) {
        this.rowIdCuentaPadre = value;
    }

    /**
     * Gets the value of the cuentaSKYPadre property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCuentaSKYPadre() {
        return cuentaSKYPadre;
    }

    /**
     * Sets the value of the cuentaSKYPadre property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCuentaSKYPadre(String value) {
        this.cuentaSKYPadre = value;
    }

    /**
     * Gets the value of the nombreGrupo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombreGrupo() {
        return nombreGrupo;
    }

    /**
     * Sets the value of the nombreGrupo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombreGrupo(String value) {
        this.nombreGrupo = value;
    }

    /**
     * Gets the value of the flagCorporativo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFlagCorporativo() {
        return flagCorporativo;
    }

    /**
     * Sets the value of the flagCorporativo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFlagCorporativo(String value) {
        this.flagCorporativo = value;
    }

    /**
     * Gets the value of the flagVIP property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFlagVIP() {
        return flagVIP;
    }

    /**
     * Sets the value of the flagVIP property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFlagVIP(String value) {
        this.flagVIP = value;
    }

    /**
     * Gets the value of the tipoCuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    /**
     * Sets the value of the tipoCuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoCuenta(String value) {
        this.tipoCuenta = value;
    }

    /**
     * Gets the value of the codigoPais property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoPais() {
        return codigoPais;
    }

    /**
     * Sets the value of the codigoPais property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoPais(String value) {
        this.codigoPais = value;
    }

}
