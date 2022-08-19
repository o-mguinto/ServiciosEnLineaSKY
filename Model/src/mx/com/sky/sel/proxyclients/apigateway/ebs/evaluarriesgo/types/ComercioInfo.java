package mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarriesgo.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ComercioInfo implements Serializable {
    @SuppressWarnings("compatibility:-4950617021575082441")
    private static final long serialVersionUID = 1L;

    private String comercioId;
    private String transaccionId;
    private String codigoSKY;
    private String indicadorComercio;
        
    public ComercioInfo() {
        super();
    }
    
    public void setComercioId(String comercioId) {
            this.comercioId = comercioId;
        }
        
        @JsonProperty("ComercioId")
        public String getComercioId() {
            return comercioId;
        }

        public void setCodigoSKY(String codigoSKY) {
            this.codigoSKY = codigoSKY;
        }
        
        @JsonProperty("CodigoSKY")
        public String getCodigoSKY() {
            return codigoSKY;
        }

        public void setIndicadorComercio(String indicadorComercio) {
            this.indicadorComercio = indicadorComercio;
        }
        
        @JsonProperty("IndicadorComercio")
        public String getIndicadorComercio() {
            return indicadorComercio;
        }

        public void setTransaccionId(String transaccionId) {
            this.transaccionId = transaccionId;
        }
        @JsonProperty("TransaccionId")
        public String getTransaccionId() {
            return transaccionId;
        }
        
}
