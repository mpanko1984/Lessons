import java.util.Scanner;

public class Program {
    private Employee[] employees;

    public Employee employees () {
        String employeeName = new Program().inputText("input name - ");
        Employee e1 = new FixedSalaryEmployee();
        Employee e2 = new HourlyRateEmployee();
        e1.setName(employeeName);
        e2.setName(employeeName);
        return e1;
    }

    private double input(String value) {
        Scanner scan = new Scanner(System.in);
        System.out.print(value);
        double salary = scan.nextDouble();
        return salary;
    }

    private String inputText(String value) {
        Scanner scan = new Scanner(System.in);
        System.out.print(value);
        String text = scan.nextLine();
        return text;
    }

    public static void main(String[] args) {
        Employee employeeHourlyRate = new HourlyRateEmployee(new Program().input("Enter worker hours = "), new Program().input("Enter hour rate = "));
        System.out.format("Salary for a month to an employee with an hourly rate is " + employeeHourlyRate.doSalaryCalculation(),2);
        System.out.println();
        Employee employeeFixedPrise = new FixedSalaryEmployee(new Program().input("Enter Salary = "));
        System.out.format("Salary for a month to an employee with a fixed rate is " + employeeFixedPrise.doSalaryCalculation());
        System.out.println();
        System.out.println(new Program().employees().getName());
        }
    }


