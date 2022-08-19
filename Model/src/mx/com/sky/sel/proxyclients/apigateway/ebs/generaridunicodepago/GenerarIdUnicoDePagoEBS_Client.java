package mx.com.sky.sel.proxyclients.apigateway.ebs.generaridunicodepago;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import mx.com.sky.sel.proxyclients.apigateway.ebs.generaridunicodepago.types.RequestGenerarIdUnicoDePago;
import mx.com.sky.sel.proxyclients.apigateway.ebs.generaridunicodepago.types.ResponseGenerarIdUnicoDePago;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.glassfish.jersey.media.sse.SseFeature;

public class GenerarIdUnicoDePagoEBS_Client implements Serializable {
    @SuppressWarnings("compatibility:7002946996451945395")
    private static final long serialVersionUID = -8603567812410267934L;
    
    private static final String NOMBRE_WS = "GwGenerarIdentificadorUnicoDePagoEBS";
    private final String USER;
    private final String PASS;
    private final String URL;
    //https://apigwcsdev.sky.com.mx/GwGenerarIdentificadorUnicoDePagoEBS
    public GenerarIdUnicoDePagoEBS_Client(String host, String user, String pass) {
        super();
        this.URL = host + NOMBRE_WS;
        this.USER = user;
        this.PASS = pass;
    }
    
    public ResponseGenerarIdUnicoDePago generarIdUnicoDePago(RequestGenerarIdUnicoDePago requestWS){
        ResponseGenerarIdUnicoDePago response = new ResponseGenerarIdUnicoDePago();
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
                
        HttpAuthenticationFeature feature = HttpAuthenticationFeature.basic(this.USER, this.PASS);
        client.register(feature);
        client.register(SseFeature.class);
        
        WebTarget webTarget = client.target(this.URL);
        Response responseWS = webTarget.request(MediaType.APPLICATION_JSON).post(Entity.json(requestWSJSON));
        String responseString = responseWS.readEntity(String.class);
        responseWS.close();
        System.out.println("String response = " + responseString);
        
        mapper = new ObjectMapper();
        //mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false); 
        //mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true); 
        
        try{
            response = mapper.readValue(responseString, ResponseGenerarIdUnicoDePago.class);
            System.out.println("Objeto ResponseGenerarIdUnicoDePago = " + response);
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
        
        return response;
    }
}
