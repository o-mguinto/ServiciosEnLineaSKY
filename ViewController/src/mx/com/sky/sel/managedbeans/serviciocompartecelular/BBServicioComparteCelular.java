package mx.com.sky.sel.managedbeans.serviciocompartecelular;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.managedbeans.sesion.SesionMB;
import mx.com.sky.sel.services.beans.utils.LineaCelularDTO;
import mx.com.sky.sel.services.comparte.ConsultaServiciosComparteDTO;
import mx.com.sky.sel.services.comparte.ServicioComparte;
import mx.com.sky.sel.services.comparte.ServicioComparteModelDTO;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.UtileriasMB;

import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import oracle.adf.view.rich.component.rich.RichPopup;

public class BBServicioComparteCelular extends UtileriasMB implements Serializable {
    @SuppressWarnings("compatibility:6794951669245366882")
    private static final long serialVersionUID = 1203283345868739144L;

    private List<SelectItem> lineasCelularesComboBox;
    private String lineaCelularSeleccionada;
    private List<ServicioComparteDTO> serviciosComparteConsultados;
    private ServicioComparteDTO servicioComparteSeleccionado;
    private boolean consultaServiciosComparteValida;
    private transient RichPopup popupConfActServComparte;
    private transient RichPopup popupConfCanServComparte;
    private static final String PAIS_MEX = "Sky Mexico";
    private static final String SERVICIOCOMPARTE_NOMBRE_CRM = "Servicio BTC compartir datos";
    
    public BBServicioComparteCelular() {
        super();
        LogPC.println(this, "***************IN BBServicioComparteCelular CONSTRUCTOR**************************");
        this.consultaServiciosComparteValida = false;
        crearComboBoxLineasCelulares();
    }
    
    private void crearComboBoxLineasCelulares() {
        SesionMB sesion = null;
        sesion = (SesionMB)JSFUtils.getBean("sesion");
        
        if( sesion.getSuscriptor().getLineasCelulares() != null && !sesion.getSuscriptor().getLineasCelulares().isEmpty() ) {
            LogPC.println(this, "--------Lineas celulares del suscriptor (SesionMB):");
            lineasCelularesComboBox = new ArrayList<SelectItem>();
            for(LineaCelularDTO lnCel : sesion.getSuscriptor().getLineasCelulares()) {
                LogPC.println(this, "-----numCelular: " + lnCel.getNumCelular());
                lineasCelularesComboBox.add(new SelectItem(lnCel.getNumCelular(),lnCel.getNumCelular()));
            }
        }
    }
    
    public void actualizaServiciosComparte(ValueChangeEvent valueChangeEvent) {
        this.lineaCelularSeleccionada = (String)valueChangeEvent.getNewValue();
        LogPC.println(this, "In actualizaServiciosComparte... lineaCelularSeleccionada: " + this.lineaCelularSeleccionada);
        this.consultaServiciosComparte(this.lineaCelularSeleccionada);
        //this.consultaServiciosComparteDUMMY(this.lineaCelularSeleccionada);
    }
    
    private void consultaServiciosComparte(String lineaCelular) {
        ServicioComparte servComparteWS = new ServicioComparte();
        ConsultaServiciosComparteDTO responseWS = null;
        String lineaCelAssetNumber = null;
        ServicioComparteDTO servicioComparteDTO = null;
        
        LogPC.println(this, "In consultaServiciosComparte... Consultando servicios comparte para la linea celular: " + lineaCelular);
        if( lineaCelular != null && !lineaCelular.isEmpty() ) {
            this.consultaServiciosComparteValida = true;
            this.serviciosComparteConsultados = new ArrayList<ServicioComparteDTO>();
            ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
            
            //Obtener el assetNumber de la linea celular seleccionada
            if( sesion.getSuscriptor().getLineasCelulares() != null && !sesion.getSuscriptor().getLineasCelulares().isEmpty() ) {
                for(LineaCelularDTO lnCelDto : sesion.getSuscriptor().getLineasCelulares()) {
                    if( lnCelDto.getNumCelular().equalsIgnoreCase(lineaCelular) ) {
                        lineaCelAssetNumber = lnCelDto.getAssetNumber();
                        break;
                    }
                }
            }
            
            if( lineaCelAssetNumber != null && !lineaCelAssetNumber.isEmpty() ) {
                OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_SERVICIOS_COMPARTE);
                responseWS = servComparteWS.consultarServiciosComparte(sesion.getCuentaSKY(), lineaCelAssetNumber, PAIS_MEX);
                if( responseWS.isConsultaExitosa() ) {
                    if( responseWS.getServiciosComparteConsultados() != null && !responseWS.getServiciosComparteConsultados().isEmpty() ) {
                        for( ServicioComparteModelDTO servCompModel : responseWS.getServiciosComparteConsultados() ) {
                            servicioComparteDTO = new ServicioComparteDTO();
                            
                            servicioComparteDTO.setNombreProducto(servCompModel.getNombreProductoSEL());
                            servicioComparteDTO.setNombreProductoCRM(servCompModel.getNombreProductoCRM());
                            servicioComparteDTO.setDescripcion(servCompModel.getDescripcion());
                            servicioComparteDTO.setPrecio(servCompModel.getPrecio());
                            servicioComparteDTO.setVigencia(servCompModel.getVigencia());
                            this.serviciosComparteConsultados.add(servicioComparteDTO);
                        }
                    }
                } else {
                    this.consultaServiciosComparteValida = false;
                    mostrarMensaje("Ocurrio un error al consultar los servicios comparte, llamar a atención a clientes para mayor información.", FacesMessage.SEVERITY_ERROR);
                    LogPC.println(this, "Ocurrio un error al consultar los servicios comparte para la linea celular: " + lineaCelular);
                    LogPC.println(this, "Descripcion del error: " + responseWS.getDescripcionError());
                }
            } else {
                mostrarMensaje("Ocurrio un error al consultar los servicios comparte, llamar a atención a clientes para mayor información.", FacesMessage.SEVERITY_ERROR);
                this.consultaServiciosComparteValida = false;
                LogPC.println(this, "No se encontro el asset number para la linea celular: " + lineaCelular);
            }
        } else {
            this.consultaServiciosComparteValida = false;
        }
    }
    
    private void consultaServiciosComparteDUMMY(String lineaCelular) {
        //TODO Implementar metodo
        LogPC.println(this, "In consultaServiciosComparteDUMMY... Consultando servicios comparte para la linea celular: " + lineaCelular);
        
        
        ServicioComparteDTO servicioComparteDummy = null;
        
        if( lineaCelular != null && !lineaCelular.isEmpty() ) {
            this.consultaServiciosComparteValida = true;
            this.serviciosComparteConsultados = new ArrayList<ServicioComparteDTO>();
            if( lineaCelular.equalsIgnoreCase("1000437308") ) {
                servicioComparteDummy = new ServicioComparteDTO();
                servicioComparteDummy.setNombreProducto("Servicio Comparte");
                servicioComparteDummy.setNombreProductoCRM("Servicio BTC compartir datos");
                servicioComparteDummy.setDescripcion("Funcionalidad para compartir la bolsa de datos del Plan Blue Telecomm Cel mediante la modalidad de Hotspot.");
                servicioComparteDummy.setPrecio("100");
                servicioComparteDummy.setVigencia("31");
                this.serviciosComparteConsultados.add(servicioComparteDummy);
            }
        } else {
            this.consultaServiciosComparteValida = false;
        }
        
    }
    
    public String showPopupActivarServicioComparte() {
        String result = "ok";
        LogPC.println(this, "In showPopupActivarServicioComparte method. servicioComparteSeleccionado: " + this.servicioComparteSeleccionado.getNombreProducto());
        LogPC.println(this, "In showPopupActivarServicioComparte method. lineaCelularSeleccionada: " + this.lineaCelularSeleccionada);
        ADFUtils.showPopup(popupConfActServComparte);
        return result;
    }
    
    public String showPopupCancelarServicioComparte() {
        String result = "ok";
        LogPC.println(this, "In showPopupCancelarServicioComparte method. lineaCelularSeleccionada: " + this.lineaCelularSeleccionada);
        ADFUtils.showPopup(popupConfCanServComparte);
        return result;
    }
    
    public String activarServicioComparte() {
        LogPC.println(this, "In activarServicioComparte method. servicioComparteSeleccionado.NombreProducto: " + this.servicioComparteSeleccionado.getNombreProducto());
        LogPC.println(this, "In activarServicioComparte method. servicioComparteSeleccionado.NombreProductoCRM: " + this.servicioComparteSeleccionado.getNombreProductoCRM());
        LogPC.println(this, "In activarServicioComparte method. lineaCelularSeleccionada: " + this.lineaCelularSeleccionada);
        ServicioComparte servComparteWS = new ServicioComparte();
        String assetNumber = null;
        String respuestaWS = null;
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        
        //Obtener el assetNumber de la linea celular seleccionada
        if( sesion.getSuscriptor().getLineasCelulares() != null && !sesion.getSuscriptor().getLineasCelulares().isEmpty() ) {
            for(LineaCelularDTO lnCelDto : sesion.getSuscriptor().getLineasCelulares()) {
                if( lnCelDto.getNumCelular().equalsIgnoreCase(this.lineaCelularSeleccionada) ) {
                    assetNumber = lnCelDto.getAssetNumber();
                    break;
                }
            }
        }
        
        if( assetNumber != null && !assetNumber.isEmpty() ) {
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.ACTIVAR_SERVICIO_COMPARTE);
            respuestaWS = servComparteWS.activarServicioComparte(sesion.getCuentaSKY(), assetNumber, this.servicioComparteSeleccionado.getNombreProductoCRM());
            
            if( respuestaWS != null ) {
                this.consultaServiciosComparte(this.lineaCelularSeleccionada);
                mostrarMensaje("El servicio se activó de forma exitosa en la línea " + this.lineaCelularSeleccionada, FacesMessage.SEVERITY_INFO);
            } else {
                mostrarMensaje("Ocurrio un error al activar el servicio, llamar a atención a clientes para mayor información.", FacesMessage.SEVERITY_ERROR);
            }
        } else {
            LogPC.println(this, "No se pudo recuperar el asset number para la linea: " + this.lineaCelularSeleccionada);
            mostrarMensaje("Ocurrio un error al activar el servicio, llamar a atención a clientes para mayor información.", FacesMessage.SEVERITY_ERROR);
        }
        
        ADFUtils.hidePopup(popupConfActServComparte);
        return null;
    }
    
    public String cancelarActivarServicioComparte() {
        LogPC.println(this, "In cancelarActivarServicioComparte method. servicioComparteSeleccionado: " + this.servicioComparteSeleccionado.getNombreProducto());
        LogPC.println(this, "In cancelarActivarServicioComparte method. lineaCelularSeleccionada: " + this.lineaCelularSeleccionada);
        ADFUtils.hidePopup(popupConfActServComparte);
        return null;
    }
    
    public String cancelarServicioComparte() {
        LogPC.println(this, "In cancelarServicioComparte method. lineaCelularSeleccionada: " + this.lineaCelularSeleccionada);
        
        ServicioComparte servComparteWS = new ServicioComparte();
        String assetNumber = null;
        String respuestaWS = null;
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        
        //Obtener el assetNumber de la linea celular seleccionada
        if( sesion.getSuscriptor().getLineasCelulares() != null && !sesion.getSuscriptor().getLineasCelulares().isEmpty() ) {
            for(LineaCelularDTO lnCelDto : sesion.getSuscriptor().getLineasCelulares()) {
                if( lnCelDto.getNumCelular().equalsIgnoreCase(this.lineaCelularSeleccionada) ) {
                    assetNumber = lnCelDto.getAssetNumber();
                    break;
                }
            }
        }
        
        if( assetNumber != null && !assetNumber.isEmpty() ) {
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CANCELAR_SERVICIO_COMPARTE);
            respuestaWS = servComparteWS.cancelarServicioComparte(sesion.getCuentaSKY(), assetNumber, SERVICIOCOMPARTE_NOMBRE_CRM);
            
            if( respuestaWS != null ) {
                this.consultaServiciosComparte(this.lineaCelularSeleccionada);
                mostrarMensaje("El servicio se canceló de forma exitosa en la línea " + this.lineaCelularSeleccionada, FacesMessage.SEVERITY_INFO);
            } else {
                mostrarMensaje("Ocurrio un error al cancelar el servicio, llamar a atención a clientes para mayor información.", FacesMessage.SEVERITY_ERROR);
            }
        } else {
            LogPC.println(this, "No se pudo recuperar el asset number para la linea: " + this.lineaCelularSeleccionada);
            mostrarMensaje("Ocurrio un error al cancelar el servicio, llamar a atención a clientes para mayor información.", FacesMessage.SEVERITY_ERROR);
        }
        
        ADFUtils.hidePopup(popupConfCanServComparte);
        return null;
    }
    
    public String cancelarCancelarServicioComparte() {
        LogPC.println(this, "In cancelarCancelarServicioComparte method. lineaCelularSeleccionada: " + this.lineaCelularSeleccionada);
        ADFUtils.hidePopup(popupConfCanServComparte);
        return null;
    }
    
    //Custom Accessors
    public boolean isLineasCelDisponibles() {
        boolean lineasCelDisponibles = false;
        
        if( lineasCelularesComboBox != null && !lineasCelularesComboBox.isEmpty() )
            lineasCelDisponibles = true;
        
        return lineasCelDisponibles;
    }
    
    public int getNumLineasCelular() {
        int numLineasCelular = 0;
        if( this.lineasCelularesComboBox != null ) {
            numLineasCelular = this.lineasCelularesComboBox.size();
        }
        return numLineasCelular;
    }

    public List<SelectItem> getLineasCelularesComboBox() {
        return lineasCelularesComboBox;
    }

    public void setLineaCelularSeleccionada(String lineaCelularSeleccionada) {
        this.lineaCelularSeleccionada = lineaCelularSeleccionada;
    }

    public String getLineaCelularSeleccionada() {
        return lineaCelularSeleccionada;
    }

    public List<ServicioComparteDTO> getServiciosComparteConsultados() {
        return serviciosComparteConsultados;
    }
    
    public boolean isExistenServiciosComparte() {
        boolean existenServiciosComparte = false;
        
        if( this.serviciosComparteConsultados != null && !this.serviciosComparteConsultados.isEmpty() ) {
            existenServiciosComparte = true;
        }
        
        return existenServiciosComparte;
    }

    public boolean isConsultaServiciosComparteValida() {
        return consultaServiciosComparteValida;
    }

    public void setServicioComparteSeleccionado(ServicioComparteDTO servicioComparteSeleccionado) {
        this.servicioComparteSeleccionado = servicioComparteSeleccionado;
    }

    public ServicioComparteDTO getServicioComparteSeleccionado() {
        return servicioComparteSeleccionado;
    }

    public void setPopupConfActServComparte(RichPopup popupConfActServComparte) {
        this.popupConfActServComparte = popupConfActServComparte;
    }

    public RichPopup getPopupConfActServComparte() {
        return popupConfActServComparte;
    }

    public void setPopupConfCanServComparte(RichPopup popupConfCanServComparte) {
        this.popupConfCanServComparte = popupConfCanServComparte;
    }

    public RichPopup getPopupConfCanServComparte() {
        return popupConfCanServComparte;
    }
}
