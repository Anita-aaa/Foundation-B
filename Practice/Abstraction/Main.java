// 12. circle,rectangle,triangle
package Abstraction;
// // // 
// abstract class Shape {
//     // Abstract methods to calculate area and perimeter
//     public abstract double calculateArea();
//     public abstract double calculatePerimeter();
// }

// class Circle extends Shape {
//     double radius;

//     public Circle(double radius) {
//         this.radius = radius;
//     }

//     @Override
//     public double calculateArea() {
//         return Math.PI * radius * radius;
//     }

//     @Override
//     public double calculatePerimeter() {
//         return 2 * Math.PI * radius;
//     }
// }

// class Rectangle extends Shape {
//     double width;
//     double height;

//     public Rectangle(double width, double height) {
//         this.width = width;
//         this.height = height;
//     }

//     @Override
//     public double calculateArea() {
//         return width * height;
//     }

//     @Override
//     public double calculatePerimeter() {
//         return 2 * (width + height);
//     }
// }

// class Triangle extends Shape {
//     double side1;
//     double side2;
//     double side3;

//     public Triangle(double side1, double side2, double side3) {
//         this.side1 = side1;
//         this.side2 = side2;
//         this.side3 = side3;
//     }

//     @Override
//     public double calculateArea() {
//         // Using Heron's formula to calculate the area of the triangle
//         double s = (side1 + side2 + side3) / 2;
//         return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
//     }

//     @Override
//     public double calculatePerimeter() {
//         return side1 + side2 + side3;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Create instances of each shape
//         Circle circle = new Circle(5);
//         Rectangle rectangle = new Rectangle(4, 6);
//         Triangle triangle = new Triangle(3, 4, 5);

//         // Calculate and print the area and perimeter for each shape
//         System.out.println("Circle:");
//         System.out.println("Area: " + circle.calculateArea());
//         System.out.println("Perimeter: " + circle.calculatePerimeter());

//         System.out.println("\nRectangle:");
//         System.out.println("Area: " + rectangle.calculateArea());
//         System.out.println("Perimeter: " + rectangle.calculatePerimeter());

//         System.out.println("\nTriangle:");
//         System.out.println("Area: " + triangle.calculateArea());
//         System.out.println("Perimeter: " + triangle.calculatePerimeter());
//     }
// }
// // 12// output
// // Circle:
// // Area: 78.54
// // Perimeter: 31.42

// // Rectangle:
// // Area: 24.0
// // Perimeter: 20.0

// // Triangle:
// // Area: 6.0
// // Perimeter: 12.0







// // 13 cube ,cuboid ,cylinder
// // Abstract class Draw
// abstract class Draw {
//     abstract double calculateVolume();
//     abstract double calculateArea();
//     abstract double calculatePerimeter();
// }

// // Subclass Cube
// class Cube extends Draw {
//     private double side;

//     Cube(double side) {
//         this.side = side;
//     }

//     @Override
//     double calculateVolume() {
//         return Math.pow(side, 3);
//     }

//     @Override
//     double calculateArea() {
//         return 6 * Math.pow(side, 2);
//     }

//     @Override
//     double calculatePerimeter() {
//         return 12 * side;
//     }
// }

// // Subclass Cuboid
// class Cuboid extends Draw {
//     private double length;
//     private double width;
//     private double height;

//     Cuboid(double length, double width, double height) {
//         this.length = length;
//         this.width = width;
//         this.height = height;
//     }

//     @Override
//     double calculateVolume() {
//         return length * width * height;
//     }

//     @Override
//     double calculateArea() {
//         return 2 * ((length * width) + (width * height) + (height * length));
//     }

//     @Override
//     double calculatePerimeter() {
//         return 4 * (length + width + height);
//     }
// }

// // Subclass Cylinder
// class Cylinder extends Draw {
//     private double radius;
//     private double height;

//     Cylinder(double radius, double height) {
//         this.radius = radius;
//         this.height = height;
//     }

//     @Override
//     double calculateVolume() {
//         return Math.PI * Math.pow(radius, 2) * height;
//     }

//     @Override
//     double calculateArea() {
//         return 2 * Math.PI * radius * (radius + height);
//     }

//     @Override
//     double calculatePerimeter() {
//         return 2 * Math.PI * radius;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Cube
//         Cube cube = new Cube(4);
//         System.out.println("Cube - Volume: " + cube.calculateVolume());
//         System.out.println("Cube - Area: " + cube.calculateArea());
//         System.out.println("Cube - Perimeter: " + cube.calculatePerimeter());

//         // Cuboid
//         Cuboid cuboid = new Cuboid(4, 5, 6);
//         System.out.println("Cuboid - Volume: " + cuboid.calculateVolume());
//         System.out.println("Cuboid - Area: " + cuboid.calculateArea());
//         System.out.println("Cuboid - Perimeter: " + cuboid.calculatePerimeter());

//         // Cylinder
//         Cylinder cylinder = new Cylinder(3, 8);
//         System.out.println("Cylinder - Volume: " + cylinder.calculateVolume());
//         System.out.println("Cylinder - Area: " + cylinder.calculateArea());
//         System.out.println("Cylinder - Perimeter: " + cylinder.calculatePerimeter());
//     }
// }
// // Cube - Volume: 64.0
// // Cube - Area: 96.0
// // Cube - Perimeter: 48.0

// // Cuboid - Volume: 120.0
// // Cuboid - Area: 148.0
// // Cuboid - Perimeter: 80.0

// // Cylinder - Volume: 226.19
// // Cylinder - Area: 150.80
// // Cylinder - Perimeter: 18.85




// // 14 calculate intrest
// // Abstract class Account
// abstract class Account {
//     protected String accountNumber;
//     protected String accountHolder;
//     protected double balance;

//     public Account(String accountNumber, String accountHolder, double balance) {
//         this.accountNumber = accountNumber;
//         this.accountHolder = accountHolder;
//         this.balance = balance;
//     }

//     abstract double calculateInterest();
//     abstract void displayAccountDetails();
// }

// // Subclass Savings Account
// class SavingsAccount extends Account {
//     private double interestRate;

//     public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
//         super(accountNumber, accountHolder, balance);
//         this.interestRate = interestRate;
//     }

//     @Override
//     double calculateInterest() {
//         return balance * interestRate / 100;
//     }

//     @Override
//     void displayAccountDetails() {
//         System.out.println("Savings Account Details:");
//         System.out.println("Account Number: " + accountNumber);
//         System.out.println("Account Holder: " + accountHolder);
//         System.out.println("Balance: $" + balance);
//         System.out.println("Interest Rate: " + interestRate + "%");
//         System.out.println("Interest Earned: $" + calculateInterest());
//     }
// }

// // Subclass Loan Account
// class LoanAccount extends Account {
//     private double interestRate;

//     public LoanAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
//         super(accountNumber, accountHolder, balance);
//         this.interestRate = interestRate;
//     }

//     @Override
//     double calculateInterest() {
//         return balance * interestRate / 100;
//     }

//     @Override
//     void displayAccountDetails() {
//         System.out.println("Loan Account Details:");
//         System.out.println("Account Number: " + accountNumber);
//         System.out.println("Account Holder: " + accountHolder);
//         System.out.println("Balance: $" + balance);
//         System.out.println("Interest Rate: " + interestRate + "%");
//         System.out.println("Interest Accrued: $" + calculateInterest());
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Savings Account
//         SavingsAccount savingsAccount = new SavingsAccount("SA001", "John Doe", 5000, 2.5);
//         savingsAccount.displayAccountDetails();

//         // Loan Account
//         LoanAccount loanAccount = new LoanAccount("LA001", "Jane Smith", 10000, 8.0);
//         loanAccount.displayAccountDetails();
//     }
// }
// // output
// // Savings Account Details:
// // Account Number: SA001
// // Account Holder: John Doe
// // Balance: $5000.0
// // Interest Rate: 2.5%
// // Interest Earned: $125.0
// // Loan Account Details:
// // Account Number: LA001
// // Account Holder: Jane Smith
// // Balance: $10000.0
// // Interest Rate: 8.0%
// // Interest Accrued: $800.0
