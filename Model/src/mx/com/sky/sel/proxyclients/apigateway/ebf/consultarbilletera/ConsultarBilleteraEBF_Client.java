package mx.com.sky.sel.proxyclients.apigateway.ebf.consultarbilletera;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import mx.com.sky.sel.proxyclients.apigateway.ebf.consultarbilletera.types.RequestConsultarBilletera;
import mx.com.sky.sel.proxyclients.apigateway.ebf.consultarbilletera.types.ResponseConsultarBilletera;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.glassfish.jersey.media.sse.SseFeature;

public class ConsultarBilleteraEBF_Client implements Serializable {
    @SuppressWarnings("compatibility:-3319094997298235132")
    private static final long serialVersionUID = -2952480349522562637L;
    
    private static final String NOMBRE_WS = "GwConsultarBilleteraEBF";
    private final String USER;
    private final String PASS;
    private final String URL;
    //https://apigwcsdev.sky.com.mx/GwConsultarBilleteraEBF
    
    public ConsultarBilleteraEBF_Client(String host, String user, String pass) {
        super();
        this.URL = host + NOMBRE_WS;
        this.USER = user;
        this.PASS = pass;
    }
    
    public ResponseConsultarBilletera consultarBilletera(RequestConsultarBilletera requestWS){
        ResponseConsultarBilletera response = new ResponseConsultarBilletera();
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
        System.out.println("User del WS Rest ConsultarBilletera: " + this.USER);
        System.out.println("Pass del WS Rest ConsultarBilletera: " + this.PASS);
        System.out.println("Llamando al WS Rest ConsultarBilletera... ");
        HttpAuthenticationFeature feature = HttpAuthenticationFeature.basic(this.USER, this.PASS);
        client.register(feature);
        client.register(SseFeature.class);
        System.out.println("Endpoint: " + this.URL);
        WebTarget webTarget = client.target(this.URL);
        System.out.println("Llamando al WS Rest ConsultarBilletera... ");
        try{
            responseWS = webTarget.request(MediaType.APPLICATION_JSON).post(Entity.json(requestWSJSON));
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
        System.out.println("LLamada al WS Rest ConsultarBilletera finalizada.");
        String responseString = responseWS.readEntity(String.class);
        responseWS.close();
        System.out.println("String response = " + responseString);
        
        mapper = new ObjectMapper();
        //mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false); 
        //mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true); 
        
        try{
            response = mapper.readValue(responseString, ResponseConsultarBilletera.class);
            System.out.println("Objeto ResponseConsultaBilletera = " + response);
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
        
        return response;
    }

    public String getUSER() {
        return USER;
    }

    public String getPASS() {
        return PASS;
    }

    public String getURL() {
        return URL;
    }
}
