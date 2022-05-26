package com.company;

public class SpeedConverter {
    public SpeedConverter(){}

    Double temp;

    public Double returnSpeed(Double speed, String from, String to){
        if(from == "MPH") {
            if(to == "MPH") return speed;
            else if(to == "KPH") temp = MPHtoKPH(speed);
            else if(to == "Knot") temp = MPHtoKNOTS(speed);
            else if(to == "Mach") temp = MPHtoMACH(speed);
        }

        if(from == "KPH") {
            if(to == "KPH") return speed;
            else if(to == "MPH") temp = KPHtoMPH(speed);
            else if(to == "Knot") temp = KPHtoKNOTS(speed);
            else if(to == "Mach") temp = KPHtoMACH(speed);
        }

        if(from == "Knot") {
            if(to == "Knot") return speed;
            else if(to == "MPH") temp = KNOTStoMPH(speed);
            else if(to == "KPH") temp = KNOTStoKPH(speed);
            else if(to == "Mach") temp = KNOTStoMACH(speed);
        }

        if(from == "Mach") {
            if(to == "Mach") return speed;
            else if(to == "MPH") temp = MACHtoMPH(speed);
            else if(to == "KPH") temp = MACHtoKPH(speed);
            else if(to == "Knot") temp = MACHtoKNOTS(speed);
        }

        return temp;
    }

    public Double MPHtoKPH(Double speed) {
        return speed*1.60934;
    }

    public Double MPHtoKNOTS(Double speed) {
        return speed/1.151;
    }

    public Double MPHtoMACH(Double speed) {
        return speed/767;
    }

    public Double KPHtoMPH(Double speed) {
        return speed/1.609;
    }

    public Double KPHtoKNOTS(Double speed) {
        return speed/1.852;
    }

    public Double KPHtoMACH(Double speed) {
        return speed/1235;
    }

    public Double KNOTStoMPH(Double speed) {
        return speed*1.15078;
    }

    public Double KNOTStoKPH(Double speed) {
        return speed*1.852;
    }

    public Double KNOTStoMACH(Double speed) {
        return speed/667;
    }

    public Double MACHtoMPH(Double speed) {
        return speed*767.269;
    }

    public Double MACHtoKPH(Double speed) {
        return speed*1234.8;
    }

    public Double MACHtoKNOTS(Double speed) {
        return speed*666.739;
    }
}
