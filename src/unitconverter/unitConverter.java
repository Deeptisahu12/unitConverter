package unitconverter;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.lang.reflect.Type;

public class unitConverter {
    private JFrame frame;
    private JLabel inputLable, outputLable;

    private JTextField input;
    private JTextField output;
    private JComboBox<String> fromUnit;
    private JComboBox<String> toUnit;
    private JButton convertBotton;

    protected void initComponents() {
        frame = new JFrame("Unit Converter");
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        inputLable = new JLabel("input: ");
        input = new JTextField(10);
        outputLable = new JLabel("output:");
        output = new JTextField(10);
        output.setEditable(false);
        fromUnit = new JComboBox<String>(new String[]{"Meters", "Feet", "Inches", "Centimeters"});
        toUnit = new JComboBox<String>(new String[]{"Metres", "Feet", "Inches", "Centimeters"});
        convertBotton = new JButton("convert");

        inputLable.setBounds(20, 20, 100, 20);
        input.setBounds(150, 20, 100, 20);
        fromUnit.setBounds(270, 20, 100, 20);
        outputLable.setBounds(20, 50, 100, 20);
        output.setBounds(150, 50, 100, 20);
        toUnit.setBounds(270, 50, 100, 20);
        convertBotton.setBounds(150, 80, 100, 20);

        convertBotton.addActionListener(new ConvertButtonListener());

        frame.add(inputLable);
        frame.add(input);
        frame.add(fromUnit);
        frame.add(outputLable);
        frame.add(output);
        frame.add(toUnit);
        frame.add(convertBotton);
        frame.setVisible(true);


    }

    public unitConverter() {
        initComponents();

    }

    public static void main(String[] args) {
        new unitConverter();
    }

    private class ConvertButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String fromUnitType = fromUnit.getSelectedItem().toString();
            String toUnitType = toUnit.getSelectedItem().toString();
            double inputValue = Double.parseDouble(input.getText());
            double outputValue = 0.0;
            if (fromUnitType.equals("Meters")) {
                if (toUnitType.equals("meters")) {
                    outputValue = unitConverter.metersToMeters(inputValue);
                }
                else if(toUnitType.equals("Feet")){
                    outputValue=unitConverter.metersToFeet(inputValue);
                }
                else if(toUnitType.equals("Inches")){
                    outputValue=unitConverter.metersToInches(inputValue);

                }
                else if(toUnitType.equals("Centimeters")){
                    outputValue=unitConverter.metersToCentimeters(inputValue);
                }
            }
            else if (fromUnitType.equals("Feet")) {
                if (toUnitType.equals("meters")) {
                    outputValue = unitConverter.feetToMeters(inputValue);
                }
                else if(toUnitType.equals("Feet")){
                    outputValue=unitConverter.feetToFeet(inputValue);
                }
                else if(toUnitType.equals("Inches")){
                    outputValue=unitConverter.feetToInches(inputValue);

                }
                else if(toUnitType.equals("Centimeters")){
                    outputValue=unitConverter.feetToCentimeters(inputValue);
                }
            }
            else if (fromUnitType.equals("Inches")) {
                if (toUnitType.equals("meters")) {
                    outputValue = unitConverter.inchesToMeters(inputValue);
                }
                else if(toUnitType.equals("Feet")){
                    outputValue=unitConverter.inchesToFeet(inputValue);
                }
                else if(toUnitType.equals("Inches")){
                    outputValue=unitConverter.inchesToInches(inputValue);

                }
                else if(toUnitType.equals("Centimeters")){
                    outputValue=unitConverter.inchesToCentimeters(inputValue);
                }
            }
            else if (fromUnitType.equals("Centimeters")) {
                if (toUnitType.equals("meters")) {
                    outputValue = unitConverter.centimetersToMeters(inputValue);
                }
                else if(toUnitType.equals("Feet")){
                    outputValue=unitConverter.centimetersToFeet(inputValue);
                }
                else if(toUnitType.equals("Inches")){
                    outputValue=unitConverter.centimetersToInches(inputValue);

                }
                else if(toUnitType.equals("Centimeters")){
                    outputValue=unitConverter.centimetersToCentimeters(inputValue);
                }
            }
            output.setText(""+outputValue);

        }
    }
    public static double metersToMeters(double inputValue){
        double outputValue;
        outputValue=inputValue;
        return outputValue;
    }
    public static double metersToCentimeters(double inputValue){
        double outputValue;
        outputValue=inputValue*100;
        return outputValue;
    }
    public static double metersToFeet(double inputValue){
        double outputValue;
        outputValue=inputValue*3.28084;
        return outputValue;

    }
    public static double metersToInches(double inputValue){
        double outputValue;
        outputValue=inputValue*3.28084*12;
        return outputValue;
    }
    public static double feetToMeters(double inputValue){
        double outputValue;
        outputValue=inputValue/3.28084;
        return outputValue;
    }
    public static double feetToCentimeters(double inputValue){
        double outputValue;
        outputValue=inputValue/3.28084*100;
        return outputValue;
    }
    public static double feetToFeet(double inputValue){
        double outputValue;
        outputValue=inputValue;
        return outputValue;
    }
    public static double feetToInches(double inputValue){
        double outputValue;
        outputValue=inputValue*12;
        return outputValue;
    }
    public static double inchesToMeters(double inputValue){
        double outputValue;
        outputValue=inputValue/12/3.29084;
        return outputValue;
    }
    public static double inchesToCentimeters(double inputValue){
        double outputValue;
        outputValue=inputValue/12/3.29084*100;
        return outputValue;
    }
    public static double inchesToFeet(double inputValue){
        double outputValue;
        outputValue=inputValue/12;
        return outputValue;
    }
    public static double inchesToInches(double inputValue){
        double outputValue;
        outputValue=inputValue;
        return outputValue;
    }
    public static double centimetersToMeters(double inputValue){
        double outputValue;
        outputValue=inputValue/100;
        return outputValue;
    }
    public static double centimetersToCentimeters(double inputValue){
        double outputValue;
        outputValue=inputValue;
        return outputValue;
    }
    public static double centimetersToFeet(double inputValue){
        double outputValue;
        outputValue=inputValue/100*3.28084;
        return outputValue;
    }
    public static double centimetersToInches(double inputValue){
        double outputValue;
        outputValue=inputValue/100*3.28084*12;
        return outputValue;
    }




}

