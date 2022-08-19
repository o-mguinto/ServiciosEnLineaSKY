package mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarreto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class InformacionDePago implements Serializable {
    @SuppressWarnings("compatibility:-7430529269866226524")
    private static final long serialVersionUID = 1L;
    private Tarjeta tarjeta;

    public InformacionDePago() {
        super();
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    @JsonProperty("Tarjeta")
    public Tarjeta getTarjeta() {
        return tarjeta;
    }
}
