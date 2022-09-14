package mx.com.sky.sel.managedbeans.canal;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import mx.com.sky.sel.services.beans.canal.CanalCarta;
import mx.com.sky.sel.services.beans.canal.PrecioCanal;
import mx.com.sky.sel.services.beans.utils.Suscriptor;
import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.services.canal.ServicioCanalPSManagementBean;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.component.rich.data.RichTable;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import org.apache.myfaces.trinidad.event.ReturnEvent;


public class BBCanal implements Serializable {
    @SuppressWarnings("compatibility:-6121376320598850522")
    private static final long serialVersionUID = -5956872674113708810L;
    private List<List<CanalCarta>> mosaicoCanales;
    private CanalCarta canales[];
    private CanalCarta canal; //Contiene el Canal Seleccionado
    private int numCACDisponibles;
    private static final String MENSAJE_CANAL_CONTRATADO = "bbcanal.canalcontratado";
    private transient RichTable tcAC;
    private String categoriaLocal;
    private String categoriaSesion;
    private boolean mostrarHotGo;
    private boolean streaming;
    
    /**
     * Obtiene la categor&iacute;a de canales a la carta.
     */
    private String selCategoriaCAC;

    public BBCanal() {
        canales = new CanalCarta[10];
        LogPC.println(this, "BBCanal Creado");
        numCACDisponibles = 0;
        categoriaLocal = "";
        obtenerCanalCarta();
        
    }

    /*Obtenemos los Canales a la Carta desde el DC*/

    private void obtenerCanalCarta() {
        numCACDisponibles = 0;
        mosaicoCanales = new ArrayList<List<CanalCarta>>();
        mostrarHotGo=false;

        int contadorInterno = 0;
        int contadorCanal = 0;
        List<CanalCarta> rowCanales = null;

        ServicioCanalPSManagementBean scr = null;
        scr = new ServicioCanalPSManagementBean();
        List<CanalCarta> channelsTmp = null;
        List<CanalCarta> channels = null;
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        Suscriptor suscriptor = sesion.getSuscriptor();
        
        categoriaSesion = sesion.getCategoriaCAC();
        //Se sustituye por el valor del parámetro de la región
        categoriaSesion = getSelCategoriaCAC();
        
        categoriaLocal = categoriaSesion;
        LogPC.println(this, "categoriaSesion: " + categoriaSesion);
        String paqueteCuenta =suscriptor.getPaquete();
        if (sesion.getSuscriptor().getMarketType().equalsIgnoreCase("Normal VeTV PLUS")) {
            if (sesion.isCuentaVETVPLUSHD()) {
                paqueteCuenta ="VETV PLUS HD";
            }else{
                paqueteCuenta ="VETV PLUS";
            }
        }else if (sesion.getSuscriptor().getMarketType().equalsIgnoreCase("Normal VeTV")) {
            if (sesion.isCuentaVETVHD()) {
                paqueteCuenta ="VETV HD";
            }else{
                paqueteCuenta ="VETV";
            }
        }
        LogPC.println(this, "--------Parametros enviados al servicio obtenerCanalCarta--------");
        LogPC.println(this, "Paquete cuenta: =  "   +paqueteCuenta);        
        LogPC.println(this, "MarketType(): =  "   + suscriptor.getMarketType());
        LogPC.println(this, "isEquipoHD(): =  "   + suscriptor.isEquipoHD());
        LogPC.println(this, "categoriaSesion: =  "   + categoriaSesion);
        
        
        
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_CAC);
        
        if(categoriaSesion.equalsIgnoreCase("STREAMING")){
            this.streaming = true;
            channelsTmp = scr.obtenerServiciosStreaming(suscriptor.getCuentaSKY(), suscriptor.getAssetNumberVideo(), suscriptor.getSecondAssetNumberVideo());
            if (channelsTmp == null) {
                LogPC.println(this, "canales null");
                return;
            }
            channels = new ArrayList<CanalCarta>(channelsTmp);
        }else{
            this.streaming = false;
            channelsTmp = scr.obtenerCanalCarta(paqueteCuenta, suscriptor.getMarketType(), suscriptor.isEquipoHD(), categoriaSesion);
            if (channelsTmp == null) {
                LogPC.println(this, "canales null");
                return;
            }
            channels = new ArrayList<CanalCarta>();
            for (CanalCarta canalCarta : channelsTmp) {
                LogPC.println(this, "CAC:"+canalCarta.getCategoria()+" CACSESION:"+categoriaSesion);
                if (canalCarta.getCategoria().equalsIgnoreCase(categoriaSesion)) {
                    canalCarta =
                            cargarPrecioCanal(scr, canalCarta, sesion.getSuscriptor().getPaisISO(), sesion.getSuscriptor().getCuentaSKY(), sesion.getSistema(),sesion.getSuscriptor().getOrganizationType());
                    channels.add(canalCarta);
                }
            }
            if(categoriaSesion.equalsIgnoreCase("DEPORTES")) {
                for (CanalCarta canalCarta : channels) {
                    if (canalCarta.getNombre().equalsIgnoreCase("BASICO SKYSPORTS")) {
                        if (sesion.getSuscriptor().getOrganizationType().equalsIgnoreCase("Direct To Home") &&
                            sesion.getSuscriptor().getPais().equalsIgnoreCase("MEX") &&
                            sesion.getSuscriptor().getPaquete().equalsIgnoreCase("BASICO")) {
                            System.out.println("No cumple condici\u00F3n de CAC");
                        }else{
                            channels.remove(canalCarta);
                        }
                    }else if (canalCarta.getNombre().contains("Mundial Total SKY")) {
                    if (scr.consultaMundialActivo(suscriptor.getCuentaSKY(), suscriptor.getMarketType())) {
                        channels.remove(canalCarta);
                        if (channels.size() <= 0) {
                              channels = new ArrayList<CanalCarta>();
                              break;
                        }
                    } else if (!sesion.isUserComercial() && !sesion.isUserResidencia()) {
                        channels.remove(canalCarta);
                        if (channels.size() <= 0) {
                              channels = new ArrayList<CanalCarta>();
                              break;
                        }   
                    }
                } else{
                     System.out.println("NO es SKY SPORTS");
                    }
                }
            }
        }
        numCACDisponibles = channels.size();
        contadorCanal = 0;
        do {
            rowCanales = new ArrayList<CanalCarta>();
            for (contadorInterno = 1; contadorInterno <= 3 && contadorCanal < channels.size(); contadorInterno++) {
                rowCanales.add(channels.get(contadorCanal++));
            }
            mosaicoCanales.add(rowCanales);
        } while (contadorCanal < channels.size());

        for (int i = 0; i < channels.size(); i++)
            canales[i] = channels.get(i);
        LogPC.println(this, channels.size() + " Canales Obtenidos");
    }

    private CanalCarta cargarPrecioCanal(ServicioCanalPSManagementBean scr, CanalCarta canalCarta, String paisISO, String ctaSky, String sistema, String tipoCuenta) {
        PrecioCanal precioCanal = null;
        //hijump
        LogPC.println(this, "--------Parametros enviados al servicio consultarPrecioCanal--------");
        LogPC.println(this, "Canal: =  "   + canalCarta.getCanal());
        LogPC.println(this, "paisISO: =  "   + paisISO);
        LogPC.println(this, "ctaSky: =  "   + ctaSky);
        LogPC.println(this, "sistema: =  "   + sistema);
        LogPC.println(this, "tipoCuenta: =  "   + tipoCuenta);
        
        precioCanal = scr.consultarPrecioCanal(canalCarta.getCanal(), paisISO, ctaSky, sistema, tipoCuenta);

        canalCarta.setPrecio_display(precioCanal.getCosto());
        canalCarta.setPrecioPO_display(precioCanal.getPagoOportuno());
        return canalCarta;
    }

    public CanalCarta[] getCanales() {
        return canales;
    }

    /*
     * Paso 1:
     */
    /*Metodo invocado para mostrar el Popup, este es llamado inmediatamente despues de llamar al metodo setIdCanal*/

    public String showPopupCanal() {
        LogPC.println(this, "Canal a la Carta:" + canal);
        if(canal.getCategoria().equalsIgnoreCase("STREAMING")){
            return "contrata_streaming";    
        }else{
            return "contrata";
        }
    }
    public String showPopupHotGo() {
        LogPC.println(this, "Contrata HOT GO");
        return "contrata_hotgo";
    }

    public void returnCompraCAC(ReturnEvent returnEvent) {
        actualizarTabla();
    }

    /**
     *Paso 4, actualiza la tabla despues de contratar
     * @return
     */
    public String actualizarTabla() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("ActualizarSolicitudes");
        Object result = operationBinding.execute();
        if (tcAC != null) {
            ADFUtils.addPartialTarget(tcAC);
        }
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }


    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }


    public CanalCarta getCanal() {
        return canal;
    }

    private boolean isCategoriaIgual() {
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        categoriaSesion = sesion.getCategoriaCAC();
        categoriaSesion = getSelCategoriaCAC();
        return categoriaLocal.equalsIgnoreCase(categoriaSesion);
    }


    public void setMosaicoCanales(List<List<CanalCarta>> mosaicoCanales) {
        this.mosaicoCanales = mosaicoCanales;
    }

    public List<List<CanalCarta>> getMosaicoCanales() {
        if (!isCategoriaIgual()) {
            obtenerCanalCarta();
        }

        return mosaicoCanales;

    }

    public void setCanales(CanalCarta[] canales) {
        this.canales = canales;
    }

    public void setCanal(CanalCarta canal) {
        this.canal = canal;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        LogPC.println(this, "Serializando BBCanal: " + canales);
    }

    private void readObject(ObjectInputStream in) throws IOException {
        try {
            in.defaultReadObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        LogPC.println(this, "DeSerializando BBCanal :" + canales);
    }

    public void setTcAC(RichTable tcAC) {
        this.tcAC = tcAC;
    }

    public RichTable getTcAC() {
        return tcAC;
    }

    public int getSizeMosaico() {
        return numCACDisponibles;
    }


    public void setMostrarHotGo(boolean mostrarHotGo) {
        this.mostrarHotGo = mostrarHotGo;
    }

    public boolean isMostrarHotGo() {
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        if (categoriaSesion.equalsIgnoreCase("ADULTOS") && sesion.getSuscriptor().getOrganizationType().equalsIgnoreCase("Direct To Home") && sesion.getSuscriptor().getPais().equalsIgnoreCase("MEX")
        && (sesion.getSuscriptor().getPaquete().contains("BASICO") 
            || sesion.getSuscriptor().getPaquete().contains("FUN") || sesion.getSuscriptor().getPaquete().contains("FOX+") || sesion.getSuscriptor().getPaquete().contains("HBO") 
            || sesion.getSuscriptor().getPaquete().contains("UNIVERSE") || sesion.isCuentaNewEra())) {
            mostrarHotGo=true;
        }else{
            mostrarHotGo=false;
        }
        return mostrarHotGo;
    }

    public void setStreaming(boolean isStreaming) {
        this.streaming = isStreaming;
    }

    public boolean isStreaming() {
        return streaming;
    }
    
    /**
     * Inicializa la categor&iacute;a de canales a la carta.
     * 
     * @param selCategoriaCA Catego&iacute;a.
     */
    public void setSelCategoriaCAC(String selCategoriaCAC) {
        this.selCategoriaCAC = selCategoriaCAC;
    }

    /**
     * Obtiene la categor&iacute;a.
     * 
     * @return categor&iacute;a.
     */
    public String getSelCategoriaCAC() {
        return selCategoriaCAC;
    }
}
