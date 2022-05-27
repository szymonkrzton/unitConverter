package com.company;

public class WeightConverter {
    public WeightConverter(){}

    Double temp;

    public Double returnWeight(Double weight, String from, String to) {
        if(from == to) return weight;

        if(from == "Stone") {
            if(to == "Pound") temp = STONEtoPOUND(weight);
            else if(to == "Ounce") temp = STONEtoOUNCE(weight);
            else if(to == "Kilogram") temp = STONEtoKG(weight);
            else if(to == "Gram") temp = STONEtoGRAM(weight);
        }

        if(from == "Pound") {
            if(to == "Stone") temp = POUNDtoSTONE(weight);
            else if(to == "Ounce") temp = POUNDtoOUNCE(weight);
            else if(to == "Kilogram") temp = POUNDtoKG(weight);
            else if(to == "Gram") temp = POUNDtoGRAM(weight);
        }

        if(from == "Ounce") {
            if(to == "Stone") temp = OUNCEtoSTONE(weight);
            else if(to == "Pound") temp = OUNCEtoPOUND(weight);
            else if(to == "Kilogram") temp = OUNCEtoKG(weight);
            else if(to == "Gram") temp = OUNCEtoGRAM(weight);
        }

        if(from == "Kilogram") {
            if(to == "Stone") temp = KGtoSTONE(weight);
            else if(to == "Pound") temp = KGtoPOUND(weight);
            else if(to == "Ounce") temp = KGtoOUNCE(weight);
            else if(to == "Gram") temp = KGtoGRAM(weight);
        }

        if(from == "Gram") {
            if(to == "Stone") temp = GRAMtoSTONE(weight);
            else if(to == "Pound") temp = GRAMtoPOUND(weight);
            else if(to == "Ounce") temp = GRAMtoOUNCE(weight);
            else if(to == "Kilogram") temp = GRAMtoKG(weight);
        }

        return temp;
    }

    public Double POUNDtoOUNCE(Double weight) {
        return weight*16;
    }

    public Double POUNDtoSTONE(Double weight) {
        return weight/14;
    }

    public Double POUNDtoKG(Double weight) {
        return weight*0.45359237;
    }

    public Double POUNDtoGRAM(Double weight) {
        return weight*453.59237;
    }

    public Double OUNCEtoPOUND(Double weight) {
        return weight/16;
    }

    public Double OUNCEtoSTONE(Double weight) {
        return weight*0.0044642857;
    }

    public Double OUNCEtoKG(Double weight) {
        return weight*0.02834952;
    }

    public Double OUNCEtoGRAM(Double weight) {
        return weight*28.34952;
    }

    public Double STONEtoPOUND(Double weight) {
        return weight*14;
    }

    public Double STONEtoOUNCE(Double weight) {
        return weight*224;
    }

    public Double STONEtoKG(Double weight) {
        return weight*6.350293;
    }

    public Double STONEtoGRAM(Double weight) {
        return weight/0.0001575;
    }

    public Double KGtoPOUND(Double weight) {
        return weight/0.45359237;
    }

    public Double KGtoOUNCE(Double weight) {
        return weight/0.02834952;
    }

    public Double KGtoSTONE(Double weight) {
        return weight*0.157473;
    }

    public Double KGtoGRAM(Double weight) {
        return weight*1000;
    }

    public Double GRAMtoPOUND(Double weight) {
        return weight/453.59237;
    }

    public Double GRAMtoOUNCE(Double weight) {
        return weight/28.34952;
    }

    public Double GRAMtoSTONE(Double weight) {
        return weight/6350.293159;
    }

    public Double GRAMtoKG(Double weight) {
        return weight/1000;
    }
}
