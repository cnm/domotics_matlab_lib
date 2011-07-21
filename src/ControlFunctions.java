/*****************  iSimplex **************************
*     Layer 2 TOP - Control Device Functions          *
*                                                     *
* Use this source-code to add functions to            *
*  control the iSimplex's Devices                     *
*                                                     *
*                                                     *
* @author Dário Nascimento - dfnascimento@hotmail.com *
* @version 1.0.0                                      *
* @since 14-07-2011                                   *
*******************************************************/
import java.util.*;

public class ControlFunctions{
	
	/** If result == -999999 >> Error reading*/
	
/* ------------------- LIGHTS ---------------------*/	
	public static boolean setLuzAll(int  value){
		return PostOperators.newOffset(95,value);
	}
	
	public static int getLightAll(){
		Map<String,String> data = GetOperators.getInfo(30,95);
		return Integer.parseInt(data.get("Percentagem"));
	}
                   
                    
                    
                    
                 /*-----LightLedTV------*/
	public static boolean setLightLedTV(int value){  //0 or 1
		return PostOperators.newValue(96,value);
	}
	
	public static int getLightLedTV(){
		Map<String,String> data = GetOperators.getInfo(30,97);
		return Integer.parseInt(data.get("Percentagem"));
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
		return PostOperators.newValue(106,value);  //0 or 1
	}
	public static int getDoor(){
		Map<String,String> data = GetOperators.getInfo(33,106);
		return Integer.parseInt(data.get("Estado"));
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
	

	public static int getOutsideWeather(){
		Map<String,String> data = GetOperators.getInfo(35,116);
		return Integer.parseInt(data.get("Read-Only Image"));
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
	
	
	public static int getInsideTemperature(){
		Map<String,String> data = GetOperators.getInfo(36,121);
		return Integer.parseInt(data.get("Read-Only"));
	}
	
	
	public static int getInsideLuminosity(){
		Map<String,String> data = GetOperators.getInfo(36,122);
		return Integer.parseInt(data.get("Read-Only"));
	}
	
	/* Air conditioner*/
	public static int getAirConditionerFanSpeed(){
		Map<String,String> data = GetOperators.getInfo(33,118);
		return Integer.parseInt(data.get("fanspeed"));
	}
	
	public static int getAirConditionerOnOff(){
		Map<String,String> data = GetOperators.getInfo(33,118);
		return Integer.parseInt(data.get("onoff"));
	}
	
	public static int getAirConditionerSwing(){
		Map<String,String> data = GetOperators.getInfo(33,118);
		return Integer.parseInt(data.get("swing"));
	}
	
	public static int getAirConditionerMode(){
		Map<String,String> data = GetOperators.getInfo(33,118);
		return Integer.parseInt(data.get("mode"));
	}
	
	public static int getAirConditionerTemperature(){
		Map<String,String> data = GetOperators.getInfo(33,118);
		return Integer.parseInt(data.get("temperature"));
	}
	
}
