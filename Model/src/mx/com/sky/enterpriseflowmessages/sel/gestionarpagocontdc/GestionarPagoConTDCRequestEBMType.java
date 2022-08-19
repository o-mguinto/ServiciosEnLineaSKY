
package mx.com.sky.enterpriseflowmessages.sel.gestionarpagocontdc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;
import mx.com.sky.enterpriseobjects.sel.tarjetapagoebo.DatosTarjetaPagoType;


/**
 * <p>Java class for GestionarPagoConTDCRequestEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GestionarPagoConTDCRequestEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/TarjetaPagoEBO}DatosTarjetaPago"/&gt;
 *         &lt;element name="DatosTransaccionPagoIn" type="{http://www.sky.com.mx/EnterpriseFlowMessages/Sel/GestionarPagoConTDC}DatosTransaccionPagoInputMessageType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GestionarPagoConTDCRequestEBMType",
         propOrder =
         { "ebmHeaderRequest", "datosTarjetaPago", "datosTransaccionPagoIn"
    })
public class GestionarPagoConTDCRequestEBMType {

    @XmlElement(name = "EBMHeaderRequest",
                namespace =
                "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "DatosTarjetaPago",
                namespace =
                "http://www.sky.com.mx/EnterpriseObjects/Sel/TarjetaPagoEBO",
                required = true)
    protected DatosTarjetaPagoType datosTarjetaPago;
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
     * Gets the value of the datosTarjetaPago property.
     *
     * @return
     *     possible object is
     *     {@link DatosTarjetaPagoType }
     *
     */
    public DatosTarjetaPagoType getDatosTarjetaPago() {
        return datosTarjetaPago;
    }

    /**
     * Sets the value of the datosTarjetaPago property.
     *
     * @param value
     *     allowed object is
     *     {@link DatosTarjetaPagoType }
     *
     */
    public void setDatosTarjetaPago(DatosTarjetaPagoType value) {
        this.datosTarjetaPago = value;
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
