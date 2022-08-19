
package mx.com.sky.enterpriseobjects.soa.consultapreciorecargainterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderResponseType;
import mx.com.sky.soasky.RecargaConsultaPrecioRecargaSalidaTYPE;


/**
 * <p>Java class for ConsultaPrecioRecargaResponseEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultaPrecioRecargaResponseEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/&gt;
 *         &lt;element ref="{http://www.sky.com.mx/soasky}Recarga_consultaPrecioRecarga_Salida"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaPrecioRecargaResponseEBMType",
         propOrder = { "ebmHeaderResponse", "recargaConsultaPrecioRecargaSalida"
    })
public class ConsultaPrecioRecargaResponseEBMType {

    @XmlElement(name = "EBMHeaderResponse",
                namespace =
                "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "Recarga_consultaPrecioRecarga_Salida",
                namespace = "http://www.sky.com.mx/soasky", required = true)
    protected RecargaConsultaPrecioRecargaSalidaTYPE recargaConsultaPrecioRecargaSalida;

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
     * Gets the value of the recargaConsultaPrecioRecargaSalida property.
     *
     * @return
     *     possible object is
     *     {@link RecargaConsultaPrecioRecargaSalidaTYPE }
     *
     */
    public RecargaConsultaPrecioRecargaSalidaTYPE getRecargaConsultaPrecioRecargaSalida() {
        return recargaConsultaPrecioRecargaSalida;
    }

    /**
     * Sets the value of the recargaConsultaPrecioRecargaSalida property.
     *
     * @param value
     *     allowed object is
     *     {@link RecargaConsultaPrecioRecargaSalidaTYPE }
     *
     */
    public void setRecargaConsultaPrecioRecargaSalida(RecargaConsultaPrecioRecargaSalidaTYPE value) {
        this.recargaConsultaPrecioRecargaSalida = value;
    }

}
