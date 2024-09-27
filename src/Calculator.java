public class Calculator {
    public int addition(int a, int b) {
        return a + b;
    }
    public int subtration(int a, int b) {
        return a - b;

    }
    public int multiplication(int a, int b) {
        return a * b;

    }
    public double division(int a, int b, double[] remainder ) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not possible");
        }
        remainder[0] = a % b;
        return (double) a / b;




    }
}
