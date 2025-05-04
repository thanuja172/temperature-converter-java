# temperature-converter-java

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.print("Enter the temperature value: ");
        double temp = scanner.nextDouble();

        System.out.print("Is the temperature in Celsius or Fahrenheit? (C/F): ");
        char unit = scanner.next().toUpperCase().charAt(0);

        if (unit == 'C') {
            double fahrenheit = (temp * 9 / 5) + 32;
            System.out.printf("%.2f°C is %.2f°F\n", temp, fahrenheit);
        } else if (unit == 'F') {
            double celsius = (temp - 32) * 5 / 9;
            System.out.printf("%.2f°F is %.2f°C\n", temp, celsius);
        } else {
            System.out.println("Invalid unit. Please enter 'C' or 'F'.");
        }

        scanner.close();
    }
}
