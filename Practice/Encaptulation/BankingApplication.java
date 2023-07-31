package Encaptulation;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;

    // Constructor for BankAccount class
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = initialBalance;
    }

    // Method to deposit funds into the account
    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposit of $" + amount + " successful. New balance: $" + accountBalance);
        } else {
            System.out.println("Invalid deposit amount. Please deposit a positive amount.");
        }
    }

    // Method to withdraw funds from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + accountBalance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to access the account balance
    public double getAccountBalance() {
        return accountBalance;
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        // Create a new bank account
        BankAccount account = new BankAccount("123456789", "John Doe", 1000.0);

        // Deposit funds
        account.deposit(500.0);

        // Withdraw funds
        account.withdraw(200.0);

        // Access account balance
        double balance = account.getAccountBalance();
        System.out.println("Current Account Balance: $" + balance);
    }
}
