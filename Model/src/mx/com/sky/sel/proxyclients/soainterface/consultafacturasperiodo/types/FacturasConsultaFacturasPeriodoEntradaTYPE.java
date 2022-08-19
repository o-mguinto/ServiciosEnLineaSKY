
package mx.com.sky.sel.proxyclients.soainterface.consultafacturasperiodo.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Facturas_consultaFacturasPeriodo_Entrada_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Facturas_consultaFacturasPeriodo_Entrada_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CABECERA" type="{http://www.sky.com.mx/soasky}Cabecera_Entrada_TYPE"/>
 *         &lt;element name="NUMERO_CUENTA" type="{http://www.sky.com.mx/soasky}simpleType1"/>
 *         &lt;element name="FECHA_FIN" type="{http://www.sky.com.mx/soasky}empty-date" minOccurs="0"/>
 *         &lt;element name="FECHA_INICIO" type="{http://www.sky.com.mx/soasky}empty-date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Facturas_consultaFacturasPeriodo_Entrada_TYPE", namespace = "http://www.sky.com.mx/soasky", propOrder = {
    "cabecera",
    "numerocuenta",
    "fechafin",
    "fechainicio"
})
public class FacturasConsultaFacturasPeriodoEntradaTYPE {

    @XmlElement(name = "CABECERA", required = true)
    protected CabeceraEntradaTYPE cabecera;
    @XmlElement(name = "NUMERO_CUENTA", required = true)
    protected String numerocuenta;
    @XmlElementRef(name = "FECHA_FIN", namespace = "http://www.sky.com.mx/soasky", type = JAXBElement.class)
    protected JAXBElement<String> fechafin;
    @XmlElementRef(name = "FECHA_INICIO", namespace = "http://www.sky.com.mx/soasky", type = JAXBElement.class)
    protected JAXBElement<String> fechainicio;

    /**
     * Gets the value of the cabecera property.
     * 
     * @return
     *     possible object is
     *     {@link CabeceraEntradaTYPE }
     *     
     */
    public CabeceraEntradaTYPE getCABECERA() {
        return cabecera;
    }

    /**
     * Sets the value of the cabecera property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabeceraEntradaTYPE }
     *     
     */
    public void setCABECERA(CabeceraEntradaTYPE value) {
        this.cabecera = value;
    }

    /**
     * Gets the value of the numerocuenta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROCUENTA() {
        return numerocuenta;
    }

    /**
     * Sets the value of the numerocuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROCUENTA(String value) {
        this.numerocuenta = value;
    }

    /**
     * Gets the value of the fechafin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFECHAFIN() {
        return fechafin;
    }

    /**
     * Sets the value of the fechafin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFECHAFIN(JAXBElement<String> value) {
        this.fechafin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fechainicio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFECHAINICIO() {
        return fechainicio;
    }

    /**
     * Sets the value of the fechainicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFECHAINICIO(JAXBElement<String> value) {
        this.fechainicio = ((JAXBElement<String> ) value);
    }

}
