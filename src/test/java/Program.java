import java.util.ArrayList;
import java.util.List;

public class Program {

    public void printFixedPriceEmployeeList(int numberOfEmployees) {
        List<String> list = new ArrayList<>();
        if (numberOfEmployees >= 10) {
            for (int i = 0; i <= numberOfEmployees - 1; i++) {
                list.add("employee" + i);
            }
            System.out.println(list);
        } else {
            System.out.println("List of employees less than 10");
        }
    }


    public static void main(String[] args) {
        FixedSalaryEmployee fixedSalaryEmployee = new FixedSalaryEmployee();
        HourlyRateEmployee hourlyRateEmployee = new HourlyRateEmployee();
        fixedSalaryEmployee.setFixedSalary(25);
        hourlyRateEmployee.setHourlyRate(22);
        System.out.println("Month salary for hourly rate employee =  " + hourlyRateEmployee.getAverageMonthlySalary());
        System.out.println("Month salary for fixed rate employee =  " + fixedSalaryEmployee.getAverageMonthlySalary());
        new Program().printFixedPriceEmployeeList(10);
    }
}
