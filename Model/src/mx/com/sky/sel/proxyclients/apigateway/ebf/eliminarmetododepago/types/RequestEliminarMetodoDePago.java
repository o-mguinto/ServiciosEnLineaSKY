package mx.com.sky.sel.proxyclients.apigateway.ebf.eliminarmetododepago.types;

import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.List;

import mx.com.sky.sel.proxyclients.apigateway.headers.request.EBMHeaderRequest;

public class RequestEliminarMetodoDePago implements Serializable {
    @SuppressWarnings("compatibility:-1303040489983204684")
    private static final long serialVersionUID = -7317616720910094254L;


    private EBMHeaderRequest header;
    private List<BilleteraDePagoListInput> billeteradepagolistinput;

    public RequestEliminarMetodoDePago() {
        super();
    }

    public EBMHeaderRequest getHeader() {
        return header;
    }

    public void setHeader(EBMHeaderRequest header) {
        this.header = header;
    }


    public void setBilleteradepagolistinput(List<BilleteraDePagoListInput> billeteradepagolistinput) {
        this.billeteradepagolistinput = billeteradepagolistinput;
    }

    @JsonProperty("BilleteraDePagoListInput")
    public List<BilleteraDePagoListInput> getBilleteradepagolistinput() {
        return billeteradepagolistinput;
    }


}
