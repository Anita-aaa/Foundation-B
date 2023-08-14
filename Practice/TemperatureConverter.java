// //4
// C TO F
import java.util.Scanner;

public class TemperatureConverter {
    private double celsius;

    public TemperatureConverter(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double convertToFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsiusInput = scanner.nextDouble();

        TemperatureConverter converter = new TemperatureConverter(celsiusInput);

        System.out.println("Temperature in Celsius: " + converter.getCelsius());
        System.out.println("Temperature in Fahrenheit: " + converter.convertToFahrenheit());

        scanner.close();
    }
}
// output
// Enter temperature in Celsius: 0
// Temperature in Celsius: 0.0
// Temperature in Fahrenheit: 32.0


// F TO C
// import java.util.Scanner;

// public class TemperatureConverter {
//     private double fahrenheit;

//     public TemperatureConverter(double fahrenheit) {
//         this.fahrenheit = fahrenheit;
//     }

//     public double getFahrenheit() {
//         return fahrenheit;
//     }

//     public void setFahrenheit(double fahrenheit) {
//         this.fahrenheit = fahrenheit;
//     }

//     public double convertToCelsius() {
//         return (fahrenheit - 32) * 5 / 9;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter temperature in Fahrenheit: ");
//         double fahrenheitInput = scanner.nextDouble();

//         TemperatureConverter converter = new TemperatureConverter(fahrenheitInput);

//         System.out.println("Temperature in Fahrenheit: " + converter.getFahrenheit());
//         System.out.println("Temperature in Celsius: " + converter.convertToCelsius());

//         scanner.close();
//     }
// }
// // output
// // Enter temperature in Fahrenheit: 32
// // Temperature in Fahrenheit: 32.0
// // Temperature in Celsius: 0.0