
package mx.com.sky.sel.proxyclients.soainterface.consultafacturasperiodo.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultaFacturasPeriodoPSResponseEBMType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultaFacturasPeriodoPSResponseEBMType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/>
 *         &lt;element ref="{http://www.sky.com.mx/soasky}Facturas_consultaFacturasPeriodo_Salida"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaFacturasPeriodoPSResponseEBMType", namespace = "http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultaFacturasPeriodoPSInterface", propOrder = {
    "ebmHeaderResponse",
    "facturasConsultaFacturasPeriodoSalida"
})
public class ConsultaFacturasPeriodoPSResponseEBMType {

    @XmlElement(name = "EBMHeaderResponse", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1", required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "Facturas_consultaFacturasPeriodo_Salida", namespace = "http://www.sky.com.mx/soasky", required = true)
    protected FacturasConsultaFacturasPeriodoSalidaTYPE facturasConsultaFacturasPeriodoSalida;

    /**
     * Gets the value of the ebmHeaderResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EBMHeaderResponseType }
     *     
     */
    public EBMHeaderResponseType getEBMHeaderResponse() {
        return ebmHeaderResponse;
    }

    /**
     * Sets the value of the ebmHeaderResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBMHeaderResponseType }
     *     
     */
    public void setEBMHeaderResponse(EBMHeaderResponseType value) {
        this.ebmHeaderResponse = value;
    }

    /**
     * Gets the value of the facturasConsultaFacturasPeriodoSalida property.
     * 
     * @return
     *     possible object is
     *     {@link FacturasConsultaFacturasPeriodoSalidaTYPE }
     *     
     */
    public FacturasConsultaFacturasPeriodoSalidaTYPE getFacturasConsultaFacturasPeriodoSalida() {
        return facturasConsultaFacturasPeriodoSalida;
    }

    /**
     * Sets the value of the facturasConsultaFacturasPeriodoSalida property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacturasConsultaFacturasPeriodoSalidaTYPE }
     *     
     */
    public void setFacturasConsultaFacturasPeriodoSalida(FacturasConsultaFacturasPeriodoSalidaTYPE value) {
        this.facturasConsultaFacturasPeriodoSalida = value;
    }

}
