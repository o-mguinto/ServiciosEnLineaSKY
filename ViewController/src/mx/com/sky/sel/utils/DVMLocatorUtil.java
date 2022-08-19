package mx.com.sky.sel.utils;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;

import oracle.tip.dvm.entity.DVMRTObject;

import oracle.xml.parser.v2.XMLDocument;
import oracle.fabric.common.dvm.DVM;

import org.w3c.dom.Document;

public class DVMLocatorUtil implements Serializable{
    @SuppressWarnings("compatibility:-1317923015494601054")
    private static final long serialVersionUID = 5084908028594063313L;

    public DVMLocatorUtil() {
        super();
    }
    public DVMRTObject getDVMRTObject(String dvmLoc)
    {
        DVMRTObject obj= null;
        try
        {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            dbf.setNamespaceAware(true);
            ////////////
            InputStream in = new FileInputStream(dvmLoc);
            ///////
            Document doc = db.parse(in);
            printXML(doc);
            
            XMLDocument xmlDoc = null;
            xmlDoc = new XMLDocument();
            xmlDoc.appendChild(xmlDoc.importNode(doc.getDocumentElement(), true));
            
            printXML(doc);
            
            DVM dvm = new DVM(xmlDoc, "");
            
            obj = (DVMRTObject)dvm.getParsedDVM();
                if (obj == null) 
                {
                  obj = new DVMRTObject(dvm);
                  dvm.setParsedDVM(obj);
                }
            return obj;    
        }
        catch(Exception e)
        {
            e.printStackTrace();
        } 
        return obj; 
    }
        
        public static void printXML(Document doc) throws Exception
    {
        TransformerFactory tfactory = TransformerFactory.newInstance();
        Transformer xform = tfactory.newTransformer();
        javax.xml.transform.Source src=new DOMSource(doc);
        java.io.StringWriter writer = new StringWriter();
        Result result = new javax.xml.transform.stream.StreamResult(writer);
        xform.transform(src, result);
    }
}
