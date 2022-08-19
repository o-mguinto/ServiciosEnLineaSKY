package mx.com.sky.sel.managedbeans.encusatisfaccion;

import java.io.Serializable;

import java.text.SimpleDateFormat;

import java.util.Calendar;

import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

public class BBSatisfaccion implements Serializable {
    @SuppressWarnings("compatibility:980910227147938136")
    private static final long serialVersionUID = 3124304352749790515L;
    private EncuestaSatisfaccion encuestaSatisfaccion;

                public BBSatisfaccion() {
                    super();
                    encuestaSatisfaccion = new EncuestaSatisfaccion();
                }

                public String guargarEncuesta() {
                    ServicioSatisfaccion ss = new ServicioSatisfaccion();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
                    String folio = "";
                    String cuentaSKY = "";
                    String pais = "";
                    String userID = "";
                    String paquete = "";
                    ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
                    try {
                        cuentaSKY = sesion.getSuscriptor().getCuentaSKY();
                        pais = sesion.getSuscriptor().getPaisISO();
                        userID = sesion.getUsuario().getUid();
                        paquete = sesion.getSuscriptor().getPaquete();
                        folio = sdf.format(Calendar.getInstance().getTime());
                        encuestaSatisfaccion.setFolio(folio);
                        encuestaSatisfaccion.setDatos(pais, userID, cuentaSKY, paquete);
                        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.ENCUESTA_SATISFACCION);
                        ss.agregarEncuesta(encuestaSatisfaccion.obtenerListaSatisfaccion());
                    } catch (Exception e) {
                        LogPC.printlnError(this, e.getMessage(), e);
                    }
                    encuestaSatisfaccion = new EncuestaSatisfaccion();
                    ADFUtils.showInfoMessage("¡Muchas gracias por haberse tomado el tiempo para completar esta encuesta!");
                    return null;
                }


                public void setEncuestaSatisfaccion(EncuestaSatisfaccion encuestaSatisfaccion) {
                    this.encuestaSatisfaccion = encuestaSatisfaccion;
                }

                public EncuestaSatisfaccion getEncuestaSatisfaccion() {
                    return encuestaSatisfaccion;
                }
}
