
package mx.com.sky.enterpriseobjects.soa.gestionacomponenteinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderResponseType;
import mx.com.sky.siebelosb.GestionacomponenteSalidaTYPE;


/**
 * <p>Java class for GestionaComponenteResponseEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GestionaComponenteResponseEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/&gt;
 *         &lt;element ref="{http://www.sky.com.mx/SiebelOSB}Gestionacomponente_Salida"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GestionaComponenteResponseEBMType", propOrder = { "ebmHeaderResponse", "gestionacomponenteSalida" })
public class GestionaComponenteResponseEBMType {

    @XmlElement(name = "EBMHeaderResponse", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "Gestionacomponente_Salida", namespace = "http://www.sky.com.mx/SiebelOSB", required = true)
    protected GestionacomponenteSalidaTYPE gestionacomponenteSalida;

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
     * Gets the value of the gestionacomponenteSalida property.
     *
     * @return
     *     possible object is
     *     {@link GestionacomponenteSalidaTYPE }
     *
     */
    public GestionacomponenteSalidaTYPE getGestionacomponenteSalida() {
        return gestionacomponenteSalida;
    }

    /**
     * Sets the value of the gestionacomponenteSalida property.
     *
     * @param value
     *     allowed object is
     *     {@link GestionacomponenteSalidaTYPE }
     *
     */
    public void setGestionacomponenteSalida(GestionacomponenteSalidaTYPE value) {
        this.gestionacomponenteSalida = value;
    }

}
