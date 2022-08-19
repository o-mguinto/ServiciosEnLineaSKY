package mx.com.sky.sel.proxyclients.apigateway.ebf.eliminarmetododepago;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import mx.com.sky.sel.proxyclients.apigateway.ebf.eliminarmetododepago.types.RequestEliminarMetodoDePago;
import mx.com.sky.sel.proxyclients.apigateway.ebf.eliminarmetododepago.types.ResponseEliminarMetodoDePago;


import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.glassfish.jersey.media.sse.SseFeature;

public class EliminarMetodoDePagoEBF_Client implements Serializable {
    @SuppressWarnings("compatibility:4083942987483399557")
    private static final long serialVersionUID = -931968687064529368L;


    private static final String NOMBRE_WS = "GwEliminarMetodoDePagoEBF";
    private final String USER;
    private final String PASS;
    private final String URL;
    
    public EliminarMetodoDePagoEBF_Client(String host, String user, String pass) {
        super();
        this.URL = host + NOMBRE_WS;
        this.USER = user;
        this.PASS = pass;
    }

    public ResponseEliminarMetodoDePago eliminarMetodoDePago(RequestEliminarMetodoDePago requestWS) {
        ResponseEliminarMetodoDePago response = new ResponseEliminarMetodoDePago();
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
        System.out.println("User del WS Rest EliminarMetodoDePagoEBF: " + this.USER);
        System.out.println("Pass del WS Rest EliminarMetodoDePagoEBF: " + this.PASS);
        System.out.println("Llamando al WS Rest EliminarMetodoDePagoEBF... ");
        HttpAuthenticationFeature feature = HttpAuthenticationFeature.basic(this.USER, this.PASS);
        client.register(feature);
        client.register(SseFeature.class);
        System.out.println("Endpoint: " + this.URL);
        WebTarget webTarget = client.target(this.URL);
        System.out.println("Llamando al WS Rest EliminarMetodoDePagoEBF... ");
        try{
            responseWS = webTarget.request(MediaType.APPLICATION_JSON).post(Entity.json(requestWSJSON));
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
        System.out.println("LLamada al WS Rest EliminarMetodoDePagoEBF finalizada.");
        String responseString = responseWS.readEntity(String.class);
        responseWS.close();
        System.out.println("String response = " + responseString);
        
        mapper = new ObjectMapper(); 
        
        try{
            response = mapper.readValue(responseString, ResponseEliminarMetodoDePago.class);
            System.out.println("Objeto EliminarMetodoDePago = " + response);
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
        
        return response;
    }
}
