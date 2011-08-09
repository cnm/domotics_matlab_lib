/*****************  iSimplex **************************
*          Layer 0 - POST Message Funcions            *
*                                                     *
* Use this source-code to change the URL of server    *
* @see urlGenerator                                   *
*                                                     *
* @author Dário Nascimento - dfnascimento@hotmail.com *
* @version 1.0.0                                      *
* @since 14-07-2011                                   *
*******************************************************/

import java.net.*; 
import java.io.*; 


public class URLPost{
	
	/**Post "value" in the "_url" server
	 * @return String with the ack*/
	public static String urlPost(String _url,String value){
		try{
			URL url = new URL(_url); //set URL 
			
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			//Set Properties
			con.setRequestMethod("POST");
			con.setDoOutput(true); //enable write
			con.setUseCaches(false); //disable cache
			con.setRequestProperty("User-Agent","Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.8) Gecko/20051111 Firefox/1.5 BAVM/1.0.0");
			
			
			//Send data
			OutputStreamWriter out = new OutputStreamWriter(con.getOutputStream()); //create a stream to write	
			
			out.write(value);
			out.flush();
			
			//Receive ack
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			String str;
			String ack = "";
			
			while((str = in.readLine()) != null){
				ack = ack + str;
			}

			//close connection
			in.close();
			out.close();
			
			return ack;
		}
		catch(MalformedURLException e){return "URLPost: MalformedURLException - URL Error";}
		catch(ProtocolException e){return "URLPost: ProtocolException - set.ResquestMethod error";} 
		catch(IOException e){return "URLPost: IOException - write/read error";}
	}
	/**Gerate a URL with the device ID and Operator (newOffset, new Value,etc)
	 * If the main URL changes, just change this method and It will work again*/
	public static String urlPostGenerator(Integer id,String operator){
		return "http://172.20.41.244/cake-domotica/devices/modify/"+id.toString()+"/"+operator;
	}
}
	

	


