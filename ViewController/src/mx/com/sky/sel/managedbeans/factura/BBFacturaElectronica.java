package mx.com.sky.sel.managedbeans.factura;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

import java.sql.Timestamp;

import java.util.ArrayList;
import java.util.List;

import javax.faces.context.FacesContext;

import mx.com.sky.sel.services.beans.facturas.Factura;
import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.Parametros;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import oracle.adf.model.BindingContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;


public class BBFacturaElectronica implements Serializable {
    @SuppressWarnings("compatibility:174646106288288025")
    private static final long serialVersionUID = -1752578788971859638L;

    private String pathFactura;
    private String uuid;
    private Timestamp fechatimbrado;
    private String pac;
    private List<Factura> facturas;

    public BBFacturaElectronica() {
        super();
    }
    
    public void descargarFactura(FacesContext context, OutputStream out) throws IOException {
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_FACTURAS_CFDI);
        Parametros param = new Parametros(false);
        //ServicioFactura sf = null;
        BindingContainer bindings = getBindings();
        
        byte[] bytesArchivo = null;
        System.out.println("UUID===== "+uuid);
        try {
            if (pac == null) {
                pac = (String)ADFUtils.getValueBindings("pac.inputValue");
                LogPC.println(this, "getValueBindings pac " + pac);
            }
            if (uuid == null) {
                uuid = (String)ADFUtils.getValueBindings("idFactura.inputValue");
                LogPC.println(this, "getValueBindings uuid " + uuid);
            }
            if (fechatimbrado == null) {
                fechatimbrado = (Timestamp)ADFUtils.getValueBindings("fechatimbrado.inputValue");
                LogPC.println(this, "getValueBindings fechatimbrado " + fechatimbrado);
            }
            if (pac!=null) {
                OperationBinding sdfOp = bindings.getOperationBinding("obtenerFacturaPDF");
                sdfOp.getParamsMap().put("UUID", (uuid));
                sdfOp.getParamsMap().put("fechaTimbrado", (fechatimbrado));
                sdfOp.getParamsMap().put("PAC", (pac));
                Object result = sdfOp.execute();
                LogPC.println(this, "valor factura obj: "+result);
                if(result != null){
                    bytesArchivo = convertToByte(result);
                }
                //sf = new ServicioFactura();
                //bytesArchivo = sf.descargarFacturaEDICOM(uuid);
                //LogPC.println(this, "bytesArchivo EDICOM:" + bytesArchivo);
            } else {
                pathFactura = pathFactura.replace("//", "/");

                LogPC.println(this, "URL pathFactura:" + pathFactura);
                // PRODUCCION
                pathFactura = param.getUrlFactura() + pathFactura;

                // DESA HI JUMP
                if (pathFactura.endsWith(".xml")) {
                    pathFactura = param.getUrlFacturaXML() + pathFactura.replace("/", "\\");
                } else {
                    pathFactura = param.getUrlFacturaPDF() + pathFactura.replace("/", "\\");
                }
                //END DESA HI JUMP

                LogPC.println(this, "URL FACTURA:" + pathFactura);

                File archivo = new File(pathFactura);
                bytesArchivo = getBytesFromFile(archivo);
            }
            out.write(bytesArchivo);
            //w.write("Hi there!");
            // The stream is automatically closed, but since we wrapped it,
            // we'd better flush our writer
            out.flush();

        } catch (Exception e) {
            LogPC.printlnError(this, e);
            return;
        }

    }

    private byte[] getBytesFromFile(File file) throws IOException {
        InputStream is = new FileInputStream(file);

        // Get the size of the file
        long length = file.length();

        // You cannot create an array using a long type.
        // It needs to be an int type.
        // Before converting to an int type, check
        // to ensure that file is not larger than Integer.MAX_VALUE.
        if (length > Integer.MAX_VALUE) {
            // File is too large
            LogPC.println(this, "File is too large");
        }

        // Create the byte array to hold the data
        byte[] bytes = new byte[(int)length];

        // Read in the bytes
        int offset = 0;
        int numRead = 0;
        while (offset < bytes.length && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
            offset += numRead;
        }

        // Ensure all the bytes have been read in
        if (offset < bytes.length) {
            throw new IOException("No se puede terminar de leer el archivo " + file.getName());
        }

        // Close the input stream and return bytes
        is.close();
        return bytes;
    }

    public void setPathFactura(String pathFactura) {
        this.pathFactura = pathFactura;
    }

    public String getPathFactura() {
        return pathFactura;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }
    
    public void setFechatimbrado(Timestamp fechatimbrado) {
        this.fechatimbrado = fechatimbrado;
    }

    public Timestamp getFechatimbrado() {
        return fechatimbrado;
    }
    
    public void setPac(String pac) {
        this.pac = pac;
    }

    public String getPac() {
        return pac;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }

    public List<Factura> getFacturas() {
        if (this.facturas == null) {
            this.facturas = new ArrayList<Factura>();
        }
        return facturas;
    }
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }
    public byte[] convertToByte(Object obj) throws IOException {
    ObjectOutputStream os = null;

    ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
    os = new ObjectOutputStream(new BufferedOutputStream(byteStream));
    os.flush();
    os.writeObject(obj);
    os.flush();
    byte[] sendBuf = byteStream.toByteArray();
    os.close();
    return sendBuf;

    }
}

