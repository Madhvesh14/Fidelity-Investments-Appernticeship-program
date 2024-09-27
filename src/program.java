import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("enter the operator (+,-,*,/):");
        char operator=sc.next().charAt(0);
        System.out.println("enter the first operand:");
        int num1=sc.nextInt();
        System.out.println("enter the second operand:");
        int num2=sc.nextInt();

        double[] remainder = new double[1];
        double result = 0;
        switch (operator) {
            case '+':
                result = calculator.addition(num1,num2);
                        System.out.println("result of " + num1 + "+" + num2 + " = " + result);
                break;
            case '-':
                result = calculator.subtration(num1,num2);
                        System.out.println("result of " + num1 + "-" + num2 + " = " + result);
                break;
            case '*':
                result = calculator.multiplication(num1,num2);
                        System.out.println("result of " + num1 + "*" + num2 + " = " + result);
                break;
            case '/':
                result = calculator.division(num1,num2,remainder);
                System.out.println("result of " + num1 + "/" + num2 + " = " + result + "with a remainder of " + remainder[0]);
                break;
            default:
                System.out.println("Invalid operator");
                break;



        }
    }
}
