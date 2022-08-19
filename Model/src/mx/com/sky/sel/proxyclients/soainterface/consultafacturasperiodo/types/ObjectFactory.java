
package mx.com.sky.sel.proxyclients.soainterface.consultafacturasperiodo.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.com.sky.sel.proxyclients.soainterface.consultafacturasperiodo.types package. 
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

    private final static QName _RuntimeFaultMessage_QNAME = new QName("http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1", "RuntimeFaultMessage");
    private final static QName _EBMHeaderResponse_QNAME = new QName("http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1", "EBMHeaderResponse");
    private final static QName _FacturasConsultaFacturasPeriodoSalida_QNAME = new QName("http://www.sky.com.mx/soasky", "Facturas_consultaFacturasPeriodo_Salida");
    private final static QName _EBMHeaderRequest_QNAME = new QName("http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1", "EBMHeaderRequest");
    private final static QName _EBM_QNAME = new QName("http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1", "EBM");
    private final static QName _FacturasConsultaFacturasPeriodoEntrada_QNAME = new QName("http://www.sky.com.mx/soasky", "Facturas_consultaFacturasPeriodo_Entrada");
    private final static QName _ConsultaFacturasPeriodoPSResponseEBM_QNAME = new QName("http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultaFacturasPeriodoPSInterface", "ConsultaFacturasPeriodoPSResponseEBM");
    private final static QName _ConsultaFacturasPeriodoPSEBM_QNAME = new QName("http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultaFacturasPeriodoPSInterface", "ConsultaFacturasPeriodoPSEBM");
    private final static QName _ResultadosSalidaTYPENUMEROFACTURA_QNAME = new QName("http://www.sky.com.mx/soasky", "NUMERO_FACTURA");
    private final static QName _ResultadosSalidaTYPEAJUSTES_QNAME = new QName("http://www.sky.com.mx/soasky", "AJUSTES");
    private final static QName _ResultadosSalidaTYPEPAGOSAFACTURA_QNAME = new QName("http://www.sky.com.mx/soasky", "PAGOS_A_FACTURA");
    private final static QName _ResultadosSalidaTYPEFECHACIERRE_QNAME = new QName("http://www.sky.com.mx/soasky", "FECHA_CIERRE");
    private final static QName _ResultadosSalidaTYPEFECHAAPAGAR_QNAME = new QName("http://www.sky.com.mx/soasky", "FECHA_A_PAGAR");
    private final static QName _ResultadosSalidaTYPEINICIOPERIODO_QNAME = new QName("http://www.sky.com.mx/soasky", "INICIO_PERIODO");
    private final static QName _ResultadosSalidaTYPESALDOTOTAL_QNAME = new QName("http://www.sky.com.mx/soasky", "SALDO_TOTAL");
    private final static QName _ResultadosSalidaTYPEMONEDA_QNAME = new QName("http://www.sky.com.mx/soasky", "MONEDA");
    private final static QName _ResultadosSalidaTYPECONSECUTIVO_QNAME = new QName("http://www.sky.com.mx/soasky", "CONSECUTIVO");
    private final static QName _ResultadosSalidaTYPESALDO_QNAME = new QName("http://www.sky.com.mx/soasky", "SALDO");
    private final static QName _ResultadosSalidaTYPEFECHAVENCIMIENTO_QNAME = new QName("http://www.sky.com.mx/soasky", "FECHA_VENCIMIENTO");
    private final static QName _ResultadosSalidaTYPEFECHAEMISION_QNAME = new QName("http://www.sky.com.mx/soasky", "FECHA_EMISION");
    private final static QName _ResultadosSalidaTYPEMONTOFACTURADO_QNAME = new QName("http://www.sky.com.mx/soasky", "MONTO_FACTURADO");
    private final static QName _ResultadosSalidaTYPECONSUMOSDELMES_QNAME = new QName("http://www.sky.com.mx/soasky", "CONSUMOS_DEL_MES");
    private final static QName _ResultadosSalidaTYPEFECHAFACTURA_QNAME = new QName("http://www.sky.com.mx/soasky", "FECHA_FACTURA");
    private final static QName _ResultadosSalidaTYPEIDFACTURA_QNAME = new QName("http://www.sky.com.mx/soasky", "ID_FACTURA");
    private final static QName _ResultadosSalidaTYPEESTATUSFORMATO_QNAME = new QName("http://www.sky.com.mx/soasky", "ESTATUS_FORMATO");
    private final static QName _ResultadosSalidaTYPEFINPERIODO_QNAME = new QName("http://www.sky.com.mx/soasky", "FIN_PERIODO");
    private final static QName _FacturasConsultaFacturasPeriodoEntradaTYPEFECHAINICIO_QNAME = new QName("http://www.sky.com.mx/soasky", "FECHA_INICIO");
    private final static QName _FacturasConsultaFacturasPeriodoEntradaTYPEFECHAFIN_QNAME = new QName("http://www.sky.com.mx/soasky", "FECHA_FIN");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.sel.proxyclients.soainterface.consultafacturasperiodo.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CabeceraEntradaTYPE }
     * 
     */
    public CabeceraEntradaTYPE createCabeceraEntradaTYPE() {
        return new CabeceraEntradaTYPE();
    }

    /**
     * Create an instance of {@link EBMType }
     * 
     */
    public EBMType createEBMType() {
        return new EBMType();
    }

    /**
     * Create an instance of {@link EBMHeaderResponseType }
     * 
     */
    public EBMHeaderResponseType createEBMHeaderResponseType() {
        return new EBMHeaderResponseType();
    }

    /**
     * Create an instance of {@link RuntimeFaultMessageType }
     * 
     */
    public RuntimeFaultMessageType createRuntimeFaultMessageType() {
        return new RuntimeFaultMessageType();
    }

    /**
     * Create an instance of {@link EBMHeaderRequestType }
     * 
     */
    public EBMHeaderRequestType createEBMHeaderRequestType() {
        return new EBMHeaderRequestType();
    }

    /**
     * Create an instance of {@link ParametroItemType }
     * 
     */
    public ParametroItemType createParametroItemType() {
        return new ParametroItemType();
    }

    /**
     * Create an instance of {@link SeguridadItemType }
     * 
     */
    public SeguridadItemType createSeguridadItemType() {
        return new SeguridadItemType();
    }

    /**
     * Create an instance of {@link SeguridadListType }
     * 
     */
    public SeguridadListType createSeguridadListType() {
        return new SeguridadListType();
    }

    /**
     * Create an instance of {@link ErrorNegocioType }
     * 
     */
    public ErrorNegocioType createErrorNegocioType() {
        return new ErrorNegocioType();
    }

    /**
     * Create an instance of {@link ParametroListType }
     * 
     */
    public ParametroListType createParametroListType() {
        return new ParametroListType();
    }

    /**
     * Create an instance of {@link ErrorTecnicoType }
     * 
     */
    public ErrorTecnicoType createErrorTecnicoType() {
        return new ErrorTecnicoType();
    }

    /**
     * Create an instance of {@link ConsultaFacturasPeriodoPSEBMType }
     * 
     */
    public ConsultaFacturasPeriodoPSEBMType createConsultaFacturasPeriodoPSEBMType() {
        return new ConsultaFacturasPeriodoPSEBMType();
    }

    /**
     * Create an instance of {@link ConsultaFacturasPeriodoPSResponseEBMType }
     * 
     */
    public ConsultaFacturasPeriodoPSResponseEBMType createConsultaFacturasPeriodoPSResponseEBMType() {
        return new ConsultaFacturasPeriodoPSResponseEBMType();
    }

    /**
     * Create an instance of {@link FacturasConsultaFacturasPeriodoSalidaTYPE }
     * 
     */
    public FacturasConsultaFacturasPeriodoSalidaTYPE createFacturasConsultaFacturasPeriodoSalidaTYPE() {
        return new FacturasConsultaFacturasPeriodoSalidaTYPE();
    }

    /**
     * Create an instance of {@link FacturasConsultaFacturasPeriodoEntradaTYPE }
     * 
     */
    public FacturasConsultaFacturasPeriodoEntradaTYPE createFacturasConsultaFacturasPeriodoEntradaTYPE() {
        return new FacturasConsultaFacturasPeriodoEntradaTYPE();
    }

    /**
     * Create an instance of {@link ResultadosSalidaTYPE }
     * 
     */
    public ResultadosSalidaTYPE createResultadosSalidaTYPE() {
        return new ResultadosSalidaTYPE();
    }

    /**
     * Create an instance of {@link CabeceraSalidaTYPE }
     * 
     */
    public CabeceraSalidaTYPE createCabeceraSalidaTYPE() {
        return new CabeceraSalidaTYPE();
    }

    /**
     * Create an instance of {@link CabeceraEntradaTYPE.PARAMETRO }
     * 
     */
    public CabeceraEntradaTYPE.PARAMETRO createCabeceraEntradaTYPEPARAMETRO() {
        return new CabeceraEntradaTYPE.PARAMETRO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RuntimeFaultMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1", name = "RuntimeFaultMessage")
    public JAXBElement<RuntimeFaultMessageType> createRuntimeFaultMessage(RuntimeFaultMessageType value) {
        return new JAXBElement<RuntimeFaultMessageType>(_RuntimeFaultMessage_QNAME, RuntimeFaultMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EBMHeaderResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1", name = "EBMHeaderResponse")
    public JAXBElement<EBMHeaderResponseType> createEBMHeaderResponse(EBMHeaderResponseType value) {
        return new JAXBElement<EBMHeaderResponseType>(_EBMHeaderResponse_QNAME, EBMHeaderResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacturasConsultaFacturasPeriodoSalidaTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "Facturas_consultaFacturasPeriodo_Salida")
    public JAXBElement<FacturasConsultaFacturasPeriodoSalidaTYPE> createFacturasConsultaFacturasPeriodoSalida(FacturasConsultaFacturasPeriodoSalidaTYPE value) {
        return new JAXBElement<FacturasConsultaFacturasPeriodoSalidaTYPE>(_FacturasConsultaFacturasPeriodoSalida_QNAME, FacturasConsultaFacturasPeriodoSalidaTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EBMHeaderRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1", name = "EBMHeaderRequest")
    public JAXBElement<EBMHeaderRequestType> createEBMHeaderRequest(EBMHeaderRequestType value) {
        return new JAXBElement<EBMHeaderRequestType>(_EBMHeaderRequest_QNAME, EBMHeaderRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EBMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1", name = "EBM")
    public JAXBElement<EBMType> createEBM(EBMType value) {
        return new JAXBElement<EBMType>(_EBM_QNAME, EBMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacturasConsultaFacturasPeriodoEntradaTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "Facturas_consultaFacturasPeriodo_Entrada")
    public JAXBElement<FacturasConsultaFacturasPeriodoEntradaTYPE> createFacturasConsultaFacturasPeriodoEntrada(FacturasConsultaFacturasPeriodoEntradaTYPE value) {
        return new JAXBElement<FacturasConsultaFacturasPeriodoEntradaTYPE>(_FacturasConsultaFacturasPeriodoEntrada_QNAME, FacturasConsultaFacturasPeriodoEntradaTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaFacturasPeriodoPSResponseEBMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultaFacturasPeriodoPSInterface", name = "ConsultaFacturasPeriodoPSResponseEBM")
    public JAXBElement<ConsultaFacturasPeriodoPSResponseEBMType> createConsultaFacturasPeriodoPSResponseEBM(ConsultaFacturasPeriodoPSResponseEBMType value) {
        return new JAXBElement<ConsultaFacturasPeriodoPSResponseEBMType>(_ConsultaFacturasPeriodoPSResponseEBM_QNAME, ConsultaFacturasPeriodoPSResponseEBMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaFacturasPeriodoPSEBMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultaFacturasPeriodoPSInterface", name = "ConsultaFacturasPeriodoPSEBM")
    public JAXBElement<ConsultaFacturasPeriodoPSEBMType> createConsultaFacturasPeriodoPSEBM(ConsultaFacturasPeriodoPSEBMType value) {
        return new JAXBElement<ConsultaFacturasPeriodoPSEBMType>(_ConsultaFacturasPeriodoPSEBM_QNAME, ConsultaFacturasPeriodoPSEBMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "NUMERO_FACTURA", scope = ResultadosSalidaTYPE.class)
    public JAXBElement<String> createResultadosSalidaTYPENUMEROFACTURA(String value) {
        return new JAXBElement<String>(_ResultadosSalidaTYPENUMEROFACTURA_QNAME, String.class, ResultadosSalidaTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "AJUSTES", scope = ResultadosSalidaTYPE.class)
    public JAXBElement<String> createResultadosSalidaTYPEAJUSTES(String value) {
        return new JAXBElement<String>(_ResultadosSalidaTYPEAJUSTES_QNAME, String.class, ResultadosSalidaTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "PAGOS_A_FACTURA", scope = ResultadosSalidaTYPE.class)
    public JAXBElement<String> createResultadosSalidaTYPEPAGOSAFACTURA(String value) {
        return new JAXBElement<String>(_ResultadosSalidaTYPEPAGOSAFACTURA_QNAME, String.class, ResultadosSalidaTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "FECHA_CIERRE", scope = ResultadosSalidaTYPE.class)
    public JAXBElement<String> createResultadosSalidaTYPEFECHACIERRE(String value) {
        return new JAXBElement<String>(_ResultadosSalidaTYPEFECHACIERRE_QNAME, String.class, ResultadosSalidaTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "FECHA_A_PAGAR", scope = ResultadosSalidaTYPE.class)
    public JAXBElement<String> createResultadosSalidaTYPEFECHAAPAGAR(String value) {
        return new JAXBElement<String>(_ResultadosSalidaTYPEFECHAAPAGAR_QNAME, String.class, ResultadosSalidaTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "INICIO_PERIODO", scope = ResultadosSalidaTYPE.class)
    public JAXBElement<String> createResultadosSalidaTYPEINICIOPERIODO(String value) {
        return new JAXBElement<String>(_ResultadosSalidaTYPEINICIOPERIODO_QNAME, String.class, ResultadosSalidaTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "SALDO_TOTAL", scope = ResultadosSalidaTYPE.class)
    public JAXBElement<String> createResultadosSalidaTYPESALDOTOTAL(String value) {
        return new JAXBElement<String>(_ResultadosSalidaTYPESALDOTOTAL_QNAME, String.class, ResultadosSalidaTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "MONEDA", scope = ResultadosSalidaTYPE.class)
    public JAXBElement<String> createResultadosSalidaTYPEMONEDA(String value) {
        return new JAXBElement<String>(_ResultadosSalidaTYPEMONEDA_QNAME, String.class, ResultadosSalidaTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "CONSECUTIVO", scope = ResultadosSalidaTYPE.class)
    public JAXBElement<String> createResultadosSalidaTYPECONSECUTIVO(String value) {
        return new JAXBElement<String>(_ResultadosSalidaTYPECONSECUTIVO_QNAME, String.class, ResultadosSalidaTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "SALDO", scope = ResultadosSalidaTYPE.class)
    public JAXBElement<String> createResultadosSalidaTYPESALDO(String value) {
        return new JAXBElement<String>(_ResultadosSalidaTYPESALDO_QNAME, String.class, ResultadosSalidaTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "FECHA_VENCIMIENTO", scope = ResultadosSalidaTYPE.class)
    public JAXBElement<String> createResultadosSalidaTYPEFECHAVENCIMIENTO(String value) {
        return new JAXBElement<String>(_ResultadosSalidaTYPEFECHAVENCIMIENTO_QNAME, String.class, ResultadosSalidaTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "FECHA_EMISION", scope = ResultadosSalidaTYPE.class)
    public JAXBElement<String> createResultadosSalidaTYPEFECHAEMISION(String value) {
        return new JAXBElement<String>(_ResultadosSalidaTYPEFECHAEMISION_QNAME, String.class, ResultadosSalidaTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "MONTO_FACTURADO", scope = ResultadosSalidaTYPE.class)
    public JAXBElement<String> createResultadosSalidaTYPEMONTOFACTURADO(String value) {
        return new JAXBElement<String>(_ResultadosSalidaTYPEMONTOFACTURADO_QNAME, String.class, ResultadosSalidaTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "CONSUMOS_DEL_MES", scope = ResultadosSalidaTYPE.class)
    public JAXBElement<String> createResultadosSalidaTYPECONSUMOSDELMES(String value) {
        return new JAXBElement<String>(_ResultadosSalidaTYPECONSUMOSDELMES_QNAME, String.class, ResultadosSalidaTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "FECHA_FACTURA", scope = ResultadosSalidaTYPE.class)
    public JAXBElement<String> createResultadosSalidaTYPEFECHAFACTURA(String value) {
        return new JAXBElement<String>(_ResultadosSalidaTYPEFECHAFACTURA_QNAME, String.class, ResultadosSalidaTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "ID_FACTURA", scope = ResultadosSalidaTYPE.class)
    public JAXBElement<String> createResultadosSalidaTYPEIDFACTURA(String value) {
        return new JAXBElement<String>(_ResultadosSalidaTYPEIDFACTURA_QNAME, String.class, ResultadosSalidaTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "ESTATUS_FORMATO", scope = ResultadosSalidaTYPE.class)
    public JAXBElement<String> createResultadosSalidaTYPEESTATUSFORMATO(String value) {
        return new JAXBElement<String>(_ResultadosSalidaTYPEESTATUSFORMATO_QNAME, String.class, ResultadosSalidaTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "FIN_PERIODO", scope = ResultadosSalidaTYPE.class)
    public JAXBElement<String> createResultadosSalidaTYPEFINPERIODO(String value) {
        return new JAXBElement<String>(_ResultadosSalidaTYPEFINPERIODO_QNAME, String.class, ResultadosSalidaTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "FECHA_INICIO", scope = FacturasConsultaFacturasPeriodoEntradaTYPE.class)
    public JAXBElement<String> createFacturasConsultaFacturasPeriodoEntradaTYPEFECHAINICIO(String value) {
        return new JAXBElement<String>(_FacturasConsultaFacturasPeriodoEntradaTYPEFECHAINICIO_QNAME, String.class, FacturasConsultaFacturasPeriodoEntradaTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "FECHA_FIN", scope = FacturasConsultaFacturasPeriodoEntradaTYPE.class)
    public JAXBElement<String> createFacturasConsultaFacturasPeriodoEntradaTYPEFECHAFIN(String value) {
        return new JAXBElement<String>(_FacturasConsultaFacturasPeriodoEntradaTYPEFECHAFIN_QNAME, String.class, FacturasConsultaFacturasPeriodoEntradaTYPE.class, value);
    }

}
