import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Employee[] employees = new Employee[10];
        employees = EmployeeFabric.generateEmployees(10);
        Arrays.sort(employees, new ExperienceComparator());
        
    for (Employee employee: employees){
        System.out.println(employee.toString());
    }
}
}
