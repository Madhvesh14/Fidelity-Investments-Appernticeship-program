public class Employee {
    static int employeeId;
    static String name;
    static float basicSalary;
    static float bonus;
    static float netSalary;

    public static void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Basic Salary: " + basicSalary);
        System.out.println("Employee Bonus: " + bonus);
        System.out.println("Employee Net Salary: " + netSalary);

    }
}
class PermanentEmployee extends Employee {
    int pf;

    public void initialize(int id, String name, float salary, int pf) {
        this.employeeId = id;
        this.name = name;
        this.basicSalary = salary;
        this.pf = pf;
        calculateBonus();
        calculateNetSalary();
    }

    private void calculateBonus() {
        if (pf < 1000) {
            bonus = 0.1f * basicSalary;
        } else if (pf >= 1000 && pf < 1500) {
            bonus = 0.115f * basicSalary;
        } else if (pf >= 1500 && pf < 1800) {
            bonus = 0.125f * basicSalary;
        } else {
            bonus = 0.15f * basicSalary;
        }
    }

    private void calculateNetSalary() {
        netSalary = basicSalary - pf + bonus;
    }
}
class TemporaryEmployee extends Employee {
    int dailywages;
    int noOfdays;

    public void initialize(int id, String name, int dailyWages, int noOfDays) {
        this.employeeId = id;
        this.name = name;
        this.dailywages = dailyWages;
        this.noOfdays = noOfDays;
        calculateBonus();
        calculateNetSalary();

    }

    private void calculateBonus() {
        float dailyWages =  0;
        float noOfDays = 0;
        if (dailyWages < 1000) {
            bonus = 0.1f * (dailyWages * noOfDays);
        } else if (dailyWages >= 1000 && dailyWages < 1500) {
            bonus = 0.115f * (dailyWages * noOfDays);
        } else if (dailyWages >= 1500 && dailyWages < 1750) {
            bonus = 0.11f * (dailyWages * noOfDays);
        } else {
            bonus = 0.08f * (dailyWages * noOfDays);
        }
    }

    private void calculateNetSalary() {
        int dailyWages = 0;
        int noOfDays = 0;
        netSalary = (dailyWages * noOfDays) + bonus;

    }
}






