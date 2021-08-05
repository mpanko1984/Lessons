import java.util.Scanner;

public class FixedSalaryEmployee extends Employee {

    private double salary;

    public FixedSalaryEmployee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "salary=" + salary +" ";
    }

    @Override
    public double doSalaryCalculation() {
        FixedSalaryEmployee fixedSalaryEmployee = new FixedSalaryEmployee(salary);
        fixedSalaryEmployee.setSalary(input(this.salary));
        return salary;
    }

    public FixedSalaryEmployee (String name, String surname, int id) {
        super(name, surname, id);
    }
    public static double input (double value){
        Scanner scan = new Scanner(System.in);
        System.out.print(value);
        return scan.nextDouble();
    }

}

