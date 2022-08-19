
package mx.com.sky.sel.proxyclients.secinterface.utilsscprocess;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import mx.com.sky.enterpriseobjects.sec.utilsofscprocessinterface.UtilsOfscProcessRequestEBMType;
import mx.com.sky.enterpriseobjects.sec.utilsofscprocessinterface.UtilsOfscProcessResponseEBMType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "UtilsOfscProcessSecInterface",
            targetNamespace = "http://xmlns.sky.com.mx/InterfaceServices/Sec/UtilsOfscProcess")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ com.oracle.xmlns.pcbpel.adapter.db.sp.dbutilsofscprocesssec.ObjectFactory.class,
              mx.com.sky.enterpriseobjects.sec.utilsofscprocessinterface.ObjectFactory.class,
              mx.com.sky.enterpriseobjects.sel.common.v1.ObjectFactory.class,
              org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_secext_1_0.ObjectFactory.class,
              org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0.ObjectFactory.class
    })
public interface UtilsOfscProcessSecInterface {


    /**
     *
     * @param payload
     * @return
     *     returns mx.com.sky.enterpriseobjects.sec.utilsofscprocessinterface.UtilsOfscProcessResponseEBMType
     */
    @WebMethod(action = "http://xmlns.sky.com.mx/InterfaceServices/Sec/UtilsOfscProcess/utilsOfscProcessSecInterface")
    @WebResult(name = "UtilsOfscProcessResponseEBM",
               targetNamespace = "http://www.sky.com.mx/EnterpriseObjects/Sec/UtilsOfscProcessInterface",
               partName = "payload")
    public UtilsOfscProcessResponseEBMType utilsOfscProcessSecInterface(@WebParam(name = "UtilsOfscProcessRequestEBM",
                                                                                  targetNamespace =
                                                                                  "http://www.sky.com.mx/EnterpriseObjects/Sec/UtilsOfscProcessInterface",
                                                                                  partName = "payload")
                                                                        UtilsOfscProcessRequestEBMType payload);

}
