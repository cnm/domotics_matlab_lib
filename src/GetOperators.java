/*****************  iSimplex **************************
*Layer 1 - GET Operators: Functions to Change values *
*                                                     *
* Use this source-code to add url functions to        *
*  read values     *
*                                                     *
*                                                     *
* @author Dário Nascimento - dfnascimento@hotmail.com *
* @version 1.0.0                                      *
* @since 14-07-2011                                   *
*******************************************************/
import com.google.gson.*;
import java.util.*;

public class GetOperators{
	/** Get info about the "device" in "division"*/	
	public static Map<String,String> getInfo(int division,int device){
			String url = URLGet.urlGetGenerator(division); //generate URL
			String json = URLGet.urlGet(url);				//get JSON file from URL

			Map<String,String> data = readDevice(json,device);				//get info from JSON
			if(data.size() == 0){
				System.out.println("Read error");
			}	
			return data;
	}


	/**Read the device id from the JSON string
	 * @return Map <PropertyName,PropertyValue>*/
	public static Map<String,String> readDevice(String json,Integer id){
		Map<String,String> data = new HashMap<String,String>();
		JsonElement jsonElement = new JsonParser().parse(json); //[{\"id\":\"114\"}]

		JsonArray deviceObjectArray = jsonElement.getAsJsonArray(); //[{\"id\":\"114\"}] 

		for(JsonElement object: deviceObjectArray){
				JsonObject jso = object.getAsJsonObject();
				JsonArray deviceProperties = jso.getAsJsonArray("DeviceProperty");

                for (int i = 0; i < deviceProperties.size(); i++) {

                    JsonElement prop = deviceProperties.get(i);

                    JsonObject jsoProp = prop.getAsJsonObject();
                    String device_id = jsoProp.get("device_id").toString().replace("\"",""); //delete "" element;

                    if(device_id.equals(id.toString())){
                        String prop_value = jsoProp.get("value").toString().replace("\"","");
                        String prop_name = jsoProp.get("name").toString().replace("\"","");
                        data.put(prop_name,prop_value);
                    }
                }
			}
			return data;
	}
}


