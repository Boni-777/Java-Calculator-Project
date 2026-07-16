package calculator.operations;

public class Calculator {

  //Adds two numbers
     
    public double add(double num1, double num2) {
        return num1 + num2;
    }

     // Subtracts the second number from the first
     
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    
     // Multiplies two numbers
  
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

     // Divides two numbers
   // also have exception if denominator is zero
    
    public double divide(double num1, double num2) {

        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }

        return num1 / num2;
    }

     // Returns the remainder after division (performs Modulus)
    
    public double modulus(double num1, double num2) {

        if (num2 == 0) {
            throw new ArithmeticException("Cannot perform modulus by zero.");
        }

        return num1 % num2;
    }

 
      //Calculates power (base^exponent)
   
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    
    //Calculates square
    
    public double square(double number) {
        return number * number;
    }

   
     // Calculates square root
    
    public double squareRoot(double number) {

        if (number < 0) {
            throw new IllegalArgumentException(
                    "Square root of a negative number is undefined.");
        }

        return Math.sqrt(number);
    }

    /**
     * Calculates percentage
     * Example:
     * percentage(500,30)
     * returns 150
     */
    public double percentage(double value, double percent) {
        return (value * percent) / 100.0;
    }

    
     // Returns absolute value
  
    public double absolute(double number) {
        return Math.abs(number);
    }

}
