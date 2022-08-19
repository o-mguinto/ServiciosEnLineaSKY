package mx.com.sky.sel.proxyclients.apigateway.headers.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ErrorTecnico implements Serializable {
    @SuppressWarnings("compatibility:-2474398052472388182")
    private static final long serialVersionUID = 1664366813645704158L;
    
    private String code;
    private String summary;
    private String detail;
    private String sistema;
    
    public ErrorTecnico() {
        super();
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
    
    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
    
    @JsonProperty("detail")
    public String getDetail() {
        return detail;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }
    
    @JsonProperty("Sistema")
    public String getSistema() {
        return sistema;
    }
}
