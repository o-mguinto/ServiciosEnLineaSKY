
package mx.com.sky.sel.proxyclients.selinterface.validarpreregistro;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import mx.com.sky.enterpriseobjects.sel.validarpreregistroselinterface.ValidarPreRegistroSelEBMType;
import mx.com.sky.enterpriseobjects.sel.validarpreregistroselinterface.ValidarPreRegistroSelResponseEBMType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "ValidarPreRegistroSelInterface",
            targetNamespace = "http://xmlns.sky.com.mx/InterfaceServices/Sel/ValidarPreRegistroSel")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ com.oracle.xmlns.pcbpel.adapter.db.dbvalidarpreregistrosel.ObjectFactory.class,
              mx.com.sky.enterpriseobjects.sel.common.v1.ObjectFactory.class,
              mx.com.sky.enterpriseobjects.sel.validarpreregistroselinterface.ObjectFactory.class
    })
public interface ValidarPreRegistroSelInterface {


    /**
     *
     * @param payload
     * @return
     *     returns mx.com.sky.enterpriseobjects.sel.validarpreregistroselinterface.ValidarPreRegistroSelResponseEBMType
     */
    @WebMethod(action = "http://xmlns.sky.com.mx/InterfaceServices/Sel/ValidarPreRegistroSel/validarPreRegistroSel")
    @WebResult(name = "ValidarPreRegistroSelResponseEBM",
               targetNamespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/ValidarPreRegistroSelInterface",
               partName = "payload")
    public ValidarPreRegistroSelResponseEBMType validarPreRegistroSel(@WebParam(name = "ValidarPreRegistroSelEBM",
                                                                                targetNamespace =
                                                                                "http://www.sky.com.mx/EnterpriseObjects/Sel/ValidarPreRegistroSelInterface",
                                                                                partName = "payload")
                                                                      ValidarPreRegistroSelEBMType payload);

}
