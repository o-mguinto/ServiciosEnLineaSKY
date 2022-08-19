package mx.com.sky.sel.utils;

import java.io.Serializable;

public class Parametros implements Serializable {
    @SuppressWarnings("compatibility:6736932533560373511")
    private static final long serialVersionUID = -4012802487290608737L;
    private String urlAvisoPrivacidad = "http://sky.com.mx/aviso-de-privacidad.html";
    private String uploadPath = "/u01/oracle/apps_data/pagWeb";
    //DESA Hi Jump
    //private String uploadPath = "D:\\oracle\\fmw_11117\\data\\pagWeb";
    private String img = "/imagenes/";
    private String uploadFiles = "/uploadFiles/";
    private String propiedades = "/resources/replicacion/";
    private String fct = "/facturas/";
    private String fctP = "\\\\10.12.89.112\\";
    private String fctX = "\\\\10.12.89.112\\";
    private String rutaReportes = "/reportes/";
    private String btgew = "/btgew/";
    private String home = "/home/";
    // NUEVA IP KENAN
    // 10.251.1.185
    // asp_server01 ::
    //PROD
    //private static String requestSaldoVeTV = "http://10.251.1.185/siebelps/KENAN_Saldos_ASP.asp";
    private static String requestSaldoVeTV = "http://10.251.1.185/siebelps/KENAN_Saldos_mas_HB_ASP.asp";
    private static String diasActivosDeCuentaASP = "http://10.251.1.185/siebelps/DiasActivosDeCuentaASP.asp";
    private static String urlEstadoCuenta = "https://recsaldos.sky.com.mx/web/default.aspx?Factura=";
    // PARA KPA
    //private static String requestSaldoVeTV = "http://10.12.94.167/siebelps/CAPAKENAN_Saldos_ASP.asp";
    //private static String diasActivosDeCuentaASP = "http://10.12.94.167/siebelps/CAPA_DiasActivosDeCuentaASP.asp";
    //private static String urlEstadoCuenta = "https://recsaldos.sky.com.mx/web/default.aspx?Factura=";
    // PARA QA
    //private static String requestSaldoVeTV = "http://10.12.94.167/siebelps/CAPAKENAN_Saldos_ASP.asp";
    //private static String diasActivosDeCuentaASP = "http://10.12.94.167/siebelps/CAPA_DiasActivosDeCuentaASP.asp";
    //private static String urlEstadoCuenta = "https://recsaldos.sky.com.mx/web/default.aspx?Factura=";


    public Parametros() {
        super();
    }

    public Parametros(boolean upload) {
        super();
        if (upload) {
            img = uploadPath + img;
            uploadFiles = uploadPath + uploadFiles;
            propiedades = uploadPath + propiedades;
            fct = uploadPath + fct;
            fctP = uploadPath + fctP;
            fctX = uploadPath + fctX;
            rutaReportes = uploadPath + rutaReportes;
            btgew = uploadPath + "/" + btgew;
            home = uploadPath + "/" + home;
        }
    }

    public static String getUrlEstadoCuenta(String referenciaEdoCuenta, String cuentaSKY) {
        return urlEstadoCuenta + referenciaEdoCuenta + "&Cuenta=" + cuentaSKY;
    }

    public String getUrlFactura() {
        return fct;
    }

    public String getUrlCTDC() {
        return uploadFiles + "ctdc/";
    }

    public String getUrlSeguro() {
        return uploadFiles + "seguro/";
    }

    public String getUrlTI() {
        return uploadFiles + "ti/";
    }

    public String getUrlImgsCanal() {
        return img + "CAC/";
    }

    public String getUrlImgsModulos80X120() {
        return img + "modulo/80X120/";
    }

    public String getUrlImgsModulos246X70() {
        return img + "modulo/246X70/";
    }


    public String getUrlImgsCanalMovil() {
        return img + "CAC/80X120/";
    }

    public String getUrlImgsCanal160X240() {
        return img + "CAC/160X240/";
    }

    public String getUrlImgsPaqueteMovil() {
        return img + "paquete/80X120/";
    }

    public String getUrlImgsPaquetePC() {
        return img + "paquete/246X70/";
    }

    public String getUrlImgsControlRemoto() {
        return img + "controlremoto/";
    }


    public String getUrlImgs290X230() {
        return img + "290X230/";
    }

    /**
     * @return
     */
    public String getUrlImgs80X120() {
        return img + "80X120/";
    }

    public String getUrlImgs160X240() {
        return img + "160X240/";
    }


    public String getUrlImgs102X102() {
        return img + "102X102/";
    }

    public String getUrlImgs825X464() {
        return img + "825X464/";
    }

    public String getUrlImgs290X163() {
        return img + "290X163/";
    }


    public String getUrlImgs500X280() {
        return img + "500X280/";
    }

    public String getUrlImgs825X300() {
        return img + "825X300/";
    }

    public String getUrlImgsProm80X120() {
        return img + "promociones/80X120/";
    }
    
    public String getUrlImgsProm290X230() {
        return img + "promociones/290X230/";
    }

    public String getUrlImgsProm825X300() {
        return img + "promociones/825X300/";
    }

    public String getUrlImgs() {
        return img;
    }

    public String getUrlImgBannerPC() {
        return img + "banner/pc/";
    }

    public String getUrlImgRevistas() {
        return img + "revistas/";
    }

    public String getUrlImgBlueToGo() {
        return img + "bluetogo/";
    }

    public String getBtgew() {
        return img + btgew;
    }

    public String getUrlImgHome() {
        return img + "home/";
    }

    public String getUrlImgHomeMovil() {
        return img + "home/movil/";
    }

    public String getPropiedades() {
        return propiedades;
    }

    public String getUploadPath() {
        return uploadPath;
    }

    public String getRutaReportes() {
        return rutaReportes;
    }

    public String getFctP() {
        return fctP;
    }

    public String getFctX() {
        return fctX;
    }

    public String getUrlFacturaPDF() {
        return fctP;
    }

    public String getUrlFacturaXML() {
        return fctX;
    }

    public static String getRequestSaldoVeTV() {
        return requestSaldoVeTV;
    }

    public static String getDiasActivosDeCuentaASP() {
        return diasActivosDeCuentaASP;
    }


    public void setUrlAvisoPrivacidad(String urlAvisoPrivacidad) {
        this.urlAvisoPrivacidad = urlAvisoPrivacidad;
    }

    public String getUrlAvisoPrivacidad() {
        return urlAvisoPrivacidad;
    }
}
