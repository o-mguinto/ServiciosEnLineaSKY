
package mx.com.sky.soasky;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CatalogoProductos_consultaSaldoProducto_Salida_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CatalogoProductos_consultaSaldoProducto_Salida_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CABECERA" type="{http://www.sky.com.mx/soasky}Cabecera_Salida_TYPE"/&gt;
 *         &lt;element name="NUMERO_CUENTA" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="SALDO_ACTUAL" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="MONTO_DIFERENCIA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LISTA_PRODUCTOS" type="{http://www.sky.com.mx/soasky}Lista_Productos_consultaSaldoProducto_Salida_TYPE"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogoProductos_consultaSaldoProducto_Salida_TYPE",
         propOrder = { "cabecera", "numerocuenta", "saldoactual", "montodiferencia", "listaproductos"
    })
public class CatalogoProductosConsultaSaldoProductoSalidaTYPE {

    @XmlElement(name = "CABECERA", required = true)
    protected CabeceraSalidaTYPE cabecera;
    @XmlElement(name = "NUMERO_CUENTA", required = true)
    protected BigDecimal numerocuenta;
    @XmlElement(name = "SALDO_ACTUAL", required = true)
    protected String saldoactual;
    @XmlElement(name = "MONTO_DIFERENCIA", required = true)
    protected String montodiferencia;
    @XmlElement(name = "LISTA_PRODUCTOS", required = true)
    protected ListaProductosConsultaSaldoProductoSalidaTYPE listaproductos;

    /**
     * Gets the value of the cabecera property.
     *
     * @return
     *     possible object is
     *     {@link CabeceraSalidaTYPE }
     *
     */
    public CabeceraSalidaTYPE getCABECERA() {
        return cabecera;
    }

    /**
     * Sets the value of the cabecera property.
     *
     * @param value
     *     allowed object is
     *     {@link CabeceraSalidaTYPE }
     *
     */
    public void setCABECERA(CabeceraSalidaTYPE value) {
        this.cabecera = value;
    }

    /**
     * Gets the value of the numerocuenta property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getNUMEROCUENTA() {
        return numerocuenta;
    }

    /**
     * Sets the value of the numerocuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setNUMEROCUENTA(BigDecimal value) {
        this.numerocuenta = value;
    }

    /**
     * Gets the value of the saldoactual property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public String getSALDOACTUAL() {
        return saldoactual;
    }

    /**
     * Sets the value of the saldoactual property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setSALDOACTUAL(String value) {
        this.saldoactual = value;
    }

    /**
     * Gets the value of the montodiferencia property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMONTODIFERENCIA() {
        return montodiferencia;
    }

    /**
     * Sets the value of the montodiferencia property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMONTODIFERENCIA(String value) {
        this.montodiferencia = value;
    }

    /**
     * Gets the value of the listaproductos property.
     *
     * @return
     *     possible object is
     *     {@link ListaProductosConsultaSaldoProductoSalidaTYPE }
     *
     */
    public ListaProductosConsultaSaldoProductoSalidaTYPE getLISTAPRODUCTOS() {
        return listaproductos;
    }

    /**
     * Sets the value of the listaproductos property.
     *
     * @param value
     *     allowed object is
     *     {@link ListaProductosConsultaSaldoProductoSalidaTYPE }
     *
     */
    public void setLISTAPRODUCTOS(ListaProductosConsultaSaldoProductoSalidaTYPE value) {
        this.listaproductos = value;
    }

}
