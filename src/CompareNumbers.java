import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        x = sc.nextInt();
        System.out.println("Enter the second number");
        y = sc.nextInt();
        boolean result = x<y;
        System.out.println("The result of weather first number id less than second number is" + result);

    }
}
