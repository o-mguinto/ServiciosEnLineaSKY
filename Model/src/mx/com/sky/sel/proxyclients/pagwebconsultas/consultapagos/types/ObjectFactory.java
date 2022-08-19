
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultapagos.types;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.sel.proxyclients.pagwebconsultas.consultapagos.types package.
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.sel.proxyclients.pagwebconsultas.consultapagos.types
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaPagosProcessRequest }
     *
     */
    public ConsultaPagosProcessRequest createConsultaPagosProcessRequest() {
        return new ConsultaPagosProcessRequest();
    }

    /**
     * Create an instance of {@link ConsultaPagosProcessResponse }
     *
     */
    public ConsultaPagosProcessResponse createConsultaPagosProcessResponse() {
        return new ConsultaPagosProcessResponse();
    }

    /**
     * Create an instance of {@link PagoCollection }
     *
     */
    public PagoCollection createPagoCollection() {
        return new PagoCollection();
    }

    /**
     * Create an instance of {@link Pago }
     *
     */
    public Pago createPago() {
        return new Pago();
    }

}
