import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
private Rectangle rectangle;
//@BeforeEach
//public void setup(){
//    rectangle=new Rectangle();
//}
@Nested
class AreaOfRectangleFunction{
//    @BeforeEach
//    public void setup(){
//        rectangle=new Rectangle();
//    }
    @Test
    public void areaOfRectangleWhenLengthTwoAndBreadthThreeIsSix()  {
        rectangle=new Rectangle(2,3);
        double answer=rectangle.area();
        double expected=6;
        assertEquals(expected,answer);
    }

    @Test
    public void areaOfRectangleWhenLengthTwoAndBreadthFourIsEight(){
        rectangle=new Rectangle(2,4);
        double answer=rectangle.area();
        double expected=8;
        assertEquals(expected,answer);
    }
    @Test
    public void areaOfRectangleWhenLengthTwoPointFiveAndBreadthTwoPointTwoIsFivePointFive(){
         rectangle=new Rectangle(2.5,2.2);
        double answer=rectangle.area();
        double expected=5.5;
        assertEquals(expected,answer);
    }
    @Test
    public void lengthTwoPointFiveAndBreadthTwoAreaIsFive() {
        rectangle=new Rectangle(2.5,2);
        double answer=rectangle.area();
        double expected=5.0;
        assertEquals(expected,answer);
    }
    @Test
    public void ifLengthTwoAndBreadthZeroThrowsArithmeticException()
    {
        //AreaOfRectangle rectangle=new AreaOfRectangle();
        //double answer=rectangle.area(2.5,2.2);
        // double expected=5.5;

        assertThrows(IllegalArgumentException.class,()->new Rectangle(2,0));
    }
    @Test
    public void ifLengthNegativeTwoAndBreadthTwoThrowsArithmeticException()
    {
        assertThrows(IllegalArgumentException.class,()->new Rectangle(-2,2));
    }
//    @Test
//    public void ifLengthTwoAndBreadthTwoThrowsException()
//    {
//
//        assertThrows(IllegalArgumentException.class,()->new Rectangle(2,2));
//    }

}
@Nested
public class PerimeterOfRectangleFunction{
//    @BeforeEach
//    public void setup(){
//        rectangle=new Rectangle();
//    }

    @Test
    public void lengthTwoAndBreadthFourPerimeterIsTwelve()
    {
        rectangle=new Rectangle(2,4);
        double answer=rectangle.perimeter();
        double expected=12;
        assertEquals(expected,answer);
    }
    @Test
    public void lengthTwoAndBreadthThreePerimeterIsTen()
    {
        rectangle=new Rectangle(2,3);
        double answer=rectangle.perimeter();
        double expected=10;
        assertEquals(expected,answer);
    }

    @Test
    public void lengthTwoPointFiveAndBreadthThreePointFivePerimeterIsTwelve()
    {
        rectangle=new Rectangle(2.5,3.5);
        double answer=rectangle.perimeter();
        double expected=12;
        assertEquals(expected,answer);
    }
    @Test
    public void lengthTwoPointFiveAndBreadthTwoPerimeterIsNine()
    {
        rectangle=new Rectangle(2.5,2);
        double answer=rectangle.perimeter();
        double expected=9;
        assertEquals(expected,answer);
    }
    @Test
    public void ifLengthTwoAndBreadthZeroThrowsException()
    {

        assertThrows(IllegalArgumentException.class,()->new Rectangle(2,0));
    }
    @Test
    public void ifLengthTwoAndBreadthNegativeThreeThrowsException()
    {

        assertThrows(IllegalArgumentException.class,()->new Rectangle(2,-3));
    }
//   @Test
//   public void ifLengthTwoAndBreadthTwoThrowsException()
//    {
//
//      assertThrows(IllegalArgumentException.class,()->new Rectangle(2,2));
//    }

}



}
