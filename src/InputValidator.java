package calculator.utils;

import java.util.Scanner;

public class InputValidator {

    //Reads a valid menu choice.
    public int getValidMenuChoice(Scanner input) {

        while (!input.hasNextInt()) {
            System.out.println("Invalid input! Please enter a whole number.");
            System.out.print("Enter your choice: ");
            input.next(); // discard invalid input
        }

        return input.nextInt();
    }

    // Reads any valid decimal or whole number.
    public double getValidDouble(Scanner input, String message) {

        System.out.print(message);

        while (!input.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a valid number.");
            System.out.print(message);
            input.next(); // discard invalid input
        }

        return input.nextDouble();
    }
  
     // Reads a positive number (> 0).
     
    public double getValidPositiveDouble(Scanner input, String message) {

        double number;

        while (true) {

            number = getValidDouble(input, message);

            if (number > 0) {
                return number;
            }

            System.out.println("Number must be greater than zero.");
        }
    }

    //Reads a non-negative integer.
    
    public int getValidInteger(Scanner input, String message) {

        int number;

        while (true) {

            System.out.print(message);

            while (!input.hasNextInt()) {
                System.out.println("Invalid input! Please enter a whole number.");
                System.out.print(message);
                input.next();
            }

            number = input.nextInt();

            if (number >= 0) {
                return number;
            }

            System.out.println("Number cannot be negative.");
        }
    }

}
