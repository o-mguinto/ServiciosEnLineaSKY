
package mx.com.sky.sel.proxyclients.soainterface.consultappvcontratados.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EBMHeaderRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EBMHeaderRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Operacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SistemaOrigen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ParametroList" type="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}ParametroListType" minOccurs="0"/>
 *         &lt;element name="SeguridadList" type="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}SeguridadListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EBMHeaderRequestType", propOrder = {
    "operacion",
    "sistemaOrigen",
    "parametroList",
    "seguridadList"
})
public class EBMHeaderRequestType {

    @XmlElement(name = "Operacion", required = true)
    protected String operacion;
    @XmlElement(name = "SistemaOrigen", required = true)
    protected String sistemaOrigen;
    @XmlElement(name = "ParametroList")
    protected ParametroListType parametroList;
    @XmlElement(name = "SeguridadList")
    protected SeguridadListType seguridadList;

    /**
     * Gets the value of the operacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     * Sets the value of the operacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperacion(String value) {
        this.operacion = value;
    }

    /**
     * Gets the value of the sistemaOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistemaOrigen() {
        return sistemaOrigen;
    }

    /**
     * Sets the value of the sistemaOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistemaOrigen(String value) {
        this.sistemaOrigen = value;
    }

    /**
     * Gets the value of the parametroList property.
     * 
     * @return
     *     possible object is
     *     {@link ParametroListType }
     *     
     */
    public ParametroListType getParametroList() {
        return parametroList;
    }

    /**
     * Sets the value of the parametroList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametroListType }
     *     
     */
    public void setParametroList(ParametroListType value) {
        this.parametroList = value;
    }

    /**
     * Gets the value of the seguridadList property.
     * 
     * @return
     *     possible object is
     *     {@link SeguridadListType }
     *     
     */
    public SeguridadListType getSeguridadList() {
        return seguridadList;
    }

    /**
     * Sets the value of the seguridadList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeguridadListType }
     *     
     */
    public void setSeguridadList(SeguridadListType value) {
        this.seguridadList = value;
    }

}
