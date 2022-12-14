
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultamodulos;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import mx.com.sky.sel.proxyclients.pagwebconsultas.consultamodulos.types.ConsultaModulosProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultamodulos.types.ConsultaModulosProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultamodulos.types.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "ConsultaModulos", targetNamespace = "http://xmlns.oracle.com/ConsultaModulos")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
public interface ConsultaModulos {


    /**
     *
     * @param payload
     * @return
     *     returns mx.com.sky.sel.proxyclients.pagwebconsultas.consultamodulos.types.ConsultaModulosProcessResponse
     */
    @WebMethod(action = "process")
    @WebResult(name = "ConsultaModulosProcessResponse", targetNamespace = "http://xmlns.oracle.com/ConsultaModulos",
               partName = "payload")
    public ConsultaModulosProcessResponse process(@WebParam(name = "ConsultaModulosProcessRequest",
                                                            targetNamespace = "http://xmlns.oracle.com/ConsultaModulos",
                                                            partName = "payload")
                                                  ConsultaModulosProcessRequest payload);

}
