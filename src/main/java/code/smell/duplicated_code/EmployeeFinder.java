package code.smell.duplicated_code;


import java.util.ArrayList;
import java.util.List;

public class EmployeeFinder {

    public static final String ENGINEER = "ENGINEER";
    public static final String ADMINISTRATOR = "ADMINISTRATOR";
    private List<Employee> employees;

    public EmployeeFinder(List<Employee> employees) {
        this.employees = employees;
    }

    List<String> findEngineerNames() {
        return findEngineerNamesByType(ENGINEER);
    }


    List<String> findAdministratorNames() {
        return findEngineerNamesByType(ADMINISTRATOR);
    }

    private List<String> findEngineerNamesByType(String engineer) {
        List<String> results = new ArrayList<>();
        for (Employee employee : employees) {
            if (engineer.equalsIgnoreCase(employee.getType())) {
                results.add(employee.getName());
            }
        }

        return results;
    }

}
