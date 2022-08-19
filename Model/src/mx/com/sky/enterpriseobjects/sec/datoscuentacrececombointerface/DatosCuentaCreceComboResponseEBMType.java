
package mx.com.sky.enterpriseobjects.sec.datoscuentacrececombointerface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.oracle.xmlns.pcbpel.adapter.db.sp.dbdatoscuentacrececombosec.OutputParameters;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderResponseType;


/**
 * <p>Java class for DatosCuentaCreceComboResponseEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DatosCuentaCreceComboResponseEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec}OutputParameters"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosCuentaCreceComboResponseEBMType", propOrder = { "ebmHeaderResponse", "outputParameters" })
public class DatosCuentaCreceComboResponseEBMType {

    @XmlElement(name = "EBMHeaderResponse", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "OutputParameters",
                namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec", required = true)
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
