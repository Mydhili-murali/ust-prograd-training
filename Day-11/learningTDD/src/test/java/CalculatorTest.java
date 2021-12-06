import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calc;
    @BeforeEach
    public void setup()
    {
      calc=new Calculator();
    }
@Nested
  public class TestingAdditionFunction{
        @BeforeEach
        public void setup()
        {
            calc=new Calculator();
        }
        @Test
        public void fivePlusThreeIsEight(){

            //Calculator calc=new Calculator();
            double answer=calc.addition(5,3);
            double expected=8;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void fivePlusFiveIsTen(){
            //Calculator calc=new Calculator();
            double answer=calc.addition(5,5);
            double expected=10;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void fivePlusZeroIsFive(){
            //Calculator calc=new Calculator();
            double answer=calc.addition(5,0);
            double expected=5;
            Assertions.assertEquals(answer,expected);
        }

    }
    @Nested
    public class TestingSubtractionFunction{
        @BeforeEach
        public void setup(){
            Calculator calc=new Calculator();
        }
        @Test
        public void eightMinusThreeIsFive()
        {
            double answer=calc.subtraction(8,3);
            double expected=5;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void eightMinusNineIsNegativeOne(){
            double answer=calc.subtraction(8,9);
            double expected=-1;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void eightMinusZeroIsEight(){
            double answer=calc.subtraction(8,0);
            double expected=8;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void negativeOneMinusNegativeOneIsZero(){
            double answer=calc.subtraction(-1,-1);
            double expected=0;
            Assertions.assertEquals(answer,expected);
        }


    }
    @Nested
    public class TestMultiplication{
        @BeforeEach
        public void setup()
        {
            calc=new Calculator();
        }
        @Test
        public void multiplicationOfTwoAndTwo()
        {
            double answer=calc.multiplication(2,2);
            double expected=4;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void multiplicationOfTwoAndNegativeTwo()
        {
            double answer=calc.multiplication(2,-2);
            double expected=-4;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void multiplicationOfTwoAndZero()
        {
            double answer=calc.multiplication(2,0);
            double expected=0;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void multiplicationOfNegativeTwoAndNegativeTwo()
        {
            double answer=calc.multiplication(-2,-2);
            double expected=4;
            Assertions.assertEquals(answer,expected);
        }
    }
    @Nested
    public class TestDivisionFunction{
        @BeforeEach
        public void setup()
        {
            calc=new Calculator();
        }
        @Test
        public void divisionOfEightByFourIsTwo()
        {
            double answer=calc.division(8,4);
            double expected=2;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void divisionOfNegativeEightByNegativeFour()
        {
            double answer=calc.division(-8,-4);
            double expected=2;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void divisionOfNegativeEightByFour()
        {
            double answer=calc.division(-8,4);
            double expected=-2;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void throwsExceptionWhenDividedByZero()
        {
            //double answer=calc.division(8,0);
            Assertions.assertThrows(ArithmeticException.class, ()-> calc.division(8,0));
        }

    }
}
