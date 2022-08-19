package mx.com.sky.sel.services.banner;

import java.util.List;

import javax.ejb.Local;

import mx.com.sky.sel.services.beans.banner.BannerElement;

@Local
public interface ServicioBannerPSManagementLocal {
    public List<BannerElement> consultarBannerActivos(String paisISO, String paquete, String tipoCuenta);
    public List<BannerElement> consultarBanners();
}
