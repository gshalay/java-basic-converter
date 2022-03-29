import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Converter {
	// Temperature Mode Constants
	static final int CELSIUS_TO_KELVIN = 0;
	static final int KELVIN_TO_CELSIUS = 1;
	static final int CELSIUS_TO_FAHRENHEIT = 2;
	static final int FAHRENHEIT_TO_CELSIUS = 3;
	static final int FAHRENHEIT_TO_KELVIN = 4;
	static final int KELVIN_TO_FAHRENHEIT = 5;
	
	// Measurement Mode Constants
	static final int MM_TO_CM = 0;
	static final int MM_TO_IN = 1;
	static final int MM_TO_FT = 2;
	static final int MM_TO_YD = 3;
	static final int MM_TO_KM = 4;
	static final int MM_TO_MI = 5;
	
	static final int CM_TO_MM = 6;
	static final int CM_TO_IN = 7;
	static final int CM_TO_FT = 8;
	static final int CM_TO_YD = 9;
	static final int CM_TO_KM = 10;
	static final int CM_TO_MI = 11;
	
	static final int IN_TO_MM = 12;
	static final int IN_TO_CM = 13;
	static final int IN_TO_FT = 14;
	static final int IN_TO_YD = 15;
	static final int IN_TO_KM = 16;
	static final int IN_TO_MI = 17;
	
	static final int FT_TO_MM = 18;
	static final int FT_TO_CM = 19;
	static final int FT_TO_IN = 20;
	static final int FT_TO_YD = 21;
	static final int FT_TO_KM = 22;
	static final int FT_TO_MI = 23;
	
	static final int YD_TO_MM = 24;
	static final int YD_TO_CM = 25;
	static final int YD_TO_IN = 26;
	static final int YD_TO_FT = 27;
	static final int YD_TO_KM = 28;
	static final int YD_TO_MI = 29;
	
	static final int KM_TO_MM = 30;
	static final int KM_TO_CM = 31;
	static final int KM_TO_IN = 32;
	static final int KM_TO_FT = 33;
	static final int KM_TO_YD = 34;
	static final int KM_TO_MI= 35;
	
	static final int MI_TO_MM = 36;
	static final int MI_TO_CM = 37;
	static final int MI_TO_IN = 38;
	static final int MI_TO_FT = 39;
	static final int MI_TO_YD = 40;
	static final int MI_TO_KM = 41;
	
	static final double KELVIN_CEL = 273.15;
	
	public static double ConvertTemperature(int conversionType, double tempToConvert) {
		double result = 0.0;
		DecimalFormat df = new DecimalFormat("#.###");
		df.setRoundingMode(RoundingMode.DOWN);
		

		// Determine the type of conversion to do.
		switch(conversionType) {
			case CELSIUS_TO_KELVIN:
				result = CelsiusToKelvin(tempToConvert);
				break;
			case KELVIN_TO_CELSIUS:
				result = KelvinToCelsius(tempToConvert);
				break;
			case CELSIUS_TO_FAHRENHEIT:
				result = CelsiusToFahrenheit(tempToConvert);
				break;
			case FAHRENHEIT_TO_CELSIUS:
				result = FahrenheitToCelsius(tempToConvert);
				break;
			case FAHRENHEIT_TO_KELVIN:
				result = FahrenheitToKelvin(tempToConvert);
				break;
			case KELVIN_TO_FAHRENHEIT:
				result = KelvinToFahrenheit(tempToConvert);
				break;
			default:
				System.out.println("Error determining temprature conversion type!");
				break;
		}
		
		return Double.parseDouble(df.format(result));
	}
	
	public static double ConvertMeasurement(int conversionType, double measurementToConvert){
		double result = 0.0;
		DecimalFormat df = new DecimalFormat("#.###");
		df.setRoundingMode(RoundingMode.DOWN);
		
		switch(conversionType){
			case MM_TO_CM:
				result = MillimetersToCentimeters(measurementToConvert);
				break;
			case MM_TO_IN:
				result = MillimetersToInches(measurementToConvert);
				break;
			case MM_TO_FT:
				result = MillimetersToFeet(measurementToConvert);
				break;
			case MM_TO_YD:
				result = MillimetersToYards(measurementToConvert);
				break;
			case MM_TO_KM:
				result = MillimetersToKilometers(measurementToConvert);
				break;
			case MM_TO_MI:
				result = MillimetersToMiles(measurementToConvert);
				break;
			case CM_TO_MM:
				result = CentimetersToMillimeters(measurementToConvert);
				break;
			case CM_TO_IN:
				result = CentimetersToInches(measurementToConvert);
				break;
			case CM_TO_FT:
				result = CentimetersToFeet(measurementToConvert);
				break;
			case CM_TO_YD:
				result = CentimetersToYards(measurementToConvert);
				break;
			case CM_TO_KM:
				result = CentimetersToKilometers(measurementToConvert);
				break;
			case CM_TO_MI:
				result = CentimetersToMiles(measurementToConvert);
				break;
			case IN_TO_MM:
				result = InchesToMillimeters(measurementToConvert);
				break;
			case IN_TO_CM:
				result = InchesToCentimeters(measurementToConvert);
				break;
			case IN_TO_FT:
				result = InchesToFeet(measurementToConvert);
				break;
			case IN_TO_YD:
				result = InchesToYards(measurementToConvert);
				break;
			case IN_TO_KM:
				result = InchesToKilometers(measurementToConvert);
				break;
			case IN_TO_MI:
				result = InchesToMiles(measurementToConvert);
				break;
			case FT_TO_MM:
				result = FeetToMillimeters(measurementToConvert);
				break;
			case FT_TO_CM:
				result = FeetToCentimeters(measurementToConvert);
				break;
			case FT_TO_IN:
				result = FeetToInches(measurementToConvert);
				break;
			case FT_TO_YD:
				result = FeetToYards(measurementToConvert);
				break;
			case FT_TO_KM:
				result = FeetToKilometers(measurementToConvert);
				break;
			case FT_TO_MI:
				result = FeetToMiles(measurementToConvert);
				break;
			case YD_TO_MM:
				result = YardsToMillimeters(measurementToConvert);
				break;
			case YD_TO_CM:
				result = YardsToCentimeters(measurementToConvert);
				break;
			case YD_TO_IN:
				result = YardsToInches(measurementToConvert);
				break;
			case YD_TO_FT:
				result = YardsToFeet(measurementToConvert);
				break;
			case YD_TO_KM:
				result = YardsToKilometers(measurementToConvert);
				break;
			case YD_TO_MI:
				result = YardsToMiles(measurementToConvert);
				break;
			case KM_TO_MM:
				result = KilometersToMillimeters(measurementToConvert);
				break;
			case KM_TO_CM:
				result = KilometersToCentimeters(measurementToConvert);
				break;
			case KM_TO_IN:
				result = KilometersToInches(measurementToConvert);
				break;
			case KM_TO_FT:
				result = KilometersToFeet(measurementToConvert);
				break;
			case KM_TO_YD:
				result = KilometersToYards(measurementToConvert);
				break;
			case KM_TO_MI:
				result = KilometersToMiles(measurementToConvert);
				break;
			case MI_TO_MM:
				result = MilesToMillimeters(measurementToConvert);
				break;
			case MI_TO_CM:
				result = MilesToCentimeters(measurementToConvert);
				break;
			case MI_TO_IN:
				result = MilesToInches(measurementToConvert);
				break;
			case MI_TO_FT:
				result = MilesToFeet(measurementToConvert);
				break;
			case MI_TO_YD:
				result = MilesToYards(measurementToConvert);
				break;
			case MI_TO_KM:
				result = MilesToKilometers(measurementToConvert);
				break;
		}
		
		return Double.parseDouble(df.format(result));
	}
// Temperature Conversion Functions
	public static double CelsiusToKelvin(double celsius) {
		double result = 0.0;
		
		result = celsius + KELVIN_CEL;
		
		return result;
	}
	
	public static double KelvinToCelsius(double kelvin) {
		double result = 0.0;
		
		result = kelvin - KELVIN_CEL;
		
		return result;
	}
	
	public static double CelsiusToFahrenheit(double celsius) {
		double result = 0.0;
		
		result = (celsius * 1.8) + 32.0;
		
		return result;
	}
	
	public static double FahrenheitToCelsius(double fahrenheit) {
		double result = 0.0;
		
		result = (fahrenheit - 32.0) * (5.0/9.0);
		
		return result;
	}
	
	public static double FahrenheitToKelvin(double fahrenheit) {
		double result = 0.0;
		
		result = (fahrenheit - 32.0) * (5.0/9.0) + KELVIN_CEL;
		
		return result;
	}
	
	public static double KelvinToFahrenheit(double kelvin) {
		double result = 0.0;
		
		result = (kelvin - KELVIN_CEL) * (9.0/5.0) + 32.0;
		
		return result;
	}
	
	
// Measurement Conversion Functions	
	public static double MillimetersToCentimeters(double measurement) {
		double result = 0.0;
		
		result = measurement / 10.0;
		
		return result;
	}
	
	public static double MillimetersToInches(double measurement) {
		double result = 0.0;
		
		result = measurement / 25.4;
		
		return result;
	}
	
	public static double MillimetersToFeet(double measurement) {
		double result = 0.0;
		
		result = measurement / 305.0;
		
		return result;
	}
	
	public static double MillimetersToYards(double measurement) {
		double result = 0.0;
		
		result = measurement / 914.0;
		
		return result;
	}
	
	public static double MillimetersToKilometers(double measurement) {
		double result = 0.0;
		
		result = measurement / 1000000.0;
		
		return result;
	}
	
	public static double MillimetersToMiles(double measurement) {
		double result = 0.0;
		
		result = measurement /  1609000.0;
		
		return result;
	}
	
	
	
	public static double CentimetersToMillimeters(double measurement) {
		double result = 0.0;
		
		result = measurement *  10.0;
		
		return result;
	}
	
	public static double CentimetersToInches(double measurement) {
		double result = 0.0;
		
		result = measurement / 2.54;
		
		return result;
	}
	
	public static double CentimetersToFeet(double measurement) {
		double result = 0.0;
		
		result = measurement / 30.48;
		
		return result;
	}
	
	public static double CentimetersToYards(double measurement) {
		double result = 0.0;
		
		result = measurement / 91.44;
		
		return result;
	}
	
	public static double CentimetersToKilometers(double measurement) {
		double result = 0.0;
		
		result = measurement / 1000000.0;
		
		return result;
	}
	
	public static double CentimetersToMiles(double measurement) {
		double result = 0.0;
		
		result = measurement / 160934.0;
		
		return result;
	}
	
	
	
	public static double InchesToMillimeters(double measurement) {
		double result = 0.0;
		
		result = measurement * 25.4;
		
		return result;
	}
	
	public static double InchesToCentimeters(double measurement) {
		double result = 0.0;
		
		result = measurement * 2.54;
		
		return result;
	}
	
	public static double InchesToFeet(double measurement) {
		double result = 0.0;
		
		result = measurement / 12.0;
		
		return result;
	}
	
	public static double InchesToYards(double measurement) {
		double result = 0.0;
		
		result = measurement / 36.0;
		
		return result;
	}
	
	public static double InchesToKilometers(double measurement) {
		double result = 0.0;
		
		result = measurement / 39370.0;
		
		return result;
	}
	
	public static double InchesToMiles(double measurement) {
		double result = 0.0;
		
		result = measurement / 63360.0;
		
		return result;
	}
	
	
	
	public static double FeetToMillimeters(double measurement) {
		double result = 0.0;
		
		result = measurement * 305.0;
		
		return result;
	}
	
	public static double FeetToCentimeters(double measurement) {
		double result = 0.0;
		
		result = measurement * 30.48;
		
		return result;
	}
	
	public static double FeetToInches(double measurement) {
		double result = 0.0;
		
		result = measurement * 12.0;
		
		return result;
	}
	
	public static double FeetToYards(double measurement) {
		double result = 0.0;
		
		result = measurement / 3.0;
		
		return result;
	}
	
	public static double FeetToKilometers(double measurement) {
		double result = 0.0;
		
		result = measurement / 3281.0;
		
		return result;
	}
	
	public static double FeetToMiles(double measurement) {
		double result = 0.0;
		
		result = measurement / 5280.0;
		
		return result;
	}
	
	
	
	public static double YardsToMillimeters(double measurement) {
		double result = 0.0;
		
		result = measurement * 914.0;
		
		return result;
	}
	
	public static double YardsToCentimeters(double measurement) {
		double result = 0.0;
		
		result = measurement * 91.44;
		
		return result;
	}
	
	public static double YardsToInches(double measurement) {
		double result = 0.0;
		
		result = measurement * 36.0;
		
		return result;
	}
	
	public static double YardsToFeet(double measurement) {
		double result = 0.0;
		
		result = measurement * 3.0;
		
		return result;
	}
	
	public static double YardsToKilometers(double measurement) {
		double result = 0.0;
		
		result = measurement / 1094.0;
		
		return result;
	}
	
	public static double YardsToMiles(double measurement) {
		double result = 0.0;
		
		result = measurement / 1760.0;
		
		return result;
	}
	
	
	
	public static double KilometersToMillimeters(double measurement) {
		double result = 0.0;
		
		result = measurement * 1000000.0;
		
		return result;
	}
	
	public static double KilometersToCentimeters(double measurement) {
		double result = 0.0;
		
		result = measurement * 100000.0;
		
		return result;
	}
	
	public static double KilometersToInches(double measurement) {
		double result = 0.0;
		
		result = measurement * 39370.0;
		
		return result;
	}
	
	public static double KilometersToFeet(double measurement) {
		double result = 0.0;
		
		result = measurement * 3281.0;
		
		return result;
	}
	
	public static double KilometersToYards(double measurement) {
		double result = 0.0;
		
		result = measurement * 1094.0;
		
		return result;
	}
	
	public static double KilometersToMiles(double measurement) {
		double result = 0.0;
		
		result = measurement / 1.609;
		
		return result;
	}
	
	
	
	public static double MilesToMillimeters(double measurement) {
		double result = 0.0;
		
		result = measurement * 1609000.0;
		
		return result;
	}
	
	public static double MilesToCentimeters(double measurement) {
		double result = 0.0;
		
		result = measurement * 160934.0;
		
		return result;
	}
	
	public static double MilesToInches(double measurement) {
		double result = 0.0;
		
		result = measurement * 63360.0;
		
		return result;
	}
	
	public static double MilesToFeet(double measurement) {
		double result = 0.0;
		
		result = measurement * 5280.0;
		
		return result;
	}
	
	public static double MilesToYards(double measurement) {
		double result = 0.0;
		
		result = measurement * 1760.0;
		
		return result;
	}
	
	public static double MilesToKilometers(double measurement) {
		double result = 0.0;
		
		result = measurement * 1.609;
		
		return result;
	}
}
