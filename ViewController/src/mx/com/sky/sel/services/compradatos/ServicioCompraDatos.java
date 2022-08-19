package mx.com.sky.sel.services.compradatos;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.Map;
import mx.com.sky.sel.proxyclients.selabcs.consultapaqadicionaldatos.ConsultaPaqAdicionalDatosSelABCS;
import mx.com.sky.sel.proxyclients.selabcs.consultapaqadicionaldatos.ConsultaPaqAdicionalDatosSelABCSEp;
import mx.com.sky.enterprisemessages.sel.paqadicionaldatos.ConsultarPaqAdicionalDatosRequestEBMType;
import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;
import mx.com.sky.enterprisemessages.sel.paqadicionaldatos.ConsultarPaqAdicionalDatosResponseEBMType;
import mx.com.sky.enterprisemessages.sel.paqadicionaldatos.ConsultarPaqAdicionalDatosRequestType;
import mx.com.sky.enterpriseobjects.sel.paqadicionaldatos.ListProductFacturacionType;
import mx.com.sky.enterpriseobjects.sel.paqadicionaldatos.PaqAdicionalDatosEBOType;
import mx.com.sky.enterpriseobjects.sel.paqadicionaldatos.ListProductFacturacionType.ProductFacturacion;

import mx.com.sky.sel.proxyclients.soainterface.consultasaldoproducto.ConsultaSaldoProductoSoaInterfaceEp;
import mx.com.sky.sel.proxyclients.soainterface.consultasaldoproducto.ConsultaSaldoProductoSoaInterface;
import mx.com.sky.enterpriseservices.soa.consultasaldoproductointerface.ConsultaSaldoProductoRequestEBMType;
import mx.com.sky.enterpriseservices.soa.consultasaldoproductointerface.ConsultaSaldoProductoResponseEBMType;
import mx.com.sky.soasky.CatalogoProductosConsultaSaldoProductoEntradaTYPE;
import mx.com.sky.soasky.CabeceraEntradaTYPE;
import mx.com.sky.soasky.ListaProductosConsultaSaldoProductoEntradaTYPE;
import mx.com.sky.soasky.ProductoConsultaSaldoProductoEntradaTYPE;

import mx.com.sky.sel.proxyclients.soainterface.gestionarsscomprardatos.GestionarSSComprarDatosSoaInterfaceEp;
import mx.com.sky.sel.proxyclients.soainterface.gestionarsscomprardatos.GestionarSSComprarDatosSoaInterface;
import mx.com.sky.enterpriseobjects.soa.gestionarsscomprardatosinterface.GestionarSSComprarDatosRequestEBMType;
//import mx.com.sky.enterprisemessages.soa.gestionarsscomprardatos.GestionarSSComprarDatosRequestEBMType;
import mx.com.sky.enterpriseobjects.soa.gestionarsscomprardatosinterface.GestionarSSComprarDatosResponseEBMType;
import mx.com.sky.enterprisemessages.soa.gestionarsscomprardatos.ServiceInfoRequestType;
import mx.com.sky.enterprisemessages.soa.gestionarsscomprardatos.ListOfInstancesType;
import mx.com.sky.enterprisemessages.soa.gestionarsscomprardatos.ListOfInstancesType.Instance;
import mx.com.sky.enterprisemessages.soa.gestionarsscomprardatos.ListOfProductsType;
import mx.com.sky.enterprisemessages.soa.gestionarsscomprardatos.ListOfProductsType.Product;

import mx.com.sky.enterpriseobjects.soa.gestionacomponenteinterface.GestionaComponenteResponseEBMType;
import mx.com.sky.sel.proxyclients.soainterface.gestionacomponente.GestionaComponenteSoaInterfaceEp;
import mx.com.sky.sel.proxyclients.soainterface.gestionacomponente.GestionaComponenteSoaInterface;
import mx.com.sky.enterpriseobjects.soa.gestionacomponenteinterface.GestionaComponenteRequestEBMType;
import mx.com.sky.siebelosb.GestionacomponenteEntradaTYPE;
import mx.com.sky.siebelosb.ListaInstanciaType;
import mx.com.sky.siebelosb.ListaProductoType;


import mx.com.sky.enterpriseservices.soa.consultaconsumodatosebm.ConsultaConsumoDatosResponseEBMType;
import mx.com.sky.soasky.BolsasTYPE;

import mx.com.sky.sel.beans.compradatos.PaqueteDatos;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.services.dualplay.consulta.ServicioDualPlay;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.soasky.ProductoConsultaSaldoProductoSalidaTYPE;

import java.math.BigDecimal;

public class ServicioCompraDatos implements Serializable {
    @SuppressWarnings("compatibility:-2762175513782446873")
    private static final long serialVersionUID = -5865639217247886675L;


    public ServicioCompraDatos() {
        super();
    }
    
    public List<PaqueteDatos> consultarPaqueteDatos(String numCuenta, String assetNumbre, String secondAssetNumber, String pais) {
        List<PaqueteDatos> paquetes = new ArrayList<PaqueteDatos>();
        
        ConsultaPaqAdicionalDatosSelABCSEp consultaPaqAdicionalDatosSelABCS_ep = new ConsultaPaqAdicionalDatosSelABCSEp();
        ConsultaPaqAdicionalDatosSelABCS consultaPaqAdicionalDatosSelABCS = consultaPaqAdicionalDatosSelABCS_ep.getConsultaPaqAdicionalDatosSelABCSPt();
        ConsultarPaqAdicionalDatosRequestEBMType request = new ConsultarPaqAdicionalDatosRequestEBMType();
        ConsultarPaqAdicionalDatosResponseEBMType response = null;
        EBMHeaderRequestType headerType = new EBMHeaderRequestType();
        headerType.setOperacion("ConsultaProductoDatos");
        headerType.setSistemaOrigen("SEL");
        request.setEBMHeaderRequest(headerType);
        ConsultarPaqAdicionalDatosRequestType type = new ConsultarPaqAdicionalDatosRequestType();
        type.setCuenta(numCuenta);
        type.setAssetNumber(assetNumbre);
        type.setSecondAssetNumber(secondAssetNumber);
        type.setPais("Sky Mexico");
        request.setConsultarPaqAdicionalDatosRequest(type);
        System.out.println("Peticion ConsultarPaqAdicionalDatos");
        response = consultaPaqAdicionalDatosSelABCS.consultarPaqAdicionalDatos(request);
        System.out.println("Respuesta");
        if (response.getEBMHeaderResponse().getErrorNegocio().getCodigoError().equalsIgnoreCase("0")) {
            PaqueteDatos paqueteDato = null;
            List<PaqAdicionalDatosEBOType> listaPaquetesDatos = null;
            listaPaquetesDatos =  response.getPaquetesAdicionalesDatos().getPaqueteAdicionalDatos();
            for (PaqAdicionalDatosEBOType paqAdicionalDatosEBOType : listaPaquetesDatos) {
                paqueteDato = new PaqueteDatos();
                paqueteDato.setNombre(paqAdicionalDatosEBOType.getNombreProductoCRM());
                paqueteDato.setNombre_display(paqAdicionalDatosEBOType.getNombreProductoSEL());
                int idx= paqAdicionalDatosEBOType.getImagen().indexOf('.');
                String sImg="";
                //si existe el punto
                if (idx >=0){
                    sImg=paqAdicionalDatosEBOType.getImagen().substring(0, idx);//+".svg";
                }else {
                    sImg=paqAdicionalDatosEBOType.getImagen();
                }
                System.out.println("++++++++ +++++++++++ sImg: "+sImg);
                paqueteDato.setImagen(sImg);
                paqueteDato.setCosto(paqAdicionalDatosEBOType.getCosto());
                paqueteDato.setMontoDiferencia(paqAdicionalDatosEBOType.getCostoDiferencia());
                //paqueteDato.setSaldoCuenta(responseEBM.getCatalogoProductosConsultaSaldoProductoSalida().getSALDOACTUAL());
                paquetes.add(paqueteDato);
                
            }
        }
        return paquetes;
    }
    
    public Map<String, List<PaqueteDatos>> consultarServiciosSuplementarios(String numCuenta, String assetNumbre, String secondAssetNumber, String pais) {
        Map<String, List<PaqueteDatos>> serviciosPorCategoria = new TreeMap<String, List<PaqueteDatos>>();
        
        ConsultaPaqAdicionalDatosSelABCSEp consultaPaqAdicionalDatosSelABCS_ep = new ConsultaPaqAdicionalDatosSelABCSEp();
        ConsultaPaqAdicionalDatosSelABCS consultaPaqAdicionalDatosSelABCS = consultaPaqAdicionalDatosSelABCS_ep.getConsultaPaqAdicionalDatosSelABCSPt();
        ConsultarPaqAdicionalDatosRequestEBMType request = new ConsultarPaqAdicionalDatosRequestEBMType();
        ConsultarPaqAdicionalDatosResponseEBMType response = null;
        EBMHeaderRequestType headerType = new EBMHeaderRequestType();
        headerType.setOperacion("ConsultaProductoDatos");
        headerType.setSistemaOrigen("SEL");
        request.setEBMHeaderRequest(headerType);
        ConsultarPaqAdicionalDatosRequestType type = new ConsultarPaqAdicionalDatosRequestType();
        type.setCuenta(numCuenta);
        type.setAssetNumber(assetNumbre);
        type.setSecondAssetNumber(secondAssetNumber);
        type.setPais("Sky Mexico");
        request.setConsultarPaqAdicionalDatosRequest(type);
        System.out.println("Peticion ConsultarPaqAdicionalDatos");
        response = consultaPaqAdicionalDatosSelABCS.consultarPaqAdicionalDatos(request);
        System.out.println("Respuesta");
        if (response.getEBMHeaderResponse().getErrorNegocio().getCodigoError().equalsIgnoreCase("0")) {
            PaqueteDatos paqueteDato = null;
            List<PaqAdicionalDatosEBOType> listaPaquetesDatos = null;
            listaPaquetesDatos =  response.getPaquetesAdicionalesDatos().getPaqueteAdicionalDatos();
            for (PaqAdicionalDatosEBOType paqAdicionalDatosEBOType : listaPaquetesDatos) {
                paqueteDato = new PaqueteDatos();
                paqueteDato.setNombre(paqAdicionalDatosEBOType.getNombreProductoCRM());
                paqueteDato.setNombre_display(paqAdicionalDatosEBOType.getNombreProductoSEL());
                int idx= paqAdicionalDatosEBOType.getImagen().indexOf('.');
                String sImg="";
                //si existe el punto
                if (idx >=0){
                    sImg=paqAdicionalDatosEBOType.getImagen().substring(0, idx);//+".svg";
                }else {
                    sImg=paqAdicionalDatosEBOType.getImagen();
                }
                paqueteDato.setImagen(sImg);
                paqueteDato.setCosto(paqAdicionalDatosEBOType.getCosto());
                paqueteDato.setMontoDiferencia(paqAdicionalDatosEBOType.getCostoDiferencia());
                //String descripcion = "";
                if(paqAdicionalDatosEBOType.getBolsaDatosCantidad() != null && paqAdicionalDatosEBOType.getBolsaDatosCantidad() > 0.0){
                    paqueteDato.setDatos(Math.round(paqAdicionalDatosEBOType.getBolsaDatosCantidad()) + " " + paqAdicionalDatosEBOType.getBolsaDatosUnidad());
                }
                if(paqAdicionalDatosEBOType.getTiempoPaquete() != null && !paqAdicionalDatosEBOType.getTiempoPaquete().isEmpty()){
                    paqueteDato.setMins(paqAdicionalDatosEBOType.getTiempoPaquete() + " " + paqAdicionalDatosEBOType.getUOMTiempoPaquete());
                }
                if(paqAdicionalDatosEBOType.getSMSPaquete() != null && !paqAdicionalDatosEBOType.getSMSPaquete().isEmpty()){
                    paqueteDato.setSms(paqAdicionalDatosEBOType.getSMSPaquete() + " SMS");
                }
                
                String categoriaServicio = paqAdicionalDatosEBOType.getCategoria();
                
                if(!serviciosPorCategoria.containsKey(categoriaServicio)){
                    serviciosPorCategoria.put(categoriaServicio, new ArrayList<PaqueteDatos>());
                }
                serviciosPorCategoria.get(categoriaServicio).add(paqueteDato);
            }
        }
        return serviciosPorCategoria;
    }
    
    public boolean consultaDatosDisponibles(){
        boolean datosDisponibles = false;
        try {
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        ServicioDualPlay servicioDual = new ServicioDualPlay();
        ConsultaConsumoDatosResponseEBMType respuesta= null;
        respuesta = servicioDual.consultaConsumoDatos(sesion.getUsuario().getCuentaSKY(),sesion.getSuscriptor().getMsisdnInternet(),sesion.getSuscriptor().getExternalOffer());
        if (respuesta.getEBMHeaderResponse().getErrorNegocio().getCodigoError().equalsIgnoreCase("0")) {
            List<BolsasTYPE> listaBolsas = respuesta.getSCINTASConsultaConsumoDatosSalida().getListaBolsas().getBolsas();
            for (BolsasTYPE bolsasTYPE : listaBolsas) {
                if (bolsasTYPE.getNombreBolsa().equalsIgnoreCase("BOLSA PRINCIPAL")) {
                    if (Integer.parseInt(bolsasTYPE.getDatosDisponibles().replaceAll(" GB", "")) == 0) {
                        datosDisponibles = false;
                    }else{
                        datosDisponibles = true;
                    }
                }
            }
        }else{
            datosDisponibles = false;
        }
        }catch (Exception e) {
            LogPC.printlnError(this, "Error en consulta consumo de datos para validar datos disponibles.");
        }
        return datosDisponibles;
    }
    public GestionaComponenteResponseEBMType comprarPaqueteDatos_0(String numCuenta, String assetNumber, String secondAssetNumber, String nombreProducto, String fechaCompra){
        GestionaComponenteSoaInterfaceEp gestionaComponenteSoaInterface_ep = new GestionaComponenteSoaInterfaceEp();
    GestionaComponenteSoaInterface gestionaComponenteSoaInterface = gestionaComponenteSoaInterface_ep.getGestionaComponenteSoaInterfacePt();
      GestionaComponenteRequestEBMType ebmType = new GestionaComponenteRequestEBMType();
        GestionaComponenteResponseEBMType response = null;
      EBMHeaderRequestType headerType = new EBMHeaderRequestType();
      headerType.setOperacion("GestionaComponente");
      headerType.setSistemaOrigen("SEL");
      ebmType.setEBMHeaderRequest(headerType);
      GestionacomponenteEntradaTYPE entrada = new GestionacomponenteEntradaTYPE();
      List<GestionacomponenteEntradaTYPE.ContratoSiebel> listEntrada = new ArrayList<GestionacomponenteEntradaTYPE.ContratoSiebel>();
      GestionacomponenteEntradaTYPE.ContratoSiebel contratoSiebel = new GestionacomponenteEntradaTYPE.ContratoSiebel();
      contratoSiebel.setAccountNumber(numCuenta);
      contratoSiebel.setOperacion("Gestiona Componente");
      contratoSiebel.setOrigen("Web");
      ListaInstanciaType instanciaType = new ListaInstanciaType();
      List<ListaInstanciaType.Instancia> listaInstancia = new ArrayList<ListaInstanciaType.Instancia>();
      ListaInstanciaType.Instancia instancia = new ListaInstanciaType.Instancia();
      instancia.setIRD(secondAssetNumber);
      instancia.setJerarquia("Master");
      instancia.setTarjetaInteligente(assetNumber);
      ListaProductoType listaProductoType = new ListaProductoType();
      List<ListaProductoType.Producto> listaProducto = new ArrayList<ListaProductoType.Producto>();
      ListaProductoType.Producto producto = new ListaProductoType.Producto();
      producto.setAction("Add");
      producto.setFechaFin(fechaCompra);
      producto.setFechaInicio(fechaCompra);
      producto.setNombre(nombreProducto);
      listaProducto.add(producto);
      listaProductoType.setProducto(listaProducto);
      instancia.setListaProducto(listaProductoType);
      listaInstancia.add(instancia);
      instanciaType.setInstancia(listaInstancia);
      contratoSiebel.setListaInstancia(instanciaType);
      listEntrada.add(contratoSiebel);
      entrada.setContratoSiebel(listEntrada);
      ebmType.setGestionacomponenteEntrada(entrada);
      response = gestionaComponenteSoaInterface.gestionaComponente(ebmType);
      return response;
    }
    
    public GestionarSSComprarDatosResponseEBMType comprarPaqueteDatos(String numCuenta, String assetNumber, String secondAssetNumber, String nombreProducto, String fechaCompra){
        GestionarSSComprarDatosSoaInterfaceEp gestionarSSComprarDatosSoaInterfaceEp = new GestionarSSComprarDatosSoaInterfaceEp();
        GestionarSSComprarDatosSoaInterface gestionarSSComprarDatosSoaInterfacePt = gestionarSSComprarDatosSoaInterfaceEp.getGestionarSSComprarDatosSoaInterfacePt();
        GestionarSSComprarDatosResponseEBMType response = null;
        GestionarSSComprarDatosRequestEBMType request = new GestionarSSComprarDatosRequestEBMType();
        // Cabecera Request
        EBMHeaderRequestType headerType = new EBMHeaderRequestType();
        headerType.setOperacion("GestionaSSComprarDatos");
        headerType.setSistemaOrigen("SEL");
        request.setEBMHeaderRequest(headerType);
        
        // == Datos Request ==
        // ListOfProducts
        ListOfProductsType listOfProductsType = new ListOfProductsType();
        Product product = new Product();
        product.setAction("Add");
        product.setName(nombreProducto);
        listOfProductsType.getProduct().add(product);
        
        // ListOfInstances
        ListOfInstancesType listOfInstancesType = new ListOfInstancesType();
        Instance instance = new Instance();
        instance.setAssetNumber(assetNumber);
        instance.setSecondAssetNumber(secondAssetNumber);
        instance.setListOfProducts(listOfProductsType);
        listOfInstancesType.getInstance().add(instance);
        
        // ServiceInfoRequestType
        ServiceInfoRequestType serviceInfoRequestType = new ServiceInfoRequestType();
        serviceInfoRequestType.setCuenta(numCuenta);
        serviceInfoRequestType.setOrigen("Web");
        serviceInfoRequestType.setListOfInstances(listOfInstancesType);
        
        mx.com.sky.enterprisemessages.soa.gestionarsscomprardatos.GestionarSSComprarDatosRequestEBMType gestionarSSComprarDatosRequestEBM = new mx.com.sky.enterprisemessages.soa.gestionarsscomprardatos.GestionarSSComprarDatosRequestEBMType();
        gestionarSSComprarDatosRequestEBM.setServiceInfoRequest(serviceInfoRequestType);
        
        request.setGestionarSSComprarDatosRequestEBM(gestionarSSComprarDatosRequestEBM);
        
        // Se hace peticion
        response = gestionarSSComprarDatosSoaInterfacePt.gestionarSSComprarDatos(request);
        
        return response;
    }
}
