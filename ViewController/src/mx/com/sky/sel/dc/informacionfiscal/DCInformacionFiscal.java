package mx.com.sky.sel.dc.informacionfiscal;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.services.beans.informacionfiscal.DatosFiscales;
import mx.com.sky.sel.services.beans.informacionfiscal.RegimenFiscalBean;
import mx.com.sky.sel.services.beans.informacionfiscal.UsoCFDIBean;
import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.informacionfiscal.ServicioInformacionFiscalPSManagementBean;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

public class DCInformacionFiscal implements Serializable {
    @SuppressWarnings("compatibility:-3758751346585275136")
    private static final long serialVersionUID = 4740982618577948037L;
    
    public DCInformacionFiscal() {
        LogPC.println(this, "DCInformacionFiscal Creado");
    }
    private  ServicioInformacionFiscalPSManagementBean sif= null;
   
    public DatosFiscales datosFiscales (String cuentaSKY, String nombreCompletoSuscriptor) {
        return getDatosFiscales(cuentaSKY, nombreCompletoSuscriptor);
    }
    public DatosFiscales getDatosFiscales(String cuentaSKY, String nombreCompletoSuscriptor) {
        // TODO Implement this method
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        DatosFiscales df = null;
        sif = new ServicioInformacionFiscalPSManagementBean();
        df = sif.getDatosFiscales(cuentaSKY);
        if (df == null) {
            LogPC.printlnWarn(this, "df null");
            df = new DatosFiscales();
        }
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_INFO_FISCAL);
        if (sesion.getSuscriptor().getOrganizationType().equalsIgnoreCase("Hotel")) {
                    df.setRazonSocial(sesion.getSuscriptor().getRazonSocialHotel());
                    df.setRfc(sesion.getSuscriptor().getRfcHotel());
                }else{
                    df.setRazonSocial(nombreCompletoSuscriptor);
                }
        return df;
    }

    public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID) {
        // TODO Implement this method
        List<DetalleSolicitudServicio> SldServicio = null;
        sif = new ServicioInformacionFiscalPSManagementBean();
        SldServicio = sif.obtenerSolicitudServicio(rowID);
        if (SldServicio == null) {
            LogPC.printlnWarn(this, "SldServicio null");
            SldServicio = new ArrayList<DetalleSolicitudServicio>();
        }
        return SldServicio;
    }

    public List<DatosFiscales> obtenerHistoricoDatosFiscales(String rowID) {
        List<DatosFiscales> dtsFis = null;
        sif = new ServicioInformacionFiscalPSManagementBean();
        dtsFis = sif.obtenerHistoricoDatosFiscales(rowID);
        if (dtsFis == null) {
            LogPC.printlnWarn(this, "dtsFis null");
            dtsFis = new ArrayList<DatosFiscales>();
        }
        return dtsFis;
    }
    public String crearSolicitud(SolicitudServicioBean solicitudServicio) throws ServicioException{
        sif = new ServicioInformacionFiscalPSManagementBean();
        return sif.crearSolicitud(solicitudServicio);
    }

    public List<RegimenFiscalBean> consultarRegimenesFiscales(String tipoPersona) {
        List<RegimenFiscalBean> regimenesFiscalesConsultados = new ArrayList<RegimenFiscalBean>();
        sif = new ServicioInformacionFiscalPSManagementBean();
        
        if( tipoPersona != null && !tipoPersona.isEmpty() ) {
            regimenesFiscalesConsultados = sif.consultarRegimenesFiscales(tipoPersona);
        }
        
        return regimenesFiscalesConsultados;
    }


    public List<UsoCFDIBean> consultarUsosCFDI() {
        LogPC.println(this, "Consultando los usos CFDI...");
        List<UsoCFDIBean> usosCFDIBeans = null;
        sif = new ServicioInformacionFiscalPSManagementBean();
        
        usosCFDIBeans = sif.consultarUsosCFDI();
        LogPC.println(this, "Usos CFDI regresados por el servico:");
        if( usosCFDIBeans != null && !usosCFDIBeans.isEmpty() ) {
            for(UsoCFDIBean usoCFDI : usosCFDIBeans) {
                LogPC.println(this, "IdUsoCFDI = " + usoCFDI.getIdUsoCFDI());
                LogPC.println(this, "Descripcion = " + usoCFDI.getDescripcion());
                LogPC.println(this, "------------------------------------------------------------");
            }
        }
        
        
        return usosCFDIBeans;
    }
    
    public String registrarDatosFiscales(SolicitudServicioBean datosFiscales) throws ServicioException {
        String responseWS = null;
        sif = new ServicioInformacionFiscalPSManagementBean();
        
        responseWS = sif.registrarDatosFiscales(datosFiscales);
        
        return responseWS;
    }
    
    public String actualizarDatosFiscales(SolicitudServicioBean datosFiscales) throws ServicioException {
        String responseWS = null;
        sif = new ServicioInformacionFiscalPSManagementBean();
        
        responseWS = sif.actualizarDatosFiscales(datosFiscales);
        
        return responseWS;
    }
    
    public SolicitudServicioBean consultarDatosFiscales(String cuentaSKY) {
        SolicitudServicioBean responseWS = null;
        sif = new ServicioInformacionFiscalPSManagementBean();
        
        responseWS = sif.consultarDatosFiscales(cuentaSKY);
        
        return responseWS;
    }
}
