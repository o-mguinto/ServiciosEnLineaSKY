
package com.oracle.xmlns.pcbpel.adapter.db.dbunificadoregimenfiscal;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DBUnificadoregimenfiscalOutputCollectionType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DBUnificadoregimenfiscalOutputCollectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DBUnificadoregimenfiscalOutput" type="{http://xmlns.oracle.com/pcbpel/adapter/db/DBUnificadoregimenfiscal}DBUnificadoregimenfiscalOutputType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DBUnificadoregimenfiscalOutputCollectionType", propOrder = { "dbUnificadoregimenfiscalOutput" })
public class DBUnificadoregimenfiscalOutputCollectionType {

    @XmlElement(name = "DBUnificadoregimenfiscalOutput")
    protected List<DBUnificadoregimenfiscalOutputType> dbUnificadoregimenfiscalOutput;

    /**
     * Gets the value of the dbUnificadoregimenfiscalOutput property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dbUnificadoregimenfiscalOutput property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDBUnificadoregimenfiscalOutput().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DBUnificadoregimenfiscalOutputType }
     *
     *
     */
    public List<DBUnificadoregimenfiscalOutputType> getDBUnificadoregimenfiscalOutput() {
        if (dbUnificadoregimenfiscalOutput == null) {
            dbUnificadoregimenfiscalOutput = new ArrayList<DBUnificadoregimenfiscalOutputType>();
        }
        return this.dbUnificadoregimenfiscalOutput;
    }

}
