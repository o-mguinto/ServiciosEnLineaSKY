package mx.com.sky.sel.proxyclients.apigateway.headers.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

public class SeguridadList implements Serializable {
    @SuppressWarnings("compatibility:1306410250340526055")
    private static final long serialVersionUID = -3566118174617720925L;
    
    private List<SeguridadItem> items;
    
    public SeguridadList() {
        super();
        this.items = new ArrayList<SeguridadItem>();
        SeguridadItem elemItem = new SeguridadItem();
        this.items.add(elemItem);
    }

    public void setItems(List<SeguridadItem> items) {
        this.items = items;
    }
    
    @JsonProperty("SeguridadItem")
    public List<SeguridadItem> getItems() {
        return items;
    }
}
