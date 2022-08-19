
package com.oracle.xmlns.pcbpel.adapter.db.sp.dbdatoscuentacrececombosec;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.oracle.xmlns.pcbpel.adapter.db.sp.dbdatoscuentacrececombosec package.
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

    private final static QName _InputParametersVCUENTA_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec", "VCUENTA");
    private final static QName _InputParametersVDISTRIBUIDOR_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec", "VDISTRIBUIDOR");
    private final static QName _OutputParametersVCONTRATO_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec", "VCONTRATO");
    private final static QName _OutputParametersVTITULAR_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec", "VTITULAR");
    private final static QName _OutputParametersVCALLE_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec", "VCALLE");
    private final static QName _OutputParametersVNUMEXT_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec", "VNUMEXT");
    private final static QName _OutputParametersVNUMINT_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec", "VNUMINT");
    private final static QName _OutputParametersVCOLONIA_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec", "VCOLONIA");
    private final static QName _OutputParametersVCP_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec", "VCP");
    private final static QName _OutputParametersVCIUDAD_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec", "VCIUDAD");
    private final static QName _OutputParametersVMUNICIPIO_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec", "VMUNICIPIO");
    private final static QName _OutputParametersVESTADO_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec", "VESTADO");
    private final static QName _OutputParametersVTIM_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec", "VTI_M");
    private final static QName _OutputParametersVIRDM_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec", "VIRD_M");
    private final static QName _OutputParametersVESTATUS_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec", "VESTATUS");
    private final static QName _OutputParametersVCODIGO_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec", "VCODIGO");
    private final static QName _OutputParametersVPAQINT_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec", "VPAQ_INT");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.pcbpel.adapter.db.sp.dbdatoscuentacrececombosec
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
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                    name = "VCUENTA", scope = InputParameters.class)
    public JAXBElement<String> createInputParametersVCUENTA(String value) {
        return new JAXBElement<String>(_InputParametersVCUENTA_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                    name = "VDISTRIBUIDOR", scope = InputParameters.class)
    public JAXBElement<String> createInputParametersVDISTRIBUIDOR(String value) {
        return new JAXBElement<String>(_InputParametersVDISTRIBUIDOR_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                    name = "VCONTRATO", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersVCONTRATO(String value) {
        return new JAXBElement<String>(_OutputParametersVCONTRATO_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                    name = "VTITULAR", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersVTITULAR(String value) {
        return new JAXBElement<String>(_OutputParametersVTITULAR_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                    name = "VCALLE", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersVCALLE(String value) {
        return new JAXBElement<String>(_OutputParametersVCALLE_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                    name = "VNUMEXT", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersVNUMEXT(String value) {
        return new JAXBElement<String>(_OutputParametersVNUMEXT_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                    name = "VNUMINT", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersVNUMINT(String value) {
        return new JAXBElement<String>(_OutputParametersVNUMINT_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                    name = "VCOLONIA", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersVCOLONIA(String value) {
        return new JAXBElement<String>(_OutputParametersVCOLONIA_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec", name = "VCP",
                    scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersVCP(String value) {
        return new JAXBElement<String>(_OutputParametersVCP_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                    name = "VCIUDAD", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersVCIUDAD(String value) {
        return new JAXBElement<String>(_OutputParametersVCIUDAD_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                    name = "VMUNICIPIO", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersVMUNICIPIO(String value) {
        return new JAXBElement<String>(_OutputParametersVMUNICIPIO_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                    name = "VESTADO", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersVESTADO(String value) {
        return new JAXBElement<String>(_OutputParametersVESTADO_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                    name = "VTI_M", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersVTIM(String value) {
        return new JAXBElement<String>(_OutputParametersVTIM_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                    name = "VIRD_M", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersVIRDM(String value) {
        return new JAXBElement<String>(_OutputParametersVIRDM_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                    name = "VESTATUS", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersVESTATUS(String value) {
        return new JAXBElement<String>(_OutputParametersVESTATUS_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                    name = "VCODIGO", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersVCODIGO(String value) {
        return new JAXBElement<String>(_OutputParametersVCODIGO_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                    name = "VPAQ_INT", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersVPAQINT(String value) {
        return new JAXBElement<String>(_OutputParametersVPAQINT_QNAME, String.class, OutputParameters.class, value);
    }

}
