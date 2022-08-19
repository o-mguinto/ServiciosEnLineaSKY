
package mx.com.sky.sel.proxyclients.soainterface.consultasaldoscorrientes.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Saldos_consultaSaldosCorrientes_Salida_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Saldos_consultaSaldosCorrientes_Salida_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CABECERA" type="{http://www.sky.com.mx/soasky}Cabecera_SalidaConsultaSaldosCorrientes_TYPE"/>
 *         &lt;element name="ADEUDO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CPR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SALDO_MINIMO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PRORRATEO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CNR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PPVXF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SALDO_POR_FACTURAR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SALDO_TOTAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DESCUENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FECHA_PROMOCION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PROMOCION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NUMERO_FACTURA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FECHA_EMISION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TIPO_BANCO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DESCUENTO_PAGO_OPORTUNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOTAL_PAGO_OPORTUNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SALDO_TOTAL_PAGO_OPORTUNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FECHA_PAGO_OPORTUNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIPO_TARJETA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FECHA_SIGUIENTE_CORTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CARGO_RECXFAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Saldos_consultaSaldosCorrientes_Salida_TYPE", namespace = "http://www.sky.com.mx/soasky", propOrder = {
    "cabecera",
    "adeudo",
    "cpr",
    "saldominimo",
    "prorrateo",
    "cnr",
    "ppvxf",
    "saldoporfacturar",
    "saldototal",
    "descuento",
    "fechapromocion",
    "promocion",
    "numerofactura",
    "fechaemision",
    "tipobanco",
    "status",
    "descuentopagooportuno",
    "totalpagooportuno",
    "saldototalpagooportuno",
    "fechapagooportuno",
    "tipotarjeta",
    "fechasiguientecorte",
    "cargorecxfac"
})
public class SaldosConsultaSaldosCorrientesSalidaTYPE {

    @XmlElement(name = "CABECERA", required = true)
    protected CabeceraSalidaConsultaSaldosCorrientesTYPE cabecera;
    @XmlElement(name = "ADEUDO", required = true)
    protected String adeudo;
    @XmlElement(name = "CPR", required = true)
    protected String cpr;
    @XmlElement(name = "SALDO_MINIMO", required = true)
    protected String saldominimo;
    @XmlElement(name = "PRORRATEO", required = true)
    protected String prorrateo;
    @XmlElement(name = "CNR", required = true)
    protected String cnr;
    @XmlElement(name = "PPVXF", required = true)
    protected String ppvxf;
    @XmlElement(name = "SALDO_POR_FACTURAR", required = true)
    protected String saldoporfacturar;
    @XmlElement(name = "SALDO_TOTAL", required = true)
    protected String saldototal;
    @XmlElement(name = "DESCUENTO", required = true)
    protected String descuento;
    @XmlElement(name = "FECHA_PROMOCION", required = true)
    protected String fechapromocion;
    @XmlElement(name = "PROMOCION", required = true)
    protected String promocion;
    @XmlElement(name = "NUMERO_FACTURA", required = true)
    protected String numerofactura;
    @XmlElement(name = "FECHA_EMISION", required = true)
    protected String fechaemision;
    @XmlElement(name = "TIPO_BANCO", required = true)
    protected String tipobanco;
    @XmlElement(name = "STATUS", required = true)
    protected String status;
    @XmlElementRef(name = "DESCUENTO_PAGO_OPORTUNO", namespace = "http://www.sky.com.mx/soasky", type = JAXBElement.class)
    protected JAXBElement<String> descuentopagooportuno;
    @XmlElementRef(name = "TOTAL_PAGO_OPORTUNO", namespace = "http://www.sky.com.mx/soasky", type = JAXBElement.class)
    protected JAXBElement<String> totalpagooportuno;
    @XmlElementRef(name = "SALDO_TOTAL_PAGO_OPORTUNO", namespace = "http://www.sky.com.mx/soasky", type = JAXBElement.class)
    protected JAXBElement<String> saldototalpagooportuno;
    @XmlElementRef(name = "FECHA_PAGO_OPORTUNO", namespace = "http://www.sky.com.mx/soasky", type = JAXBElement.class)
    protected JAXBElement<String> fechapagooportuno;
    @XmlElementRef(name = "TIPO_TARJETA", namespace = "http://www.sky.com.mx/soasky", type = JAXBElement.class)
    protected JAXBElement<String> tipotarjeta;
    @XmlElement(name = "FECHA_SIGUIENTE_CORTE")
    protected String fechasiguientecorte;
    @XmlElement(name = "CARGO_RECXFAC")
    protected String cargorecxfac;

    /**
     * Gets the value of the cabecera property.
     * 
     * @return
     *     possible object is
     *     {@link CabeceraSalidaConsultaSaldosCorrientesTYPE }
     *     
     */
    public CabeceraSalidaConsultaSaldosCorrientesTYPE getCABECERA() {
        return cabecera;
    }

    /**
     * Sets the value of the cabecera property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabeceraSalidaConsultaSaldosCorrientesTYPE }
     *     
     */
    public void setCABECERA(CabeceraSalidaConsultaSaldosCorrientesTYPE value) {
        this.cabecera = value;
    }

    /**
     * Gets the value of the adeudo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADEUDO() {
        return adeudo;
    }

    /**
     * Sets the value of the adeudo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADEUDO(String value) {
        this.adeudo = value;
    }

    /**
     * Gets the value of the cpr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPR() {
        return cpr;
    }

    /**
     * Sets the value of the cpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPR(String value) {
        this.cpr = value;
    }

    /**
     * Gets the value of the saldominimo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSALDOMINIMO() {
        return saldominimo;
    }

    /**
     * Sets the value of the saldominimo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSALDOMINIMO(String value) {
        this.saldominimo = value;
    }

    /**
     * Gets the value of the prorrateo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRORRATEO() {
        return prorrateo;
    }

    /**
     * Sets the value of the prorrateo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRORRATEO(String value) {
        this.prorrateo = value;
    }

    /**
     * Gets the value of the cnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNR() {
        return cnr;
    }

    /**
     * Sets the value of the cnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNR(String value) {
        this.cnr = value;
    }

    /**
     * Gets the value of the ppvxf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPVXF() {
        return ppvxf;
    }

    /**
     * Sets the value of the ppvxf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPVXF(String value) {
        this.ppvxf = value;
    }

    /**
     * Gets the value of the saldoporfacturar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSALDOPORFACTURAR() {
        return saldoporfacturar;
    }

    /**
     * Sets the value of the saldoporfacturar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSALDOPORFACTURAR(String value) {
        this.saldoporfacturar = value;
    }

    /**
     * Gets the value of the saldototal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSALDOTOTAL() {
        return saldototal;
    }

    /**
     * Sets the value of the saldototal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSALDOTOTAL(String value) {
        this.saldototal = value;
    }

    /**
     * Gets the value of the descuento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCUENTO() {
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
    public void setDESCUENTO(String value) {
        this.descuento = value;
    }

    /**
     * Gets the value of the fechapromocion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHAPROMOCION() {
        return fechapromocion;
    }

    /**
     * Sets the value of the fechapromocion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHAPROMOCION(String value) {
        this.fechapromocion = value;
    }

    /**
     * Gets the value of the promocion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROMOCION() {
        return promocion;
    }

    /**
     * Sets the value of the promocion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROMOCION(String value) {
        this.promocion = value;
    }

    /**
     * Gets the value of the numerofactura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROFACTURA() {
        return numerofactura;
    }

    /**
     * Sets the value of the numerofactura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROFACTURA(String value) {
        this.numerofactura = value;
    }

    /**
     * Gets the value of the fechaemision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHAEMISION() {
        return fechaemision;
    }

    /**
     * Sets the value of the fechaemision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHAEMISION(String value) {
        this.fechaemision = value;
    }

    /**
     * Gets the value of the tipobanco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOBANCO() {
        return tipobanco;
    }

    /**
     * Sets the value of the tipobanco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOBANCO(String value) {
        this.tipobanco = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the descuentopagooportuno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDESCUENTOPAGOOPORTUNO() {
        return descuentopagooportuno;
    }

    /**
     * Sets the value of the descuentopagooportuno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDESCUENTOPAGOOPORTUNO(JAXBElement<String> value) {
        this.descuentopagooportuno = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the totalpagooportuno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTOTALPAGOOPORTUNO() {
        return totalpagooportuno;
    }

    /**
     * Sets the value of the totalpagooportuno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTOTALPAGOOPORTUNO(JAXBElement<String> value) {
        this.totalpagooportuno = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the saldototalpagooportuno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSALDOTOTALPAGOOPORTUNO() {
        return saldototalpagooportuno;
    }

    /**
     * Sets the value of the saldototalpagooportuno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSALDOTOTALPAGOOPORTUNO(JAXBElement<String> value) {
        this.saldototalpagooportuno = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fechapagooportuno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFECHAPAGOOPORTUNO() {
        return fechapagooportuno;
    }

    /**
     * Sets the value of the fechapagooportuno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFECHAPAGOOPORTUNO(JAXBElement<String> value) {
        this.fechapagooportuno = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tipotarjeta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTIPOTARJETA() {
        return tipotarjeta;
    }

    /**
     * Sets the value of the tipotarjeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTIPOTARJETA(JAXBElement<String> value) {
        this.tipotarjeta = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fechasiguientecorte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHASIGUIENTECORTE() {
        return fechasiguientecorte;
    }

    /**
     * Sets the value of the fechasiguientecorte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHASIGUIENTECORTE(String value) {
        this.fechasiguientecorte = value;
    }

    /**
     * Gets the value of the cargorecxfac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARGORECXFAC() {
        return cargorecxfac;
    }

    /**
     * Sets the value of the cargorecxfac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARGORECXFAC(String value) {
        this.cargorecxfac = value;
    }

}
