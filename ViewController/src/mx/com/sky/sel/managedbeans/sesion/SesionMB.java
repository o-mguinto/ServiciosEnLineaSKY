package mx.com.sky.sel.managedbeans.sesion;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.KeySpec;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import javax.faces.context.FacesContext;

import mx.com.sky.sel.beans.utils.Usuario;
import mx.com.sky.sel.beans.utils.usuario.UsuarioRegistro;
import mx.com.sky.sel.beans.vetv.DataVeTV;
import mx.com.sky.sel.enums.EnumFormaPago;
import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.proxyclients.rnsoa.generaurlchat.types.GeneraChatRNOutputABM;
import mx.com.sky.sel.services.bam.sesiones.insert.ServicioBAM;
import mx.com.sky.sel.services.beans.bam.OperacionBAM;
import mx.com.sky.sel.services.beans.pagos.formaspago.FormaPagoActual;
import mx.com.sky.sel.services.beans.promociones.Promocion;
import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import mx.com.sky.sel.services.beans.utils.ServiciosCuenta;
import mx.com.sky.sel.services.beans.utils.Suscriptor;
import mx.com.sky.sel.services.beans.utils.TarjetaInteligente;
import mx.com.sky.sel.services.datosgenerales.ServicioDatosGenerales;
import mx.com.sky.sel.services.dualplay.consulta.ServicioDualPlay;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.multicanal.chat.ServicioChat;
import mx.com.sky.sel.services.pagos.ServicioFormasPago;
import mx.com.sky.sel.services.promesapago.ServicioPromesaPago;
import mx.com.sky.sel.services.promociones.ServicioPromocion;
import mx.com.sky.sel.services.solicitudservicio.ServicioSolicituServicio;
import mx.com.sky.sel.services.ti.SerivcioTarjetaInteligente;
import mx.com.sky.sel.services.utils.usuario.ServicioUsuario;
import mx.com.sky.sel.services.vetv.ServicioVeTV;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.AgentUtil;
import mx.com.sky.sel.utils.JavaUtils;
import mx.com.sky.sel.utils.Parametros;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import oracle.adf.view.rich.render.ClientEvent;

import org.apache.commons.net.util.Base64;
//--------------------------------------------------------------------------------------

public class SesionMB implements Serializable {
    @SuppressWarnings("compatibility:464796620517264462")
    private static final long serialVersionUID = 7076551036691532503L;

    protected String idSesion;
    protected String PCMOVIL;
    protected Suscriptor suscriptor = null;
    protected Usuario usuario = null;
    protected String userRole = null;
    protected String imgNovedades = null;
    protected boolean mostrarNovedades;
    protected String popIdNovedades = null;
    protected int contadorMostrarNovedades = 0;
    protected boolean isCorporativo = false;
    protected boolean isVIP = false;
    protected String nombreFactura = null;
    protected String uuidFactura = null;
    protected String tipoCuentaBanner = null;
    protected String sistema = null;
    protected boolean hiJump;
    protected String codigoRecargaVeTV = null;
    protected boolean paginaFallo;
    protected String mantenimientoHijump;
    protected EnumFormaPago formaPagoActual;
    protected boolean mostrarMenuNovedades;

    /**
     * Para el ConfigMenu
     */
    private String codigoError;
    protected boolean suscriptorBoolean;
    protected boolean promesaPago;
    protected String paquete;
    protected String cuentaSKY;
    protected boolean cuentaActiva;
    protected boolean admin;
    protected boolean oppv;
    protected boolean ippv;
    protected boolean denegaracceso;
    protected String permisosAdmin;
    protected String statusRecarga;
    protected String statusCuenta;
    protected boolean corporativo;
    protected boolean vip;
    protected DataVeTV dataVeTV;
    protected double saldoRealVeTV;
    protected double montoRecargaVeTV;
    private String categoriaCAC;
    //private int equiposBloqueados;
    protected boolean contratoTya;
    protected boolean contratoVetv;
    protected boolean adendum;
    private boolean cuentaHijump;
    private String year;

    /**
     *  DOM = Republica Dominicana
     *  MEX = Mexico
     */
    protected String pais;

    //Variable temporal para probar OTT
    protected boolean permiteOTT = true;
    protected boolean permiteCBTGVEW;
    //----este es un nuevo cambio
    protected boolean contratadoBTGVE;
    //--------------------------

    //Variable para validar el cambio de forma de pago
    protected String cambioFormaPago;
    //Variables para CHAT
    protected String canal;
    protected String canalChat;
    protected String canalChatEncriptado;
    protected String urlChat;
    protected String urlChatTemplate;
    protected String mailTo;

    //Variable para nÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Âºmero de equipos.
    int contadorEquiposActivos = 0;
    //Variable para validar tema de mostrar la promociÃƒÆ’Ã‚Â³n
    protected boolean popupChatVeTV;
    protected boolean cuentaDualPlay;
    protected boolean popupPremiaVeTV;
    protected boolean popupPremiaVeTVSinRecarga;
    //protected boolean popupBeneficioComboHbb;
    //----este es un nuevo cambio
    protected boolean premiaVeTVMostrar;
    protected boolean premiaVeTVMostrarSinRecarga;
    //protected boolean popupBeneficioComboHbbMostrar;

    public SesionMB() {
        super();
        LogPC.println(this, "In SesionMB Constructor...");
        //variable para activar los servicios de Hi Jump en Servicios En L\u00EDnea (BRM),
        //si es true comprueba cuenta en BRM para hacer el switch del sistema.
        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu");
            this.year = dtf.format(LocalDate.now());
            System.out.println();
            hiJump = true;
            sistema = "HIJUMP";
            cuentaHijump = true;
            popupPremiaVeTV = true;
            popupPremiaVeTVSinRecarga = true;
            //popupBeneficioComboHbb = true;
            //--------------------------
            codigoError = "0000";
            paginaFallo = false;
            mantenimientoHijump =
                "Por el momento no hemos podido procesar su solicitud de inicio de sesi\u00F3n en Servicios en L\u00EDnea SKY, por favor intente m\u00E1s tarde. ";
            popIdNovedades = "S";
            mostrarMenuNovedades = false;
            contadorMostrarNovedades = 1;
            //permiteCBTGVEW = true;

            if (usuario == null) {
                usuario = new Usuario();
                asignarDatosUsuario();
            }
            if (suscriptor == null) {
                suscriptor = new Suscriptor();
                asignarDatosSuscriptor();
            }
            
            if (!paginaFallo) {
                permiteCBTGVEW = isConsultaPermiteBTGEW();
                cargarPaqueteRole();
                validarNovedades();
                cargarConfigMenu();
                if (isUserVeTV()) {
                    cargarDatosVeTV();
                    if (!suscriptor.getStatusRecarga().equalsIgnoreCase("Con Recarga")) {
                        urlChat = getURLChatRecarga();
                        if (urlChat.isEmpty() || urlChat == null) {
                            popupChatVeTV = false;
                        } else {
                            popupChatVeTV = true;
                        }
                    } else {
                        popupChatVeTV = false;
                    }
                } else if (isUserMini()) {
                    cargarDatosVeTV();
                }
                cargarFormaPago();
                registrarSesion();
            }
            
            //this.sistema = "HIJUMP";
            //cuentaHijump= true;
            //Variable de cambio de forma de pago
            cambioFormaPago = "false";
        } catch (Exception e) {
            LogPC.printlnError(this, "Exception error", e);
            paginaFallo = true;
        }
        LogPC.println(this, "SesionMB construido con exito");
    }

    private void cargarConfigMenu() {
        cuentaSKY = suscriptor.getCuentaSKY();
        cuentaActiva = suscriptor.getStatusCuenta().equalsIgnoreCase("ACTIVA");
        suscriptorBoolean = usuario.getUid().contains("-01");
        admin = usuario.getTipoUsuario().equalsIgnoreCase("A");
        isCorporativo = usuario.getTipoUsuario().equalsIgnoreCase("C");
        isVIP = usuario.getTipoUsuario().equalsIgnoreCase("V");

        if (isCorporativo) {
            tipoCuentaBanner = "CORPORATIVO";
        }
        if (isVIP) {
            tipoCuentaBanner = "VIP";
        }

        //menu = new ConfigMenu(isSuscriptor, cuentaActiva, isAdmin);
        pais = suscriptor.getPais();
        oppv = suscriptor.isOppv();
        ippv = suscriptor.isIppv();
        denegaracceso = userRole.equalsIgnoreCase("NA");
        permisosAdmin = usuario.getPermisos();
        statusRecarga = suscriptor.getStatusRecarga();
        statusCuenta = suscriptor.getStatusCuenta();
        paquete = suscriptor.getPaquete();

        //Codigo temporal para validar OTT
        permiteOTT = true;
    }

    private void cargarFormaPago() {
        ServicioFormasPago servFormasPago = new ServicioFormasPago();
        FormaPagoActual formaPagoActualTmp = null;
        try {
            formaPagoActualTmp = servFormasPago.consultaFormaPagoActual(cuentaSKY);
            if (formaPagoActualTmp == null) {
                paginaFallo = true;
                codigoError = "CFP001";
            } else {
                this.formaPagoActual = formaPagoActualTmp.getFormaPagoActual();
            }
        } catch (Exception e) {
            LogPC.printlnError(this, "Exception error", e);
            paginaFallo = true;
            codigoError = "CFP002";
        }
    }

    public UsuarioRegistro obtenerMiCuenta() {
        UsuarioRegistro usuario = new UsuarioRegistro();
        List<UsuarioRegistro> usuarios = new ArrayList<UsuarioRegistro>();
        ServicioUsuario su = new ServicioUsuario();
        try {
            usuarios = su.obtenerCuentas(getUsuario().getUid());
            if (usuarios != null && usuarios.size() > 0) {
                usuario = usuarios.get(0);
            }
        } catch (Exception e) {
            LogPC.printlnError(this, "Exception error", e);
        }
        return usuario;
    }

    public static String encryptBlowBase64(byte[] plaintext, byte[] Key) {
        SecretKeySpec _key = new SecretKeySpec(Key, "Blowfish");

        // Complete block 8 bytes
        if (plaintext.length % 8 != 0) { // not a multiple of 8
            // create a new array with a size which is a multiple of 8
            byte[] padded = new byte[plaintext.length + 8 - (plaintext.length % 8)];

            // copy the old array into it
            System.arraycopy(plaintext, 0, padded, 0, plaintext.length);
            plaintext = padded;
        }
        try {
            // Get a Blowfish Cipher object
            Cipher cipher = Cipher.getInstance("Blowfish/ECB/NoPadding"); // Blowfish
            // encryption
            // Set it into encryption mode
            cipher.init(Cipher.ENCRYPT_MODE, _key);
            // Encrypt data
            byte[] cipherText = cipher.doFinal(plaintext);

            // Encode Base64
            cipherText = Base64.encodeBase64(cipherText);
            String value = new String(cipherText);
            return value;
        } catch (Exception e) {
            LogPC.printlnError(e);
            e.printStackTrace();
            return null;
        }
    }

    private void registrarSesion() {
        ServicioBAM bam = new ServicioBAM();
        AgentUtil agentUtil = new AgentUtil();
        try {
            idSesion = JavaUtils.getCurrentTime() + "" + usuario.getCuentaSKY();
            String username = usuario.getNombreUsuario();
            String marketType = suscriptor.getMarketType();


            PCMOVIL = agentUtil.getDispositivo();
            if (cuentaSKY == null || cuentaSKY.isEmpty()) {
                throw new Exception("Cuenta SKY Vacia");
            }
            bam.registraSesion(cuentaSKY, pais, paquete, username, marketType, PCMOVIL, idSesion);
            OperacionBAM operacionBAM = new OperacionBAM();
            operacionBAM.setCuentaSky(cuentaSKY);
            operacionBAM.setEmail(usuario.getMail());
            operacionBAM.setEstatusCuenta(suscriptor.getStatusCuenta());
            operacionBAM.setIdSesion(idSesion);
            operacionBAM.setMarkettype(suscriptor.getMarketType());
            operacionBAM.setOperacion(EnumOperacionBAM.INICIO_SESION.toString());
            operacionBAM.setOrganizationtype(suscriptor.getOrganizationType());
            operacionBAM.setPais(getPaisISO());
            operacionBAM.setPaquete(suscriptor.getPaquete());
            operacionBAM.setTipoCuenta(usuario.getTipoUsuario());
            operacionBAM.setUserid(usuario.getUid());
            operacionBAM.setUsername(usuario.getNombreUsuario());
            operacionBAM.setPcmovil(PCMOVIL);
            OperacionBAMUtils.registrarOperacion(operacionBAM);
        } catch (Exception e) {
            LogPC.printlnError(this, "Exception error", e);
            LogServicios.printlnWarn(this, "La sesion no se esta registrando");
        }
    }

    private void registrarOperacion(String operacion) {
        ServicioBAM bam = new ServicioBAM();
        AgentUtil agentUtil = new AgentUtil();
        try {
            idSesion = JavaUtils.getCurrentTime() + "" + usuario.getCuentaSKY();
            String username = usuario.getNombreUsuario();
            String marketType = suscriptor.getMarketType();


            PCMOVIL = agentUtil.getDispositivo();
            if (cuentaSKY == null || cuentaSKY.isEmpty()) {
                throw new Exception("Cuenta SKY Vacia");
            }
            bam.registraSesion(cuentaSKY, pais, paquete, username, marketType, PCMOVIL, idSesion);
            OperacionBAM operacionBAM = new OperacionBAM();
            operacionBAM.setCuentaSky(cuentaSKY);
            operacionBAM.setEmail(usuario.getMail());
            operacionBAM.setEstatusCuenta(suscriptor.getStatusCuenta());
            operacionBAM.setIdSesion(idSesion);
            operacionBAM.setMarkettype(suscriptor.getMarketType());
            operacionBAM.setOperacion(operacion);
            operacionBAM.setOrganizationtype(suscriptor.getOrganizationType());
            operacionBAM.setPais(getPaisISO());
            operacionBAM.setPaquete(suscriptor.getPaquete());
            operacionBAM.setTipoCuenta(usuario.getTipoUsuario());
            operacionBAM.setUserid(usuario.getUid());
            operacionBAM.setUsername(usuario.getNombreUsuario());
            operacionBAM.setPcmovil(PCMOVIL);
            OperacionBAMUtils.registrarOperacion(operacionBAM);
        } catch (Exception e) {
            LogPC.printlnError(this, "Exception error", e);
            LogServicios.printlnWarn(this, "La sesion no se esta registrando");
        }
    }

    private void asignarDatosSuscriptor() {
        try {
            System.out.println("asignar datos suscriptor CuentaSKY: " + usuario.getCuentaSKY());
            suscriptor.setCuentaSKY(usuario.getCuentaSKY());
            ServicioDatosGenerales sdg = new ServicioDatosGenerales();
            this.suscriptor = sdg.getDatosGenerales(suscriptor.getCuentaSKY());
            //Datos de dualPlay
            ServicioDualPlay dualPlay = new ServicioDualPlay();
            ServiciosCuenta cuentaD = dualPlay.consultaCuentaDualPlay(suscriptor.getCuentaSKY());
            this.cuentaDualPlay = cuentaD.isCuentaDualPlay();
            if (cuentaDualPlay) {
                if (cuentaD.getPaqueteVideo() != null) {
                    if (cuentaD.getPaqueteInternet() != null) {
                        this.suscriptor.setSkyPaqueteInternet(cuentaD.getPaqueteInternet());
                        if (cuentaD.getPaqueteVideo().contains("COMBO BTI VETV")) {
                            this.suscriptor.setPaquete(cuentaD.getPaqueteVideo());
                        } else {
                            if (!this.suscriptor
                                     .getPaquete()
                                     .contains("VETV")) {
                                this.suscriptor.setPaquete(cuentaD.getPaqueteVideo());
                            }
                        }
                    } else {
                        this.suscriptor.setSkyPaqueteInternet("");
                    }
                    if (cuentaD.getPaqueteCelular() != null) {
                        this.suscriptor.setPaqueteCelular(cuentaD.getPaqueteCelular());
                    } else {
                        this.suscriptor.setPaqueteCelular(" ");
                    }
                    this.suscriptor.setStatusCodeMasterVideo(cuentaD.getStatusCodeMasterVideo());
                    this.suscriptor.setAssetNumberVideo(cuentaD.getAssetNumberVideo());
                    this.suscriptor.setSecondAssetNumberVideo(cuentaD.getSecondAssetNumberVideo());
                } else {
                    this.suscriptor.setPaquete(" ");
                    this.suscriptor.setPaqueteCelular(" ");
                    this.suscriptor.setSkyPaqueteInternet(" ");

                }
                this.suscriptor.setProveedorServicioInternet(cuentaD.getProveedorServicios());
                this.suscriptor.setMsisdnInternet(cuentaD.getMsisdn());
                this.suscriptor.setStatusServicioIntenet(cuentaD.getStatusServicioInternet());
                this.suscriptor.setAssetNumberInternet(cuentaD.getAssetNumber());
                this.suscriptor.setSecondAssetNumberInternet(cuentaD.getSecondAssetNumber());
                this.suscriptor.setExternalOffer(cuentaD.getExternalOffer());
                this.suscriptor.setLineasCelulares(cuentaD.getLineasCelulares());
            } else {
                if (cuentaD.getPaqueteVideo() != null) {
                    if (!this.suscriptor
                             .getPaquete()
                             .contains("VETV")) {
                        this.suscriptor.setPaquete(cuentaD.getPaqueteVideo());
                    }
                    this.suscriptor.setStatusCodeMasterVideo(cuentaD.getStatusCodeMasterVideo());
                    this.suscriptor.setAssetNumberVideo(cuentaD.getAssetNumberVideo());
                    this.suscriptor.setSecondAssetNumberVideo(cuentaD.getSecondAssetNumberVideo());
                } else {
                    this.suscriptor.setPaquete(" ");
                }
            }
        } catch (Exception e) {
            LogPC.printlnError(this, "Exception error", e);
            paginaFallo = true;
            codigoError = "SIB001";
            System.out.println("excepcion en asignarDAtosSuscriptor...");
        }
    }

    public void cargarDatosVeTV() {
            try {
                System.out.println("cargar datos Vetv & Mini");
                ServicioDualPlay dualPlay = new ServicioDualPlay();
                ServiciosCuenta cuentaD = dualPlay.consultaCuentaDualPlay(this.suscriptor.getCuentaSKY());

                List<TarjetaInteligente> tis = null;
                String rowID = suscriptor.getRowId();
                //ServicioSaldo servSaldo = new ServicioSaldo();
                ServicioVeTV servVeTV = new ServicioVeTV();
                SerivcioTarjetaInteligente servTI = new SerivcioTarjetaInteligente();
                //int contadorEquiposActivos = 0;
                promesaPago = validarPermisoPromesaPago();
                //Codigo para consultar saldo de cuentas VETV en KENAN
                //saldoRealVeTV = servSaldo.obtenerSaldoRealVeTV(cuentaSKY);
                tis = servTI.getTarjetaInteligente(rowID);
                //if (tis.size() >= 2) {
                contadorEquiposActivos = 0;
                for (TarjetaInteligente tarjetaInteligente : tis) {
                    if (tarjetaInteligente.getStatus().equalsIgnoreCase("Activo") ||
                        tarjetaInteligente.getStatus().equalsIgnoreCase("Pendiente")) {
                        contadorEquiposActivos++;
                    } /*else if(tarjetaInteligente.getStatus().equalsIgnoreCase("Suspendido")){
                            equiposBloqueados++;
                        }*/
                }
                if (suscriptor.getMarketType().equalsIgnoreCase("Normal VeTV") 
                    || suscriptor.getMarketType().equalsIgnoreCase("Normal VeTV PLUS")) {
                        if (contadorEquiposActivos > 0) {
                            codigoRecargaVeTV = "1";
                        } else {
                            codigoRecargaVeTV = "NO_CLASIFICADA";
                        }  
                } else if (suscriptor.getMarketType().equalsIgnoreCase("Normal")) {
                    //Cuenta SKY SPORTS
                    codigoRecargaVeTV = "NO_CLASIFICADA";
                } else {
                    LogPC.printlnWarn(this, "VeTV Con problemas de equipos");
                    paginaFallo = true;
                    codigoError = "VTV001";
                }
                if (codigoRecargaVeTV != null && !codigoRecargaVeTV.equalsIgnoreCase("NO_CLASIFICADA"))
                    montoRecargaVeTV = servVeTV.consultarPrecio(this.suscriptor.getCuentaSKY(), codigoRecargaVeTV);

                dataVeTV = servVeTV.consultarDiasFinRecarga(cuentaSKY);
            } catch (ServicioException e) {
                LogPC.printlnError(this, "Exception error", e);
                paginaFallo = true;
            }
        }

    public void actualizarDatosSuscriptor() {
        asignarDatosSuscriptor();
    }

    public void actualizarDatosUsuario() {
        asignarDatosUsuario();
    }

    private void asignarDatosUsuario() {
        String username;
        try {
            username = ADFUtils.getPropertyLDAPUserName();
            //username="@";
            LogPC.println(this, "ASIGNAR DATOS USUARIO: username=" + username);
            ServicioUsuario su = new ServicioUsuario();
            usuario = su.consultaDatosUsuario(username);
            
            Map sessionState = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
            usuario.setNombre((String) sessionState.get("nombreUsuario"));
            usuario.setApellidoPaterno((String) sessionState.get("aPaternoUsuario"));
            usuario.setApellidoMaterno((String) sessionState.get("aMaternoUsuario"));

        } catch (Exception e) {
            LogPC.printlnError(this, "Exception error", e);
            paginaFallo = true;
            codigoError = "CDU001";
        }

    }
	public void isCuentaJerarquia(String cuentaSKY) {
		try {
			
			//username="@";
			LogPC.println(this, "CONSULTAR CUENTA JERARUIA DE UNA CORPORATIVA: CTA=" + cuentaSKY);
			ServicioUsuario su = new ServicioUsuario();
			usuario.setCuentaJerarquia(su.getCuentaJerarquia(cuentaSKY));
		} catch (Exception e) {
			LogPC.printlnError(this, "Exception error", e);
			paginaFallo = true;
			codigoError = "CDU001";
		}
	}
	
    private void validarNovedades() {
        ServicioPromocion sp = new ServicioPromocion();
        List<Promocion> promociones = null;
        Parametros param = new Parametros();
        promociones = sp.obtenerPromocionesActivas(suscriptor.getOrganizacion(), isUserVeTV(), true);
        if (promociones.size() <= 0) {
            this.mostrarNovedades = false;
            mostrarMenuNovedades = false;
            this.imgNovedades = "";
        } else {
            mostrarMenuNovedades = true;
            for (Promocion promocion : promociones) {
                if (promocion.getPopUp() != null && promocion.getPopUp()) {
                    this.mostrarNovedades = true;
                    this.popIdNovedades = "novedades";
                    this.imgNovedades = param.getUrlImgsProm825X300() + promocion.getImagen();
                }
            }
        }
    }

    public boolean isPaqueteAccess() {
        return paquete.equalsIgnoreCase("ACCESS");
    }

    public boolean isPaqueteHDGOLD() {
        return paquete.contains("GOLD");
    }

    public boolean isPaqueteHDPLATINUM() {
        return paquete.contains("PLATINUM");
    }

    public boolean isPaqueteHDFOX() {
        return (paquete.equalsIgnoreCase("SKY HD FOX+") || paquete.equalsIgnoreCase("COMBO FOX+ HD"));
    }

    protected boolean isPaqueteCDPTyA() {
        return paquete.contains("GOLD") || paquete.contains("PLATINUM") || paquete.contains("BLACK");
    }

    protected boolean isPaqueteBTGVEW() {
        return (paquete.contains("HBO") || paquete.contains("MOVIE CITY") || paquete.contains("FOX+") ||
                paquete.contains("UNIVERSE") || paquete.contains("FUN") || paquete.contains("GOLD") ||
                paquete.contains("PLATINUM") || paquete.contains("BLACK") || paquete.contains("HD")) && isMEX();
    }

    protected boolean isPaqueteBTGVEWCA_DOM() {
        return (paquete.contains("BASICO") && (isNIC() || isCRI() || isSLV() || isGTM() || isPAN() || isDOM())) ||
               (paquete.contains("FUN") && (isNIC() || isCRI() || isSLV() || isGTM() || isPAN() || isDOM())) ||
               (paquete.contains("SKY Familiar") && (isNIC() || isCRI() || isSLV() || isGTM() || isPAN() || isHND())) ||
               (paquete.contains("SKY FAMILIAR") && (isNIC() || isCRI() || isSLV() || isGTM() || isPAN() || isHND())) ||
               (paquete.contains("SKY Total") && (isHND())) || (paquete.contains("SKY TOTAL") && (isHND())) ||
               (paquete.contains("FOX") && (isNIC() || isCRI() || isSLV() || isGTM() || isPAN() || isDOM())) ||
               (paquete.contains("HBO") && (isNIC() || isCRI() || isSLV() || isGTM() || isPAN() || isDOM())) ||
               (paquete.contains("UNIVERSE") && (isNIC() || isCRI() || isSLV() || isGTM() || isPAN() || isDOM())) ||
               (paquete.contains("BLUE") && (isDOM())) ||
               (paquete.contains("GOLD") && (isCRI() || isGTM() || isPAN() || isDOM())) ||
               (paquete.contains("PLATINUM") && (isCRI() || isGTM() || isPAN() || isDOM())) ||
               (paquete.contains("BLACK") && (isCRI() || isGTM() || isPAN() || isDOM()));
    }

    protected boolean isPaqueteBLIM() {
        return paquete.contains("BASICO") || paquete.contains("FUN") || paquete.contains("FOX+") ||
               paquete.contains("HBO") || paquete.contains("UNIVERSE") || paquete.contains("BLACK") ||
               paquete.contains("FOX+") || paquete.contains("HBO MAX") || paquete.contains("PLATINUM");
    }

    public boolean isConsultaPermiteBTGEW() {

        ServicioSolicituServicio sss = new ServicioSolicituServicio();
        List<DetalleSolicitudServicio> solicitudes;
        solicitudes = sss.consultarSolicitudServicios(getSuscriptor().getRowId(), "Web", "Canales a la Carta");
        System.out.println(solicitudes);

        if(solicitudes.size() >0){
            
        for (int i = 0; i <solicitudes.size(); i++) {
            System.out.println("Se obtienen datos de lista " + solicitudes.get(i)
                                                                        .getEstatus()
                                                                        .toString());

            if (solicitudes.get(i)
                           .getEstatus()
                           .toString()
                           .contains("Abierto")) {
                System.out.println("No puede Contratar BTGEW su estatus es Abierto");
                permiteCBTGVEW = false;
            } else {
                System.out.println("BTGEW Contratado");
                permiteCBTGVEW = true;
            }
        }
        }
        else{
            permiteCBTGVEW = true;
        }
        return permiteCBTGVEW;
    }


    public boolean isPaqueteTextoLineUp() {
        return (((suscriptor.getMarketType().equalsIgnoreCase("Normal VeTV") && suscriptor.isEquipoHD() && isMEX()) ||
                 (suscriptor.getMarketType().equalsIgnoreCase("Normal VeTV PLUS") && suscriptor.isEquipoHD() &&
                  isMEX())) ||
                ((suscriptor.getPaquete().contains("BASICO") && isMEX()) ||
                 (suscriptor.getPaquete().contains("GOLD") && isMEX())) ||
                ((suscriptor.getPaquete().contains("GOLD") && isCRI())) ||
                ((suscriptor.getPaquete().contains("GOLD") && isPAN())) ||
                ((suscriptor.getPaquete().contains("GOLD") && isGTM())) ||
                ((suscriptor.getPaquete().contains("GOLD") && isDOM())));
    }

    public Suscriptor getSuscriptor() {
        return suscriptor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getIdCarousel() {
        return "carousel";
    }


    /**
     * Regresa el tipo de cuenta Residencial,Comercial,BarRestarutant
     * Solo regresa Comercial para cuentas tipo Comercial para descargar documentos
     * @return
     */
    public String getTipoCuentaRCB() {
        String organizationType = suscriptor.getOrganizationType();
        String tipoCuentaRCB = "";
        if (organizationType.equalsIgnoreCase("Comercial")) {
            if (!suscriptor.getPaisISO().equalsIgnoreCase("MX") && !suscriptor.getPaisISO().equalsIgnoreCase("CR")) {
                tipoCuentaRCB = "Comercial";
            }
        } else {
            tipoCuentaRCB = "";
        }
        return tipoCuentaRCB;
    }

    /**
     * Regresa true si el tipo de cuenta No es ni Residencial,Comercial y BarRestaurant
     *
     * @return
     */
    protected boolean getTipoCuentaBTGVEW() {
        String organizationType = suscriptor.getOrganizationType();
        String marketType = suscriptor.getMarketType();
        boolean permiteMenuBTGVEW = true;
        if (organizationType.equalsIgnoreCase("Direct To Home")) {
            if (marketType.equalsIgnoreCase("Staff"))
                permiteMenuBTGVEW = false;
        } else if (organizationType.equalsIgnoreCase("Comercial")) {
            permiteMenuBTGVEW = false;
        } else if (organizationType.equalsIgnoreCase("Bar/Restaurant")) {
            permiteMenuBTGVEW = false;
        } else {
            permiteMenuBTGVEW = true;
            LogPC.printlnWarn(this, "TIPO CUENTA PERIMITIDA CON BTGVEW [" + organizationType + "]");
        }
        return permiteMenuBTGVEW;
    }

    private void cargarPaqueteRole() {
        String organizationType = suscriptor.getOrganizationType();
        String marketType = suscriptor.getMarketType();

        if (organizationType.equalsIgnoreCase("Direct To Home")) {
            if (marketType.equalsIgnoreCase("Normal")) {
                userRole = "SKY";
            } else if (marketType.equalsIgnoreCase("DTV.Normal")) {
                userRole = "SKY";
            } else if (marketType.equalsIgnoreCase("Empleados")) {
                userRole = "SKY";
            } else if (marketType.equalsIgnoreCase("Puntos de Venta")) {
                userRole = "Punto_Venta";
            } else if (marketType.equalsIgnoreCase("Staff")) {
                userRole = "SKY";
                permiteCBTGVEW = false;
            } else if (marketType.equalsIgnoreCase("Temporal")) {
                userRole = "SKY";
            } else if (marketType.equalsIgnoreCase("VIP")) {
                userRole = "SKY";
            } else if (marketType.equalsIgnoreCase("Normal VeTV")) {
                if (suscriptor.getPaquete().contains("MINI")) {
                    userRole = "MINI";
                } else {
                    userRole = "VeTV";
                }
            } else if (marketType.equalsIgnoreCase("Normal MiSKY")) {
                userRole = "Modular";
            } else if (marketType.equalsIgnoreCase("Normal SKY HD")) {
                userRole = "SKY";
            } else if (marketType.equalsIgnoreCase("Normal VeTV PLUS")) {
                if (suscriptor.getPaquete().contains("MINI")) {
                    userRole = "MINI";
                } else {
                    userRole = "VeTV";
                }
            } else {
                LogPC.printlnWarn(this, "TIPO CUENTA NO CLASIFICADA [" + organizationType + "] [" + marketType + "]");
                userRole = "NA";
                codigoError = "TCC001";
                paginaFallo = true;
            }
        } else if (organizationType.equalsIgnoreCase("Comercial")) {
            permiteCBTGVEW = false;
            if (marketType.equalsIgnoreCase("Normal")) {
                userRole = "SKY";
            } else if (marketType.equalsIgnoreCase("Normal VeTV")) {
                if (suscriptor.getPaquete().contains("MINI")) {
                    userRole = "MINI";
                } else {
                    userRole = "VeTV";
                }
            } else if (marketType.equalsIgnoreCase("Normal MiSKY")) {
                userRole = "Modular";
            } else if (marketType.equalsIgnoreCase("DTV.Bar/Restaurant")) {
                userRole = "Bar_Restaurant";
            } else if (marketType.equalsIgnoreCase("Normal SKY HD")) {
                userRole = "SKY";
            } else if (marketType.equalsIgnoreCase("Normal VeTV PLUS")) {
                if (suscriptor.getPaquete().contains("MINI")) {
                    userRole = "MINI";
                } else {
                    userRole = "VeTV";
                }
            } else {
                LogPC.printlnWarn(this, "TIPO CUENTA NO CLASIFICADA [" + organizationType + "] [" + marketType + "]");
                userRole = "NA";
                codigoError = "TCC001";
                paginaFallo = true;
            }
        } else if (organizationType.equalsIgnoreCase("Bar/Restaurant")) {
            if (!marketType.equalsIgnoreCase("Intercambio") && !marketType.equalsIgnoreCase("SeÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â±ales Promo")) {
                permiteCBTGVEW = false;
                userRole = "Bar_Restaurant";
            } else {
                LogPC.printlnWarn(this, "TIPO CUENTA NO CLASIFICADA [" + organizationType + "] [" + marketType + "]");
                userRole = "NA";
                codigoError = "TCC001";
                mantenimientoHijump =
                    "Para cualquier solicitud de servicio favor de marcar al 51690000 o contactar al coordinador de su Intercambio en el Corporativo de su empresa. ";
                paginaFallo = true;
            }
        } else if (organizationType.equalsIgnoreCase("Hotel") && suscriptor.getPais().equalsIgnoreCase("MEX")) {

            if (!suscriptor.getStatusCuenta().equalsIgnoreCase("Activa")) {
                userRole = "NA";
                codigoError = "TCC001";
                mantenimientoHijump =
                    "Su cuenta SKY ha sido bloqueada debido a que presenta un adeudo.  Para realizar la aclaraci\u00F3n correspondiente, favor de enviar un correo a la siguiente direcci\u00F3n factelectronicasky@sky.com.mx detallando el motivo del mismo, es importante nos indique su n\u00FAmero de cuenta para su atenci\u00F3n y seguimiento.";
                paginaFallo = true;
            } else if (!marketType.equalsIgnoreCase("Intercambio") && !marketType.equalsIgnoreCase("SeÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â±ales Promo")) {
                permiteCBTGVEW = false;
                userRole = "Hotel";
            } else {
                LogPC.printlnWarn(this, "TIPO CUENTA NO CLASIFICADA [" + organizationType + "] [" + marketType + "]");
                userRole = "NA";
                codigoError = "TCC001";
                mantenimientoHijump =
                    "Para cualquier solicitud de servicio favor de marcar al 51690000 o contactar al coordinador de su Intercambio en el Corporativo de su empresa. ";
                paginaFallo = true;
            }
        } else {
            permiteCBTGVEW = false;
            userRole = "NA";
            codigoError = "TCC001";
            paginaFallo = true;
            LogPC.printlnWarn(this, "TIPO CUENTA NO CLASIFICADA [" + organizationType + "] [" + marketType + "]");
        }

        this.tipoCuentaBanner = userRole.toUpperCase();
        if (tipoCuentaBanner.equals("VETV")) {
            this.suscriptor.setPaqueteBanner("VETV");
        } else if (tipoCuentaBanner.equals("MODULAR")) {
            this.suscriptor.setPaqueteBanner("MODULAR");
        } else {
            this.suscriptor.setPaqueteBanner(suscriptor.getPaquete());
        }
    }

    private boolean validarPermisoPromesaPago() {
        boolean respuesta = false;
        ServicioPromesaPago spp = new ServicioPromesaPago();
        respuesta = spp.consultarPermiso(this.suscriptor.getCuentaSKY());
        return respuesta;
    }

    private boolean isUserInRole(String roleTmp) {
        if (userRole != null && userRole.equalsIgnoreCase(roleTmp)) {
            return true;
        }
        return false;
    }

    public boolean isUserBar() {
        return isUserInRole("Bar_Restaurant");
    }

    public boolean isUserSKY() {
        return isUserInRole("SKY");
    }

    public boolean isUserVeTV() {
        return isUserInRole("VeTV") || isPaqueteSkySports();
    }

    public boolean isUserMini() {
        return isUserInRole("MINI");
    }

    public boolean isCuentaVetv() {
        return suscriptor.getMarketType().equalsIgnoreCase("Normal VeTV");
    }

    public boolean isCuentavetvPlus() {
        return suscriptor.getMarketType().equalsIgnoreCase("Normal VeTV PLUS");
    }

    public boolean isCuentaTextosTyA() {
        boolean respuesta = false;
        if ((paquete.contains("BASICO") || paquete.contains("FUN") || paquete.contains("FOX+") ||
             paquete.contains("HBO") || paquete.contains("UNIVERSE") || paquete.contains("BLACK") ||
             paquete.contains("FOX+") || paquete.contains("HBO MAX") || paquete.contains("PLATINUM")) &&
            pais.equalsIgnoreCase("MEX") && !isUserBar()) {
            respuesta = true;
        } else {
            respuesta = false;
        }
        return respuesta;
    }
    /*
        public boolean hasTIBlocked(){
            return equiposBloqueados > 0? true:false;
        }
        */
    public boolean isUserHotel() {
        return isUserInRole("Hotel");
    }

    public boolean isUserModular() {
        return isUserInRole("modular");
    }

    public boolean isUserComercial() {
        return suscriptor.getOrganizationType().equalsIgnoreCase("Comercial");
    }

    public boolean isUserResidencia() {
        return suscriptor.getOrganizationType().equalsIgnoreCase("Direct To Home");
    }

    public boolean isUserCrecimientoequipo() {
        return isUserComercial() || isUserResidencia();
    }

    public String getPaisISO() {
        String paisISO = "";
        if (pais == null) {
            return "";
        } else if (pais.equalsIgnoreCase("MEX")) {
            paisISO = "MX";
        } else if (pais.equalsIgnoreCase("CRICA")) {
            paisISO = "CR";
        } else if (pais.equalsIgnoreCase("GT")) {
            paisISO = "GT";
        } else if (pais.equalsIgnoreCase("HON")) {
            paisISO = "HN";
        } else if (pais.equalsIgnoreCase("NIC")) {
            paisISO = "NI";
        } else if (pais.equalsIgnoreCase("PAN")) {
            paisISO = "PA";
        } else if (pais.equalsIgnoreCase("DOM")) {
            paisISO = "DO";
        } else if (pais.equalsIgnoreCase("SAL")) {
            paisISO = "SV";
        }
        return paisISO;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        LogPC.println(this, "Serializando Sesion: " + suscriptor);
        LogPC.println(this, "Serializando Sesion: " + usuario);
        LogPC.println(this, "Serializando Sesion: " + userRole);
    }

    private void readObject(ObjectInputStream in) throws IOException {
        try {
            in.defaultReadObject();
        } catch (ClassNotFoundException e) {
            LogPC.printlnError(this, "Exception error", e);
            e.printStackTrace();
        }
        LogPC.println(this, "DeSerializando Sesion :" + suscriptor);
        LogPC.println(this, "DeSerializando Sesion: " + usuario);
        LogPC.println(this, "DeSerializando Sesion: " + userRole);
    }

    public boolean isCuentaAltan() {
        return (this.suscriptor != null && this.suscriptor.getProveedorServicioInternet() != null &&
                this.suscriptor
                                                                                                         .getProveedorServicioInternet()
                                                                                                         .equalsIgnoreCase("ALTAN"));
    }

    public void setCuentaActiva(boolean cuentaActiva) {
        this.cuentaActiva = cuentaActiva;
    }

    public boolean isCuentaActiva() {
        return cuentaActiva;
    }

    public boolean isCuentaReactivadaTemp() {
        return statusCuenta.equalsIgnoreCase("Reactivada Temporalmente");
    }

    public boolean isCuentaBloqueoDuro() {
        return statusCuenta.equalsIgnoreCase("Bloqueo Duro");
    }

    public boolean isCuentaBloqueoSuave() {
        return statusCuenta.equalsIgnoreCase("Bloqueo Suave");
    }

    public boolean isCuentaBloqueSistema() {
        return statusCuenta.equalsIgnoreCase("Cancelada por Sistema");
    }

    public boolean iscuentaBloqueSueveDuro() {
        if ((statusCuenta.equalsIgnoreCase("Bloqueo Duro")) || (statusCuenta.equalsIgnoreCase("Bloqueo Suave"))) {
            return true;
        } else {
            return false;
        }
    }

    public void setSuscriptor(Suscriptor suscriptor) {
        this.suscriptor = suscriptor;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setImgNovedades(String imgNovedades) {
        this.imgNovedades = imgNovedades;
    }

    public String getImgNovedades() {
        return imgNovedades;
    }

    public void setMostrarNovedades(boolean mostrarNovedades) {
        this.mostrarNovedades = mostrarNovedades;
    }

    public void setPopIdNovedades(String popIdNovedades) {
        this.popIdNovedades = popIdNovedades;
    }

    public String getPopIdNovedades() {
        if (contadorMostrarNovedades > 1) {
            popIdNovedades = "S";
        }
        return popIdNovedades;
    }

    public boolean isCuentaCV() {
        return (isCorporativo || isVIP);
    }

    public void setNombreFactura(String nombreFactura) {
        this.nombreFactura = nombreFactura;
    }

    public String getNombreFactura() {
        return nombreFactura;
    }

    public void setPaginaFallo(boolean paginaFallo) {
        this.paginaFallo = paginaFallo;
    }

    public boolean isPaginaFallo() {
        return paginaFallo;
    }


    public boolean isB2G() {
        return !(suscriptor.getSkyModemInternet() == null || suscriptor.getSkyModemInternet().isEmpty());
    }

    public void setTipoCuentaBanner(String tipoCuentaBanner) {
        this.tipoCuentaBanner = tipoCuentaBanner;
    }

    public String getTipoCuentaBanner() {
        return tipoCuentaBanner;
    }

    public void setUuidFactura(String uuidFactura) {
        this.uuidFactura = uuidFactura;
    }

    public String getUuidFactura() {
        return uuidFactura;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getSistema() {
        return sistema;
    }

    public void setHiJump(boolean hiJump) {
        this.hiJump = hiJump;
    }

    public boolean isHiJump() {
        return hiJump;
    }

    public void setCodigoRecargaVeTV(String codigoRecargaVeTV) {
        this.codigoRecargaVeTV = codigoRecargaVeTV;
    }

    public String getCodigoRecargaVeTV() {
        return codigoRecargaVeTV;
    }


    public boolean isMostrarNovedades() {
        return mostrarNovedades;
    }

    public String getTriggerTypeNovedades() {
        if (mostrarNovedades) {
            return "load";
        }
        return "default";
    }
    /* Metodo de popup de chat de vetv*/
    public String getLoadChatVeTVRecarga() {
        if (popupChatVeTV) {
            return "load";
        }
        return "default";
    }

    /* Metodo de popup de anuncio de pecios BASICO Combo*/
    public String getLoadPaqueteVeTV() {
        try {
            if (this.getSuscriptor()
                    .getPaquete()
                    .contains("VETV") && isMEX() && popupPremiaVeTV) {
                return "load";
            }
        } catch (Exception e) {
            LogPC.printlnError(this, "Exception error", e);
            paginaFallo = true;
        }
        return "default";
    }

    public String getLoadPaqueteVeTVSinRecarga() {
        try {
            if (this.getSuscriptor()
                    .getPaquete()
                    .contains("VETV") && !this.getSuscriptor()
                                              .getStatusRecarga()
                                              .equalsIgnoreCase("Con Recarga") && isMEX() &&
                popupPremiaVeTVSinRecarga) {
                return "load";
            }
        } catch (Exception e) {
            LogPC.printlnError(this, "Exception error", e);
            paginaFallo = true;
        }
        return "default";
    }

    /*public String getLoadBeneficioComboHbb() {
        try {
            if (this.isCuentaDualPlay() && this.getSuscriptor() != null &&
                this.getSuscriptor().getProveedorServicioInternet() != null && this.getSuscriptor()
                                                                                   .getProveedorServicioInternet()
                                                                                   .equalsIgnoreCase("ALTAN") &&
                this.getSuscriptor().getExternalOffer() != null && this.getSuscriptor()
                                                                       .getExternalOffer()
                                                                       .equalsIgnoreCase("HBB") &&
                popupBeneficioComboHbb) {

                return "load";
            }
        } catch (Exception e) {
            LogPC.printlnError(this, "Exception error", e);
            paginaFallo = true;
        }
        return "default";
    }*/

    public void setContadorMostrarNovedades(int contadorMostrarNovedades) {
        this.contadorMostrarNovedades = contadorMostrarNovedades;
    }

    public int getContadorMostrarNovedades() {
        return contadorMostrarNovedades;
    }

    public void setIsCorporativo(boolean isCorporativo) {
        this.isCorporativo = isCorporativo;
    }

    public boolean isIsCorporativo() {
        return isCorporativo;
    }

    public void setIsVIP(boolean isVIP) {
        this.isVIP = isVIP;
    }

    public boolean isIsVIP() {
        return isVIP;
    }

    public void setSuscriptorBoolean(boolean suscriptorBoolean) {
        this.suscriptorBoolean = suscriptorBoolean;
    }

    public boolean isSuscriptorBoolean() {
        return suscriptorBoolean;
    }

    public void setPromesaPago(boolean promesaPago) {
        this.promesaPago = promesaPago;
    }

    public boolean isPromesaPago() {
        return promesaPago;
    }

    public void setPaquete(String paquete) {
        this.paquete = paquete;
    }

    public String getPaquete() {
        return paquete;
    }

    public boolean isPaqueteUNIVERSE() {
        return paquete.contains("UNIVERSE");
    }

    public boolean isPaqueteSKYHDBLACK() {
        return paquete.contains("BLACK");
    }

    public void setCuentaSKY(String cuentaSKY) {
        this.cuentaSKY = cuentaSKY;
    }

    public String getCuentaSKY() {
        return cuentaSKY;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setOppv(boolean oppv) {
        this.oppv = oppv;
    }

    public boolean isOppv() {
        return oppv;
    }

    public void setIppv(boolean ippv) {
        this.ippv = ippv;
    }

    public boolean isIppv() {
        return ippv;
    }

    public void setDenegaracceso(boolean denegaracceso) {
        this.denegaracceso = denegaracceso;
    }

    public boolean isDenegaracceso() {
        return denegaracceso;
    }

    public void setPermisosAdmin(String permisosAdmin) {
        this.permisosAdmin = permisosAdmin;
    }

    public String getPermisosAdmin() {
        return permisosAdmin;
    }

    public void setStatusRecarga(String statusRecarga) {
        this.statusRecarga = statusRecarga;
    }

    public String getStatusRecarga() {
        return statusRecarga;
    }

    public void setStatusCuenta(String statusCuenta) {
        this.statusCuenta = statusCuenta;
    }

    public String getStatusCuenta() {
        return statusCuenta;
    }

    public void setCorporativo(boolean corporativo) {
        this.corporativo = corporativo;
    }

    public boolean isCorporativo() {
        return corporativo;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public boolean isVip() {
        return vip;
    }


    public void setSaldoRealVeTV(double saldoRealVeTV) {
        this.saldoRealVeTV = saldoRealVeTV;
    }

    public double getSaldoRealVeTV() {
        return saldoRealVeTV;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPermiteOTT(boolean permiteOTT) {
        this.permiteOTT = permiteOTT;
    }

    public boolean isPermiteOTT() {
        return permiteOTT;
    }

    public void setMontoRecargaVeTV(double montoRecargaVeTV) {
        this.montoRecargaVeTV = montoRecargaVeTV;
    }

    public double getMontoRecargaVeTV() {
        return montoRecargaVeTV;
    }

    public void setDataVeTV(DataVeTV dataVeTV) {
        this.dataVeTV = dataVeTV;
    }

    public DataVeTV getDataVeTV() {
        return dataVeTV;
    }

    public void setPermiteCBTGVEW(boolean permiteCBTGVEW) {
        this.permiteCBTGVEW = permiteCBTGVEW;
    }

    public boolean isPermiteCBTGVEW() {
        return permiteCBTGVEW;
    }

    public boolean isMEX() {
        if (suscriptor.getPaisISO().equalsIgnoreCase("MX"))
            return true;
        return false;
    }

    public boolean isCRI() {
        if (suscriptor.getPaisISO().equalsIgnoreCase("CR"))
            return true;
        return false;
    }

    public boolean isGTM() {
        if (suscriptor.getPaisISO().equalsIgnoreCase("GT"))
            return true;
        return false;
    }

    public boolean isHND() {
        if (suscriptor.getPaisISO().equalsIgnoreCase("HN"))
            return true;
        return false;
    }

    public boolean isNIC() {
        if (suscriptor.getPaisISO().equalsIgnoreCase("NI"))
            return true;
        return false;
    }

    public boolean isPAN() {
        if (suscriptor.getPaisISO().equalsIgnoreCase("PA"))
            return true;
        return false;
    }

    public boolean isDOM() {
        if (suscriptor.getPaisISO().equalsIgnoreCase("DO"))
            return true;
        return false;
    }

    public boolean isSLV() {
        if (suscriptor.getPaisISO().equalsIgnoreCase("SV"))
            return true;
        return false;
    }

    public boolean isMasterVideoActivo() {
        return this.suscriptor
                   .getStatusCodeMasterVideo()
                   .equalsIgnoreCase("activo");
    }

    public boolean isCuentaDirectToHome() {
        if ((suscriptor.getOrganizationType().equalsIgnoreCase("Direct To Home")) ||
            (suscriptor.getOrganizationType().equalsIgnoreCase("Bar/Restaurant")) ||
            suscriptor.getOrganizationType().equalsIgnoreCase("Comercial")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isCuentaNewEra() {
               boolean respuesta = false;
               if (suscriptor.getPaquete().contains("BLACK") ||
                   suscriptor.getPaquete().contains("HD FOX+") ||
                   suscriptor.getPaquete().contains("HBO MAX") ||
                   suscriptor.getPaquete().contains("PLATINUM") ||
                   suscriptor.getPaquete().contains("GOLD")) {
                   respuesta = true;
               } else {
                   respuesta = false;
               }
               return respuesta;
           }    
    public boolean isCuentaBtcelSD() {
        boolean respuesta = false;
        if (suscriptor.getPaquete().contains("BASICO") ||
            suscriptor.getPaquete().contains("FUN") ||
            suscriptor.getPaquete().contains("UNIVERSE") ||
            suscriptor.getPaquete().contains("HBO")){
               respuesta = true;
           } else {
               respuesta = false;
           }
           return respuesta;
    }
    public boolean isCuentaVETVHD() {
        boolean respuesta = false;
        if (suscriptor.getMarketType().equalsIgnoreCase("Normal VeTV") && suscriptor.isEquipoHD()) {
            respuesta = true;
        } else {
            respuesta = false;
        }
        return respuesta;
    }

    public boolean isCuentaVETVPLUSHD() {
        boolean respuesta = false;
        if (suscriptor.getMarketType().equalsIgnoreCase("Normal VeTV PLUS") && suscriptor.isEquipoHD()) {
            respuesta = true;
        } else {
            respuesta = false;
        }
        return respuesta;
    }

    public boolean isCuentaMarketTypeEmplStaVip() {
        if (suscriptor.getMarketType().contains("Empleados") || suscriptor.getMarketType().contains("Staff") ||
            suscriptor.getMarketType().contains("VIP")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *Metodos para saber el tipo de paquete de la cuenta en SEL.
     * @return
     */
    public boolean isPaqueteBasico() {
        if (paquete.contains("BASICO")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPaqueteUniverse() {
        if (paquete.contains("UNIVERSE")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPaqueteFun() {
        if (paquete.contains("FUN")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPaqueteMovieCity() {
        if (paquete.contains("MOVIE CITY") || paquete.contains("FOX+") || paquete.contains("FOX+ SD")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPaqueteHBO() {
        if (paquete.contains("HBO") || paquete.contains("HBO MAX SD")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPaqueteSolidaridad() {
        if (paquete.contains("Solidaridad RD") || paquete.contains("Solidaridad RD HD") ||
            paquete.contains("Solidaridad CA")) {
            return true;
        } else {
            return false;
        }
    }
    /*para single
         * valida si es paquete VETV HD*/
    public boolean isPaqueteVetvHD() {
        return paquete.contains("VETV HD");
    }

    public boolean isPaqueteSkySports() {
        //LogPC.println(this, "******* IN isPaqueteSkySports **********");
        boolean isPaqSkySports = false;

        if (paquete != null) {
            isPaqSkySports = paquete.contains("SKY SPORTS");
        }

        return isPaqSkySports;

        //DUMMY
        //return true;
    }

    public void setCodigoError(String codigoError) {
        this.codigoError = codigoError;
    }

    public String getCodigoError() {
        return codigoError;
    }

    public void setFormaPagoActual(EnumFormaPago formaPagoActual) {
        this.formaPagoActual = formaPagoActual;
    }

    public EnumFormaPago getFormaPagoActual() {
        return formaPagoActual;
    }


    public void setIdSesion(String idSesion) {
        this.idSesion = idSesion;
    }

    public String getIdSesion() {
        return idSesion;
    }


    public void setPCMOVIL(String PCMOVIL) {
        this.PCMOVIL = PCMOVIL;
    }

    public String getPCMOVIL() {
        return PCMOVIL;
    }

    public void setCategoriaCAC(String categoriaCAC) {
        this.categoriaCAC = categoriaCAC;
    }

    public String getCategoriaCAC() {
        return categoriaCAC;
    }


    public void setCambioFormaPago(String cambioFormaPago) {
        this.cambioFormaPago = cambioFormaPago;
    }

    public String getCambioFormaPago() {
        return cambioFormaPago;
    }

    public void setMantenimientoHijump(String mantenimientoHijump) {
        this.mantenimientoHijump = mantenimientoHijump;
    }

    public String getMantenimientoHijump() {
        return mantenimientoHijump;
    }

    public String cuentaHotel() {
        String resultado = "";
        if (getSuscriptor().getOrganizationType().equalsIgnoreCase("Hotel")) {
            resultado = "Saldo Actual";
        } else {
            resultado = "Estado Cuenta";
        }
        return resultado;
    }

    public void setContratoTya(boolean contratoTya) {
        this.contratoTya = contratoTya;
    }

    public boolean isContratoTya() {
        boolean respuesta = false;
        if (isUserVeTV()) {
            respuesta = false;
        } else if (isUserHotel()) {
            respuesta = false;
        } else {
            respuesta = true;
        }
        return respuesta;
    }

    public void setContratoVetv(boolean contratoVetv) {
        this.contratoVetv = contratoVetv;
    }

    public boolean isContratoVetv() {
        boolean respuesta = false;
        if (isUserVeTV()) {
            respuesta = true;
        } else if (isUserHotel()) {
            respuesta = false;
        } else {
            respuesta = false;
        }
        return respuesta;
    }

    public void setAdendum(boolean adendum) {
        this.adendum = adendum;
    }

    public boolean isAdendum() {
        boolean respuesta = false;
        if (isUserVeTV()) {
            respuesta = false;
        } else if (isUserHotel()) {
            respuesta = false;
        } else {
            respuesta = true;
        }
        return respuesta;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanalChat(String canalChat) {
        this.canalChat = canalChat;
    }

    public String getCanalChat() {
        return canalChat;
    }

    public void setCanalChatEncriptado(String canalChatEncriptado) {
        this.canalChatEncriptado = canalChatEncriptado;
    }

    public String getCanalChatEncriptado() {
        return canalChatEncriptado;
    }

    public void setMailTo(String mailTo) {
        this.mailTo = mailTo;
    }

    public String getMailTo() {
        mailTo =
            "mailto:atencion.sucriptores@sky.com.mx?subject=Tu%20opini\u00F3n%20nos interesa&body=Escribe%20tus%20aportaciones";
        return mailTo;
    }

    public void setContadorEquiposActivos(int contadorEquiposActivos) {
        this.contadorEquiposActivos = contadorEquiposActivos;
    }

    public int getContadorEquiposActivos() {
        return contadorEquiposActivos;
    }

    public void setCuentaHijump(boolean cuentaHijump) {
        this.cuentaHijump = cuentaHijump;
    }

    public boolean isCuentaHijump() {
        return cuentaHijump;
    }

    public UsuarioRegistro obtenerMiCuenta(String uuId) {
        UsuarioRegistro usuario = new UsuarioRegistro();
        List<UsuarioRegistro> usuarios = new ArrayList<UsuarioRegistro>();
        ServicioUsuario su = new ServicioUsuario();
        try {
            usuarios = su.obtenerCuentas(uuId);
            if (usuarios != null && usuarios.size() > 0) {
                usuario = usuarios.get(0);
            }
        } catch (Exception e) {
            LogPC.printlnError(this, "Exception error", e);
            LogPC.println(this, e);
        }
        return usuario;
    }

    public String getURLChatRecarga() {
        String respuesta = "";
        GeneraChatRNOutputABM ligaChat = null;
        ServicioChat chat = new ServicioChat();
        ligaChat = chat.consultaURLChat(this.usuario.getCuentaSKY(), this.usuario.getMail());
        if (ligaChat.getCabeceraOutput()
                    .getCodigo()
                    .equalsIgnoreCase("0")) {
            respuesta = ligaChat.getGeneraChatRNOutput().getURLRN();
            registrarOperacion(EnumOperacionBAM.CONSULTA_CHAT.toString());
        } else {
            respuesta = "";
        }
        return respuesta;
    }

    public String getURLChatTemplate() {
        String urlChat = "";
        GeneraChatRNOutputABM ligaChat = null;
        ServicioChat chat = new ServicioChat();

        ligaChat = chat.consultaURLChat(this.usuario.getCuentaSKY(), this.usuario.getMail());
        if (ligaChat.getCabeceraOutput()
                    .getCodigo()
                    .equalsIgnoreCase("0")) {
            urlChat = ligaChat.getGeneraChatRNOutput().getURLRN();
            registrarOperacion(EnumOperacionBAM.CONSULTA_CHAT.toString());
        } else {
            urlChat = "";
        }
        return urlChat;
    }
    // codigo para encriptado de portal de actualizaciÃƒÆ’Ã‚Â³n de datos
    private static final byte[] SALT = {
        (byte) 0x21, (byte) 0x21, (byte) 0xF0, (byte) 0x55, (byte) 0xC3, (byte) 0x9F, (byte) 0x5A, (byte) 0x75
    };

    private final static int ITERATION_COUNT = 31;

    public static String encode(String input) {
        if (input == null) {
            throw new IllegalArgumentException();
        }
        try {

            KeySpec keySpec = new PBEKeySpec(null, SALT, ITERATION_COUNT);
            AlgorithmParameterSpec paramSpec = new PBEParameterSpec(SALT, ITERATION_COUNT);

            SecretKey key = SecretKeyFactory.getInstance("PBEWithMD5AndDES").generateSecret(keySpec);

            Cipher ecipher = Cipher.getInstance(key.getAlgorithm());
            ecipher.init(Cipher.ENCRYPT_MODE, key, paramSpec);

            byte[] enc = ecipher.doFinal(input.getBytes());

            String res = new String(Base64.encodeBase64(enc));
            // escapes for url
            res = res.replace('+', '-')
                     .replace('/', '_')
                     .replace("%", "%25")
                     .replace("\n", "%0A");

            return res;

        } catch (Exception e) {
            LogPC.printlnError(e);
            e.printStackTrace();
        }

        return "";

    }

    public void setCuentaDualPlay(boolean cuentaDualPlay) {
        this.cuentaDualPlay = cuentaDualPlay;
    }

    public boolean isCuentaDualPlay() {
        return cuentaDualPlay;
    }

    public void setPopupChatVeTV(boolean popupChatVeTV) {
        this.popupChatVeTV = popupChatVeTV;
    }

    public boolean isPopupChatVeTV() {
        return popupChatVeTV;
    }

    public void setUrlChat(String urlChat) {
        this.urlChat = urlChat;
    }

    public String getUrlChat() {
        return urlChat;
    }

    public void setUrlChatTemplate(String urlChatTemplate) {
        this.urlChatTemplate = urlChatTemplate;
    }

    public String getUrlChatTemplate() {
        if (this.urlChatTemplate == null || this.urlChatTemplate.isEmpty()) {
            return this.getURLChatTemplate();
        } else {
            return this.urlChatTemplate;
        }
    }
    
    public String getUrlWhatsApp() {
        String urlWA = "";
        LogPC.println(this, "IN getUrlWhatsApp...");
        LogPC.println(this, "Pais del suscriptor: " + this.pais);
        
        if( this.pais != null ) {
            if( this.pais.equalsIgnoreCase("MEX") ) {
                urlWA = "https://wa.me/message/SQVAGHVTZVLGE1";
            } else if( this.pais.equalsIgnoreCase("DOM") ) {
                urlWA = "https://wa.me/message/FMUG3KZMBIWCG1";
            }
        }
        
        LogPC.println(this, "URL whatsApp icono: " + urlWA);
        
        return urlWA;
    }

    public void abrirContactoChat(ClientEvent clientEvent) {
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.ABRIR_CONTACTO_CHAT);
    }

    public void setContratadoBTGVE(boolean contratadoBTGVE) {
        this.contratadoBTGVE = contratadoBTGVE;
    }

    public boolean isContratadoBTGVE() {
        ServicioUsuario su = new ServicioUsuario();
        Usuario user = null;
        String uid = this.usuario.getUid();
        String cuentaSKY = this.usuario.getCuentaSKY();
        user = su.consultaAtributosUsuario(uid, cuentaSKY);
        if (user.getStatus_btg().contains("C_BTG")) {
            contratadoBTGVE = true;
        } else {
            contratadoBTGVE = false;
        }
        return contratadoBTGVE;
    }
    //--------------------------
    public boolean isPopupPremiaVeTVMostrar() {
        String respuesta = getLoadPaqueteVeTV();
        if (respuesta.equalsIgnoreCase("load")) {
            premiaVeTVMostrar = true;
        } else {
            premiaVeTVMostrar = false;
        }
        return premiaVeTVMostrar;
    }

    public boolean isPopupPremiaVeTVMostrarSinRecarga() {
        String respuesta = getLoadPaqueteVeTVSinRecarga();
        if (respuesta.equalsIgnoreCase("load")) {
            premiaVeTVMostrarSinRecarga = true;
        } else {
            premiaVeTVMostrarSinRecarga = false;
        }
        return premiaVeTVMostrarSinRecarga;
    }

    public void setPopupPremiaVeTV(boolean popupPremiaVeTV) {
        this.popupPremiaVeTV = popupPremiaVeTV;
    }

    public boolean isPopupPremiaVeTV() {
        return popupPremiaVeTV;
    }

    public void setPremiaVeTVMostrar(boolean premiaVeTVMostrar) {
        this.premiaVeTVMostrar = premiaVeTVMostrar;
    }

    public boolean isPremiaVeTVMostrar() {
        return premiaVeTVMostrar;
    }

    public void setPopupPremiaVeTVSinRecarga(boolean popupPremiaVeTVSinRecarga) {
        this.popupPremiaVeTVSinRecarga = popupPremiaVeTVSinRecarga;
    }

    public boolean isPopupPremiaVeTVSinRecarga() {
        return popupPremiaVeTVSinRecarga;
    }

    public void setPremiaVeTVMostrarSinRecarga(boolean premiaVeTVMostrarSinRecarga) {
        this.premiaVeTVMostrarSinRecarga = premiaVeTVMostrarSinRecarga;
    }

    public boolean isPremiaVeTVMostrarSinRecarga() {
        return premiaVeTVMostrarSinRecarga;
    }

    /*public void setPopupBeneficioComboHbb(boolean popupBeneficioComboHbb) {
        this.popupBeneficioComboHbb = popupBeneficioComboHbb;
    }

    public boolean isPopupBeneficioComboHbb() {
        return popupBeneficioComboHbb;
    }

    public void setPopupBeneficioComboHbbMostrar(boolean popupBeneficioComboHbbMostrar) {
        this.popupBeneficioComboHbbMostrar = popupBeneficioComboHbbMostrar;
    }

    public boolean isPopupBeneficioComboHbbMostrar() {
        String respuesta = getLoadBeneficioComboHbb();
        if (respuesta.equalsIgnoreCase("load")) {
            popupBeneficioComboHbbMostrar = true;
        } else {
            popupBeneficioComboHbbMostrar = false;
        }
        return popupBeneficioComboHbbMostrar;
    }

    public boolean islistenerComboHbbMostrar() {
        return popupBeneficioComboHbbMostrar;
    }*/

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }
}
