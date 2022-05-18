package com.company;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class GUI{

    public static boolean isNumeric(String string){
        double doubleValue;

        if(string == null || string.equals("")){
            return false;
        }

        try{
            doubleValue = Double.parseDouble(string);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    double minFahrenheit = -459.67;
    double minCelsius = -273.15;
    double minKelvin = 0;

    JFrame frame;
    JLabel tempResult;
    JLabel speedResult;
    JLabel lengthResult;
    JLabel weightResult;
    JTabbedPane menu;
    JPanel tempPanel;
    JPanel speedPanel;
    JPanel lengthPanel;
    JPanel weightPanel;
    JTextField tempNumber;
    JTextField speedNumber;
    JTextField lengthNumber;
    JTextField weightNumber;
    JButton tempButton;
    JButton speedButton;
    JButton lengthButton;
    JButton weightButton;

    //RADIO BUTTONS

    //temp bttns
    JRadioButton fromFahrenheit;
    JRadioButton fromCelsius;
    JRadioButton fromKelvin;
    JRadioButton toFahrenheit;
    JRadioButton toCelsius;
    JRadioButton toKelvin;

    ButtonGroup fromTemp;
    ButtonGroup toTemp;

    //speed bttns
    JRadioButton fromMph;
    JRadioButton fromKph;
    JRadioButton fromKnots;
    JRadioButton fromMach;
    JRadioButton toMph;
    JRadioButton toKph;
    JRadioButton toKnots;
    JRadioButton toMach;

    ButtonGroup fromSpeed;
    ButtonGroup toSpeed;

    //length bttns
    JRadioButton fromFeet;
    JRadioButton fromInches;
    JRadioButton fromYards;
    JRadioButton fromMiles;
    JRadioButton fromMeters;
    JRadioButton fromCm;
    JRadioButton fromKm;
    JRadioButton toFeet;
    JRadioButton toInches;
    JRadioButton toYards;
    JRadioButton toMiles;
    JRadioButton toMeters;
    JRadioButton toCm;
    JRadioButton toKm;

    ButtonGroup fromLength;
    ButtonGroup toLength;

    //weight bttns
    JRadioButton fromPounds;
    JRadioButton fromOunces;
    JRadioButton fromStones;
    JRadioButton fromKilograms;
    JRadioButton fromGrams;
    JRadioButton toPounds;
    JRadioButton toOunces;
    JRadioButton toStones;
    JRadioButton toKilograms;
    JRadioButton toGrams;

    ButtonGroup fromWeight;
    ButtonGroup toWeight;


//    JComboBox fromTempCB;
//    JComboBox toTempCB;


    public GUI(){
        frame = new JFrame();


        //-------------------tempPanel---------------------
        tempPanel = new JPanel();
        tempPanel.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
        tempPanel.setLayout(new GridLayout(0, 2));


        JLabel fromTempLabel = new JLabel("From:");
        JLabel toTempLabel = new JLabel("To:");

        tempNumber = new JTextField();
        tempNumber.setBounds(50, 50, 90, 20);

        String temperatures[] = {"Fahrenheit", "Celsius", "Kelvin"};
        final JComboBox fromTempCB = new JComboBox(temperatures);
        JComboBox toTempCB = new JComboBox(temperatures);


        tempButton = new JButton("Calculate");
        tempButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String tempNum = tempNumber.getText();
                if(!isNumeric(tempNum)) {
                    JOptionPane.showMessageDialog(frame, "Wprowadź liczbę!", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    TemperatureConverter temperature = new TemperatureConverter();
                    double tempVar = temperature.returnTemp(Double.parseDouble(tempNum), fromTempCB.getItemAt(fromTempCB.getSelectedIndex()).toString(), toTempCB.getItemAt(toTempCB.getSelectedIndex()).toString());
                    if(tempVar == -1000.0) JOptionPane.showMessageDialog(frame, "Podana wartość jest zbyt niska!", "Warning", JOptionPane.WARNING_MESSAGE);
                    else tempResult.setText("Result: " + tempVar);
                }
            }
        });

        tempResult = new JLabel("Result: ");



        fromTempCB.setBounds(50,50, 90, 20);
        toTempCB.setBounds(50,50,90,20);

//        fromFahrenheit = new JRadioButton("Fahrenheit");
//        fromCelsius = new JRadioButton("Celsius");
//        fromKelvin = new JRadioButton("Kelvin");
//        toFahrenheit = new JRadioButton("Fahrenheit");
//        toCelsius = new JRadioButton("Celsius");
//        toKelvin = new JRadioButton("Kelvin");
//
//        fromTemp = new ButtonGroup();
//        fromTemp.add(fromFahrenheit);
//        fromTemp.add(fromCelsius);
//        fromTemp.add(fromKelvin);
//
//        toTemp = new ButtonGroup();
//        toTemp.add(toFahrenheit);
//        toTemp.add(toCelsius);
//        toTemp.add(toKelvin);

        tempPanel.add(fromTempLabel);
        tempPanel.add(toTempLabel);
        tempPanel.add(fromTempCB);
        tempPanel.add(toTempCB);
//        tempPanel.add(fromFahrenheit);
//        tempPanel.add(toFahrenheit);
//        tempPanel.add(fromCelsius);
//        tempPanel.add(toCelsius);
//        tempPanel.add(fromKelvin);
//        tempPanel.add(toKelvin);
        tempPanel.add(tempNumber);
        tempPanel.add(tempButton);
        tempPanel.add(tempResult);



        //-------------------speedPanel---------------------
        speedPanel = new JPanel();
        speedPanel.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
        speedPanel.setLayout(new GridLayout(0, 2));

        JLabel fromSpeedLabel = new JLabel("From:");
        JLabel toSpeedLabel = new JLabel("To:");

        speedNumber = new JTextField();
        speedNumber.setBounds(50, 50, 150, 20);

        speedButton = new JButton("Calculate");
//        speedButton.addActionListener(this);

        speedResult = new JLabel("Result: ");

        fromMph = new JRadioButton("MPH");
        fromKph = new JRadioButton("KPH");
        fromKnots = new JRadioButton("Knot");
        fromMach = new JRadioButton("Mach");
        toMph = new JRadioButton("MPH");
        toKph = new JRadioButton("KPH");
        toKnots = new JRadioButton("Knot");
        toMach = new JRadioButton("Mach");

        fromSpeed = new ButtonGroup();
        fromSpeed.add(fromMph);
        fromSpeed.add(fromKph);
        fromSpeed.add(fromKnots);
        fromSpeed.add(fromMach);

        toSpeed = new ButtonGroup();
        toSpeed.add(toMph);
        toSpeed.add(toKph);
        toSpeed.add(toKnots);
        toSpeed.add(toMach);

        speedPanel.add(fromSpeedLabel);
        speedPanel.add(toSpeedLabel);
        speedPanel.add(fromMph);
        speedPanel.add(toMph);
        speedPanel.add(fromKph);
        speedPanel.add(toKph);
        speedPanel.add(fromKnots);
        speedPanel.add(toKnots);
        speedPanel.add(fromMach);
        speedPanel.add(toMach);
        speedPanel.add(speedNumber);
        speedPanel.add(speedButton);
        speedPanel.add(speedResult);


        ////-------------------lengthPanel---------------------
        lengthPanel = new JPanel();
        lengthPanel.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
        lengthPanel.setLayout(new GridLayout(0, 2));

        JLabel fromLengthLabel = new JLabel("From:");
        JLabel toLengthLabel = new JLabel("To:");

        lengthNumber = new JTextField();
        lengthNumber.setBounds(50, 50, 150, 20);

        lengthButton = new JButton("Calculate");
//        lengthButton.addActionListener(this);

        lengthResult = new JLabel("Result: ");

        fromFeet = new JRadioButton("Feet");
        fromInches = new JRadioButton("Inch");
        fromYards = new JRadioButton("Yard");
        fromMiles = new JRadioButton("Mile");
        fromMeters = new JRadioButton("Meter");
        fromCm = new JRadioButton("Centimeter");
        fromKm = new JRadioButton("Kilometer");
        toFeet = new JRadioButton("Feet");
        toInches = new JRadioButton("Inch");
        toYards = new JRadioButton("Yard");
        toMiles = new JRadioButton("Mile");
        toMeters = new JRadioButton("Meter");
        toCm = new JRadioButton("Centimeter");
        toKm = new JRadioButton("Kilometer");

        fromLength = new ButtonGroup();
        fromLength.add(fromFeet);
        fromLength.add(fromInches);
        fromLength.add(fromYards);
        fromLength.add(fromMiles);
        fromLength.add(fromMeters);
        fromLength.add(fromCm);
        fromLength.add(fromKm);

        toLength = new ButtonGroup();
        toLength.add(toFeet);
        toLength.add(toInches);
        toLength.add(toYards);
        toLength.add(toMiles);
        toLength.add(toMeters);
        toLength.add(toCm);
        toLength.add(toKm);

        lengthPanel.add(fromLengthLabel);
        lengthPanel.add(toLengthLabel);
        lengthPanel.add(fromFeet);
        lengthPanel.add(toFeet);
        lengthPanel.add(fromInches);
        lengthPanel.add(toInches);
        lengthPanel.add(fromYards);
        lengthPanel.add(toYards);
        lengthPanel.add(fromMiles);
        lengthPanel.add(toMiles);
        lengthPanel.add(fromMeters);
        lengthPanel.add(toMeters);
        lengthPanel.add(fromCm);
        lengthPanel.add(toCm);
        lengthPanel.add(fromKm);
        lengthPanel.add(toKm);
        lengthPanel.add(lengthNumber);
        lengthPanel.add(lengthButton);
        lengthPanel.add(lengthResult);


        //-------------------weightPanel---------------------
        weightPanel = new JPanel();
        weightPanel.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
        weightPanel.setLayout(new GridLayout(0, 2));

        JLabel fromWeightLabel = new JLabel("From:");
        JLabel toWeightLabel = new JLabel("To:");

        weightNumber = new JTextField();
        weightNumber.setBounds(50, 50, 150, 20);

        weightButton = new JButton("Calculate");
//        weightButton.addActionListener(this);

        weightResult = new JLabel("Result: ");

        fromPounds = new JRadioButton("Pound");
        fromOunces = new JRadioButton("Ounce");
        fromStones = new JRadioButton("Stone");
        fromKilograms = new JRadioButton("Kilogram");
        fromGrams = new JRadioButton("Gram");
        toPounds = new JRadioButton("Pound");
        toOunces = new JRadioButton("Ounce");
        toStones = new JRadioButton("Stone");
        toKilograms = new JRadioButton("Kilogram");
        toGrams = new JRadioButton("Gram");

        fromWeight = new ButtonGroup();
        fromWeight.add(fromPounds);
        fromWeight.add(fromOunces);
        fromWeight.add(fromStones);
        fromWeight.add(fromKilograms);
        fromWeight.add(fromGrams);

        toWeight = new ButtonGroup();
        toWeight.add(toPounds);
        toWeight.add(toOunces);
        toWeight.add(toStones);
        toWeight.add(toKilograms);
        toWeight.add(toGrams);

        weightPanel.add(fromWeightLabel);
        weightPanel.add(toWeightLabel);
        weightPanel.add(fromPounds);
        weightPanel.add(toPounds);
        weightPanel.add(fromOunces);
        weightPanel.add(toOunces);
        weightPanel.add(fromStones);
        weightPanel.add(toStones);
        weightPanel.add(fromKilograms);
        weightPanel.add(toKilograms);
        weightPanel.add(fromGrams);
        weightPanel.add(toGrams);
        weightPanel.add(weightNumber);
        weightPanel.add(weightButton);
        weightPanel.add(weightResult);


        //-------------------tabbed panel---------------------
        menu = new JTabbedPane();

        menu.add("Temperature", tempPanel);
        menu.add("Speed", speedPanel);
        menu.add("Length", lengthPanel);
        menu.add("Weight", weightPanel);


        //-------------------show frame---------------------
        frame.add(menu, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Unit Converter");
        frame.pack();
        frame.setSize(400,500);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new GUI();

    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
////        if (e.getSource() == tempButton){
//////            String tempNum = tempNumber.getText();
////            Double tempNum = (Double) tempNumber.getValue();
////            TemperatureConverter temperature = new TemperatureConverter();
////            if(tempNum == null || tempNum.isEmpty()){
////                JOptionPane.showMessageDialog(frame, "Nie wprowadzono żadnej liczby!", "Warning", JOptionPane.WARNING_MESSAGE);
////                }
//////            else if(!isNumeric(tempNum)){
//////                JOptionPane.showMessageDialog(frame, "Proszę wprowadzić właściwą liczbę!", "Warning", JOptionPane.WARNING_MESSAGE);
//////                }
////            else if(fromFahrenheit.isSelected()){
////                if(Double.parseDouble(tempNum) < minFahrenheit) {
////                    JOptionPane.showMessageDialog(frame, "Podana temperatura jest poniżej najmniejszej możliwej temperatury!", "Warning", JOptionPane.WARNING_MESSAGE);
////                } else if(toFahrenheit.isSelected()){
////                    tempResult.setText("Result: " + tempNum);
////                } else if(toCelsius.isSelected()){
////                    tempResult.setText("Result: " + temperature.FtoC(tempNum));
////                } else if(toKelvin.isSelected()){
////                    tempResult.setText("Result: " + temperature.FtoK(tempNum));
////                }
////            }
////            else if(fromCelsius.isSelected()){
////                if(Double.parseDouble(tempNum) < minCelsius){
////                    JOptionPane.showMessageDialog(frame, "Podana temperatura jest poniżej najmniejszej możliwej temperatury!", "Warning", JOptionPane.WARNING_MESSAGE);
////                } else if(toCelsius.isSelected()){
////                    tempResult.setText("Result: " + tempNum);
////                } else if(toFahrenheit.isSelected()) {
////                    tempResult.setText("Result: " + temperature.CtoF(tempNum));
////                } else if(toKelvin.isSelected()) {
////                    tempResult.setText("Result: " + temperature.CtoK(tempNum));
////                }
////            }
////            else if(fromKelvin.isSelected()) {
////                if(Double.parseDouble(tempNum) < minKelvin){
////                    JOptionPane.showMessageDialog(frame, "Podana temperatura jest poniżej najmniejszej możliwej temperatury!", "Warning", JOptionPane.WARNING_MESSAGE);
////                } else if(toKelvin.isSelected()) {
////                    tempResult.setText("Result: " + tempNum);
////                } else if(toCelsius.isSelected()){
////                    tempResult.setText("Result: " + temperature.KtoC(tempNum));
////                } else if(toFahrenheit.isSelected()) {
////                    tempResult.setText("Result: " + temperature.KtoF(tempNum));
////                }
////            }
////        }
//
//        if(e.getSource() == tempButton){
//            String tempNum = tempNumber.getText();
//            if(!isNumeric(tempNum)) {
//                JOptionPane.showMessageDialog(frame, "Wprowadź liczbę!", "Warning", JOptionPane.WARNING_MESSAGE);
//            } else {
//                TemperatureConverter temperature = new TemperatureConverter();
//                //temperature.returnTemp(Double.parseDouble(tempNum), fromTempCB.getItemAt(fromTempCB.getSelectedIndex()).toString(), toTempCB.getItemAt(toTempCB.getSelectedIndex()).toString());
//                tempResult.setText("Result: " + temperature.returnTemp(Double.parseDouble(tempNum), fromTempCB.getItemAt(fromTempCB.getSelectedIndex()).toString(), toTempCB.getItemAt(toTempCB.getSelectedIndex()).toString()));
//            }
//        }
//
//
//
//
//
//
//
//        else if(e.getSource() == speedButton){
//            System.out.println("Hello speed");
//        } else if(e.getSource() == lengthButton){
//            System.out.println("Hello length");
//        } else if(e.getSource() == weightButton){
//            System.out.println("Hello weight");
//        }
////        String num = number.getText();
////        if(num == null || num.isEmpty()){
////            JOptionPane.showMessageDialog(frame, "Nie wprowadzono żadnej liczby!", "Warning", JOptionPane.WARNING_MESSAGE);
////        }
////        else if(!isNumeric(num)){
////            JOptionPane.showMessageDialog(frame, "Proszę wprowadzić właściwą liczbę!", "Warning", JOptionPane.WARNING_MESSAGE);
////        }
////        else if(Integer.parseInt(num) < 0){
////            JOptionPane.showMessageDialog(frame, "Tylko liczby dodatnie!", "Warning", JOptionPane.WARNING_MESSAGE);
////        }
////        else if(fromDecimal.isSelected()){
////            if(toDecimal.isSelected()){
////                label.setText("Result: " + num);
////            }
////            else if(toBinary.isSelected()){
////                int x = Integer.parseInt(num);
////                label.setText("Result: " + dectobin.toBinary(x));
////            }
////            else if(toOctal.isSelected()){
////                int x = Integer.parseInt(num);
////                label.setText("Result: " + dectooct.toOctal(x));
////            }
////            else if(toHex.isSelected()){
////                int x = Integer.parseInt(num);
////                label.setText("Result: " + dectohex.toHex(x));
////            }
////            else{
////                JOptionPane.showMessageDialog(frame, "Nie wybrano systemu docelowego!", "Warning", JOptionPane.WARNING_MESSAGE);
////            }
////        }
////        else if(fromBinary.isSelected()){
////            if(toBinary.isSelected()){
////                label.setText("Result: " + num);
////            }
////            else if(toDecimal.isSelected()){
////                int x = Integer.parseInt(num);
////                label.setText("Result: " + bintodec.toDecimal(x));
////            }
////            else if(toOctal.isSelected()){
////                int x = Integer.parseInt(num);
////                label.setText("Result: " + bintooct.toOctal(x));
////            }
////            else if(toHex.isSelected()){
////                int x = Integer.parseInt(num);
////                label.setText("Result: " + bintohex.toHex(x));
////            }
////            else{
////                JOptionPane.showMessageDialog(frame, "Nie wybrano systemu docelowego!", "Warning", JOptionPane.WARNING_MESSAGE);
////            }
////        }
////        else if(fromOctal.isSelected()){
////            if(toOctal.isSelected()){
////                label.setText("Result: " + num);
////            }
////            else if(toDecimal.isSelected()){
////                int x = Integer.parseInt(num);
////                label.setText("Result: " + octtodec.toDecimal(x));
////            }
////            else if(toBinary.isSelected()){
////                int x = Integer.parseInt(num);
////                label.setText("Result: " + octtobin.toBinary(x));
////            }
////            else if(toHex.isSelected()){
////                int x = Integer.parseInt(num);
////                label.setText("Result: " + octtohex.toHex(x));
////            }
////            else{
////                JOptionPane.showMessageDialog(frame, "Nie wybrano systemu docelowego!", "Warning", JOptionPane.WARNING_MESSAGE);
////            }
////        }
////        else if(fromHex.isSelected()){
////            if(toHex.isSelected()){
////                label.setText("Result: " + num);
////            }
////            else if(toDecimal.isSelected()){
////                int x = Integer.parseInt(num);
////                label.setText("Result: " + hextodec.toDecimal(x));
////            }
////            else if(toBinary.isSelected()){
////                int x = Integer.parseInt(num);
////                label.setText("Result: " + hextobin.toBinary(x));
////            }
////            else if(toOctal.isSelected()){
////                int x = Integer.parseInt(num);
////                label.setText("Result: " + hextooct.toOctal(x));
////            }
////            else{
////                JOptionPane.showMessageDialog(frame, "Nie wybrano systemu docelowego!", "Warning", JOptionPane.WARNING_MESSAGE);
////            }
////        }
////        else{
////            JOptionPane.showMessageDialog(frame, "Nie wybrano systemu z którego chcesz przeliczać!", "Warning", JOptionPane.WARNING_MESSAGE);
////        }
//    }


}

