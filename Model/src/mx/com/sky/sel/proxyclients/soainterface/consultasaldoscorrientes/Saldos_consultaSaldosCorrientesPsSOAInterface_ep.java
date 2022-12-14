package mx.com.sky.sel.proxyclients.soainterface.consultasaldoscorrientes;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

@WebServiceClient(wsdlLocation="https://qaselsoa.sky.com.mx:443/soa-infra/services/SOA_Interface/Saldos_consultaSaldosCorrientesPsSOAInterface/Saldos_consultaSaldosCorrientesPsSOAInterface_ep?WSDL",
  targetNamespace="http://xmlns.sky.com.mx/InterfaceServices/SOA/Saldos_consultaSaldosCorrientesPsSOAInterface",
  name="Saldos_consultaSaldosCorrientesPsSOAInterface_ep")
public class Saldos_consultaSaldosCorrientesPsSOAInterface_ep
  extends Service
{
  private static URL wsdlLocationURL;

  private static Logger logger;
  static
  {
    try
    {
      logger = Logger.getLogger("mx.com.sky.sel.proxyclients.soainterface.consultasaldoscorrientes.Saldos_consultaSaldosCorrientesPsSOAInterface_ep");
      URL baseUrl =
        Saldos_consultaSaldosCorrientesPsSOAInterface_ep.class.getResource(".");
      if (baseUrl == null)
      {
        wsdlLocationURL =
            Saldos_consultaSaldosCorrientesPsSOAInterface_ep.class
            .getResource("https://qaselsoa.sky.com.mx:443/soa-infra/services/SOA_Interface/Saldos_consultaSaldosCorrientesPsSOAInterface/Saldos_consultaSaldosCorrientesPsSOAInterface_ep?WSDL");
        if (wsdlLocationURL == null)
        {
          baseUrl = new File(".").toURL();
          wsdlLocationURL =
              new URL(baseUrl, "https://qaselsoa.sky.com.mx:443/soa-infra/services/SOA_Interface/Saldos_consultaSaldosCorrientesPsSOAInterface/Saldos_consultaSaldosCorrientesPsSOAInterface_ep?WSDL");
        }
      }
      else
      {
                if (!baseUrl.getPath().endsWith("/")) {
         baseUrl = new URL(baseUrl, baseUrl.getPath() + "/");
}
                wsdlLocationURL =
            new URL(baseUrl, "https://qaselsoa.sky.com.mx:443/soa-infra/services/SOA_Interface/Saldos_consultaSaldosCorrientesPsSOAInterface/Saldos_consultaSaldosCorrientesPsSOAInterface_ep?WSDL");
      }
    }
    catch (MalformedURLException e)
    {
      logger.log(Level.ALL,
          "Failed to create wsdlLocationURL using https://qaselsoa.sky.com.mx:443/soa-infra/services/SOA_Interface/Saldos_consultaSaldosCorrientesPsSOAInterface/Saldos_consultaSaldosCorrientesPsSOAInterface_ep?WSDL",
          e);
    }
  }

  public Saldos_consultaSaldosCorrientesPsSOAInterface_ep()
  {
    super(wsdlLocationURL,
          new QName("http://xmlns.sky.com.mx/InterfaceServices/SOA/Saldos_consultaSaldosCorrientesPsSOAInterface",
                    "Saldos_consultaSaldosCorrientesPsSOAInterface_ep"));
  }

  public Saldos_consultaSaldosCorrientesPsSOAInterface_ep(URL wsdlLocation,
                                                          QName serviceName)
  {
    super(wsdlLocation, serviceName);
  }

  @WebEndpoint(name="Saldos_consultaSaldosCorrientesPsSOAInterface_pt")
  public mx.com.sky.sel.proxyclients.soainterface.consultasaldoscorrientes.Saldos_consultaSaldosCorrientesPsSOAInterface getSaldos_consultaSaldosCorrientesPsSOAInterface_pt()
  {
    return (mx.com.sky.sel.proxyclients.soainterface.consultasaldoscorrientes.Saldos_consultaSaldosCorrientesPsSOAInterface) super.getPort(new QName("http://xmlns.sky.com.mx/InterfaceServices/SOA/Saldos_consultaSaldosCorrientesPsSOAInterface",
                                                                                                                                                     "Saldos_consultaSaldosCorrientesPsSOAInterface_pt"),
                                                                                                                                           mx.com.sky.sel.proxyclients.soainterface.consultasaldoscorrientes.Saldos_consultaSaldosCorrientesPsSOAInterface.class);
  }

  @WebEndpoint(name="Saldos_consultaSaldosCorrientesPsSOAInterface_pt")
  public mx.com.sky.sel.proxyclients.soainterface.consultasaldoscorrientes.Saldos_consultaSaldosCorrientesPsSOAInterface getSaldos_consultaSaldosCorrientesPsSOAInterface_pt(WebServiceFeature... features)
  {
    return (mx.com.sky.sel.proxyclients.soainterface.consultasaldoscorrientes.Saldos_consultaSaldosCorrientesPsSOAInterface) super.getPort(new QName("http://xmlns.sky.com.mx/InterfaceServices/SOA/Saldos_consultaSaldosCorrientesPsSOAInterface",
                                                                                                                                                     "Saldos_consultaSaldosCorrientesPsSOAInterface_pt"),
                                                                                                                                           mx.com.sky.sel.proxyclients.soainterface.consultasaldoscorrientes.Saldos_consultaSaldosCorrientesPsSOAInterface.class,
                                                                                                                                           features);
  }
}
