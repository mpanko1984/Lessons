public class HourlyRateEmployee extends Employee {
    private double hourlyRate;

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    double getAverageMonthlySalary() {
        return 20.8 * 8 * hourlyRate;
    }
}
