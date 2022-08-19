
package mx.com.sky.enterpriseobjects.sel.consultarinformacionfiscal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.oracle.xmlns.pcbpel.adapter.db.dbconsultarinformacionfiscal.DBConsultarInformacionFiscalOutputCollectionType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderResponseType;


/**
 * <p>Java class for ConsultarInformacionFiscalResponseType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarInformacionFiscalResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/pcbpel/adapter/db/DBConsultarInformacionFiscal}DBConsultarInformacionFiscalOutputCollection"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarInformacionFiscalResponseType",
         propOrder = { "ebmHeaderResponse", "dbConsultarInformacionFiscalOutputCollection" })
public class ConsultarInformacionFiscalResponseType {

    @XmlElement(name = "EBMHeaderResponse", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "DBConsultarInformacionFiscalOutputCollection",
                namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/DBConsultarInformacionFiscal", required = true)
    protected DBConsultarInformacionFiscalOutputCollectionType dbConsultarInformacionFiscalOutputCollection;

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
     * Gets the value of the dbConsultarInformacionFiscalOutputCollection property.
     *
     * @return
     *     possible object is
     *     {@link DBConsultarInformacionFiscalOutputCollectionType }
     *
     */
    public DBConsultarInformacionFiscalOutputCollectionType getDBConsultarInformacionFiscalOutputCollection() {
        return dbConsultarInformacionFiscalOutputCollection;
    }

    /**
     * Sets the value of the dbConsultarInformacionFiscalOutputCollection property.
     *
     * @param value
     *     allowed object is
     *     {@link DBConsultarInformacionFiscalOutputCollectionType }
     *
     */
    public void setDBConsultarInformacionFiscalOutputCollection(DBConsultarInformacionFiscalOutputCollectionType value) {
        this.dbConsultarInformacionFiscalOutputCollection = value;
    }

}
