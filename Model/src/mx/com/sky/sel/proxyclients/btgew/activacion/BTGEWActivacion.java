
package mx.com.sky.sel.proxyclients.btgew.activacion;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import mx.com.sky.sel.proxyclients.btgew.activacion.types.BtgewActivacionInType;
import mx.com.sky.sel.proxyclients.btgew.activacion.types.BtgewActivacionOutType;
import mx.com.sky.sel.proxyclients.btgew.activacion.types.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "BTGEW_Activacion",
            targetNamespace = "http://xmlns.oracle.com/SKY_BTGEW/Activacion/BTGEW_Activacion")
@XmlSeeAlso({ ObjectFactory.class })
public interface BTGEWActivacion {


    /**
     *
     * @param input
     * @return
     *     returns mx.com.sky.sel.proxyclients.btgew.activacion.types.BtgewActivacionOutType
     */
    @WebMethod(action = "process")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/SKY_BTGEW/Activacion/BTGEW_Activacion")
    @RequestWrapper(localName = "process",
                    targetNamespace = "http://xmlns.oracle.com/SKY_BTGEW/Activacion/BTGEW_Activacion",
                    className = "mx.com.sky.sel.proxyclients.btgew.activacion.types.Process")
    @ResponseWrapper(localName = "processResponse",
                     targetNamespace = "http://xmlns.oracle.com/SKY_BTGEW/Activacion/BTGEW_Activacion",
                     className = "mx.com.sky.sel.proxyclients.btgew.activacion.types.ProcessResponse")
    public BtgewActivacionOutType process(@WebParam(name = "input",
                                                    targetNamespace =
                                                    "http://xmlns.oracle.com/SKY_BTGEW/Activacion/BTGEW_Activacion")
                                          BtgewActivacionInType input);

}
