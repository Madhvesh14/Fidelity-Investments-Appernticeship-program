import java.util.Scanner;

public class PayrollManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 for permanent employeeor 2 for temporary employee");
        int choice = sc.nextInt();


        if (choice == 1) {
            System.out.println("Enter employee ID");
            int id = sc.nextInt();
            System.out.println("Enter employee name");
            String name = sc.nextLine();
            System.out.println("Enter the basic salary:");
            float salary = sc.nextFloat();
            System.out.println("Enter Pf");

            PermanentEmployee.displayDetails();

        }else if (choice == 2) {
            System.out.println("Enter employee ID");
            int id = sc.nextInt();

            System.out.println("Enter employee name");
            String name = sc.nextLine();
            System.out.println("Enter daily wages:");
            int dailyWages = sc.nextInt();

            System.out.println("Enter the number of days worked ");
            int noOfDays = sc.nextInt();

            TemporaryEmployee temporaryEmployee = new TemporaryEmployee();
            temporaryEmployee.initialize(id, name, dailyWages, noOfDays);

        }else {
            System.out.println("Invalid choice");
        }
        }

    }
1

