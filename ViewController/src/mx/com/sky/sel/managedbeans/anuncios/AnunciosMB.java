package mx.com.sky.sel.managedbeans.anuncios;

import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.managedbeans.sesion.SesionMB;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.UtileriasMB;

public class AnunciosMB extends UtileriasMB {
    @SuppressWarnings("compatibility:-5292524040391378421")
    private static final long serialVersionUID = 1504437522823277457L;

    private static final String PAQUETE_BASICO = "BASICO";
    private static final String PAQUETE_SKY_FAMILIAR = "SKY FAMILIAR";
    private static final String PAQUETE_FUN = "FUN";
    private static final String PAQUETE_HBO_MAX = "HBO MAX";
    private static final String PAQUETE_SKYHD_BLACK = "SKY HD BLACK";
    private static final String PAQUETE_SKYHD_GOLD = "SKY HD GOLD";
    private static final String PAQUETE_SKYHD_HBOMAX = "SKY HD HBO MAX";
    private static final String PAQUETE_SKYHD_PLATINUM = "SKY HD PLATINUM";
    private static final String PAQUETE_SKY_TOTAL = "SKY TOTAL";
    private static final String PAQUETE_UNIVERSE = "UNIVERSE";
    
    private static final String ANUNCIO_NUEVOS_CANALES_PAQUETE_BASICO = "BASICO.png";
    private static final String ANUNCIO_NUEVOS_CANALES_PAQUETE_SKY_FAMILIAR = "FAMILIAR.png";
    private static final String ANUNCIO_NUEVOS_CANALES_PAQUETE_FUN = "FUN.png";
    private static final String ANUNCIO_NUEVOS_CANALES_PAQUETE_HBO_MAX = "HBO_MAX.png";
    private static final String ANUNCIO_NUEVOS_CANALES_PAQUETE_SKYHD_BLACK = "SKY-HD-BLACK.png";
    private static final String ANUNCIO_NUEVOS_CANALES_PAQUETE_SKYHD_GOLD = "SKY-HD-GOLD.png";
    private static final String ANUNCIO_NUEVOS_CANALES_PAQUETE_SKYHD_HBOMAX = "SKY-HD-HBO_MAX.png";
    private static final String ANUNCIO_NUEVOS_CANALES_PAQUETE_SKYHD_PLATINUM = "SKY-HD-PLATINUM.png";
    private static final String ANUNCIO_NUEVOS_CANALES_PAQUETE_SKY_TOTAL = "TOTAL.png";
    private static final String ANUNCIO_NUEVOS_CANALES_PAQUETE_UNIVERSE = "UNIVERSE.png";

    // popup para mostrar Blue Telecomm Cel
    //boolean mostrarPopupBTCEL;
    boolean mostrarAnuncioBTCEL;
    // popup para mostrar Blue Telecomm Cel Sky sports
    //boolean mostrarPopupBTCELSkySports;
    boolean mostrarAnuncioBTCELSkySports;
    // popup para mostrar Blue Telecomm Cel Sky Nueva Era
    //boolean mostrarPopupBTCELSkyNE;
    boolean mostrarAnuncioBTCELSkyNE;
    String urlAnuncio;
    // popup para mostrar anuncio de control univesal
    //boolean mostrarPopupControlUniversal;
    boolean mostrarAnuncioControlUniversal;
    // popup para mostrar anuncio para incentivar el cambio de SD a HD
    //boolean mostrarPopupSDtoHD;    
    boolean mostrarAnuncioSDtoHD;
    //anuncio combo hbb
    boolean mostrarAnuncioComboHBB;
    // popup incremeto de precio BTI
    //boolean mostrarPopupIncrementoBTI;
    boolean mostrarAnuncioIncrementoBTI;
    // popup incremento de precio en VETV, VETV PLUS, VETV HD
    //boolean mostrarPopupVETV; 
    boolean mostrarAnuncioVETV;
    // popup baja de precio en VETV PLUS HD
    //boolean mostrarPopupVETVPLUSHD; 
    boolean mostrarAnuncioVETVPLUSHD;
    // popup para mostrar anuncio de nuevos canales
    //boolean mostrarPopupNuevosCanales;
    boolean mostrarAnuncioNuevosCanales;
    // popup para mostrar anuncio de cambio a SKY HD Platinum para El SalVador
    //boolean mostrarPopupSKYHDPSalvador;
    boolean mostrarAnuncioSKYHDPSalvador;
    
    //variable para controlar si se es redirigible la pantalla de promociones en el inicio de sesion
    boolean mostrarPromociones;
    SesionMB sesionMB  = (SesionMB) JSFUtils.getBean("sesion");
    
    public AnunciosMB() {
        super();
      
        /*mostrarPopupBTCEL = true;
        mostrarPopupBTCELSkySports = true;
        mostrarPopupBTCELSkyNE = true;
        mostrarPopupControlUniversal = true;  
        mostrarPopupSDtoHD = true;
        mostrarPopupIncrementoBTI = true;
        mostrarPopupVETV = true;
        mostrarPopupVETVPLUSHD = true;
        mostrarPopupNuevosCanales = true;
        mostrarPopupSKYHDPSalvador = true;*/
        
    }

/*
    public void setMostrarPopupControlUniversal(boolean mostrarPopupControlUniversal) {
        this.mostrarPopupControlUniversal = mostrarPopupControlUniversal;
    }    
    public boolean isMostrarPopupControlUniversal() {
        return mostrarPopupControlUniversal;
    }
    public void setMostrarPopupIncrementoBTI(boolean mostrarPopupIncrementoBTI){
        this.mostrarPopupIncrementoBTI = mostrarPopupIncrementoBTI;
    }
    public boolean isMostrarPopupIncrementoBTI(){
        return mostrarPopupIncrementoBTI;
    }    
    public void setMostrarPopupBTCELSkyNE(boolean mostrarPopupBTCELSkyNE) {
        this.mostrarPopupBTCELSkyNE = mostrarPopupBTCELSkyNE;
    }

    public boolean isMostrarPopupBTCELSkyNE() {
        return mostrarPopupBTCELSkyNE;
    }
    public void setMostrarPopupBTCELSkySports(boolean mostrarPopupBTCELSkySports) {
        this.mostrarPopupBTCELSkySports = mostrarPopupBTCELSkySports;
    }

    public boolean isMostrarPopupBTCELSkySports() {
        return mostrarPopupBTCELSkySports;
    }
    public void setMostrarPopupBTCEL (boolean mostrarPopupbtcel) {
        this.mostrarPopupBTCEL =
            mostrarPopupbtcel;
    }
    public boolean isMostrarPopupBTCEL(){
        return mostrarPopupBTCEL;
    }
 
    public void setMostrarPopupSDtoHD(boolean mostrarPopupSDtoHD) {
        this.mostrarPopupSDtoHD = mostrarPopupSDtoHD;
    }

    public boolean isMostrarPopupSDtoHD() {
        return mostrarPopupSDtoHD;
    }
    public void setMostrarPopupVETV(boolean mostrarPopupVETV){
        this.mostrarPopupVETV = mostrarPopupVETV;
    }
    public boolean isMostrarPopupVETV(){
        return mostrarPopupVETV;
    }
    public void setMostrarPopupVETVPLUSHD(boolean mostrarPopupVETVPLUSHD){
        this.mostrarPopupVETVPLUSHD = mostrarPopupVETVPLUSHD;
    }
    public boolean isMostrarPopupVETVPLUSHD(){
        return mostrarPopupVETVPLUSHD;
    }*/
    
    //TRIGGER PARA MOSTRAR popup Control Universal
    /*public String getTriggerTypePopupControlUniversal() {
        String lanzarPopup = "default";
        SesionMB sesion = null;
        sesion = (SesionMB)JSFUtils.getBean("sesion");
        
        LogPC.println(this, "mostrarPopupPromoPoupControlUniversal");

        if (sesion != null && sesion.getSuscriptor() != null && sesion.getSuscriptor().getPaquete() != null &&
            (sesion.isUserVeTV() || sesion.isUserSKY()) && this.mostrarPopupControlUniversal) {
            LogPC.println(this, "Paquete del suscriptor desde getTriggerTypePopupControlUniversal: " + sesion.getSuscriptor().getPaquete());
            lanzarPopup = "load";
        }
        LogPC.println(this, "lanzarPopup desde getTriggerTypePopupControlUniversal: " + lanzarPopup);
        return lanzarPopup;
    }*/
        
    
    //TRIGGER PARA MOSTRAR popup Blue Telecomm Cel
    /*public String getTriggerTypePopupbtcel() {
        String lanzarPopupBTCEL = "default";
        SesionMB sesion = null;
        sesion = (SesionMB)JSFUtils.getBean("sesion");
        
        LogPC.println(this, "mostrar mostrarPopupbtcelbanner desde getTriggerTypePopupbtcel: " +
                      mostrarPopupBTCEL);

        if (sesion != null && sesion.getSuscriptor() != null && sesion.getSuscriptor().getPaquete() != null &&
            sesion.getSuscriptor().getPais() != null && sesion.getSuscriptor().getPaquete().contains("VETV") &&
            sesion.getSuscriptor().getPais().equalsIgnoreCase("MEX") && 
            (sesion.getSuscriptor().getLineasCelulares() != null) &&
            mostrarPopupBTCEL) {
            LogPC.println(this,
                          "Paquete del suscriptor desde getTriggerTypePopupbtcel: " +
                          sesion.getSuscriptor().getPaquete());
            lanzarPopupBTCEL = "load";
        }

        LogPC.println(this,
                      "lanzarPopup desde getTriggerTypePopupbtcel: " +
                      lanzarPopupBTCEL);

        return lanzarPopupBTCEL;
    }*/
    
    //TRIGGER PARA MOSTRAR popup Blue Telecomm Cel Sky Sports
    /*public String getTriggerTypePopupBTCELSkySports() {
        String lanzarPopupBTCEL = "default";
        SesionMB sesion = null;
        sesion = (SesionMB)JSFUtils.getBean("sesion");
        
        LogPC.println(this, "mostrar mostrarPopupbtcelbannerskysports desde getTriggerTypePopupbtcel: " +
                      mostrarPopupBTCELSkySports);

        if (sesion != null && sesion.getSuscriptor() != null && sesion.getSuscriptor().getCuentaSKY() != null &&
            sesion.getSuscriptor().getPais() != null && sesion.isPaqueteSkySports() &&
            sesion.getSuscriptor().getPais().equalsIgnoreCase("MEX") &&
            (sesion.getSuscriptor().getLineasCelulares() != null) &&
            mostrarPopupBTCELSkySports) {
            LogPC.println(this,
                          "Paquete del suscriptor desde getTriggerTypePopupbtcel: " +
                          sesion.getSuscriptor().getPaquete());
            lanzarPopupBTCEL = "load";
        }

        LogPC.println(this,
                      "lanzarPopup desde getTriggerTypePopupbtcel: " +
                      lanzarPopupBTCEL);

        return lanzarPopupBTCEL;
    }*/

    
    //TRIGGER PARA MOSTRAR POPUP INCREMENTO BTI
        /*public String getTriggerTypePopupIncrementoBTI() {
            String lanzarIncrementoBTI = "default";
            SesionMB sesion = null;
            sesion = (SesionMB)JSFUtils.getBean("sesion");
            
            LogPC.println(this, "mostrarPopupIncrementoBTI desde getTriggerTypePopupIncrementoBTI: " +
                          mostrarPopupIncrementoBTI);

            if (sesion != null && sesion.getSuscriptor() != null && sesion.getSuscriptor().getPaquete() != null &&
                sesion.getSuscriptor().getPais() != null && sesion.getSuscriptor().getCuentaSKY() != null && 
                sesion.getSuscriptor().getPais().equalsIgnoreCase("MEX") && sesion.isCuentaDualPlay()  && 
                sesion.getSuscriptor().getProveedorServicioInternet() != null && sesion.getSuscriptor().getProveedorServicioInternet().equalsIgnoreCase("ALTAN") &&
                sesion.getSuscriptor().getExternalOffer() != null && sesion.getSuscriptor().getExternalOffer().equalsIgnoreCase("HBB") &&             
                (sesion.isCuentaNewEra() || sesion.isCuentaBtcelSD() || sesion.getSuscriptor().getPaquete().contains("VETV"))&&
                mostrarPopupIncrementoBTI) {
                LogPC.println(this,
                              "Paquete del suscriptor desde getTriggerTypePopupIncrementoBTI: " +
                              sesion.getSuscriptor().getPaquete());
                lanzarIncrementoBTI = "load";
            }

            LogPC.println(this,
                          "lanzarPopup desde getTriggerTypePopupIncrementoBTI: " +
                          lanzarIncrementoBTI);

            return lanzarIncrementoBTI;
        }*/
           

    //TRIGGER PARA MOSTRAR popup Blue Telecomm Cel Sky Nueva Era
    /*public String getTriggerTypePopupBTCELSkyNE() {
        String lanzarPopupBTCEL = "default";
        SesionMB sesion = null;
        sesion = (SesionMB)JSFUtils.getBean("sesion");
        
        LogPC.println(this, "mostrar mostrarPopupbtcelbannerskyne desde getTriggerTypePopupBTCELSkyNE: " +
                      mostrarPopupBTCELSkyNE);

        if (sesion != null && sesion.getSuscriptor() != null && sesion.getSuscriptor().getCuentaSKY() != null &&
            sesion.getSuscriptor().getPais() != null && sesion.getSuscriptor().getPais().equalsIgnoreCase("MEX") &&
            (sesion.isCuentaNewEra() || sesion.isCuentaBtcelSD()) &&
            (sesion.getSuscriptor().getLineasCelulares() != null) &&
            mostrarPopupBTCELSkyNE) {
            LogPC.println(this,
                          "Paquete del suscriptor desde getTriggerTypePopupBTCELSkyNE: " +
                          sesion.getSuscriptor().getPaquete());
            lanzarPopupBTCEL = "load";
        }

        LogPC.println(this,
                      "lanzarPopup desde getTriggerTypePopupBTCELSkyNE: " +
                      lanzarPopupBTCEL);

        return lanzarPopupBTCEL;
    }*/

    //TRIGGER PARA MOSTRAR popup incremento de precio en VETV, VETV HD, VETV PLUS
    /*public String getTriggerTypePopupVETV() {
        String lanzarPopupVETV = "default";
        SesionMB sesion = null;
        sesion = (SesionMB)JSFUtils.getBean("sesion");
        
        LogPC.println(this, "mostrarPopupVETV desde getTriggerTypePopupVETV: " +
                      mostrarPopupVETV);

        if (sesion != null && sesion.getSuscriptor() != null && sesion.getSuscriptor().getCuentaSKY() != null &&
            sesion.getSuscriptor().getPais() != null && sesion.getSuscriptor().getPais().equalsIgnoreCase("MEX") &&
             (sesion.isCuentaVetv() || sesion.isCuentaVETVHD() || sesion.isCuentavetvPlus()) && !sesion.isCuentaVETVPLUSHD() &&           
            mostrarPopupVETV) {
            LogPC.println(this,
                          "Paquete del suscriptor desde getTriggerTypePopupVETV: " +
                          sesion.getSuscriptor().getPaquete());
            lanzarPopupVETV = "load";
        }

        LogPC.println(this,
                      "lanzarPopup desde getTriggerTypePopupVETV: " +
                      lanzarPopupVETV);

        return lanzarPopupVETV;
    }*/
    
    //TRIGGER PARA MOSTRAR popup baja de precio en VETV PLUS HD 

    /*public String getTriggerTypePopupVETVPLUSHD() {
              String lanzarPromoVETVHDPLUS = "default";
              SesionMB sesion = null;
              sesion = (SesionMB)JSFUtils.getBean("sesion");
              
              LogPC.println(this, "mostrarPopupVETVPLUSHD desde getTriggerTypePopupVETVPLUSHD: " +
                            mostrarPopupVETVPLUSHD);

         if (sesion != null && sesion.getSuscriptor() != null && sesion.getSuscriptor().getCuentaSKY() != null &&
             sesion.getSuscriptor().getPais() != null && sesion.getSuscriptor().getPais().equalsIgnoreCase("MEX") &&
             sesion.getSuscriptor().getPaquete().equalsIgnoreCase("VETV PLUS HD") &&
             mostrarPopupVETVPLUSHD) {
                  LogPC.println(this,
                                "Paquete del suscriptor desde getTriggerTypePopupVETVPLUSHD: " +
                                sesion.getSuscriptor().getPaquete());
                  lanzarPromoVETVHDPLUS = "load";
              }

              LogPC.println(this,
                            "lanzarPopup desde getTriggerTypePopupVETVPLUSHD: " +
                            lanzarPromoVETVHDPLUS);

              return lanzarPromoVETVHDPLUS;
          }*/

  
    
    //Se valida si se lanza el anuncio para incentivar al suscriptor a cambiar de SD a HD
    /*public String getTriggerTypePopupSDtoHD() {
        String lanzarPopupSDtoHD = "default";
        SesionMB sesion = null;
        sesion = (SesionMB)JSFUtils.getBean("sesion");
        
        LogPC.println(this, "mostrarPopupSDtoHD desde getTriggerTypePopupSDtoHD: " +
                      mostrarPopupSDtoHD);
        

        if ( sesion != null && sesion.getSuscriptor() != null &&
             sesion.getSuscriptor().getPais() != null && sesion.getSuscriptor().getPais().equalsIgnoreCase("MEX") &&
             sesion.getSuscriptor().getPaquete() != null &&
             ( sesion.getSuscriptor().getPaquete().contains("ACCESS") ||
               sesion.getSuscriptor().getPaquete().contains("BASICO") ||
               sesion.getSuscriptor().getPaquete().contains("FUN") ||
               sesion.getSuscriptor().getPaquete().contains("FOX+") ||
               sesion.getSuscriptor().getPaquete().contains("HBO") ||
               sesion.getSuscriptor().getPaquete().contains("UNIVERSE")
             ) &&
            !sesion.getSuscriptor().isEquipoHD() && mostrarPopupSDtoHD ) {
                LogPC.println(this, "El suscriptor cuenta con equipo HD: " + sesion.getSuscriptor().isEquipoHD());
                LogPC.println(this,
                              "Se muestra el anuncio de SD a HD. Paquete del suscriptor desde getTriggerTypePopupSDtoHD: " +
                              sesion.getSuscriptor().getPaquete());
                lanzarPopupSDtoHD = "load";
        }

        LogPC.println(this,
                      "lanzarPopup desde getTriggerTypePopupSDtoHD: " +
                      lanzarPopupSDtoHD);

        return lanzarPopupSDtoHD;
    }*/
    
    
    
    
    
    //Se valida si se lanza el anuncio para informar de nuevos canales
    /*public String getTriggerTypePopupNuevosCanales() {
        String lanzarPopup = "default";
        SesionMB sesion = null;
        sesion = (SesionMB)JSFUtils.getBean("sesion");
        String paquete = null;
        
        LogPC.println(this, "mostrarPopupNuevosCanales desde getTriggerTypePopupNuevosCanales: " +
                      mostrarPopupNuevosCanales);
        LogPC.println(this, "Paquete suscriptor: " +
                      sesion.getSuscriptor().getPaquete());
        if( sesion != null && sesion.getSuscriptor() != null && sesion.getSuscriptor().getPaquete() != null ) {
            paquete = sesion.getSuscriptor().getPaquete().toUpperCase();
        }
        
        LogPC.println(this, "Paquete suscriptor a validar: " + paquete);
        
        if( paquete != null &&
            ( paquete.contains(PAQUETE_BASICO) ||
              paquete.contains(PAQUETE_SKY_FAMILIAR) ||
              paquete.contains(PAQUETE_FUN) ||
              paquete.contains(PAQUETE_HBO_MAX) ||
              paquete.contains(PAQUETE_SKYHD_BLACK) ||
              paquete.contains(PAQUETE_SKYHD_GOLD) ||
              paquete.contains(PAQUETE_SKYHD_HBOMAX) ||
              paquete.contains(PAQUETE_SKYHD_PLATINUM) ||
              paquete.contains(PAQUETE_SKY_TOTAL) ||
              paquete.contains(PAQUETE_UNIVERSE)
            ) &&
            mostrarPopupNuevosCanales ) {
            
                lanzarPopup = "load";
                
        }

        LogPC.println(this,
                      "lanzarPopup desde getTriggerTypePopupNuevosCanales: " +
                      lanzarPopup);

        return lanzarPopup;
    }*/
    
    
    
    //Se valida si se lanza el anuncio para alentar al suscriptor de el Salvador cambiarse de su paquete SKY Familiar HD
    //al SKY HD Platinum por el mismo precio.
    /*public String getTriggerTypePopupCambioSKYHDPlatinumElSalvador() {
        String lanzarPopup = "default";
        SesionMB sesion = null;
        sesion = (SesionMB)JSFUtils.getBean("sesion");
        String paquete = null;
        
        LogPC.println(this, "mostrarPopupSKYHDPSalvador desde getTriggerTypePopupCambioSKYHDPlatinumElSalvador: " +
                      mostrarPopupSKYHDPSalvador);
        LogPC.println(this, "Paquete suscriptor: " +
                      sesion.getSuscriptor().getPaquete());
        if( sesion != null && sesion.getSuscriptor() != null && sesion.getSuscriptor().getPaquete() != null ) {
            paquete = sesion.getSuscriptor().getPaquete().toUpperCase();
        }
        
        LogPC.println(this, "Paquete suscriptor a validar: " + paquete);
        
        if( paquete != null && paquete.contains(PAQUETE_SKY_FAMILIAR) && sesion.getSuscriptor().isEquipoHD() &&
            sesion.getSuscriptor().getPais() != null && sesion.getSuscriptor().getPais().equalsIgnoreCase("SAL") &&
            mostrarPopupSKYHDPSalvador ) {
                lanzarPopup = "load";
        }

        LogPC.println(this,
                      "lanzarPopup desde getTriggerTypePopupCambioSKYHDPlatinumElSalvador: " +
                      lanzarPopup);

        return lanzarPopup;
    }*/
    public String getImgAnuncioNuevosCanales() {
        String imgAnuncio = "";
        SesionMB sesion = null;
        sesion = (SesionMB)JSFUtils.getBean("sesion");
        String paqueteSuscriptor = null;
        
        LogPC.println(this, "In getImgAnuncioNuevosCanales...");
        
        
        if( sesion != null && sesion.getSuscriptor() != null && sesion.getSuscriptor().getPaquete() != null ) {
            paqueteSuscriptor = sesion.getSuscriptor().getPaquete().toUpperCase();
            
            LogPC.println(this, "Paquete del suscriptor a validar: " + paqueteSuscriptor);
            
            if( paqueteSuscriptor.contains(PAQUETE_BASICO) ) {
                imgAnuncio = ANUNCIO_NUEVOS_CANALES_PAQUETE_BASICO;
            } else if( paqueteSuscriptor.contains(PAQUETE_SKY_FAMILIAR) ) {
                imgAnuncio = ANUNCIO_NUEVOS_CANALES_PAQUETE_SKY_FAMILIAR;
            } else if( paqueteSuscriptor.contains(PAQUETE_FUN) ) {
                imgAnuncio = ANUNCIO_NUEVOS_CANALES_PAQUETE_FUN;
            } else if( paqueteSuscriptor.contains(PAQUETE_SKYHD_HBOMAX) ) {
                imgAnuncio = ANUNCIO_NUEVOS_CANALES_PAQUETE_SKYHD_HBOMAX;
            } else if( paqueteSuscriptor.contains(PAQUETE_SKYHD_BLACK) ) {
                imgAnuncio = ANUNCIO_NUEVOS_CANALES_PAQUETE_SKYHD_BLACK;
            } else if( paqueteSuscriptor.contains(PAQUETE_SKYHD_GOLD) ) {
                imgAnuncio = ANUNCIO_NUEVOS_CANALES_PAQUETE_SKYHD_GOLD;
            } else if( paqueteSuscriptor.contains(PAQUETE_HBO_MAX) ) {
                imgAnuncio = ANUNCIO_NUEVOS_CANALES_PAQUETE_HBO_MAX;
            } else if( paqueteSuscriptor.contains(PAQUETE_SKYHD_PLATINUM) ) {
                imgAnuncio = ANUNCIO_NUEVOS_CANALES_PAQUETE_SKYHD_PLATINUM;
            } else if( paqueteSuscriptor.contains(PAQUETE_SKY_TOTAL) ) {
                imgAnuncio = ANUNCIO_NUEVOS_CANALES_PAQUETE_SKY_TOTAL;
            } else if( paqueteSuscriptor.contains(PAQUETE_UNIVERSE) ) {
                imgAnuncio = ANUNCIO_NUEVOS_CANALES_PAQUETE_UNIVERSE;
            }
        }
        
        LogPC.println(this, "Se mostrara la siguiente imagen de anuncio: " + imgAnuncio);
        return imgAnuncio;
    }
    


    public void setUrlAnuncio(String urlAnuncio) {
        this.urlAnuncio = urlAnuncio;
    }

    public String getUrlAnuncio() {
        return urlAnuncio;
    }
    /*Costa Rica: www.skycostarica.com/apoyo
Guatemala: www.skyguatemala.com/apoyo
Panamá: www.sky.com.pa/apoyo
El Salvador: www.skyelsalvador.com/apoyo
Honduras: www.skyhonduras.com/apoyo
Nicaragua: www.skynicaragua.com/apoyo
Dominicana: www.skydominicana.com/apoyo
*/
    private void setUrlAnuncioCA_DO(String pais) {
        switch (pais) {
        case "CRICA":
            urlAnuncio = "http://www.skycostarica.com/apoyo";
            break;
        case "PAN":
            urlAnuncio = "http://www.sky.com.pa/apoyo";
            break;
        case "SAL":
            urlAnuncio = "http://www.skyelsalvador.com/apoyo";
            break;
        case "HON":
            urlAnuncio = "http://www.skyhonduras.com/apoyo";
            break;
        case "NIC":
            urlAnuncio = "http://www.skynicaragua.com/apoyo";
            break;
        case "GT":
            urlAnuncio = "http://www.skyguatemala.com/apoyo";
            break;
        case "DOM":
            urlAnuncio = "http://www.skydominicana.com/apoyo";
            break;
        default:
            urlAnuncio = "";
            break;
        }
    }

    /*public void setMostrarPopupNuevosCanales(boolean mostrarPopupNuevosCanales) {
        this.mostrarPopupNuevosCanales = mostrarPopupNuevosCanales;
    }

    public boolean isMostrarPopupNuevosCanales() {
        return mostrarPopupNuevosCanales;
    }*/

    /*public void setMostrarPopupSKYHDPSalvador(boolean mostrarPopupSKYHDPSalvador) {
        this.mostrarPopupSKYHDPSalvador = mostrarPopupSKYHDPSalvador;
    }

    public boolean isMostrarPopupSKYHDPSalvador() {
        return mostrarPopupSKYHDPSalvador;
    }*/
    public void setMostrarPromociones(boolean mostrarPromociones) {
        this.mostrarPromociones = mostrarPromociones;
    }

    public boolean isMostrarPromociones() {
        mostrarPromociones = isMostrarAnuncioVETV() || isMostrarAnuncioVETVPLUSHD()
                        || isMostrarAnuncioControlUniversal() || isMostrarAnuncioSDtoHD()
                        || isMostrarAnuncioComboHBB() 
                        //|| isMostrarAnuncioNuevosCanales()
                        || isMostrarAnuncioSKYHDPSalvador()
                        //|| isMostrarAnuncioIncrementoBTI()
                        //|| isMostrarAnuncioIncrementoBTCEL() 
                        || isMostrarAnuncioBTCEL()
                        || isMostrarAnuncioBTCELSkySports() || isMostrarAnuncioBTCELSkyNE();
        System.out.println("promociones: "+mostrarPromociones);
        return mostrarPromociones;
    }

    public void setMostrarAnuncioBTCEL(boolean mostrarAnuncioBTCEL) {
        this.mostrarAnuncioBTCEL = mostrarAnuncioBTCEL;
    }

    public boolean isMostrarAnuncioBTCEL() {
        LogPC.println(this, "Validando mostrarAnuncioBTCEL...");
        mostrarAnuncioBTCEL = false;
        if (sesionMB != null && sesionMB.getSuscriptor() != null && sesionMB.getSuscriptor().getPaquete() != null &&
            sesionMB.getSuscriptor().getPais() != null && sesionMB.getSuscriptor().getPaquete().contains("VETV") &&
            sesionMB.getSuscriptor().getPais().equalsIgnoreCase("MEX") && 
            (sesionMB.getSuscriptor().getLineasCelulares() != null)) {
            mostrarAnuncioBTCEL = true;
        }
        LogPC.println(this,
                      "Resultado de validacion mostrarAnuncioBTCEL: " +
                      mostrarAnuncioBTCEL);
        return mostrarAnuncioBTCEL;
    }

    public void setMostrarAnuncioBTCELSkySports(boolean mostrarAnuncioBTCELSkySports) {
        this.mostrarAnuncioBTCELSkySports = mostrarAnuncioBTCELSkySports;
    }

    public boolean isMostrarAnuncioBTCELSkySports() {
        LogPC.println(this, "Validando mostrarAnuncioBTCELSkySports...");
        mostrarAnuncioBTCELSkySports = false;
        if (sesionMB != null && sesionMB.getSuscriptor() != null && sesionMB.getSuscriptor().getCuentaSKY() != null &&
            sesionMB.getSuscriptor().getPais() != null && sesionMB.isPaqueteSkySports() &&
            sesionMB.getSuscriptor().getPais().equalsIgnoreCase("MEX") &&
            (sesionMB.getSuscriptor().getLineasCelulares() != null)) {
            mostrarAnuncioBTCELSkySports = true;
        }
        LogPC.println(this,
                      "Resultado de validacion mostrarAnuncioBTCELSkySports: " +
                      mostrarAnuncioBTCELSkySports);
        return mostrarAnuncioBTCELSkySports;
    }

    public void setMostrarAnuncioBTCELSkyNE(boolean mostrarAnuncioBTCELSkyNE) {
        this.mostrarAnuncioBTCELSkyNE = mostrarAnuncioBTCELSkyNE;
    }

    public boolean isMostrarAnuncioBTCELSkyNE() {
        LogPC.println(this, "Validando mostrarAnuncioBTCELSkySports...");
        mostrarAnuncioBTCELSkyNE = false;
        if (sesionMB != null && sesionMB.getSuscriptor() != null && sesionMB.getSuscriptor().getCuentaSKY() != null &&
            sesionMB.getSuscriptor().getPais() != null && sesionMB.getSuscriptor().getPais().equalsIgnoreCase("MEX") &&
            (sesionMB.isCuentaNewEra() || sesionMB.isCuentaBtcelSD()) &&
            (sesionMB.getSuscriptor().getLineasCelulares() != null)) {
            mostrarAnuncioBTCELSkyNE = true;
        }
        LogPC.println(this,
                      "Resultado de validacion mostrarAnuncioBTCELSkyNE: " +
                      mostrarAnuncioBTCELSkyNE);
        return mostrarAnuncioBTCELSkyNE;
    }

    public void setMostrarAnuncioControlUniversal(boolean mostrarAnuncioControlUniversal) {
        this.mostrarAnuncioControlUniversal = mostrarAnuncioControlUniversal;
    }

    public boolean isMostrarAnuncioControlUniversal() {
        mostrarAnuncioControlUniversal = false;

        LogPC.println(this, "validando mostrarAnuncioControlUniversal");

        if (sesionMB != null && sesionMB.getSuscriptor() != null && sesionMB.getSuscriptor().getPaquete() != null &&
            (sesionMB.isUserVeTV() || sesionMB.isUserSKY()) ) {
            mostrarAnuncioControlUniversal = true;
        }
        LogPC.println(this, "Resultado validacion mostrarAnuncioControlUniversal: "+mostrarAnuncioControlUniversal);
        return mostrarAnuncioControlUniversal;
    }

    public void setMostrarAnuncioSDtoHD(boolean mostrarAnuncioSDtoHD) {
        this.mostrarAnuncioSDtoHD = mostrarAnuncioSDtoHD;
    }

    public boolean isMostrarAnuncioSDtoHD() {
        LogPC.println(this, "validando mostrarPopupSDtoHD...");
        mostrarAnuncioSDtoHD = false;

        if ( sesionMB != null && sesionMB.getSuscriptor() != null &&
             sesionMB.getSuscriptor().getPais() != null && sesionMB.getSuscriptor().getPais().equalsIgnoreCase("MEX") &&
             sesionMB.getSuscriptor().getPaquete() != null &&
             ( sesionMB.getSuscriptor().getPaquete().contains("ACCESS") ||
               sesionMB.getSuscriptor().getPaquete().contains("BASICO") ||
               sesionMB.getSuscriptor().getPaquete().contains("FUN") ||
               sesionMB.getSuscriptor().getPaquete().contains("FOX+") ||
               sesionMB.getSuscriptor().getPaquete().contains("HBO") ||
               sesionMB.getSuscriptor().getPaquete().contains("UNIVERSE")
             ) &&
            !sesionMB.getSuscriptor().isEquipoHD() ) {
                mostrarAnuncioSDtoHD = true;
        }

        LogPC.println(this,
                      "Resultado de validacion mostrarAnuncioSDtoHD: " +
                      mostrarAnuncioSDtoHD);

        return mostrarAnuncioSDtoHD;
    }

    public void setMostrarAnuncioIncrementoBTI(boolean mostrarAnuncioIncrementoBTI) {
        this.mostrarAnuncioIncrementoBTI = mostrarAnuncioIncrementoBTI;
    }

    public boolean isMostrarAnuncioIncrementoBTI() {
        LogPC.println(this, "validando mostrarAnuncioIncrementoBTI...");
        mostrarAnuncioIncrementoBTI = false;
        if (sesionMB != null && sesionMB.getSuscriptor() != null && sesionMB.getSuscriptor().getPaquete() != null &&
            sesionMB.getSuscriptor().getPais() != null && sesionMB.getSuscriptor().getCuentaSKY() != null && 
            sesionMB.getSuscriptor().getPais().equalsIgnoreCase("MEX") && sesionMB.isCuentaDualPlay()  && 
            sesionMB.getSuscriptor().getProveedorServicioInternet() != null && sesionMB.getSuscriptor().getProveedorServicioInternet().equalsIgnoreCase("ALTAN") &&
            sesionMB.getSuscriptor().getExternalOffer() != null && sesionMB.getSuscriptor().getExternalOffer().equalsIgnoreCase("HBB") &&             
            (sesionMB.isCuentaNewEra() || sesionMB.isCuentaBtcelSD() || sesionMB.getSuscriptor().getPaquete().contains("VETV"))
            ) {
            mostrarAnuncioIncrementoBTI = true;
        }
        LogPC.println(this,
                      "Resultado de validacion mostrarAnuncioIncrementoBTI: " +
                      mostrarAnuncioIncrementoBTI);
        return mostrarAnuncioIncrementoBTI;
    }

    public void setMostrarAnuncioVETV(boolean mostrarAnuncioVETV) {
        this.mostrarAnuncioVETV = mostrarAnuncioVETV;
    }

    public boolean isMostrarAnuncioVETV() {
        LogPC.println(this, "validando mostrarAnuncioVETV");
        mostrarAnuncioVETV = false;
        SesionMB sesion = null;
        sesion = (SesionMB)JSFUtils.getBean("sesion");
        
        if (sesion != null && sesion.getSuscriptor() != null && sesion.getSuscriptor().getCuentaSKY() != null &&
            sesion.getSuscriptor().getPais() != null && sesion.getSuscriptor().getPais().equalsIgnoreCase("MEX") &&
             (sesion.isCuentaVetv() || sesion.isCuentaVETVHD() || sesion.isCuentavetvPlus()) && !sesion.isCuentaVETVPLUSHD()) {
            mostrarAnuncioVETV = true;
        }
        LogPC.println(this, "Resultado validando mostrarAnuncioVETV: " + mostrarAnuncioVETV);
        return mostrarAnuncioVETV;
    }

    public void setMostrarAnuncioVETVPLUSHD(boolean mostrarAnuncioVETVPLUSHD) {
        this.mostrarAnuncioVETVPLUSHD = mostrarAnuncioVETVPLUSHD;
    }

    public boolean isMostrarAnuncioVETVPLUSHD() {
        mostrarAnuncioVETVPLUSHD = false;
        SesionMB sesion = null;
        sesion = (SesionMB)JSFUtils.getBean("sesion");
        
        LogPC.println(this, "validando mostrarAnuncioVETVPLUSHD");

        if (sesion != null && sesion.getSuscriptor() != null && sesion.getSuscriptor().getCuentaSKY() != null &&
        sesion.getSuscriptor().getPais() != null && sesion.getSuscriptor().getPais().equalsIgnoreCase("MEX") &&
        sesion.getSuscriptor().getPaquete().equalsIgnoreCase("VETV PLUS HD") ) {
            mostrarAnuncioVETVPLUSHD = true;
        }
        
        LogPC.println(this,
                      "Resultado validacion mostrarAnuncioVETVPLUSHD: " + mostrarAnuncioVETVPLUSHD);

        return mostrarAnuncioVETVPLUSHD;
    }

    public void setMostrarAnuncioComboHBB(boolean mostrarAnuncioComboHBB) {
        this.mostrarAnuncioComboHBB = mostrarAnuncioComboHBB;
    }

    public boolean isMostrarAnuncioComboHBB() {
        LogPC.println(this, "validando mostrarAnuncioComboHBB...");
        mostrarAnuncioComboHBB = false;
            if (sesionMB != null &&sesionMB.isCuentaDualPlay() && sesionMB.getSuscriptor() != null &&
                sesionMB.getSuscriptor().getProveedorServicioInternet() != null && 
                sesionMB.getSuscriptor().getProveedorServicioInternet().equalsIgnoreCase("ALTAN") &&
                sesionMB.getSuscriptor().getExternalOffer() != null && 
                sesionMB.getSuscriptor().getExternalOffer().equalsIgnoreCase("HBB")) {
                mostrarAnuncioComboHBB = true;
            }
        LogPC.println(this,
                      "Resultado de validacion mostrarAnuncioComboHBB: " +
                      mostrarAnuncioComboHBB);
        return mostrarAnuncioComboHBB;
    }

    public void setMostrarAnuncioNuevosCanales(boolean mostrarAnuncioNuevosCanales) {
        this.mostrarAnuncioNuevosCanales = mostrarAnuncioNuevosCanales;
    }

    public boolean isMostrarAnuncioNuevosCanales() {
        LogPC.println(this, "validando mostrarAnuncioNuevosCanales...");
        mostrarAnuncioNuevosCanales = false;
        String paquete = null;
        if( sesionMB != null && sesionMB.getSuscriptor() != null && sesionMB.getSuscriptor().getPaquete() != null ) {
            paquete = sesionMB.getSuscriptor().getPaquete().toUpperCase();
        }
        
        LogPC.println(this, "Paquete suscriptor a validar: " + paquete);
        
        if( paquete != null &&
            ( paquete.contains(PAQUETE_BASICO) ||
              paquete.contains(PAQUETE_SKY_FAMILIAR) ||
              paquete.contains(PAQUETE_FUN) ||
              paquete.contains(PAQUETE_HBO_MAX) ||
              paquete.contains(PAQUETE_SKYHD_BLACK) ||
              paquete.contains(PAQUETE_SKYHD_GOLD) ||
              paquete.contains(PAQUETE_SKYHD_HBOMAX) ||
              paquete.contains(PAQUETE_SKYHD_PLATINUM) ||
              paquete.contains(PAQUETE_SKY_TOTAL) ||
              paquete.contains(PAQUETE_UNIVERSE)
            ) ) {
                mostrarAnuncioNuevosCanales = true;
            }
        LogPC.println(this,
                      "Resultado de validacion mostrarAnuncioNuevosCanales: " +
                      mostrarAnuncioNuevosCanales);
        return mostrarAnuncioNuevosCanales;
    }

    public void setMostrarAnuncioSKYHDPSalvador(boolean mostrarAnuncioSKYHDPSalvador) {
        this.mostrarAnuncioSKYHDPSalvador = mostrarAnuncioSKYHDPSalvador;
    }

    public boolean isMostrarAnuncioSKYHDPSalvador() {
        LogPC.println(this, "validando mostrarAnuncioSKYHDPSalvador...");
        mostrarAnuncioSKYHDPSalvador = false;
        String paquete = null;
        if( sesionMB != null && sesionMB.getSuscriptor() != null && sesionMB.getSuscriptor().getPaquete() != null ) {
            paquete = sesionMB.getSuscriptor().getPaquete().toUpperCase();
        }
        
        LogPC.println(this, "Paquete suscriptor a validar: " + paquete);
        
        if( paquete != null && paquete.contains(PAQUETE_SKY_FAMILIAR) && sesionMB.getSuscriptor().isEquipoHD() &&
            sesionMB.getSuscriptor().getPais() != null && sesionMB.getSuscriptor().getPais().equalsIgnoreCase("SAL")
            ) {
            mostrarAnuncioSKYHDPSalvador = true;
        }
        LogPC.println(this,
                      "Resultado de validacion mostrarAnuncioSKYHDPSalvador: " +
                      mostrarAnuncioSKYHDPSalvador);
        return mostrarAnuncioSKYHDPSalvador;
    }
}
