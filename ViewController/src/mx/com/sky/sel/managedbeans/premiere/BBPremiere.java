package mx.com.sky.sel.managedbeans.premiere;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import java.util.List;

import mx.com.sky.sel.services.beans.eventos.Evento;
import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.utils.ADFUtils;

import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.data.RichCarousel;
import oracle.adf.view.rich.event.CarouselSpinEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.uicli.binding.JUCtrlHierBinding;

import org.apache.myfaces.trinidad.model.CollectionModel;

public class BBPremiere implements Serializable {
    @SuppressWarnings("compatibility:-8313475068059582292")
    private static final long serialVersionUID = -1656539210671146059L;
    private Evento event; //Contiene el Evento Seleccionado
    private transient Object rowKey;


    private static final String MENSAJE_PREMIERE_EVENTO_CONTRATADO = "bbpremiere.infomessage";
    private static final String MENSAJE_PREMIERE_EVENTO_ERROR = "bbpremiere.errormessage";

    public BBPremiere() {
        event = new Evento();
        LogPC.println(this, "BBPremiere Creado");
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_PPV_PREMIERE);
    }


    /*Permite manejar el cambio en el carrousel para actualizar la imagen de fondo*/

    public void carrouselChanged(CarouselSpinEvent carouselSpinEvent) {
        try {
            List currentSelectedKey = (List)carouselSpinEvent.getNewItemKey();
            Key key = (Key)currentSelectedKey.get(0);

            RichCarousel carousel = (RichCarousel)carouselSpinEvent.getSource();
            CollectionModel componentModel = (CollectionModel)carousel.getValue();
            JUCtrlHierBinding carouselTreeBinding = (JUCtrlHierBinding)componentModel.getWrappedData();
            //ADFUtils.putValue("bindings.image.inputValue", image);
            LogPC.println(this, "bindings.Evento.collectionModel.selectedRow:" + ADFUtils.getValueBindings("Evento.collectionModel.selectedRow"));
            DCIteratorBinding dcIterBinding = carouselTreeBinding.getIteratorBinding();
            //Seleccionamos el evento seleccionado en el carrousel en la tabla
            dcIterBinding.setCurrentRowWithKey(key.toStringFormat(true));
        } catch (Exception ex) {
            LogPC.printlnError(ex);
        }
    }


    public void setItem(Object item) {
        Row ppe = null;
        if (item != null) {
            //ppe = ((oracle.adfinternal.view.faces.model.binding.FacesCtrlHierNodeBinding)item).getCurrentRow();
            ppe = ((oracle.jbo.uicli.binding.JUCtrlValueBindingRef)item).getRow();
        }
        if (ppe == null) {
            LogPC.println(this, "ppe: null");
            return;
        }
        System.out.println("ROWNUM_ATTR: "+ ppe.getKey().toStringFormat(true) + "   -   "+ppe.getAttribute("titulo"));
        rowKey = ppe.getKey().toStringFormat(true);
        //rowKey = ppe.getKey().toStringFormat(true);
        actualizar_action();

    }
        public void setItem2(Object item) {
            Row ppe = null;
            if (item != null) {
                //ppe = (Row)item;
                ppe = ((oracle.adfinternal.view.faces.model.binding.FacesCtrlHierNodeBinding)item).getRow();
            }
            if (ppe == null) {
                LogPC.println(this, "ppe: null");
                return;
            }
            System.out.println("ROWNUM_ATTR: "+ ppe.getKey().toStringFormat(true) + "   -   "+ppe.getAttribute("titulo"));
            rowKey = ppe.getKey().toStringFormat(true);
            actualizar_action();
        }

    private void actualizar_action() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("setCurrentRowWithKey");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {

        }

    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }


    public Object getItem() {
        LogPC.println(this, "GET item");
        return "";
    }


    public Evento getEvent() {
        return event;
    }


    public String mostrarPopUp() {

        event.setCanal((String)ADFUtils.getValueBindings("canal.inputValue"));
        event.setCanalDisplay((String)ADFUtils.getValueBindings("canalDisplay.inputValue"));
        event.setTitulo((String)ADFUtils.getValueBindings("titulo.inputValue"));
        event.setSinopsis((String)ADFUtils.getValueBindings("sinopsis.inputValue"));
        event.setImage((String)ADFUtils.getValueBindings("image.inputValue"));
        event.setPrecio((String)ADFUtils.getValueBindings("precio.inputValue"));
        event.setModalidad((String)ADFUtils.getValueBindings("modalidad.inputValue"));
        
        
        //agragando codigo de idioma y subtitulos
        event.setIdioma((String)ADFUtils.getValueBindings("idioma.inputValue"));
        event.setSubtitulos((String)ADFUtils.getValueBindings("subtitulos.inputValue"));
        event.setTituloMensaje((String)ADFUtils.getValueBindings("tituloMensaje.inputValue"));
        event.setMensaje((String)ADFUtils.getValueBindings("mensaje.inputValue"));

        // Add event code here...
        LogPC.println(this, "In mostrarPopUp-------------");
        return "ppe";
    }


    public void setRowKey(Object rowKey) {
        this.rowKey = rowKey;
    }

    public Object getRowKey() {
        return rowKey;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        LogPC.println(this, "Serializando BBPremiere: " + event);
    }

    private void readObject(ObjectInputStream in) throws IOException {
        try {
            in.defaultReadObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        LogPC.println(this, "DeSerializando BBPremiere :" + event);
    }
    }
