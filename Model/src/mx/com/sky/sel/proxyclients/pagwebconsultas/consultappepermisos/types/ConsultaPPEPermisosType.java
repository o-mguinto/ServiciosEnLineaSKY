
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultappepermisos.types;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultaPPEPermisosType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultaPPEPermisosType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PAQUETE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CANAL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TIPO_PPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ID_PAIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ORG_ID_SIEBEL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CODIGO_ISO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaPPEPermisosType",
         propOrder = { "id", "paquete", "canal", "tipoppe", "idpais", "nombre", "orgidsiebel", "codigoiso"
    })
public class ConsultaPPEPermisosType {

    @XmlElement(name = "ID", required = true)
    protected BigDecimal id;
    @XmlElement(name = "PAQUETE", required = true)
    protected String paquete;
    @XmlElement(name = "CANAL", required = true)
    protected String canal;
    @XmlElement(name = "TIPO_PPE", required = true)
    protected String tipoppe;
    @XmlElement(name = "ID_PAIS", required = true)
    protected BigDecimal idpais;
    @XmlElement(name = "NOMBRE", required = true)
    protected String nombre;
    @XmlElement(name = "ORG_ID_SIEBEL", required = true)
    protected String orgidsiebel;
    @XmlElement(name = "CODIGO_ISO", required = true)
    protected String codigoiso;

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setID(BigDecimal value) {
        this.id = value;
    }

    /**
     * Gets the value of the paquete property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPAQUETE() {
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
    public void setPAQUETE(String value) {
        this.paquete = value;
    }

    /**
     * Gets the value of the canal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCANAL() {
        return canal;
    }

    /**
     * Sets the value of the canal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCANAL(String value) {
        this.canal = value;
    }

    /**
     * Gets the value of the tipoppe property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTIPOPPE() {
        return tipoppe;
    }

    /**
     * Sets the value of the tipoppe property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTIPOPPE(String value) {
        this.tipoppe = value;
    }

    /**
     * Gets the value of the idpais property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getIDPAIS() {
        return idpais;
    }

    /**
     * Sets the value of the idpais property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setIDPAIS(BigDecimal value) {
        this.idpais = value;
    }

    /**
     * Gets the value of the nombre property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNOMBRE() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNOMBRE(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the orgidsiebel property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getORGIDSIEBEL() {
        return orgidsiebel;
    }

    /**
     * Sets the value of the orgidsiebel property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setORGIDSIEBEL(String value) {
        this.orgidsiebel = value;
    }

    /**
     * Gets the value of the codigoiso property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCODIGOISO() {
        return codigoiso;
    }

    /**
     * Sets the value of the codigoiso property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCODIGOISO(String value) {
        this.codigoiso = value;
    }

}
