package mx.com.sky.sel.proxyclients.apigateway.ebs.generarjwtoken;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import mx.com.sky.sel.proxyclients.apigateway.ebs.generarjwtoken.types.RequestGenerarJWToken;
import mx.com.sky.sel.proxyclients.apigateway.ebs.generarjwtoken.types.ResponseGenerarJWToken;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.glassfish.jersey.media.sse.SseFeature;

public class GenerarJWTokenEBS_Client implements Serializable {
    @SuppressWarnings("compatibility:-9079538177652517629")
    private static final long serialVersionUID = 1L;


    private static final String NOMBRE_WS = "GwGenerarJWTokenEBS";
    private final String USER;
    private final String PASS;
    private final String URL;
    
    public GenerarJWTokenEBS_Client(String host, String user, String pass) {
        super();
        this.URL = host + NOMBRE_WS;
        this.USER = user;
        this.PASS = pass;
    }
    public ResponseGenerarJWToken generarJWTokenEBS(RequestGenerarJWToken requestWSGenJwtoken){
        ResponseGenerarJWToken response = new ResponseGenerarJWToken();
        String requestWSJSON = "";
        ObjectMapper mapper = new ObjectMapper();
        
        try{
            requestWSJSON = mapper.writeValueAsString(requestWSGenJwtoken);
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
            response = mapper.readValue(responseString, ResponseGenerarJWToken.class);
            System.out.println("Objeto ResponseConsultarBines = " + response);
            System.out.println("hesder rsp EvalRiesgo: "+response.getHeader());
            System.out.println("hesder.negocio rsp EvalRiesgo: "+response.getHeader().getErrorNegocio());
            System.out.println("hesder.negocio.codErr rsp EvalRiesgo: "+response.getHeader().getErrorNegocio().getCodigoError());
            System.out.println("hesder.negocio.estado rsp EvalRiesgo: "+response.getHeader().getErrorNegocio().getEstado());
            System.out.println("--------------");
            System.out.println("hesder.tecnico rsp EvalRiesgo: "+response.getHeader().getErrorTecnico());
            System.out.println("hesder.tecnico.code rsp EvalRiesgo: "+response.getHeader().getErrorTecnico().getCode());
            System.out.println("hesder.tecnico.detail rsp EvalRiesgo: "+response.getHeader().getErrorTecnico().getDetail());
            System.out.println("hesder.tecnico.smmary rsp EvalRiesgo: "+response.getHeader().getErrorTecnico().getSummary());
            System.out.println("hesder.tecnico.sistema rsp EvalRiesgo: "+response.getHeader().getErrorTecnico().getSistema());

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
