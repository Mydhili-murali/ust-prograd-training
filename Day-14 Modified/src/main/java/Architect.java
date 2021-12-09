import java.io.IOException;

class Architect {
    double value;
    double value1, value2;
    Architect(double value){
//        if(value <=0)
//        {
//            throw new IllegalArgumentException("Length can't be less than or equal to zero");
//        }
        this.value=value;
    }
    Architect(double value1, double value2){
        this.value1=value1;
        this.value2=value2;

    }

    public double centimeterToCentimeter(){

        return value;
    }
    public double MeterToCentimeter(){
        return value*100;
    }
    public double CentimeterToKilometer(){
        return value/100000;
    }
    public double addingMeterAndCentimeterIsMeter(){
        return value1+(value2/100);
    }
    public double addingCentiMeterAndKilometerIsCentiMeter(){
        return value1+(value2*100000);
    }


    public double subtractionOfMeterAndCentimeterIsMeter() {
        return value1-(value2/100);
    }

    public double subtractionOfCentiMeterAndMeterIsCentiMeter() {
        return value1-(value2*100);
    }
}
