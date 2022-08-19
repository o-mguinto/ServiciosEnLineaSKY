
package mx.com.sky.enterpriseobjects.soa.consultacuentainterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderResponseType;
import mx.com.sky.siebelosb.consultacuenta.ConsultaCuentaSalidaTYPE;


/**
 * <p>Java class for ConsultaCuentaResponseEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultaCuentaResponseEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/&gt;
 *         &lt;element ref="{http://www.sky.com.mx/SiebelOSB/ConsultaCuenta}ConsultaCuenta_Salida"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaCuentaResponseEBMType", propOrder = { "ebmHeaderResponse", "consultaCuentaSalida" })
public class ConsultaCuentaResponseEBMType {

    @XmlElement(name = "EBMHeaderResponse", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "ConsultaCuenta_Salida", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta",
                required = true)
    protected ConsultaCuentaSalidaTYPE consultaCuentaSalida;

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
     * Gets the value of the consultaCuentaSalida property.
     *
     * @return
     *     possible object is
     *     {@link ConsultaCuentaSalidaTYPE }
     *
     */
    public ConsultaCuentaSalidaTYPE getConsultaCuentaSalida() {
        return consultaCuentaSalida;
    }

    /**
     * Sets the value of the consultaCuentaSalida property.
     *
     * @param value
     *     allowed object is
     *     {@link ConsultaCuentaSalidaTYPE }
     *
     */
    public void setConsultaCuentaSalida(ConsultaCuentaSalidaTYPE value) {
        this.consultaCuentaSalida = value;
    }

}
