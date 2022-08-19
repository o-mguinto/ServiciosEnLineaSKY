package mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarreto;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarreto.types.RequestEvaluarReto3DS;
import mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarreto.types.ResponseEvaluarReto3DS;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.glassfish.jersey.media.sse.SseFeature;

public class EvaluarReto3DSEBS_Client implements Serializable {
    @SuppressWarnings("compatibility:-4566955601266559023")
    private static final long serialVersionUID = 1L;


    private static final String NOMBRE_WS = "GwEvaluarReto3DSEBS";
    private final String USER;
    private final String PASS;
    private final String URL;
    //https://apigwcsdev.sky.com.mx/GwEvaluarReto3DSEBS
    public EvaluarReto3DSEBS_Client(String host, String user, String pass) {
        super();
        this.URL = host + NOMBRE_WS;
        this.USER = user;
        this.PASS = pass;
    }

    public ResponseEvaluarReto3DS evaluarReto3ds(RequestEvaluarReto3DS requestWS) {
        ResponseEvaluarReto3DS response = new ResponseEvaluarReto3DS();
        String requestWSJSON = "";
        ObjectMapper mapper = new ObjectMapper();

        try {
            requestWSJSON = mapper.writeValueAsString(requestWS);
            System.out.println(requestWSJSON);
        } catch (Exception e) {
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

        try {
            response = mapper.readValue(responseString, ResponseEvaluarReto3DS.class);
            System.out.println("Objeto ResponseEvaluarReto3DS = " + response);
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }

        return response;
    }
}
