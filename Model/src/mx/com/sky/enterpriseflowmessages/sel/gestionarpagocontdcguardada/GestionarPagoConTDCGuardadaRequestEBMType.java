
package mx.com.sky.enterpriseflowmessages.sel.gestionarpagocontdcguardada;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;


/**
 * <p>Java class for GestionarPagoConTDCGuardadaRequestEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GestionarPagoConTDCGuardadaRequestEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/&gt;
 *         &lt;element name="DatosTransaccionPagoIn" type="{http://www.sky.com.mx/EnterpriseFlowMessages/Sel/GestionarPagoConTDCGuardada}DatosTransaccionPagoInputMessageType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GestionarPagoConTDCGuardadaRequestEBMType",
         propOrder = { "ebmHeaderRequest", "datosTransaccionPagoIn"
    })
public class GestionarPagoConTDCGuardadaRequestEBMType {

    @XmlElement(name = "EBMHeaderRequest",
                namespace =
                "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "DatosTransaccionPagoIn", required = true)
    protected DatosTransaccionPagoInputMessageType datosTransaccionPagoIn;

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
     * Gets the value of the datosTransaccionPagoIn property.
     *
     * @return
     *     possible object is
     *     {@link DatosTransaccionPagoInputMessageType }
     *
     */
    public DatosTransaccionPagoInputMessageType getDatosTransaccionPagoIn() {
        return datosTransaccionPagoIn;
    }

    /**
     * Sets the value of the datosTransaccionPagoIn property.
     *
     * @param value
     *     allowed object is
     *     {@link DatosTransaccionPagoInputMessageType }
     *
     */
    public void setDatosTransaccionPagoIn(DatosTransaccionPagoInputMessageType value) {
        this.datosTransaccionPagoIn = value;
    }

}
