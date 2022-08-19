package mx.com.sky.sel.managedbeans.promesapago;

import java.io.Serializable;

import mx.com.sky.sel.services.beans.promesa.pago.PromesaPago;
import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.services.promesapago.ServicioPromesaPago;
import mx.com.sky.sel.services.ti.SerivcioTarjetaInteligente;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;

import mx.com.sky.sel.utils.UtileriasMB;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.data.RichTable;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;


public class BBPromesaPago extends UtileriasMB implements Serializable {
    @SuppressWarnings("compatibility:-3261925149981141742")
    private static final long serialVersionUID = 7800935235942065002L;

    private PromesaPago promesaPago;
    private transient RichPopup popUpAgregar;
    private transient RichTable tpP;

    public BBPromesaPago() {
        super();
        promesaPago = new PromesaPago();
    }


    public String ejecutarPromesaPago() {

        LogPC.println(this, "PromesaPago:" + promesaPago);
        String tarjetaInteligente;
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        SerivcioTarjetaInteligente sTI = new SerivcioTarjetaInteligente();
        tarjetaInteligente = sTI.obtenerTarjetaInteligenteMaster(sesion.getCuentaSKY());
        promesaPago.setCuentaSKY(sesion.getCuentaSKY());
        promesaPago.setUserID(sesion.getUsuario().getUid());
        promesaPago.setMonto(promesaPago.getMontoPagado() + "");
        promesaPago.setCuentaRowID(sesion.getSuscriptor().getRowId());
        promesaPago.setSistema(sesion.getSistema());
        promesaPago.setTarjetaInteligente(tarjetaInteligente);
        promesaPago.setIdSesion(sesion.getIdSesion());
        if (sesion.getSuscriptor().getMarketType().equalsIgnoreCase("Normal VeTV")) {
            if (sesion.isCuentaVETVHD()) {
                promesaPago.setTipoCuenta("VETV HD");    
            }else{
                promesaPago.setTipoCuenta("VETV");
            }
        }else{
            if (sesion.isCuentaVETVPLUSHD()) {
                promesaPago.setTipoCuenta("VETV PLUS HD");       
            }
            promesaPago.setTipoCuenta("VETVPLUS");   
        }
        ServicioPromesaPago spp = new ServicioPromesaPago();

        try {
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.PROMESA_DE_PAGO);
            spp.procesaPromesaPago(promesaPago);
            ADFUtils.showInfoMessage("Sus datos ser\u00E1n proceesados. En breve el sistema le enviar\u00E1 una notificaci\u00F3n con el resultado.");
            popUpAgregar.cancel();
        } catch (Exception e) {
            LogPC.printlnError(e);
            ADFUtils.showErrorMessage(getMensajeProperties("mensaje_PantallaError_generico"));
        }
        actualizar();
        return null;
    }

    public String cancelar() {
        popUpAgregar.cancel();
        return null;
    }

    public String actualizar() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("actualizarTabla");
        Object result = operationBinding.execute();
        if (tpP != null) {
            ADFUtils.addPartialTarget(tpP);
        }
        return null;
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }


    public void setPromesaPago(PromesaPago promesaPago) {
        this.promesaPago = promesaPago;
    }

    public PromesaPago getPromesaPago() {
        return promesaPago;
    }

    public void setPopUpAgregar(RichPopup popUpAgregar) {
        this.popUpAgregar = popUpAgregar;
    }

    public RichPopup getPopUpAgregar() {
        return popUpAgregar;
    }

    public void setTpP(RichTable tpP) {
        this.tpP = tpP;
    }

    public RichTable getTpP() {
        return tpP;
    }
}
