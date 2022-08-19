
package mx.com.sky.enterprisemessages.sel.administrartarjetapago;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;


/**
 * <p>Java class for ConsultarTarjetaInputRequestEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarTarjetaInputRequestEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/&gt;
 *         &lt;element name="DatosConsultarTarjetaInput" type="{http://www.sky.com.mx/EnterpriseMessages/Sel/AdministrarTarjetaPago}ConsultarTarjetasInputType"/&gt;
 *         &lt;element name="datosVoltage" type="{http://www.sky.com.mx/EnterpriseMessages/Sel/AdministrarTarjetaPago}DatosVoltageType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarTarjetaInputRequestEBMType",
         propOrder =
         { "ebmHeaderRequest", "datosConsultarTarjetaInput", "datosVoltage"
    })
public class ConsultarTarjetaInputRequestEBMType {

    @XmlElement(name = "EBMHeaderRequest",
                namespace =
                "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "DatosConsultarTarjetaInput", required = true)
    protected ConsultarTarjetasInputType datosConsultarTarjetaInput;
    @XmlElement(required = true)
    protected DatosVoltageType datosVoltage;

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
     * Gets the value of the datosConsultarTarjetaInput property.
     *
     * @return
     *     possible object is
     *     {@link ConsultarTarjetasInputType }
     *
     */
    public ConsultarTarjetasInputType getDatosConsultarTarjetaInput() {
        return datosConsultarTarjetaInput;
    }

    /**
     * Sets the value of the datosConsultarTarjetaInput property.
     *
     * @param value
     *     allowed object is
     *     {@link ConsultarTarjetasInputType }
     *
     */
    public void setDatosConsultarTarjetaInput(ConsultarTarjetasInputType value) {
        this.datosConsultarTarjetaInput = value;
    }

    /**
     * Gets the value of the datosVoltage property.
     *
     * @return
     *     possible object is
     *     {@link DatosVoltageType }
     *
     */
    public DatosVoltageType getDatosVoltage() {
        return datosVoltage;
    }

    /**
     * Sets the value of the datosVoltage property.
     *
     * @param value
     *     allowed object is
     *     {@link DatosVoltageType }
     *
     */
    public void setDatosVoltage(DatosVoltageType value) {
        this.datosVoltage = value;
    }

}
