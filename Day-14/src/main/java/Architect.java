import java.io.IOException;

class Architect {
    double length;
    Architect(double length){
        if(length <=0)
        {
            throw new IllegalArgumentException("Length can't be less than or equal to zero");
        }
        this.length=length;
    }
    public double centimeterToCentimeter(){
        return length;
    }
    public double MeterToCentimeter(){
        return length*100;
    }
    public double CentimeterToKilometer(){
        return length/100000;
    }

}
