public class EmployeeHourlyRate extends Employee {

    public double hours;
    public double hoursRate;

    public EmployeeHourlyRate(double hours, double hoursRate) {
        this.hours = hours;
        this.hoursRate = hoursRate;
    }

    @Override
    public double salaryCalculation() {
        return hours * 20.8 * hoursRate;
    }
}
