
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultausers;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import mx.com.sky.sel.proxyclients.pagwebconsultas.consultausers.types.ConsultaUsersProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultausers.types.ConsultaUsersProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultausers.types.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "ConsultaUsers", targetNamespace = "http://xmlns.oracle.com/ConsultaUsers")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
public interface ConsultaUsers {


    /**
     *
     * @param payload
     * @return
     *     returns mx.com.sky.sel.proxyclients.pagwebconsultas.consultausers.types.ConsultaUsersProcessResponse
     */
    @WebMethod(action = "process")
    @WebResult(name = "ConsultaUsersProcessResponse", targetNamespace = "http://xmlns.oracle.com/ConsultaUsers",
               partName = "payload")
    public ConsultaUsersProcessResponse process(@WebParam(name = "ConsultaUsersProcessRequest",
                                                          targetNamespace = "http://xmlns.oracle.com/ConsultaUsers",
                                                          partName = "payload") ConsultaUsersProcessRequest payload);

}
