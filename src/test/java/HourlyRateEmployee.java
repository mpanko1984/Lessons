public class HourlyRateEmployee extends Employee {

    private double hours;
    private double hoursRate;

    public HourlyRateEmployee(double hours, double hoursRate) {
        this.hours = hours;
        this.hoursRate = hoursRate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getHoursRate() {
        return hoursRate;
    }

    public void setHoursRate(double hoursRate) {
        this.hoursRate = hoursRate;
    }

    public HourlyRateEmployee(String name, String surname, int id) {
        super(name, surname, id);
    }

    @Override
    public String toString() {
        return super.toString() +
                "hours=" + hours +
                ", hoursRate=" + hoursRate + " ";
    }

    @Override
    public double doSalaryCalculation() {
        return hours * 20.8 * hoursRate;
    }

}
