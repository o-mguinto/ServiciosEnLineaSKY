package mx.com.sky.sel.utils;

import java.io.Serializable;

import java.util.ResourceBundle;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

import mx.com.sky.sel.dto.AutenticarUsuarioRequestDTO;
import mx.com.sky.sel.dto.AutenticarUsuarioResponseDTO;

import mx.com.sky.sel.log.LogPC;

import oracle.adf.model.BindingContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class UtileriasMB implements Serializable {
    @SuppressWarnings("compatibility:-5133333939131077350")
    private static final long serialVersionUID = 2990686724190639477L;

    public UtileriasMB() {
        super();
    }
    /**
     * Obtiene el contenedor de todos los bindings que están disponibles en ejecución.
     * <br />
     * @return
     */
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }
    /**
     * Mostrar un mensaje en la pantalla, el cual puede ser informativo, error, etc.
     * <br />
     * @param String mensaje
     * @param Severity tipoMensaje
     */
    public void mostrarMensaje(String mensaje, Severity tipoMensaje) {
        FacesMessage facesMessage = new FacesMessage(mensaje);
        facesMessage.setSeverity(tipoMensaje);
        FacesContext.getCurrentInstance().addMessage(null, facesMessage);
    }
    public String getMensajeProperties(String clave) {
        ResourceBundle valCodigos = ResourceBundle.getBundle(Constantes.DIR_PROPS_CODIGO);
        return valCodigos.getString(clave);
    }
    /**
     * Obtiene el valor de algún elemento disponible, a través de su expresión,
     * especificada en el lenguaje de expresiones.
     * <br />
     * @param String el
     * @return Object
     */
    public Object getElExpression(String el) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ELContext elContext = facesContext.getELContext();
        ExpressionFactory expressionFactory = facesContext.getApplication().getExpressionFactory();
        ValueExpression valueExp = expressionFactory.createValueExpression(elContext, el, Object.class);
        return valueExp.getValue(elContext);
    }
    
    protected AutenticarUsuarioResponseDTO obtenerInfoAutenticacion(String usuario, String passEncriptado) {
        AutenticarUsuarioResponseDTO autenticarUsuarioResponseDTO = null;
        AutenticarUsuarioRequestDTO autenticarUsuarioRequestDTO = new AutenticarUsuarioRequestDTO();
        
        autenticarUsuarioRequestDTO.setSistemaOrigen(Constantes.APLICATIVO);
        autenticarUsuarioRequestDTO.setOperacion("AutenticarUsuario");
        autenticarUsuarioRequestDTO.setEmail(usuario);
        autenticarUsuarioRequestDTO.setPasswordEncriptado(passEncriptado);
        
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("autenticarUsuarioPS");
        operationBinding.getParamsMap().put("request", autenticarUsuarioRequestDTO);
        autenticarUsuarioResponseDTO = (AutenticarUsuarioResponseDTO) operationBinding.execute();
        LogPC.println(this,"Response from WS autenticarUsuarioPS: " + autenticarUsuarioResponseDTO);
                
        return autenticarUsuarioResponseDTO;
    }
}
