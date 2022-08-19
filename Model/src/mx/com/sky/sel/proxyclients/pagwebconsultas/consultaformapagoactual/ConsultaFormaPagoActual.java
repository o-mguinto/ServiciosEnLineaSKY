
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultaformapagoactual;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaformapagoactual.types.FormaPagoActualSBLOutput;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaformapagoactual.types.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "ConsultaFormaPagoActual",
            targetNamespace = "http://xmlns.oracle.com/SKYConsultas/ConsultaFormasPago/ConsultaFormaPagoActual")
@XmlSeeAlso({ ObjectFactory.class })
public interface ConsultaFormaPagoActual {


    /**
     *
     * @param cuentaSKY
     * @param resultado
     * @param listaFormasPago
     * @param resultadodesc
     */
    @WebMethod(action = "process")
    @RequestWrapper(localName = "process",
                    targetNamespace = "http://xmlns.oracle.com/SKYConsultas/ConsultaFormasPago/ConsultaFormaPagoActual",
                    className = "mx.com.sky.sel.proxyclients.pagwebconsultas.consultaformapagoactual.types.Process")
    @ResponseWrapper(localName = "processResponse",
                     targetNamespace =
                     "http://xmlns.oracle.com/SKYConsultas/ConsultaFormasPago/ConsultaFormaPagoActual",
                     className =
                     "mx.com.sky.sel.proxyclients.pagwebconsultas.consultaformapagoactual.types.ProcessResponse")
    public void process(@WebParam(name = "cuentaSKY",
                                  targetNamespace =
                                  "http://xmlns.oracle.com/SKYConsultas/ConsultaFormasPago/ConsultaFormaPagoActual")
                        String cuentaSKY,
                        @WebParam(name = "resultado",
                                  targetNamespace =
                                  "http://xmlns.oracle.com/SKYConsultas/ConsultaFormasPago/ConsultaFormaPagoActual",
                                  mode = WebParam.Mode.OUT) Holder<String> resultado,
                        @WebParam(name = "resultadodesc",
                                  targetNamespace =
                                  "http://xmlns.oracle.com/SKYConsultas/ConsultaFormasPago/ConsultaFormaPagoActual",
                                  mode = WebParam.Mode.OUT) Holder<String> resultadodesc,
                        @WebParam(name = "ListaFormasPago",
                                  targetNamespace =
                                  "http://xmlns.oracle.com/SKYConsultas/ConsultaFormasPago/ConsultaFormaPagoActual",
                                  mode = WebParam.Mode.OUT) Holder<List<FormaPagoActualSBLOutput>> listaFormasPago);

}