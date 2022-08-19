package mx.com.sky.sel.proxyclients.apigateway.ebs.consultartipocambio.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import mx.com.sky.sel.proxyclients.apigateway.headers.request.EBMHeaderRequest;

public class RequestConsultarTipoCambio implements Serializable {
    @SuppressWarnings("compatibility:-3877013392175134491")
    private static final long serialVersionUID = -2736411596280505593L;

    private EBMHeaderRequest header;
    private ConsultarTipoCambioInput input;

    public RequestConsultarTipoCambio() {
        super();
    }

    public void setHeader(EBMHeaderRequest header) {
        this.header = header;
    }
    @JsonProperty("EBMHeaderRequest")
    public EBMHeaderRequest getHeader() {
        return header;
    }

    public void setInput(ConsultarTipoCambioInput input) {
        this.input = input;
    }
    @JsonProperty("DbConsultarTipoCambioPciABCSSelect_pId_pPais_pEstatusInputParameters")
    public ConsultarTipoCambioInput getInput() {
        return input;
    }
}
