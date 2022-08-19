
package mx.com.sky.enterpriseobjects.soa.consultacuentainterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;
import mx.com.sky.siebelosb.consultacuenta.ConsultaCuentaEntradaTYPE;


/**
 * <p>Java class for ConsultaCuentaRequestEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultaCuentaRequestEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/&gt;
 *         &lt;element ref="{http://www.sky.com.mx/SiebelOSB/ConsultaCuenta}ConsultaCuenta_Entrada"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaCuentaRequestEBMType", propOrder = { "ebmHeaderRequest", "consultaCuentaEntrada" })
public class ConsultaCuentaRequestEBMType {

    @XmlElement(name = "EBMHeaderRequest", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "ConsultaCuenta_Entrada", namespace = "http://www.sky.com.mx/SiebelOSB/ConsultaCuenta",
                required = true)
    protected ConsultaCuentaEntradaTYPE consultaCuentaEntrada;

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
     * Gets the value of the consultaCuentaEntrada property.
     *
     * @return
     *     possible object is
     *     {@link ConsultaCuentaEntradaTYPE }
     *
     */
    public ConsultaCuentaEntradaTYPE getConsultaCuentaEntrada() {
        return consultaCuentaEntrada;
    }

    /**
     * Sets the value of the consultaCuentaEntrada property.
     *
     * @param value
     *     allowed object is
     *     {@link ConsultaCuentaEntradaTYPE }
     *
     */
    public void setConsultaCuentaEntrada(ConsultaCuentaEntradaTYPE value) {
        this.consultaCuentaEntrada = value;
    }

}
