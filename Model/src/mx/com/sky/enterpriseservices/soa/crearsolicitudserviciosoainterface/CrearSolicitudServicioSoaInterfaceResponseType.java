
package mx.com.sky.enterpriseservices.soa.crearsolicitudserviciosoainterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderResponseType;
import mx.com.sky.siebelosb.creasolicitudservicio.CreaSolicitudServicioSalidaTYPE;


/**
 * <p>Java class for CrearSolicitudServicioSoaInterfaceResponseType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CrearSolicitudServicioSoaInterfaceResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/&gt;
 *         &lt;element ref="{http://www.sky.com.mx/SiebelOSB/CreaSolicitudServicio}CreaSolicitudServicio_Salida"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrearSolicitudServicioSoaInterfaceResponseType",
         propOrder = { "ebmHeaderResponse", "creaSolicitudServicioSalida" })
public class CrearSolicitudServicioSoaInterfaceResponseType {

    @XmlElement(name = "EBMHeaderResponse", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "CreaSolicitudServicio_Salida",
                namespace = "http://www.sky.com.mx/SiebelOSB/CreaSolicitudServicio", required = true)
    protected CreaSolicitudServicioSalidaTYPE creaSolicitudServicioSalida;

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
     * Gets the value of the creaSolicitudServicioSalida property.
     *
     * @return
     *     possible object is
     *     {@link CreaSolicitudServicioSalidaTYPE }
     *
     */
    public CreaSolicitudServicioSalidaTYPE getCreaSolicitudServicioSalida() {
        return creaSolicitudServicioSalida;
    }

    /**
     * Sets the value of the creaSolicitudServicioSalida property.
     *
     * @param value
     *     allowed object is
     *     {@link CreaSolicitudServicioSalidaTYPE }
     *
     */
    public void setCreaSolicitudServicioSalida(CreaSolicitudServicioSalidaTYPE value) {
        this.creaSolicitudServicioSalida = value;
    }

}
