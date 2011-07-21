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
			
			System.out.println(ack);
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
			
			System.out.println(ack);
			
			if(ack.contains("\"result\":1"))
				return true;
		}
		return false;
	}
}	
