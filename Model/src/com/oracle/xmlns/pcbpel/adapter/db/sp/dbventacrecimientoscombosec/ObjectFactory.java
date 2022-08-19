
package com.oracle.xmlns.pcbpel.adapter.db.sp.dbventacrecimientoscombosec;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.oracle.xmlns.pcbpel.adapter.db.sp.dbventacrecimientoscombosec package.
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
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec", "CUENTA");
    private final static QName _InputParametersVELOCIDAD_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec", "VELOCIDAD");
    private final static QName _InputParametersPROVEEDOR_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec", "PROVEEDOR");
    private final static QName _InputParametersORIGEN_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec", "ORIGEN");
    private final static QName _InputParametersVDISTRIBUIDOR_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec", "VDISTRIBUIDOR");
    private final static QName _InputParametersVFECHAATEN_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec", "VFECHA_ATEN");
    private final static QName _InputParametersVHORAATEN_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec", "VHORA_ATEN");
    private final static QName _InputParametersVLATITUD_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec", "VLATITUD");
    private final static QName _InputParametersVLONGITUD_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec", "VLONGITUD");
    private final static QName _OutputParametersSS_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec", "SS");
    private final static QName _OutputParametersCONTRATOI_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec", "CONTRATOI");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.pcbpel.adapter.db.sp.dbventacrecimientoscombosec
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
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec",
                    name = "CUENTA", scope = InputParameters.class)
    public JAXBElement<String> createInputParametersCUENTA(String value) {
        return new JAXBElement<String>(_InputParametersCUENTA_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec",
                    name = "VELOCIDAD", scope = InputParameters.class)
    public JAXBElement<String> createInputParametersVELOCIDAD(String value) {
        return new JAXBElement<String>(_InputParametersVELOCIDAD_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec",
                    name = "PROVEEDOR", scope = InputParameters.class)
    public JAXBElement<String> createInputParametersPROVEEDOR(String value) {
        return new JAXBElement<String>(_InputParametersPROVEEDOR_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec",
                    name = "ORIGEN", scope = InputParameters.class)
    public JAXBElement<String> createInputParametersORIGEN(String value) {
        return new JAXBElement<String>(_InputParametersORIGEN_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec",
                    name = "VDISTRIBUIDOR", scope = InputParameters.class)
    public JAXBElement<String> createInputParametersVDISTRIBUIDOR(String value) {
        return new JAXBElement<String>(_InputParametersVDISTRIBUIDOR_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec",
                    name = "VFECHA_ATEN", scope = InputParameters.class)
    public JAXBElement<String> createInputParametersVFECHAATEN(String value) {
        return new JAXBElement<String>(_InputParametersVFECHAATEN_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec",
                    name = "VHORA_ATEN", scope = InputParameters.class)
    public JAXBElement<String> createInputParametersVHORAATEN(String value) {
        return new JAXBElement<String>(_InputParametersVHORAATEN_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec",
                    name = "VLATITUD", scope = InputParameters.class)
    public JAXBElement<String> createInputParametersVLATITUD(String value) {
        return new JAXBElement<String>(_InputParametersVLATITUD_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec",
                    name = "VLONGITUD", scope = InputParameters.class)
    public JAXBElement<String> createInputParametersVLONGITUD(String value) {
        return new JAXBElement<String>(_InputParametersVLONGITUD_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec", name = "SS",
                    scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersSS(String value) {
        return new JAXBElement<String>(_OutputParametersSS_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec",
                    name = "CONTRATOI", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersCONTRATOI(String value) {
        return new JAXBElement<String>(_OutputParametersCONTRATOI_QNAME, String.class, OutputParameters.class, value);
    }

}
