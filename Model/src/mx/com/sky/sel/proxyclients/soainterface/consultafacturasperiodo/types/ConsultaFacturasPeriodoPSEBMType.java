
package mx.com.sky.sel.proxyclients.soainterface.consultafacturasperiodo.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultaFacturasPeriodoPSEBMType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultaFacturasPeriodoPSEBMType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/>
 *         &lt;element ref="{http://www.sky.com.mx/soasky}Facturas_consultaFacturasPeriodo_Entrada"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaFacturasPeriodoPSEBMType", namespace = "http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultaFacturasPeriodoPSInterface", propOrder = {
    "ebmHeaderRequest",
    "facturasConsultaFacturasPeriodoEntrada"
})
public class ConsultaFacturasPeriodoPSEBMType {

    @XmlElement(name = "EBMHeaderRequest", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1", required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "Facturas_consultaFacturasPeriodo_Entrada", namespace = "http://www.sky.com.mx/soasky", required = true)
    protected FacturasConsultaFacturasPeriodoEntradaTYPE facturasConsultaFacturasPeriodoEntrada;

    /**
     * Gets the value of the ebmHeaderRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EBMHeaderRequestType }
     *     
     */
    public EBMHeaderRequestType getEBMHeaderRequest() {
        return ebmHeaderRequest;
    }

    /**
     * Sets the value of the ebmHeaderRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBMHeaderRequestType }
     *     
     */
    public void setEBMHeaderRequest(EBMHeaderRequestType value) {
        this.ebmHeaderRequest = value;
    }

    /**
     * Gets the value of the facturasConsultaFacturasPeriodoEntrada property.
     * 
     * @return
     *     possible object is
     *     {@link FacturasConsultaFacturasPeriodoEntradaTYPE }
     *     
     */
    public FacturasConsultaFacturasPeriodoEntradaTYPE getFacturasConsultaFacturasPeriodoEntrada() {
        return facturasConsultaFacturasPeriodoEntrada;
    }

    /**
     * Sets the value of the facturasConsultaFacturasPeriodoEntrada property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacturasConsultaFacturasPeriodoEntradaTYPE }
     *     
     */
    public void setFacturasConsultaFacturasPeriodoEntrada(FacturasConsultaFacturasPeriodoEntradaTYPE value) {
        this.facturasConsultaFacturasPeriodoEntrada = value;
    }

}
