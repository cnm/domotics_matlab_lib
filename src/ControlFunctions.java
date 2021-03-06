/*****************  iSimplex **************************
*     Layer 2 TOP - Control Device Functions          *
*                                                     *
* Use this source-code to add functions to            *
*  control the iSimplex's Devices                     *
*                                                     *
*                                                     *
* @author Dário Nascimento - dfnascimento@hotmail.com *
* @version 2.0.0                                      *
* @since 16-07-2012                                   *
*******************************************************/
import java.util.*;

public class ControlFunctions{
	
	/** If result == -999999 >> Error reading*/
	
/* ------------------- LIGHTS ---------------------*/	
	public static boolean setLightAll(int  value){
		return PostOperators.newOffset(95,value);
	}
	
	public static int getLightAll(){
		Map<String,String> data = GetOperators.getInfo(30,95);                          /*mudou se 96 para 95 */ 
		return Integer.parseInt(data.get("Percentagem"));
	}
                   
                    
                    
                    
                 /*-----LightLedTV------*/
	public static boolean setLightLedTV(int value){  //0 or 1
		return PostOperators.newValue(96,value);
	}
	
	public static int getLightLedTV(){
		Map<String,String> data = GetOperators.getInfo(30,96);
		return Integer.parseInt(data.get("Estado"));
	}
                   
                   
                   
                    /*------LightBoard-----*/	
	public static boolean setLightBoard(int value){
		return PostOperators.newOffset(97,value);
	}
	
	public static int getLightBoard(){
		Map<String,String> data = GetOperators.getInfo(30,97);
		return Integer.parseInt(data.get("Percentagem"));
	}
	                  
	                  
	                  
	                    /*------LightMiddle1-----*/
	public static boolean setLightMiddle1(int value){
		return PostOperators.newOffset(98,value);
	}
	
	public static int getLightMiddle1(){
		Map<String,String> data = GetOperators.getInfo(30,98);
		return Integer.parseInt(data.get("Percentagem"));
	}
	                  
	                  
	                  
	                    /*------LightMiddle2-----*/
	public static boolean setLightMiddle2(int value){
		return PostOperators.newOffset(99,value);
	}
	                 
	public static int getLightMiddle2(){
		Map<String,String> data = GetOperators.getInfo(30,99);
		return Integer.parseInt(data.get("Percentagem"));
	}
                    
                    
                    
                    /*-------LightTv----*/	
	public static boolean setLightTv(int value){
		return PostOperators.newOffset(100,value);
	}
	
	public static int getLightTv(){
		Map<String,String> data = GetOperators.getInfo(30,100);
		return Integer.parseInt(data.get("Percentagem"));
	}
	
	
	
	/* ------------ Sockets --------------------*/
	public static boolean setSocketsAll(int value){
		return PostOperators.newValue(101,value);  //0 or 1
	}
	
	public static int getSocketsAll(){
		Map<String,String> data = GetOperators.getInfo(31,101);
		return Integer.parseInt(data.get("Estado"));
	}
	
	
	
	
	/* -------------  Blinds Board -------------------*/
		
	public static boolean setBlindsBoard (int value){
		return PostOperators.newOffset(102,value);
	}
	
	public static int getBlindsBoard (){
		Map<String,String> data = GetOperators.getInfo(32,102);
		return Integer.parseInt(data.get("Percentagem"));
	}
	
	
	
                    /*-------Blinds Midle  ----*/		
	public static boolean setBlindsMidle(int value){
		return PostOperators.newOffset(103,value);
	}
	
	public static int getBlindsMidle(){
		Map<String,String> data = GetOperators.getInfo(32,103);
		return Integer.parseInt(data.get("Percentagem"));
	}
	
		
	
	
                    /*-------Blinds Tv ----*/		
	public static boolean setBlindsTv(int value){
		return PostOperators.newOffset(104,value);
	}
	
	public static int getBlindsTv(){
		Map<String,String> data = GetOperators.getInfo(32,104);
		return Integer.parseInt(data.get("Percentagem"));
	}
	
		
	
	
                    /*-------Blinds All ----*/		
	public static boolean setBlindsAll (int value){
		return PostOperators.newOffset(105,value);
	}
	
	public static int getBlindsAll(){
		Map<String,String> data = GetOperators.getInfo(32,105);
		return Integer.parseInt(data.get("Percentagem"));
	}
	


	/*  ------------ Door ---------------------------*/
	public static boolean setDoor(int value){
		/*return PostOperators.newValue(106,value);  //0 or 1*/
        return PostOperators.newValue(137,value);
	}
	public static int getDoor(){
		/*Map<String,String> data = GetOperators.getInfo(33,106);*/
        Map<String,String> data = GetOperators.getInfo(33,139);
		return Integer.parseInt(data.get("Read-Only"));
	}
    	public static int getDoor2(){
		/*Map<String,String> data = GetOperators.getInfo(33,106);*/
        Map<String,String> data = GetOperators.getInfo(33,137);
		return Integer.parseInt(data.get("Estado"));
	}
	
    
    /* ------------ Windows -------------------------*/
    	public static int getWindows(){
		Map<String,String> data = GetOperators.getInfo(33,136);
		return Integer.parseInt(data.get("Read-Only"));
	}
	
	/* ------------ Outside Meteo -------------------*/
	public static int getOutsideTemperature(){
		Map<String,String> data = GetOperators.getInfo(35,114);
		return Integer.parseInt(data.get("Read-Only"));
	}
	
	
	public static int getOutsideWind(){
		Map<String,String> data = GetOperators.getInfo(35,115);
		return Integer.parseInt(data.get("Read-Only"));
	}
	

	public static int getOutsideLuminosity(){
		Map<String,String> data = GetOperators.getInfo(35,169);
		return Integer.parseInt(data.get("Read-Only"));
	}
	
	/* ------------ Inside Meteo -------------------*/	
	public static int getInsideCo2(){
		Map<String,String> data = GetOperators.getInfo(36,119);
		return Integer.parseInt(data.get("Read-Only"));
	}
	
	
	public static int getInsideHumidity(){
		Map<String,String> data = GetOperators.getInfo(36,120);
		return Integer.parseInt(data.get("Read-Only"));
	}
	
	
	public static int getInsideTemperatureDoor(){                               /*acrescentou Door e mudou numeros */
		Map<String,String> data = GetOperators.getInfo(36,142);
		return Integer.parseInt(data.get("Read-Only"));
	}
    
    public static int getInsideTemperatureRoof(){                                /*novo */
		Map<String,String> data = GetOperators.getInfo(36,151);                    /* novo */ 
		return Integer.parseInt(data.get("Read-Only"));                            /*novo*/ 
	}
	
	public static int getInsideLuminosity(){
		Map<String,String> data = GetOperators.getInfo(36,122);
		return Integer.parseInt(data.get("Read-Only"));
	}
	
	
	
	
/* ------------ Air conditioner -------------------*/	
	/* GET */
	
	public static boolean setAirConditionerFanSpeed1 (int value){
		return PostOperators.newValue(173,value);
	}
    
    public static int getAirConditionerFanSpeed1(){
		Map<String,String> data = GetOperators.getInfo(37,173);
		return Integer.parseInt(data.get("fanspeed"));
	}
    public static boolean setAirConditionerFanSpeed2 (int value){
		return PostOperators.newValue(174,value);
	}
    
    public static int getAirConditionerFanSpeed2(){
		Map<String,String> data = GetOperators.getInfo(37,174);
		return Integer.parseInt(data.get("fanspeed"));
	}
      public static boolean setAirConditionerFanSpeed3 (int value){
		return PostOperators.newValue(175,value);
	}
    
    public static int getAirConditionerFanSpeed3(){
		Map<String,String> data = GetOperators.getInfo(37,175);
		return Integer.parseInt(data.get("fanspeed"));
	}
	
  
	
	public static boolean setAirConditionerOnOff(int onoff){
		/*Map<String,String> data = GetOperators.getInfo(37,177);*/
		/* return setAirConditioner(onoff,Integer.parseInt(data.get("temperature")),Integer.parseInt(data.get("mode")));*/
        return PostOperators.newValue(177, onoff);
    }
    
	public static int getAirConditionerOnOff(){ //0 off, 1 on
		Map<String,String> data = GetOperators.getInfo(37,177);      /*118-177 */ 
		return Integer.parseInt(data.get("onoff"));
	}
	
	/*public static int getAirConditionerSwing(){ //0 off, 1 on
		Map<String,String> data = GetOperators.getInfo(33,118);
		return Integer.parseInt(data.get("swing"));
	}*/
    
	  public static boolean setAirConditionerMode(int mode){
		/*Map<String,String> data = GetOperators.getInfo(37,176);
		return setAirConditioner(Integer.parseInt(data.get("onoff")));*/
          return PostOperators.newValue(176,mode);
	}	
	public static int getAirConditionerMode(){   //0 cold, 1 hot
		Map<String,String> data = GetOperators.getInfo(37,176);     /*118-176*/
		return Integer.parseInt(data.get("mode"));
	}
	
	/*public static int getAirConditionerTemperature(){
		Map<String,String> data = GetOperators.getInfo(33,118);
		return Integer.parseInt(data.get("temperature"));
	}*/
	
	
	/* Set*/
	
/*	public static boolean setAirConditionerTemperature(int temperature){
		Map<String,String> data = GetOperators.getInfo(33,118);
		return setAirConditioner(Integer.parseInt(data.get("onoff")),temperature,Integer.parseInt(data.get("fanspeed")),Integer.parseInt(data.get("mode")),Integer.parseInt(data.get("swing")));
	}*/	

	/*public static boolean setAirConditionerFanSpeedIncrease(){
		Map<String,String> data = GetOperators.getInfo(33,118);
		int fanspeed = Integer.parseInt(data.get("fanspeed"));
		int newfanspeed;
		switch(fanspeed){
			case 0: newfanspeed = 15; break;
			case 15: newfanspeed = 50; break;
			case 50: newfanspeed = 85; break;
			case 85: newfanspeed = 85; break;
			default: return false;
		}
		return setAirConditionerFanSpeed(newfanspeed);
	}

	public static boolean setAirConditionerFanSpeedDecrement(){
		Map<String,String> data = GetOperators.getInfo(33,118);
		int fanspeed = Integer.parseInt(data.get("fanspeed"));
		int newfanspeed;
		switch(fanspeed){
			case 0 : newfanspeed = 0; break;
			case 15: newfanspeed = 15; break;
			case 50: newfanspeed = 15; break;
			case 85: newfanspeed = 50; break;
			default: return false;
		}
		return setAirConditionerFanSpeed(newfanspeed);	
	}*/
	/*public static boolean setAirConditionerTurnOn(){
		return setAirConditionerOnOff(1);
	}
	
	public static boolean setAirConditionerTurnOff(){
		return setAirConditionerOnOff(0);
	}
	
	public static boolean setAirConditionerSwingOn(){
		return setAirConditionerSwing(1);
	}
	
	public static boolean setAirConditionerSwingOff(){
		return setAirConditionerSwing(0);
	}
	
	public static boolean setAirConditionerModeCold(){
		return setAirConditionerMode(0);
	}
	
	public static boolean setAirConditionerModeHot(){
		return setAirConditionerMode(1);
	}
*/

	/* Set values*/

/*	public static boolean setAirConditioner(int onoff,int temperature,int fanspeed,int mode,int swing){
		return PostOperators.newState(118,onoff,temperature,fanspeed,mode,swing);
	}
	
	public static boolean setAirConditionerFanSpeed(int fanspeed){
		Map<String,String> data = GetOperators.getInfo(33,118);
		return setAirConditioner(Integer.parseInt(data.get("onoff")),Integer.parseInt(data.get("temperature")),fanspeed,Integer.parseInt(data.get("mode")),Integer.parseInt(data.get("swing")));
	}	
	
	public static boolean setAirConditionerMode(int mode){
		Map<String,String> data = GetOperators.getInfo(33,118);
		return setAirConditioner(Integer.parseInt(data.get("onoff")),Integer.parseInt(data.get("temperature")),Integer.parseInt(data.get("fanspeed")),mode,Integer.parseInt(data.get("swing")));
	}	
	
	public static boolean setAirConditionerOnOff(int onoff){
		Map<String,String> data = GetOperators.getInfo(33,118);
		return setAirConditioner(onoff,Integer.parseInt(data.get("temperature")),Integer.parseInt(data.get("fanspeed")),Integer.parseInt(data.get("mode")),Integer.parseInt(data.get("swing")));
	}	
	
	public static boolean setAirConditionerSwing(int swing){
		Map<String,String> data = GetOperators.getInfo(33,118);
		return setAirConditioner(Integer.parseInt(data.get("onoff")),Integer.parseInt(data.get("temperature")),Integer.parseInt(data.get("fanspeed")),Integer.parseInt(data.get("mode")),swing);
	}	
	*/

}
