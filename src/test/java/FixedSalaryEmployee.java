public class FixedSalaryEmployee extends Employee {

    private double salary;

    public FixedSalaryEmployee(double salary) {
        this.salary = salary;
    }

    @Override
    public double doSalaryCalculation() {
        return salary;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getSurname() + " " + this.doSalaryCalculation();
    }
}

