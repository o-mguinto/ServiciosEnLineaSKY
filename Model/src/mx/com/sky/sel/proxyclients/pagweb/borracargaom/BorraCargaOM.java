
package mx.com.sky.sel.proxyclients.pagweb.borracargaom;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import mx.com.sky.sel.proxyclients.pagweb.borracargaom.types.BorraCargaOMProcessRequest;
import mx.com.sky.sel.proxyclients.pagweb.borracargaom.types.BorraCargaOMProcessResponse;
import mx.com.sky.sel.proxyclients.pagweb.borracargaom.types.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "BorraCargaOM", targetNamespace = "http://xmlns.oracle.com/BorraCargaOM")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
public interface BorraCargaOM {


    /**
     *
     * @param payload
     * @return
     *     returns mx.com.sky.sel.proxyclients.pagweb.borracargaom.types.BorraCargaOMProcessResponse
     */
    @WebMethod(action = "process")
    @WebResult(name = "BorraCargaOMProcessResponse", targetNamespace = "http://xmlns.oracle.com/BorraCargaOM",
               partName = "payload")
    public BorraCargaOMProcessResponse process(@WebParam(name = "BorraCargaOMProcessRequest",
                                                         targetNamespace = "http://xmlns.oracle.com/BorraCargaOM",
                                                         partName = "payload") BorraCargaOMProcessRequest payload);

}