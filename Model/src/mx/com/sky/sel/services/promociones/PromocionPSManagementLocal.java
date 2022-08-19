package mx.com.sky.sel.services.promociones;

import javax.ejb.Local;
import mx.com.sky.sel.services.beans.promociones.Pais;
import java.util.List;

import mx.com.sky.sel.services.beans.promociones.Promocion;

@Local
public interface PromocionPSManagementLocal {
    public List<Pais> obtenerPaises();
    public List<Promocion> obtenerPromociones(String idCodigoPais);
    public List<Promocion> obtenerPromocionesPais(String organizationId);
    public List<Promocion> obtenerPromocionesActivas(String organizationId, boolean isUserVetv);
    public List<Promocion> obtenerPromocionesActivasLogin();
    public List<Promocion> obtenerPromocionesActivasAdmon(String organizationId);
    public Promocion agregarPromocion(Promocion promocion);
    public Promocion actualizarPromocion(Promocion promocion);
}
