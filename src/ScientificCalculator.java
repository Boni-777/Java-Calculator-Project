public class ScientificCalculator extends Calculator {

    // Calculates the factorial of a non-negative integer
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

    //Calculates base-10 logarithm
    public double log10(double number) {

        if (number <= 0) {
            throw new IllegalArgumentException(
                    "Logarithm is only defined for positive numbers.");
        }

        return Math.log10(number);
    }

    //Calculates natural logarithm (ln)
     public double naturalLog(double number) {

        if (number <= 0) {
            throw new IllegalArgumentException(
                    "Natural logarithm is only defined for positive numbers.");
        }

        return Math.log(number);
    }

    //Calculates sine using degrees
    public double sin(double angle) {
        return Math.sin(Math.toRadians(angle));
    }

    //Calculates cosine using degrees
    public double cos(double angle) {
        return Math.cos(Math.toRadians(angle));
    }

    //Calculates tangent using degrees
    public double tan(double angle) {
        //Normalize andle to the range [0,180)
        double normalized = ((angle % 180) + 180) % 180;

        //Tangent is undefined at 90°, 270°, -90°, etc
        if (Math.abs(normalized - 90) < 1e-10) {
            throw new ArithmeticException(
                    "Tangent is undefined at " + angle + " degrees.");
        }

        return Math.tan(Math.toRadians(angle));
    }

}
