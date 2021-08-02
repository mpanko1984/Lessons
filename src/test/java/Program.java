import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    List<Employee> employee = new ArrayList<>();

    public static Employee employee1 = new HourlyRateEmployee("Mykola", "P", 1);
    public static Employee employee2 = new FixedSalaryEmployee("Mark", "M", 2);
    public static Employee employee3 = new HourlyRateEmployee("Andrii", "K", 3);
    public static Employee employee4 = new FixedSalaryEmployee("Svitlana", "O", 4);

    public Program () {
        employee.add(employee1);
        employee.add(employee2);
        employee.add(employee3);
        employee.add(employee4);

    }


    public static HourlyRateEmployee getHourlyRateEmployee(String name, String surname, int id) {
        return new HourlyRateEmployee(name, surname, id);
    }

    public static Employee getFixedSalaryEmployee(String name, String surname, int id){

        return new FixedSalaryEmployee(name, surname, id);
    }

    public static void getSalary(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getId() + " "+ employee.toString()+ " " + employee.doSalaryCalculation());
        }
    }


    public static void doEverything() {
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 10 ; i+=2) {
            HourlyRateEmployee hourlyRateEmployee = new HourlyRateEmployee("Mykola", "P", i);
            hourlyRateEmployee.setHours(Math.random()*100);
            hourlyRateEmployee.setHoursRate(Math.random()*10);
            employees.add(hourlyRateEmployee);
            FixedSalaryEmployee fixedSalaryEmployee = new FixedSalaryEmployee("Mykola", "P", i+1);
            fixedSalaryEmployee.setSalary(Math.random()*5000);
            employees.add(fixedSalaryEmployee);
        }

        getSalary(employees);
    }


    public static void main(String[] args) {

        getSalary(new Program().employee);
    }


    /*public final void addEmployee() {

        employee.add(new HourlyRateEmployee("qwe", "qwe", 4));
        employee.add(new FixedSalaryEmployee("qwe1", "qwe2", 5));*/

           /* employee1.setName("aasd");
            employee1.setSurname("sdfds");
            employee1.setId(23);

        //System.out.println(employee1.toString() +", "+ employee2.toString());
    }

    public static List<Employee> getEmployees() {
        List<Employee> employee = new ArrayList<>();
        employee.add(new HourlyRateEmployee("qwe", "qwe", 4));
        employee.add(new FixedSalaryEmployee("qwe1", "qwe2", 5));
        return employee;
    }*/


   /* public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        HourlyRateEmployee employee11 = getHourlyRateEmployee("Mykola", "P", 1);
        employee11.setHours(input("Enter worker hours = "));
        employee11.setHoursRate(input("Enter hour rate = "));

        System.out.println("Salary for a month to an employee " + employee11 + " with an hourly rate is " + employee11.doSalaryCalculation() + "\n");


        Employee employee12 = getFixedSalaryEmployee("Mykola", "P", 2);
        ((FixedSalaryEmployee)employee12).setSalary(input("Enter Salary = "));
        System.out.println();
        System.out.println("Salary for a month to an employee " + employee12 + employee12.doSalaryCalculation() + "\n");


        System.out.println(employees);
        System.out.println();
    }

        public static double input (String value){
            Scanner scan = new Scanner(System.in);
            System.out.print(value);
            return scan.nextDouble();
        }*/
    }



