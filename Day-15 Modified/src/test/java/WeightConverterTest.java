import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeightConverterTest {
    WeightConverter weightConverter = new WeightConverter();

    @Nested
    public class GramToGramTest {
        @Test
        public void checkIfOneGramIsEqualToOneGram() {
            double actualWeight = weightConverter.meterOrGramToMeterOrGram(1);
            double expectedWeight = 1;
            assertEquals(expectedWeight, actualWeight);
        }
    }

    @Nested
    public class KiloGramToGramTest {
        @Test
        public void checkIfPointOneKilogramIsEqualToHundredGram() {
            double actualWeight = weightConverter.kilometerOrKilogramToMeterOrGram(0.1);
            double expectedWeight = 100;
            assertEquals(expectedWeight, actualWeight);
        }
    }

    @Nested
    public class AddingOfWeights {
        @Test
        public void checkIfAdditionOfTenGramAndOneKilogramGivesThousandAndTenGram() {
            double actualWeight = 10 + weightConverter.kilometerOrKilogramToMeterOrGram(1);
            double expectedWeight = 1010;
            assertEquals(expectedWeight, actualWeight);
        }
    }

    @Nested
    public class SubtractionOfWeights {
        @Test
        public void checkIfSubtractionOfOneAndHalfKilogramAndFiveHundredGramGivesOneKilogram() {
            double actualWeight = 1.5 - weightConverter.meterOrGramToKilometerOrKilogram(500);
            double expectedWeight = 1;
            assertEquals(expectedWeight, actualWeight);
        }
    }


}
//    As an architect I want to be able to check if 1 g is equal to 1 g,
//    and 0.1 kg = 100 g, and to know that 10 g + 1 kg = 1010 g, and 1.5 kg - 500 g = 1 kg.
