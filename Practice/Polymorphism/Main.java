// // 15
package Polymorphism;

/*// Shape interface
interface Shape {
    double calculateArea();
}

// Circle class implementing the Shape interface
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class implementing the Shape interface
class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

// Triangle class implementing the Shape interface
class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Triangle(3, 4);

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }
    }
}
*/



//  //15

// // Abstract class Shape
// abstract class Shape {
//     abstract double calculateArea();
// }

// // Circle subclass extending Shape
// class Circle extends Shape {
//     double radius;

//     public Circle(double radius) {
//         this.radius = radius;
//     }

//     @Override
//     double calculateArea() {
//         return Math.PI * radius * radius;
//     }
// }

// // Rectangle subclass extending Shape
// class Rectangle extends Shape {
//     double width;
//     double height;

//     public Rectangle(double width, double height) {
//         this.width = width;
//         this.height = height;
//     }

//     @Override
//     double calculateArea() {
//         return width * height;
//     }
// }

// // Triangle subclass extending Shape
// class Triangle extends Shape {
//     double base;
//     double height;

//     public Triangle(double base, double height) {
//         this.base = base;
//         this.height = height;
//     }

//     @Override
//     double calculateArea() {
//         return 0.5 * base * height;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Create instances of different shapes
//         Circle circle = new Circle(5);
//         Rectangle rectangle = new Rectangle(4, 6);
//         Triangle triangle = new Triangle(3, 4);

//         // Calculate and display the areas of different shapes
//         System.out.println("Circle Area: " + circle.calculateArea());
//         System.out.println("Rectangle Area: " + rectangle.calculateArea());
//         System.out.println("Triangle Area: " + triangle.calculateArea());
//     }
// }


// 16

// PaymentMethod interface
/*interface PaymentMethod {
    boolean validatePayment();
    void performTransaction();
}

// CreditCardPayment class implementing the PaymentMethod interface
class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private String cardExpiry;

    public CreditCardPayment(String cardNumber, String cardExpiry) {
        this.cardNumber = cardNumber;
        this.cardExpiry = cardExpiry;
    }

    @Override
    public boolean validatePayment() {
        // Add validation logic for credit card payment
        return true; // For simplicity, always return true
    }

    @Override
    public void performTransaction() {
        System.out.println("Performing credit card transaction...");
        // Add logic for credit card transaction
        System.out.println("Credit card transaction completed successfully!");
    }
}

// PayPalPayment class implementing the PaymentMethod interface
class PayPalPayment implements PaymentMethod {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public boolean validatePayment() {
        // Add validation logic for PayPal payment
        return true; // For simplicity, always return true
    }

    @Override
    public void performTransaction() {
        System.out.println("Performing PayPal transaction...");
        // Add logic for PayPal transaction
        System.out.println("PayPal transaction completed successfully!");
    }
}

// BankTransferPayment class implementing the PaymentMethod interface
class BankTransferPayment implements PaymentMethod {
    private String accountNumber;

    public BankTransferPayment(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean validatePayment() {
        // Add validation logic for bank transfer payment
        return true; // For simplicity, always return true
    }

    @Override
    public void performTransaction() {
        System.out.println("Performing bank transfer transaction...");
        // Add logic for bank transfer transaction
        System.out.println("Bank transfer transaction completed successfully!");
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentMethod[] paymentMethods = new PaymentMethod[3];
        paymentMethods[0] = new CreditCardPayment("1234567890123456", "12/24");
        paymentMethods[1] = new PayPalPayment("example@example.com");
        paymentMethods[2] = new BankTransferPayment("0123456789");

        for (PaymentMethod paymentMethod : paymentMethods) {
            if (paymentMethod.validatePayment()) {
                paymentMethod.performTransaction();
                System.out.println();
            } else {
                System.out.println("Payment validation failed.");
            }
        }
    }
}
*/

//  have to use private in this qst
/*You are right; the question did not explicitly mention using the private access modifier. 
Since the fields in the payment methods should ideally be private for encapsulation, let's 
update the Java program to use the private access modifier for the fields in each payment method class. */
// // 16

// // PaymentMethod interface
// interface PaymentMethod {
//     boolean validatePayment();
//     void performTransaction();
// }

// // CreditCardPayment class implementing the PaymentMethod interface
// class CreditCardPayment implements PaymentMethod {
//     private String cardNumber;
//     private String cardExpiry;

//     public CreditCardPayment(String cardNumber, String cardExpiry) {
//         this.cardNumber = cardNumber;
//         this.cardExpiry = cardExpiry;
//     }

//     @Override
//     public boolean validatePayment() {
//         // Add validation logic for credit card payment
//         // For simplicity, always return true
//         return true;
//     }

//     @Override
//     public void performTransaction() {
//         System.out.println("Performing credit card transaction...");
//         // Add logic for credit card transaction using cardNumber and cardExpiry
//         System.out.println("Credit card transaction completed successfully!");
//     }
// }

// // PayPalPayment class implementing the PaymentMethod interface
// class PayPalPayment implements PaymentMethod {
//     private String email;

//     public PayPalPayment(String email) {
//         this.email = email;
//     }

//     @Override
//     public boolean validatePayment() {
//         // Add validation logic for PayPal payment
//         // For simplicity, always return true
//         return true;
//     }

//     @Override
//     public void performTransaction() {
//         System.out.println("Performing PayPal transaction...");
//         // Add logic for PayPal transaction using email
//         System.out.println("PayPal transaction completed successfully!");
//     }
// }

// // BankTransferPayment class implementing the PaymentMethod interface
// class BankTransferPayment implements PaymentMethod {
//     private String accountNumber;

//     public BankTransferPayment(String accountNumber) {
//         this.accountNumber = accountNumber;
//     }

//     @Override
//     public boolean validatePayment() {
//         // Add validation logic for bank transfer payment
//         // For simplicity, always return true
//         return true;
//     }

//     @Override
//     public void performTransaction() {
//         System.out.println("Performing bank transfer transaction...");
//         // Add logic for bank transfer transaction using accountNumber
//         System.out.println("Bank transfer transaction completed successfully!");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Process payments using different payment methods
//         PaymentMethod[] paymentMethods = new PaymentMethod[3];
//         paymentMethods[0] = new CreditCardPayment("1234567890123456", "12/24");
//         paymentMethods[1] = new PayPalPayment("example@example.com");
//         paymentMethods[2] = new BankTransferPayment("0123456789");

//         for (PaymentMethod paymentMethod : paymentMethods) {
//             if (paymentMethod.validatePayment()) {
//                 paymentMethod.performTransaction();
//                 System.out.println();
//             } else {
//                 System.out.println("Payment validation failed.");
//             }
//         }
//     }
// }


// // 17

// // Abstract class Vehicle
// abstract class Vehicle {
//     abstract double calculateRentalCost(int days);
// }

// // Car subclass extending Vehicle
// class Car extends Vehicle {
//     double dailyRate;

//     public Car(double dailyRate) {
//         this.dailyRate = dailyRate;
//     }

//     @Override
//     double calculateRentalCost(int days) {
//         return dailyRate * days;
//     }
// }

// // Motorcycle subclass extending Vehicle
// class Motorcycle extends Vehicle {
//     double dailyRate;

//     public Motorcycle(double dailyRate) {
//         this.dailyRate = dailyRate;
//     }

//     @Override
//     double calculateRentalCost(int days) {
//         return dailyRate * days;
//     }
// }

// // Bicycle subclass extending Vehicle
// class Bicycle extends Vehicle {
//     double hourlyRate;

//     public Bicycle(double hourlyRate) {
//         this.hourlyRate = hourlyRate;
//     }

//     @Override
//     double calculateRentalCost(int days) {
//         // For bicycles, we are calculating the rental cost based on hours, not days
//         // So, the argument "days" here is not used for bicycle calculation
//         // We'll keep the method signature the same to comply with the abstract class, but the logic will use hours instead of days
//         return hourlyRate * days;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Create instances of different vehicles
//         Vehicle[] vehicles = new Vehicle[3];
//         vehicles[0] = new Car(50.0);
//         vehicles[1] = new Motorcycle(30.0);
//         vehicles[2] = new Bicycle(5.0);

//         int rentalPeriodInDays = 3;
//         int rentalPeriodInHours = 5;

//         // Calculate and display the rental costs of different vehicles
//         for (Vehicle vehicle : vehicles) {
//             double rentalCost;
//             if (vehicle instanceof Bicycle) {
//                 rentalCost = vehicle.calculateRentalCost(rentalPeriodInHours);
//             } else {
//                 rentalCost = vehicle.calculateRentalCost(rentalPeriodInDays);
//             }
//             System.out.println("Rental cost: $" + rentalCost);
//         }
//     }
// }





/*
No, you don't necessarily have to use an abstract class for the given question. 
Polymorphism can be achieved in Java through interfaces as well, and using interfaces 
is often preferred when there is no shared implementation among the classes.

In the context of the restaurant ordering system, we can define an interface named "MenuItem"
 with two abstract methods: prepare() and serve(). Then, each menu item class can implement this
  interface and provide its specific implementation for the preparation and serving methods. */

// 18 abstract
// // Abstract class MenuItem
// abstract class MenuItem {
//     abstract void prepare();
//     abstract void serve();
// }

// // Appetizer subclass extending MenuItem
// class Appetizer extends MenuItem {
//     private String name;

//     public Appetizer(String name) {
//         this.name = name;
//     }

//     @Override
//     void prepare() {
//         System.out.println(name + " is being prepared as an appetizer...");
//         // Add specific preparation logic for appetizers
//     }

//     @Override
//     void serve() {
//         System.out.println(name + " is served as an appetizer.");
//         // Add specific serving logic for appetizers
//     }
// }

// // MainCourse subclass extending MenuItem
// class MainCourse extends MenuItem {
//     private String name;

//     public MainCourse(String name) {
//         this.name = name;
//     }

//     @Override
//     void prepare() {
//         System.out.println(name + " is being prepared as a main course...");
//         // Add specific preparation logic for main courses
//     }

//     @Override
//     void serve() {
//         System.out.println(name + " is served as a main course.");
//         // Add specific serving logic for main courses
//     }
// }

// // Beverage subclass extending MenuItem
// class Beverage extends MenuItem {
//     private String name;

//     public Beverage(String name) {
//         this.name = name;
//     }

//     @Override
//     void prepare() {
//         System.out.println(name + " is being prepared as a beverage...");
//         // Add specific preparation logic for beverages
//     }

//     @Override
//     void serve() {
//         System.out.println(name + " is served as a beverage.");
//         // Add specific serving logic for beverages
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Create instances of different menu items
//         MenuItem appetizer = new Appetizer("Garlic Bread");
//         MenuItem mainCourse = new MainCourse("Grilled Chicken");
//         MenuItem beverage = new Beverage("Cola");

//         // Order and prepare menu items
//         appetizer.prepare();
//         mainCourse.prepare();
//         beverage.prepare();

//         // Serve menu items
//         appetizer.serve();
//         mainCourse.serve();
//         beverage.serve();
//     }
// }


// // 18 
// // Interface MenuItem
// interface MenuItem {
//     void prepare();
//     void serve();
// }

// // Appetizer class implementing MenuItem interface
// class Appetizer implements MenuItem {
//     private String name;

//     public Appetizer(String name) {
//         this.name = name;
//     }

//     @Override
//     public void prepare() {
//         System.out.println(name + " is being prepared as an appetizer...");
//         // Add specific preparation logic for appetizers
//     }

//     @Override
//     public void serve() {
//         System.out.println(name + " is served as an appetizer.");
//         // Add specific serving logic for appetizers
//     }
// }

// // MainCourse class implementing MenuItem interface
// class MainCourse implements MenuItem {
//     private String name;

//     public MainCourse(String name) {
//         this.name = name;
//     }

//     @Override
//     public void prepare() {
//         System.out.println(name + " is being prepared as a main course...");
//         // Add specific preparation logic for main courses
//     }

//     @Override
//     public void serve() {
//         System.out.println(name + " is served as a main course.");
//         // Add specific serving logic for main courses
//     }
// }

// // Beverage class implementing MenuItem interface
// class Beverage implements MenuItem {
//     private String name;

//     public Beverage(String name) {
//         this.name = name;
//     }

//     @Override
//     public void prepare() {
//         System.out.println(name + " is being prepared as a beverage...");
//         // Add specific preparation logic for beverages
//     }

//     @Override
//     public void serve() {
//         System.out.println(name + " is served as a beverage.");
//         // Add specific serving logic for beverages
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Create instances of different menu items
//         MenuItem appetizer = new Appetizer("Garlic Bread");
//         MenuItem mainCourse = new MainCourse("Grilled Chicken");
//         MenuItem beverage = new Beverage("Cola");

//         // Order and prepare menu items
//         appetizer.prepare();
//         mainCourse.prepare();
//         beverage.prepare();

//         // Serve menu items
//         appetizer.serve();
//         mainCourse.serve();
//         beverage.serve();
//     }
// }


//19
// Interface Shape
interface Shape {
    void resize(double scaleFactor);
    void rotate(double angle);
}

// Circle class implementing Shape interface
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double scaleFactor) {
        radius *= scaleFactor;
    }

    @Override
    public void rotate(double angle) {
        System.out.println("Cannot rotate a circle.");
    }

    public double getRadius() {
        return radius;
    }
}

// Square class implementing Shape interface
class Square implements Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void resize(double scaleFactor) {
        sideLength *= scaleFactor;
    }

    @Override
    public void rotate(double angle) {
        System.out.println("Rotating a square by " + angle + " degrees.");
        // Add specific rotation logic for squares if needed
    }

    public double getSideLength() {
        return sideLength;
    }
}

// Triangle class implementing Shape interface
class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void resize(double scaleFactor) {
        base *= scaleFactor;
        height *= scaleFactor;
    }

    @Override
    public void rotate(double angle) {
        System.out.println("Rotating a triangle by " + angle + " degrees.");
        // Add specific rotation logic for triangles if needed
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of different shapes
        Shape circle = new Circle(5.0);
        Shape square = new Square(4.0);
        Shape triangle = new Triangle(3.0, 6.0);

        // Manipulate and transform shapes
        circle.resize(1.5);
        square.rotate(45.0);
        triangle.resize(0.8);

        // Print the updated properties of each shape
        System.out.println("Circle - Radius: " + ((Circle) circle).getRadius());
        System.out.println("Square - Side Length: " + ((Square) square).getSideLength());
        System.out.println("Triangle - Base: " + ((Triangle) triangle).getBase() + ", Height: " + ((Triangle) triangle).getHeight());
    }
}

// 19 abstract
// Abstract class Shape
abstract class Shape {
    abstract void resize(double scaleFactor);
    abstract void rotate(double angle);
}

// Circle class extending Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void resize(double scaleFactor) {
        radius *= scaleFactor;
    }

    @Override
    void rotate(double angle) {
        System.out.println("Cannot rotate a circle.");
    }

    public double getRadius() {
        return radius;
    }
}

// Square class extending Shape
class Square extends Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    void resize(double scaleFactor) {
        sideLength *= scaleFactor;
    }

    @Override
    void rotate(double angle) {
        System.out.println("Rotating a square by " + angle + " degrees.");
        // Add specific rotation logic for squares if needed
    }

    public double getSideLength() {
        return sideLength;
    }
}

// Triangle class extending Shape
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void resize(double scaleFactor) {
        base *= scaleFactor;
        height *= scaleFactor;
    }

    @Override
    void rotate(double angle) {
        System.out.println("Rotating a triangle by " + angle + " degrees.");
        // Add specific rotation logic for triangles if needed
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of different shapes
        Shape circle = new Circle(5.0);
        Shape square = new Square(4.0);
        Shape triangle = new Triangle(3.0, 6.0);

        // Manipulate and transform shapes
        circle.resize(1.5);
        square.rotate(45.0);
        triangle.resize(0.8);

        // Print the updated properties of each shape
        System.out.println("Circle - Radius: " + ((Circle) circle).getRadius());
        System.out.println("Square - Side Length: " + ((Square) square).getSideLength());
        System.out.println("Triangle - Base: " + ((Triangle) triangle).getBase() + ", Height: " + ((Triangle) triangle).getHeight());
    }
}
