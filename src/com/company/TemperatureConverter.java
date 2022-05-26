package com.company;

public class TemperatureConverter {
    public TemperatureConverter(){}

    double temp;

    public Double returnTemp(Double temperature, String from, String to) {
        if(from == "Fahrenheit") {
            if(to == "Fahrenheit") return temperature;
            else if(to == "Celsius") temp = FtoC(temperature);
            else if(to == "Kelvin") temp = FtoK(temperature);
        }

        if(from == "Celsius") {
            if(to == "Celsius") return temperature;
            else if(to == "Fahrenheit") temp = CtoF(temperature);
            else if(to == "Kelvin") temp = CtoK(temperature);
        }

        if(from == "Kelvin") {
            if(to == "Kelvin") return temperature;
            else if(to == "Fahrenheit") temp = KtoF(temperature);
            else if(to == "Celsius") temp = KtoC(temperature);
        }

        return temp;
    }

    public Double FtoC(Double temperature) {
            return (temperature - 32) * (5.0 / 9);
    }

    public Double CtoF(Double temperature) {
        return temperature*(9.0/5)+32;
    }

    public Double CtoK(Double temperature) {
        return temperature + 273.15;
    }

    public Double KtoC(Double temperature) {
        return temperature - 273.15;
    }

    public Double FtoK(Double temperature) {
        return (temperature-32)*(5.0/9)+273.15;
    }

    public Double KtoF(Double temperature) {
        return (temperature-273.15)*(9.0/5)+32;
    }
}
