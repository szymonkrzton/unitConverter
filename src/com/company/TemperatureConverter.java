package com.company;

import javax.swing.*;

public class TemperatureConverter {
    public TemperatureConverter(){}

    Double temp;

    public Double returnTemp(Double temperature, String from, String to) {
        if(from == to) return temperature;

        if(from == "Fahrenheit") {
            if(to == "Celsius") temp = FtoC(temperature);
            else if(to == "Kelvin") temp = FtoK(temperature);
        }

        if(from == "Celsius") {
            if(to == "Fahrenheit") temp = CtoF(temperature);
            else if(to == "Kelvin") temp = CtoK(temperature);
        }

        if(from == "Kelvin") {
            if(to == "Celsius") temp = KtoC(temperature);
            else if(to == "Fahrenheit") temp = KtoF(temperature);
        }

        return temp;
    }

    public Double FtoC(Double temperature) {
        return (temperature - 32) * (5.0 / 9);
    }

    public Double CtoF(Double temperature) {
        return temperature*(9.0 / 5)+32;
    }

    public Double CtoK(Double temperature) {
        return temperature + 273.15;
    }

    public Double KtoC(Double temperature) {
        return temperature - 273.15;
    }

    public Double FtoK(Double temperature) {
        return (temperature-32)*(5.0 / 9)+273.15;
    }

    public Double KtoF(Double temperature) {
        return (temperature-273.15)*(9.0 / 5)+32;
    }
}
