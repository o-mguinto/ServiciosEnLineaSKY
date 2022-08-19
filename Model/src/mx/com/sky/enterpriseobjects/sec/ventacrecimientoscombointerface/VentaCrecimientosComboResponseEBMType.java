
package mx.com.sky.enterpriseobjects.sec.ventacrecimientoscombointerface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.oracle.xmlns.pcbpel.adapter.db.sp.dbventacrecimientoscombosec.OutputParameters;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderResponseType;


/**
 * <p>Java class for VentaCrecimientosComboResponseEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="VentaCrecimientosComboResponseEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec}OutputParameters"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VentaCrecimientosComboResponseEBMType", propOrder = { "ebmHeaderResponse", "outputParameters" })
public class VentaCrecimientosComboResponseEBMType {

    @XmlElement(name = "EBMHeaderResponse", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "OutputParameters",
                namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec", required = true)
    protected OutputParameters outputParameters;

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
     * Gets the value of the outputParameters property.
     *
     * @return
     *     possible object is
     *     {@link OutputParameters }
     *
     */
    public OutputParameters getOutputParameters() {
        return outputParameters;
    }

    /**
     * Sets the value of the outputParameters property.
     *
     * @param value
     *     allowed object is
     *     {@link OutputParameters }
     *
     */
    public void setOutputParameters(OutputParameters value) {
        this.outputParameters = value;
    }

}
