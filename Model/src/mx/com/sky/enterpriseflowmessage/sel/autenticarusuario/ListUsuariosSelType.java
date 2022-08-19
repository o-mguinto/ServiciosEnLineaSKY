
package mx.com.sky.enterpriseflowmessage.sel.autenticarusuario;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.usuario.UsuarioEBOType;


/**
 * <p>Java class for ListUsuariosSelType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ListUsuariosSelType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Usuario}UsuarioSelEBO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListUsuariosSelType", propOrder = { "usuarioSelEBO" })
public class ListUsuariosSelType {

    @XmlElement(name = "UsuarioSelEBO", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Usuario")
    protected List<UsuarioEBOType> usuarioSelEBO;

    /**
     * Gets the value of the usuarioSelEBO property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usuarioSelEBO property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsuarioSelEBO().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsuarioEBOType }
     *
     *
     */
    public List<UsuarioEBOType> getUsuarioSelEBO() {
        if (usuarioSelEBO == null) {
            usuarioSelEBO = new ArrayList<UsuarioEBOType>();
        }
        return this.usuarioSelEBO;
    }

}
