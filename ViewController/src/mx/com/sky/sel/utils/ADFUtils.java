package mx.com.sky.sel.utils;

import java.io.Serializable;

import java.util.Map;
import java.util.ResourceBundle;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;
import oracle.adf.share.security.SecurityContext;
import oracle.adf.share.security.identitymanagement.UserProfile;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;
import oracle.jbo.uicli.binding.JUCtrlHierBinding;
import oracle.jbo.uicli.binding.JUCtrlHierNodeBinding;

import org.apache.myfaces.trinidad.context.RequestContext;
import org.apache.myfaces.trinidad.model.CollectionModel;
import org.apache.myfaces.trinidad.model.RowKeySet;
import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;

public class ADFUtils implements Serializable{
    @SuppressWarnings("compatibility:-9205012383919583274")
    private static final long serialVersionUID = 1892913832572537108L;

    private static ResourceBundle bundle;
    static {
        try {
            //inicializa el resource bundle
            bundle = ResourceBundle.getBundle("mx.com.sky.sel.resources.pantallas");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ADFUtils() {

    }

    public static String getCuentaSKY() {

        String cuentaSKY = getPropertyLDAP("cuentaSKY");
        if (cuentaSKY == null) {
            return "";
        }
        return cuentaSKY + "";
    }

    public static String getPropertyLDAP(String property) {
        String propiedad = "";
        ADFContext adfContext = null;
        SecurityContext securityCtx = null;

        UserProfile userP = null;

        try {
            adfContext = ADFContext.getCurrent();
            securityCtx = adfContext.getSecurityContext();
            userP = securityCtx.getUserProfile();
            propiedad = userP.getProperty(property) + "";

        } catch (Exception e) {
            e.printStackTrace();
        }
        return propiedad;
    }

    public static String getPropertyLDAPUserName() {
        String propiedad = "";
        ADFContext adfContext = null;
        SecurityContext securityCtx = null;
        try {
            adfContext = ADFContext.getCurrent();
            securityCtx = adfContext.getSecurityContext();
            propiedad = securityCtx.getUserName().toLowerCase();
        } catch (Exception e) {
            e.getMessage();
        }
        return propiedad;
    }

    public static String getValueStringBindings(String expresion) {
        return getValue("bindings." + expresion) + "";
    }

    public static Object getValueBindings(String expresion) {
        return getValue("bindings." + expresion);
    }

    public static Object getValue(String expresion) {
        Application app;
        ELContext elctx = null;
        ExpressionFactory exprFactory = null;
        ValueExpression valueExpression = null;
        Object resultadoObj = null;
        try {
            app = FacesContext.getCurrentInstance().getApplication();
            elctx = FacesContext.getCurrentInstance().getELContext();
            exprFactory = app.getExpressionFactory();
            valueExpression = exprFactory.createValueExpression(elctx, "#{" + expresion + "}", Object.class);
            resultadoObj = valueExpression.getValue(elctx);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultadoObj;
    }

    public static Object getValuePageScope(String parameterName) {
        Map mapPageFlowScope = RequestContext.getCurrentInstance().getPageFlowScope();
        Object object = mapPageFlowScope.get(parameterName);

        return object;
    }


    public static void putValuePageScope(String parameterName, Object valor) {

        Map mapPageFlowScope = RequestContext.getCurrentInstance().getPageFlowScope();
        mapPageFlowScope.put(parameterName, valor);
    }


    public static Object obtenViewObject(String expresion) {

        return new Object();
    }


    public static void putValue(String expresion, Object valor) {

        Application app;
        ELContext elctx = null;
        ExpressionFactory exprFactory = null;
        ValueExpression valueExpression = null;

        app = FacesContext.getCurrentInstance().getApplication();
        elctx = FacesContext.getCurrentInstance().getELContext();
        exprFactory = app.getExpressionFactory();

        valueExpression = exprFactory.createValueExpression(elctx, "#{" + expresion + "}", Object.class);
        valueExpression.setValue(elctx, valor);
        valueExpression = exprFactory.createValueExpression(elctx, "#{" + expresion + "}", Object.class);
        valueExpression.setValue(elctx, valor);
    }


    public static Object getOperationBinding(String expresion) {
        BindingContainer bc = BindingContext.getCurrent().getCurrentBindingsEntry();
        OperationBinding ob = bc.getOperationBinding(expresion);
        return ob;
    }


    public static DCIteratorBinding getIterador(String expresionIterador) {

        BindingContainer bc = BindingContext.getCurrent().getCurrentBindingsEntry();
        return (DCIteratorBinding)bc.get(expresionIterador);

    }

    public static int getIndexIteradorByField(String atributo, String atributoKey, String iteradorExpresion) {

        DCIteratorBinding iterador = (DCIteratorBinding)ADFUtils.getIterador(iteradorExpresion);

        int index = -1;

        for (Row row : iterador.getAllRowsInRange()) {
            index++;
            if (row.getAttribute(atributo).equals(atributoKey)) {
                break;
            }
        }
        if (index == -1) {
            return index = 0;
        } else {
            return index;
        }
    }

    public static Object getValuesIterator(String atributoKey, String key, String atributo, String expresionIterador) {


        BindingContainer bc = BindingContext.getCurrent().getCurrentBindingsEntry();

        DCIteratorBinding unidadesLovIter = (DCIteratorBinding)bc.get(expresionIterador);

        Row rwReturn = null;
        for (Row row : unidadesLovIter.getAllRowsInRange()) {
            if (row.getAttribute(atributoKey).equals(key)) {
                rwReturn = row;
            }
        }


        return rwReturn.getAttribute(atributo);
    }

    // find a jsf component inside the JSF page

    public static UIComponent getUIComponent(String name) {
        FacesContext facesCtx = FacesContext.getCurrentInstance();

        return facesCtx.getViewRoot().findComponent(name);
    }

    //Refrescar un elemento dentro de la pagina.

    public static void addPartialTarget(UIComponent partialTarget) {
        AdfFacesContext.getCurrentInstance().addPartialTarget(partialTarget);
    }

    /*
    * Metodo para obtener la empresa atravez del usuario
    * */


    public static Object getValuesComboBoxByIndex(int valor, String atributo, String iterator) {

        //Log.println(this.getClass(),"Valor: " + valor);
        //Log.println(this.getClass(),"Atributo:" + atributo);
        //Log.println(this.getClass(),"Iterador:" + iterator);
        BindingContainer bc = BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding unidadesLovIter = (DCIteratorBinding)bc.get(iterator);
        Row rw = unidadesLovIter.getRowAtRangeIndex(valor);
        //Log.println(this.getClass(),"getAttributeValues: " + rw.getAttributeValues());
        Object rowObject = rw.getAttribute(atributo);
        //Log.println(this.getClass(),"Return:" + rowObject);
        return rowObject;
    }

    /**
     * FunciÃ¯Â¿Â½n para mostrar un popup
     * @param popup Objeto que hace referencia al popup que deseamos mostrar
     */
    public static void showPopup(RichPopup popup) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExtendedRenderKitService service = Service.getRenderKitService(facesContext, ExtendedRenderKitService.class);
        service.addScript(facesContext, "AdfPage.PAGE.findComponent('" + popup.getClientId(facesContext) + "').show();");
    }

    public static void hidePopup(RichPopup popup) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExtendedRenderKitService service = Service.getRenderKitService(facesContext, ExtendedRenderKitService.class);
        service.addScript(facesContext, "AdfPage.PAGE.findComponent('" + popup.getClientId(facesContext) + "').hide();");
    }

    public static void hidePopup(String popupId) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExtendedRenderKitService service = Service.getRenderKitService(facesContext, ExtendedRenderKitService.class);
        service.addScript(facesContext, "AdfPage.PAGE.findComponent('" + popupId + "').hide();");
    }

    public static void showPopupTest(RichPopup popup) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExtendedRenderKitService service = Service.getRenderKitService(facesContext, ExtendedRenderKitService.class);
        service.addScript(facesContext, "AdfPage.PAGE.findComponent('" + popup.getClientId(facesContext) + "').show();");

        AdfFacesContext.getCurrentInstance().returnFromDialog("Close", null);

    }

    public static void showSuccesfulMessage() {
        FacesContext fctx = FacesContext.getCurrentInstance();
        FacesMessage message = new FacesMessage("Se ha realizado la operaci\u00F3n satisfactoriamente");
        message.setSeverity(FacesMessage.SEVERITY_INFO);
        fctx.addMessage(null, message);
    }

    public static void showInfoMessage(String mensaje) {

        FacesContext fctx = FacesContext.getCurrentInstance();
        FacesMessage message = new FacesMessage(mensaje);
        message.setSeverity(FacesMessage.SEVERITY_INFO);
        if (fctx.getMessages().hasNext()) {
            fctx.getMessages().next();
            fctx.getMessages().remove();
        }
        fctx.addMessage(null, message);
    }

    public static void showErrorMessage() {
        FacesContext fctx = FacesContext.getCurrentInstance();
        FacesMessage message = new FacesMessage("Ha ocurrido un error al realizar la operacion");
        message.setSeverity(FacesMessage.SEVERITY_INFO);
        fctx.addMessage(null, message);
    }

    public static void showErrorMessage(String mensaje) {
        FacesContext fctx = FacesContext.getCurrentInstance();
        FacesMessage message = new FacesMessage(mensaje);
        message.setSeverity(FacesMessage.SEVERITY_INFO);
        try {
            if (fctx.getMessages().hasNext()) {
                fctx.getMessages().next();
                fctx.getMessages().remove();
            }
        } catch (Exception e) {
        }
        fctx.addMessage(null, message);
    }

    public static void addFacesErrorMessage(String msg) {
        FacesContext ctx = FacesContext.getCurrentInstance();
        FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, "");
        ctx.addMessage(ctx.getViewRoot().getId(), fm);
    }


    public static void showErrorMessage(String mensaje, String idComponente) {
        FacesContext fctx = FacesContext.getCurrentInstance();
        FacesMessage message = new FacesMessage(mensaje);
        message.setSeverity(FacesMessage.SEVERITY_INFO);
        fctx.addMessage(idComponente, message);
    }


    public static void showErrorMessage(String mensaje, UIComponent componente) {
        FacesContext fctx = FacesContext.getCurrentInstance();
        FacesMessage message = new FacesMessage(mensaje);
        message.setSeverity(FacesMessage.SEVERITY_INFO);
        fctx.addMessage(componente.getClientId(fctx), message);
    }

    public static void showErrorMessage(FacesContext fctx, UIComponent componente, String mensaje) {
        FacesMessage message = new FacesMessage(mensaje);
        message.setSeverity(FacesMessage.SEVERITY_INFO);
        fctx.addMessage(componente.getClientId(fctx), message);
    }

    public static void executeCommit() {
        OperationBinding ob = (OperationBinding)ADFUtils.getOperationBinding("Commit");
        ob.execute();

    }

    public static void executeRollback() {
        OperationBinding ob = (OperationBinding)ADFUtils.getOperationBinding("Rollback");
        ob.execute();

    }

    public static String closeWindowPopup() {
        FacesContext facesContext = FacesContext.getCurrentInstance();

        org.apache.myfaces.trinidad.render.ExtendedRenderKitService service =
            Service.getRenderKitService(facesContext, ExtendedRenderKitService.class);
        service.addScript(facesContext, "window.close();window.opener.location.href = window.opener.location.href;");
        return null;
    }

    public static void removeSelectedRowsCM(RichTable table) {

        RowKeySet rowKeySet = (RowKeySet)table.getSelectedRowKeys();
        CollectionModel cm = (CollectionModel)table.getValue();
        for (Object facesTreeRowKey : rowKeySet) {
            cm.setRowKey(facesTreeRowKey);
            JUCtrlHierNodeBinding rowData = (JUCtrlHierNodeBinding)cm.getRowData();
            rowData.getRow().remove();
        }
    }

    public static void refreshCollectionTable(RichTable t_Insta) {
        OperationBinding ob = (OperationBinding)ADFUtils.getOperationBinding("obtenerMenusIterator");
        ob.execute();


        CollectionModel cm = (CollectionModel)t_Insta.getValue();
        JUCtrlHierBinding tableBinding = (JUCtrlHierBinding)cm.getWrappedData();
        tableBinding.executeQuery();

        ADFUtils.addPartialTarget(t_Insta);

    }

    /**
     * Obtiene el valor asociado a la clave desde el resource bundle.
     * @param key
     * @return
     */
    public static String getString(String key) {
        if (bundle != null) {
            return bundle.getString(key);
        }
        return "los mensajes deben ser configurados";
    }

    public static void showPopup(String popup) {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            ExtendedRenderKitService service =
                Service.getRenderKitService(facesContext,
                                            ExtendedRenderKitService.class);
            service.addScript(facesContext,
                              "AdfPage.PAGE.findComponent('" + popup +
                              "').show();");
        }
    }
