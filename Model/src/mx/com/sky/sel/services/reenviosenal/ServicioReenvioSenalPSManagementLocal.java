package mx.com.sky.sel.services.reenviosenal;

import java.util.List;

import javax.ejb.Local;

import mx.com.sky.sel.services.beans.reenviosenal.ReenvioSenial;
import mx.com.sky.sel.services.exception.ServicioException;

@Local
public interface ServicioReenvioSenalPSManagementLocal {
    public void insertarReenvioSenalSIEBEL(ReenvioSenial reenvioSenialSEL, String sistema) throws ServicioException ;
    public void insertarReenvioSenalSEL(ReenvioSenial reenvioSenialSEL) throws ServicioException ;
    public List<ReenvioSenial> consultarReenvioSenalSEL(String cuentaSKY);
}
