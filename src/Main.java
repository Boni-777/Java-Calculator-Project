import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Objects
        ScientificCalculator calc = new ScientificCalculator();
        HistoryManager history = new HistoryManager();
        InputValidator validator = new InputValidator();

        int choice;

        System.out.println("========================================");
        System.out.println("     ADVANCED JAVA CALCULATOR");
        System.out.println("========================================");

        do {

            System.out.println("\n====== MENU ======");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Square");
            System.out.println("8. Square Root");
            System.out.println("9. Factorial");
            System.out.println("10. Percentage");
            System.out.println("11. Absolute Value");
            System.out.println("12. Log Base 10");
            System.out.println("13. Natural Log (ln)");
            System.out.println("14. Sine");
            System.out.println("15. Cosine");
            System.out.println("16. Tangent");
            System.out.println("17. View History");
            System.out.println("18. Clear History");
            System.out.println("19. Exit");

            System.out.print("\nEnter your choice: ");

            choice = validator.getValidMenuChoice(input);

            double num1;
            double num2;
            double result;
            String record;

            switch (choice) {

                case 1:

                    num1 = validator.getValidDouble(input, "Enter first number: ");
                    num2 = validator.getValidDouble(input, "Enter second number: ");

                    result = calc.add(num1, num2);

                    System.out.println("Result = " + result);

                    record = num1 + " + " + num2 + " = " + result;
                    history.saveHistory(record);

                    break;

                case 2:

                    num1 = validator.getValidDouble(input, "Enter first number: ");
                    num2 = validator.getValidDouble(input, "Enter second number: ");

                    result = calc.subtract(num1, num2);

                    System.out.println("Result = " + result);

                    history.saveHistory(num1 + " - " + num2 + " = " + result);

                    break;

                case 3:

                    num1 = validator.getValidDouble(input, "Enter first number: ");
                    num2 = validator.getValidDouble(input, "Enter second number: ");

                    result = calc.multiply(num1, num2);

                    System.out.println("Result = " + result);

                    history.saveHistory(num1 + " × " + num2 + " = " + result);

                    break;

                case 4:

                    num1 = validator.getValidDouble(input, "Enter numerator: ");
                    num2 = validator.getValidDouble(input, "Enter denominator: ");

                    result = calc.divide(num1, num2);

                    System.out.println("Result = " + result);

                    history.saveHistory(num1 + " ÷ " + num2 + " = " + result);

                    break;

                case 5:

                    num1 = validator.getValidDouble(input, "Enter first number: ");
                    num2 = validator.getValidDouble(input, "Enter second number: ");

                    result = calc.modulus(num1, num2);

                    System.out.println("Result = " + result);

                    history.saveHistory(num1 + " % " + num2 + " = " + result);

                    break;

                case 6:

                    num1 = validator.getValidDouble(input, "Enter base: ");
                    num2 = validator.getValidDouble(input, "Enter exponent: ");

                    result = calc.power(num1, num2);

                    System.out.println("Result = " + result);

                    history.saveHistory(num1 + "^" + num2 + " = " + result);

                    break;

                case 7:

                    num1 = validator.getValidDouble(input, "Enter number: ");

                    result = calc.square(num1);

                    System.out.println("Result = " + result);

                    history.saveHistory("Square(" + num1 + ") = " + result);

                    break;

                case 8:

                    num1 = validator.getValidDouble(input, "Enter number: ");

                    result = calc.squareRoot(num1);

                    System.out.println("Result = " + result);

                    history.saveHistory("√" + num1 + " = " + result);

                    break;

                case 9:

                    int fact = validator.getValidInteger(input, "Enter a non-negative integer: ");

                    long factorial = calc.factorial(fact);

                    System.out.println("Result = " + factorial);

                    history.saveHistory(fact + "! = " + factorial);

                    break;

                case 10:

                    num1 = validator.getValidDouble(input, "Enter value: ");
                    num2 = validator.getValidDouble(input, "Enter percentage: ");

                    result = calc.percentage(num1, num2);

                    System.out.println("Result = " + result);

                    history.saveHistory(num2 + "% of " + num1 + " = " + result);

                    break;

                case 11:

                    num1 = validator.getValidDouble(input, "Enter number: ");

                    result = calc.absolute(num1);

                    System.out.println("Result = " + result);

                    history.saveHistory("|" + num1 + "| = " + result);

                    break;

                case 12:

                    num1 = validator.getValidPositiveDouble(input, "Enter positive number: ");

                    result = calc.log10(num1);

                    System.out.println("Result = " + result);

                    history.saveHistory("log(" + num1 + ") = " + result);

                    break;

                case 13:

                    num1 = validator.getValidPositiveDouble(input, "Enter positive number: ");

                    result = calc.naturalLog(num1);

                    System.out.println("Result = " + result);

                    history.saveHistory("ln(" + num1 + ") = " + result);

                    break;

                case 14:

                    num1 = validator.getValidDouble(input, "Enter angle (degrees): ");

                    result = calc.sin(num1);

                    System.out.println("Result = " + result);

                    history.saveHistory("sin(" + num1 + ") = " + result);

                    break;

                case 15:

                    num1 = validator.getValidDouble(input, "Enter angle (degrees): ");

                    result = calc.cos(num1);

                    System.out.println("Result = " + result);

                    history.saveHistory("cos(" + num1 + ") = " + result);

                    break;

                case 16:

                    num1 = validator.getValidDouble(input, "Enter angle (degrees): ");

                    result = calc.tan(num1);

                    System.out.println("Result = " + result);

                    history.saveHistory("tan(" + num1 + ") = " + result);

                    break;

                case 17:

                    history.showHistory();

                    break;

                case 18:

                    history.clearHistory();

                    break;

                case 19:

                    System.out.println("\nThank you for using this Calculator.");

                    break;

                default:

                    System.out.println("Invalid choice.");
            }
        } catch (ArithmeticException | IllegalArgumentException e) {

                System.out.println("\nError: " + e.getMessage());
        }
    } while (choice != 19);

    input.close();
  }
}
