package mx.com.sky.sel.managedbeans.utils.google;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.net.ssl.HttpsURLConnection;


public class VerifyRecaptcha {

	public static final String url = "https://www.google.com/recaptcha/api/siteverify";
	public static final String secret = "6Ld5fj8UAAAAAPJmPS-8amt8Ln84Gl_6MNguuZQ2";
	private final static String USER_AGENT = "Mozilla/5.0";
	private final static String LANGUAGE = "es-mx,es;q=0.8,en-us;q=0.6";

	public static boolean verify(String gRecaptchaResponse) throws IOException {
		if (gRecaptchaResponse == null || "".equals(gRecaptchaResponse)) {
			return false;
		}
		try{
		//URL obj = new URL(url);
		java.net.URL obj = new URL(null, url,new sun.net.www.protocol.https.Handler());

		HttpsURLConnection con = (HttpsURLConnection) obj.openConnection(); 

		// add reuqest header
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", LANGUAGE);

		String postParams = "secret=" + secret + "&response=" + gRecaptchaResponse;

		// Send post request
		con.setDoOutput(true);
                try{
                    DataOutputStream wr = new DataOutputStream(con.getOutputStream());
                    wr.writeBytes(postParams);
                    wr.flush();
                    wr.close();
                }catch(Exception pr){
                    pr.printStackTrace();
                    }
                    
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + postParams);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(new InputStreamReader(
				con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		// print result
		System.out.println(response.toString());
		
		//parse JSON response and return 'success' value
		JsonReader jsonReader = Json.createReader(new StringReader(response.toString()));
		JsonObject jsonObject = jsonReader.readObject();
		jsonReader.close();
		
		return jsonObject.getBoolean("success");
		}catch(Exception e){
			e.printStackTrace();
                        return false;
		}
	}
}