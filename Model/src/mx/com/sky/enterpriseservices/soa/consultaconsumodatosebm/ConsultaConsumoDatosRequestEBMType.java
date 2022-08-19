
package mx.com.sky.enterpriseservices.soa.consultaconsumodatosebm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;
import mx.com.sky.soasky.SCINTASConsultaConsumoDatosEntradaTYPE;


/**
 * <p>Java class for ConsultaConsumoDatosRequestEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultaConsumoDatosRequestEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/&gt;
 *         &lt;element ref="{http://www.sky.com.mx/soasky}SC_INT_AS_ConsultaConsumoDatos_Entrada"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaConsumoDatosRequestEBMType",
         propOrder = { "ebmHeaderRequest", "scintasConsultaConsumoDatosEntrada" })
public class ConsultaConsumoDatosRequestEBMType {

    @XmlElement(name = "EBMHeaderRequest", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "SC_INT_AS_ConsultaConsumoDatos_Entrada", namespace = "http://www.sky.com.mx/soasky",
                required = true)
    protected SCINTASConsultaConsumoDatosEntradaTYPE scintasConsultaConsumoDatosEntrada;

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
     * Gets the value of the scintasConsultaConsumoDatosEntrada property.
     *
     * @return
     *     possible object is
     *     {@link SCINTASConsultaConsumoDatosEntradaTYPE }
     *
     */
    public SCINTASConsultaConsumoDatosEntradaTYPE getSCINTASConsultaConsumoDatosEntrada() {
        return scintasConsultaConsumoDatosEntrada;
    }

    /**
     * Sets the value of the scintasConsultaConsumoDatosEntrada property.
     *
     * @param value
     *     allowed object is
     *     {@link SCINTASConsultaConsumoDatosEntradaTYPE }
     *
     */
    public void setSCINTASConsultaConsumoDatosEntrada(SCINTASConsultaConsumoDatosEntradaTYPE value) {
        this.scintasConsultaConsumoDatosEntrada = value;
    }

}
