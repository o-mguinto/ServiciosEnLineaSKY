package mx.com.sky.sel.services.banner;

import java.io.Serializable;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.sky.sel.services.beans.banner.BannerElement;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.utils.JavaUtils;
import mx.com.sky.sel.proxyclients.pagweb.admonbanner.AdmonBanner;
import mx.com.sky.sel.proxyclients.pagweb.admonbanner.AdmonbannerClientEp;
import mx.com.sky.sel.proxyclients.pagweb.admonbanner.types.BannerElementType;
import mx.com.sky.sel.proxyclients.pagweb.admonbanner.types.BannerInType;
import mx.com.sky.sel.proxyclients.pagweb.admonbanner.types.BannerOutType;

@Stateless(name = "ServicioBannerPSManagement", mappedName = "SEL-ServicioBannerPSManagement")
public class ServicioBannerPSManagementBean implements Serializable, ServicioBannerPSManagement, ServicioBannerPSManagementLocal {
    @SuppressWarnings("compatibility:2493374298247397943")
    private static final long serialVersionUID = -1248175613656666463L;
    @Resource
    SessionContext sessionContext;

    public ServicioBannerPSManagementBean() {
    }
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<BannerElement> consultarBannerActivos(String paisISO, String paquete, String tipoCuenta) {
        List<BannerElement> listaBanner = null;
        BannerElement bannerElement = new BannerElement();
        bannerElement.setNombre("");
        bannerElement.setPaquete(paquete);
        bannerElement.setTipoCuenta(tipoCuenta);
        listaBanner = procesarOperacion("2", paisISO, bannerElement);
        return listaBanner;
    }
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<BannerElement> consultarBanners() {
        List<BannerElement> listaBanner = null;
        BannerElement bannerElement = new BannerElement();
        bannerElement.setNombre("ALL");
        listaBanner = procesarOperacion("1", "", bannerElement);
        return listaBanner;
    }
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public void insertBanner(String paisISO, BannerElement bannerElement) {
        procesarOperacion("3", paisISO, bannerElement);
    }
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public void updatetBanner(String paisISO, BannerElement bannerElement) {
        procesarOperacion("4", paisISO, bannerElement);
    }
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    private List<BannerElement> procesarOperacion(String operacion, String paisISO, BannerElement bannerElement) {
        List<BannerElement> listaBanner = new ArrayList<BannerElement>();
        BannerElement bannerElementTmp = null;
        AdmonbannerClientEp admonbanner_client_ep;
        AdmonBanner admonBanner = null;
        BannerInType inputRequest;
        BannerElementType banner;
        BannerOutType response = null;
        List<BannerElementType> listaBannerElementType = null;

        try {

            admonbanner_client_ep = new AdmonbannerClientEp();
            admonBanner = admonbanner_client_ep.getAdmonBannerPt();
            inputRequest = new BannerInType();
            inputRequest.setOperacion(operacion);
            inputRequest.setPaisISO(paisISO);
            banner = convert(bannerElement);
            inputRequest.setBannerElement(banner);
            response = admonBanner.process(inputRequest);

            if (response != null && response.getResultado() != null && response.getResultado().equalsIgnoreCase("0")) {
                listaBannerElementType = response.getBanners();
                if (listaBannerElementType != null) {
                    for (BannerElementType bannerElementType : listaBannerElementType) {
                        bannerElementTmp = convert(bannerElementType);
                        listaBanner.add(bannerElementTmp);
                    }
                }
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e);
        }
        return listaBanner;
    }

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    private BannerElementType convert(BannerElement bannerElement) {
        BannerElementType bet = new BannerElementType();

        bet.setDescripcion(bannerElement.getDescripcion());
        bet.setHabilitada(bannerElement.getHabilitada());
        bet.setId(bannerElement.getId());
        bet.setIdPais(bannerElement.getIdPais());
        bet.setImagen(bannerElement.getImagen());
        bet.setLinkActivo(bannerElement.getLinkActivo());
        bet.setLink(bannerElement.getLink());
        bet.setNombre(bannerElement.getNombre());
        bet.setNombrePais(bannerElement.getNombrePais());
        bet.setPaquete(bannerElement.getPaquete());
        bet.setTipoCuenta(bannerElement.getTipoCuenta());
        if (bannerElement.getFechaFin() != null) {
            bet.setFechaFin(JavaUtils.asXMLGregorianCalendar(bannerElement.getFechaFin()));
        }
        if (bannerElement.getFechaInicio() != null) {
            bet.setFechaInicio(JavaUtils.asXMLGregorianCalendar(bannerElement.getFechaInicio()));
        }

        return bet;
    }
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    private BannerElement convert(BannerElementType bannerElementType) {
        BannerElement bet = new BannerElement();

        bet.setDescripcion(bannerElementType.getDescripcion());
        bet.setHabilitada(bannerElementType.getHabilitada());
        bet.setId(bannerElementType.getId());
        bet.setIdPais(bannerElementType.getIdPais());
        bet.setImagen(bannerElementType.getImagen());
        bet.setLinkActivo(bannerElementType.getLinkActivo());
        bet.setLink(bannerElementType.getLink());
        bet.setNombre(bannerElementType.getNombre());
        bet.setNombrePais(bannerElementType.getNombrePais());
        bet.setPaquete(bannerElementType.getPaquete());
        bet.setTipoCuenta(bannerElementType.getTipoCuenta());
        if (bannerElementType.getFechaFin() != null) {
            bet.setFechaFin(JavaUtils.asTimestamp(bannerElementType.getFechaFin()));
        }
        if (bannerElementType.getFechaInicio() != null) {
            bet.setFechaInicio(JavaUtils.asTimestamp(bannerElementType.getFechaInicio()));
        }
        if (bannerElementType.getFechaActualizacion() != null) {
            bet.setFechaActualizacion(JavaUtils.asTimestamp(bannerElementType.getFechaActualizacion()));
        }
        if (bannerElementType.getFechaCreacion() != null) {
            bet.setFechaCreacion(JavaUtils.asTimestamp(bannerElementType.getFechaCreacion()));
        }

        return bet;
    }

}
