
package com.oracle.xmlns.pcbpel.adapter.db.sp.dbvalidacrecimientosppbtisec;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.oracle.xmlns.pcbpel.adapter.db.sp.dbvalidacrecimientosppbtisec package.
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

    private final static QName _InputParametersCUENTA_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbValidaCrecimientosPpBtiSec", "CUENTA");
    private final static QName _OutputParametersVALIDO_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbValidaCrecimientosPpBtiSec", "VALIDO");
    private final static QName _OutputParametersPRECIO_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbValidaCrecimientosPpBtiSec", "PRECIO");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.pcbpel.adapter.db.sp.dbvalidacrecimientosppbtisec
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InputParameters }
     *
     */
    public InputParameters createInputParameters() {
        return new InputParameters();
    }

    /**
     * Create an instance of {@link OutputParameters }
     *
     */
    public OutputParameters createOutputParameters() {
        return new OutputParameters();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbValidaCrecimientosPpBtiSec",
                    name = "CUENTA", scope = InputParameters.class)
    public JAXBElement<String> createInputParametersCUENTA(String value) {
        return new JAXBElement<String>(_InputParametersCUENTA_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbValidaCrecimientosPpBtiSec",
                    name = "VALIDO", scope = OutputParameters.class)
    public JAXBElement<BigDecimal> createOutputParametersVALIDO(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OutputParametersVALIDO_QNAME, BigDecimal.class, OutputParameters.class,
                                           value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbValidaCrecimientosPpBtiSec",
                    name = "PRECIO", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersPRECIO(String value) {
        return new JAXBElement<String>(_OutputParametersPRECIO_QNAME, String.class, OutputParameters.class, value);
    }

}
