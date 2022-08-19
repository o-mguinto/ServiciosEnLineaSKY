package mx.com.sky.sel.services.multicanal.chat;
import java.io.Serializable;

import javax.xml.bind.JAXBElement;

import mx.com.sky.sel.proxyclients.rnsoa.generaurlchat.types.CabeceraInputTYPE;
import mx.com.sky.sel.proxyclients.rnsoa.generaurlchat.types.GeneraChatRNInputABM;
import mx.com.sky.sel.proxyclients.rnsoa.generaurlchat.types.GeneraChatRNInputABMTYPE;
import mx.com.sky.sel.proxyclients.rnsoa.generaurlchat.types.GeneraChatRNOutputABM;
import mx.com.sky.sel.proxyclients.rnsoa.generaurlchat.GeneraURLChatRNInterface;
import mx.com.sky.sel.proxyclients.rnsoa.generaurlchat.GeneraURLChatRNInterfaceSOAPEp;
import mx.com.sky.sel.proxyclients.rnsoa.generaurlchat.types.ObjectFactory;

public class ServicioChat implements Serializable{
    @SuppressWarnings("compatibility:-2581169292700196102")
    private static final long serialVersionUID = 2536320023195161760L;

    public ServicioChat() {
        super();
    }
    public GeneraChatRNOutputABM consultaURLChat(String numCuenta, String mail){
        return consultaURLChat(numCuenta, mail, "CHAT");
    }
    
    public GeneraChatRNOutputABM consultaURLChat(String numCuenta, String mail, String canal){
        GeneraURLChatRNInterfaceSOAPEp generaURLChatRNInterfaceSOAP_ep = new GeneraURLChatRNInterfaceSOAPEp();
        GeneraURLChatRNInterface generaURLChatRNInterface = generaURLChatRNInterfaceSOAP_ep.getGeneraURLChatRNInterfacePt();
        GeneraChatRNInputABM input = new GeneraChatRNInputABM();
        GeneraChatRNOutputABM output = null;
        CabeceraInputTYPE cabecera = new CabeceraInputTYPE();
        GeneraChatRNInputABMTYPE type = new GeneraChatRNInputABMTYPE();
        cabecera.setSistemaOrg("SKYSEL");
        cabecera.setZona("Privada");
        cabecera.setCanal(canal);
        input.setCabeceraInput(cabecera);
        ObjectFactory fact = new ObjectFactory();   
        JAXBElement<String> tipoAtencion = fact.createGeneraChatRNInputABMTYPETipoAtencion("SC");
        type.setTipoAtencion(tipoAtencion );
        JAXBElement<String> email = fact.createGeneraChatRNInputABMTYPEEmail(mail);
        type.setEmail(email);
        JAXBElement<String> numeroCuenta = fact.createGeneraChatRNInputABMTYPECuenta(numCuenta);
        type.setCuenta(numeroCuenta);
        input.setGeneraChatRNInput(type);
        output = generaURLChatRNInterface.generaURLChat(input);
        
        return output;
    }
}
