package calculator.operations;

//ScientificCalculator.java
// extends Calculator and provides scientific operations and inherits all basic operations from Calculator.

public class ScientificCalculator extends Calculator {

    /*
      Calculates the factorial of a non-negative integer
     parameter: number integer >= 0
     returns factorial value
     */
    public long factorial(int number) {

        if (number < 0) {
            throw new IllegalArgumentException(
                    "Factorial is only defined for non-negative integers.");
        }

        long result = 1;

        for (int i = 2; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    /*
      Calculates base-10 logarithm.
      parameter numbers: positive number
      returns log10(number)
     */
    public double log10(double number) {

        if (number <= 0) {
            throw new IllegalArgumentException(
                    "Logarithm is only defined for positive numbers.");
        }

        return Math.log10(number);
    }

    /*
     Calculates natural logarithm (ln)
     parameter number: positive number
     returns natural logarithm
     */
    public double naturalLog(double number) {

        if (number <= 0) {
            throw new IllegalArgumentException(
                    "Natural logarithm is only defined for positive numbers.");
        }

        return Math.log(number);
    }

    /*
     Calculates sine
     Input is in degrees
     */
    public double sin(double angle) {
        return Math.sin(Math.toRadians(angle));
    }

    /*
      Calculates cosine
      Input is in degrees
     */
    public double cos(double angle) {
        return Math.cos(Math.toRadians(angle));
    }

    /*
      Calculates tangent
      Input is in degrees
     */
    public double tan(double angle) {

        /*
         Prevent undefined values such as:
          tan(90)
          tan(270)
          tan(450)
         */

        double normalized = angle % 180;

        if (Math.abs(normalized - 90) < 1e-10) {
            throw new ArithmeticException(
                    "Tangent is undefined at " + angle + " degrees.");
        }

        return Math.tan(Math.toRadians(angle));
    }

}
