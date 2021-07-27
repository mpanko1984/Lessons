import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            Employee employeeHourlyRate = new HourlyRateEmployee(new Program().input("Enter worker hours = "), new Program().input("Enter hour rate = "));
            System.out.println("Salary for a month to an employee " + employeeHourlyRate.getName() + " " + employeeHourlyRate.getSurname() + " with an hourly rate is " + employeeHourlyRate.doSalaryCalculation());
            System.out.println();
            Employee employeeFixedPrise = new FixedSalaryEmployee(new Program().input("Enter Salary = "));
            System.out.println("Salary for a month to an employee " + employeeFixedPrise.getName() + " " + employeeFixedPrise.getSurname() + " with a fixed rate is " + employeeFixedPrise.doSalaryCalculation());
            employees.add(employeeHourlyRate);
            employees.add(employeeFixedPrise);
        }
        System.out.println(employees);
    }

    private double input(String value) {
        Scanner scan = new Scanner(System.in);
        System.out.print(value);
        return scan.nextDouble();
    }
}


