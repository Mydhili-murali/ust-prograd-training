import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class ArchitectTest {
    private Architect architect;

    @Test
    public void checkIfErrorWhenLengthIsZero() {
        assertThrows(IllegalArgumentException.class, () -> new Architect(0));
    }

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
    }
}