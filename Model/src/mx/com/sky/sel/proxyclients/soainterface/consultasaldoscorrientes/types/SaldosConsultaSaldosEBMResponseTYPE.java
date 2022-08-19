
package mx.com.sky.sel.proxyclients.soainterface.consultasaldoscorrientes.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaldosConsultaSaldosEBMResponse_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaldosConsultaSaldosEBMResponse_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/>
 *         &lt;element ref="{http://www.sky.com.mx/soasky}Saldos_consultaSaldosCorrientes_Salida"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaldosConsultaSaldosEBMResponse_TYPE", namespace = "http://www.sky.com.mx/EnterpriseObjects/SOA/Saldos_consultaSaldosCorrientesEBM", propOrder = {
    "ebmHeaderResponse",
    "saldosConsultaSaldosCorrientesSalida"
})
public class SaldosConsultaSaldosEBMResponseTYPE {

    @XmlElement(name = "EBMHeaderResponse", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1", required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "Saldos_consultaSaldosCorrientes_Salida", namespace = "http://www.sky.com.mx/soasky", required = true)
    protected SaldosConsultaSaldosCorrientesSalidaTYPE saldosConsultaSaldosCorrientesSalida;

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
     * Gets the value of the saldosConsultaSaldosCorrientesSalida property.
     * 
     * @return
     *     possible object is
     *     {@link SaldosConsultaSaldosCorrientesSalidaTYPE }
     *     
     */
    public SaldosConsultaSaldosCorrientesSalidaTYPE getSaldosConsultaSaldosCorrientesSalida() {
        return saldosConsultaSaldosCorrientesSalida;
    }

    /**
     * Sets the value of the saldosConsultaSaldosCorrientesSalida property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaldosConsultaSaldosCorrientesSalidaTYPE }
     *     
     */
    public void setSaldosConsultaSaldosCorrientesSalida(SaldosConsultaSaldosCorrientesSalidaTYPE value) {
        this.saldosConsultaSaldosCorrientesSalida = value;
    }

}
