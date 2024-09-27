import java.util.Scanner;

public class Registrationform {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.next();
        System.out.println("Enter your Age:");
        int age=sc.nextInt();
        System.out.println("Enter your country:");
        String country=sc.next();
        System.out.println("welcome" + name + "Your age is " + age + " and you are from" + country + ".");
    }
}
