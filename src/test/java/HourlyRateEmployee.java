public class HourlyRateEmployee extends Employee {

    private double hours;
    private double hoursRate;

    public HourlyRateEmployee(double hours, double hoursRate) {
        this.hours = hours;
        this.hoursRate = hoursRate;
    }

    @Override
    public double doSalaryCalculation() {
        return hours * 20.8 * hoursRate;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getSurname() + " " + this.doSalaryCalculation();
    }
}
