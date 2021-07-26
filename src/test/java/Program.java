import java.util.Scanner;

public class Program {
    private Employee[] employees;

    public Employee employees () {
        String employeeName = new Program().inputText("input name - ");
        EmployeeFixedPrise e = new EmployeeFixedPrise();
        e.setName(employeeName);
        return e;
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
        /*Employee employeeHourlyRate = new EmployeeHourlyRate(new Program().input("Enter worker hours = "), new Program().input("Enter hour rate = "));
        System.out.println("Salary for a month to an employee with an hourly rate is " + employeeHourlyRate.salaryCalculation());
        Employee employeeFixedPrise = new EmployeeFixedPrise(new Program().input("Enter Salary = "));
        System.out.println("Salary for a month to an employee with a fixed rate is " + employeeFixedPrise.salaryCalculation());*/


         System.out.println(new Program().employees().getName());
         //System.out.println(new Program().employees.toString());
        }
    }


