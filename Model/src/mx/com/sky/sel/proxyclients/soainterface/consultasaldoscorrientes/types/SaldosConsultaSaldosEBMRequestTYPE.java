
package mx.com.sky.sel.proxyclients.soainterface.consultasaldoscorrientes.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaldosConsultaSaldosEBMRequest_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaldosConsultaSaldosEBMRequest_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/>
 *         &lt;element ref="{http://www.sky.com.mx/soasky}Saldos_consultaSaldosCorrientes_Entrada"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaldosConsultaSaldosEBMRequest_TYPE", namespace = "http://www.sky.com.mx/EnterpriseObjects/SOA/Saldos_consultaSaldosCorrientesEBM", propOrder = {
    "ebmHeaderRequest",
    "saldosConsultaSaldosCorrientesEntrada"
})
public class SaldosConsultaSaldosEBMRequestTYPE {

    @XmlElement(name = "EBMHeaderRequest", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1", required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "Saldos_consultaSaldosCorrientes_Entrada", namespace = "http://www.sky.com.mx/soasky", required = true)
    protected SaldosConsultaSaldosCorrientesEntradaTYPE saldosConsultaSaldosCorrientesEntrada;

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
     * Gets the value of the saldosConsultaSaldosCorrientesEntrada property.
     * 
     * @return
     *     possible object is
     *     {@link SaldosConsultaSaldosCorrientesEntradaTYPE }
     *     
     */
    public SaldosConsultaSaldosCorrientesEntradaTYPE getSaldosConsultaSaldosCorrientesEntrada() {
        return saldosConsultaSaldosCorrientesEntrada;
    }

    /**
     * Sets the value of the saldosConsultaSaldosCorrientesEntrada property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaldosConsultaSaldosCorrientesEntradaTYPE }
     *     
     */
    public void setSaldosConsultaSaldosCorrientesEntrada(SaldosConsultaSaldosCorrientesEntradaTYPE value) {
        this.saldosConsultaSaldosCorrientesEntrada = value;
    }

}
