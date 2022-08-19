
package mx.com.sky.enterprisemessages.sel.paqadicionaldatos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderResponseType;
import mx.com.sky.enterpriseobjects.sel.paqadicionaldatos.PaquetesAdicionalesDatosListType;


/**
 * <p>Java class for ConsultarPaqAdicionalDatosResponseEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarPaqAdicionalDatosResponseEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/&gt;
 *         &lt;element name="PaquetesAdicionalesDatos" type="{http://www.sky.com.mx/EnterpriseObjects/Sel/PaqAdicionalDatos}PaquetesAdicionalesDatosListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarPaqAdicionalDatosResponseEBMType",
         propOrder = { "ebmHeaderResponse", "paquetesAdicionalesDatos"
    })
public class ConsultarPaqAdicionalDatosResponseEBMType {

    @XmlElement(name = "EBMHeaderResponse",
                namespace =
                "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "PaquetesAdicionalesDatos", required = true)
    protected PaquetesAdicionalesDatosListType paquetesAdicionalesDatos;

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
     * Gets the value of the paquetesAdicionalesDatos property.
     *
     * @return
     *     possible object is
     *     {@link PaquetesAdicionalesDatosListType }
     *
     */
    public PaquetesAdicionalesDatosListType getPaquetesAdicionalesDatos() {
        return paquetesAdicionalesDatos;
    }

    /**
     * Sets the value of the paquetesAdicionalesDatos property.
     *
     * @param value
     *     allowed object is
     *     {@link PaquetesAdicionalesDatosListType }
     *
     */
    public void setPaquetesAdicionalesDatos(PaquetesAdicionalesDatosListType value) {
        this.paquetesAdicionalesDatos = value;
    }

}
