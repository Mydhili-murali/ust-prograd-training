import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    private Square square;
    @Nested
    public class AreaOfSquareFunction{
        @Test
        public void areaOfSquareWhenSideEqualToTwoIsFour()
        {
            square=new Square(2);
            double answer= square.area();
            double expected=4;
            assertEquals(expected,answer);
        }
        @Test
        public void areaOfSquareWhenSideEqualToTwoPointFiveIsSixPointTwoFive()
        {
            square=new Square(2.5);
            double answer= square.area();
            double expected=6.25;
            assertEquals(expected,answer);
        }
        @Test
        public void areaOfSquareWhenSideEqualToNegativeTwoThenThrowsException()
        {
            assertThrows(IllegalArgumentException.class,()->new Square(-2));
        }

        @Test
        public void areaOfSquareWhenSideEqualToZeroThenThrowsException()
        {
            assertThrows(IllegalArgumentException.class,()->new Square(0));
        }


    }
    @Nested
    public class PerimeterOfSquareFunction{
        @Test
        public void perimeterOfSquareWhenSideEqualToTwoIsEight()
        {
            square=new Square(2);
            double answer= square.perimeter();
            double expected=8;
            assertEquals(expected,answer);
        }
        @Test
        public void perimeterOfSquareWhenSideEqualToTwoPointFiveIsTen()
        {
            square=new Square(2.5);
            double answer= square.perimeter();
            double expected=10;
            assertEquals(expected,answer);
        }
        @Test
        public void perimeterOfSquareWhenSideEqualToNegativeTwoThenThrowsException()
        {
            assertThrows(IllegalArgumentException.class,()->new Square(-2));
        }

        @Test
        public void perimeterOfSquareWhenSideEqualToZeroThenThrowsException()
        {
            assertThrows(IllegalArgumentException.class,()->new Square(0));
        }


    }

}