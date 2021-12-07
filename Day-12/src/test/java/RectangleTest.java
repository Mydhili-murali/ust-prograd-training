import org.junit.jupiter.api.*;

public class RectangleTest {
private Rectangle rectangle;
@BeforeEach
public void setup(){
    rectangle=new Rectangle();
}
@Nested
class AreaOfRectangleFunction{
    @BeforeEach
    public void setup(){
        rectangle=new Rectangle();
    }
    @Test
    public void lengthTwoAndBreadthThreeAreaIsSix()  {
        //Rectangle rectangle=new Rectangle();
        double answer=rectangle.area(2,3);
        double expected=6;
        Assertions.assertEquals(answer,expected);
    }

    @Test
    public void lengthTwoAndBreadthFourAreaIsEight(){
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
    public void ifLengthTwoAndBreadthZeroThrowsArithmeticException()
    {
        //AreaOfRectangle rectangle=new AreaOfRectangle();
        //double answer=rectangle.area(2.5,2.2);
        // double expected=5.5;

        Assertions.assertThrows(IllegalArgumentException.class,()->rectangle.area(2,0));
    }
    @Test
    public void ifLengthNegativeTwoAndBreadthTwoThrowsArithmeticException()
    {
        Assertions.assertThrows(IllegalArgumentException.class,()->rectangle.area(-2,2));
    }
    @Test
    public void ifLengthTwoAndBreadthTwoThrowsArithmeticException()
    {
        Assertions.assertThrows(IllegalArgumentException.class,()->rectangle.area(2,2));
    }

}
@Nested
public class PerimeterOfRectangleFunction{
    @BeforeEach
    public void setup(){
        rectangle=new Rectangle();
    }

    @Test
    public void lengthTwoAndBreadthFourPerimeterIsTwelve()
    {
        double answer=rectangle.perimeter(2,4);
        double expected=12;
        Assertions.assertEquals(answer,expected);
    }
    @Test
    public void lengthTwoAndBreadthThreePerimeterIsTen()
    {
        double answer=rectangle.perimeter(2,3);
        double expected=10;
        Assertions.assertEquals(answer,expected);
    }

    @Test
    public void lengthTwoPointFiveAndBreadthThreePointFivePerimeterIsTwelve()
    {
        double answer=rectangle.perimeter(2.5,3.5);
        double expected=12;
        Assertions.assertEquals(answer,expected);
    }
    @Test
    public void lengthTwoPointFiveAndBreadthTwoPerimeterIsNine()
    {
        double answer=rectangle.perimeter(2.5,2);
        double expected=9;
        Assertions.assertEquals(answer,expected);
    }
    @Test
    public void ifLengthTwoAndBreadthZeroThrowsException()
    {

        Assertions.assertThrows(IllegalArgumentException.class,()->rectangle.perimeter(2,0));
    }
    @Test
    public void ifLengthTwoAndBreadthNegativeThreeThrowsException()
    {

        Assertions.assertThrows(IllegalArgumentException.class,()->rectangle.perimeter(2,-3));
    }
    @Test
    public void ifLengthTwoAndBreadthTwoThrowsException()
    {

        Assertions.assertThrows(IllegalArgumentException.class,()->rectangle.perimeter(2,2));
    }

}


}
