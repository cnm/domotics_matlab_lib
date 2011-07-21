public class TesteGet{

	/* Use jdb to run line by line*/
	public static void main(String args[]){
		System.out.println(ControlFunctions.getLightAll());
		System.out.println(ControlFunctions.getLightLedTV());
		System.out.println(ControlFunctions.getLightBoard());
		System.out.println(ControlFunctions.getLightMiddle1());
		System.out.println(ControlFunctions.getLightMiddle2());
		System.out.println(ControlFunctions.getLightTv());
		System.out.println(ControlFunctions.getSocketsAll());
		System.out.println(ControlFunctions.getBlindsBoard());
		System.out.println(ControlFunctions.getBlindsMidle());
		System.out.println(ControlFunctions.getBlindsTv());
		System.out.println(ControlFunctions.getBlindsAll());
		System.out.println(ControlFunctions.getDoor());
		System.out.println(ControlFunctions.getOutsideTemperature());
		System.out.println(ControlFunctions.getOutsideWind());
		System.out.println(ControlFunctions.getOutsideWeather());
		System.out.println(ControlFunctions.getInsideCo2());
		System.out.println(ControlFunctions.getInsideHumidity());
		System.out.println(ControlFunctions.getInsideTemperature());
		System.out.println(ControlFunctions.getInsideLuminosity());
		
		System.out.println(ControlFunctions.getAirConditionerFanSpeed());
		System.out.println(ControlFunctions.getAirConditionerOnOff());
		System.out.println(ControlFunctions.getAirConditionerSwing());
		System.out.println(ControlFunctions.getAirConditionerMode());
		System.out.println(ControlFunctions.getAirConditionerTemperature());
		
	}
}
