
package com.oracle.xmlns.pcbpel.adapter.db.dbconsultarinformacionfiscal;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DBConsultarInformacionFiscalOutputCollectionType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DBConsultarInformacionFiscalOutputCollectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DBConsultarInformacionFiscalOutput" type="{http://xmlns.oracle.com/pcbpel/adapter/db/DBConsultarInformacionFiscal}DBConsultarInformacionFiscalOutputType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DBConsultarInformacionFiscalOutputCollectionType",
         propOrder = { "dbConsultarInformacionFiscalOutput" })
public class DBConsultarInformacionFiscalOutputCollectionType {

    @XmlElement(name = "DBConsultarInformacionFiscalOutput")
    protected List<DBConsultarInformacionFiscalOutputType> dbConsultarInformacionFiscalOutput;

    /**
     * Gets the value of the dbConsultarInformacionFiscalOutput property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dbConsultarInformacionFiscalOutput property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDBConsultarInformacionFiscalOutput().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DBConsultarInformacionFiscalOutputType }
     *
     *
     */
    public List<DBConsultarInformacionFiscalOutputType> getDBConsultarInformacionFiscalOutput() {
        if (dbConsultarInformacionFiscalOutput == null) {
            dbConsultarInformacionFiscalOutput = new ArrayList<DBConsultarInformacionFiscalOutputType>();
        }
        return this.dbConsultarInformacionFiscalOutput;
    }

}
