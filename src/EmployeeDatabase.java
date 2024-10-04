public class EmployeeDatabase  {
    private String[] employees = {"Alice", "Bob", "Charlie"};

    public String findEmployee(int id) throws EmployeeNotFoundException {
        if (id < 0 || id >= employees.length) {
            throw new EmployeeNotFoundException("Employee with ID " + id + " not found.");
        }
        return employees[id];
    }
}


