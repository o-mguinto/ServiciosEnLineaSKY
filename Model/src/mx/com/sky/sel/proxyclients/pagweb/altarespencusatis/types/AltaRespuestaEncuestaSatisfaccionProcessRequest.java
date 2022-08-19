
package mx.com.sky.sel.proxyclients.pagweb.altarespencusatis.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListaResultadoEncuestaSatisfaccion" type="{http://xmlns.oracle.com/AltaRespuestaEncuestaSatisfaccion}ResultadoEncuestaSatisfaccionCollection"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "listaResultadoEncuestaSatisfaccion" })
@XmlRootElement(name = "AltaRespuestaEncuestaSatisfaccionProcessRequest")
public class AltaRespuestaEncuestaSatisfaccionProcessRequest {

    @XmlElement(name = "ListaResultadoEncuestaSatisfaccion", required = true)
    protected ResultadoEncuestaSatisfaccionCollection listaResultadoEncuestaSatisfaccion;

    /**
     * Gets the value of the listaResultadoEncuestaSatisfaccion property.
     *
     * @return
     *     possible object is
     *     {@link ResultadoEncuestaSatisfaccionCollection }
     *
     */
    public ResultadoEncuestaSatisfaccionCollection getListaResultadoEncuestaSatisfaccion() {
        return listaResultadoEncuestaSatisfaccion;
    }

    /**
     * Sets the value of the listaResultadoEncuestaSatisfaccion property.
     *
     * @param value
     *     allowed object is
     *     {@link ResultadoEncuestaSatisfaccionCollection }
     *
     */
    public void setListaResultadoEncuestaSatisfaccion(ResultadoEncuestaSatisfaccionCollection value) {
        this.listaResultadoEncuestaSatisfaccion = value;
    }

}
