package mx.com.sky.sel.services.promociones;

import java.io.Serializable;

import java.util.List;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.sky.sel.services.beans.promociones.Pais;
import mx.com.sky.sel.services.beans.promociones.Promocion;

@Stateless(name = "PromocionPSManagement", mappedName = "SEL-PromocionPSManagement")
public class PromocionPSManagementBean implements Serializable, PromocionPSManagement, PromocionPSManagementLocal {
    @SuppressWarnings("compatibility:2451875897477236484")
    private static final long serialVersionUID = 3384636860629984180L;
    @Resource
    SessionContext sessionContext;

    public PromocionPSManagementBean() {
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Pais> obtenerPaises() {
        List<Pais> paises = null;
        ServicioPromocion sp = new ServicioPromocion();
        paises = sp.obtenerPaises();
        return paises;
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Promocion> obtenerPromociones(String idCodigoPais) {
        List<Promocion> promociones = null;
        ServicioPromocion sp = new ServicioPromocion();
        promociones = sp.obtenerPromociones(idCodigoPais);
        return promociones;
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Promocion> obtenerPromocionesPais(String organizationId) {
        List<Promocion> promociones = null;
        ServicioPromocion sp = new ServicioPromocion();
        promociones = sp.obtenerPromocionesPais(organizationId);
        return promociones;
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Promocion> obtenerPromocionesActivas(String organizationId, boolean isUserVetv) {
        List<Promocion> promociones = null;
        ServicioPromocion sp = new ServicioPromocion();
        //ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        //promociones = sp.obtenerPromocionesActivas(organizationId, sesion.isUserVeTV(), false);
        System.out.println("IN PromocionPSManagementBean.obtenerPromocionesActivas()");
        System.out.println("organizationId: " + organizationId);
        System.out.println("isUserVetv: " + isUserVetv);
        promociones = sp.obtenerPromocionesActivas(organizationId, isUserVetv, false);
        if( promociones != null && !promociones.isEmpty() ) {
            for( Promocion p : promociones ) {                
                System.out.println("p.getNombre(): " + p.getNombre());
                System.out.println("p.getImagen(): " + p.getImagen());
                System.out.println("p.getDescripcion(): " + p.getDescripcion());
                System.out.println("-------------------------------------------------------");
            }
        } else {
            System.out.println("----------NO EXISTEN PROMOCIONES ACTIVAS--------------");
        }
        return promociones;
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Promocion> obtenerPromocionesActivasLogin() {
        List<Promocion> promociones = null;
        ServicioPromocion sp = new ServicioPromocion();
        promociones = sp.obtenerPromocionesActivasLogin();
        return promociones;
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Promocion> obtenerPromocionesActivasAdmon(String organizationId) {
        List<Promocion> promociones = null;
        ServicioPromocion sp = new ServicioPromocion();
        promociones = sp.obtenerPromocionesActivasAdmon(organizationId);
        return promociones;
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Promocion agregarPromocion(Promocion promocion) {
        ServicioPromocion sp = new ServicioPromocion();
        promocion = sp.agregarPromocion(promocion);
        return promocion;
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Promocion actualizarPromocion(Promocion promocion) {
        ServicioPromocion sp = new ServicioPromocion();
        promocion = sp.actualizarPromocion(promocion);
        return promocion;
    }
}
