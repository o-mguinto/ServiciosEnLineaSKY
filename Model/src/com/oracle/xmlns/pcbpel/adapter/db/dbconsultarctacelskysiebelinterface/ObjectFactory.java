
package com.oracle.xmlns.pcbpel.adapter.db.dbconsultarctacelskysiebelinterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.oracle.xmlns.pcbpel.adapter.db.dbconsultarctacelskysiebelinterface package.
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

    private final static QName _DBConsultarCtaCelSkySiebelInterfaceInput_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/DBConsultarCtaCelSkySiebelInterface",
                  "DBConsultarCtaCelSkySiebelInterfaceInput");
    private final static QName _DBConsultarCtaCelSkySiebelInterfaceOutputCollection_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/DBConsultarCtaCelSkySiebelInterface",
                  "DBConsultarCtaCelSkySiebelInterfaceOutputCollection");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.pcbpel.adapter.db.dbconsultarctacelskysiebelinterface
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DBConsultarCtaCelSkySiebelInterfaceInputType }
     *
     */
    public DBConsultarCtaCelSkySiebelInterfaceInputType createDBConsultarCtaCelSkySiebelInterfaceInputType() {
        return new DBConsultarCtaCelSkySiebelInterfaceInputType();
    }

    /**
     * Create an instance of {@link DBConsultarCtaCelSkySiebelInterfaceOutputCollectionType }
     *
     */
    public DBConsultarCtaCelSkySiebelInterfaceOutputCollectionType createDBConsultarCtaCelSkySiebelInterfaceOutputCollectionType() {
        return new DBConsultarCtaCelSkySiebelInterfaceOutputCollectionType();
    }

    /**
     * Create an instance of {@link DBConsultarCtaCelSkySiebelInterfaceOutputType }
     *
     */
    public DBConsultarCtaCelSkySiebelInterfaceOutputType createDBConsultarCtaCelSkySiebelInterfaceOutputType() {
        return new DBConsultarCtaCelSkySiebelInterfaceOutputType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DBConsultarCtaCelSkySiebelInterfaceInputType }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DBConsultarCtaCelSkySiebelInterfaceInputType }{@code >}
     */
    @XmlElementDecl(namespace =
                    "http://xmlns.oracle.com/pcbpel/adapter/db/DBConsultarCtaCelSkySiebelInterface",
                    name = "DBConsultarCtaCelSkySiebelInterfaceInput")
    public JAXBElement<DBConsultarCtaCelSkySiebelInterfaceInputType> createDBConsultarCtaCelSkySiebelInterfaceInput(DBConsultarCtaCelSkySiebelInterfaceInputType value) {
        return new JAXBElement<DBConsultarCtaCelSkySiebelInterfaceInputType>(_DBConsultarCtaCelSkySiebelInterfaceInput_QNAME,
                                                                             DBConsultarCtaCelSkySiebelInterfaceInputType.class,
                                                                             null,
                                                                             value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DBConsultarCtaCelSkySiebelInterfaceOutputCollectionType }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DBConsultarCtaCelSkySiebelInterfaceOutputCollectionType }{@code >}
     */
    @XmlElementDecl(namespace =
                    "http://xmlns.oracle.com/pcbpel/adapter/db/DBConsultarCtaCelSkySiebelInterface",
                    name =
                    "DBConsultarCtaCelSkySiebelInterfaceOutputCollection")
    public JAXBElement<DBConsultarCtaCelSkySiebelInterfaceOutputCollectionType> createDBConsultarCtaCelSkySiebelInterfaceOutputCollection(DBConsultarCtaCelSkySiebelInterfaceOutputCollectionType value) {
        return new JAXBElement<DBConsultarCtaCelSkySiebelInterfaceOutputCollectionType>(_DBConsultarCtaCelSkySiebelInterfaceOutputCollection_QNAME,
                                                                                        DBConsultarCtaCelSkySiebelInterfaceOutputCollectionType.class,
                                                                                        null,
                                                                                        value);
    }

}
