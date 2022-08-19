
package com.oracle.xmlns.pcbpel.adapter.db.sp.dbutilsofscprocesssec;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.oracle.xmlns.pcbpel.adapter.db.sp.dbutilsofscprocesssec package.
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

    private final static QName _InputParametersPROCESO_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", "PROCESO");
    private final static QName _InputParametersCUENTA_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", "CUENTA");
    private final static QName _InputParametersDISTRIBUIDOR_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", "DISTRIBUIDOR");
    private final static QName _InputParametersSD_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", "SD");
    private final static QName _InputParametersHD_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", "HD");
    private final static QName _InputParametersPHD_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", "PHD");
    private final static QName _InputParametersHMC_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", "HMC");
    private final static QName _InputParametersNUMEQUIPCTA_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", "NUM_EQUIP_CTA");
    private final static QName _InputParametersPAIS_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", "PAIS");
    private final static QName _InputParametersESTADO_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", "ESTADO");
    private final static QName _InputParametersALCALDIA_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", "ALCALDIA");
    private final static QName _InputParametersTIPOCTA_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", "TIPO_CTA");
    private final static QName _OutputParametersGRUPO_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", "GRUPO");
    private final static QName _OutputParametersTIPO_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", "TIPO");
    private final static QName _OutputParametersSUBTIPO_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", "SUBTIPO");
    private final static QName _OutputParametersDEFCORCHETES_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", "DEF_CORCHETES");
    private final static QName _OutputParametersCATEGORIACAP_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", "CATEGORIACAP");
    private final static QName _OutputParametersDISTVTA_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", "DISTVTA");
    private final static QName _OutputParametersTIPOACT_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", "TIPO_ACT");
    private final static QName _OutputParametersCP_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", "CP");
    private final static QName _OutputParametersCVEPAIS_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", "CVEPAIS");
    private final static QName _OutputParametersFLAG_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", "FLAG");
    private final static QName _OutputParametersERRORCODE_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", "ERROR_CODE");
    private final static QName _OutputParametersXTEMPUNO_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", "X_TEMP_UNO");
    private final static QName _OutputParametersXTEMPDOS_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", "X_TEMP_DOS");
    private final static QName _OutputParametersXTEMPTRES_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", "X_TEMP_TRES");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.pcbpel.adapter.db.sp.dbutilsofscprocesssec
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
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", name = "PROCESO",
                    scope = InputParameters.class)
    public JAXBElement<String> createInputParametersPROCESO(String value) {
        return new JAXBElement<String>(_InputParametersPROCESO_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", name = "CUENTA",
                    scope = InputParameters.class)
    public JAXBElement<String> createInputParametersCUENTA(String value) {
        return new JAXBElement<String>(_InputParametersCUENTA_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                    name = "DISTRIBUIDOR", scope = InputParameters.class)
    public JAXBElement<String> createInputParametersDISTRIBUIDOR(String value) {
        return new JAXBElement<String>(_InputParametersDISTRIBUIDOR_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", name = "SD",
                    scope = InputParameters.class)
    public JAXBElement<String> createInputParametersSD(String value) {
        return new JAXBElement<String>(_InputParametersSD_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", name = "HD",
                    scope = InputParameters.class)
    public JAXBElement<String> createInputParametersHD(String value) {
        return new JAXBElement<String>(_InputParametersHD_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", name = "PHD",
                    scope = InputParameters.class)
    public JAXBElement<String> createInputParametersPHD(String value) {
        return new JAXBElement<String>(_InputParametersPHD_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", name = "HMC",
                    scope = InputParameters.class)
    public JAXBElement<String> createInputParametersHMC(String value) {
        return new JAXBElement<String>(_InputParametersHMC_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                    name = "NUM_EQUIP_CTA", scope = InputParameters.class)
    public JAXBElement<String> createInputParametersNUMEQUIPCTA(String value) {
        return new JAXBElement<String>(_InputParametersNUMEQUIPCTA_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", name = "PAIS",
                    scope = InputParameters.class)
    public JAXBElement<String> createInputParametersPAIS(String value) {
        return new JAXBElement<String>(_InputParametersPAIS_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", name = "ESTADO",
                    scope = InputParameters.class)
    public JAXBElement<String> createInputParametersESTADO(String value) {
        return new JAXBElement<String>(_InputParametersESTADO_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", name = "ALCALDIA",
                    scope = InputParameters.class)
    public JAXBElement<String> createInputParametersALCALDIA(String value) {
        return new JAXBElement<String>(_InputParametersALCALDIA_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", name = "TIPO_CTA",
                    scope = InputParameters.class)
    public JAXBElement<String> createInputParametersTIPOCTA(String value) {
        return new JAXBElement<String>(_InputParametersTIPOCTA_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", name = "GRUPO",
                    scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersGRUPO(String value) {
        return new JAXBElement<String>(_OutputParametersGRUPO_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", name = "TIPO",
                    scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersTIPO(String value) {
        return new JAXBElement<String>(_OutputParametersTIPO_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", name = "SUBTIPO",
                    scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersSUBTIPO(String value) {
        return new JAXBElement<String>(_OutputParametersSUBTIPO_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                    name = "DEF_CORCHETES", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersDEFCORCHETES(String value) {
        return new JAXBElement<String>(_OutputParametersDEFCORCHETES_QNAME, String.class, OutputParameters.class,
                                       value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                    name = "CATEGORIACAP", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersCATEGORIACAP(String value) {
        return new JAXBElement<String>(_OutputParametersCATEGORIACAP_QNAME, String.class, OutputParameters.class,
                                       value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", name = "DISTVTA",
                    scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersDISTVTA(String value) {
        return new JAXBElement<String>(_OutputParametersDISTVTA_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", name = "TIPO_ACT",
                    scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersTIPOACT(String value) {
        return new JAXBElement<String>(_OutputParametersTIPOACT_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", name = "CP",
                    scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersCP(String value) {
        return new JAXBElement<String>(_OutputParametersCP_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", name = "CVEPAIS",
                    scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersCVEPAIS(String value) {
        return new JAXBElement<String>(_OutputParametersCVEPAIS_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec", name = "FLAG",
                    scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersFLAG(String value) {
        return new JAXBElement<String>(_OutputParametersFLAG_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                    name = "ERROR_CODE", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersERRORCODE(String value) {
        return new JAXBElement<String>(_OutputParametersERRORCODE_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                    name = "X_TEMP_UNO", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersXTEMPUNO(String value) {
        return new JAXBElement<String>(_OutputParametersXTEMPUNO_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                    name = "X_TEMP_DOS", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersXTEMPDOS(String value) {
        return new JAXBElement<String>(_OutputParametersXTEMPDOS_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                    name = "X_TEMP_TRES", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersXTEMPTRES(String value) {
        return new JAXBElement<String>(_OutputParametersXTEMPTRES_QNAME, String.class, OutputParameters.class, value);
    }

}
