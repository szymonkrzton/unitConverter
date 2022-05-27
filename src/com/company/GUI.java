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
        JComboBox fromTempCB = new JComboBox(temperatures);
        JComboBox toTempCB = new JComboBox(temperatures);

        tempButton = new JButton("Calculate");
        tempButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String tempNum = tempNumber.getText();
                if(!isNumeric(tempNum)) {
                    JOptionPane.showMessageDialog(frame, "Wprowadź liczbę!", "Warning", JOptionPane.WARNING_MESSAGE);
                } else if(Double.parseDouble(tempNum) < minKelvin || Double.parseDouble(tempNum) < minFahrenheit || Double.parseDouble(tempNum) < minCelsius) {
                    JOptionPane.showMessageDialog(frame, "Podana temperatura jest niższa od najniższej możliwej!", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    TemperatureConverter temperature = new TemperatureConverter();
                    tempResult.setText("Result: " + temperature.returnTemp(Double.parseDouble(tempNum), fromTempCB.getItemAt(fromTempCB.getSelectedIndex()).toString(), toTempCB.getItemAt(toTempCB.getSelectedIndex()).toString()));
                }
            }
        });

        tempResult = new JLabel("Result: ");

        fromTempCB.setBounds(50,50, 90, 20);
        toTempCB.setBounds(50,50,90,20);

        tempPanel.add(fromTempLabel);
        tempPanel.add(toTempLabel);
        tempPanel.add(fromTempCB);
        tempPanel.add(toTempCB);
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

        String speeds[] = {"MPH", "KPH", "Knot", "Mach"};
        JComboBox fromSpeedCB = new JComboBox(speeds);
        JComboBox toSpeedCB = new JComboBox(speeds);

        speedButton = new JButton("Calculate");
        speedButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String speedNum = speedNumber.getText();
                if(!isNumeric(speedNum)) {
                    JOptionPane.showMessageDialog(frame, "Wprowadź liczbę!", "Warning", JOptionPane.WARNING_MESSAGE);
                } else if(Double.parseDouble(speedNum) < 0) {
                    JOptionPane.showMessageDialog(frame, "Prędkość nie może być ujemna!", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    SpeedConverter speed = new SpeedConverter();
                    speedResult.setText("Result: " + speed.returnSpeed(Double.parseDouble(speedNum), fromSpeedCB.getItemAt(fromSpeedCB.getSelectedIndex()).toString(), toSpeedCB.getItemAt(toSpeedCB.getSelectedIndex()).toString()));
                }
            }
        });

        speedResult = new JLabel("Result: ");

        speedPanel.add(fromSpeedLabel);
        speedPanel.add(toSpeedLabel);
        speedPanel.add(fromSpeedCB);
        speedPanel.add(toSpeedCB);
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

        String lengths[] = {"Miles", "Yards", "Feet", "Inches", "Kilometers", "Meters", "Centimeters"};
        JComboBox fromLengthCB = new JComboBox(lengths);
        JComboBox toLengthCB = new JComboBox(lengths);

        lengthButton = new JButton("Calculate");
        lengthButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String lengthNum = lengthNumber.getText();
                if(!isNumeric(lengthNum)) {
                    JOptionPane.showMessageDialog(frame, "Wprowadź liczbę!", "Warning", JOptionPane.WARNING_MESSAGE);
                } else if(Double.parseDouble(lengthNum) < 0) {
                    JOptionPane.showMessageDialog(frame, "Długość nie może być ujemna!", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    LengthConverter length = new LengthConverter();
                    lengthResult.setText("Result: " + length.returnLength(Double.parseDouble(lengthNum), fromLengthCB.getItemAt(fromLengthCB.getSelectedIndex()).toString(), toLengthCB.getItemAt(toLengthCB.getSelectedIndex()).toString()));
                }
            }
        });

        lengthResult = new JLabel("Result: ");


        lengthPanel.add(fromLengthLabel);
        lengthPanel.add(toLengthLabel);
        lengthPanel.add(fromLengthCB);
        lengthPanel.add(toLengthCB);
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

        String weights[] = {"Pound", "Ounce", "Stone", "Kilogram", "Gram"};
        JComboBox fromWeightCB = new JComboBox(weights);
        JComboBox toWeightCB = new JComboBox(weights);

        weightButton = new JButton("Calculate");
        weightButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String weightNum = weightNumber.getText();
                if(!isNumeric(weightNum)) {
                    JOptionPane.showMessageDialog(frame, "Wprowadź liczbę!", "Warning", JOptionPane.WARNING_MESSAGE);
                } else if(Double.parseDouble(weightNum) < 0) {
                    JOptionPane.showMessageDialog(frame, "Waga nie może być ujemna!", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    WeightConverter weight = new WeightConverter();
                    weightResult.setText("Result: " + weight.returnWeight(Double.parseDouble(weightNum), fromWeightCB.getItemAt(fromWeightCB.getSelectedIndex()).toString(), toWeightCB.getItemAt(toWeightCB.getSelectedIndex()).toString()));
                }
            }
        });


        weightResult = new JLabel("Result: ");

        weightPanel.add(fromWeightLabel);
        weightPanel.add(toWeightLabel);
        weightPanel.add(fromWeightCB);
        weightPanel.add(toWeightCB);
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
}

