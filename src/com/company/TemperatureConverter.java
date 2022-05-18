package com.company;

import javax.swing.*;

public class TemperatureConverter {
    public TemperatureConverter(){}

    double minFahrenheit = -459.67;
    double minCelsius = -273.15;
    double minKelvin = 0;
    double temp;

    public Double returnTemp(Double temperature, String from, String to) {
        if(from == "Fahrenheit") {
            if (temperature >= minFahrenheit) {
                if (to == "Fahrenheit") return temperature;
                else if (to == "Celsius") {
                    temp = (temperature - 32) * (5.0 / 9);
                } else if (to == "Kelvin") {
                    temp = (temperature - 32) * (5.0 / 9) + 273.15;
                }
            } else temp = -1000.0;
        }

        if(from == "Celsius") {
            if (temperature >= minCelsius) {
                if (to == "Celsius") return temperature;
                else if (to == "Fahrenheit") {
                    temp = temperature * (9.0 / 5) + 32;
                } else if (to == "Kelvin") {
                    temp = temperature + 273.15;
                }
            } else temp = -1000.0;
        }

        if(from == "Kelvin") {
            if(temperature >= minKelvin) {
                if (to == "Kelvin") return temperature;
                else if (to == "Celsius") {
                    temp = temperature - 273.15;
                } else if (to == "Fahrenheit") {
                    temp = (temperature - 273.15) * (9.0 / 5) + 32;
                }
            } else temp = -1000.0;
        }

        return temp;
    }

    public double FtoC(String temperature) {
            double temp = Double.parseDouble(temperature);
            double C = (temp - 32) * (5 / 9);
            return C;
    }

    public double CtoF(String temperature) {
        double temp = Double.parseDouble(temperature);
        double F = temp*(9/5)+32;
        return F;
    }

    public double CtoK(String temperature) {
        double temp = Double.parseDouble(temperature);
        double K = temp + 273.15;
        return K;
    }

    public double KtoC(String temperature) {
        double temp = Double.parseDouble(temperature);
        double C = temp - 273.15;
        return C;
    }

    public double FtoK(String temperature) {
        double temp = Double.parseDouble(temperature);
        double K = (temp-32)*(5/9)+273.15;
        return K;
    }

    public double KtoF(String temperature) {
        double temp = Double.parseDouble(temperature);
        double F = (temp-273.15)*(9/5)+32;
        return F;
    }
}
