//4
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        double celsiusTemperature = scanner.nextDouble();

        double fahrenheitTemperature = convertToFahrenheit(celsiusTemperature);

        System.out.println("Temperature in Fahrenheit: " + fahrenheitTemperature + " °F");

        scanner.close();
    }

    public static double convertToFahrenheit(double celsiusTemperature) {
        // Formula to convert Celsius to Fahrenheit: F = (C * 9/5) + 32
        double fahrenheitTemperature = (celsiusTemperature * 9 / 5) + 32;
        return fahrenheitTemperature;
    }
}
