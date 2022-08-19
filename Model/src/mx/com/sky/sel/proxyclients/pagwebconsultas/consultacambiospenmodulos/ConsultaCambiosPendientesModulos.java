
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultacambiospenmodulos;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacambiospenmodulos.types.ConsultaCambiosPendientesModulosProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacambiospenmodulos.types.ConsultaCambiosPendientesModulosProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacambiospenmodulos.types.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "ConsultaCambiosPendientesModulos",
            targetNamespace = "http://xmlns.oracle.com/ConsultaCambiosPendientesModulos")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
public interface ConsultaCambiosPendientesModulos {


    /**
     *
     * @param payload
     * @return
     *     returns mx.com.sky.sel.proxyclients.pagwebconsultas.consultacambiospenmodulos.types.ConsultaCambiosPendientesModulosProcessResponse
     */
    @WebMethod(action = "process")
    @WebResult(name = "ConsultaCambiosPendientesModulosProcessResponse",
               targetNamespace = "http://xmlns.oracle.com/ConsultaCambiosPendientesModulos", partName = "payload")
    public ConsultaCambiosPendientesModulosProcessResponse process(@WebParam(name =
                                                                             "ConsultaCambiosPendientesModulosProcessRequest",
                                                                             targetNamespace =
                                                                             "http://xmlns.oracle.com/ConsultaCambiosPendientesModulos",
                                                                             partName = "payload")
                                                                   ConsultaCambiosPendientesModulosProcessRequest payload);

}