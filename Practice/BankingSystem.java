// // 2
// import java.util.Scanner;
/*2.A banking system wants to calculate the interest earned in a savings account. 
Write a Java program that takes the principal amount, interest rate, and time as input and
 returns the interest earned.
i.Write a function named calculate Interest that takes the principal amount, 
interest rate, and time period as parameters and returns the interest earned.
ii.Display the calculated interest amount on the console. */


// public class BankingSystem {
//     // Function to calculate the interest earned
//     public static double calculateInterest(double principal, double interestRate, double time) {
//         // Formula for simple interest: Interest = (Principal * Rate * Time) / 100
//         double interest = (principal * interestRate * time) / 100;
//         return interest;
//     }    

//     public static void main(String[] args) {
//         // Read inputs from the user
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the principal amount: ");
//         double principal = scanner.nextDouble();

//         System.out.print("Enter the interest rate (as a decimal): ");
//         double interestRate = scanner.nextDouble();

//         System.out.print("Enter the time period (in years): ");
//         double time = scanner.nextDouble();

//         // Calculate the interest
//         double interest = calculateInterest(principal, interestRate, time);

//         // Display the calculated interest amount
//         System.out.println("Interest Earned: $" + interest);

//         scanner.close();
//     }
// }
// // output
// // Enter the principal amount: 1000
// // Enter the interest rate (as a decimal): 10
// // Enter the time period (in years): 1
// // Interest Earned: $100.0



// //9
/*
9.You are developing a simple banking system. There are two types of accounts: 
Savings Account and Current Account. The Savings Account class inherits from the Account class. 
The Account class has a method called get Account Info(), which displays the account details. 
The Savings Account class also has a method called calculate Interest (), which calculates and
 displays the interest based on the account balance. Implement the classes and demonstrate the inheritance.
 */
// class Account {
//     private String accountNumber;
//     private String accountHolderName;
//     protected double accountBalance;

//     public Account(String accountNumber, String accountHolderName, double accountBalance) {
//         this.accountNumber = accountNumber;
//         this.accountHolderName = accountHolderName;
//         this.accountBalance = accountBalance;
//     }

//     public void getAccountInfo() {
//         System.out.println("Account Number: " + accountNumber);
//         System.out.println("Account Holder Name: " + accountHolderName);
//         System.out.println("Account Balance: $" + accountBalance);
//     }
// }

// class SavingsAccount extends Account {
//     private double interestRate;

//     public SavingsAccount(String accountNumber, String accountHolderName, double accountBalance, double interestRate) {
//         super(accountNumber, accountHolderName, accountBalance);
//         this.interestRate = interestRate;
//     }

//     public void calculateInterest() {
//         double interestAmount = getAccountBalance() * (interestRate / 100);
//         System.out.println("Interest Amount: $" + interestAmount);
//     }

//     // Additional method to access account balance from the parent class
//     private double getAccountBalance() {
//         // Since the accountBalance field in the Account class is private, we need a getter to access it.
//         return super.accountBalance;
//     }
// }

// public class BankingSystem {
//     public static void main(String[] args) {
//         SavingsAccount savingsAccount = new SavingsAccount("SA001", "John Doe", 5000.0, 5.0);
//         savingsAccount.getAccountInfo();
//         savingsAccount.calculateInterest();
//     }
// }



class Account {
    String accountNumber;
    String accountHolderName;
    double accountBalance;

    void getAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Balance: $" + accountBalance);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    void calculateInterest() {
        double interestAmount = accountBalance * (interestRate / 100);
        System.out.println("Interest Amount: $" + interestAmount);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.accountNumber = "SA001";
        savingsAccount.accountHolderName = "John Doe";
        savingsAccount.accountBalance = 5000.0;
        savingsAccount.interestRate = 5.0;

        savingsAccount.getAccountInfo();
        savingsAccount.calculateInterest();
    }
}
// output
// Account Number: SA001
// Account Holder Name: John Doe
// Account Balance: $5000.0
// Interest Amount: $250.0


