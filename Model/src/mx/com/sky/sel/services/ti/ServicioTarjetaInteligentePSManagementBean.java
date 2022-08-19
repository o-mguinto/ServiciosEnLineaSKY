package mx.com.sky.sel.services.ti;

import java.io.Serializable;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import mx.com.sky.sel.services.beans.utils.TarjetaInteligente;

@Stateless(name = "ServicioTarjetaInteligentePSManagement", mappedName = "SEL-ServicioTarjetaInteligentePSManagement")
public class ServicioTarjetaInteligentePSManagementBean implements Serializable, ServicioTarjetaInteligentePSManagement,
                                                                   ServicioTarjetaInteligentePSManagementLocal {
    @SuppressWarnings("compatibility:-4240909157459825264")
    private static final long serialVersionUID = -3438639056564874818L;
    @Resource
    SessionContext sessionContext;

    public ServicioTarjetaInteligentePSManagementBean() {
        LogPC.println(this, "DCTarjetaInteligente Creado");
    }
    
        @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID) {
        List<DetalleSolicitudServicio> SldServicio = null;
        SerivcioTarjetaInteligente sr = null;
        sr = new SerivcioTarjetaInteligente();
        SldServicio = sr.obtenerSolicitudServicio(rowID);
        if (SldServicio == null) {
            LogPC.println(this, "SldServicio null");
            SldServicio = new ArrayList<DetalleSolicitudServicio>();
        }
        return SldServicio;
    }
        @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<TarjetaInteligente> getTarjetaInteligente(String rowID) {
        List<TarjetaInteligente> ti = null;
        SerivcioTarjetaInteligente sr = null;
        sr = new SerivcioTarjetaInteligente();
        ti = sr.getTarjetaInteligente(rowID);
        if (ti == null) {
            LogPC.println(this, "ti null");
            ti = new ArrayList<TarjetaInteligente>();
        }
        return ti;
    }

        @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<TarjetaInteligente> obtenerTarjetaInteligente(String rowID) {
        return getTarjetaInteligente(rowID);
    }

}
