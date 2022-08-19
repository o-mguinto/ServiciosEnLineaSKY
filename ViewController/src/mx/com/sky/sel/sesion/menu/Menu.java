package mx.com.sky.sel.sesion.menu;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import mx.com.sky.sel.beans.utils.ParametrosPago;
import mx.com.sky.sel.log.LogPC;

import mx.com.sky.sel.utils.JSFUtils;

import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;

import oracle.adf.controller.TaskFlowId;


public class Menu implements Serializable {
    @SuppressWarnings("compatibility:5463840938365327156")
    private static final long serialVersionUID = 6122222314585873036L;
    private String taskFlowId;
    private String titulo ;
    private boolean fromPagos = false;
    private int idxDiscloused;

    public Menu() {
        fromPagos = false;
        LogPC.println(this,
                      "------------------------- Menu() ------------------------- ");
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        if (sesion.isPaginaFallo()) {
            taskFlowId = "/WEB-INF/tfc_pc/pc_TFC_Vacio.xml#pc_TFC_Vacio";
            //titulo = "SKY";
        } else {
            if (!sesion.getUsuario().getPrimerLogin().equalsIgnoreCase("Y")) {
                taskFlowId =
                        "/WEB-INF/tfc_pc/pc_TFC_Admon_MiCuenta.xml#pc_TFC_Admon_MiCuenta";
               // titulo = "Actualizaci\u00F3n de datos";
            } else {
                if (sesion.getSuscriptor().getOrganizationType().equalsIgnoreCase("Hotel")) {
                    taskFlowId =
                            "/WEB-INF/estadoCuentaTF.xml#estadoCuentaTF";
                    //titulo = "Saldo Actual";
                } else {
                    if (sesion.isMBLUE_TO_GO()) {
                        taskFlowId =
                                "/WEB-INF/blueToGoVideoEverywhereTF.xml#blueToGoVideoEverywhereTF";
                        //titulo = "Eventos Disponibles Blue To Go Everywhere";
                    }
                }
            }
            if (sesion.isUserVeTV()) {
                taskFlowId = "/WEB-INF/pagoTF.xml#pagoTF";
                //titulo = "Adelanta Recargas";
            }else if (sesion.isUserMini()) {
                taskFlowId = "/WEB-INF/saldoActualTF.xml#saldoActualTF";
                //titulo = "Saldo Actual";                                           
            } else if (!(sesion.getSuscriptor().getStatusCuenta().equalsIgnoreCase("Activa") ||
                         sesion.getSuscriptor().getStatusCuenta().equalsIgnoreCase("Reactivada Temporalmente"))) {
                ParametrosPago parametrosPago =
                    (ParametrosPago)JSFUtils.getBean("ParametrosPago");
                if (sesion.isUserVeTV()) {
                    parametrosPago.setTipoPago(sesion.getCodigoRecargaVeTV());
                    taskFlowId = "/WEB-INF/pagoTF.xml#pagoTF";
                    //titulo = "Recargar VETV";
                    //titulo = "Adelanta Recargas";

                } else {
                    parametrosPago.setTipoPago("PAGO");
                    taskFlowId = "/WEB-INF/pagoTF.xml#pagoTF";
                    //titulo = "Realizar Pago";
                }
            }
            if (sesion.isPUNTO_VENTA()) {
                taskFlowId =
                        "/WEB-INF/estadoCuentaTF.xml#estadoCuentaTF";
                //titulo = "Saldo Actual";
            }
        }
        LogPC.println(this, "taskFlowId generado: " + taskFlowId);
    }

    public String ErrorHandler() {
        taskFlowId = "/WEB-INF/premiereTF.xml#premiereTF";
        return "continuar";
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }

    public String getTaskFlowId() {
        return taskFlowId;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }


    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        LogPC.println(this, "Serializando Menu: " + taskFlowId);
        LogPC.println(this, "Serializando Menu: " + titulo);
    }

    private void readObject(ObjectInputStream in) throws IOException {
        try {
            in.defaultReadObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        LogPC.println(this, "DeSerializando Menu :" + taskFlowId);
        LogPC.println(this, "DeSerializando Menu: " + titulo);
    }


    public void setFromPagos(boolean fromPagos) {
        this.fromPagos = fromPagos;
    }

    public boolean isFromPagos() {
        return fromPagos;
    }

    public void setIdxDiscloused(int idxDiscloused) {
        this.idxDiscloused = idxDiscloused;
    }

    public int getIdxDiscloused() {
        return idxDiscloused;
    }
}
