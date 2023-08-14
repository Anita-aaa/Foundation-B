/*
28. You are building a payroll system for a company. The system has a class Employee with a method
 calculateSalary() to calculate the salary of an employee. Now, you need to create a derived class Manager
  that inherits from Employee and overrides the calculateSalary() method to include a bonus calculation 
  based on the performance. Implement the classes and demonstrate method overriding for calculating the 
  salary of a manager.
  */
class Employee {
    double basicSalary;

    // Constructor for Employee class
    Employee(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    // Method to calculate the salary of an employee
    double calculateSalary() {
        return basicSalary;
    }
}

class Manager extends Employee {
    double bonusPercentage;

    // Constructor for Manager class
    Manager(double basicSalary, double bonusPercentage) {
        super(basicSalary); // Call the constructor of the superclass (Employee)
        this.bonusPercentage = bonusPercentage;
    }

    // Method to override the calculateSalary method and include bonus calculation
    @Override
    double calculateSalary() {
        double bonus = basicSalary * (bonusPercentage / 100);
        return basicSalary + bonus;
    }
}

public class PayrollSystem {
    public static void main(String[] args) {
        // Create an object of the Manager class with a basic salary and bonus percentage
        Manager manager = new Manager(100, 5);

        // Call the calculateSalary method for the manager to calculate the salary including the bonus
        double managerSalary = manager.calculateSalary();

        // Display the calculated salary of the manager on the console
        System.out.println("Manager's Salary: $" + managerSalary);
    }
}
// output
// Manager's Salary: $105.0
