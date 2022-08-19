
package mx.com.sky.enterpriseobjects.sec.common.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EBMHeaderResponseType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="EBMHeaderResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorTecnico" type="{http://www.sky.com.mx/EnterpriseObjects/Sec/Common/V1}ErrorTecnicoType"/&gt;
 *         &lt;element name="ErrorNegocio" type="{http://www.sky.com.mx/EnterpriseObjects/Sec/Common/V1}ErrorNegocioType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EBMHeaderResponseType", propOrder = { "errorTecnico", "errorNegocio" })
public class EBMHeaderResponseType {

    @XmlElement(name = "ErrorTecnico", required = true)
    protected ErrorTecnicoType errorTecnico;
    @XmlElement(name = "ErrorNegocio", required = true)
    protected ErrorNegocioType errorNegocio;

    /**
     * Gets the value of the errorTecnico property.
     *
     * @return
     *     possible object is
     *     {@link ErrorTecnicoType }
     *
     */
    public ErrorTecnicoType getErrorTecnico() {
        return errorTecnico;
    }

    /**
     * Sets the value of the errorTecnico property.
     *
     * @param value
     *     allowed object is
     *     {@link ErrorTecnicoType }
     *
     */
    public void setErrorTecnico(ErrorTecnicoType value) {
        this.errorTecnico = value;
    }

    /**
     * Gets the value of the errorNegocio property.
     *
     * @return
     *     possible object is
     *     {@link ErrorNegocioType }
     *
     */
    public ErrorNegocioType getErrorNegocio() {
        return errorNegocio;
    }

    /**
     * Sets the value of the errorNegocio property.
     *
     * @param value
     *     allowed object is
     *     {@link ErrorNegocioType }
     *
     */
    public void setErrorNegocio(ErrorNegocioType value) {
        this.errorNegocio = value;
    }

}
