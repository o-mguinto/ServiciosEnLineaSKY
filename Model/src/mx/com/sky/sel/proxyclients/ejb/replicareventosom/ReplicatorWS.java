
package mx.com.sky.sel.proxyclients.ejb.replicareventosom;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import mx.com.sky.sel.proxyclients.ejb.replicareventosom.types.ObjectFactory;
import mx.com.sky.sel.proxyclients.ejb.replicareventosom.types.ReplicatorBean;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "ReplicatorWS", targetNamespace = "http://ws.eventos.servicios.sky.com.mx/")
@XmlSeeAlso({ ObjectFactory.class })
public interface ReplicatorWS {


    /**
     *
     * @param arg0
     * @return
     *     returns mx.com.sky.sel.proxyclients.ejb.replicareventosom.types.ReplicatorBean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "procesar", targetNamespace = "http://ws.eventos.servicios.sky.com.mx/",
                    className = "mx.com.sky.sel.proxyclients.ejb.replicareventosom.types.Procesar")
    @ResponseWrapper(localName = "procesarResponse", targetNamespace = "http://ws.eventos.servicios.sky.com.mx/",
                     className = "mx.com.sky.sel.proxyclients.ejb.replicareventosom.types.ProcesarResponse")
    @Action(input = "http://ws.eventos.servicios.sky.com.mx/ReplicatorWS/procesarRequest",
            output = "http://ws.eventos.servicios.sky.com.mx/ReplicatorWS/procesarResponse")
    public ReplicatorBean procesar(@WebParam(name = "arg0", targetNamespace = "") ReplicatorBean arg0);

}
