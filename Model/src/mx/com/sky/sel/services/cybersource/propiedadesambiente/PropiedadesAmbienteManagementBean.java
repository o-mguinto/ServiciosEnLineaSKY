package mx.com.sky.sel.services.cybersource.propiedadesambiente;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.lang.management.ManagementFactory;

import java.util.List;
import java.util.Properties;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import mx.com.sky.sel.services.beans.cybersource.ConsultarPropiedadAmbienteResponseDTO;

@Stateless(name = "PropiedadesAmbienteManagement", mappedName = "SEL-PropiedadesAmbienteManagement")
public class PropiedadesAmbienteManagementBean implements PropiedadesAmbienteManagement,
                                                          PropiedadesAmbienteManagementLocal {
    @Resource
    SessionContext sessionContext;
    
    private String hostAPIGW;
    private String accessKey;
    private String profileId;
    private String secretKey;
    private String urlDeviceFingerPrint;
    private String merchantId;
    private String orgID;
    private String userAPIGW;
    private String passAPIGW;
    private String hostCheckOutAPI;
    private String hostSelTokRedirect;

    public PropiedadesAmbienteManagementBean() {
    }

    @Override
    public ConsultarPropiedadAmbienteResponseDTO consultarPropiedadesAmbiente(List<Integer> idsPropiedades) {
        ConsultarPropiedadAmbienteResponseDTO response = new ConsultarPropiedadAmbienteResponseDTO();
        if(this.hostAPIGW == null){
            System.out.println("Propiedades no cargadas.");
            try {
                String ambiente = this.obtenerAmbiente();
                Properties properties = new Properties();
                properties.load(PropiedadesAmbienteManagementBean.class.getResourceAsStream("/mx/com/sky/sel/resources/Propiedades_" + ambiente + ".properties"));
                System.out.println("Propiedades recuperadas:");
                System.out.println(properties.getProperty("HOST_APIGW"));
                System.out.println(properties.getProperty("URL_DEVICE_FINGERPRINT"));
                System.out.println(properties.getProperty("MERCHANT_ID"));
                System.out.println(properties.getProperty("ORG_ID"));
                System.out.println(properties.getProperty("ACCESS_KEY"));
                System.out.println(properties.getProperty("PROFILE_ID"));
                System.out.println(properties.getProperty("SECRET_KEY"));
                System.out.println(properties.getProperty("USER_APIGW"));
                System.out.println(properties.getProperty("PASS_APIGW"));
                System.out.println(properties.getProperty("HOST_CHECKOUT_API"));
                System.out.println(properties.getProperty("HOST_SEL_TOK_REDIRECT"));
                
                this.hostAPIGW = properties.getProperty("HOST_APIGW");
                this.urlDeviceFingerPrint = properties.getProperty("URL_DEVICE_FINGERPRINT");
                this.merchantId = properties.getProperty("MERCHANT_ID");
                this.orgID = properties.getProperty("ORG_ID");
                this.accessKey = properties.getProperty("ACCESS_KEY");
                this.profileId = properties.getProperty("PROFILE_ID");
                this.secretKey = properties.getProperty("SECRET_KEY");
                this.userAPIGW = properties.getProperty("USER_APIGW");
                this.passAPIGW =  properties.getProperty("PASS_APIGW");
                this.hostCheckOutAPI = properties.getProperty("HOST_CHECKOUT_API");
                this.hostSelTokRedirect = properties.getProperty("HOST_SEL_TOK_REDIRECT");
            } catch (FileNotFoundException e) {
              e.printStackTrace();
            } catch (IOException e) {
              e.printStackTrace();
            }
        }
        
        response.setStatus("OK");
        for(Integer idPropiedad : idsPropiedades){
            switch(idPropiedad){
                case 0:
                    response.getPropiedades().put(0, this.hostAPIGW);
                    break;
                case 1:
                    response.getPropiedades().put(1, this.profileId);
                    break;
                case 2:
                    response.getPropiedades().put(2, this.accessKey);
                    break;
                case 3:
                    response.getPropiedades().put(3, this.secretKey);
                    break;
                case 4:
                    response.getPropiedades().put(4, this.merchantId);
                    break;
                case 5:
                    response.getPropiedades().put(5, this.orgID);
                    break;
                case 6:
                    response.getPropiedades().put(6, this.userAPIGW);
                    break;
                case 7:
                    response.getPropiedades().put(7, this.passAPIGW);
                    break;
                case 8:
                    response.getPropiedades().put(8, this.hostCheckOutAPI);
                    break;
                case 9:
                    response.getPropiedades().put(9, this.hostSelTokRedirect);
                    break;
                default:
                    response.setStatus("KO");
                    return response;
            }
        }
        
        return response;
    }
    
    private String obtenerAmbiente(){
        List<String> argumentos = ManagementFactory.getRuntimeMXBean().getInputArguments();
        /*Iterator<String> it = ManagementFactory.getRuntimeMXBean().getSystemProperties().keySet().iterator();
        while(it.hasNext()){
            String key = it.next();
            System.out.println(key + " = " + ManagementFactory.getRuntimeMXBean().getSystemProperties().get(key));
        }*/
        System.out.println("Buscando ambiente en " + argumentos.size() + " argumentos");
        for(String arg : argumentos){
            //System.out.println(arg);
            switch(arg){
                case "-Dambiente=DES":
                    return "DES";
                case "-Dambiente=QA":
                    return "QA"; 
                case "-Dambiente=PRE":
                    return "PRE";
                case "-Dambiente=PROD":
                    return "PROD";
            }
        }
        return "LOCAL";
        //return "DES";
    }
}
