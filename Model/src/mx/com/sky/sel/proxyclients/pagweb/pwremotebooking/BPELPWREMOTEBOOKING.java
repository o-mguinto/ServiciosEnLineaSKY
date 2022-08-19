
package mx.com.sky.sel.proxyclients.pagweb.pwremotebooking;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;

import mx.com.sky.sel.proxyclients.pagweb.pwremotebooking.types.ObjectFactory;
import mx.com.sky.sel.proxyclients.pagweb.pwremotebooking.types.RemotebookingTypeIN;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "BPEL_PW_REMOTEBOOKING",
            targetNamespace = "http://xmlns.oracle.com/PAGWEB_BAM/PAGWEB_BAM/BPEL_PW_REMOTEBOOKING")
@XmlSeeAlso({ ObjectFactory.class })
public interface BPELPWREMOTEBOOKING {


    /**
     *
     * @param input
     */
    @WebMethod(action = "process")
    @Oneway
    @RequestWrapper(localName = "process",
                    targetNamespace = "http://xmlns.oracle.com/PAGWEB_BAM/PAGWEB_BAM/BPEL_PW_REMOTEBOOKING",
                    className = "mx.com.sky.sel.proxyclients.pagweb.pwremotebooking.types.Process")
    public void process(@WebParam(name = "input",
                                  targetNamespace =
                                  "http://xmlns.oracle.com/PAGWEB_BAM/PAGWEB_BAM/BPEL_PW_REMOTEBOOKING")
                        RemotebookingTypeIN input);

}
