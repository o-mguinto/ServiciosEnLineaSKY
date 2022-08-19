
package com.oracle.xmlns.pcbpel.adapter.db.dbconsultarinformacionfiscal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DBConsultarInformacionFiscalOutputType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DBConsultarInformacionFiscalOutputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PROCESO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ORIGEN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CUENTA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DESCRIPCION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="METODOENVIO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TIPOFACTURA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RAZONSOCIAL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CALLE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="COLONIA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MUNICIPIO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CIUDAD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CODIGOPOSTAL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ESTADO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NOMBREEXTERIOR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NOMBREINTERIOR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RFC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TIPOPERSONA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="REGIMENFISCAL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="USOCFDI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SISTEMAORIGEN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SOLICITUDSERVICIO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DBConsultarInformacionFiscalOutputType",
         propOrder =
         { "proceso", "origen", "cuenta", "descripcion", "metodoenvio", "tipofactura", "razonsocial", "calle",
           "colonia", "municipio", "ciudad", "codigopostal", "estado", "nombre", "numeroexterior", "numerointerior",
           "rfc", "tipopersona", "regimenfiscal", "usocfdi", "sistemaorigen", "solicitudservicio"
    })
public class DBConsultarInformacionFiscalOutputType {

    @XmlElement(name = "PROCESO", required = true, nillable = true)
    protected String proceso;
    @XmlElement(name = "ORIGEN", required = true, nillable = true)
    protected String origen;
    @XmlElement(name = "CUENTA", required = true, nillable = true)
    protected String cuenta;
    @XmlElement(name = "DESCRIPCION", required = true, nillable = true)
    protected String descripcion;
    @XmlElement(name = "METODOENVIO", required = true, nillable = true)
    protected String metodoenvio;
    @XmlElement(name = "TIPOFACTURA", required = true, nillable = true)
    protected String tipofactura;
    @XmlElement(name = "RAZONSOCIAL", required = true, nillable = true)
    protected String razonsocial;
    @XmlElement(name = "CALLE", required = true, nillable = true)
    protected String calle;
    @XmlElement(name = "COLONIA", required = true, nillable = true)
    protected String colonia;
    @XmlElement(name = "MUNICIPIO", required = true, nillable = true)
    protected String municipio;
    @XmlElement(name = "CIUDAD", required = true, nillable = true)
    protected String ciudad;
    @XmlElement(name = "CODIGOPOSTAL", required = true, nillable = true)
    protected String codigopostal;
    @XmlElement(name = "ESTADO", required = true, nillable = true)
    protected String estado;
    @XmlElement(name = "NOMBRE", required = true, nillable = true)
    protected String nombre;
    @XmlElement(name = "RFC", required = true, nillable = true)
    protected String rfc;
    @XmlElement(name = "TIPOPERSONA", required = true, nillable = true)
    protected String tipopersona;
    @XmlElement(name = "REGIMENFISCAL", required = true, nillable = true)
    protected String regimenfiscal;
    @XmlElement(name = "USOCFDI", required = true, nillable = true)
    protected String usocfdi;
    @XmlElement(name = "SISTEMAORIGEN", required = true, nillable = true)
    protected String sistemaorigen;
    @XmlElement(name = "SOLICITUDSERVICIO", required = true, nillable = true)
    protected String solicitudservicio;
    @XmlElement(name = "NUMEROEXTERIOR", required = true, nillable = true)
    protected String numeroexterior;
    @XmlElement(name = "NUMEROINTERIOR", required = true, nillable = true)
    protected String numerointerior;

    /**
     * Gets the value of the proceso property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPROCESO() {
        return proceso;
    }

    /**
     * Sets the value of the proceso property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPROCESO(String value) {
        this.proceso = value;
    }

    /**
     * Gets the value of the origen property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getORIGEN() {
        return origen;
    }

    /**
     * Sets the value of the origen property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setORIGEN(String value) {
        this.origen = value;
    }

    /**
     * Gets the value of the cuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCUENTA() {
        return cuenta;
    }

    /**
     * Sets the value of the cuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCUENTA(String value) {
        this.cuenta = value;
    }

    /**
     * Gets the value of the descripcion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDESCRIPCION() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDESCRIPCION(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the metodoenvio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMETODOENVIO() {
        return metodoenvio;
    }

    /**
     * Sets the value of the metodoenvio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMETODOENVIO(String value) {
        this.metodoenvio = value;
    }

    /**
     * Gets the value of the tipofactura property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTIPOFACTURA() {
        return tipofactura;
    }

    /**
     * Sets the value of the tipofactura property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTIPOFACTURA(String value) {
        this.tipofactura = value;
    }

    /**
     * Gets the value of the razonsocial property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRAZONSOCIAL() {
        return razonsocial;
    }

    /**
     * Sets the value of the razonsocial property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRAZONSOCIAL(String value) {
        this.razonsocial = value;
    }

    /**
     * Gets the value of the calle property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCALLE() {
        return calle;
    }

    /**
     * Sets the value of the calle property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCALLE(String value) {
        this.calle = value;
    }

    /**
     * Gets the value of the colonia property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCOLONIA() {
        return colonia;
    }

    /**
     * Sets the value of the colonia property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCOLONIA(String value) {
        this.colonia = value;
    }

    /**
     * Gets the value of the municipio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMUNICIPIO() {
        return municipio;
    }

    /**
     * Sets the value of the municipio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMUNICIPIO(String value) {
        this.municipio = value;
    }

    /**
     * Gets the value of the ciudad property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCIUDAD() {
        return ciudad;
    }

    /**
     * Sets the value of the ciudad property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCIUDAD(String value) {
        this.ciudad = value;
    }

    /**
     * Gets the value of the codigopostal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCODIGOPOSTAL() {
        return codigopostal;
    }

    /**
     * Sets the value of the codigopostal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCODIGOPOSTAL(String value) {
        this.codigopostal = value;
    }

    /**
     * Gets the value of the estado property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getESTADO() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setESTADO(String value) {
        this.estado = value;
    }

    /**
     * Gets the value of the nombre property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNOMBRE() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNOMBRE(String value) {
        this.nombre = value;
    }


    /**
     * Gets the value of the rfc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRFC() {
        return rfc;
    }

    /**
     * Sets the value of the rfc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRFC(String value) {
        this.rfc = value;
    }

    /**
     * Gets the value of the tipopersona property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTIPOPERSONA() {
        return tipopersona;
    }

    /**
     * Sets the value of the tipopersona property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTIPOPERSONA(String value) {
        this.tipopersona = value;
    }

    /**
     * Gets the value of the regimenfiscal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getREGIMENFISCAL() {
        return regimenfiscal;
    }

    /**
     * Sets the value of the regimenfiscal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setREGIMENFISCAL(String value) {
        this.regimenfiscal = value;
    }

    /**
     * Gets the value of the usocfdi property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUSOCFDI() {
        return usocfdi;
    }

    /**
     * Sets the value of the usocfdi property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUSOCFDI(String value) {
        this.usocfdi = value;
    }

    /**
     * Gets the value of the sistemaorigen property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSISTEMAORIGEN() {
        return sistemaorigen;
    }

    /**
     * Sets the value of the sistemaorigen property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSISTEMAORIGEN(String value) {
        this.sistemaorigen = value;
    }

    /**
     * Gets the value of the solicitudservicio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSOLICITUDSERVICIO() {
        return solicitudservicio;
    }

    /**
     * Sets the value of the solicitudservicio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSOLICITUDSERVICIO(String value) {
        this.solicitudservicio = value;
    }

    /**
     * Gets the value of the numeroexterior property.
     *
     * @return
     * possible object is
     * {@link String}
     *
     */
    public String getNUMEROEXTERIOR() {
        return numeroexterior;
    }

    /**
     * Gets the value of the numerointerior property.
     *
     * @return
     * possible object is
     * {@link String}
     *
     */
    public String getNUMEROINTERIOR() {
        return numerointerior;
    }

    /**
     * Sets the value of the numeroexterior property.
     *
     * @param value
     * allowed object is
     * {@link String}
     *
     */
    public void setNUMEROEXTERIOR(String value) {
        this.numeroexterior = value;
    }

    /**
     * Sets the value of the numerointerior property.
     *
     * @param value
     * allowed object is
     * {@link String}
     *
     */
    public void setNUMEROINTERIOR(String value) {
        this.numerointerior = value;
    }

}
