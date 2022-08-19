
package mx.com.sky.sel.proxyclients.selebf.recuperarpasswordusr;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import mx.com.sky.enterpriseflowmessage.sel.recuperarpasswordusrebf.RecuperarPasswordUsrRequestEBFEBMType;
import mx.com.sky.enterpriseflowmessage.sel.recuperarpasswordusrebf.RecuperarPasswordUsrResponseEBFEBMType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "RecuperarPasswordUsrSelEBF",
            targetNamespace = "http://xmlns.sky.com.mx/EnterpriseFlows/Sel/RecuperarPasswordUsr")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ mx.com.sky.enterpriseflowmessage.sel.recuperarpasswordusrebf.ObjectFactory.class,
              mx.com.sky.enterpriseobjects.sel.common.v1.ObjectFactory.class })
public interface RecuperarPasswordUsrSelEBF {


    /**
     *
     * @param payload
     * @return
     *     returns mx.com.sky.enterpriseflowmessage.sel.recuperarpasswordusrebf.RecuperarPasswordUsrResponseEBFEBMType
     */
    @WebMethod(action = "http://xmlns.sky.com.mx/EnterpriseFlows/Sel/RecuperarPasswordUsr/recuperarPasswordUsr")
    @WebResult(name = "RecuperarPasswordUsrResponseEBFEBM",
               targetNamespace = "http://www.sky.com.mx/EnterpriseFlowMessage/Sel/RecuperarPasswordUsrEBF",
               partName = "payload")
    public RecuperarPasswordUsrResponseEBFEBMType recuperarPasswordUsr(@WebParam(name =
                                                                                 "RecuperarPasswordUsrRequestEBFEBM",
                                                                                 targetNamespace =
                                                                                 "http://www.sky.com.mx/EnterpriseFlowMessage/Sel/RecuperarPasswordUsrEBF",
                                                                                 partName = "payload")
                                                                       RecuperarPasswordUsrRequestEBFEBMType payload);

}
