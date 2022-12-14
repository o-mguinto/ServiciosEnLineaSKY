
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultaapg;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaapg.types.INPUT;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaapg.types.OUTPUT;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaapg.types.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "Consulta_APG", targetNamespace = "http://xmlns.oracle.com/SKYConsultas/ConsultaAPG/Consulta_APG")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
public interface ConsultaAPG {


    /**
     *
     * @param payload
     * @return
     *     returns mx.com.sky.sel.proxyclients.pagwebconsultas.consultaapg.types.OUTPUT
     */
    @WebMethod(action = "process")
    @WebResult(name = "OUTPUT", targetNamespace = "http://xmlns.oracle.com/consultaProgramacion", partName = "payload")
    public OUTPUT process(@WebParam(name = "INPUT", targetNamespace = "http://xmlns.oracle.com/consultaProgramacion",
                                    partName = "payload") INPUT payload);

}
