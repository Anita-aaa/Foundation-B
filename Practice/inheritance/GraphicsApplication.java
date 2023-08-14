
// 10

/*10.You are building a shape hierarchy for a graphics application. 
There is a base class called Shape, which has a method called display ().
 The Rectangle class inherits from Shape and has additional attributes 
 and methods specific to rectangles. The Square class inherits from the Rectangle class and 
 overrides the display () method to show the special properties of a square. Implement the classes 
 and demonstrate multilevel inheritance by creating objects of each class and calling their respective methods. */
class Shape {
    void display() {
        System.out.println("This is a generic shape.");
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    // Constructor to set dimensions (length and width) of the rectangle
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void display() {
        System.out.println("This is a rectangle.");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }

    double getArea() {
        return length * width;
    }
}

class Square extends Rectangle {
    Square(double sideLength) {
        super(sideLength, sideLength); // Call the constructor of the superclass (Rectangle) with sideLength for both length and width
    }

    @Override
    void display() {
        System.out.println("This is a square.");
        System.out.println("Side Length: " + length); // Side length of a square is equal to the length of the rectangle
    }
}

public class GraphicsApplication {
    public static void main(String[] args) {
        Shape genericShape = new Shape();
        genericShape.display();

        Rectangle rectangle = new Rectangle(5.0, 3.0); // Set dimensions directly using the constructor
        rectangle.display();
        System.out.println("Area: " + rectangle.getArea());

        Square square = new Square(4.0); // Set dimensions directly using the constructor
        square.display();
        System.out.println("Area: " + square.getArea());
    }
}
// output
// This is a generic shape.
// This is a rectangle.
// Length: 5.0
// Width: 3.0
// Area: 15.0
// This is a square.
// Side Length: 4.0
// Area: 16.0