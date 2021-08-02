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
                "salary=" + salary +
                '}';
    }

    @Override
    public double doSalaryCalculation() {
        return salary;
    }

    public FixedSalaryEmployee (String name, String surname, int id) {
        super(name, surname, id);
    }

}

