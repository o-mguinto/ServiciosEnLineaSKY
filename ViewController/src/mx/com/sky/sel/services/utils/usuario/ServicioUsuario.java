package mx.com.sky.sel.services.utils.usuario;

import com.oracle.xmlns.pcbpel.adapter.db.dbvalidarpreregistrosel.DbValidarPreRegistroSelInput;
import com.oracle.xmlns.pwoperaciones.pwconfiggenerales.bpelpwconfiggenerales.CabeceraEntrada;
import com.oracle.xmlns.pwoperaciones.pwconfiggenerales.bpelpwconfiggenerales.Entrada;
import com.oracle.xmlns.pwoperaciones.pwconfiggenerales.bpelpwconfiggenerales.EntradaSelectConfigGenerales;

import java.io.Serializable;

import java.security.cert.X509Certificate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import javax.xml.ws.Holder;

import mx.com.sky.enterpriseflowmessage.sel.crearregistro.CrearRegistroSelInputMessageType;
import mx.com.sky.enterpriseflowmessage.sel.crearregistro.CrearRegistroSelRequestType;
import mx.com.sky.enterpriseflowmessage.sel.crearregistro.CrearRegistroSelResponseType;
import mx.com.sky.enterpriseflowmessage.sel.modificarpasswordregistro.ModificarPasswordRegistroInputMessageType;
import mx.com.sky.enterpriseflowmessage.sel.modificarpasswordregistro.ModificarPasswordRegistroRequestEBMType;
import mx.com.sky.enterpriseflowmessage.sel.modificarpasswordregistro.ModificarPasswordRegistroResponseEBMType;
import mx.com.sky.enterpriseflowmessage.sel.preregistrosel.PreRegistroSelInputMessageType;
import mx.com.sky.enterpriseflowmessage.sel.preregistrosel.PreRegistroSelRequestEBMType;
import mx.com.sky.enterpriseflowmessage.sel.preregistrosel.PreRegistroSelResponseEBMType;
import mx.com.sky.enterpriseflowmessage.sel.reenviaremailpreregsel.ReEnviarEmailPreRegSelInputMessageType;
import mx.com.sky.enterpriseflowmessage.sel.reenviaremailpreregsel.ReEnviarEmailPreRegSelRequestEBMType;
import mx.com.sky.enterpriseflowmessage.sel.reenviaremailpreregsel.ReEnviarEmailPreRegSelResponseEBMType;
import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;
import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderResponseType;
import mx.com.sky.enterpriseobjects.sel.validarpreregistroselinterface.ValidarPreRegistroSelEBMType;
import mx.com.sky.enterpriseobjects.sel.validarpreregistroselinterface.ValidarPreRegistroSelResponseEBMType;
import mx.com.sky.enterpriseobjects.siebel.obtenerctaskyinterface.ObtenerCtaSkyRequestEBMType;
import mx.com.sky.enterpriseobjects.siebel.obtenerctaskyinterface.ObtenerCtaSkyResponseEBMType;
import mx.com.sky.sel.beans.utils.Usuario;
import mx.com.sky.sel.beans.utils.usuario.UsuarioRegistro;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.proxyclients.pagweb.actualizadatosusuario.BPELActualizaDatosUsuario;
import mx.com.sky.sel.proxyclients.pagweb.actualizadatosusuario.BpelactualizadatosusuarioClientEp;
import mx.com.sky.sel.proxyclients.pagweb.actualizadatosusuario.types.ActualizaDatosUsuarioRequest;
import mx.com.sky.sel.proxyclients.pagweb.actualizadatosusuario.types.ActualizaDatosUsuarioResponse;
import mx.com.sky.sel.proxyclients.pagweb.autenticarcambiocontrasena.ClientEpEp;
import mx.com.sky.sel.proxyclients.pagweb.autenticarcambiocontrasena.SELAutenticarCambioContrasena;
import mx.com.sky.sel.proxyclients.pagweb.autenticarcambiocontrasena.types.Proceso;
import mx.com.sky.sel.proxyclients.pagweb.autenticarcambiocontrasena.types.RespuestaProceso;
import mx.com.sky.sel.proxyclients.pagweb.consultaldap.ConsultaLDAP;
import mx.com.sky.sel.proxyclients.pagweb.consultaldap.ConsultaLDAP_Service;
import mx.com.sky.sel.proxyclients.pagweb.consultaldap.types.ConsultaLDAPProcessRequest;
import mx.com.sky.sel.proxyclients.pagweb.consultaldap.types.ConsultaLDAPProcessResponse;
import mx.com.sky.sel.proxyclients.pagweb.passwordreset.PasswordReset;
import mx.com.sky.sel.proxyclients.pagweb.passwordreset.PasswordReset_Service;
import mx.com.sky.sel.proxyclients.pagweb.passwordreset.types.PasswordResetProcessRequest;
import mx.com.sky.sel.proxyclients.pagweb.passwordreset.types.PasswordResetProcessResponse;
import mx.com.sky.sel.proxyclients.pagweb.preactualizadatosusuario.BPELPreActualizaDatosUsuario;
import mx.com.sky.sel.proxyclients.pagweb.preactualizadatosusuario.BpelpreactualizadatosusuarioClientEp;
import mx.com.sky.sel.proxyclients.pagweb.preactualizadatosusuario.types.PreActualizaDatoRequest;
import mx.com.sky.sel.proxyclients.pagweb.preactualizadatosusuario.types.PreActualizaDatosUsuarioResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaactdatosusuario.ConsultaActualizaDatosUsuario;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaactdatosusuario.ConsultaactualizadatosusuarioClientEp;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaactdatosusuario.types.ConsultaADUInType;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaactdatosusuario.types.ConsultaADUOutType;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultactaespecial.ConsultaCuentaEspecial;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultactaespecial.ConsultaCuentaEspecial_Service;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultactaespecial.types.ConsultaCuentaEspecialProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultactaespecial.types.ConsultaCuentaEspecialProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultausers.ConsultaUsers;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultausers.ConsultaUsers_Service;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultausers.types.ConsultaUsersProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultausers.types.ConsultaUsersProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.primerlogin.BPELUpdatePrimerLogin;
import mx.com.sky.sel.proxyclients.pagwebconsultas.primerlogin.PrimerloginClientEp;
import mx.com.sky.sel.proxyclients.pagwebregistro.registracorplink.RegistraCorporativoLink;
import mx.com.sky.sel.proxyclients.pagwebregistro.registracorplink.RegistraCorporativoLinkEp;
import mx.com.sky.sel.proxyclients.pagwebregistro.registracorplink.types.RegistroCorporativoLinkRequest;
import mx.com.sky.sel.proxyclients.pagwebregistro.registracorplink.types.RegistroCorporativoLinkResponse;
import mx.com.sky.sel.proxyclients.pagwebregistro.registrousuariolink.RegistroUsuarioLink;
import mx.com.sky.sel.proxyclients.pagwebregistro.registrousuariolink.RegistroUsuarioLink_Service;
import mx.com.sky.sel.proxyclients.pagwebregistro.registrousuariolink.types.RegistroUsuarioLinkProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebregistro.registrousuariolink.types.RegistroUsuarioLinkProcessResponse;
import mx.com.sky.sel.proxyclients.pwoperaciones.bpelpwconfiggenerales.BPELPWConfigGenerales;
import mx.com.sky.sel.proxyclients.pwoperaciones.bpelpwconfiggenerales.BpelpwconfiggeneralesClientEp;
import mx.com.sky.sel.proxyclients.selebf.crearregistro.CrearRegistroSelEBF;
import mx.com.sky.sel.proxyclients.selebf.crearregistro.CrearRegistroSelEBFEp;
import mx.com.sky.sel.proxyclients.selebf.modificarpasswordregistro.ModificarPasswordRegistroSelEBF;
import mx.com.sky.sel.proxyclients.selebf.modificarpasswordregistro.ModificarPasswordRegistroSelEBFEp;
import mx.com.sky.sel.proxyclients.selebf.preregistro.PreRegistroSelEBF;
import mx.com.sky.sel.proxyclients.selebf.preregistro.PreRegistroSelEBFEp;
import mx.com.sky.sel.proxyclients.selebf.recuperarpasswordusr.RecuperarPasswordUsrSelEBF;
import mx.com.sky.sel.proxyclients.selebf.recuperarpasswordusr.RecuperarPasswordUsrSelEBFEp;
import mx.com.sky.sel.proxyclients.selebf.reenviaremailprereg.ReEnviarEmailPreRegSelEBF;
import mx.com.sky.sel.proxyclients.selebf.reenviaremailprereg.ReEnviarEmailPreRegSelEBFEp;
import mx.com.sky.sel.proxyclients.selinterface.validarpreregistro.ValidarPreRegistroSelInterface;
import mx.com.sky.sel.proxyclients.selinterface.validarpreregistro.ValidarPreRegistroSelInterfaceEp;
import mx.com.sky.sel.proxyclients.siebelInterface.obtenercuentasky.ObtenerCtaSkySiebelInterface;
import mx.com.sky.sel.proxyclients.siebelInterface.obtenercuentasky.ObtenerCtaSkySiebelInterfaceEp;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.menu.ServicioMenu;

import weblogic.security.SSL.TrustManager;

import weblogic.wsee.security.bst.ClientBSTCredentialProvider;
import weblogic.wsee.security.saml.SAMLTrustCredentialProvider;
import weblogic.wsee.security.unt.ClientUNTCredentialProvider;
import weblogic.wsee.security.util.CertUtils;

import weblogic.xml.crypto.wss.WSSecurityContext;
import weblogic.xml.crypto.wss.provider.CredentialProvider;

public class ServicioUsuario implements Serializable {
    @SuppressWarnings("compatibility:3659014478874604563")
    private static final long serialVersionUID = -7965433639626141910L;

    public ServicioUsuario() {
        super();
    }

    public String reenviarConfirmacion(UsuarioRegistro usuario) throws ServicioException {
        try {
            ReEnviarEmailPreRegSelEBFEp reEnviarEmailPreRegSelEBF_ep = new ReEnviarEmailPreRegSelEBFEp();
            ReEnviarEmailPreRegSelEBF reEnviarEmailPreRegSelEBF = reEnviarEmailPreRegSelEBF_ep.getReEnviarEmailPreRegSelEBFPt();
            ReEnviarEmailPreRegSelRequestEBMType request = new ReEnviarEmailPreRegSelRequestEBMType();
            ReEnviarEmailPreRegSelResponseEBMType response = null;
            EBMHeaderRequestType header = new EBMHeaderRequestType();
            header.setOperacion("ReEnviarEmailPreReg");
            header.setSistemaOrigen("SEL");
            request.setEBMHeaderRequest(header);
            ReEnviarEmailPreRegSelInputMessageType mensaje = new ReEnviarEmailPreRegSelInputMessageType();
            mensaje.setEmail(usuario.getEmail());
            mensaje.setServicio("SKY");
            request.setReEnviarEmailPreRegSelInputMessage(mensaje);
            response = reEnviarEmailPreRegSelEBF.reEnviarEmailPreRegSel(request);
            
            if (response == null) {
                throw new ServicioException("Ocurri\u00F3 algo inesperado por favor intenta m\u00E1s tarde");
            }
        } catch (ServicioException e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            throw new ServicioException("Ocurri\u00F3 algo inesperado por favor intenta m\u00E1s tarde");
        }
        return null;
    }

    public String consultarEstatusCodigoPre(String codigo) throws ServicioException {

        ValidarPreRegistroSelInterfaceEp servicio;
        ValidarPreRegistroSelInterface interfaz;
        ValidarPreRegistroSelEBMType payload;
        ValidarPreRegistroSelResponseEBMType response;
        DbValidarPreRegistroSelInput input;
        EBMHeaderRequestType headerRequest;
        EBMHeaderResponseType headerResponse;
        String respuesta = "";
        try {
            
            servicio = new ValidarPreRegistroSelInterfaceEp();
            interfaz = servicio.getValidarPreRegistroSelInterfacePt();
            payload = new ValidarPreRegistroSelEBMType();
            input = new DbValidarPreRegistroSelInput();
            headerRequest = new EBMHeaderRequestType();
            headerRequest.setSistemaOrigen("SEL");
            headerRequest.setOperacion("ValidarPreRegistro");
            input.setCodigoPreRegistro(codigo);
            payload.setEBMHeaderRequest(headerRequest);
            payload.setDbValidarPreRegistroSelInput(input);
            response = interfaz.validarPreRegistroSel(payload);
            if (response == null) {
                LogServicios.printlnWarn(this, "response[" + response + "]");
                throw new ServicioException("No se puede verificar el c\u00F3digo por ahora, por favor intente m\u00E1s tarde");
            }
            headerResponse = response.getEBMHeaderResponse();
            if (headerResponse != null && headerResponse.getErrorNegocio() != null && headerResponse.getErrorNegocio().getCodigoError() != null && headerResponse.getErrorNegocio().getCodigoError().contains("0")){
                if (response.getDbValidarPreRegistroSelOutputCollection() != null && response.getDbValidarPreRegistroSelOutputCollection().getDbValidarPreRegistroSelOutput() != null && response.getDbValidarPreRegistroSelOutputCollection().getDbValidarPreRegistroSelOutput().size() > 0)
                    respuesta = response.getDbValidarPreRegistroSelOutputCollection().getDbValidarPreRegistroSelOutput().get(0).getESTATUS();
                else{
                    LogServicios.printlnWarn(this, "Error Negocio[Estado: " + headerResponse.getErrorNegocio().getEstado() + ", Codigo: " + headerResponse.getErrorNegocio().getCodigoError() + ", Descripcion: " + headerResponse.getErrorNegocio().getDescripcionError() + "]");
                    throw new ServicioException(headerResponse.getErrorNegocio().getDescripcionError());
                }
            }else if (headerResponse.getErrorNegocio() != null && headerResponse.getErrorNegocio().getCodigoError() != null){
                LogServicios.printlnWarn(this, "Error Negocio[Estado: " + headerResponse.getErrorNegocio().getEstado() + ", Codigo: " + headerResponse.getErrorNegocio().getCodigoError() + ", Descripcion: " + headerResponse.getErrorNegocio().getDescripcionError() + "]");
                throw new ServicioException(headerResponse.getErrorNegocio().getDescripcionError());
            }else{
                LogServicios.printlnWarn(this, "errorNegocio[" + headerResponse.getErrorNegocio() + "]");
                throw new ServicioException("No se puede verificar el c\u00F3digo por ahora, por favor intente m\u00E1s tarde");
            }
        } catch (ServicioException e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            throw new ServicioException("Ocurri\u00F3 algo inesperado por favor intenta m\u00E1s tarde");
        }
        return respuesta;
    }

    public String consultarEstatusCodigoPreActualizacion(String codigo) throws ServicioException {

        ConsultaactualizadatosusuarioClientEp ConsultaactualizadatosusuarioClientEp;
        ConsultaActualizaDatosUsuario consultaActualizaDatosUsuario = null;
        ConsultaADUOutType response = null;
        ConsultaADUInType payload = null;
        String respuesta = "";
        try {

            ConsultaactualizadatosusuarioClientEp = new ConsultaactualizadatosusuarioClientEp();
            consultaActualizaDatosUsuario = ConsultaactualizadatosusuarioClientEp.getConsultaActualizaDatosUsuarioPt();

            payload = new ConsultaADUInType();
            payload.setCodigo(codigo);
            response = consultaActualizaDatosUsuario.process(payload);

            if (response == null || response.getRespuesta() == null) {
                throw new ServicioException("No se puede verificar el c\u00F3digo por ahora, por favor intene m\u00E1s tarde");
            }
            if (!response.getRespuesta().equalsIgnoreCase("0")) {
                throw new ServicioException("No se puede verificar el c\u00F3digo por ahora, por favor intene m\u00E1s tarde");
            }
            if (response.getSelectActualizaDatosUsuarioOutput() == null || response.getSelectActualizaDatosUsuarioOutput().size() <= 0) {
                respuesta = "NO_ENCONTRADO";
            } else {
                respuesta = response.getSelectActualizaDatosUsuarioOutput().get(0).getESTADO();
            }

        } catch (ServicioException e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            throw new ServicioException("Ocurri\u00F3 algo inesperado por favor intenta m\u00E1s tarde");
        }
        return respuesta;
    }
    public RegistroCorporativoLinkResponse terminarPreRegistroCorp(String codigo) throws ServicioException {
        RegistraCorporativoLinkEp RegistraCorporativoLinkEp = new RegistraCorporativoLinkEp();
        RegistraCorporativoLink registraCorporativoLink = RegistraCorporativoLinkEp.getRegistraCorporativoLinkPt();
        RegistroCorporativoLinkRequest payload = new RegistroCorporativoLinkRequest();
        RegistroCorporativoLinkResponse response = new RegistroCorporativoLinkResponse();

        try {
            
            
            payload.setCodigoPreRegistro(codigo);
            response = registraCorporativoLink.registraCorporativo(payload);
            if (response == null) {
                throw new ServicioException("Ocurri\u00F3 algo inesperado por favor intenta m\u00E1s tarde");
            } else if (!response.getRespuesta().equalsIgnoreCase("0")) {
                throw new ServicioException(response.getRespuestaDesc());
            }
        } catch (ServicioException e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            throw new ServicioException("Ocurri\u00F3 algo inesperado por favor intenta m\u00E1s tarde");
        }
        return response;
    }

    public String terminarPreRegistro(String cuenta, String emailCuenta,
                                      String telefonoCuenta,
                                      String servicioCuenta, String tipoCuenta,
                                      String contrasena, String idPre) throws ServicioException {
        CrearRegistroSelEBFEp servicio;
        CrearRegistroSelEBF interfaz;
        CrearRegistroSelRequestType payload;
        CrearRegistroSelInputMessageType input;
        CrearRegistroSelResponseType response;
        EBMHeaderRequestType headerRequest;
        EBMHeaderResponseType headerResponse;
        String estatus;

        try {
            estatus = null;
            System.out.println("parametros [cuenta: " + cuenta + ", email: " + emailCuenta + ", telefono: " + telefonoCuenta + ", servicio: " + servicioCuenta + ", tipo: " + tipoCuenta + ", password: " + contrasena);
            servicio = new CrearRegistroSelEBFEp();
            interfaz = servicio.getCrearRegistroSelEBFPt();
            payload = new CrearRegistroSelRequestType();
            input = new CrearRegistroSelInputMessageType();
            headerRequest = new EBMHeaderRequestType();
            headerRequest.setSistemaOrigen("SEL");
            headerRequest.setOperacion("CrearRegistro");
            payload.setEBMHeaderRequest(headerRequest);
            input.setCuenta(cuenta);
            input.setEmail(emailCuenta);
            input.setPassword(contrasena);
            input.setServicio(servicioCuenta);
            input.setTelf(telefonoCuenta);
            input.setTipo(tipoCuenta);
            input.setIdPreReg(idPre);
            //Comentario, falta parametro de ID de PRE REG
            payload.setCrearRegistroSelInputMessage(input);
            response = interfaz.crearRegistroSel(payload);
            if (response == null) {
                LogServicios.printlnWarn(this, "response[" + response + "]");
                throw new ServicioException("Ocurri\u00F3 algo inesperado por favor intenta m\u00E1s tarde");
            }
            headerResponse = response.getEBMHeaderResponse();
            if (headerResponse != null && headerResponse.getErrorNegocio() != null && headerResponse.getErrorNegocio().getCodigoError() != null && headerResponse.getErrorNegocio().getCodigoError().equalsIgnoreCase("0")){
                estatus = "OK";
            }else if (headerResponse != null && headerResponse.getErrorNegocio() != null && headerResponse.getErrorNegocio().getCodigoError() != null && headerResponse.getErrorNegocio().getCodigoError().equalsIgnoreCase("0CV")){
                estatus = "OK";
            }else if (headerResponse.getErrorNegocio() != null && headerResponse.getErrorNegocio().getCodigoError() != null){
                LogServicios.printlnWarn(this, "Error Negocio[Estado: " + headerResponse.getErrorNegocio().getEstado() + ", Codigo: " + headerResponse.getErrorNegocio().getCodigoError() + ", Descripcion: " + headerResponse.getErrorNegocio().getDescripcionError() + "]");
                estatus = headerResponse.getErrorNegocio().getDescripcionError();
                throw new ServicioException(headerResponse.getErrorNegocio().getDescripcionError());
            }else{
                LogServicios.printlnWarn(this, "errorNegocio[" + headerResponse.getErrorNegocio() + "]");
                throw new ServicioException("Ocurri\u00F3 algo inesperado por favor intenta m\u00E1s tarde");
            }
        } catch (ServicioException e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            System.out.println("ocurrio una excepcion generica");
            LogServicios.printlnError(this, e.getMessage(), e);
            throw new ServicioException("Ocurri\u00F3 algo inesperado por favor intenta m\u00E1s tarde");
        }
        return estatus;
    }
    
    public String terminarRecuperarCon(String emailCuenta,
                                      String contrasena) throws ServicioException {
        ModificarPasswordRegistroSelEBFEp servicio;
        ModificarPasswordRegistroRequestEBMType payload;
        ModificarPasswordRegistroSelEBF interfaz;
        
        EBMHeaderRequestType ebmHeaderRequest;
        
        ModificarPasswordRegistroInputMessageType input;
        ModificarPasswordRegistroResponseEBMType response;
        
        EBMHeaderResponseType headerResponse;
        String estatus;

        try {
            estatus = null;
            System.out.println("parametros [ email: " + emailCuenta + ", password: " + contrasena);
            
            servicio = new ModificarPasswordRegistroSelEBFEp();
            interfaz = servicio.getModificarPasswordRegistroSelEBFPt();
            payload = new ModificarPasswordRegistroRequestEBMType();
            
            
            input = new ModificarPasswordRegistroInputMessageType();
            ebmHeaderRequest = new EBMHeaderRequestType();
            ebmHeaderRequest.setSistemaOrigen("SEL");
            ebmHeaderRequest.setOperacion("RecuperarContrasena");
            
            payload.setEBMHeaderRequest(ebmHeaderRequest);
            input.setEmail(emailCuenta);
            input.setPassword(contrasena);
           
            payload.setModificarPasswordRegistroInputMessage(input);
            response = interfaz.modificarPasswordRegistroSel(payload);
            if (response == null) {
                LogServicios.printlnWarn(this, "response[" + response + "]");
                throw new ServicioException("Ocurrió algo inesperado por favor intenta más tarde");
            }
            headerResponse = response.getEBMHeaderResponse();
            if (headerResponse != null && headerResponse.getErrorNegocio() != null && headerResponse.getErrorNegocio().getCodigoError() != null && headerResponse.getErrorNegocio().getCodigoError().equalsIgnoreCase("0")){
                estatus = "OK";
            }else if (headerResponse.getErrorNegocio() != null && headerResponse.getErrorNegocio().getCodigoError() != null){
                LogServicios.printlnWarn(this, "Error Negocio[Estado: " + headerResponse.getErrorNegocio().getEstado() + ", Codigo: " + headerResponse.getErrorNegocio().getCodigoError() + ", Descripcion: " + headerResponse.getErrorNegocio().getDescripcionError() + "]");
                estatus = headerResponse.getErrorNegocio().getDescripcionError();
                throw new ServicioException(headerResponse.getErrorNegocio().getDescripcionError());
            }else{
                LogServicios.printlnWarn(this, "errorNegocio[" + headerResponse.getErrorNegocio() + "]");
                throw new ServicioException("Ocurrió algo inesperado por favor intenta más tarde");
            }
        } catch (ServicioException e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            System.out.println("ocurrio una excepcion generica");
            LogServicios.printlnError(this, e.getMessage(), e);
            throw new ServicioException("Ocurrió algo inesperado por favor intenta más tarde");
        }
        return estatus;
    }
    
    public RegistroUsuarioLinkProcessResponse terminarPreRegistro(String codigo, String cuentaSKY, String tarjetaInteligente, String contrasena) throws ServicioException {
        RegistroUsuarioLink_Service registroUsuarioLink_Service;
        RegistroUsuarioLink registroUsuarioLink = null;
        RegistroUsuarioLinkProcessRequest payload;
        RegistroUsuarioLinkProcessResponse response;

        try {
            registroUsuarioLink_Service = new RegistroUsuarioLink_Service();
            registroUsuarioLink = registroUsuarioLink_Service.getRegistroUsuarioLink();
            payload = new RegistroUsuarioLinkProcessRequest();
            payload.setCodigoPreRegistro(codigo);
            payload.setCuentaSky(cuentaSKY);
            payload.setTarjetaInteligente(tarjetaInteligente);
            payload.setContrasena(contrasena);
            response = registroUsuarioLink.process(payload);
            if (response == null) {
                throw new ServicioException("Ocurri\u00F3 algo inesperado por favor intenta m\u00E1s tarde");
            } else if (!response.getRespuesta().equalsIgnoreCase("0")) {
                throw new ServicioException(response.getRespuestaDesc());
            }
        } catch (ServicioException e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            throw new ServicioException("Ocurri\u00F3 algo inesperado por favor intenta m\u00E1s tarde");
        }
        return response;
    }

    public void terminarPreActualizacion(String codigo) throws ServicioException {
        actualizarDatosUsuario(codigo);
    }

    public Usuario consultaDatosUsuario(String username) {
        Usuario user = null;
        ConsultaUsers_Service consultaUsers_Service;
        ConsultaUsers consultaUsers = null;
        ConsultaUsersProcessResponse consultaUsersProcessResponse = null;
        ConsultaUsersProcessRequest payload;
        Holder<String> error=new Holder<String>();
        Holder<String> errordesc=new Holder<String>();
        try {
            consultaUsers_Service = new ConsultaUsers_Service();
            consultaUsers = consultaUsers_Service.getConsultaUsers();
            payload = new ConsultaUsersProcessRequest();
            payload.setUsername(username);
            LogServicios.println(this, "consultaDatosUsuario Username: "+username);
            consultaUsersProcessResponse = consultaUsers.process(payload);
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }

        if (consultaUsersProcessResponse != null && consultaUsersProcessResponse.getRespuesta().equalsIgnoreCase("0")) {
            user = new Usuario();
            LogPC.println(this, "CuentaSKY: " + consultaUsersProcessResponse.getCTASKY());
            user.setCuentaSKY(consultaUsersProcessResponse.getCTASKY());
            user.setMail(consultaUsersProcessResponse.getEMAIL());
            user.setNombreCompleto(consultaUsersProcessResponse.getNOMBRECOMPLETO());
            user.setNombreUsuario(consultaUsersProcessResponse.getUSERNAME());
            user.setUid(consultaUsersProcessResponse.getUSERID());
            user.setTipoUsuario(consultaUsersProcessResponse.getTIPOCUENTA());
            user.setPermisos(consultaUsersProcessResponse.getPERMISOS());
            user.setNombreCorporativo(consultaUsersProcessResponse.getNombreCorp());
            user.setPrimerLogin(consultaUsersProcessResponse.getPRIMERSESION());
            //C\u00F3digo para actualizar campo de primer login y al segundo login ya no mostrar la ventana de actualizar informaci\u00F3n.
            if (user.getPrimerLogin().equalsIgnoreCase("Y")) {
                LogPC.println(this, "USUARIO CON MAS DE DOS LOGIN " + username);
                LogPC.println(this, "User UID: " + user.getUid());
            }else{
                try {
                    PrimerloginClientEp PrimerloginClientEp = new PrimerloginClientEp();
                    BPELUpdatePrimerLogin update = PrimerloginClientEp.getBPELUpdatePrimerLoginPt();
                    
                    update.process(username,error,errordesc);
                } catch (Exception e) {
                    LogServicios.printlnError(this, e.getMessage(), e);
                }
            }
            if (user.getTipoUsuario().equalsIgnoreCase("C")) {
                ConsultaCuentaEspecial_Service consultaCuentaEspecial_Service = new ConsultaCuentaEspecial_Service();
                ConsultaCuentaEspecial consultaCuentaEspecial = consultaCuentaEspecial_Service.getConsultaCuentaEspecial();
                ConsultaCuentaEspecialProcessRequest request = new ConsultaCuentaEspecialProcessRequest();
                ConsultaCuentaEspecialProcessResponse response = null;
                request.setCuentaSKY(user.getCuentaSKY());
                response = consultaCuentaEspecial.process(request);
                if (response.getResultado().equalsIgnoreCase("0") && (!user.getCuentaSKY().equalsIgnoreCase(response.getCuentaSKYPadre()))) {
                    user.setCuentaJerarquia(true);
                }else{
                    user.setCuentaJerarquia(false);
                }
            }
        } else {
            LogServicios.println(this, "consultaDatosUsuario Respuesta: "+consultaUsersProcessResponse.getRespuesta()+", Decripci\u00F3n: "+consultaUsersProcessResponse.getRespuestadesc());
        }
        return user;
    }
    public boolean getCuentaJerarquia(String cuentaSKY){
        boolean ctaJ= true;
        ConsultaCuentaEspecial_Service consultaCuentaEspecial_Service = new ConsultaCuentaEspecial_Service();
        ConsultaCuentaEspecial consultaCuentaEspecial = consultaCuentaEspecial_Service.getConsultaCuentaEspecial();
        ConsultaCuentaEspecialProcessRequest request = new ConsultaCuentaEspecialProcessRequest();
        ConsultaCuentaEspecialProcessResponse response = null;
        request.setCuentaSKY(cuentaSKY);
        response = consultaCuentaEspecial.process(request);
        System.out.println("++++++ validando si la cuenta "+cuentaSKY+" es jerarquica ++++++");
        System.out.println("valor del wsdl consultaCuentaEspecial para getCuentaSKYPadre: "+response.getCuentaSKYPadre()+"   con la cuenta: "+cuentaSKY);
        if (response.getResultado().equalsIgnoreCase("0") && (!cuentaSKY.equalsIgnoreCase(response.getCuentaSKYPadre()))) {
            ctaJ= true;
        }else{
            ctaJ= false;
        }
        System.out.println("la cuenta: "+cuentaSKY+" es jerarquica: "+ctaJ);
        return ctaJ;
    }
    public Usuario consultaAtributosUsuario(String uid, String cuentaSKY) {
        ConsultaLDAP_Service consultaLDAP_Service;
        ConsultaLDAP consultaLDAP = null;
        ConsultaLDAPProcessRequest payload;
        ConsultaLDAPProcessResponse resultado = null;
        Usuario auser = null;
        try {
            consultaLDAP_Service = new ConsultaLDAP_Service();
            consultaLDAP = consultaLDAP_Service.getConsultaLDAP();
            payload = new ConsultaLDAPProcessRequest();
            payload.setOperacionLDAP("6");
            payload.setUID(uid);
            payload.setCtaSky(cuentaSKY);
            resultado = consultaLDAP.process(payload);
            if (resultado != null) {
                if (resultado.getRespuesta().equalsIgnoreCase("1")) {
                    throw new ServicioException(resultado.getRespuestaCode());
                }
                auser = convertUsuarioAtributos(resultado);
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }
        return auser;
    }

    public UsuarioRegistro preRegistroActualizacion(UsuarioRegistro usuarioRegistro) throws ServicioException, Exception {
        UsuarioRegistro resultado = new UsuarioRegistro();
        BpelpreactualizadatosusuarioClientEp BpelpreactualizadatosusuarioClientEp;
        BPELPreActualizaDatosUsuario bPELPreActualizaDatosUsuario = null;
        PreActualizaDatoRequest payload;
        PreActualizaDatosUsuarioResponse response = null;

        try {
            BpelpreactualizadatosusuarioClientEp = new BpelpreactualizadatosusuarioClientEp();
            bPELPreActualizaDatosUsuario = BpelpreactualizadatosusuarioClientEp.getBPELPreActualizaDatosUsuarioPt();

            payload = llenarAtributosUsuario(usuarioRegistro);
            response = bPELPreActualizaDatosUsuario.process(payload);
            if (response.getResultado() == null) {
                throw new ServicioException("Error al procesar la solicitud, favor de intentar m\u00E1s tarde");
            }
            if (!response.getResultado().equalsIgnoreCase("0")) {
                throw new ServicioException(response.getResultadodesc());
            }
        } catch (ServicioException e) {
            LogServicios.printlnError(e);
            throw e;
        } catch (Exception e) {
            LogServicios.printlnError(e);
            throw e;
        }
        return resultado;
    }

    public UsuarioRegistro actualizarDatosUsuario(String codigo) throws ServicioException {
        UsuarioRegistro resultado = new UsuarioRegistro();
        BpelactualizadatosusuarioClientEp BpelactualizadatosusuarioClientEp;
        BPELActualizaDatosUsuario bPELActualizaDatosUsuario = null;
        ActualizaDatosUsuarioResponse response = null;
        ActualizaDatosUsuarioRequest payload = null;
        try {
            BpelactualizadatosusuarioClientEp = new BpelactualizadatosusuarioClientEp();
            bPELActualizaDatosUsuario = BpelactualizadatosusuarioClientEp.getBPELActualizaDatosUsuarioPt();

            payload = new ActualizaDatosUsuarioRequest();
            payload.setCodigoPreActualiza(codigo);
            response = bPELActualizaDatosUsuario.process(payload);
            if (response.getRespuesta() == null) {
                throw new ServicioException("Error al procesar la solicitud, favor de intentar m\u00E1s tarde");
            }
            if (!response.getRespuesta().equalsIgnoreCase("0")) {
                throw new ServicioException(response.getRespuestaDesc());
            }
        } catch (ServicioException e) {
            LogServicios.printlnError(e);
            throw e;
        } catch (Exception e) {
            LogServicios.printlnError(e);
            throw new ServicioException(e);
        }
        return resultado;
    }


    /* public String nuevoUsuarioTitular(UsuarioRegistro usuario) {
        return nuevoUsuario(usuario, "Registro");
    }*/

    public UsuarioRegistro nuevaCuentaHija(UsuarioRegistro usuario) throws ServicioException {
        UsuarioRegistro ur = procesaCuenta(usuario, "1");
        String uid = ur.getUid();
        if (uid != null && uid.length() > 0) {
            ServicioMenu sm = new ServicioMenu();
            sm.prepararMenuHijo(uid);
        }
        return ur;
    }
    public String autenticarModificaContrasena(String usuario, String contrasena) throws ServicioException{
        String respuesta= "";
        ClientEpEp ClientEpEp = new ClientEpEp();
        SELAutenticarCambioContrasena sELAutenticarCambioContrasena = ClientEpEp.getSELAutenticarCambioContrasenaPt();
        Proceso process = new Proceso();
        RespuestaProceso processResponse;
        process.setUsuario(usuario);
        process.setContrasenaActual(contrasena);
        processResponse = sELAutenticarCambioContrasena.process(process);
        if (processResponse != null && processResponse.getCodError().equalsIgnoreCase("0")) {
            respuesta = "Credenciales actuales correctas.";
        }else{
            throw new ServicioException("Las credenciales actuales no son las correctas.");
        }
        return respuesta;
    }
    public UsuarioRegistro modificarCuentaHija(UsuarioRegistro usuario) throws ServicioException {
        return procesaCuenta(usuario, "3");
    }

    public UsuarioRegistro eliminarCuentaHija(UsuarioRegistro usuario) throws ServicioException {
        ServicioMenu sm = new ServicioMenu();
        String uid = usuario.getUid();
        sm.deleteUserMenu(uid);
        return procesaCuenta(usuario, "2");
    }

    public List<UsuarioRegistro> obtenerCuentas(String cuentaSKY) {
        List<UsuarioRegistro> usuarios = new ArrayList<UsuarioRegistro>();
        UsuarioRegistro usuario = null;
        ConsultaLDAP_Service consultaLDAP_Service;
        ConsultaLDAP consultaLDAP = null;
        ConsultaLDAPProcessRequest payload;
        ConsultaLDAPProcessResponse resultado = null;
        if (cuentaSKY == null || cuentaSKY.isEmpty()) {
            return usuarios;
        }

        try {

            consultaLDAP_Service = new ConsultaLDAP_Service();
            consultaLDAP = consultaLDAP_Service.getConsultaLDAP();

            payload = new ConsultaLDAPProcessRequest();

            payload.setOperacionLDAP("5");
            payload.setCtaSky(cuentaSKY);
            LogServicios.println(this, "obtenerCuentas [" + cuentaSKY + "][5]");

            resultado = consultaLDAP.process(payload);

            if (resultado != null) {
                for (ConsultaLDAPProcessResponse.Hijas hija : resultado.getHijas()) {
                    usuario = convertUsuarioRegistro(hija);
                    usuarios.add(usuario);
                }
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }
        return usuarios;
    }
    //validar si se puede eliminar, ya que para PC ha cambiado
    public String passwordReset(String uid) throws ServicioException {
        PasswordResetProcessRequest payload;
        PasswordResetProcessResponse resultado;
        PasswordReset_Service passwordReset_Service;
        PasswordReset passwordReset = null;

        try {

            passwordReset_Service = new PasswordReset_Service();
            passwordReset = passwordReset_Service.getPasswordReset();

            payload = new PasswordResetProcessRequest();
            payload.setIdentificador(uid);
            payload.setSistema("Servicios En Linea");
            resultado = passwordReset.process(payload);

            if (resultado != null && resultado.getRespuesta().equalsIgnoreCase("0")) {
                return "La nueva contrasena se ha enviado a su correo";
            } else if (resultado != null) {
                throw new ServicioException(resultado.getRespuestaCode());
            } else {
                throw new ServicioException("Ocurri\u00F3 algo inesperado, por favor intente m\u00E1s tarde");

            }
        } catch (ServicioException e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            throw new ServicioException("Ocurri\u00F3 algo inesperado por favor intenta m\u00E1s tarde");
        }

    }

    //nuevo ws paa recuperar contraenia
    public String recuperarContrasenia(String email) throws ServicioException {
        mx.com.sky.enterpriseflowmessage.sel.recuperarpasswordusrebf.RecuperarPasswordUsrRequestEBFEBMType payload;
        RecuperarPasswordUsrSelEBF recuperarPasswordUsrSelEBF =null ;
        mx.com.sky.enterpriseflowmessage.sel.recuperarpasswordusrebf.RecuperarPasswordUsrResponseEBFEBMType recuperarPasswordUsrResponseEBFEBMType;
        
        EBMHeaderRequestType EBMHeaderRequestTypeRp;
        RecuperarPasswordUsrSelEBFEp recuperarPasswordUsrSelEBFEp;
        /*PasswordResetProcessRequest payload;
        PasswordResetProcessResponse resultado;
        PasswordReset_Service passwordReset_Service;
        PasswordReset passwordReset = null;*/

        try {
            recuperarPasswordUsrSelEBFEp = new RecuperarPasswordUsrSelEBFEp();
            recuperarPasswordUsrSelEBF = recuperarPasswordUsrSelEBFEp.getRecuperarPasswordUsrSelEBFPt();
            recuperarPasswordUsrResponseEBFEBMType = new mx.com.sky.enterpriseflowmessage.sel.recuperarpasswordusrebf.RecuperarPasswordUsrResponseEBFEBMType();
            EBMHeaderRequestTypeRp = new EBMHeaderRequestType();
            EBMHeaderRequestTypeRp.setOperacion("RecuperarPassword");
            EBMHeaderRequestTypeRp.setSistemaOrigen("SEL");
            payload = new mx.com.sky.enterpriseflowmessage.sel.recuperarpasswordusrebf.RecuperarPasswordUsrRequestEBFEBMType();
            payload.setEBMHeaderRequest(EBMHeaderRequestTypeRp);
            payload.setEmailUsuario(email);
            recuperarPasswordUsrResponseEBFEBMType= recuperarPasswordUsrSelEBF.recuperarPasswordUsr(payload);
            //passwordReset_Service = new PasswordReset_Service();
            //passwordReset = passwordReset_Service.getPasswordReset();
            if (recuperarPasswordUsrResponseEBFEBMType != null && recuperarPasswordUsrResponseEBFEBMType.getRecuperarPasswordUsrResponse().getCodigo().equalsIgnoreCase("0")) {
                return "La nueva contraseña se ha enviado a su correo";
            } else if (recuperarPasswordUsrResponseEBFEBMType != null) {
                throw new ServicioException(recuperarPasswordUsrResponseEBFEBMType.getRecuperarPasswordUsrResponse().getMensaje());
            } else {
                throw new ServicioException("Ocurrió algo inesperado, por favor intente más tarde");

            }
        } catch (ServicioException e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            throw new ServicioException("Ocurrió algo inesperado por favor intenta más tarde");
        }

    }
    public UsuarioRegistro obtenerMiCuenta(String uid) {
        UsuarioRegistro usuario = new UsuarioRegistro();
        List<UsuarioRegistro> usuarios = new ArrayList<UsuarioRegistro>();
        try {
            usuarios = obtenerCuentas(uid);
            if (usuarios != null && usuarios.size() > 0) {
                usuario = usuarios.get(0);
            }
        } catch (Exception e) {
            LogServicios.printlnError(e);
        }
        return usuario;
    }

    public String preRegistroUsuario(UsuarioRegistro usuario) throws ServicioException {
        PreRegistroSelEBFEp servicio;
        PreRegistroSelEBF interfaz;
        PreRegistroSelRequestEBMType payload;
        PreRegistroSelResponseEBMType response;
        PreRegistroSelInputMessageType input;
        EBMHeaderRequestType headerRequest;
        EBMHeaderResponseType headerResponse;
        String resultado = "";
        
        try {
            servicio = new PreRegistroSelEBFEp();
            interfaz = servicio.getPreRegistroSelEBFPt();
            payload = new PreRegistroSelRequestEBMType();
            input = new PreRegistroSelInputMessageType();
            headerRequest = new EBMHeaderRequestType();
            headerRequest.setSistemaOrigen("SEL");
            headerRequest.setOperacion("PreRegistro");
            input.setEmail(usuario.getEmail());
            input.setNumeroTel(usuario.getTelefonoMovil());
            input.setNumeroCuenta(usuario.getCuentaSKY());
            payload.setEBMHeaderRequest(headerRequest);
            payload.setPreRegistroSelInputMessage(input);
            response = interfaz.preRegistroSel(payload);
            if (response == null) {
                LogServicios.printlnWarn(this, "response[" + response + "]");
                throw new ServicioException("Ocurrió algo inesperado por favor intenta más tarde");
            }
            headerResponse = response.getEBMHeaderResponse();
            if (headerResponse != null && headerResponse.getErrorNegocio() != null && headerResponse.getErrorNegocio().getCodigoError() != null && headerResponse.getErrorNegocio().getCodigoError().equalsIgnoreCase("0")){
                resultado = headerResponse.getErrorNegocio().getEstado();
            }else if (headerResponse.getErrorNegocio() != null && headerResponse.getErrorNegocio().getCodigoError() != null){
                LogServicios.printlnWarn(this, "Error Negocio[Estado: " + headerResponse.getErrorNegocio().getEstado() + ", Codigo: " + headerResponse.getErrorNegocio().getCodigoError() + ", Descripcion: " + headerResponse.getErrorNegocio().getDescripcionError() + "]");
                throw new ServicioException(headerResponse.getErrorNegocio().getDescripcionError());
            }else{
                LogServicios.printlnWarn(this, "errorNegocio[" + headerResponse.getErrorNegocio() + "]");
                throw new ServicioException("Ocurrió algo inesperado por favor intenta más tarde");
            }
        } catch (ServicioException e) {
            resultado = "Ocurri\u00F3 algo inesperado por favor intenta m\u00E1s tarde";
            LogServicios.printlnError(this, e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            resultado = "Ocurri\u00F3 algo inesperado por favor intenta m\u00E1s tarde";
            LogServicios.printlnError(this, e.getMessage(), e);
            throw new ServicioException("Ocurri\u00F3 algo inesperado por favor intenta m\u00E1s tarde");
        }
        return resultado;

    }

    private UsuarioRegistro convertUsuarioRegistro(ConsultaLDAPProcessResponse.Hijas hija) {
        UsuarioRegistro usuario = new UsuarioRegistro();

        usuario.setApellidoMaterno(hija.getAMATERNO());
        usuario.setApellidoPaterno(hija.getAPATERNO());
        usuario.setEmail(hija.getEMAIL());
        usuario.setNombre(hija.getNOMBRE());
        if (hija.getTELCASA() != null && !hija.getTELCASA().equalsIgnoreCase("0")) {
            usuario.setTelefonoCasa(hija.getTELCASA());
        }
        if (hija.getTELCASALADA() != null && !hija.getTELCASALADA().equalsIgnoreCase("0")) {
            usuario.setTelefonoLada(hija.getTELCASALADA());
        }
        if (hija.getTELMOVIL() != null && !hija.getTELMOVIL().equalsIgnoreCase("0")) {
            usuario.setTelefonoMovil(hija.getTELMOVIL());
        }
        if (hija.getTELMOVILLADA() != null && !hija.getTELMOVILLADA().equalsIgnoreCase("0")) {
            usuario.setTelefonoMovilLada(hija.getTELMOVILLADA());
        }
        if (hija.getTELTRAB() != null && !hija.getTELTRAB().equalsIgnoreCase("0")) {
            usuario.setTelefonoTrabajo(hija.getTELTRAB());
        }
        if (hija.getTELTRABEXT() != null && !hija.getTELTRABEXT().equalsIgnoreCase("0")) {
            usuario.setTelefonoTrabajoExt(hija.getTELTRABEXT());
        }
        if (hija.getTELTRABLADA() != null && !hija.getTELTRABLADA().equalsIgnoreCase("0")) {
            usuario.setTelefonoTrabajoLada(hija.getTELTRABLADA());
        }
        usuario.setUid(hija.getUSERID());
        usuario.setUserName(hija.getUSERNAME());
        usuario.setDescripcion("");
        return usuario;
    }


    /**
     *
     * @param usuario
     * @param operacion Crear 1 | Eliminar cuenta 2 | Modificar 3
     * @return
     */
    private UsuarioRegistro procesaCuenta(UsuarioRegistro usuario, String operacion) throws ServicioException {
        ConsultaLDAP_Service consultaLDAP_Service;
        ConsultaLDAP consultaLDAP = null;
        ConsultaLDAPProcessRequest payload;
        ConsultaLDAPProcessResponse resultado = null;


        try {

            consultaLDAP_Service = new ConsultaLDAP_Service();
            consultaLDAP = consultaLDAP_Service.getConsultaLDAP();

            payload = new ConsultaLDAPProcessRequest();

            payload.setOperacionLDAP(operacion);
            payload.setUID(usuario.getUid());
            payload.setApellidoMaterno(usuario.getApellidoMaterno());
            payload.setApellidoPaterno(usuario.getApellidoPaterno());
            payload.setCtaSky(usuario.getCuentaSKY());
            payload.setEmail(usuario.getEmail());
            payload.setNombre(usuario.getNombre());
            payload.setPassword(usuario.getPassword());
            payload.setTarjetaInteligente(usuario.getTarjetaInteligente());
            payload.setTelCasa(usuario.getTelefonoCasa());
            payload.setTelMovilLada(usuario.getTelefonoMovilLada());
            payload.setTelCasaLada(usuario.getTelefonoLada());
            payload.setTelMovil(usuario.getTelefonoMovil());
            payload.setTelTrab(usuario.getTelefonoTrabajo());
            payload.setTelTrabExt(usuario.getTelefonoTrabajoExt());
            payload.setTelTrabLada(usuario.getTelefonoTrabajoLada());
            payload.setTitular(usuario.getTitularCuentaSKY());
            payload.setUsername(usuario.getUserName());
            payload.setContactoRowID(usuario.getContactoRowId());
            payload.setDescripcion(usuario.getDescripcion());
            payload = llenarAtributosLDAP(usuario, payload);
            resultado = consultaLDAP.process(payload);

            if (resultado != null) {
                if (resultado.getRespuesta().equalsIgnoreCase("1")) {
                    throw new ServicioException(resultado.getRespuestaCode());
                }
                usuario.setUid(resultado.getUID());
            }
        } catch (ServicioException e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            throw new ServicioException("Ocurrio algo inesperado por favor intenta mas tarde");
        }

        return usuario;
    }

    private ConsultaLDAPProcessRequest llenarAtributosLDAP(UsuarioRegistro usuario, ConsultaLDAPProcessRequest payload) {

        List<ConsultaLDAPProcessRequest.Atributos> atributos;
        ConsultaLDAPProcessRequest.Atributos atributo;
        atributos = new ArrayList<ConsultaLDAPProcessRequest.Atributos>();

        atributo = new ConsultaLDAPProcessRequest.Atributos();
        atributo.setAtributo("givenName");
        atributo.setValorAtributo(usuario.getNombre());
        atributos.add(atributo);


        atributo = new ConsultaLDAPProcessRequest.Atributos();
        atributo.setAtributo("sn");
        atributo.setValorAtributo(usuario.getApellidoPaterno() + " " + usuario.getApellidoMaterno());
        atributos.add(atributo);

        if (usuario.getPassword() != null && usuario.getPassword().length() > 0) {
            atributo = new ConsultaLDAPProcessRequest.Atributos();
            atributo.setAtributo("userPassword");
            atributo.setValorAtributo(usuario.getPassword());
            atributos.add(atributo);
        }
        atributo = new ConsultaLDAPProcessRequest.Atributos();
        atributo.setAtributo("mail");
        atributo.setValorAtributo(usuario.getEmail());
        atributos.add(atributo);

        atributo = new ConsultaLDAPProcessRequest.Atributos();
        atributo.setAtributo("telephoneNumber");
        atributo.setValorAtributo(usuario.getTelefonoCasa());
        atributos.add(atributo);

        if (usuario.getAcl_btg() != null && !usuario.getAcl_btg().isEmpty()) {
            atributo = new ConsultaLDAPProcessRequest.Atributos();
            atributo.setAtributo("acl-btg");
            atributo.setValorAtributo(usuario.getAcl_btg());
            atributos.add(atributo);
        }
        if (usuario.getAcl_ott() != null && !usuario.getAcl_ott().isEmpty()) {
            atributo = new ConsultaLDAPProcessRequest.Atributos();
            atributo.setAtributo("acl-ott");
            atributo.setValorAtributo(usuario.getAcl_ott());
            atributos.add(atributo);
        }
        if (usuario.getAcl_sel() != null && !usuario.getAcl_sel().isEmpty()) {
            atributo = new ConsultaLDAPProcessRequest.Atributos();
            atributo.setAtributo("acl-sel");
            atributo.setValorAtributo(usuario.getAcl_sel());
            atributos.add(atributo);
        }
        if (usuario.getStatus_btg() != null && !usuario.getStatus_btg().isEmpty()) {
            atributo = new ConsultaLDAPProcessRequest.Atributos();
            atributo.setAtributo("status-btg");
            atributo.setValorAtributo(usuario.getStatus_btg());
            atributos.add(atributo);
        }
        if (usuario.getStatus_ott() != null && !usuario.getStatus_ott().isEmpty()) {
            atributo = new ConsultaLDAPProcessRequest.Atributos();
            atributo.setAtributo("status-ott");
            atributo.setValorAtributo(usuario.getStatus_ott());
            atributos.add(atributo);
        }
        if (usuario.getStatus_sel() != null && !usuario.getStatus_sel().isEmpty()) {
            atributo = new ConsultaLDAPProcessRequest.Atributos();
            atributo.setAtributo("status-sel");
            atributo.setValorAtributo(usuario.getStatus_sel());
            atributos.add(atributo);
        }

        payload.getAtributos().addAll(atributos);

        return payload;
    }

    private PreActualizaDatoRequest llenarAtributosUsuario(UsuarioRegistro usuario) {
        PreActualizaDatoRequest payload = new PreActualizaDatoRequest();

        payload.setApellidoMaterno(usuario.getApellidoMaterno());
        payload.setApellidoPaterno(usuario.getApellidoPaterno());
        payload.setContactoRowid(usuario.getContactoRowId());
        payload.setCuentaSKY(usuario.getCuentaSKY());
        payload.setDescripcion(usuario.getDescripcion());
        payload.setEmail(usuario.getEmail());
        payload.setIntento("1");
        payload.setNombre(usuario.getNombre());
        payload.setPasoBpel("1");
        payload.setPassword(usuario.getPassword());
        payload.setTarjetaInteligente(usuario.getTarjetaInteligente());
        payload.setTelefonoCasa(usuario.getTelefonoCasa());
        payload.setTelefonoLada(usuario.getTelefonoLada());
        payload.setTelefonoMovil(usuario.getTelefonoMovil());
        payload.setTelefonoMovilLada(usuario.getTelefonoMovilLada());
        payload.setTelefonoTrabajo(usuario.getTelefonoTrabajo());
        payload.setTelefonoTrabajoExt(usuario.getTelefonoTrabajoExt());
        payload.setTelefonoTrabajoLada(usuario.getTelefonoTrabajoLada());
        payload.setTitularCuentaSKY(usuario.getTitularCuentaSKY());
        payload.setUserId(usuario.getUid());
        payload.setUserName(usuario.getUserName());
        payload.setPaisISO(usuario.getPaisISO());

        return payload;
    }


    private Usuario convertUsuarioAtributos(ConsultaLDAPProcessResponse resultado) {
        Usuario user = new Usuario();

        for (ConsultaLDAPProcessResponse.Atributos userAtributo : resultado.getAtributos()) {
            if (userAtributo.getAtributo().equalsIgnoreCase("acl-btg")) {
                user.setAcl_btg(userAtributo.getValorAtributo());
            } else if (userAtributo.getAtributo().equalsIgnoreCase("acl-ott")) {
                user.setAcl_ott(userAtributo.getValorAtributo());
            } else if (userAtributo.getAtributo().equalsIgnoreCase("acl-sel")) {
                user.setAcl_sel(userAtributo.getValorAtributo());
            } else if (userAtributo.getAtributo().equalsIgnoreCase("status-btg")) {
                user.setStatus_btg(userAtributo.getValorAtributo());
            } else if (userAtributo.getAtributo().equalsIgnoreCase("status-ott")) {
                user.setStatus_ott(userAtributo.getValorAtributo());
            } else if (userAtributo.getAtributo().equalsIgnoreCase("status-sel")) {
                user.setStatus_sel(userAtributo.getValorAtributo());
            }
        }
        return user;
    }


    @Generated("Oracle JDeveloper")
    public static void setPortCredentialProviderList(Map<String, Object> requestContext) throws Exception {
        String username = "";
        String password = "";
        String clientKeyStore = "";
        String clientKeyStorePassword = "";
        String clientKeyAlias = "";
        String clientKeyPassword = "";
        String serverKeyStore = "";
        String serverKeyStorePassword = "";
        String serverKeyAlias = "";
        List<CredentialProvider> credList = new ArrayList<CredentialProvider>();

        // Add the necessary credential providers to the list

        credList.add(getUNTCredentialProvider(username, password));

        credList.add(getBSTCredentialProvider(clientKeyStore, clientKeyStorePassword, clientKeyAlias, clientKeyPassword, serverKeyStore,
                                              serverKeyStorePassword, serverKeyAlias, requestContext));

        credList.add(getSAMLTrustCredentialProvider());

        requestContext.put(WSSecurityContext.CREDENTIAL_PROVIDER_LIST, credList);
    }

    @Generated("Oracle JDeveloper")
    public static CredentialProvider getSAMLTrustCredentialProvider() {
        return new SAMLTrustCredentialProvider();
    }

    @Generated("Oracle JDeveloper")
    public static CredentialProvider getUNTCredentialProvider(String username, String password) {
        return new ClientUNTCredentialProvider(username.getBytes(), password.getBytes());
    }

    @Generated("Oracle JDeveloper")
    public static CredentialProvider getBSTCredentialProvider(String clientKeyStore, String clientKeyStorePwd, String clientKeyAlias,
                                                              String clientKeyPwd, String serverKeyStore, String serverKeyStorePwd,
                                                              String serverKeyAlias, Map<String, Object> requestContext) throws Exception {
        List serverCertList = CertUtils.getCertificate(serverKeyStore, serverKeyStorePwd, serverKeyAlias, "JKS");

        List clientCertList = CertUtils.getCertificate(clientKeyStore, clientKeyStorePwd, clientKeyAlias, "JKS");

        final X509Certificate serverCert = (serverCertList != null && serverCertList.size() > 0) ? (X509Certificate)serverCertList.get(0) : null;
        final X509Certificate clientCert = (clientCertList != null && clientCertList.size() > 0) ? (X509Certificate)clientCertList.get(0) : null;

        requestContext.put(WSSecurityContext.TRUST_MANAGER, new TrustManager() {
                public boolean certificateCallback(X509Certificate[] chain, int validateErr) {
                    boolean result = (chain != null && chain.length > 0) && (chain[0].equals(serverCert) || chain[0].equals(clientCert));
                    return result;
                }
            });

        return new ClientBSTCredentialProvider(clientKeyStore, clientKeyStorePwd, clientKeyAlias, clientKeyPwd, "JKS", serverCert);
    }
    
    public boolean consultarChatPublico () throws ServicioException{
        boolean respuestaChat = false;
        BpelpwconfiggeneralesClientEp bpelpwconfiggenerales_client_ep;
        bpelpwconfiggenerales_client_ep = new BpelpwconfiggeneralesClientEp();
        BPELPWConfigGenerales bPELPWConfigGenerales = bpelpwconfiggenerales_client_ep.getBPELPWConfigGeneralesPt();
        com.oracle.xmlns.pwoperaciones.pwconfiggenerales.bpelpwconfiggenerales.Proceso proceso = new com.oracle.xmlns.pwoperaciones.pwconfiggenerales.bpelpwconfiggenerales.Proceso();
        com.oracle.xmlns.pwoperaciones.pwconfiggenerales.bpelpwconfiggenerales.RespuestaProceso respuesta = null;
        CabeceraEntrada cabecera = new CabeceraEntrada();
        cabecera.setAplicativo("SEL_BT");
        cabecera.setOperacion("ConsultaMenu");
        proceso.setCabeceraEntrada(cabecera);
        Entrada entrada = new Entrada();
        entrada.setOperacionServicio("SELECT");
        EntradaSelectConfigGenerales select = new EntradaSelectConfigGenerales();
        select.setClave("ACTIVA_CHAT_PUBLICO_SKY");
        select.setActivo("1");
        entrada.setEntradaSelectConfigGenerales(select);
        proceso.setEntrada(entrada);
        respuesta = bPELPWConfigGenerales.process(proceso);
        
        if (respuesta == null) {
            respuestaChat = false;
        }else{
            if (respuesta.getSalida().getSalidaSelectConfigGenerales().getValor().equalsIgnoreCase("ACTIVO")) {
                respuestaChat = true;
            }else{
                respuestaChat = false;
            }
        }
        return respuestaChat;
    }
    public String obtenerCuentaSky (String nip) throws Exception{
        ObtenerCtaSkySiebelInterfaceEp servicio;
        ObtenerCtaSkySiebelInterface interfaz;
        ObtenerCtaSkyRequestEBMType payload;
        ObtenerCtaSkyResponseEBMType response;
        EBMHeaderRequestType headerRequest;
        EBMHeaderResponseType headerResponse;
        String cuentaSky = null;
        
        try {
            servicio = new ObtenerCtaSkySiebelInterfaceEp();
            interfaz = servicio.getObtenerCtaSkySiebelInterfacePt();
            payload = new ObtenerCtaSkyRequestEBMType();
            headerRequest = new EBMHeaderRequestType();
            headerRequest.setSistemaOrigen("SEL");
            headerRequest.setOperacion("ObtenerCtaSky");
            payload.setEBMHeaderRequest(headerRequest);
            payload.setNip(nip);
            response = interfaz.obtenerCtaSky(payload);
            if (response == null) {
                LogServicios.printlnWarn(this, "response[" + response + "]");
                throw new ServicioException("Ocurrió algo inesperado por favor intenta más tarde");
            }
            headerResponse = response.getEBMHeaderResponse();
            if (headerResponse != null && headerResponse.getErrorNegocio() != null && headerResponse.getErrorNegocio().getCodigoError() != null && headerResponse.getErrorNegocio().getCodigoError().equalsIgnoreCase("0")){
                cuentaSky = response.getNumeroCuentaSky();
            }else if (headerResponse.getErrorNegocio() != null && headerResponse.getErrorNegocio().getCodigoError() != null){
                LogServicios.printlnWarn(this, "Error Negocio[Estado: " + headerResponse.getErrorNegocio().getEstado() + ", Codigo: " + headerResponse.getErrorNegocio().getCodigoError() + ", Descripcion: " + headerResponse.getErrorNegocio().getDescripcionError() + "]");
                throw new ServicioException(headerResponse.getErrorNegocio().getDescripcionError());
            }else{
                LogServicios.printlnWarn(this, "errorNegocio[" + headerResponse.getErrorNegocio() + "]");
                throw new ServicioException("Ocurrió algo inesperado por favor intenta más tarde");
            }
        } catch (ServicioException e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            throw new ServicioException("Ocurrió algo inesperado por favor intenta más tarde");
        }
        
        return cuentaSky;
    }
}
