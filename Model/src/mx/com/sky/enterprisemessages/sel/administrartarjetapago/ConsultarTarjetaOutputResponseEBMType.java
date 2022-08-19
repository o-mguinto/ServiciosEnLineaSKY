
package mx.com.sky.enterprisemessages.sel.administrartarjetapago;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderResponseType;


/**
 * <p>Java class for ConsultarTarjetaOutputResponseEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarTarjetaOutputResponseEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/&gt;
 *         &lt;element name="DatosConsultarTarjetaOutput" type="{http://www.sky.com.mx/EnterpriseMessages/Sel/AdministrarTarjetaPago}ConsultarTarjetasOutputType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarTarjetaOutputResponseEBMType",
         propOrder = { "ebmHeaderResponse", "datosConsultarTarjetaOutput"
    })
public class ConsultarTarjetaOutputResponseEBMType {

    @XmlElement(name = "EBMHeaderResponse",
                namespace =
                "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "DatosConsultarTarjetaOutput")
    protected List<ConsultarTarjetasOutputType> datosConsultarTarjetaOutput;

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
     * Gets the value of the datosConsultarTarjetaOutput property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datosConsultarTarjetaOutput property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatosConsultarTarjetaOutput().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultarTarjetasOutputType }
     *
     *
     */
    public List<ConsultarTarjetasOutputType> getDatosConsultarTarjetaOutput() {
        if (datosConsultarTarjetaOutput == null) {
            datosConsultarTarjetaOutput =
                new ArrayList<ConsultarTarjetasOutputType>();
        }
        return this.datosConsultarTarjetaOutput;
    }

}
