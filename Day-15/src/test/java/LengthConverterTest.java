//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class LengthConverterTest {
    LengthConverter lengthConverter=new LengthConverter();



    @Nested
    class CentimeterToCentimeter {
        @Test
        public void checkIfOneCentimeterEqualToOneCentimeter() {
            //architect = new Architect(1);
            double actualLength = lengthConverter.centimeterToCentimeter(1);
            double expectedLength = 1;
            assertEquals(expectedLength, actualLength);
        }
    }

    @Nested
    class MeterToCentimeterTest {
        @Test
        public void checkIfOneMeterEqualToHundredCentimeter() {
            //architect = new Architect(1);
            double actualLength = lengthConverter.meterToCentimeter(1);
            double expectedLength = 100;
            assertEquals(expectedLength, actualLength);
        }

        @Nested
        class CentimeterToKilometerTest {
            @Test
            public void checkIfHundredCentimeterEqualToPointZeroZeroOneKilometer() {
                //architect = new Architect(100);
                double actualLength = lengthConverter.centimeterToKilometer(100);
                double expectedLength = 0.001;
                assertEquals(expectedLength, actualLength);
            }
        }
        @Nested
        class AdditionOfMagnitudesFunction{
            @Test
            public void sumOfOneMeterAndHundredCentimeterGivesTwoMeter()
            {
                //Architect architect=new Architect(1,100);
                double actualLength = 1+lengthConverter.centimeterToMeter(100);
                double expectedLength = 2;
                assertEquals(expectedLength, actualLength);
            }
            @Test
            public void sumOfTwoHundredCentimeterAndOneKilometerIsOneLakhAndTwoHundredCentimeter()
            {
                //Architect architect=new Architect(200,1);
                double actualLength = 200+lengthConverter.kilometerToCentimeter(1);
                double expectedLength = 100200;
                assertEquals(expectedLength, actualLength);
            }

        }

        @Nested
        class SubtractionOfMagnitudeFunction{
            @Test
            public void subtractionOfOneMeterAndFiftyCentimeterGivesZeroPointFiveMeter()
            {
                //Architect architect=new Architect(1,50);
                double actualLength = 1-lengthConverter.centimeterToMeter(50);
                double expectedLength = 0.5;
                assertEquals(expectedLength, actualLength);
            }
            @Test
            public void subtractionOfTwoThousandCentimeterAndOneMeterGivesOneThousandAndNineHundredCentimeter()
            {
                //Architect architect=new Architect(2000,1);
                double actualLength = 2000-lengthConverter.meterToCentimeter(1);
                double expectedLength = 1900;
                assertEquals(expectedLength, actualLength);
            }

        }
    }

}