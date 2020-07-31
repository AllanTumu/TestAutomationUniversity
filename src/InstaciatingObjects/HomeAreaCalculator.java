package InstaciatingObjects;

public class HomeAreaCalculator {
    public static void main(String[] args) {
        /**********************
         * Room 1
         */

        //Create an object for rectangle 1
        Rectangle room1 = new Rectangle();
        room1.setLength(20);
        room1.setWidth(30);
        double areaOfTheRoom1 = room1.areaofTriangle();

        /**********************
         * Room 2
         */
        //Create an object for Room 2
        Rectangle room2 = new Rectangle(60,80);
        double areaofRoom2 = room2.areaofTriangle();

        //Calculate the total area of the Rectangle
        double totalArea = areaOfTheRoom1+areaofRoom2;

        System.out.println("The total area of the room is " +totalArea);
    }
}
