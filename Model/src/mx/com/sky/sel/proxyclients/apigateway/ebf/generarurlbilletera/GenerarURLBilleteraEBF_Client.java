package mx.com.sky.sel.proxyclients.apigateway.ebf.generarurlbilletera;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import mx.com.sky.sel.proxyclients.apigateway.ebf.generarurlbilletera.types.RequestGenerarURLBilletera;
import mx.com.sky.sel.proxyclients.apigateway.ebf.generarurlbilletera.types.ResponseGenerarURLBilletera;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.glassfish.jersey.media.sse.SseFeature;

public class GenerarURLBilleteraEBF_Client implements Serializable {
    @SuppressWarnings("compatibility:-3459045343168076667")
    private static final long serialVersionUID = -2799932576382481286L;

    private static final String NOMBRE_WS = "GwGenerarURLBilleteraEBF";
    private final String USER;
    private final String PASS;
    private final String URL;
    
    public GenerarURLBilleteraEBF_Client(String host, String user, String pass) {
        super();
        this.URL = host + NOMBRE_WS;
        this.USER = user;
        this.PASS = pass;
    }
    
    public ResponseGenerarURLBilletera generarURLBilletera(RequestGenerarURLBilletera requestWS) {
        ResponseGenerarURLBilletera response = new ResponseGenerarURLBilletera();
        Response responseWS = null;
        
        String requestWSJSON = "";
        ObjectMapper mapper = new ObjectMapper();
        
        try{
            requestWSJSON = mapper.writeValueAsString(requestWS);
            System.out.println(requestWSJSON);
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
        
        Client client = ClientBuilder.newClient();
        System.out.println("User del WS Rest GenerarURLBilletera: " + this.USER);
        System.out.println("Pass del WS Rest GenerarURLBilletera: " + this.PASS);
        System.out.println("Llamando al WS Rest GenerarURLBilletera... ");
        HttpAuthenticationFeature feature = HttpAuthenticationFeature.basic(this.USER, this.PASS);
        client.register(feature);
        client.register(SseFeature.class);
        System.out.println("Endpoint: " + this.URL);
        WebTarget webTarget = client.target(this.URL);
        System.out.println("Llamando al WS Rest GenerarURLBilletera... ");
        try{
            responseWS = webTarget.request(MediaType.APPLICATION_JSON).post(Entity.json(requestWSJSON));
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
        System.out.println("LLamada al WS Rest GenerarURLBilletera finalizada.");
        String responseString = responseWS.readEntity(String.class);
        responseWS.close();
        System.out.println("String response = " + responseString);
        
        mapper = new ObjectMapper(); 
        
        try{
            response = mapper.readValue(responseString, ResponseGenerarURLBilletera.class);
            System.out.println("Objeto GenerarURLBilletera = " + response);
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
        
        return response;
    }
}
