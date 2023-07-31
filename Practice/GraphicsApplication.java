// 10
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
