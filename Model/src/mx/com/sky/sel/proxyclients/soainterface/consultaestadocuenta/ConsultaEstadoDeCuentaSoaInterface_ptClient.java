package mx.com.sky.sel.proxyclients.soainterface.consultaestadocuenta;

import javax.xml.ws.WebServiceRef;
// !THE CHANGES MADE TO THIS FILE WILL BE DESTROYED IF REGENERATED!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

public class ConsultaEstadoDeCuentaSoaInterface_ptClient
{
  @WebServiceRef
  private static ConsultaEstadoDeCuentaSoaInterface_ep consultaEstadoDeCuentaSoaInterface_ep;

  public static void main(String [] args)
  {
    consultaEstadoDeCuentaSoaInterface_ep = new ConsultaEstadoDeCuentaSoaInterface_ep();
    ConsultaEstadoDeCuentaSoaInterface consultaEstadoDeCuentaSoaInterface = consultaEstadoDeCuentaSoaInterface_ep.getConsultaEstadoDeCuentaSoaInterface_pt();
    // Add your code to call the desired methods.
  }
}
