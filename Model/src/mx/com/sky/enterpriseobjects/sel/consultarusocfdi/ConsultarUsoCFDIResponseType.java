
package mx.com.sky.enterpriseobjects.sel.consultarusocfdi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.oracle.xmlns.pcbpel.adapter.db.dbconsultarusocfdi.DBConsultarUsoCFDIOutputCollectionType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderResponseType;


/**
 * <p>Java class for ConsultarUsoCFDIResponseType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarUsoCFDIResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/pcbpel/adapter/db/DBConsultarUsoCFDI}DBConsultarUsoCFDIOutputCollection"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarUsoCFDIResponseType",
         propOrder = { "ebmHeaderResponse", "dbConsultarUsoCFDIOutputCollection" })
public class ConsultarUsoCFDIResponseType {

    @XmlElement(name = "EBMHeaderResponse", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "DBConsultarUsoCFDIOutputCollection",
                namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/DBConsultarUsoCFDI", required = true)
    protected DBConsultarUsoCFDIOutputCollectionType dbConsultarUsoCFDIOutputCollection;

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
     * Gets the value of the dbConsultarUsoCFDIOutputCollection property.
     *
     * @return
     *     possible object is
     *     {@link DBConsultarUsoCFDIOutputCollectionType }
     *
     */
    public DBConsultarUsoCFDIOutputCollectionType getDBConsultarUsoCFDIOutputCollection() {
        return dbConsultarUsoCFDIOutputCollection;
    }

    /**
     * Sets the value of the dbConsultarUsoCFDIOutputCollection property.
     *
     * @param value
     *     allowed object is
     *     {@link DBConsultarUsoCFDIOutputCollectionType }
     *
     */
    public void setDBConsultarUsoCFDIOutputCollection(DBConsultarUsoCFDIOutputCollectionType value) {
        this.dbConsultarUsoCFDIOutputCollection = value;
    }

}
