
package mx.com.sky.soasky;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Recarga_consultaPrecioRecarga_Salida_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Recarga_consultaPrecioRecarga_Salida_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CABECERA" type="{http://www.sky.com.mx/soasky}Cabecera_Salida_TYPE"/&gt;
 *         &lt;element name="NUMCUENTA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PRECIO_RECARGA" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="SALDO" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="FIN_RECARGA" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DIAS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RESP_ERROR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Recarga_consultaPrecioRecarga_Salida_TYPE",
         propOrder =
         { "cabecera", "numcuenta", "preciorecarga", "preciorecarga15", "saldo",
           "finrecarga", "resperror"
    })
public class RecargaConsultaPrecioRecargaSalidaTYPE {

    @XmlElement(name = "CABECERA", required = true)
    protected CabeceraSalidaTYPE cabecera;
    @XmlElement(name = "NUMCUENTA", required = true)
    protected String numcuenta;
    @XmlElement(name = "PRECIO_RECARGA", required = true)
    protected BigDecimal preciorecarga;
    @XmlElement(name = "SALDO", required = true)
    protected BigDecimal saldo;
    @XmlElement(name = "FIN_RECARGA", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finrecarga;
    @XmlElement(name = "RESP_ERROR", required = true)
    protected String resperror;
    @XmlElement(name = "PRECIO_RECARGA_15", required = true)
    protected BigDecimal preciorecarga15;

    /**
     * Gets the value of the cabecera property.
     *
     * @return
     *     possible object is
     *     {@link CabeceraSalidaTYPE }
     *
     */
    public CabeceraSalidaTYPE getCABECERA() {
        return cabecera;
    }

    /**
     * Sets the value of the cabecera property.
     *
     * @param value
     *     allowed object is
     *     {@link CabeceraSalidaTYPE }
     *
     */
    public void setCABECERA(CabeceraSalidaTYPE value) {
        this.cabecera = value;
    }

    /**
     * Gets the value of the numcuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNUMCUENTA() {
        return numcuenta;
    }

    /**
     * Sets the value of the numcuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNUMCUENTA(String value) {
        this.numcuenta = value;
    }

    /**
     * Gets the value of the preciorecarga property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getPRECIORECARGA() {
        return preciorecarga;
    }

    /**
     * Sets the value of the preciorecarga property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setPRECIORECARGA(BigDecimal value) {
        this.preciorecarga = value;
    }

    /**
     * Gets the value of the saldo property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getSALDO() {
        return saldo;
    }

    /**
     * Sets the value of the saldo property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setSALDO(BigDecimal value) {
        this.saldo = value;
    }

    /**
     * Gets the value of the finrecarga property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFINRECARGA() {
        return finrecarga;
    }

    /**
     * Sets the value of the finrecarga property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFINRECARGA(XMLGregorianCalendar value) {
        this.finrecarga = value;
    }


    /**
     * Gets the value of the resperror property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRESPERROR() {
        return resperror;
    }

    /**
     * Sets the value of the resperror property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRESPERROR(String value) {
        this.resperror = value;
    }

    /**
     * Gets the value of the preciorecarga15 property.
     *
     * @return
     * possible object is
     * {@link BigDecimal}
     *
     */
    public BigDecimal getPRECIORECARGA15() {
        return preciorecarga15;
    }

    /**
     * Sets the value of the preciorecarga15 property.
     *
     * @param value
     * allowed object is
     * {@link BigDecimal}
     *
     */
    public void setPRECIORECARGA15(BigDecimal value) {
        this.preciorecarga15 = value;
    }

}
