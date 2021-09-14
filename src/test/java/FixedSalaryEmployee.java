public class FixedSalaryEmployee extends Employee {
    private double fixedSalary;

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    double getAverageMonthlySalary() {
        return fixedSalary;
    }
}
