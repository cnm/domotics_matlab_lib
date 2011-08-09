
/*****************  iSimplex **************************
*Layer 1 - POST Operators: Functions to Change values *
*                                                     *
* Use this source-code to add url functions to        *
*  change values like "newOffset" or "newValue"       *
*                                                     *
*                                                     *
* @author Dário Nascimento - dfnascimento@hotmail.com *
* @version 1.0.0                                      *
* @since 14-07-2011                                   *
*******************************************************/



public class PostOperators{
	
	/** ..../modify/Device_Id/newOffset POST value="value"
	 * @param id  Device ID
	 *        value Value in POST Message
	 * @return true if Post Sucessfuly*/
	public static boolean newOffset(int id,int value){
		if(value >= 0 && value <=100){
			String url = URLPost.urlPostGenerator(id,"newOffset");
			String ack = URLPost.urlPost(url,"value="+value);
			
			if(ack.contains("\"result\":1"))
				return true;
		}
		return false;
	}
	
	
	/** ..../modify/Device_Id/newValue POST value="value"
	 * @param id  Device ID
	 *        value Value in POST Message
	 * @return true if Post Sucessfuly*/
	public static boolean newValue(int id,int value){
		if(value == 0 || value == 1){
			String url = URLPost.urlPostGenerator(id,"newValue");
			String ack = URLPost.urlPost(url,"value="+value);
						
			if(ack.contains("\"result\":1"))
				return true;
		}
		return false;
	}



	/** /modify/Device Id/newState 
	 * fanspeed: 15, 50 or 85 <=> slow, med or fast
		mode: 0 = cold, 1 = hot/.
		onoff: 0 or 1
		swing: 0 or 1 
		temperature: 16 to 30*/
	public static boolean newState(int id,int onoff,int temperature,int fanspeed, int mode,int swing){
		/*Check values*/
		if(fanspeed != 0 && fanspeed != 15 && fanspeed != 50 && fanspeed != 85)
			return false;
		if(mode != 0 && mode != 1)   //0 cold, 1 hot
			return false;
		if(onoff != 0 && onoff != 1)
			return false;
		if(swing != 0 && swing != 1)
			return false;
		if(temperature < 16 || temperature > 30)
			return false;
			
		String url = URLPost.urlPostGenerator(id,"newState");
		String value ="onoff="+onoff+"&temperature="+temperature+"&fanspeed="+fanspeed+"&mode="+mode+"&swing="+swing;
		
		String ack = URLPost.urlPost(url,value);
		
		if(ack.contains("\"result\":1"))
			return true;
		return false;
	}
}	
