public class LengthConverter extends MagnitudeConverter {
    public double centimeterToCentimeter(double magnitudeInCentimeter) {
        return magnitudeInCentimeter;
    }

    //Base can be meter or gram
    public double centimeterToMeter(double magnitudeInCentimeter) {
        return magnitudeInCentimeter / 100;
    }

    public double meterToCentimeter(double magnitudeInMeter) {
        return magnitudeInMeter * 100;
    }

    public double centimeterToKilometer(double magnitudeInCentimeter) {
        return magnitudeInCentimeter / 100000;
    }

    public double kilometerToCentimeter(double magnitudeInKilometer) {
        return magnitudeInKilometer * 100000;
    }
}
