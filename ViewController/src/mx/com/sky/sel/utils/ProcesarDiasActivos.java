package mx.com.sky.sel.utils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.io.StringReader;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import mx.com.sky.sel.log.LogPC;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.xml.sax.InputSource;

public class ProcesarDiasActivos implements Serializable {
    @SuppressWarnings("compatibility:1927251958227320142")
    private static final long serialVersionUID = -8822775214004121302L;
    private int diasActivos;
    private int diasInactivos;

    public ProcesarDiasActivos() {
        super();
        diasActivos = 0;
        diasInactivos = 0;
    }

    private void procesarXMLString(String xmlString) {
        String xmlRecords = xmlString;
        DocumentBuilder db = null;
        InputSource is = null;
        Document doc = null;
        NodeList nodes = null;
        Element element = null;
        NodeList name = null;
        Element line = null;
        NodeList title = null;
        String DiasActivos = "";
        String DiasInactivos = "";
        try {
            db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            is = new InputSource();
            is.setCharacterStream(new StringReader(xmlRecords));

            doc = db.parse(is);
            nodes = doc.getElementsByTagName("value");

            for (int i = 0; i < nodes.getLength(); i++) {
                element = (Element)nodes.item(i);
                name = element.getElementsByTagName("value");
                if (DiasActivos.isEmpty()) {
                    DiasActivos = element.getAttribute("DiasActivos");
                }
                if (DiasInactivos.isEmpty()) {
                    DiasInactivos = element.getAttribute("DiasInactivos");
                }
            }

            diasActivos = Integer.parseInt(DiasActivos);
            diasInactivos = Integer.parseInt(DiasInactivos);
        } catch (Exception e) {
            LogPC.printlnError(this, e);
        }

    }


    public static void procesarXMLStringTEST(String xmlString) {
        String xmlRecords = xmlString;
        DocumentBuilder db = null;
        InputSource is = null;
        Document doc = null;
        NodeList atributosList = null;
        Element element = null;
        Element elementHijo = null;
        NodeList elementNodeList = null;
        NodeList elementValueNodeList = null;
        String content = "";
        Node nodoPWD = null;
        try {
            db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            is = new InputSource();
            is.setCharacterStream(new StringReader(xmlRecords));

            doc = db.parse(is);
            atributosList = doc.getElementsByTagName("Atributos");

            for (int j = 0; j < atributosList.getLength(); j++) {
                element = (Element)atributosList.item(j);
                elementNodeList = element.getElementsByTagName("Atributo");
                elementValueNodeList = element.getElementsByTagName("ValorAtributo");
                for (int iHijo = 0; iHijo < elementNodeList.getLength(); iHijo++) {
                    elementHijo = (Element)elementNodeList.item(iHijo);
                    if (elementHijo.getTextContent().equalsIgnoreCase("userPassword")) {
                        nodoPWD = elementValueNodeList.item(iHijo);
                        content = nodoPWD.getTextContent();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        String cadena = "<ConsultaLDAPProcessRequest>\n" +
            "         <OperacionLDAP>3</OperacionLDAP>\n" +
            "         <ctaSky>501100985974</ctaSky>\n" +
            "         <contactoRowID>29-1Z828HI</contactoRowID>\n" +
            "         <TarjetaInteligente/>\n" +
            "         <nombre/>\n" +
            "         <apellidoPaterno/>\n" +
            "         <apellidoMaterno/>\n" +
            "         <email/>\n" +
            "         <titular/>\n" +
            "         <TelCasaLada/>\n" +
            "         <TelCasa/>\n" +
            "         <TelTrabLada/>\n" +
            "         <TelTrab/>\n" +
            "         <TelTrabExt/>\n" +
            "         <TelMovil/>\n" +
            "         <descripcion/>\n" +
            "         <username/>\n" +
            "         <password>josemanuel</password>\n" +
            "         <UID>501100985974-01</UID>\n" +
            "         <Atributos>\n" +
            "            <Atributo>givenName</Atributo>\n" +
            "            <text/>\n" +
            "         </Atributos>\n" +
            "         <Atributos>\n" +
            "            <Atributo>sn</Atributo>\n" +
            "            <text/>\n" +
            "            <ValorAtributo></ValorAtributo>\n" +
            "         </Atributos>\n" +
            "         <Atributos>\n" +
            "         <text/>\n" +
            "            <Atributo>userPassword</Atributo>\n" +
            "            <text/>\n" +
            "            <ValorAtributo>josemanuel</ValorAtributo>\n" +
            "            <text/>\n" +
            "         </Atributos>\n" +
            "         <Atributos>\n" +
            "         <text/>\n" +
            "            <Atributo>mail</Atributo>\n" +
            "            <text/>\n" +
            "            <ValorAtributo/>\n" +
            "            <text/>\n" +
            "         </Atributos>\n" +
            "         <Atributos>\n" +
            "         <text/>\n" +
            "            <Atributo>telephoneNumber</Atributo>\n" +
            "            <text/>\n" +
            "            <ValorAtributo/>\n" +
            "            <text/>\n" +
            "         </Atributos>\n" +
            "      </ConsultaLDAPProcessRequest>";
        procesarXMLStringTEST(cadena);
    }

    public void obtenerDiasActivosInactivos(String accountid) {
        String lista = "";
        URL url = null;
        String urlParameters = "accountid=" + accountid;
        String request = "";
        try {
            request = Parametros.getDiasActivosDeCuentaASP();
            url = new URL(request);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setInstanceFollowRedirects(false);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("charset", "utf-8");
            connection.setRequestProperty("Content-Length", "" + Integer.toString(urlParameters.getBytes().length));
            connection.setUseCaches(false);

            DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
            wr.writeBytes(urlParameters);
            wr.flush();

            String line = "";
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            while ((line = reader.readLine()) != null) {
                lista = line;
                LogPC.println(this, line);
            }
            wr.close();
            reader.close();
        } catch (MalformedURLException mue) {
            LogPC.println(this, "Ouch - a MalformedURLException happened.");
            LogPC.printlnError(this, mue.getMessage(), mue);
        } catch (IOException ioe) {
            LogPC.println(this, "Oops- an IOException happened.");
            LogPC.printlnError(this, ioe.getMessage(), ioe);
        }
        procesarXMLString(lista);
    }


    public int getDiasActivos() {
        return diasActivos;
    }

    public int getDiasInactivos() {
        return diasInactivos;
    }
}
