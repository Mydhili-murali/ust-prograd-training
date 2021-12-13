//import java.io.IOException;

public abstract class MagnitudeConverter {
    public double meterOrGramToMeterOrGram(double magnitudeInMeterOrInGram) {
        return magnitudeInMeterOrInGram;
    }

    public double meterOrGramToKilometerOrKilogram(double magnitudeInKilometerOrKilogram) {
        return magnitudeInKilometerOrKilogram / 1000;
    }

    public double kilometerOrKilogramToMeterOrGram(double magnitudeInKilometerOrKilogram) {
        return magnitudeInKilometerOrKilogram * 1000;
    }


}
