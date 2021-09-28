public class Program {

    public static void main(String[] args) {
        FixedSalaryEmployee fixedSalaryEmployee = new FixedSalaryEmployee();
        fixedSalaryEmployee.setFixedSalary(new int[]{1100, 1200, 2300, 4500, 9800, 5600, 2200, 9000, 9800, 7700});
        fixedSalaryEmployee.printFixedSalaryEmployeeList(10);
        HourlyRateEmployee hourlyRateEmployee = new HourlyRateEmployee();
        hourlyRateEmployee.setHourlyRate(new int[]{11, 12, 23, 45, 98, 56, 22, 90, 98, 77});
        hourlyRateEmployee.printHourlyRateEmployeeList(10);
    }
}
