package mx.com.sky.sel.proxyclients.apigateway.ebf.consultarbilletera.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import mx.com.sky.sel.proxyclients.apigateway.headers.response.EBMHeaderResponse;

import java.util.List;

public class ResponseConsultarBilletera implements Serializable {
    @SuppressWarnings("compatibility:-1553124329277080908")
    private static final long serialVersionUID = 7927114740693957842L;
    
    private EBMHeaderResponse header;
    private List<ConsultarBilleteraListInput> items;
    
    public ResponseConsultarBilletera() {
        super();
    }

    public void setHeader(EBMHeaderResponse header) {
        this.header = header;
    }
    
    @JsonProperty("EBMHeaderResponse")
    public EBMHeaderResponse getHeader() {
        return header;
    }

    public void setItems(List<ConsultarBilleteraListInput> items) {
        this.items = items;
    }
    
    @JsonProperty("ConsultarBilleteraListInput")
    public List<ConsultarBilleteraListInput> getItems() {
        return items;
    }

    @Override
    public String toString() {
        String objectString = "";
        
        if( items != null && !items.isEmpty() ) {
            for(ConsultarBilleteraListInput item : items ) {
                objectString = objectString + item;
                objectString = objectString + "--------------------------------------------------------------------...";
            }
            
        }
        
        return objectString;
    }
}
