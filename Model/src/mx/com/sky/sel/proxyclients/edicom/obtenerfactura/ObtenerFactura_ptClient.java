package mx.com.sky.sel.proxyclients.edicom.obtenerfactura;

import javax.xml.ws.WebServiceRef;
// !THE CHANGES MADE TO THIS FILE WILL BE DESTROYED IF REGENERATED!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

public class ObtenerFactura_ptClient
{
  @WebServiceRef
  private static Obtenerfactura_client_ep obtenerfactura_client_ep;

  public static void main(String [] args)
  {
    obtenerfactura_client_ep = new Obtenerfactura_client_ep();
    ObtenerFactura obtenerFactura = obtenerfactura_client_ep.getObtenerFactura_pt();
    // Add your code to call the desired methods.
  }
}
