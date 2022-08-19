
package mx.com.sky.enterpriseobjects.soa.consultapreciorecargainterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;
import mx.com.sky.soasky.RecargaConsultaPrecioRecargaEntradaTYPE;


/**
 * <p>Java class for ConsultaPrecioRecargaEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultaPrecioRecargaEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/&gt;
 *         &lt;element ref="{http://www.sky.com.mx/soasky}Recarga_consultaPrecioRecarga_Entrada"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaPrecioRecargaEBMType",
         propOrder = { "ebmHeaderRequest", "recargaConsultaPrecioRecargaEntrada"
    })
public class ConsultaPrecioRecargaEBMType {

    @XmlElement(name = "EBMHeaderRequest",
                namespace =
                "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "Recarga_consultaPrecioRecarga_Entrada",
                namespace = "http://www.sky.com.mx/soasky", required = true)
    protected RecargaConsultaPrecioRecargaEntradaTYPE recargaConsultaPrecioRecargaEntrada;

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
     * Gets the value of the recargaConsultaPrecioRecargaEntrada property.
     *
     * @return
     *     possible object is
     *     {@link RecargaConsultaPrecioRecargaEntradaTYPE }
     *
     */
    public RecargaConsultaPrecioRecargaEntradaTYPE getRecargaConsultaPrecioRecargaEntrada() {
        return recargaConsultaPrecioRecargaEntrada;
    }

    /**
     * Sets the value of the recargaConsultaPrecioRecargaEntrada property.
     *
     * @param value
     *     allowed object is
     *     {@link RecargaConsultaPrecioRecargaEntradaTYPE }
     *
     */
    public void setRecargaConsultaPrecioRecargaEntrada(RecargaConsultaPrecioRecargaEntradaTYPE value) {
        this.recargaConsultaPrecioRecargaEntrada = value;
    }

}
