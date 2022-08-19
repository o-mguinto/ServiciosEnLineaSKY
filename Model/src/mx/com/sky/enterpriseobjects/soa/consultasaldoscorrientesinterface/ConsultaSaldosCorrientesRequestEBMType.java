
package mx.com.sky.enterpriseobjects.soa.consultasaldoscorrientesinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;
import mx.com.sky.soasky.SaldosConsultaSaldosCorrientesEntradaTYPE;


/**
 * <p>Java class for ConsultaSaldosCorrientesRequestEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultaSaldosCorrientesRequestEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/&gt;
 *         &lt;element ref="{http://www.sky.com.mx/soasky}Saldos_consultaSaldosCorrientes_Entrada"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaSaldosCorrientesRequestEBMType",
         propOrder = { "ebmHeaderRequest", "saldosConsultaSaldosCorrientesEntrada" })
public class ConsultaSaldosCorrientesRequestEBMType {

    @XmlElement(name = "EBMHeaderRequest", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "Saldos_consultaSaldosCorrientes_Entrada", namespace = "http://www.sky.com.mx/soasky",
                required = true)
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
