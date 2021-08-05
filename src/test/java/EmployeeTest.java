import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args){
        FixedSalaryEmployee fixedSalaryEmployee = new FixedSalaryEmployee("Mykola", "P",12);
        HourlyRateEmployee hourlyRateEmployee = new HourlyRateEmployee("Taras", "O", 2);
        List<Employee> employees = new ArrayList<>();
        employees.add(fixedSalaryEmployee);
        employees.add(hourlyRateEmployee);
        for (int i = 0; i<=employees.size(); i++) {
            fixedSalaryEmployee.doSalaryCalculation();
            hourlyRateEmployee.doSalaryCalculation();
        }
        System.out.println(employees);
    }
}
