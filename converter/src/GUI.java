import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
	
	static JRadioButton celToKelvin;
	static JRadioButton kelvinToCel;
	static JRadioButton celToFah;
	static JRadioButton fahToCel;
	static JRadioButton fahToKelvin;
	static JRadioButton kelvinToFah;
	
	static String convertFrom = "";
	static String convertTo = "";
    
	public static void initialize() {
       JFrame frame = new JFrame("Utility / Converter");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(1250, 1000);
       
       //build the tabbed pane using JPanels.
       JTabbedPane tabbedPane =  new JTabbedPane();
       
       // Add the tabbed panels and set layout schemes.
       JPanel tempConvertPane = new JPanel();
       JPanel measurementConvertPane = new JPanel();
       JPanel calculatorPane = new JPanel();
       
       tempConvertPane.setLayout(null);
       measurementConvertPane.setLayout(null);
       calculatorPane.setLayout(null);
       
       
       // Add form elements to the convert temp pane.
       JButton convertBtn = new JButton("Convert Temperature");
       convertBtn.setBounds(25, 305, 200, 35);
       tempConvertPane.add(convertBtn);
       
       celToKelvin = new JRadioButton("Celsius to Kelvin");    
       kelvinToCel = new JRadioButton("Kelvin to Celsius");
       celToFah = new JRadioButton("Celsius to Fahrenheit");    
       fahToCel = new JRadioButton("Fahrenheit to Celsius");
       fahToKelvin = new JRadioButton("Fahrenheit to Kelvin");    
       kelvinToFah = new JRadioButton("Kelvin to Fahrenheit");
       
       celToKelvin.setBounds(25, 25, 200, 30);    
       kelvinToCel.setBounds(25, 50, 200, 30);
       celToFah.setBounds(25, 75, 200, 30);    
       fahToCel.setBounds(25, 100, 200, 30);
       fahToKelvin.setBounds(25, 125, 200, 30);    
       kelvinToFah.setBounds(25, 150, 200, 30);
       
       ButtonGroup convertBtnGrp = new ButtonGroup();    
       
       convertBtnGrp.add(celToKelvin);
       convertBtnGrp.add(kelvinToCel);
       convertBtnGrp.add(celToFah);
       convertBtnGrp.add(fahToCel);
       convertBtnGrp.add(fahToKelvin);
       convertBtnGrp.add(kelvinToFah);
       
       // Set the default selected conversion option.
       celToKelvin.setSelected(true);
       
       tempConvertPane.add(celToKelvin);
       tempConvertPane.add(kelvinToCel);
       tempConvertPane.add(celToFah);
       tempConvertPane.add(fahToCel);
       tempConvertPane.add(fahToKelvin);
       tempConvertPane.add(kelvinToFah);
       
       JLabel tempInputLbl = new JLabel();
       tempInputLbl.setText("Enter Temp to Convert:");
       tempInputLbl.setBounds(25, 200, 200, 30);
       tempConvertPane.add(tempInputLbl);
       
       JTextField tempInputTxt = new JTextField();
       tempInputTxt.setBounds(25, 225, 200, 30);
       tempConvertPane.add(tempInputTxt);
       
       JLabel warnInputLbl = new JLabel();
       warnInputLbl.setText("* Must be a number!");
       warnInputLbl.setForeground(Color.RED);
       warnInputLbl.setBounds(230, 225, 500, 30);
       warnInputLbl.setVisible(false);
       tempConvertPane.add(warnInputLbl);
       
       JLabel tempResultLbl = new JLabel();
       tempResultLbl.setText("Result: ");
       tempResultLbl.setBounds(25, 265, 800, 30);
       tempConvertPane.add(tempResultLbl);
       
       // Add the UI Elements for the 
       // Measurements mm, cm, inches, ft, yrd, km, mi 
       //JRadioButtons
       JRadioButton mmToCm = new JRadioButton("Millimeters to Centimeters (mm -> cm)");
       JRadioButton mmToIn = new JRadioButton("Millimeters to Inches (mm -> in)");
       JRadioButton mmToFt = new JRadioButton("Millimeters to Feet (mm -> ft)");
       JRadioButton mmToYd = new JRadioButton("Millimeters to Yards (mm -> yd)");
       JRadioButton mmToKm = new JRadioButton("Millimeters to Kilometers (mm -> km)");
       JRadioButton mmToMi = new JRadioButton("Millimeters to Miles (mm -> mi)");
       
       JRadioButton cmToMm = new JRadioButton("Centimeters to Millimeters (cm -> mm)");
       JRadioButton cmToIn = new JRadioButton("Centimeters to Inches (cm -> in)");
       JRadioButton cmToFt = new JRadioButton("Centimeters to Feet (cm -> ft)");
       JRadioButton cmToYd = new JRadioButton("Centimeters to Yards (cm -> yd)");
       JRadioButton cmToKm = new JRadioButton("Centimeters to Kilometers (mm -> km)");
       JRadioButton cmToMi = new JRadioButton("Centimeters to Miles (cm -> mi)");
       
       JRadioButton inToMm = new JRadioButton("Inches to Millimeters (in -> mm)");
       JRadioButton inToCm = new JRadioButton("Inches to Centimeters (in -> cm)");
       JRadioButton inToFt = new JRadioButton("Inches to Feet (in -> ft)");
       JRadioButton inToYd = new JRadioButton("Inches to Yards (in -> yd)");
       JRadioButton inToKm = new JRadioButton("Inches to Kilometers (in -> km)");
       JRadioButton inToMi = new JRadioButton("Inches to Miles (in -> mi)");

       JRadioButton ftToMm = new JRadioButton("Feet to Millimeters (ft -> mm)");
       JRadioButton ftToCm = new JRadioButton("Feet to Centimeters (ft -> cm)");
       JRadioButton ftToIn = new JRadioButton("Feet to Inches (ft -> in)");
       JRadioButton ftToYd = new JRadioButton("Feet to Yards (ft -> yd)");
       JRadioButton ftToKm = new JRadioButton("Feet to Kilometers (ft -> km)");
       JRadioButton ftToMi = new JRadioButton("Feet to Miles (ft -> mi)");
       
       JRadioButton ydToMm = new JRadioButton("Yards to Millimeters (in -> mm)");
       JRadioButton ydToCm = new JRadioButton("Yards to Centimeters (in -> cm)");
       JRadioButton ydToFt = new JRadioButton("Yards to Feet (yd -> ft)");
       JRadioButton ydToIn = new JRadioButton("Yards to Inches (yd -> in)");
       JRadioButton ydToKm = new JRadioButton("Yards to Kilometers (yd -> km)");
       JRadioButton ydToMi = new JRadioButton("Yards to Miles (yd -> mi)");
       
       JRadioButton kmToMm = new JRadioButton("Kilometers to Millimeters (km -> mm)");
       JRadioButton kmToCm = new JRadioButton("Kilometers to Centimeters (km -> cm)");
       JRadioButton kmToFt = new JRadioButton("Kilometers to Feet (km -> ft)");
       JRadioButton kmToIn = new JRadioButton("Kilometers to Inches (km -> in)");
       JRadioButton kmToYd = new JRadioButton("Kilometers to Yards (km -> yd)");
       JRadioButton kmToMi = new JRadioButton("Kilometers to Miles (km -> mi)");
       
       JRadioButton miToMm = new JRadioButton("Miles to Millimeters (mi -> mm)");
       JRadioButton miToCm = new JRadioButton("Miles to Centimeters (mi -> cm)");
       JRadioButton miToFt = new JRadioButton("Miles to Feet (mi -> ft)");
       JRadioButton miToIn = new JRadioButton("Miles to Inches (mi -> in)");
       JRadioButton miToKm = new JRadioButton("Miles to Kilometers (mi -> km)");
       JRadioButton miToYd = new JRadioButton("Miles to Yards (mi -> yd)");
       
       mmToCm.setSelected(true); //Set default selected conversion.
       
       mmToCm.setBounds(25, 25, 250, 30);    
       mmToIn.setBounds(25, 50, 250, 30);    
       mmToFt.setBounds(25, 75, 250, 30);    
       mmToYd.setBounds(25, 100, 250, 30);    
       mmToKm.setBounds(25, 125, 250, 30);    
       mmToMi.setBounds(25, 150, 250, 30);    
       
       cmToMm.setBounds(25, 200, 250, 30);    
       cmToIn.setBounds(25, 225, 250, 30);    
       cmToFt.setBounds(25, 250, 250, 30);    
       cmToYd.setBounds(25, 275, 250, 30);    
       cmToKm.setBounds(25, 300, 250, 30);    
       cmToMi.setBounds(25, 325, 250, 30);    
       
       inToMm.setBounds(300, 25, 250, 30);    
       inToCm.setBounds(300, 50, 250, 30);    
       inToFt.setBounds(300, 75, 250, 30);    
       inToYd.setBounds(300, 100, 250, 30);    
       inToKm.setBounds(300, 125, 250, 30);    
       inToMi.setBounds(300, 150, 250, 30);    
       
       ftToMm.setBounds(300, 200, 250, 30);    
       ftToCm.setBounds(300, 225, 250, 30);    
       ftToIn.setBounds(300, 250, 250, 30);    
       ftToYd.setBounds(300, 275, 250, 30);    
       ftToKm.setBounds(300, 300, 250, 30);    
       ftToMi.setBounds(300, 325, 250, 30);    
       
       ydToMm.setBounds(575, 25, 250, 30);    
       ydToCm.setBounds(575, 50, 250, 30);    
       ydToIn.setBounds(575, 75, 250, 30);    
       ydToFt.setBounds(575, 100, 250, 30);    
       ydToKm.setBounds(575, 125, 250, 30);    
       ydToMi.setBounds(575, 150, 250, 30);    
       
       kmToMm.setBounds(575, 200, 250, 30);    
       kmToCm.setBounds(575, 225, 250, 30);    
       kmToIn.setBounds(575, 250, 250, 30);    
       kmToFt.setBounds(575, 275, 250, 30);    
       kmToYd.setBounds(575, 300, 250, 30);    
       kmToMi.setBounds(575, 325, 250, 30);    
       
       miToMm.setBounds(850, 25, 250, 30);    
       miToCm.setBounds(850, 50, 250, 30);    
       miToIn.setBounds(850, 75, 250, 30);    
       miToFt.setBounds(850, 100, 250, 30);    
       miToYd.setBounds(850, 125, 250, 30);    
       miToKm.setBounds(850, 150, 250, 30);    
       
       ButtonGroup measurementBtnGrp = new ButtonGroup();
    // Measurements mm, cm, inches, ft, yrd, km, mi
       measurementBtnGrp.add(mmToCm);
       measurementBtnGrp.add(mmToIn);
       measurementBtnGrp.add(mmToFt);
       measurementBtnGrp.add(mmToYd);
       measurementBtnGrp.add(mmToKm);
       measurementBtnGrp.add(mmToMi);
       
       measurementBtnGrp.add(cmToMm);
       measurementBtnGrp.add(cmToIn);
       measurementBtnGrp.add(cmToFt);
       measurementBtnGrp.add(cmToYd);
       measurementBtnGrp.add(cmToKm);
       measurementBtnGrp.add(cmToMi);
       
       measurementBtnGrp.add(inToMm);
       measurementBtnGrp.add(inToCm);
       measurementBtnGrp.add(inToFt);
       measurementBtnGrp.add(inToYd);
       measurementBtnGrp.add(inToKm);
       measurementBtnGrp.add(inToMi);
       
       measurementBtnGrp.add(ftToMm);
       measurementBtnGrp.add(ftToCm);
       measurementBtnGrp.add(ftToIn);
       measurementBtnGrp.add(ftToYd);
       measurementBtnGrp.add(ftToKm);
       measurementBtnGrp.add(ftToMi);
       
       measurementBtnGrp.add(ydToMm);
       measurementBtnGrp.add(ydToCm);
       measurementBtnGrp.add(ydToIn);
       measurementBtnGrp.add(ydToFt);
       measurementBtnGrp.add(ydToKm);
       measurementBtnGrp.add(ydToMi);
       
       measurementBtnGrp.add(kmToMm);
       measurementBtnGrp.add(kmToCm);
       measurementBtnGrp.add(kmToIn);
       measurementBtnGrp.add(kmToFt);
       measurementBtnGrp.add(kmToYd);
       measurementBtnGrp.add(kmToMi);
       
       measurementBtnGrp.add(miToMm);
       measurementBtnGrp.add(miToCm);
       measurementBtnGrp.add(miToIn);
       measurementBtnGrp.add(miToFt);
       measurementBtnGrp.add(miToYd);
       measurementBtnGrp.add(miToKm);
       
       
       measurementConvertPane.add(mmToCm);
       measurementConvertPane.add(mmToIn);
       measurementConvertPane.add(mmToFt);
       measurementConvertPane.add(mmToYd);
       measurementConvertPane.add(mmToKm);
       measurementConvertPane.add(mmToMi);
       
       measurementConvertPane.add(cmToMm);
       measurementConvertPane.add(cmToIn);
       measurementConvertPane.add(cmToFt);
       measurementConvertPane.add(cmToYd);
       measurementConvertPane.add(cmToKm);
       measurementConvertPane.add(cmToMi);
       
       measurementConvertPane.add(inToMm);
       measurementConvertPane.add(inToCm);
       measurementConvertPane.add(inToFt);
       measurementConvertPane.add(inToYd);
       measurementConvertPane.add(inToKm);
       measurementConvertPane.add(inToMi);
       
       measurementConvertPane.add(ftToMm);
       measurementConvertPane.add(ftToCm);
       measurementConvertPane.add(ftToIn);
       measurementConvertPane.add(ftToYd);
       measurementConvertPane.add(ftToKm);
       measurementConvertPane.add(ftToMi);
       
       measurementConvertPane.add(ydToMm);
       measurementConvertPane.add(ydToCm);
       measurementConvertPane.add(ydToIn);
       measurementConvertPane.add(ydToFt);
       measurementConvertPane.add(ydToKm);
       measurementConvertPane.add(ydToMi);
       
       measurementConvertPane.add(kmToMm);
       measurementConvertPane.add(kmToCm);
       measurementConvertPane.add(kmToIn);
       measurementConvertPane.add(kmToFt);
       measurementConvertPane.add(kmToYd);
       measurementConvertPane.add(kmToMi);
       
       measurementConvertPane.add(miToMm);
       measurementConvertPane.add(miToCm);
       measurementConvertPane.add(miToIn);
       measurementConvertPane.add(miToFt);
       measurementConvertPane.add(miToYd);
       measurementConvertPane.add(miToKm);
       
       JLabel measurementInputLbl = new JLabel();
       measurementInputLbl.setText("Enter Measurement to Convert From:");
       measurementInputLbl.setBounds(25, 375, 250, 30);
       measurementConvertPane.add(measurementInputLbl);
       
       JTextField measurementInputTxt = new JTextField();
       measurementInputTxt.setBounds(25, 400, 225, 30);
       measurementConvertPane.add(measurementInputTxt);
       
       JLabel warnMeasurementInputLbl = new JLabel();
       warnMeasurementInputLbl.setText("* Must be a number!");
       warnMeasurementInputLbl.setForeground(Color.RED);
       warnMeasurementInputLbl.setBounds(250, 400, 500, 30);
       warnMeasurementInputLbl.setVisible(false);
       measurementConvertPane.add(warnMeasurementInputLbl);
       
       JLabel measurementResultLbl = new JLabel();
       measurementResultLbl.setText("Result: ");
       measurementResultLbl.setBounds(25, 450, 800, 30);
       measurementConvertPane.add(measurementResultLbl);
       
       JButton convertMeasurementBtn = new JButton("Convert Measurement");
       convertMeasurementBtn.setBounds(25, 500, 200, 35);
       measurementConvertPane.add(convertMeasurementBtn);
       
       // Add JPanels to TabbedPane
       tabbedPane.add("Convert Temperature", tempConvertPane);
       tabbedPane.add("Convert Measurement", measurementConvertPane);
       tabbedPane.add("Calculator", calculatorPane);
       
       // Action Listeners for the program.
       // Convert Temperature button
       convertBtn.addActionListener(new ActionListener() {
    	  public void actionPerformed(ActionEvent e){  
               if(isValidInput(tempInputTxt.getText())) {
            	   double convertResult = Converter.ConvertTemperature(getConversionType(), Double.parseDouble(tempInputTxt.getText()));
            	   warnInputLbl.setVisible(false);
            	   
            	   String resultStr = "Result: " + tempInputTxt.getText() + " " + convertFrom + " is " + convertResult + " " + convertTo + ".";
            	   
            	   tempResultLbl.setText(resultStr);
            	   
               }
               else {
            	   warnInputLbl.setVisible(false);
               }
           }   
       });
       
       //Add TabbedPane to the main JFrame.
       frame.add(tabbedPane);
       frame.setVisible(true);
	}
	
	private static int getConversionType() {
		if(celToKelvin.isSelected()){
			convertFrom = "Celsius";
			convertTo = "Kelvin";
			return Converter.CELSIUS_TO_KELVIN;
		}
		else if(kelvinToCel.isSelected()){
			convertFrom = "Kelvin";
			convertTo = "Celsius";
			
			return Converter.KELVIN_TO_CELSIUS;
		}
		else if(celToFah.isSelected()){
			convertFrom = "Celsius";
			convertTo = "Fahrenheit";
			
			return Converter.CELSIUS_TO_FAHRENHEIT;
		}
		else if(fahToCel.isSelected()){
			convertFrom = "Fahrenheit";
			convertTo = "Celsius";
			
			return Converter.FAHRENHEIT_TO_CELSIUS;
		}
		else if(fahToKelvin.isSelected()){
			convertFrom = "Fahrenheit";
			convertTo = "Kelvin";
			
			return Converter.FAHRENHEIT_TO_KELVIN;
		}
		else{
			convertFrom = "Kelvin";
			convertTo = "Fahrenheit";
			
			return Converter.KELVIN_TO_FAHRENHEIT;
		}
	}
	
	private static boolean isValidInput(String txtInput) {
		boolean isValid = true;
		
		try{
			Double.parseDouble(txtInput);
		}
		catch(Exception e) {
			isValid = false;
		}
		
		return isValid;
	}
	
}
