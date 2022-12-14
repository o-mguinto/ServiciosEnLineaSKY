
package mx.com.sky.sel.proxyclients.pagwebconsultas.updatemotor;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import mx.com.sky.sel.proxyclients.pagwebconsultas.updatemotor.types.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "BPELUpdateMotor",
            targetNamespace = "http://xmlns.oracle.com/SKYConsultas/ConsultaConfig_General/BPELUpdateMotor")
@XmlSeeAlso({ ObjectFactory.class })
public interface BPELUpdateMotor {


    /**
     *
     * @param resultado
     * @param operacion
     * @param urlMotorPago
     * @param pais
     * @param resultadodesc
     */
    @WebMethod(action = "process")
    @RequestWrapper(localName = "process",
                    targetNamespace = "http://xmlns.oracle.com/SKYConsultas/ConsultaConfig_General/BPELUpdateMotor",
                    className = "mx.com.sky.sel.proxyclients.pagwebconsultas.updatemotor.types.Process")
    @ResponseWrapper(localName = "processResponse",
                     targetNamespace = "http://xmlns.oracle.com/SKYConsultas/ConsultaConfig_General/BPELUpdateMotor",
                     className = "mx.com.sky.sel.proxyclients.pagwebconsultas.updatemotor.types.ProcessResponse")
    public void process(@WebParam(name = "operacion",
                                  targetNamespace =
                                  "http://xmlns.oracle.com/SKYConsultas/ConsultaConfig_General/BPELUpdateMotor")
                        String operacion,
                        @WebParam(name = "pais",
                                  targetNamespace =
                                  "http://xmlns.oracle.com/SKYConsultas/ConsultaConfig_General/BPELUpdateMotor")
                        String pais,
                        @WebParam(name = "urlMotorPago",
                                  targetNamespace =
                                  "http://xmlns.oracle.com/SKYConsultas/ConsultaConfig_General/BPELUpdateMotor")
                        String urlMotorPago,
                        @WebParam(name = "resultado",
                                  targetNamespace =
                                  "http://xmlns.oracle.com/SKYConsultas/ConsultaConfig_General/BPELUpdateMotor",
                                  mode = WebParam.Mode.OUT) Holder<String> resultado,
                        @WebParam(name = "resultadodesc",
                                  targetNamespace =
                                  "http://xmlns.oracle.com/SKYConsultas/ConsultaConfig_General/BPELUpdateMotor",
                                  mode = WebParam.Mode.OUT) Holder<String> resultadodesc);

}
