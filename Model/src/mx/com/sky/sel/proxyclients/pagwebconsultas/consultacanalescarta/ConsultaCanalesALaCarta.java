
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultacanalescarta;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacanalescarta.types.ConsultaCanalesALaCartaProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacanalescarta.types.ConsultaCanalesALaCartaProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacanalescarta.types.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "ConsultaCanalesALaCarta", targetNamespace = "http://xmlns.oracle.com/ConsultaCanalesALaCarta")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
public interface ConsultaCanalesALaCarta {


    /**
     *
     * @param payload
     * @return
     *     returns mx.com.sky.sel.proxyclients.pagwebconsultas.consultacanalescarta.types.ConsultaCanalesALaCartaProcessResponse
     */
    @WebMethod(action = "process")
    @WebResult(name = "ConsultaCanalesALaCartaProcessResponse",
               targetNamespace = "http://xmlns.oracle.com/ConsultaCanalesALaCarta", partName = "payload")
    public ConsultaCanalesALaCartaProcessResponse process(@WebParam(name = "ConsultaCanalesALaCartaProcessRequest",
                                                                    targetNamespace =
                                                                    "http://xmlns.oracle.com/ConsultaCanalesALaCarta",
                                                                    partName = "payload")
                                                          ConsultaCanalesALaCartaProcessRequest payload);

}