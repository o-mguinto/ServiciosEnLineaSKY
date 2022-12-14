
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultapreciocanal;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapreciocanal.types.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "ConsultaPrecioCanal",
            targetNamespace = "http://xmlns.oracle.com/SKYConsultas/ConsultaCanalesALaCarta/ConsultaPrecioCanal")
@XmlSeeAlso({ ObjectFactory.class })
public interface ConsultaPrecioCanal {


    /**
     *
     * @param resultado
     * @param costo
     * @param sistema
     * @param paisISO
     * @param tipoCuenta
     * @param pagoOportuno
     * @param numCanal
     * @param ctaSky
     * @param resultadodesc
     */
    @WebMethod(action = "process")
    @RequestWrapper(localName = "process",
                    targetNamespace =
                    "http://xmlns.oracle.com/SKYConsultas/ConsultaCanalesALaCarta/ConsultaPrecioCanal",
                    className = "mx.com.sky.sel.proxyclients.pagwebconsultas.consultapreciocanal.types.Process")
    @ResponseWrapper(localName = "processResponse",
                     targetNamespace =
                     "http://xmlns.oracle.com/SKYConsultas/ConsultaCanalesALaCarta/ConsultaPrecioCanal",
                     className =
                     "mx.com.sky.sel.proxyclients.pagwebconsultas.consultapreciocanal.types.ProcessResponse")
    public void process(@WebParam(name = "numCanal",
                                  targetNamespace =
                                  "http://xmlns.oracle.com/SKYConsultas/ConsultaCanalesALaCarta/ConsultaPrecioCanal")
                        String numCanal,
                        @WebParam(name = "paisISO",
                                  targetNamespace =
                                  "http://xmlns.oracle.com/SKYConsultas/ConsultaCanalesALaCarta/ConsultaPrecioCanal")
                        String paisISO,
                        @WebParam(name = "SISTEMA",
                                  targetNamespace =
                                  "http://xmlns.oracle.com/SKYConsultas/ConsultaCanalesALaCarta/ConsultaPrecioCanal")
                        String sistema,
                        @WebParam(name = "ctaSky",
                                  targetNamespace =
                                  "http://xmlns.oracle.com/SKYConsultas/ConsultaCanalesALaCarta/ConsultaPrecioCanal")
                        String ctaSky,
                        @WebParam(name = "tipoCuenta",
                                  targetNamespace =
                                  "http://xmlns.oracle.com/SKYConsultas/ConsultaCanalesALaCarta/ConsultaPrecioCanal")
                        String tipoCuenta,
                        @WebParam(name = "resultado",
                                  targetNamespace =
                                  "http://xmlns.oracle.com/SKYConsultas/ConsultaCanalesALaCarta/ConsultaPrecioCanal",
                                  mode = WebParam.Mode.OUT) Holder<String> resultado,
                        @WebParam(name = "resultadodesc",
                                  targetNamespace =
                                  "http://xmlns.oracle.com/SKYConsultas/ConsultaCanalesALaCarta/ConsultaPrecioCanal",
                                  mode = WebParam.Mode.OUT) Holder<String> resultadodesc,
                        @WebParam(name = "costo",
                                  targetNamespace =
                                  "http://xmlns.oracle.com/SKYConsultas/ConsultaCanalesALaCarta/ConsultaPrecioCanal",
                                  mode = WebParam.Mode.OUT) Holder<String> costo,
                        @WebParam(name = "pagoOportuno",
                                  targetNamespace =
                                  "http://xmlns.oracle.com/SKYConsultas/ConsultaCanalesALaCarta/ConsultaPrecioCanal",
                                  mode = WebParam.Mode.OUT) Holder<String> pagoOportuno);

}
