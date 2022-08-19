
package mx.com.sky.enterpriseobjects.soa.gestionacomponenteinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;
import mx.com.sky.siebelosb.GestionacomponenteEntradaTYPE;


/**
 * <p>Java class for GestionaComponenteRequestEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GestionaComponenteRequestEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/&gt;
 *         &lt;element ref="{http://www.sky.com.mx/SiebelOSB}Gestionacomponente_Entrada"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GestionaComponenteRequestEBMType", propOrder = { "ebmHeaderRequest", "gestionacomponenteEntrada" })
public class GestionaComponenteRequestEBMType {

    @XmlElement(name = "EBMHeaderRequest", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "Gestionacomponente_Entrada", namespace = "http://www.sky.com.mx/SiebelOSB", required = true)
    protected GestionacomponenteEntradaTYPE gestionacomponenteEntrada;

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
     * Gets the value of the gestionacomponenteEntrada property.
     *
     * @return
     *     possible object is
     *     {@link GestionacomponenteEntradaTYPE }
     *
     */
    public GestionacomponenteEntradaTYPE getGestionacomponenteEntrada() {
        return gestionacomponenteEntrada;
    }

    /**
     * Sets the value of the gestionacomponenteEntrada property.
     *
     * @param value
     *     allowed object is
     *     {@link GestionacomponenteEntradaTYPE }
     *
     */
    public void setGestionacomponenteEntrada(GestionacomponenteEntradaTYPE value) {
        this.gestionacomponenteEntrada = value;
    }

}
