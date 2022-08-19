package mx.com.sky.sel.proxyclients.apigateway.ebf.orquestarprocesopago;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import mx.com.sky.sel.proxyclients.apigateway.ebf.orquestarprocesopago.types.RequestOrquestarProcesoPagoPMP;
import mx.com.sky.sel.proxyclients.apigateway.ebf.orquestarprocesopago.types.ResponseOrquestarProcesoPagoPMP;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.glassfish.jersey.media.sse.SseFeature;

public class OrquestarProcesoPagoPMPEBF_Client implements Serializable {
    @SuppressWarnings("compatibility:-3600098185409675293")
    private static final long serialVersionUID = -6362626026566586774L;
    
    private static final String NOMBRE_WS = "GwOrquestarProcesoPagoPMPEBF";
    private final String USER;
    private final String PASS;
    private final String URL;
    public OrquestarProcesoPagoPMPEBF_Client(String host, String user, String pass) {
        super();
        this.URL = host + NOMBRE_WS;
        this.USER = user;
        this.PASS = pass;
    }
    
    public ResponseOrquestarProcesoPagoPMP orquestarProcesoPagoPMP (RequestOrquestarProcesoPagoPMP requestWS){
        ResponseOrquestarProcesoPagoPMP response = new ResponseOrquestarProcesoPagoPMP();
        
        String requestWSJSON = "";
        ObjectMapper mapper = new ObjectMapper();
        
        try{
            requestWSJSON = mapper.writeValueAsString(requestWS);
            System.out.println(requestWSJSON);
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
        
        System.out.println(this.URL);
        
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
        
        try{
            response = mapper.readValue(responseString, ResponseOrquestarProcesoPagoPMP.class);
            System.out.println("Objeto ResponseEliminarCheckOutAPITokenPci = " + response);
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
