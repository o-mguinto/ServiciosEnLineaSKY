
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultatelefonovalidocf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import mx.com.sky.sel.proxyclients.pagwebconsultas.consultatelefonovalidocf.types.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "ConsultaTelefonoValidoCOFETEL",
            targetNamespace =
            "http://xmlns.oracle.com/SKYConsultas/ConsultaTelefonoValido/ConsultaTelefonoValidoCOFETEL")
@XmlSeeAlso({ ObjectFactory.class })
public interface ConsultaTelefonoValidoCOFETEL {


    /**
     *
     * @param lada
     * @param resultado
     * @param modalidad
     * @param valido
     * @param telefono
     * @param resultadodesc
     */
    @WebMethod(action = "process")
    @RequestWrapper(localName = "process",
                    targetNamespace = "http://xmlns.oracle.com/SKYConsultas/ConsultaTelefono/ConsultaTelefonoValido",
                    className = "mx.com.sky.sel.proxyclients.pagwebconsultas.consultatelefonovalidocf.types.Process")
    @ResponseWrapper(localName = "processResponse",
                     targetNamespace = "http://xmlns.oracle.com/SKYConsultas/ConsultaTelefono/ConsultaTelefonoValido",
                     className =
                     "mx.com.sky.sel.proxyclients.pagwebconsultas.consultatelefonovalidocf.types.ProcessResponse")
    public void process(@WebParam(name = "lada",
                                  targetNamespace =
                                  "http://xmlns.oracle.com/SKYConsultas/ConsultaTelefono/ConsultaTelefonoValido")
                        String lada,
                        @WebParam(name = "telefono",
                                  targetNamespace =
                                  "http://xmlns.oracle.com/SKYConsultas/ConsultaTelefono/ConsultaTelefonoValido")
                        String telefono,
                        @WebParam(name = "resultado",
                                  targetNamespace =
                                  "http://xmlns.oracle.com/SKYConsultas/ConsultaTelefono/ConsultaTelefonoValido",
                                  mode = WebParam.Mode.OUT) Holder<String> resultado,
                        @WebParam(name = "resultadodesc",
                                  targetNamespace =
                                  "http://xmlns.oracle.com/SKYConsultas/ConsultaTelefono/ConsultaTelefonoValido",
                                  mode = WebParam.Mode.OUT) Holder<String> resultadodesc,
                        @WebParam(name = "Valido",
                                  targetNamespace =
                                  "http://xmlns.oracle.com/SKYConsultas/ConsultaTelefono/ConsultaTelefonoValido",
                                  mode = WebParam.Mode.OUT) Holder<String> valido,
                        @WebParam(name = "Modalidad",
                                  targetNamespace =
                                  "http://xmlns.oracle.com/SKYConsultas/ConsultaTelefono/ConsultaTelefonoValido",
                                  mode = WebParam.Mode.OUT) Holder<String> modalidad);

}
