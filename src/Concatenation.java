import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the firstname: ");
        String first = sc.next();
        System.out.println("Enter the lastname: ");
        String last = sc.next();
        String fullName = first + " " + last;
        System.out.println("Full Name is " + fullName);
    }
}
