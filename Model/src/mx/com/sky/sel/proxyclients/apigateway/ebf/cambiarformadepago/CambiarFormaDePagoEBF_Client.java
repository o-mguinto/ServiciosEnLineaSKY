package mx.com.sky.sel.proxyclients.apigateway.ebf.cambiarformadepago;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import mx.com.sky.sel.proxyclients.apigateway.ebf.cambiarformadepago.type.RequestCambiarFormaDePago;
import mx.com.sky.sel.proxyclients.apigateway.ebf.cambiarformadepago.type.ResponseCambiarFormaDePago;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.glassfish.jersey.media.sse.SseFeature;

public class CambiarFormaDePagoEBF_Client implements Serializable {
    @SuppressWarnings("compatibility:-2416544922691985457")
    private static final long serialVersionUID = 6284276637348432984L;

    private static final String NOMBRE_WS = "GwCambiarFormaDePagoEBF";
    private final String USER;
    private final String PASS;
    //prueba para hacer commit
    private final String URL;
    public CambiarFormaDePagoEBF_Client(String host, String user, String pass) {
        super();
        this.URL = host + NOMBRE_WS;
        this.USER = user;
        this.PASS = pass;
    }
    public ResponseCambiarFormaDePago cambiarFormaDePago(RequestCambiarFormaDePago requestWS){
        ResponseCambiarFormaDePago response = new ResponseCambiarFormaDePago();
        String requestWSJSON = "";
        ObjectMapper mapper =  new ObjectMapper();
        
        try{
            requestWSJSON = mapper.writeValueAsString(requestWS);
            System.out.println(requestWSJSON);
        }catch(Exception e) {
            System.out.println(e);
            return null;
        }
        
        Client client = ClientBuilder.newClient();
        
        HttpAuthenticationFeature feature = HttpAuthenticationFeature.basic(this.USER, this.PASS);
        client.register(feature);
        client.register(SseFeature.class);
        
        WebTarget webTarget = client.target(this.URL);
        Response responseWS = webTarget.request(MediaType.APPLICATION_JSON).post(Entity.json(requestWSJSON));
        String responseString = responseWS.readEntity(String.class);
        responseWS.close();
        System.out.println("String response = " + responseString);
        
        mapper =  new ObjectMapper();
        
        try{
            response = mapper.readValue(responseString, ResponseCambiarFormaDePago.class);
            System.out.println("Objeto ResponseCambiarFormaDePago = " + response);
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
        
        return response;
    }
}
