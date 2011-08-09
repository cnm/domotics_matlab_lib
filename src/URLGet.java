/*****************  iSimplex **************************
*          Layer 0 - GET Message Funcions            *
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


public class URLGet{

        /**get data from the "_url" server
         * @return String with the ack*/
        public static String urlGet(String _url){


                try{
                        URL url = new URL(_url); //set URL 

                        HttpURLConnection con = (HttpURLConnection) url.openConnection();

                        //Set Properties
                        con.setRequestMethod("GET");
                        con.setDoOutput(false); //disable write
                        con.setDoInput(true);
                        con.setUseCaches(false); //disable cache
                        con.setRequestProperty("User-Agent","Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.8) Gecko/20051111 Firefox/1.5 BAVM/1.0.0");

                        con.connect();

                        //GET DATA
                        String data = "";


                        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                        StringBuffer databuffer = new StringBuffer(10000);
                        String s = "";

                        while(null != ((s = in.readLine())))
                                databuffer.append(s);
                                
                        in.close();
                                
                        data = new String(databuffer);
        
                        
                        return data;
                }
                catch(MalformedURLException e){return "URLget: MalformedURLException - URL Error";}
                catch(ProtocolException e){return "URLget: ProtocolException - set.ResquestMethod error";} 
                catch(IOException e){return "URLget: IOException - write/read error";}
        }

        /**Gerate a URL with the division ID to get information about the entire division
         * If the main URL changes, just change this method and It will work again*/
        public static String urlGetGenerator(Integer id){
                return "http://172.20.41.244/cake-domotica/divisions/get_devices/"+id.toString()+"/0";
        }
}
