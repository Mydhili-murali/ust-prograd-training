import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class ArchitectTest {
    private Architect architect;

//    @Test
//    public void checkIfErrorWhenLengthIsZero() {
//        assertThrows(IllegalArgumentException.class, () -> new Architect(0));
//    }

    @Nested
    class CentimeterToCentimeter {
        @Test
        public void checkIfOneCentimeterEqualToOneCentimeter() {
            architect = new Architect(1);
            double actualLength = architect.centimeterToCentimeter();
            double expectedLength = 1;
            assertEquals(expectedLength, actualLength);
        }
    }

    @Nested
    class MeterToCentimeterTest {
        @Test
        public void checkIfOneMeterEqualToHundredCentimeter() {
            architect = new Architect(1);
            double actualLength = architect.MeterToCentimeter();
            double expectedLength = 100;
            assertEquals(expectedLength, actualLength);
        }

        @Nested
        class CentimeterToKilometerTest {
            @Test
            public void checkIfHundredCentimeterEqualToPointZeroZeroOneKilometer() {
                architect = new Architect(100);
                double actualLength = architect.CentimeterToKilometer();
                double expectedLength = 0.001;
                assertEquals(expectedLength, actualLength);
            }
        }
        @Nested
        class AdditionOfValuesFunction{
            @Test
            public void sumOfOneMeterAndHundredCentimeterGivesTwoMeter()
            {
                Architect architect=new Architect(1,100);
                double actualLength = architect.addingMeterAndCentimeterIsMeter();
                double expectedLength = 2;
                assertEquals(expectedLength, actualLength);
            }
            @Test
            public void sumOfTwoHundredCentimeterAndOneKilometerIsOneLakhAndTwoHundredCentimeter()
            {
                Architect architect=new Architect(200,1);
                double actualLength = architect.addingCentiMeterAndKilometerIsCentiMeter();
                double expectedLength = 100200;
                assertEquals(expectedLength, actualLength);
            }

        }

        @Nested
        class SubtractionOfValuesFunction{
            @Test
            public void subtractionOfOneMeterAndFiftyCentimeterGivesZeroPointFiveMeter()
            {
                Architect architect=new Architect(1,50);
                double actualLength = architect.subtractionOfMeterAndCentimeterIsMeter();
                double expectedLength = 0.5;
                assertEquals(expectedLength, actualLength);
            }
            @Test
            public void subtractionOfTwoThousandCentimeterAndOnemeterGivesOneThousandAndNineHundredCentimeter()
            {
                Architect architect=new Architect(2000,1);
                double actualLength = architect.subtractionOfCentiMeterAndMeterIsCentiMeter();
                double expectedLength = 1900;
                assertEquals(expectedLength, actualLength);
            }

        }
    }

}