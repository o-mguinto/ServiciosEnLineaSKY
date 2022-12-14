
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultaedocuenta;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaedocuenta.types.ConsultaEdoCuentaProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaedocuenta.types.ConsultaEdoCuentaProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaedocuenta.types.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "ConsultaEdoCuenta", targetNamespace = "http://xmlns.oracle.com/ConsultaEdoCuenta")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
public interface ConsultaEdoCuenta {


    /**
     *
     * @param payload
     * @return
     *     returns mx.com.sky.sel.proxyclients.pagwebconsultas.consultaedocuenta.types.ConsultaEdoCuentaProcessResponse
     */
    @WebMethod(action = "process")
    @WebResult(name = "ConsultaEdoCuentaProcessResponse", targetNamespace = "http://xmlns.oracle.com/ConsultaEdoCuenta",
               partName = "payload")
    public ConsultaEdoCuentaProcessResponse process(@WebParam(name = "ConsultaEdoCuentaProcessRequest",
                                                              targetNamespace =
                                                              "http://xmlns.oracle.com/ConsultaEdoCuenta",
                                                              partName = "payload")
                                                    ConsultaEdoCuentaProcessRequest payload);

}
