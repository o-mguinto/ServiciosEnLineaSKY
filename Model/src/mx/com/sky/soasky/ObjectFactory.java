
package mx.com.sky.soasky;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.soasky package.
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

    private final static QName _SaldosConsultaSaldosCorrientesEntrada_QNAME =
        new QName("http://www.sky.com.mx/soasky",
                  "Saldos_consultaSaldosCorrientes_Entrada");
    private final static QName _SaldosConsultaSaldosCorrientesSalida_QNAME =
        new QName("http://www.sky.com.mx/soasky",
                  "Saldos_consultaSaldosCorrientes_Salida");
    private final static QName _SaldosConsultaSaldosCorrientesSalidaTYPEDESCUENTOPAGOOPORTUNO_QNAME =
        new QName("http://www.sky.com.mx/soasky", "DESCUENTO_PAGO_OPORTUNO");
    private final static QName _SaldosConsultaSaldosCorrientesSalidaTYPETOTALPAGOOPORTUNO_QNAME =
        new QName("http://www.sky.com.mx/soasky", "TOTAL_PAGO_OPORTUNO");
    private final static QName _SaldosConsultaSaldosCorrientesSalidaTYPESALDOTOTALPAGOOPORTUNO_QNAME =
        new QName("http://www.sky.com.mx/soasky", "SALDO_TOTAL_PAGO_OPORTUNO");
    private final static QName _SaldosConsultaSaldosCorrientesSalidaTYPEFECHAPAGOOPORTUNO_QNAME =
        new QName("http://www.sky.com.mx/soasky", "FECHA_PAGO_OPORTUNO");
    private final static QName _SaldosConsultaSaldosCorrientesSalidaTYPETIPOTARJETA_QNAME =
        new QName("http://www.sky.com.mx/soasky", "TIPO_TARJETA");
    private final static QName _SCINTASConsultaConsumoDatosEntrada_QNAME =
            new QName("http://www.sky.com.mx/soasky", "SC_INT_AS_ConsultaConsumoDatos_Entrada");
        private final static QName _SCINTASConsultaConsumoDatosSalida_QNAME =
            new QName("http://www.sky.com.mx/soasky", "SC_INT_AS_ConsultaConsumoDatos_Salida");
    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.soasky
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
     * Create an instance of {@link CabeceraEntradaConsultaSaldosCorrientesTYPE.PARAMETRO }
     *
     */
    public CabeceraEntradaConsultaSaldosCorrientesTYPE.PARAMETRO createCabeceraEntradaConsultaSaldosCorrientesTYPEPARAMETRO() {
        return new CabeceraEntradaConsultaSaldosCorrientesTYPE.PARAMETRO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaldosConsultaSaldosCorrientesEntradaTYPE }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky",
                    name = "Saldos_consultaSaldosCorrientes_Entrada")
    public JAXBElement<SaldosConsultaSaldosCorrientesEntradaTYPE> createSaldosConsultaSaldosCorrientesEntrada(SaldosConsultaSaldosCorrientesEntradaTYPE value) {
        return new JAXBElement<SaldosConsultaSaldosCorrientesEntradaTYPE>(_SaldosConsultaSaldosCorrientesEntrada_QNAME,
                                                                          SaldosConsultaSaldosCorrientesEntradaTYPE.class,
                                                                          null,
                                                                          value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaldosConsultaSaldosCorrientesSalidaTYPE }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky",
                    name = "Saldos_consultaSaldosCorrientes_Salida")
    public JAXBElement<SaldosConsultaSaldosCorrientesSalidaTYPE> createSaldosConsultaSaldosCorrientesSalida(SaldosConsultaSaldosCorrientesSalidaTYPE value) {
        return new JAXBElement<SaldosConsultaSaldosCorrientesSalidaTYPE>(_SaldosConsultaSaldosCorrientesSalida_QNAME,
                                                                         SaldosConsultaSaldosCorrientesSalidaTYPE.class,
                                                                         null,
                                                                         value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky",
                    name = "DESCUENTO_PAGO_OPORTUNO",
                    scope = SaldosConsultaSaldosCorrientesSalidaTYPE.class)
    public JAXBElement<String> createSaldosConsultaSaldosCorrientesSalidaTYPEDESCUENTOPAGOOPORTUNO(String value) {
        return new JAXBElement<String>(_SaldosConsultaSaldosCorrientesSalidaTYPEDESCUENTOPAGOOPORTUNO_QNAME,
                                       String.class,
                                       SaldosConsultaSaldosCorrientesSalidaTYPE.class,
                                       value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky",
                    name = "TOTAL_PAGO_OPORTUNO",
                    scope = SaldosConsultaSaldosCorrientesSalidaTYPE.class)
    public JAXBElement<String> createSaldosConsultaSaldosCorrientesSalidaTYPETOTALPAGOOPORTUNO(String value) {
        return new JAXBElement<String>(_SaldosConsultaSaldosCorrientesSalidaTYPETOTALPAGOOPORTUNO_QNAME,
                                       String.class,
                                       SaldosConsultaSaldosCorrientesSalidaTYPE.class,
                                       value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky",
                    name = "SALDO_TOTAL_PAGO_OPORTUNO",
                    scope = SaldosConsultaSaldosCorrientesSalidaTYPE.class)
    public JAXBElement<String> createSaldosConsultaSaldosCorrientesSalidaTYPESALDOTOTALPAGOOPORTUNO(String value) {
        return new JAXBElement<String>(_SaldosConsultaSaldosCorrientesSalidaTYPESALDOTOTALPAGOOPORTUNO_QNAME,
                                       String.class,
                                       SaldosConsultaSaldosCorrientesSalidaTYPE.class,
                                       value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky",
                    name = "FECHA_PAGO_OPORTUNO",
                    scope = SaldosConsultaSaldosCorrientesSalidaTYPE.class)
    public JAXBElement<String> createSaldosConsultaSaldosCorrientesSalidaTYPEFECHAPAGOOPORTUNO(String value) {
        return new JAXBElement<String>(_SaldosConsultaSaldosCorrientesSalidaTYPEFECHAPAGOOPORTUNO_QNAME,
                                       String.class,
                                       SaldosConsultaSaldosCorrientesSalidaTYPE.class,
                                       value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky",
                    name = "TIPO_TARJETA",
                    scope = SaldosConsultaSaldosCorrientesSalidaTYPE.class)
    public JAXBElement<String> createSaldosConsultaSaldosCorrientesSalidaTYPETIPOTARJETA(String value) {
        return new JAXBElement<String>(_SaldosConsultaSaldosCorrientesSalidaTYPETIPOTARJETA_QNAME,
                                       String.class,
                                       SaldosConsultaSaldosCorrientesSalidaTYPE.class,
                                       value);
    }
    /**
         * Create an instance of {@link CabeceraEntradaTYPE }
         *
         */
        public CabeceraEntradaTYPE createCabeceraEntradaTYPE() {
            return new CabeceraEntradaTYPE();
        }

        /**
         * Create an instance of {@link SCINTASConsultaConsumoDatosEntradaTYPE }
         *
         */
        public SCINTASConsultaConsumoDatosEntradaTYPE createSCINTASConsultaConsumoDatosEntradaTYPE() {
            return new SCINTASConsultaConsumoDatosEntradaTYPE();
        }

        /**
         * Create an instance of {@link SCINTASConsultaConsumoDatosSalidaTYPE }
         *
         */
        public SCINTASConsultaConsumoDatosSalidaTYPE createSCINTASConsultaConsumoDatosSalidaTYPE() {
            return new SCINTASConsultaConsumoDatosSalidaTYPE();
        }

        /**
         * Create an instance of {@link CabeceraSalidaTYPE }
         *
         */
        public CabeceraSalidaTYPE createCabeceraSalidaTYPE() {
            return new CabeceraSalidaTYPE();
        }

        /**
         * Create an instance of {@link ListaBolsasTYPE }
         *
         */
        public ListaBolsasTYPE createListaBolsasTYPE() {
            return new ListaBolsasTYPE();
        }

        /**
         * Create an instance of {@link BolsasTYPE }
         *
         */
        public BolsasTYPE createBolsasTYPE() {
            return new BolsasTYPE();
        }

        /**
         * Create an instance of {@link CabeceraEntradaTYPE.PARAMETRO }
         *
         */
        public CabeceraEntradaTYPE.PARAMETRO createCabeceraEntradaTYPEPARAMETRO() {
            return new CabeceraEntradaTYPE.PARAMETRO();
        }

        /**
         * Create an instance of {@link JAXBElement }{@code <}{@link SCINTASConsultaConsumoDatosEntradaTYPE }{@code >}}
         *
         */
        @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "SC_INT_AS_ConsultaConsumoDatos_Entrada")
        public JAXBElement<SCINTASConsultaConsumoDatosEntradaTYPE> createSCINTASConsultaConsumoDatosEntrada(SCINTASConsultaConsumoDatosEntradaTYPE value) {
            return new JAXBElement<SCINTASConsultaConsumoDatosEntradaTYPE>(_SCINTASConsultaConsumoDatosEntrada_QNAME,
                                                                           SCINTASConsultaConsumoDatosEntradaTYPE.class,
                                                                           null, value);
        }

        /**
         * Create an instance of {@link JAXBElement }{@code <}{@link SCINTASConsultaConsumoDatosSalidaTYPE }{@code >}}
         *
         */
        @XmlElementDecl(namespace = "http://www.sky.com.mx/soasky", name = "SC_INT_AS_ConsultaConsumoDatos_Salida")
        public JAXBElement<SCINTASConsultaConsumoDatosSalidaTYPE> createSCINTASConsultaConsumoDatosSalida(SCINTASConsultaConsumoDatosSalidaTYPE value) {
            return new JAXBElement<SCINTASConsultaConsumoDatosSalidaTYPE>(_SCINTASConsultaConsumoDatosSalida_QNAME,
                                                                          SCINTASConsultaConsumoDatosSalidaTYPE.class, null,
                                                                          value);
        }

}
