package mx.com.sky.sel.services.beans.cybersource;

import java.io.Serializable;

public class ConsultarTipoCambioRequestDTO implements Serializable {
    @SuppressWarnings("compatibility:-5450024322573768605")
    private static final long serialVersionUID = 3964932886376636751L;

    private String pPais;
    private String pEstatus;
    
    public ConsultarTipoCambioRequestDTO() {
        super();
    }


    public void setPPais(String pPais) {
        this.pPais = pPais;
    }

    public String getPPais() {
        return pPais;
    }

    public void setPEstatus(String pEstatus) {
        this.pEstatus = pEstatus;
    }

    public String getPEstatus() {
        return pEstatus;
    }

}
