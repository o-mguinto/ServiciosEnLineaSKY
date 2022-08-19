package mx.com.sky.sel.services.beans.utils;

import java.io.Serializable;

public class ArchivoAdjunto implements Serializable {
    @SuppressWarnings("compatibility:-7641209850225465429")
    private static final long serialVersionUID = 6611109013970830507L;
    private String fileName;
    private String extension;
    private String fileBase64;
    private  byte[] fileBase64CargaEventosPPV;
    public ArchivoAdjunto() {
        super();
    }
    
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("\nArchivoAdjunto [");
        if (fileName != null) {
            builder.append("fileName=");
            builder.append(fileName);
            builder.append(", ");
        }
        
        if (extension != null) {
            builder.append("extension=");
            builder.append(extension);
            builder.append(", ");
        }
        if (fileBase64 != null) {
            builder.append("fileBase64=\n");
            builder.append(fileBase64);
        }
        return builder.toString();
    }


    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getExtension() {
        return extension;
    }

    public void setFileBase64(String fileBase64) {
        this.fileBase64 = fileBase64;
    }

    public String getFileBase64() {
        return fileBase64;
    }

    public void setFileBase64CargaEventosPPV(byte[] fileBase64CargaEventosPPV) {
        this.fileBase64CargaEventosPPV = fileBase64CargaEventosPPV;
    }

    public byte[] getFileBase64CargaEventosPPV() {
        return fileBase64CargaEventosPPV;
    }
    }
