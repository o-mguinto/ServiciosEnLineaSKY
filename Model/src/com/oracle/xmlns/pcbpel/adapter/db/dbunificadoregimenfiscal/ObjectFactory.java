
package com.oracle.xmlns.pcbpel.adapter.db.dbunificadoregimenfiscal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.oracle.xmlns.pcbpel.adapter.db.dbunificadoregimenfiscal package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DBUnificadoregimenfiscalInput_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/DBUnificadoregimenfiscal",
                  "DBUnificadoregimenfiscalInput");
    private final static QName _DBUnificadoregimenfiscalOutputCollection_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/DBUnificadoregimenfiscal",
                  "DBUnificadoregimenfiscalOutputCollection");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.pcbpel.adapter.db.dbunificadoregimenfiscal
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DBUnificadoregimenfiscalInputType }
     *
     */
    public DBUnificadoregimenfiscalInputType createDBUnificadoregimenfiscalInputType() {
        return new DBUnificadoregimenfiscalInputType();
    }

    /**
     * Create an instance of {@link DBUnificadoregimenfiscalOutputCollectionType }
     *
     */
    public DBUnificadoregimenfiscalOutputCollectionType createDBUnificadoregimenfiscalOutputCollectionType() {
        return new DBUnificadoregimenfiscalOutputCollectionType();
    }

    /**
     * Create an instance of {@link DBUnificadoregimenfiscalOutputType }
     *
     */
    public DBUnificadoregimenfiscalOutputType createDBUnificadoregimenfiscalOutputType() {
        return new DBUnificadoregimenfiscalOutputType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DBUnificadoregimenfiscalInputType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/DBUnificadoregimenfiscal",
                    name = "DBUnificadoregimenfiscalInput")
    public JAXBElement<DBUnificadoregimenfiscalInputType> createDBUnificadoregimenfiscalInput(DBUnificadoregimenfiscalInputType value) {
        return new JAXBElement<DBUnificadoregimenfiscalInputType>(_DBUnificadoregimenfiscalInput_QNAME,
                                                                  DBUnificadoregimenfiscalInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DBUnificadoregimenfiscalOutputCollectionType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/DBUnificadoregimenfiscal",
                    name = "DBUnificadoregimenfiscalOutputCollection")
    public JAXBElement<DBUnificadoregimenfiscalOutputCollectionType> createDBUnificadoregimenfiscalOutputCollection(DBUnificadoregimenfiscalOutputCollectionType value) {
        return new JAXBElement<DBUnificadoregimenfiscalOutputCollectionType>(_DBUnificadoregimenfiscalOutputCollection_QNAME,
                                                                             DBUnificadoregimenfiscalOutputCollectionType.class,
                                                                             null, value);
    }

}
