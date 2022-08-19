package mx.com.sky.sel.services.beans.cybersource;

import java.io.Serializable;

import java.util.HashMap;

public class ConsultarPropiedadAmbienteResponseDTO implements Serializable {
    @SuppressWarnings("compatibility:-1643699197741121189")
    private static final long serialVersionUID = 8205472339369528684L;
    
    private String status;
    private HashMap<Integer, String> propiedades;
    
    public ConsultarPropiedadAmbienteResponseDTO() {
        super();
        this.propiedades = new HashMap<Integer, String>();
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setPropiedades(HashMap<Integer, String> propiedades) {
        this.propiedades = propiedades;
    }

    public HashMap<Integer, String> getPropiedades() {
        return propiedades;
    }
}
