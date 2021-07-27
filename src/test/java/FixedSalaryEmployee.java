public class FixedSalaryEmployee extends Employee {

    public double salary;

    public FixedSalaryEmployee(double salary) {
        this.salary = salary;
    }
    public FixedSalaryEmployee() {
    }

    @Override
    public double doSalaryCalculation() {
        double fixedRate = salary;
        return fixedRate;
    }
    @Override
    public String toString() {
        return this.getName()+" "+this.getSurname()+" "+this.doSalaryCalculation();
    }
}

