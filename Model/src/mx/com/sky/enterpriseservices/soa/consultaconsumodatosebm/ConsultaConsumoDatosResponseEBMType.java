
package mx.com.sky.enterpriseservices.soa.consultaconsumodatosebm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderResponseType;
import mx.com.sky.soasky.SCINTASConsultaConsumoDatosSalidaTYPE;


/**
 * <p>Java class for ConsultaConsumoDatosResponseEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultaConsumoDatosResponseEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/&gt;
 *         &lt;element ref="{http://www.sky.com.mx/soasky}SC_INT_AS_ConsultaConsumoDatos_Salida"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaConsumoDatosResponseEBMType",
         propOrder = { "ebmHeaderResponse", "scintasConsultaConsumoDatosSalida" })
public class ConsultaConsumoDatosResponseEBMType {

    @XmlElement(name = "EBMHeaderResponse", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "SC_INT_AS_ConsultaConsumoDatos_Salida", namespace = "http://www.sky.com.mx/soasky",
                required = true)
    protected SCINTASConsultaConsumoDatosSalidaTYPE scintasConsultaConsumoDatosSalida;

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
     * Gets the value of the scintasConsultaConsumoDatosSalida property.
     *
     * @return
     *     possible object is
     *     {@link SCINTASConsultaConsumoDatosSalidaTYPE }
     *
     */
    public SCINTASConsultaConsumoDatosSalidaTYPE getSCINTASConsultaConsumoDatosSalida() {
        return scintasConsultaConsumoDatosSalida;
    }

    /**
     * Sets the value of the scintasConsultaConsumoDatosSalida property.
     *
     * @param value
     *     allowed object is
     *     {@link SCINTASConsultaConsumoDatosSalidaTYPE }
     *
     */
    public void setSCINTASConsultaConsumoDatosSalida(SCINTASConsultaConsumoDatosSalidaTYPE value) {
        this.scintasConsultaConsumoDatosSalida = value;
    }

}
