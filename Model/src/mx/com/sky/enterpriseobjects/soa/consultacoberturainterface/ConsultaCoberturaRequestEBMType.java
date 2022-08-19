
package mx.com.sky.enterpriseobjects.soa.consultacoberturainterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;
import mx.com.sky.soasky.SCINTASConsultaCoberturaEntradaTYPE;


/**
 * <p>Java class for ConsultaCoberturaRequestEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultaCoberturaRequestEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/&gt;
 *         &lt;element ref="{http://www.sky.com.mx/soasky}SC_INT_AS_ConsultaCobertura_Entrada"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaCoberturaRequestEBMType",
         propOrder = { "ebmHeaderRequest", "scintasConsultaCoberturaEntrada" })
public class ConsultaCoberturaRequestEBMType {

    @XmlElement(name = "EBMHeaderRequest", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "SC_INT_AS_ConsultaCobertura_Entrada", namespace = "http://www.sky.com.mx/soasky",
                required = true)
    protected SCINTASConsultaCoberturaEntradaTYPE scintasConsultaCoberturaEntrada;

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
     * Gets the value of the scintasConsultaCoberturaEntrada property.
     *
     * @return
     *     possible object is
     *     {@link SCINTASConsultaCoberturaEntradaTYPE }
     *
     */
    public SCINTASConsultaCoberturaEntradaTYPE getSCINTASConsultaCoberturaEntrada() {
        return scintasConsultaCoberturaEntrada;
    }

    /**
     * Sets the value of the scintasConsultaCoberturaEntrada property.
     *
     * @param value
     *     allowed object is
     *     {@link SCINTASConsultaCoberturaEntradaTYPE }
     *
     */
    public void setSCINTASConsultaCoberturaEntrada(SCINTASConsultaCoberturaEntradaTYPE value) {
        this.scintasConsultaCoberturaEntrada = value;
    }

}
