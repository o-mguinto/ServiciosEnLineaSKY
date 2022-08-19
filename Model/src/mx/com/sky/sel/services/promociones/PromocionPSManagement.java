package mx.com.sky.sel.services.promociones;

import java.util.List;

import javax.ejb.Remote;

import mx.com.sky.sel.services.beans.promociones.Pais;
import mx.com.sky.sel.services.beans.promociones.Promocion;

@Remote
public interface PromocionPSManagement {
    public List<Pais> obtenerPaises();
    public List<Promocion> obtenerPromociones(String idCodigoPais);
    public List<Promocion> obtenerPromocionesPais(String organizationId);
    public List<Promocion> obtenerPromocionesActivas(String organizationId, boolean isUserVetv);
    public List<Promocion> obtenerPromocionesActivasLogin();
    public List<Promocion> obtenerPromocionesActivasAdmon(String organizationId);
    public Promocion agregarPromocion(Promocion promocion);
    public Promocion actualizarPromocion(Promocion promocion);
}
