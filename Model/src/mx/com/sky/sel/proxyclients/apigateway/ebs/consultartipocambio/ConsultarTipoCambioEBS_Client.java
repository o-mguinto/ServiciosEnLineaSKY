package mx.com.sky.sel.proxyclients.apigateway.ebs.consultartipocambio;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;

import javax.ws.rs.client.Client;

import javax.ws.rs.client.ClientBuilder;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import mx.com.sky.sel.proxyclients.apigateway.ebs.consultartipocambio.types.RequestConsultarTipoCambio;
import mx.com.sky.sel.proxyclients.apigateway.ebs.consultartipocambio.types.ResponseConsultarTipoCambio;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.glassfish.jersey.media.sse.SseFeature;

public class ConsultarTipoCambioEBS_Client implements Serializable{
    @SuppressWarnings("compatibility:-6970718629282183095")
    private static final long serialVersionUID = 7889351532122817235L;

    private static final String NOMBRE_WS = "GwConsultarTipoCambioEBS";
    private final String USER;
    private final String PASS;
    private final String URL;
    public ConsultarTipoCambioEBS_Client(String host, String user, String pass) {
        super();
        this.URL = host + NOMBRE_WS;
        this.USER = user;
        this.PASS = pass;
    }
    public ResponseConsultarTipoCambio consultarTipoCambio(RequestConsultarTipoCambio requestWS) {
        ResponseConsultarTipoCambio response = new ResponseConsultarTipoCambio();
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
            response = mapper.readValue(responseString, ResponseConsultarTipoCambio.class);
            System.out.println("Objeto ResponseConsultarTipoCambio = " + response);
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
        
        return response;
    }
}
