// // 12
package Abstraction;
// // 


// import java.lang.Math;

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




// 14
// Abstract class Account
abstract class Account {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;

    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    abstract double calculateInterest();
    abstract void displayAccountDetails();
}

// Subclass Savings Account
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    double calculateInterest() {
        return balance * interestRate / 100;
    }

    @Override
    void displayAccountDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest Earned: $" + calculateInterest());
    }
}

// Subclass Loan Account
class LoanAccount extends Account {
    private double interestRate;

    public LoanAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    double calculateInterest() {
        return balance * interestRate / 100;
    }

    @Override
    void displayAccountDetails() {
        System.out.println("Loan Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest Accrued: $" + calculateInterest());
    }
}

public class Main {
    public static void main(String[] args) {
        // Savings Account
        SavingsAccount savingsAccount = new SavingsAccount("SA001", "John Doe", 5000, 2.5);
        savingsAccount.displayAccountDetails();

        // Loan Account
        LoanAccount loanAccount = new LoanAccount("LA001", "Jane Smith", 10000, 8.0);
        loanAccount.displayAccountDetails();
    }
}


