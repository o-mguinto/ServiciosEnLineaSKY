
package mx.com.sky.sel.proxyclients.soainterface.consultafacturasperiodo.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Resultados_Salida_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Resultados_Salida_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUMERO_FACTURA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FECHA_EMISION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FECHA_FACTURA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MONEDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MONTO_FACTURADO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AJUSTES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONSUMOS_DEL_MES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAGOS_A_FACTURA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INICIO_PERIODO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIN_PERIODO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FECHA_A_PAGAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SALDO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SALDO_TOTAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ESTATUS_FORMATO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FECHA_CIERRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_FACTURA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FECHA_VENCIMIENTO" type="{http://www.sky.com.mx/soasky}empty-date" minOccurs="0"/>
 *         &lt;element name="CONSECUTIVO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Resultados_Salida_TYPE", namespace = "http://www.sky.com.mx/soasky", propOrder = {
    "numerofactura",
    "fechaemision",
    "fechafactura",
    "moneda",
    "montofacturado",
    "ajustes",
    "consumosdelmes",
    "pagosafactura",
    "inicioperiodo",
    "finperiodo",
    "fechaapagar",
    "saldo",
    "saldototal",
    "estatusformato",
    "fechacierre",
    "idfactura",
    "fechavencimiento",
    "consecutivo"
})
public class ResultadosSalidaTYPE {

    @XmlElementRef(name = "NUMERO_FACTURA", namespace = "http://www.sky.com.mx/soasky", type = JAXBElement.class)
    protected JAXBElement<String> numerofactura;
    @XmlElementRef(name = "FECHA_EMISION", namespace = "http://www.sky.com.mx/soasky", type = JAXBElement.class)
    protected JAXBElement<String> fechaemision;
    @XmlElementRef(name = "FECHA_FACTURA", namespace = "http://www.sky.com.mx/soasky", type = JAXBElement.class)
    protected JAXBElement<String> fechafactura;
    @XmlElementRef(name = "MONEDA", namespace = "http://www.sky.com.mx/soasky", type = JAXBElement.class)
    protected JAXBElement<String> moneda;
    @XmlElementRef(name = "MONTO_FACTURADO", namespace = "http://www.sky.com.mx/soasky", type = JAXBElement.class)
    protected JAXBElement<String> montofacturado;
    @XmlElementRef(name = "AJUSTES", namespace = "http://www.sky.com.mx/soasky", type = JAXBElement.class)
    protected JAXBElement<String> ajustes;
    @XmlElementRef(name = "CONSUMOS_DEL_MES", namespace = "http://www.sky.com.mx/soasky", type = JAXBElement.class)
    protected JAXBElement<String> consumosdelmes;
    @XmlElementRef(name = "PAGOS_A_FACTURA", namespace = "http://www.sky.com.mx/soasky", type = JAXBElement.class)
    protected JAXBElement<String> pagosafactura;
    @XmlElementRef(name = "INICIO_PERIODO", namespace = "http://www.sky.com.mx/soasky", type = JAXBElement.class)
    protected JAXBElement<String> inicioperiodo;
    @XmlElementRef(name = "FIN_PERIODO", namespace = "http://www.sky.com.mx/soasky", type = JAXBElement.class)
    protected JAXBElement<String> finperiodo;
    @XmlElementRef(name = "FECHA_A_PAGAR", namespace = "http://www.sky.com.mx/soasky", type = JAXBElement.class)
    protected JAXBElement<String> fechaapagar;
    @XmlElementRef(name = "SALDO", namespace = "http://www.sky.com.mx/soasky", type = JAXBElement.class)
    protected JAXBElement<String> saldo;
    @XmlElementRef(name = "SALDO_TOTAL", namespace = "http://www.sky.com.mx/soasky", type = JAXBElement.class)
    protected JAXBElement<String> saldototal;
    @XmlElementRef(name = "ESTATUS_FORMATO", namespace = "http://www.sky.com.mx/soasky", type = JAXBElement.class)
    protected JAXBElement<String> estatusformato;
    @XmlElementRef(name = "FECHA_CIERRE", namespace = "http://www.sky.com.mx/soasky", type = JAXBElement.class)
    protected JAXBElement<String> fechacierre;
    @XmlElementRef(name = "ID_FACTURA", namespace = "http://www.sky.com.mx/soasky", type = JAXBElement.class)
    protected JAXBElement<String> idfactura;
    @XmlElementRef(name = "FECHA_VENCIMIENTO", namespace = "http://www.sky.com.mx/soasky", type = JAXBElement.class)
    protected JAXBElement<String> fechavencimiento;
    @XmlElementRef(name = "CONSECUTIVO", namespace = "http://www.sky.com.mx/soasky", type = JAXBElement.class)
    protected JAXBElement<String> consecutivo;

    /**
     * Gets the value of the numerofactura property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNUMEROFACTURA() {
        return numerofactura;
    }

    /**
     * Sets the value of the numerofactura property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNUMEROFACTURA(JAXBElement<String> value) {
        this.numerofactura = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fechaemision property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFECHAEMISION() {
        return fechaemision;
    }

    /**
     * Sets the value of the fechaemision property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFECHAEMISION(JAXBElement<String> value) {
        this.fechaemision = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fechafactura property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFECHAFACTURA() {
        return fechafactura;
    }

    /**
     * Sets the value of the fechafactura property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFECHAFACTURA(JAXBElement<String> value) {
        this.fechafactura = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the moneda property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMONEDA() {
        return moneda;
    }

    /**
     * Sets the value of the moneda property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMONEDA(JAXBElement<String> value) {
        this.moneda = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the montofacturado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMONTOFACTURADO() {
        return montofacturado;
    }

    /**
     * Sets the value of the montofacturado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMONTOFACTURADO(JAXBElement<String> value) {
        this.montofacturado = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ajustes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAJUSTES() {
        return ajustes;
    }

    /**
     * Sets the value of the ajustes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAJUSTES(JAXBElement<String> value) {
        this.ajustes = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the consumosdelmes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCONSUMOSDELMES() {
        return consumosdelmes;
    }

    /**
     * Sets the value of the consumosdelmes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCONSUMOSDELMES(JAXBElement<String> value) {
        this.consumosdelmes = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pagosafactura property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPAGOSAFACTURA() {
        return pagosafactura;
    }

    /**
     * Sets the value of the pagosafactura property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPAGOSAFACTURA(JAXBElement<String> value) {
        this.pagosafactura = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the inicioperiodo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getINICIOPERIODO() {
        return inicioperiodo;
    }

    /**
     * Sets the value of the inicioperiodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setINICIOPERIODO(JAXBElement<String> value) {
        this.inicioperiodo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the finperiodo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFINPERIODO() {
        return finperiodo;
    }

    /**
     * Sets the value of the finperiodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFINPERIODO(JAXBElement<String> value) {
        this.finperiodo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fechaapagar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFECHAAPAGAR() {
        return fechaapagar;
    }

    /**
     * Sets the value of the fechaapagar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFECHAAPAGAR(JAXBElement<String> value) {
        this.fechaapagar = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the saldo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSALDO() {
        return saldo;
    }

    /**
     * Sets the value of the saldo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSALDO(JAXBElement<String> value) {
        this.saldo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the saldototal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSALDOTOTAL() {
        return saldototal;
    }

    /**
     * Sets the value of the saldototal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSALDOTOTAL(JAXBElement<String> value) {
        this.saldototal = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the estatusformato property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getESTATUSFORMATO() {
        return estatusformato;
    }

    /**
     * Sets the value of the estatusformato property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setESTATUSFORMATO(JAXBElement<String> value) {
        this.estatusformato = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fechacierre property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFECHACIERRE() {
        return fechacierre;
    }

    /**
     * Sets the value of the fechacierre property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFECHACIERRE(JAXBElement<String> value) {
        this.fechacierre = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idfactura property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIDFACTURA() {
        return idfactura;
    }

    /**
     * Sets the value of the idfactura property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIDFACTURA(JAXBElement<String> value) {
        this.idfactura = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fechavencimiento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFECHAVENCIMIENTO() {
        return fechavencimiento;
    }

    /**
     * Sets the value of the fechavencimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFECHAVENCIMIENTO(JAXBElement<String> value) {
        this.fechavencimiento = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the consecutivo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCONSECUTIVO() {
        return consecutivo;
    }

    /**
     * Sets the value of the consecutivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCONSECUTIVO(JAXBElement<String> value) {
        this.consecutivo = ((JAXBElement<String> ) value);
    }

}
