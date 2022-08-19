package mx.com.sky.sel.proxyclients.apigateway.ebs.consultarproducto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import java.util.List;

public class ListOfServiceInstance implements Serializable {
    @SuppressWarnings("compatibility:5808309728122262411")
    private static final long serialVersionUID = 8183301059945795534L;


    private List<ServiceInstance> serviceInstance;
    
    public ListOfServiceInstance() {
        super();
    }

    public void setServiceInstance(List<ServiceInstance> serviceInstance) {
        this.serviceInstance = serviceInstance;
    }
    @JsonProperty("ServiceInstance")
    public List<ServiceInstance> getServiceInstance() {
        return serviceInstance;
    }
}
