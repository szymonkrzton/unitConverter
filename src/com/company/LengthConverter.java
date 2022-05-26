package com.company;

public class LengthConverter {
    public LengthConverter(){}

    Double temp;

    public Double returnLength(Double length, String from, String to) {
        if(from == "Miles") {
            if(to == "Miles") return length;
            else if(to == "Yards") temp = MILEtoYARD(length);
            else if(to == "Feet") temp = MILEtoFOOT(length);
            else if(to == "Inches") temp = MILEtoINCH(length);
            else if(to == "Kilometers") temp = MILEtoKM(length);
            else if(to == "Meters") temp = MILEtoMETER(length);
            else if(to == "Centimeters") temp = MILEtoCM(length);
        }

        if(from == "Yards") {
            if(to == "Yards") return length;
            else if(to == "Miles") temp = YARDtoMILE(length);
            else if(to == "Feet") temp = YARDtoFOOT(length);
            else if(to == "Inches") temp = YARDtoINCH(length);
            else if(to == "Kilometers") temp = YARDtoKM(length);
            else if(to == "Meters") temp = YARDtoMETER(length);
            else if(to == "Centimeters") temp = YARDtoCM(length);
        }

        if(from == "Feet") {
            if(to == "Feet") return length;
            else if(to == "Yards") temp = FOOTtoYARD(length);
            else if(to == "Miles") temp = FOOTtoMILE(length);
            else if(to == "Inches") temp = FOOTtoINCH(length);
            else if(to == "Kilometers") temp = FOOTtoKM(length);
            else if(to == "Meters") temp = FOOTtoMETER(length);
            else if(to == "Centimeters") temp = FOOTtoCM(length);
        }

        if(from == "Inches") {
            if(to == "Inches") return length;
            else if(to == "Yards") temp = INCHtoYARD(length);
            else if(to == "Feet") temp = INCHtoFOOT(length);
            else if(to == "Miles") temp = INCHtoMILE(length);
            else if(to == "Kilometers") temp = INCHtoKM(length);
            else if(to == "Meters") temp = INCHtoMETER(length);
            else if(to == "Centimeters") temp = INCHtoCM(length);
        }

        if(from == "Kilometers") {
            if(to == "Kilometers") return length;
            else if(to == "Yards") temp = KMtoYARD(length);
            else if(to == "Feet") temp = KMtoFOOT(length);
            else if(to == "Inches") temp = KMtoINCH(length);
            else if(to == "Miles") temp = KMtoMILE(length);
            else if(to == "Meters") temp = KMtoMETER(length);
            else if(to == "Centimeters") temp = KMtoCM(length);
        }

        if(from == "Meters") {
            if(to == "Meters") return length;
            else if(to == "Yards") temp = METERtoYARD(length);
            else if(to == "Feet") temp = METERtoFOOT(length);
            else if(to == "Inches") temp = METERtoINCH(length);
            else if(to == "Kilometers") temp = METERtoKM(length);
            else if(to == "Miles") temp = METERtoMILE(length);
            else if(to == "Centimeters") temp = METERtoCM(length);
        }

        if(from == "Centimeters") {
            if(to == "Centimeters") return length;
            else if(to == "Yards") temp = CMtoYARD(length);
            else if(to == "Feet") temp = CMtoFOOT(length);
            else if(to == "Inches") temp = CMtoINCH(length);
            else if(to == "Kilometers") temp = CMtoKM(length);
            else if(to == "Meters") temp = CMtoMETER(length);
            else if(to == "Miles") temp = CMtoMILE(length);
        }

        return temp;
    }

    public Double FOOTtoINCH(Double length) {
        return length*12;
    }

    public Double FOOTtoYARD(Double length) {
        return length/3;
    }

    public Double FOOTtoMILE(Double length) {
        return length/5280;
    }

    public Double FOOTtoMETER(Double length) {
        return length/3.281;
    }

    public Double FOOTtoCM(Double length) {
        return length*30.48;
    }

    public Double FOOTtoKM(Double length) {
        return length/3281;
    }

    public Double INCHtoFOOT(Double length) {
        return length/12;
    }

    public Double INCHtoYARD(Double length) {
        return length/36;
    }

    public Double INCHtoMILE(Double length) {
        return length/63360;
    }

    public Double INCHtoMETER(Double length) {
        return length/39.37;
    }

    public Double INCHtoCM(Double length) {
        return length*2.54;
    }

    public Double INCHtoKM(Double length) {
        return length/39370;
    }

    public Double YARDtoFOOT(Double length) {
        return length*3;
    }

    public Double YARDtoINCH(Double length) {
        return length*36;
    }

    public Double YARDtoMILE(Double length) {
        return length*1760;
    }

    public Double YARDtoMETER(Double length) {
        return length/1.094;
    }

    public Double YARDtoCM(Double length) {
        return length*91.44;
    }

    public Double YARDtoKM(Double length) {
        return length/1094;
    }

    public Double MILEtoFOOT(Double length) {
        return length*5280;
    }

    public Double MILEtoINCH(Double length) {
        return length*63360;
    }

    public Double MILEtoYARD(Double length) {
        return length*1760;
    }

    public Double MILEtoMETER(Double length) {
        return length*1609.34;
    }

    public Double MILEtoCM(Double length) {
        return length*160934;
    }

    public Double MILEtoKM(Double length) {
        return length*1.60934;
    }

    public Double METERtoFOOT(Double length) {
        return length*3.28084;
    }

    public Double METERtoINCH(Double length) {
        return length*39.3701;
    }

    public Double METERtoYARD(Double length) {
        return length*1.09361;
    }

    public Double METERtoMILE(Double length) {
        return length/1609;
    }

    public Double METERtoCM(Double length) {
        return length*100;
    }

    public Double METERtoKM(Double length) {
        return length/1000;
    }

    public Double CMtoFOOT(Double length) {
        return length/30.48;
    }

    public Double CMtoINCH(Double length) {
        return length/2.54;
    }

    public Double CMtoYARD(Double length) {
        return length/91.44;
    }

    public Double CMtoMILE(Double length) {
        return length/160934;
    }

    public Double CMtoMETER(Double length) {
        return length/100;
    }

    public Double CMtoKM(Double length) {
        return length/100000;
    }

    public Double KMtoFOOT(Double length) {
        return length*3280.84;
    }

    public Double KMtoINCH(Double length) {
        return length*39370;
    }

    public Double KMtoYARD(Double length) {
        return length*1093.61;
    }

    public Double KMtoMILE(Double length) {
        return length/1.609;
    }

    public Double KMtoMETER(Double length) {
        return length*1000;
    }

    public Double KMtoCM(Double length) {
        return length*100000;
    }


}
