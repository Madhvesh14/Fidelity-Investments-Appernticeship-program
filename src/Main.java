import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeDatabase db = new EmployeeDatabase();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee ID to find: ");
        int employeeId = scanner.nextInt();

        try {
            String employeeName = db.findEmployee(employeeId);
            System.out.println("Employee found: " + employeeName);
        } catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
