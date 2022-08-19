package mx.com.sky.sel.proxyclients.apigateway.ebs.consultarproducto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import java.util.List;

public class ListOfInstanceComponent implements Serializable {
    @SuppressWarnings("compatibility:-8290042628064122341")
    private static final long serialVersionUID = -8782193812530260098L;

    private List<InstanceComponent> instanceComponent;
    public ListOfInstanceComponent() {
        super();
    }

    public void setInstanceComponent(List<InstanceComponent> instanceComponent) {
        this.instanceComponent = instanceComponent;
    }
    @JsonProperty("InstanceComponent")
    public List<InstanceComponent> getInstanceComponent() {
        return instanceComponent;
    }
}
