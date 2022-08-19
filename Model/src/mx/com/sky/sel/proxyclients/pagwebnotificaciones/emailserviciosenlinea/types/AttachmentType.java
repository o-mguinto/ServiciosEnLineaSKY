
package mx.com.sky.sel.proxyclients.pagwebnotificaciones.emailserviciosenlinea.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachmentType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AttachmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fileBase64" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentType", propOrder = { "fileName", "extension", "fileBase64" })
public class AttachmentType {

    @XmlElement(required = true)
    protected String fileName;
    @XmlElement(required = true)
    protected String extension;
    @XmlElement(required = true)
    protected String fileBase64;

    /**
     * Gets the value of the fileName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Gets the value of the fileBase64 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFileBase64() {
        return fileBase64;
    }

    /**
     * Sets the value of the fileBase64 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFileBase64(String value) {
        this.fileBase64 = value;
    }

}
