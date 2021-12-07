import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AreaOfRectangleTest {
private AreaOfRectangle rectangle;
@BeforeEach
public void setup(){
    rectangle=new AreaOfRectangle();
}
@Test
    public void lengthTwoAndBreadthThreeAreaIsSix()  {
    //AreaOfRectangle rectangle=new AreaOfRectangle();
    double answer=rectangle.area(2,3);
    double expected=6;
    Assertions.assertEquals(answer,expected);
}

    @Test
    public void lengthTwoAndBreadth4AreaIsEight(){
        //AreaOfRectangle rectangle=new AreaOfRectangle();
        double answer=rectangle.area(2,4);
        double expected=8;
        Assertions.assertEquals(answer,expected);
    }
    @Test
    public void lengthTwoPointFiveAndBreadthTwoPointTwoAreaIsFivePointFive(){
        //AreaOfRectangle rectangle=new AreaOfRectangle();
        double answer=rectangle.area(2.5,2.2);
        double expected=5.5;
        Assertions.assertEquals(answer,expected);
    }
    @Test
    public void lengthTwoPointFiveAndBreadthTwoAreaIsFive() {
        //AreaOfRectangle rectangle=new AreaOfRectangle();
        double answer=rectangle.area(2.5,2);
        double expected=5.0;
        Assertions.assertEquals(answer,expected);
    }
    @Test
    public void throwArithmeticExceptionWhenOneSideIsZero()
    {
        //AreaOfRectangle rectangle=new AreaOfRectangle();
        //double answer=rectangle.area(2.5,2.2);
       // double expected=5.5;

        Assertions.assertThrows(ArithmeticException.class,()->rectangle.area(2,0));
    }
   @Test
   public void throwArithmeticExceptionWhenOneSideIsNegative()
   {
       Assertions.assertThrows(ArithmeticException.class,()->rectangle.area(-2,2));
   }
    @Test
    public void throwArithmeticExceptionWhenTwoSidesAreEqual()
    {
        Assertions.assertThrows(ArithmeticException.class,()->rectangle.area(2,2));
    }
}
