package mx.com.sky.sel.services.formapago;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

import mx.com.sky.sel.services.beans.formapago.CambioFormaPago;
import mx.com.sky.sel.services.beans.formapago.MensajeRespuestaProxy;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.AltaSolicitudDeServicioWeb;
import mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.types.AltaSolicitudDeServicioWebProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.types.AltaSolicitudDeServicioWebProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.AltaSolicitudDeServicioWeb_Service;
import mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.types.Solicitud;

import sun.misc.BASE64Encoder;


public class ServicioCambioFormaPago implements Serializable {
    @SuppressWarnings("compatibility:3909143927197874645")
    private static final long serialVersionUID = -6778608170639286814L;


    public ServicioCambioFormaPago() {
        super();
    }
    public MensajeRespuestaProxy consultaBeneficio(String cuenta, String sistema, String paqueteActual, String pais){
            MensajeRespuestaProxy respuesta = new MensajeRespuestaProxy();
            AltaSolicitudDeServicioWeb_Service altaSolicitudDeServicioWeb_Service = new AltaSolicitudDeServicioWeb_Service();
            AltaSolicitudDeServicioWebProcessRequest request = new AltaSolicitudDeServicioWebProcessRequest();
            AltaSolicitudDeServicioWebProcessResponse response = new AltaSolicitudDeServicioWebProcessResponse();
            Solicitud solicitud = new Solicitud();
            mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.types.CambioFormaPago formaPago = new mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.types.CambioFormaPago();
            AltaSolicitudDeServicioWeb altaSolicitudDeServicioWeb = altaSolicitudDeServicioWeb_Service.getAltaSolicitudDeServicioWeb();
            solicitud.setCuenta(cuenta);
            solicitud.setSistema(sistema);
            solicitud.setArea("Consulta beneficios");
            solicitud.setSubArea("Consulta beneficios");
            formaPago.setPaqueteActual(paqueteActual);
            solicitud.setCambioFormaPago(formaPago);
            solicitud.setPais(pais);
            request.setSolicitudDeServicio(solicitud);
             response = altaSolicitudDeServicioWeb.process(request);
            respuesta.setErrorCode(response.getResultado());
            respuesta.setErrorMessage(response.getResultadodesc());
            respuesta.setBeneficioMessage(response.getNumeroSolicitud());
            return respuesta;
        }
    public MensajeRespuestaProxy noAceptaCambioNiBeneficio(String cuenta, String productName, String sistema, String pais){
            MensajeRespuestaProxy respuesta = new MensajeRespuestaProxy();
            AltaSolicitudDeServicioWeb_Service altaSolicitudDeServicioWeb_Service = new AltaSolicitudDeServicioWeb_Service();
            AltaSolicitudDeServicioWebProcessRequest request = new AltaSolicitudDeServicioWebProcessRequest();
            AltaSolicitudDeServicioWebProcessResponse response = new AltaSolicitudDeServicioWebProcessResponse();
            Solicitud solicitud = new Solicitud();
            mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.types.CambioFormaPago formaPago = new mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.types.CambioFormaPago();
            AltaSolicitudDeServicioWeb altaSolicitudDeServicioWeb = altaSolicitudDeServicioWeb_Service.getAltaSolicitudDeServicioWeb();
            solicitud.setCuenta(cuenta);
            solicitud.setSistema(sistema);
            solicitud.setArea("No acepta beneficios");
            solicitud.setSubArea("No acepta beneficios");
            formaPago.setNombreProducto(productName);
            solicitud.setCambioFormaPago(formaPago);
            solicitud.setPais(pais);
            request.setSolicitudDeServicio(solicitud);
            response = altaSolicitudDeServicioWeb.process(request);
            respuesta.setErrorCode(response.getResultado());
            respuesta.setErrorMessage(response.getResultadodesc());
            return respuesta;
        }
    
    public MensajeRespuestaProxy procesaCambioFormaPago(CambioFormaPago cambioFormaPago) throws ServicioException {
            MensajeRespuestaProxy respuesta = new MensajeRespuestaProxy();
            mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.types.CambioFormaPago formaPago = new  mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.types.CambioFormaPago();
            AltaSolicitudDeServicioWeb_Service altaSolicitudDeServicioWeb_Service;
            AltaSolicitudDeServicioWebProcessRequest request;
            AltaSolicitudDeServicioWebProcessResponse response = new AltaSolicitudDeServicioWebProcessResponse();
            Solicitud solicitud;
            String cuenta;
            String area;
            String subArea;
            String descripcion;
            String tipoTarjeta;
            String mes;
            String anio;
            String numeroTarjeta;
            String nombreTarjetabiente;
            String contactoRowId;
            try {
            cuenta = cambioFormaPago.getCuenta();
            area= cambioFormaPago.getArea();
            subArea = cambioFormaPago.getSubArea();
            descripcion= cambioFormaPago.getDescripcion();
            tipoTarjeta = cambioFormaPago.getTipoTarjeta();
            mes = cambioFormaPago.getMes();
            anio = cambioFormaPago.getAnio();
            numeroTarjeta = cambioFormaPago.getNumeroTarjeta();
            nombreTarjetabiente= cambioFormaPago.getNombreTarjetabiente();
            contactoRowId = cambioFormaPago.getContactoRowId();
            
            if (cuenta == null || cuenta.isEmpty()) {
                throw new ServicioException("Ocurri\u00F3 algo inesperado, por favor cierre su sesi\u00F3n e intente m\u00E1s tarde.");
            }    
                if (area == null || area.isEmpty()) {
                throw new ServicioException("Ocurri\u00F3 algo inesperado, por favor cierre su sesi\u00F3n e intente m\u00E1s tarde.");
            }
                if (subArea == null || subArea.isEmpty()) {
                throw new ServicioException("Ocurri\u00F3 algo inesperado, por favor cierre su sesi\u00F3n e intente m\u00E1s tarde.");
            }
                if (descripcion == null || descripcion.isEmpty()) {
                throw new ServicioException("Ocurri\u00F3 algo inesperado, por favor cierre su sesi\u00F3n e intente m\u00E1s tarde.");
            }
                if (tipoTarjeta == null || tipoTarjeta.isEmpty()) {
                throw new ServicioException("Ocurri\u00F3 algo inesperado, por favor cierre su sesi\u00F3n e intente m\u00E1s tarde.");
            }
                if (mes == null || mes.isEmpty()) {
                throw new ServicioException("Ocurri\u00F3 algo inesperado, por favor cierre su sesi\u00F3n e intente m\u00E1s tarde.");
            }
                if (anio == null || anio.isEmpty()) {
                throw new ServicioException("Ocurri\u00F3 algo inesperado, por favor cierre su sesi\u00F3n e intente m\u00E1s tarde.");
            }
                if (numeroTarjeta == null || numeroTarjeta.isEmpty()) {
                throw new ServicioException("Ocurri\u00F3 algo inesperado, por favor cierre su sesi\u00F3n e intente m\u00E1s tarde.");
            }
                if (nombreTarjetabiente == null || nombreTarjetabiente.isEmpty()) {
                throw new ServicioException("Ocurri\u00F3 algo inesperado, por favor cierre su sesi\u00F3n e intente m\u00E1s tarde.");
            }
                if (contactoRowId == null || contactoRowId.isEmpty()) {
                throw new ServicioException("Ocurri\u00F3 algo inesperado, por favor cierre su sesi\u00F3n e intente m\u00E1s tarde.");
            }
                altaSolicitudDeServicioWeb_Service = new AltaSolicitudDeServicioWeb_Service();
                AltaSolicitudDeServicioWeb altaSolicitudDeServicioWeb = altaSolicitudDeServicioWeb_Service.getAltaSolicitudDeServicioWeb();
                request = new AltaSolicitudDeServicioWebProcessRequest();
                solicitud = new Solicitud();
                solicitud.setCuenta(cuenta);
                solicitud.setArea(area);
                solicitud.setSubArea(subArea);
                solicitud.setDescripcion(descripcion);
                solicitud.setContactoRowId(contactoRowId);
                solicitud.setSistema(cambioFormaPago.getSistema());
                solicitud.setTarjetaInteligente(cambioFormaPago.getTarjetaInteligente());
                solicitud.setMailConfirmacion(cambioFormaPago.getCorreoElectronico());
                solicitud.setPais(cambioFormaPago.getPais());
                solicitud.setTipoCuenta(cambioFormaPago.getTipoCuenta());
                solicitud.setNombreSuscriptor(cambioFormaPago.getNombreTarjetabiente());
                
                //formaPago.setNumeroTarjeta(encriptar(cambioFormaPago.getNumeroTarjeta()));
                formaPago.setNumeroTarjeta(cambioFormaPago.getNumeroTarjeta());
                formaPago.setNombreTarjetabiente(cambioFormaPago.getNombreTarjetabiente());
                formaPago.setTipoTarjeta(cambioFormaPago.getTipoTarjeta());
                formaPago.setFechaExpiracion(cambioFormaPago.getMes().concat("/").concat(cambioFormaPago.getAnio()));
                formaPago.setAceptaBeneficio(cambioFormaPago.getAceptaBeneficio());
                formaPago.setPaqueteActual(cambioFormaPago.getPaqueteActualAccount());
                formaPago.setNombreProducto(cambioFormaPago.getProductName());
                
                solicitud.setCambioFormaPago(formaPago);
                request.setSolicitudDeServicio(solicitud);
                response = altaSolicitudDeServicioWeb.process(request);
                respuesta.setErrorCode(response.getResultado());
                respuesta.setErrorMessage(response.getResultadodesc());
                
            } catch (ServicioException e) {
                LogServicios.printlnError(e);
                throw e;
            } catch (Exception e) {
                LogServicios.printlnError(e);
                throw new ServicioException("Ocurri\u00F3 algo inesperado, por favor intente m\u00E1s tarde");
            }
        return respuesta;
        }
    public static String encriptar(String parametro) {
            DESKeySpec keySpec = null;
            SecretKeyFactory keyFactory = null;
            SecretKey key = null;
            String encrypedPwd = "";
            try {
                keySpec = new DESKeySpec("SELFormaPago".getBytes("UTF8"));
                keyFactory = SecretKeyFactory.getInstance("DES");
                key = keyFactory.generateSecret(keySpec);
                sun.misc.BASE64Encoder base64encoder = new BASE64Encoder();

                //ENCRIPTAR
                byte[] cleartext = parametro.getBytes("UTF8");
                Cipher cifrado = Cipher.getInstance("DES");
                cifrado.init(Cipher.ENCRYPT_MODE, key);
                encrypedPwd = base64encoder.encode(cifrado.doFinal(cleartext));
            } catch (InvalidKeyException e) {
                System.out.println(e);
            } catch (UnsupportedEncodingException e) {
                System.out.println(e);
            } catch (NoSuchAlgorithmException e) {
                System.out.println(e);
            } catch (InvalidKeySpecException e) {
                System.out.println(e);
            } catch (NoSuchPaddingException e) {
                System.out.println(e);
            } catch (IllegalBlockSizeException e) {
                System.out.println(e);
            } catch (BadPaddingException e) {
                System.out.println(e);
            }
            return encrypedPwd;
        }
}
