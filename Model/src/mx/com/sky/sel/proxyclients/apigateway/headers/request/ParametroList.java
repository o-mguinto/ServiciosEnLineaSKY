package mx.com.sky.sel.proxyclients.apigateway.headers.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

public class ParametroList implements Serializable {
    @SuppressWarnings("compatibility:7374294629024854370")
    private static final long serialVersionUID = -8498047071761526111L;
    
    private List<ParametroItem> items;
    
    public ParametroList() {
        super();
        this.items = new ArrayList<ParametroItem>();
        ParametroItem elemItem = new ParametroItem();
        this.items.add(elemItem);
    }

    public void setItems(List<ParametroItem> items) {
        this.items = items;
    }
    
    @JsonProperty("ParametroItem")
    public List getItems() {
        return items;
    }
}
