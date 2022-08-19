package mx.com.sky.sel.managedbeans.estadocuenta;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.ArrayList;
import java.util.List;

import javax.faces.context.FacesContext;

import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.services.beans.estadocuenta.EstadosCuenta;
import mx.com.sky.sel.services.hijump.estadocuenta.ServicioEstadoCuenta;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

public class BBEstadoCuenta implements Serializable {
    @SuppressWarnings("compatibility:4620087973419891139")
    private static final long serialVersionUID = 659463953841763042L;

    private EstadosCuenta estadoCuenta;
    private String referenciaEdoCuenta;
    
    //getUrlEstadoCuenta() para KENAN , si se utiliza en otros casos, solo descomentar
    /*public List<String> getUrlEstadoCuenta() {
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        List<String> documento = new ArrayList<String>();
        String urlEstadoCuenta = "";

        if (estadoCuenta != null &&
            estadoCuenta.getReferenciaEdoCta() != null) {
            referenciaEdoCuenta = estadoCuenta.getReferenciaEdoCta();
        } else {
            referenciaEdoCuenta =
                    (String)ADFUtils.getValueBindings("referenciaEdoCta.inputValue");
            LogPC.println(this,
                          "Bindings referenciaEdoCuenta:" + referenciaEdoCuenta);
        }
        if (referenciaEdoCuenta != null) {
            urlEstadoCuenta =
                    Parametros.getUrlEstadoCuenta(referenciaEdoCuenta,
                                                  sesion.getSuscriptor().getCuentaSKY());
            LogPC.println(this, "urlEstadoCuenta:" + urlEstadoCuenta);
            documento = obtenerCodigoHTML(urlEstadoCuenta);
        }

        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_ESTADO_CUENTA);
        return documento;
    }
*/
    /**
     *  m\u00E9todo que utiliza el servicio Factura_consultaEstadoDeCuenta de Hi Jump
     * @return
     */
    public List<String> getEstadoDeCuenta() {
        
        ServicioEstadoCuenta sEdoCuenta = null;

        List<String> documento = new ArrayList<String>();
        String estadoCuentaString = "";
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_ESTADO_CUENTA);
        if (estadoCuenta != null &&
            estadoCuenta.getReferenciaEdoCta() != null) {
            referenciaEdoCuenta = estadoCuenta.getReferenciaEdoCta();
        } else {
            referenciaEdoCuenta =
                    (String)ADFUtils.getValueBindings("referenciaEdoCta.inputValue");
            LogPC.println(this,
                          "Bindings referenciaEdoCuenta:" + referenciaEdoCuenta);
        }
        if (referenciaEdoCuenta != null) {
            try {

                sEdoCuenta = new ServicioEstadoCuenta();
                LogPC.println(this,
                              "referenciaEdoCuenta " + referenciaEdoCuenta);
                estadoCuentaString =
                        sEdoCuenta.consultaEstadoCuenta(referenciaEdoCuenta);
                String estadoCuentaTemporal =
                    estadoCuentaString.replaceAll("</pre>", "");
                estadoCuentaString = estadoCuentaTemporal;
                estadoCuentaTemporal =
                        estadoCuentaString.replaceAll("<table width=\\\"65%\\\">",
                                                      "");
                estadoCuentaString = estadoCuentaTemporal;
                estadoCuentaTemporal =
                        estadoCuentaString.replaceAll("</table>", "");
                estadoCuentaString = estadoCuentaTemporal;
                estadoCuentaTemporal =
                        "<table width=\\\"65%\\\">".concat(estadoCuentaString).concat("</table>");

                OutputStream file =
                    new FileOutputStream(new File("D:\\TestDos.pdf"));
                Document document = new Document();
                PdfWriter writer = PdfWriter.getInstance(document, file);
                document.open();
                InputStream is =
                    new ByteArrayInputStream(estadoCuentaTemporal.getBytes());
                XMLWorkerHelper.getInstance().parseXHtml(writer, document, is);
                document.close();
                file.close();
                File nameFile = new File("estadoCuentaH.pdf");
                FileInputStream in = new FileInputStream(nameFile);
                byte[] buffer = new byte[4096];
                int length;
                while ((length = in.read(buffer)) > 0) {
                    file.write(buffer, 0, length);
                }
                in.close();
                file.flush();


            } catch (Exception e) {
                // TODO: Add catch code
                e.printStackTrace();
            }

        }


        return documento;
    }

      public void download_estadoCuenta(FacesContext facesContext,
                                      OutputStream outputStream) {
        OutputStreamWriter w;
        List<String> estadoCuenta;
        LogPC.println(this, "download_estadoCuenta");

        try { //se elimino la validación para sistema KENAN, ya esto solo aplica para HIJUMP
                estadoCuenta = getEstadoDeCuenta();
            
            w = new OutputStreamWriter(outputStream, "UTF-8");
            for (String s : estadoCuenta) {
                w.write("\r\n");
                w.write(s);
            }
            w.flush();
        } catch (UnsupportedEncodingException e) {
            LogPC.printlnError(this, e);
        } catch (IOException e) {
            LogPC.printlnError(this, e);
        }
    }

    public void download_estadoCuentaHijump(FacesContext facesContext,
                                            OutputStream outputStream) {
        try {
            ServicioEstadoCuenta sEdoCuenta = null;
            String estadoCuentaString = "";
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_ESTADO_CUENTA);
            LogPC.println(this,
                          "referenciaEdoCuenta:" + referenciaEdoCuenta);
            if (referenciaEdoCuenta != null) {
                sEdoCuenta = new ServicioEstadoCuenta();
                LogPC.println(this,
                              "referenciaEdoCuenta " + referenciaEdoCuenta);
                estadoCuentaString =
                        sEdoCuenta.consultaEstadoCuenta(referenciaEdoCuenta);
                String estadoCuentaTemporal =
                    estadoCuentaString.replaceAll("</pre>", "");
                estadoCuentaString = estadoCuentaTemporal;
                estadoCuentaTemporal =
                        estadoCuentaString.replaceAll("<table width=\"65%\">",
                                                      "");
                estadoCuentaString = estadoCuentaTemporal;
                estadoCuentaTemporal =
                        estadoCuentaString.replaceAll("</table>", "");
                estadoCuentaString = estadoCuentaTemporal;
                estadoCuentaTemporal =
                        "<table width=\"100%\">".concat(estadoCuentaString).concat("</table>");
                Document document = new Document();
                PdfWriter writer =
                    PdfWriter.getInstance(document, outputStream);
                document.open();
                InputStream is =
                    new ByteArrayInputStream(estadoCuentaTemporal.getBytes());
                XMLWorkerHelper.getInstance().parseXHtml(writer, document, is);
                document.close();
                outputStream.close();
                outputStream.flush();
            }
        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }
    }

    private List<String> obtenerCodigoHTML(String url) {
        URL u;
        InputStream is = null;
        DataInputStream dis;
        String s;
        List<String> lista = new ArrayList<String>();
        try {
            u = new URL(url);
            is = u.openStream(); // throws an IOException

            dis = new DataInputStream(new BufferedInputStream(is));
            while ((s = dis.readLine()) != null) {
                lista.add(s);
                LogPC.println(this, s);
            }
        } catch (MalformedURLException mue) {
            LogPC.println(this, "Ouch - a MalformedURLException happened.");
            LogPC.printlnError(this, mue.getMessage(), mue);
        } catch (IOException ioe) {
            LogPC.println(this, "Oops- an IOException happened.");
            LogPC.printlnError(this, ioe.getMessage(), ioe);
        } finally {
            try {
                is.close();
            } catch (IOException ioe) {
                // just going to ignore this one
            }
        } // end of 'finally' clause
        return lista;
    }


    public void setEstadoCuenta(EstadosCuenta estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }

    public EstadosCuenta getEstadoCuenta() {
        return estadoCuenta;
    }

    public void setReferenciaEdoCuenta(String referenciaEdoCuenta) {
        this.referenciaEdoCuenta = referenciaEdoCuenta;
    }

    public String getReferenciaEdoCuenta() {
        return referenciaEdoCuenta;
    }


    public String getReferenciaTextCosto() {
        String texto = "";
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        if (sesion.isMEX()) {
            if (sesion.getPaquete().equalsIgnoreCase("UNIVERSE")) {
                texto =
                        "A partir del 1 de marzo de 2019 el costo mensual de su paquete UNIVERSE tiene un ajuste de $15 adicionales al mes en precio de lista y en pago oportuno.";
            } else if (sesion.getPaquete().equalsIgnoreCase("FOX+")) {
                texto =
                        "A partir del 1 de marzo 2019 el costo mensual de su paquete FOX+ tiene un ajuste de $15 adicionales al mes en precio de lista y en pago oportuno.";
            } else if (sesion.getPaquete().equalsIgnoreCase("SKY HD BLACK")) {
                texto =
                        "A partir del 1 de marzo de 2019 el paquete principal SKY HD BLACK tiene un ajuste de $15 adicionales al mes en precio de lista y en pago oportuno.";
            } else if (sesion.getPaquete().equalsIgnoreCase("SKY HD FOX+")) {
                texto =
                        "A partir del 1 de marzo de 2019 el paquete principal SKY HD FOX+ tiene un ajuste de $15 adicionales al mes en precio de lista y en pago oportuno.";
            }
        }else if (sesion.isCRI()) {
            if (sesion.getPaquete().contains("BASICO")) {
                texto =
                        "A partir del 14 de febrero 2019 el costo mensual de su paquete BASICO tiene un ajuste de USD$2.00 adicionales al mes en precio de lista y en pago oportuno.";
            }
        }
        return texto;
    }
}
