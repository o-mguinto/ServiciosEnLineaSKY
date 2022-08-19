
package mx.com.sky.enterpriseobjects.sec.utilsofscprocessinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.oracle.xmlns.pcbpel.adapter.db.sp.dbutilsofscprocesssec.InputParameters;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;


/**
 * <p>Java class for UtilsOfscProcessRequestEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="UtilsOfscProcessRequestEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec}InputParameters"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UtilsOfscProcessRequestEBMType", propOrder = { "ebmHeaderRequest", "inputParameters" })
public class UtilsOfscProcessRequestEBMType {

    @XmlElement(name = "EBMHeaderRequest", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "InputParameters",
                namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", required = true)
    protected InputParameters inputParameters;

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
     * Gets the value of the inputParameters property.
     *
     * @return
     *     possible object is
     *     {@link InputParameters }
     *
     */
    public InputParameters getInputParameters() {
        return inputParameters;
    }

    /**
     * Sets the value of the inputParameters property.
     *
     * @param value
     *     allowed object is
     *     {@link InputParameters }
     *
     */
    public void setInputParameters(InputParameters value) {
        this.inputParameters = value;
    }

}
