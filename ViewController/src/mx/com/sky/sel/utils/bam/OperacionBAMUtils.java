package mx.com.sky.sel.utils.bam;

import java.io.Serializable;

import mx.com.sky.sel.services.beans.bam.OperacionBAM;
import mx.com.sky.sel.services.beans.utils.Suscriptor;
import mx.com.sky.sel.beans.utils.Usuario;
import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.services.bam.operaciones.insert.ServicioOperacionesBAM;

public class OperacionBAMUtils implements Serializable {
    @SuppressWarnings("compatibility:4168148310858296222")
    private static final long serialVersionUID = 2897826133422048347L;

    public OperacionBAMUtils() {
        super();
    }

    public static void registrarOperacion(OperacionBAM operacionBAM) {
        ServicioOperacionesBAM servicioBAM = new ServicioOperacionesBAM();
        LogServicios.println("OperacionBAMUtils", "REGISTRO ServicioOperacionesBAM  " + operacionBAM);
        servicioBAM.insertOperacion(operacionBAM);
    }

    public static void registrarOperacion(EnumOperacionBAM enumOperacionBAM) {
        registrarOperacion(enumOperacionBAM, "");
    }

    public static void registrarOperacion(EnumOperacionBAM enumOperacionBAM, String descripcion) {
        ThreadOperacionBAM hiloOperacionBAM = new ThreadOperacionBAM();
        OperacionBAM operacionBAM = new OperacionBAM();

        try {
            ConfigMenu sesion = (ConfigMenu) JSFUtils.getBean("sesion");
            Usuario usuario = sesion.getUsuario();
            Suscriptor suscriptor = sesion.getSuscriptor();
            operacionBAM.setDescripcion(descripcion);
            operacionBAM.setCuentaSky(sesion.getSuscriptor().getCuentaSKY());
            operacionBAM.setEmail(usuario.getMail());
            operacionBAM.setEstatusCuenta(suscriptor.getStatusCuenta());
            operacionBAM.setIdSesion(sesion.getIdSesion());
            operacionBAM.setMarkettype(suscriptor.getMarketType());
            operacionBAM.setOperacion(enumOperacionBAM.toString());
            operacionBAM.setOrganizationtype(suscriptor.getOrganizationType());
            operacionBAM.setPais(sesion.getPaisISO());
            operacionBAM.setPaquete(suscriptor.getPaquete());
            operacionBAM.setPcmovil(sesion.getPCMOVIL());
            operacionBAM.setTipoCuenta(usuario.getTipoUsuario());
            operacionBAM.setUserid(usuario.getUid());
            operacionBAM.setUsername(usuario.getNombreUsuario());
            hiloOperacionBAM.setOperacionBAM(operacionBAM);
            hiloOperacionBAM.start();
            LogServicios.println("OperacionBAMUtils", "Registro de Operacion " + enumOperacionBAM);
        } catch (Exception e) {
            LogServicios.printlnWarn("OperacionBAMUtils", "NO SE REGISTRO OPERACION " + enumOperacionBAM);
        }
    }
    }
