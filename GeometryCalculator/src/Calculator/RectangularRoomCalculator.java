package Calculator;

public class RectangularRoomCalculator implements GeometricCalculation{

    @Override
    public void calculateArea(double height, double  width) {
        double area = height * width;
        System.out.println("The area of the rectangular room is: " + area);
    }

    @Override
    public void calculatePerimeter(double height, double width) {
        double perimeter = 2 * (height + width);
        System.out.println("The perimeter of the rectangular room is: " + perimeter);
    }
}
