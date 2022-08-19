package mx.com.sky.sel.managedbeans.reenviosenal;

import java.io.Serializable;

import java.util.List;

import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.services.beans.reenviosenal.ReenvioSenial;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import oracle.adf.model.BindingContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import org.apache.myfaces.trinidad.context.RequestContext;
import org.apache.myfaces.trinidad.event.ReturnEvent;

public class PFReenvioSenal implements Serializable {
    @SuppressWarnings("compatibility:-422056822949564765")
    private static final long serialVersionUID = 265476485858650341L;
    
    private List<ReenvioSenial> listaReevioSenal;
    private boolean reenviosenalhoy;

    public PFReenvioSenal() {
        super();
        comprobarReenvioSenial();
    }
    private void cargarListaReenvioSenial() {
        ConfigMenu sesion = null;

        sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String cuentaSKY = sesion.getCuentaSKY();
        
        BindingContainer bindings = getBindings();
        OperationBinding reenvioOp = bindings.getOperationBinding("consultarReenvioSenalSEL");
        reenvioOp.getParamsMap().put("cuentaSKY", (cuentaSKY));
        Object result = reenvioOp.execute();
        
        listaReevioSenal = (List<ReenvioSenial>)result;
        
        for (ReenvioSenial reenvioSenial : listaReevioSenal) {
            if (reenvioSenial.getActivo().equalsIgnoreCase("ACTIVO")) {
                reenviosenalhoy = true;
            }
        }
        
    }

    private void comprobarReenvioSenial() {
        reenviosenalhoy = false;
        List<ReenvioSenial> listaReevioSenalTmp;
        ConfigMenu sesion = null;
        sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String cuentaSKY = sesion.getCuentaSKY();
        
        BindingContainer bindings = getBindings();
        OperationBinding reenvioOp = bindings.getOperationBinding("consultarReenvioSenalSEL");
        reenvioOp.getParamsMap().put("cuentaSKY", (cuentaSKY));
        Object result = reenvioOp.execute();
        
        listaReevioSenalTmp = (List<ReenvioSenial>)result;
        for (ReenvioSenial reenvioSenial : listaReevioSenalTmp) {
            if (reenvioSenial.getActivo().equalsIgnoreCase("ACTIVO")) {
                reenviosenalhoy = true;
            }
        }
    }

    public String reenviarSenial_action() {
        // Add event code here...
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.REENVIO_SENAL);
        reenviarSenial();
        cbActualizar_action();
        reenviosenalhoy = true;
        return null;
    }

    public String reenviarSenial_Mobile_action() {
        // Add event code here...
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.REENVIO_SENAL);
        reenviarSenial();

        cargarListaReenvioSenial();
        reenviosenalhoy = true;
        return "index";
    }

    public void reenviarSenial() {
        // Add event code here...
        ReenvioSenial reenvioSenialSEL = null;
        ConfigMenu sesion = null;
        try {
            BindingContainer bindings = getBindings();
            OperationBinding reenvioOpSEL = bindings.getOperationBinding("insertarReenvioSenalSEL");
            OperationBinding reenvioOpSIEBEL = bindings.getOperationBinding("insertarReenvioSenalSIEBEL");
            
            sesion = (ConfigMenu)JSFUtils.getBean("sesion");

            reenvioSenialSEL = new ReenvioSenial();
            reenvioSenialSEL.setCuentaSKY(sesion.getCuentaSKY());
            reenvioSenialSEL.setPais(sesion.getPaisISO());
            reenvioSenialSEL.setPaquete(sesion.getSuscriptor().getPaquete());
            reenvioSenialSEL.setUserId(sesion.getUsuario().getUid());
            reenvioSenialSEL.setRowidCuenta(sesion.getSuscriptor().getRowId());
            //reenvioSenialSEL.set
            //se agrega la sesión del usuario para incluir en en BAM y en DWH
            reenvioSenialSEL.setIdSesion(sesion.getIdSesion());
            
            reenvioOpSIEBEL.getParamsMap().put("reenvioSenialSEL", (reenvioSenialSEL));
            reenvioOpSIEBEL.getParamsMap().put("sistema", (sesion.getSistema()));
            reenvioOpSIEBEL.execute();
            
            reenvioOpSEL.getParamsMap().put("reenvioSenialSEL", (reenvioSenialSEL));
            reenvioOpSEL.execute();
            cbActualizar_action();
        } catch (Exception e) {
            ADFUtils.showErrorMessage("Por favor intente nuevamente más tarde.");
        }
    }

    public String cbActualizar_action() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("ActualizarTabla");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }
        /*ACTUALIZA LA TABLA*/
            public void reenvioReturn(ReturnEvent returnEvent) {
                // Add event code here...
                
                  RequestContext.getCurrentInstance().addPartialTarget(returnEvent.getComponent().getParent().getParent());
            }
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public void setListaReevioSenal(List<ReenvioSenial> listaReevioSenal) {
        this.listaReevioSenal = listaReevioSenal;
    }

    public List<ReenvioSenial> getListaReevioSenal() {
        if (listaReevioSenal == null) {
            cargarListaReenvioSenial();
        }
        return listaReevioSenal;
    }

    public void setReenviosenalhoy(boolean reenviosenalhoy) {
        this.reenviosenalhoy = reenviosenalhoy;
    }

    public boolean isReenviosenalhoy() {
        return reenviosenalhoy;
    }
    }
