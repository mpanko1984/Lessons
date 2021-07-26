public class EmployeeFixedPrise extends Employee {

    public double salary;

    public EmployeeFixedPrise(double salary) {
        this.salary = salary;
    }
    public EmployeeFixedPrise() {
    }


    @Override
    public double salaryCalculation() {
        double fixedRate = salary;
        return fixedRate;
    }
}

