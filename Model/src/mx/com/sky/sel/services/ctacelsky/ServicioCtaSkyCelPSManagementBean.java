package mx.com.sky.sel.services.ctacelsky;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import mx.com.sky.enterpriseobjects.siebel.consultarctacelsky.ConsultarCtaCelSkyRequestType;
import mx.com.sky.enterpriseobjects.siebel.consultarctacelsky.ConsultarCtaCelSkyResponseType;
import com.oracle.xmlns.pcbpel.adapter.db.dbconsultarctacelskysiebelinterface.DBConsultarCtaCelSkySiebelInterfaceInputType;
import com.oracle.xmlns.pcbpel.adapter.db.dbconsultarctacelskysiebelinterface.DBConsultarCtaCelSkySiebelInterfaceOutputType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;

import mx.com.sky.sel.dto.ConsultarCtaCelSkyRequestDTO;
import mx.com.sky.sel.dto.ConsultarCtaCelSkyResponseDTO;
import mx.com.sky.sel.proxyclients.siebelInterface.consultarctacelsky.ConsultarCtaCelSky;
import mx.com.sky.sel.proxyclients.siebelInterface.consultarctacelsky.ConsultarCtaCelSkyEp;


@Stateless(name = "ServicioCtaSkyCelPSManagement",
           mappedName =
           "SKYServiciosEnLinea-Model-ServicioCtaSkyCelPSManagement")
public class ServicioCtaSkyCelPSManagementBean implements ServicioCtaSkyCelPSManagement,
                                                  ServicioCtaSkyCelPSManagementLocal {
    @Resource
    SessionContext sessionContext;

    public ServicioCtaSkyCelPSManagementBean() {
    }
    
    public ConsultarCtaCelSkyResponseDTO consultarCuenta(ConsultarCtaCelSkyRequestDTO request){
        ConsultarCtaCelSkyResponseDTO response = new ConsultarCtaCelSkyResponseDTO();
        ConsultarCtaCelSkyEp consultarCtaCelSkyEp = new ConsultarCtaCelSkyEp();
        ConsultarCtaCelSky consultarCtaCelSky = consultarCtaCelSkyEp.getConsultarCtaCelSkyPt();
        
        ConsultarCtaCelSkyRequestType consultarCtaCelSkyRequest = new ConsultarCtaCelSkyRequestType();
        DBConsultarCtaCelSkySiebelInterfaceInputType dbConsultarCtaCelSkySiebelInterfaceInput = new DBConsultarCtaCelSkySiebelInterfaceInputType();
        EBMHeaderRequestType headerConsultarCtaCelSky = new EBMHeaderRequestType();
        
        dbConsultarCtaCelSkySiebelInterfaceInput.setNumCelular(request.getNumeroCelular());
        headerConsultarCtaCelSky.setOperacion("consultarCuentaSkyCel");
        headerConsultarCtaCelSky.setSistemaOrigen("SEL");
        
        consultarCtaCelSkyRequest.setEBMHeaderRequest(headerConsultarCtaCelSky);
        consultarCtaCelSkyRequest.setDBConsultarCtaCelSkySiebelInterfaceInput(dbConsultarCtaCelSkySiebelInterfaceInput);
        
        ConsultarCtaCelSkyResponseType consultarCtaCelSkyResponse = consultarCtaCelSky.consultarctacelsky(consultarCtaCelSkyRequest);
        
        if(consultarCtaCelSkyResponse.getEBMHeaderResponse().getErrorNegocio().getCodigoError().equals("0")){
            if(consultarCtaCelSkyResponse.getEBMHeaderResponse().getErrorTecnico().getCode().equals("ok")){
                DBConsultarCtaCelSkySiebelInterfaceOutputType datosCuenta = consultarCtaCelSkyResponse.getDBConsultarCtaCelSkySiebelInterfaceOutputCollection().getDBConsultarCtaCelSkySiebelInterfaceOutput().get(0);
                response.setCodigoError("0");
                response.setDescError("OK");
                response.setMsidn(datosCuenta.getMSISDN());
                response.setNumeroCuenta(datosCuenta.getCUENTA());
            }else{
                response.setCodigoError(consultarCtaCelSkyResponse.getEBMHeaderResponse().getErrorTecnico().getCode());
                response.setDescError("Error Tecnico");
            }
        }else{
            response.setCodigoError(consultarCtaCelSkyResponse.getEBMHeaderResponse().getErrorNegocio().getCodigoError());
            response.setDescError(consultarCtaCelSkyResponse.getEBMHeaderResponse().getErrorNegocio().getDescripcionError());
        }
        
        return response;
    }
}
