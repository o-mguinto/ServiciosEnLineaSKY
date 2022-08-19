package mx.com.sky.sel.dc.usuario;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import mx.com.sky.enterpriseflowmessage.sel.autenticarusuario.AutenticarUsuarioInputMessageType;
import mx.com.sky.enterpriseflowmessage.sel.autenticarusuario.AutenticarUsuarioRequestEBMType;
import mx.com.sky.enterpriseflowmessage.sel.autenticarusuario.AutenticarUsuarioResponseEBMType;
import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;
import mx.com.sky.enterpriseobjects.sel.usuario.UsuarioEBOType;
import mx.com.sky.sel.beans.utils.usuario.UsuarioRegistro;
import mx.com.sky.sel.dto.AutenticarUsuarioRequestDTO;
import mx.com.sky.sel.dto.AutenticarUsuarioResponseDTO;
import mx.com.sky.sel.services.utils.usuario.ServicioUsuario;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.proxyclients.selebf.autenticarusuario.AutenticarUsuarioSelEBF;
import mx.com.sky.sel.proxyclients.selebf.autenticarusuario.AutenticarUsuarioSelEBFEp;

public class DCUsuario implements Serializable {
    @SuppressWarnings("compatibility:-6974456172425681084")
    private static final long serialVersionUID = -6338628455508705394L;
    
    private static final String SKY_PRODUCT = "SKY";

    public DCUsuario() {
        super();
    }
    
    public List<UsuarioRegistro> obtenerUsuariosHijas() {
        List<UsuarioRegistro> usuarios = new ArrayList<UsuarioRegistro>();
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");

        ServicioUsuario su = new ServicioUsuario();
        try {
            usuarios = su.obtenerCuentas(sesion.getSuscriptor().getCuentaSKY());
        } catch (Exception e) {
            LogPC.println(this, e);
        }

        return usuarios;
    }


    public UsuarioRegistro obtenerMiCuenta() {
        UsuarioRegistro usuario = new UsuarioRegistro();
        List<UsuarioRegistro> usuarios = new ArrayList<UsuarioRegistro>();
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");

        ServicioUsuario su = new ServicioUsuario();
        try {
            usuarios = su.obtenerCuentas(sesion.getUsuario().getUid());
            if (usuarios != null && usuarios.size() > 0) {
                usuario = usuarios.get(0);
            }
        } catch (Exception e) {
            LogPC.println(this, e);
        }
        return usuario;
    }
    
    public AutenticarUsuarioResponseDTO autenticarUsuarioPS(AutenticarUsuarioRequestDTO request) {
        AutenticarUsuarioResponseDTO responseDTO = new AutenticarUsuarioResponseDTO();
        AutenticarUsuarioSelEBFEp autenticarUsuarioSelEBFEp = new AutenticarUsuarioSelEBFEp();
        AutenticarUsuarioSelEBF service = autenticarUsuarioSelEBFEp.getAutenticarUsuarioSelEBFPt();
        
        //response
        AutenticarUsuarioResponseEBMType response = null;
        
        //header
        EBMHeaderRequestType header = new EBMHeaderRequestType();
        header.setOperacion(request.getOperacion());
        header.setSistemaOrigen(request.getSistemaOrigen());
        
        //Input
        AutenticarUsuarioInputMessageType input = new AutenticarUsuarioInputMessageType();
        input.setCorreo(request.getEmail());
        input.setPassword(request.getPasswordEncriptado());
        
        //payload
        AutenticarUsuarioRequestEBMType payload = new AutenticarUsuarioRequestEBMType();
        payload.setEBMHeaderRequest(header);
        payload.setAutenticarUsuarioInputMessage(input);
        
        //Llamada al WS
        response = service.autenticarUsuarioSelEBF(payload);
        
        //Generando respuesta
        if( response != null && response.getEBMHeaderResponse() != null && 
            response.getEBMHeaderResponse().getErrorNegocio() != null ) {
            if( response.getEBMHeaderResponse().getErrorNegocio().getCodigoError() != null &&
                response.getEBMHeaderResponse().getErrorNegocio().getCodigoError().equals("0") ) {
                LogPC.println(this, "Llamada al servicio AutenticarUsuarioSelEBF exitosa, se recupera informacion de la respuesta...");
                LogPC.println(this, "CodigoError del WS: " + response.getEBMHeaderResponse().getErrorNegocio().getCodigoError());
                if( response.getListUsuariosSel() != null && response.getListUsuariosSel().getUsuarioSelEBO() != null &&
                    !response.getListUsuariosSel().getUsuarioSelEBO().isEmpty() ) {
                    LogPC.println(this, "Iterando la lista de usuariosSELEBO que regresa el servicio...");
                    for( UsuarioEBOType usuarioEBOType : response.getListUsuariosSel().getUsuarioSelEBO() ) {
                        if( usuarioEBOType != null && usuarioEBOType.getProducto() != null && usuarioEBOType.getProducto().equalsIgnoreCase(SKY_PRODUCT) ) {
                            LogPC.println(this, "Se encontro un uaurioEBOType con producto SKY, este usuario se utilizara como respuesta de este servicio.");
                            LogPC.println(this, "NombreSuscriptor: " + usuarioEBOType.getNombreSuscriptor());
                            LogPC.println(this, "NumeroCuenta: " + usuarioEBOType.getNumeroCuenta());
                            LogPC.println(this, "Producto: " + usuarioEBOType.getProducto());
                            LogPC.println(this, "Nombre: " + usuarioEBOType.getNombre());
                            LogPC.println(this, "APaterno: " + usuarioEBOType.getAPaterno());
                            LogPC.println(this, "AMaterno: " + usuarioEBOType.getAMaterno());
                            responseDTO.setNombreSuscriptor(usuarioEBOType.getNombreSuscriptor());
                            responseDTO.setNumeroCuenta(usuarioEBOType.getNumeroCuenta());
                            responseDTO.setProducto(usuarioEBOType.getProducto());
                            responseDTO.setNombre(usuarioEBOType.getNombre());
                            responseDTO.setApellidoPaterno(usuarioEBOType.getAPaterno());
                            responseDTO.setApedilloMaterno(usuarioEBOType.getAMaterno());
                            break;
                        } else {
                            LogPC.println(this, "El usuarioEBOType no tiene un producto SKY, no se utilizara como respuesta de este servicio.");
                            
                        }
                    }
                } else {
                    LogPC.println(this, "La respuesta del servicio AutenticarUsuarioSelEBF no tiene informacion valida, se debe denegar el acceso del usuario");
                    responseDTO.setDescripcionError("No se pudo obtener los datos de inicio de sesi\u00F3n del cliente, por favor intentar m\u00E1s tarde");
                }
                
            } else if ( response.getEBMHeaderResponse().getErrorNegocio().getDescripcionError() != null &&
                        !response.getEBMHeaderResponse().getErrorNegocio().getDescripcionError().isEmpty() ) {
                LogPC.println(this, "Llamada al servicio AutenticarUsuarioSelEBF regreso un error");
                LogPC.println(this, "Descripcion del error obtenido del WS: " + response.getEBMHeaderResponse().getErrorNegocio().getDescripcionError());
                responseDTO.setDescripcionError("No se pudo obtener los datos de inicio de sesi\u00F3n del cliente, por favor intentar m\u00E1s tarde");
            } else {
                LogPC.println(this, "La llamada al servicio AutenticarUsuarioSelEBF regreso informacion invalida y sin descripcion de error");
                responseDTO.setDescripcionError("No se pudo obtener los datos de inicio de sesi\u00F3n del cliente, por favor intentar m\u00E1s tarde");
            }
        } else {
            LogPC.println(this, "La llamada al servicio AutenticarUsuarioSelEBF no regreso respuesta");
            responseDTO.setDescripcionError("No se pudo obtener los datos de inicio de sesi\u00F3n del cliente, por favor intentar m\u00E1s tarde");
        }
        
        
        return responseDTO;
    }

}
