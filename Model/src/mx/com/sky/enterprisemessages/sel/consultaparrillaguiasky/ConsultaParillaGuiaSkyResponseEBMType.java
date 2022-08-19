
package mx.com.sky.enterprisemessages.sel.consultaparrillaguiasky;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderResponseType;


/**
 * <p>Java class for ConsultaParillaGuiaSkyResponseEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultaParillaGuiaSkyResponseEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/&gt;
 *         &lt;element name="ConsultaParrillaGuiaSkyResponseEBM" type="{http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky}ProgramacionesType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaParillaGuiaSkyResponseEBMType",
         propOrder = { "ebmHeaderResponse", "consultaParrillaGuiaSkyResponseEBM"
    })
public class ConsultaParillaGuiaSkyResponseEBMType {

    @XmlElement(name = "EBMHeaderResponse",
                namespace =
                "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "ConsultaParrillaGuiaSkyResponseEBM", required = true)
    protected ProgramacionesType consultaParrillaGuiaSkyResponseEBM;

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
     * Gets the value of the consultaParrillaGuiaSkyResponseEBM property.
     *
     * @return
     *     possible object is
     *     {@link ProgramacionesType }
     *
     */
    public ProgramacionesType getConsultaParrillaGuiaSkyResponseEBM() {
        return consultaParrillaGuiaSkyResponseEBM;
    }

    /**
     * Sets the value of the consultaParrillaGuiaSkyResponseEBM property.
     *
     * @param value
     *     allowed object is
     *     {@link ProgramacionesType }
     *
     */
    public void setConsultaParrillaGuiaSkyResponseEBM(ProgramacionesType value) {
        this.consultaParrillaGuiaSkyResponseEBM = value;
    }

}
