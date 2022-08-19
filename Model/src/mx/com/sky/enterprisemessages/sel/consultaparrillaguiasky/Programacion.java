
package mx.com.sky.enterprisemessages.sel.consultaparrillaguiasky;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Programacion complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Programacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Canal" type="{http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky}Canal"/&gt;
 *         &lt;element name="Eventos" type="{http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky}Eventos"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Programacion", propOrder = { "canal", "eventos" })
public class Programacion {

    @XmlElement(name = "Canal", required = true)
    protected Canal canal;
    @XmlElement(name = "Eventos", required = true)
    protected Eventos eventos;

    /**
     * Gets the value of the canal property.
     *
     * @return
     *     possible object is
     *     {@link Canal }
     *
     */
    public Canal getCanal() {
        return canal;
    }

    /**
     * Sets the value of the canal property.
     *
     * @param value
     *     allowed object is
     *     {@link Canal }
     *
     */
    public void setCanal(Canal value) {
        this.canal = value;
    }

    /**
     * Gets the value of the eventos property.
     *
     * @return
     *     possible object is
     *     {@link Eventos }
     *
     */
    public Eventos getEventos() {
        return eventos;
    }

    /**
     * Sets the value of the eventos property.
     *
     * @param value
     *     allowed object is
     *     {@link Eventos }
     *
     */
    public void setEventos(Eventos value) {
        this.eventos = value;
    }

}
