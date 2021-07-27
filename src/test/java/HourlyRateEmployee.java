public class HourlyRateEmployee extends Employee {

    public double hours;
    public double hoursRate;

    public HourlyRateEmployee(double hours, double hoursRate) {
        this.hours = hours;
        this.hoursRate = hoursRate;
    }

    public HourlyRateEmployee() {

    }

    @Override
    public double doSalaryCalculation() {
        return hours * 20.8 * hoursRate;
    }
    @Override
    public String toString() {
        return this.getName()+" "+this.getSurname()+" "+this.doSalaryCalculation();
    }
}
