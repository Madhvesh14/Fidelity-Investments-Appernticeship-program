import java.util.Scanner;

public class SquareandCubeCalculator {
    static double Findsquare(double num) {
        return num * num;
    }

    static double Findcube(double num) {
        return num * num * num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();
        double square = Findsquare(num);
        double cube= Findcube(num);
        System.out.println("square of" + num + " is " + square);
        System.out.println("cube of" + num + " is " + cube);

    }
}
