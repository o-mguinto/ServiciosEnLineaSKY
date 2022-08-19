
package mx.com.sky.enterpriseobjects.sel.consultarregimenfiscal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.oracle.xmlns.pcbpel.adapter.db.dbunificadoregimenfiscal.DBUnificadoregimenfiscalOutputCollectionType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderResponseType;


/**
 * <p>Java class for ConsultarRegimenFiscalResponseType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarRegimenFiscalResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/pcbpel/adapter/db/DBUnificadoregimenfiscal}DBUnificadoregimenfiscalOutputCollection"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarRegimenFiscalResponseType",
         propOrder = { "ebmHeaderResponse", "dbUnificadoregimenfiscalOutputCollection" })
public class ConsultarRegimenFiscalResponseType {

    @XmlElement(name = "EBMHeaderResponse", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "DBUnificadoregimenfiscalOutputCollection",
                namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/DBUnificadoregimenfiscal", required = true)
    protected DBUnificadoregimenfiscalOutputCollectionType dbUnificadoregimenfiscalOutputCollection;

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
     * Gets the value of the dbUnificadoregimenfiscalOutputCollection property.
     *
     * @return
     *     possible object is
     *     {@link DBUnificadoregimenfiscalOutputCollectionType }
     *
     */
    public DBUnificadoregimenfiscalOutputCollectionType getDBUnificadoregimenfiscalOutputCollection() {
        return dbUnificadoregimenfiscalOutputCollection;
    }

    /**
     * Sets the value of the dbUnificadoregimenfiscalOutputCollection property.
     *
     * @param value
     *     allowed object is
     *     {@link DBUnificadoregimenfiscalOutputCollectionType }
     *
     */
    public void setDBUnificadoregimenfiscalOutputCollection(DBUnificadoregimenfiscalOutputCollectionType value) {
        this.dbUnificadoregimenfiscalOutputCollection = value;
    }

}
