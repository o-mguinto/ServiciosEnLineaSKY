package mx.com.sky.sel.services.banner;

import java.util.List;

import javax.ejb.Remote;

import mx.com.sky.sel.services.beans.banner.BannerElement;

@Remote
public interface ServicioBannerPSManagement {
    public List<BannerElement> consultarBannerActivos(String paisISO, String paquete, String tipoCuenta);
    public List<BannerElement> consultarBanners();
}
