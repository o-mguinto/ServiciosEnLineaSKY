
package mx.com.sky.sel.proxyclients.soainterface.consultasaldoscorrientes.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.com.sky.sel.proxyclients.soainterface.consultasaldoscorrientes.types package. 
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

    private final static QName _EBMHeaderResponse_QNAME = new QName("http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1", "EBMHeaderResponse");
    private final static QName _RuntimeFaultMessage_QNAME = new QName("http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1", "RuntimeFaultMessage");
    private final static QName _SaldosConsultaSaldosCorrientesEntrada_QNAME = new QName("http://www.sky.com.mx/soasky", "Saldos_consultaSaldosCorrientes_Entrada");
    private final static QName _EBMHeaderRequest_QNAME = new QName("http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1", "EBMHeaderRequest");
    private final static QName _EBM_QNAME = new QName("http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1", "EBM");
    private final static QName _SaldosConsultaSaldosEBMRequest_QNAME = new QName("http://www.sky.com.mx/EnterpriseObjects/SOA/Saldos_consultaSaldosCorrientesEBM", "SaldosConsultaSaldosEBMRequest");
    private final static QName _SaldosConsultaSaldosEBMResponse_QNAME = new QName("http://www.sky.com.mx/EnterpriseObjects/SOA/Saldos_consultaSaldosCorrientesEBM", "SaldosConsultaSaldosEBMResponse");
    private final static QName _SaldosConsultaSaldosCorrientesSalida_QNAME = new QName("http://www.sky.com.mx/soasky", "Saldos_consultaSaldosCorrientes_Salida");
    private final static QName _SaldosConsultaSaldosCorrientesSalidaTYPEFECHAPAGOOPORTUNO_QNAME = new QName("http://www.sky.com.mx/soasky", "FECHA_PAGO_OPORTUNO");
    private final static QName _SaldosConsultaSaldosCorrientesSalidaTYPETIPOTARJETA_QNAME = new QName("http://www.sky.com.mx/soasky", "TIPO_TARJETA");
    private final static QName _SaldosConsultaSaldosCorrientesSalidaTYPETOTALPAGOOPORTUNO_QNAME = new QName("http://www.sky.com.mx/soasky", "TOTAL_PAGO_OPORTUNO");
    private final static QName _SaldosConsultaSaldosCorrientesSalidaTYPEDESCUENTOPAGOOPORTUNO_QNAME = new QName("http://www.sky.com.mx/soasky", "DESCUENTO_PAGO_OPORTUNO");
    private final static QName _SaldosConsultaSaldosCorrientesSalidaTYPESALDOTOTALPAGOOPORTUNO_QNAME = new QName("http://www.sky.com.mx/soasky", "SALDO_TOTAL_PAGO_OPORTUNO");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.sel.proxyclients.soainterface.consultasaldoscorrientes.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CabeceraEntradaConsultaSaldosCorrientesTYPE }
     * 
     */
    public CabeceraEntradaConsultaSaldosCorrientesTYPE createCabeceraEntradaConsultaSaldosCorrientesTYPE() {
        return new CabeceraEntradaConsultaSaldosCorrientesTYPE();
    }

    /**
     * Create an instance of {@link SaldosConsultaSaldosEBMResponseTYPE }
     * 
     */
    public SaldosConsultaSaldosEBMResponseTYPE createSaldosConsultaSaldosEBMResponseTYPE() {
        return new SaldosConsultaSaldosEBMResponseTYPE();
    }

    /**
     * Create an instance of {@link SaldosConsultaSaldosEBMRequestTYPE }
     * 
     */
    public SaldosConsultaSaldosEBMRequestTYPE createSaldosConsultaSaldosEBMRequestTYPE() {
        return new SaldosConsultaSaldosEBMRequestTYPE();
    }

    /**
     * Create an instance of {@link SaldosConsultaSaldosCorrientesEntradaTYPE }
     * 
     */
    public SaldosConsultaSaldosCorrientesEntradaTYPE createSaldosConsultaSaldosCorrientesEntradaTYPE() {
        return new SaldosConsultaSaldosCorrientesEntradaTYPE();
    }

    /**
     * Create an instance of {@link SaldosConsultaSaldosCorrientesSalidaTYPE }
     * 
     */
    public SaldosConsultaSaldosCorrientesSalidaTYPE createSaldosConsultaSaldosCorrientesSalidaTYPE() {
        return new SaldosConsultaSaldosCorrientesSalidaTYPE();
    }

    /**
     * Create an instance of {@link CabeceraSalidaConsultaSaldosCorrientesTYPE }
     * 
     */
    public CabeceraSalidaConsultaSaldosCorrientesTYPE createCabeceraSalidaConsultaSaldosCorrientesTYPE() {
        return new CabeceraSalidaConsultaSaldosCorrientesTYPE();
    }

    /**
     * Create an instance of {@link EBMType }
     * 
     */
    public EBMType createEBMType() {
        return new EBMType();
    }

    /**
     * Create an instance of {@link RuntimeFaultMessageType }
     * 
     */
    public RuntimeFaultMessageType createRuntimeFaultMessageType() {
        return new RuntimeFaultMessageType();
    }

    /**
     * Create an instance of {@link EBMHeaderResponseType }
     * 
     */
    public EBMHeaderResponseType createEBMHeaderResponseType() {
        return new EBMHeaderResponseType();
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
     * Create an instance of {@link CabeceraEntradaConsultaSaldosCorrientesTYPE.PARAMETRO }
     * 
     */
    public CabeceraEntradaConsultaSaldosCorrientesTYPE.PARAMETRO createCabeceraEntradaConsultaSaldosCorrientesTYPEPARAMETRO() {
        return new CabeceraEntradaConsultaSaldosCorrientesTYPE.PARAMETRO();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RuntimeFaultMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1", name = "RuntimeFaultMessage")
    public JAXBElement<RuntimeFaultMessageType> createRuntimeFaultMessage(RuntimeFaultMessageType value) {
        return new JAXBElement<RuntimeFaultMessageType>(_RuntimeFaultMessage_QNAME, RuntimeFaultMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaldosConsultaSaldosCorrientesEntradaTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "Saldos_consultaSaldosCorrientes_Entrada")
    public JAXBElement<SaldosConsultaSaldosCorrientesEntradaTYPE> createSaldosConsultaSaldosCorrientesEntrada(SaldosConsultaSaldosCorrientesEntradaTYPE value) {
        return new JAXBElement<SaldosConsultaSaldosCorrientesEntradaTYPE>(_SaldosConsultaSaldosCorrientesEntrada_QNAME, SaldosConsultaSaldosCorrientesEntradaTYPE.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SaldosConsultaSaldosEBMRequestTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/SOA/Saldos_consultaSaldosCorrientesEBM", name = "SaldosConsultaSaldosEBMRequest")
    public JAXBElement<SaldosConsultaSaldosEBMRequestTYPE> createSaldosConsultaSaldosEBMRequest(SaldosConsultaSaldosEBMRequestTYPE value) {
        return new JAXBElement<SaldosConsultaSaldosEBMRequestTYPE>(_SaldosConsultaSaldosEBMRequest_QNAME, SaldosConsultaSaldosEBMRequestTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaldosConsultaSaldosEBMResponseTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/SOA/Saldos_consultaSaldosCorrientesEBM", name = "SaldosConsultaSaldosEBMResponse")
    public JAXBElement<SaldosConsultaSaldosEBMResponseTYPE> createSaldosConsultaSaldosEBMResponse(SaldosConsultaSaldosEBMResponseTYPE value) {
        return new JAXBElement<SaldosConsultaSaldosEBMResponseTYPE>(_SaldosConsultaSaldosEBMResponse_QNAME, SaldosConsultaSaldosEBMResponseTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaldosConsultaSaldosCorrientesSalidaTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "Saldos_consultaSaldosCorrientes_Salida")
    public JAXBElement<SaldosConsultaSaldosCorrientesSalidaTYPE> createSaldosConsultaSaldosCorrientesSalida(SaldosConsultaSaldosCorrientesSalidaTYPE value) {
        return new JAXBElement<SaldosConsultaSaldosCorrientesSalidaTYPE>(_SaldosConsultaSaldosCorrientesSalida_QNAME, SaldosConsultaSaldosCorrientesSalidaTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "FECHA_PAGO_OPORTUNO", scope = SaldosConsultaSaldosCorrientesSalidaTYPE.class)
    public JAXBElement<String> createSaldosConsultaSaldosCorrientesSalidaTYPEFECHAPAGOOPORTUNO(String value) {
        return new JAXBElement<String>(_SaldosConsultaSaldosCorrientesSalidaTYPEFECHAPAGOOPORTUNO_QNAME, String.class, SaldosConsultaSaldosCorrientesSalidaTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "TIPO_TARJETA", scope = SaldosConsultaSaldosCorrientesSalidaTYPE.class)
    public JAXBElement<String> createSaldosConsultaSaldosCorrientesSalidaTYPETIPOTARJETA(String value) {
        return new JAXBElement<String>(_SaldosConsultaSaldosCorrientesSalidaTYPETIPOTARJETA_QNAME, String.class, SaldosConsultaSaldosCorrientesSalidaTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "TOTAL_PAGO_OPORTUNO", scope = SaldosConsultaSaldosCorrientesSalidaTYPE.class)
    public JAXBElement<String> createSaldosConsultaSaldosCorrientesSalidaTYPETOTALPAGOOPORTUNO(String value) {
        return new JAXBElement<String>(_SaldosConsultaSaldosCorrientesSalidaTYPETOTALPAGOOPORTUNO_QNAME, String.class, SaldosConsultaSaldosCorrientesSalidaTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "DESCUENTO_PAGO_OPORTUNO", scope = SaldosConsultaSaldosCorrientesSalidaTYPE.class)
    public JAXBElement<String> createSaldosConsultaSaldosCorrientesSalidaTYPEDESCUENTOPAGOOPORTUNO(String value) {
        return new JAXBElement<String>(_SaldosConsultaSaldosCorrientesSalidaTYPEDESCUENTOPAGOOPORTUNO_QNAME, String.class, SaldosConsultaSaldosCorrientesSalidaTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "SALDO_TOTAL_PAGO_OPORTUNO", scope = SaldosConsultaSaldosCorrientesSalidaTYPE.class)
    public JAXBElement<String> createSaldosConsultaSaldosCorrientesSalidaTYPESALDOTOTALPAGOOPORTUNO(String value) {
        return new JAXBElement<String>(_SaldosConsultaSaldosCorrientesSalidaTYPESALDOTOTALPAGOOPORTUNO_QNAME, String.class, SaldosConsultaSaldosCorrientesSalidaTYPE.class, value);
    }

}
