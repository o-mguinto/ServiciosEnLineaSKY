
package mx.com.sky.enterpriseobjects.soa.consultacoberturainterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderResponseType;
import mx.com.sky.soasky.SCINTASConsultaCoberturaSalidaTYPE;


/**
 * <p>Java class for ConsultaCoberturaResponseEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultaCoberturaResponseEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/&gt;
 *         &lt;element ref="{http://www.sky.com.mx/soasky}SC_INT_AS_ConsultaCobertura_Salida"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaCoberturaResponseEBMType",
         propOrder = { "ebmHeaderResponse", "scintasConsultaCoberturaSalida" })
public class ConsultaCoberturaResponseEBMType {

    @XmlElement(name = "EBMHeaderResponse", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "SC_INT_AS_ConsultaCobertura_Salida", namespace = "http://www.sky.com.mx/soasky",
                required = true)
    protected SCINTASConsultaCoberturaSalidaTYPE scintasConsultaCoberturaSalida;

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
     * Gets the value of the scintasConsultaCoberturaSalida property.
     *
     * @return
     *     possible object is
     *     {@link SCINTASConsultaCoberturaSalidaTYPE }
     *
     */
    public SCINTASConsultaCoberturaSalidaTYPE getSCINTASConsultaCoberturaSalida() {
        return scintasConsultaCoberturaSalida;
    }

    /**
     * Sets the value of the scintasConsultaCoberturaSalida property.
     *
     * @param value
     *     allowed object is
     *     {@link SCINTASConsultaCoberturaSalidaTYPE }
     *
     */
    public void setSCINTASConsultaCoberturaSalida(SCINTASConsultaCoberturaSalidaTYPE value) {
        this.scintasConsultaCoberturaSalida = value;
    }

}
