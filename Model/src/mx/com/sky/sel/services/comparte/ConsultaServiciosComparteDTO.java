package mx.com.sky.sel.services.comparte;

import java.io.Serializable;

import java.util.List;

public class ConsultaServiciosComparteDTO implements Serializable {
    @SuppressWarnings("compatibility:-7098107800708296116")
    private static final long serialVersionUID = 5686374690925102001L;
    
    private boolean consultaExitosa;
    private String descripcionError;
    private List<ServicioComparteModelDTO> serviciosComparteConsultados;
    
    public ConsultaServiciosComparteDTO() {
        super();
    }

    public void setConsultaExitosa(boolean consultaExitosa) {
        this.consultaExitosa = consultaExitosa;
    }

    public boolean isConsultaExitosa() {
        return consultaExitosa;
    }

    public void setDescripcionError(String descripcionError) {
        this.descripcionError = descripcionError;
    }

    public String getDescripcionError() {
        return descripcionError;
    }

    public void setServiciosComparteConsultados(List<ServicioComparteModelDTO> serviciosComparteConsultados) {
        this.serviciosComparteConsultados = serviciosComparteConsultados;
    }

    public List<ServicioComparteModelDTO> getServiciosComparteConsultados() {
        return serviciosComparteConsultados;
    }
}
