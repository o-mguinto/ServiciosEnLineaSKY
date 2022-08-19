package mx.com.sky.sel.proxyclients.apigateway.ebs.consultarproducto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import java.util.List;

public class ListOfProduct implements Serializable {
    @SuppressWarnings("compatibility:-8727149551633340596")
    private static final long serialVersionUID = -6592599675163305104L;

    private List<Product> product;
    public ListOfProduct() {
        super();
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }
    @JsonProperty("Product")
    public List<Product> getProduct() {
        return product;
    }
}
