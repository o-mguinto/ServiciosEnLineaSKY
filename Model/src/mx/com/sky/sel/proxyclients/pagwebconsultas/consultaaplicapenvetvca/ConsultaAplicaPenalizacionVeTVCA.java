
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultaaplicapenvetvca;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaaplicapenvetvca.types.ConsultaAplicaPenalizacionVeTVCAProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaaplicapenvetvca.types.ConsultaAplicaPenalizacionVeTVCAProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaaplicapenvetvca.types.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "ConsultaAplicaPenalizacionVeTVCA",
            targetNamespace = "http://xmlns.oracle.com/ConsultaAplicaPenalizacionVeTVCA")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
public interface ConsultaAplicaPenalizacionVeTVCA {


    /**
     *
     * @param payload
     * @return
     *     returns mx.com.sky.sel.proxyclients.pagwebconsultas.consultaaplicapenvetvca.types.ConsultaAplicaPenalizacionVeTVCAProcessResponse
     */
    @WebMethod(action = "process")
    @WebResult(name = "ConsultaAplicaPenalizacionVeTVCAProcessResponse",
               targetNamespace = "http://xmlns.oracle.com/ConsultaAplicaPenalizacionVeTVCA", partName = "payload")
    public ConsultaAplicaPenalizacionVeTVCAProcessResponse process(@WebParam(name =
                                                                             "ConsultaAplicaPenalizacionVeTVCAProcessRequest",
                                                                             targetNamespace =
                                                                             "http://xmlns.oracle.com/ConsultaAplicaPenalizacionVeTVCA",
                                                                             partName = "payload")
                                                                   ConsultaAplicaPenalizacionVeTVCAProcessRequest payload);

}
