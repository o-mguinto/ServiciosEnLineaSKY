
package mx.com.sky.enterpriseobjects.soa.consultasaldoscorrientesinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderResponseType;
import mx.com.sky.soasky.SaldosConsultaSaldosCorrientesSalidaTYPE;


/**
 * <p>Java class for ConsultaSaldosCorrientesResponseEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultaSaldosCorrientesResponseEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/&gt;
 *         &lt;element ref="{http://www.sky.com.mx/soasky}Saldos_consultaSaldosCorrientes_Salida"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaSaldosCorrientesResponseEBMType",
         propOrder = { "ebmHeaderResponse", "saldosConsultaSaldosCorrientesSalida" })
public class ConsultaSaldosCorrientesResponseEBMType {

    @XmlElement(name = "EBMHeaderResponse", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "Saldos_consultaSaldosCorrientes_Salida", namespace = "http://www.sky.com.mx/soasky",
                required = true)
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
