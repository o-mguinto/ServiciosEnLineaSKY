package mx.com.sky.sel.utils;
import java.io.Serializable;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.NamingContainer;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;


import javax.faces.el.ValueBinding;

import org.apache.commons.lang.StringUtils;

public class JSFUtils implements Serializable {
    @SuppressWarnings("compatibility:-8538854356170362882")
    private static final long serialVersionUID = 6974353889734793636L;

    public static String getObjectPartFromValueExpression(String valueExpression) {
        int indexOfLastPoint = StringUtils.lastIndexOf(valueExpression, '.');
        int indexOfLastParenthesis =
            StringUtils.lastIndexOf(valueExpression, '}');
        return StringUtils.substring(valueExpression, 0, indexOfLastPoint) +
            "}";
    }

    public static String getObjectPart(UIComponent uiComponent) {
        String valueExpression =
            uiComponent.getValueBinding("value").getExpressionString();
        return getObjectPartFromValueExpression(valueExpression);
    }

    public static String getPropertyNameFromValueExpression(String valueExpression) {
        int indexOfLastPoint = StringUtils.lastIndexOf(valueExpression, '.');
        int indexOfLastParenthesis =
            StringUtils.lastIndexOf(valueExpression, '}');

        return StringUtils.substring(valueExpression, indexOfLastPoint + 1,
                                     indexOfLastParenthesis);

    }

    public static String getPropertyNamePart(UIComponent uiComponent) {
        String valueExpression =
            uiComponent.getValueBinding("value").getExpressionString();
        return getPropertyNameFromValueExpression(valueExpression);
    }

    public static Object getBindedObject(String objectExpression) {
        FacesContext context = FacesContext.getCurrentInstance();
        return getBindedObject(context, objectExpression);
    }


    public static Object getBean(String beanName) {
        FacesContext context = FacesContext.getCurrentInstance();
        Object bean =
            context.getApplication().evaluateExpressionGet(context, "#{" +
                                                           beanName + "}",
                                                           Object.class);
        return bean;
    }

    public static <T> T findBean(String beanName) {
        FacesContext context = FacesContext.getCurrentInstance();
        return (T)context.getApplication().evaluateExpressionGet(context,
                                                                 "#{" +
                                                                 beanName +
                                                                 "}",
                                                                 Object.class);
    }


    public static Object getBindedObject(FacesContext context,
                                         String objectExpression) {
        return context.getApplication().createValueBinding(objectExpression).getValue(context);
    }

    public static Object getContainingObject(UIComponent uiComponent) {
        String containingObjectExpression = getObjectPart(uiComponent);
        FacesContext context = FacesContext.getCurrentInstance();
        return context.getApplication().createValueBinding(containingObjectExpression).getValue(context);
    }

    /**
     * Locates the component identified by <code>forComponent</code>
     *
     * @param forComponent -
     *            the component to search for
     * @param component -
     *            the starting point in which to begin the search
     * @return the component with the the <code>id</code that matches
     *         <code>forComponent</code> otheriwse null if no match is found.
     */
    public static UIComponent getForComponent(FacesContext context,
                                              String forComponent,
                                              UIComponent component) {
        if (null == forComponent || forComponent.length() == 0) {
            return null;
        }

        UIComponent result = null;
        UIComponent currentParent = component;
        try {
            // Check the naming container of the current
            // component for component identified by
            // 'forComponent'
            while (currentParent != null) {
                // If the current component is a NamingContainer,
                // see if it contains what we're looking for.
                result = currentParent.findComponent(forComponent);
                if (result != null)
                    break;
                // if not, start checking further up in the view
                currentParent = currentParent.getParent();
            }

            // no hit from above, scan for a NamingContainer
            // that contains the component we're looking for from the root.
            if (result == null) {
                result =
                        findUIComponentBelow(context.getViewRoot(), forComponent);
            }
        } catch (Throwable t) {
            // Object[] params = { forComponent };
            throw new RuntimeException("");
            // Util.getExceptionMessageString(Util.COMPONENT_NOT_FOUND_ERROR_MESSAGE_ID,
            // params)
        }

        return result;
    }

    /**
     * <p>
     * Recursively searches for {@link NamingContainer}s from the given start
     * point looking for the component with the <code>id</code> specified by
     * <code>forComponent</code>.
     *
     * @param startPoint -
     *            the starting point in which to begin the search
     * @param forComponent -
     *            the component to search for
     * @return the component with the the <code>id</code that matches
     *         <code>forComponent</code> otheriwse null if no match is found.
     */
    private static UIComponent findUIComponentBelow(UIComponent startPoint,
                                                    String forComponent) {
        UIComponent retComp = null;
        List children = startPoint.getChildren();
        for (int i = 0, size = children.size(); i < size; i++) {
            UIComponent comp = (UIComponent)children.get(i);

            if (comp instanceof NamingContainer) {
                retComp = comp.findComponent(forComponent);
            }

            if (retComp == null) {
                if (comp.getChildCount() > 0) {
                    retComp = findUIComponentBelow(comp, forComponent);
                }
            }

            if (retComp != null)
                break;
        }
        return retComp;
    }

    public static boolean getBooleanAttribute(UIComponent component,
                                              String attrName,
                                              boolean defaultValue) {
        Boolean b = (Boolean)component.getAttributes().get(attrName);
        return b != null ? b.booleanValue() : defaultValue;
    }

    public static String getStringValue(FacesContext context,
                                        ValueBinding vb) {
        Object value = vb.getValue(context);
        if (value == null) {
            return null;
        }
        return value.toString();
    }
    /**
     * Get component id of the view root.
     *
     * @return component id of the view root
     */
    public static String getRootViewComponentId() {
        return getFacesContext().getViewRoot().getId();
    }
    /**
     * Get FacesContext.
     *
     * @return FacesContext
     */
    public static FacesContext getFacesContext() {
        return FacesContext.getCurrentInstance();
    }
    /**
     * Add JSF error message.
     *
     * @param msg
     *            error message string
     */
    public static void addFacesErrorMessage(String msg) {
        FacesContext ctx = getFacesContext();
        FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, "");
        ctx.addMessage(getRootViewComponentId(), fm);
    }

    /**
     * Add JSF error message for a specific attribute.
     *
     * @param attrName
     *            name of attribute
     * @param msg
     *            error message string
     */
    public static void addFacesErrorMessage(String attrName, String msg) {
        // TODO: Need a way to associate attribute specific messages
        // with the UIComponent's Id! For now, just using the view id.
        // TODO: make this use the internal getMessageFromBundle?
        FacesContext ctx = getFacesContext();
        FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO, attrName, msg);
        ctx.addMessage(getRootViewComponentId(), fm);
    }
}