package InstaciatingObjects;

public class Rectangle {

    private double length;
    private double width;

    //Create a constructor for the Length class
    //Constructors are uses to initialize or set default values for the parameters

    //Constructor without set parameters is called the default constructor
    public Rectangle() {
        length = 0;
        width = 0;
    }

    //Create a constructor with parameters
    public Rectangle(double length, double width) {

    }

    //Create getters and setters for the Lenght and width
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //calculate the Area of the Triangle
    public double areaofTriangle() {
        double area = length * width;
        return area;
    }

    //Calculate the perimeter of triangle
    public void perimeterOfTriangle() {
        double perimeter = (2*length) + (2*width);
    }


}
