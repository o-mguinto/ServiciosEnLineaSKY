
package mx.com.sky.enterpriseobjects.sel.consultarinformacionfiscal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.oracle.xmlns.pcbpel.adapter.db.dbconsultarinformacionfiscal.DBConsultarInformacionFiscalInputType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;


/**
 * <p>Java class for ConsultarInformacionFiscalRequestType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarInformacionFiscalRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/pcbpel/adapter/db/DBConsultarInformacionFiscal}DBConsultarInformacionFiscalInput"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarInformacionFiscalRequestType",
         propOrder = { "ebmHeaderRequest", "dbConsultarInformacionFiscalInput" })
public class ConsultarInformacionFiscalRequestType {

    @XmlElement(name = "EBMHeaderRequest", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "DBConsultarInformacionFiscalInput",
                namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/DBConsultarInformacionFiscal", required = true)
    protected DBConsultarInformacionFiscalInputType dbConsultarInformacionFiscalInput;

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
     * Gets the value of the dbConsultarInformacionFiscalInput property.
     *
     * @return
     *     possible object is
     *     {@link DBConsultarInformacionFiscalInputType }
     *
     */
    public DBConsultarInformacionFiscalInputType getDBConsultarInformacionFiscalInput() {
        return dbConsultarInformacionFiscalInput;
    }

    /**
     * Sets the value of the dbConsultarInformacionFiscalInput property.
     *
     * @param value
     *     allowed object is
     *     {@link DBConsultarInformacionFiscalInputType }
     *
     */
    public void setDBConsultarInformacionFiscalInput(DBConsultarInformacionFiscalInputType value) {
        this.dbConsultarInformacionFiscalInput = value;
    }

}
