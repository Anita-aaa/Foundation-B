// 21
package Inter;
// Employee interface
interface Employee {
    void work();
    double getSalary();
}

// Chef class implementing Employee interface
class Chef implements Employee {
    private double salary;

    public Chef(double salary) {
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println("Chef is cooking delicious meals.");
    }

    @Override
    public double getSalary() {
        return salary;
    }
}

// Waiter class implementing Employee interface
class Waiter implements Employee {
    private double salary;

    public Waiter(double salary) {
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println("Waiter is serving customers.");
    }

    @Override
    public double getSalary() {
        return salary;
    }
}

public class Main{//RestaurantManagementSystem {
    public static void main(String[] args) {
        // Create instances of Chef and Waiter
        Chef chef = new Chef(5000);
        Waiter waiter = new Waiter(3000);

        // Demonstrate work responsibilities and retrieve salaries
        chef.work();
        System.out.println("Chef's Salary: $" + chef.getSalary());

        waiter.work();
        System.out.println("Waiter's Salary: $" + waiter.getSalary());
    }
}
// output
// Chef is cooking delicious meals.
// Chef's Salary: $5000.0
// Waiter is serving customers.
// Waiter's Salary: $3000.0