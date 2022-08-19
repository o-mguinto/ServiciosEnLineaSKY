
package com.oracle.xmlns.pcbpel.adapter.db.dbvalidarpreregistrosel;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DbValidarPreRegistroSelOutputCollection complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DbValidarPreRegistroSelOutputCollection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DbValidarPreRegistroSelOutput" type="{http://xmlns.oracle.com/pcbpel/adapter/db/DbValidarPreRegistroSel}DbValidarPreRegistroSelOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DbValidarPreRegistroSelOutputCollection", propOrder = { "dbValidarPreRegistroSelOutput" })
public class DbValidarPreRegistroSelOutputCollection {

    @XmlElement(name = "DbValidarPreRegistroSelOutput")
    protected List<DbValidarPreRegistroSelOutput> dbValidarPreRegistroSelOutput;

    /**
     * Gets the value of the dbValidarPreRegistroSelOutput property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dbValidarPreRegistroSelOutput property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDbValidarPreRegistroSelOutput().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DbValidarPreRegistroSelOutput }
     *
     *
     */
    public List<DbValidarPreRegistroSelOutput> getDbValidarPreRegistroSelOutput() {
        if (dbValidarPreRegistroSelOutput == null) {
            dbValidarPreRegistroSelOutput = new ArrayList<DbValidarPreRegistroSelOutput>();
        }
        return this.dbValidarPreRegistroSelOutput;
    }

}
