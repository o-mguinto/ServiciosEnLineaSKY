
package mx.com.sky.enterprisemessages.sel.consultaparrillaguiasky;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProgramacionesType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ProgramacionesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Programaciones" type="{http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky}Programaciones"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgramacionesType", propOrder = { "programaciones" })
public class ProgramacionesType {

    @XmlElement(name = "Programaciones", required = true)
    protected Programaciones programaciones;

    /**
     * Gets the value of the programaciones property.
     *
     * @return
     *     possible object is
     *     {@link Programaciones }
     *
     */
    public Programaciones getProgramaciones() {
        return programaciones;
    }

    /**
     * Sets the value of the programaciones property.
     *
     * @param value
     *     allowed object is
     *     {@link Programaciones }
     *
     */
    public void setProgramaciones(Programaciones value) {
        this.programaciones = value;
    }

}
