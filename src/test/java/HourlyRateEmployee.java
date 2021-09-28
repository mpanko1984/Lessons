import java.util.ArrayList;
import java.util.List;

public class HourlyRateEmployee extends Employee {

    public HourlyRateEmployee(String name, String surname, int id, double salary) {
        super(name, surname, id, salary);
    }

    public HourlyRateEmployee() {
    }

    public void setHourlyRate(int[] hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    private static String[] names = {"Mykola", "Petro", "Ivan", "Vasyl", "Nazar", "Olena", "Svitlana", "Ann", "Olya", "Nastya"};
    private static String[] surnames = {"Panko", "Petrov", "Ivanov", "Gak", "Bakh", "Hak", "Gol", "Sol", "Mykh", "Shmykh"};
    private static int[] ids = {2, 6, 9, 6, 7, 89, 0, 1, 2, 99, 0};
    private int[] hourlyRate = {1000, 900, 789, 456, 999, 345, 765, 876, 876, 888};

    @Override
    public double[] getAverageMonthlySalary(int i) {
        double[] avarageMonthlySalaries = new double[10];
        for (i = 0; i < 10; i++) {
            avarageMonthlySalaries[i] = 20.8 * 8 * hourlyRate[i];
        }
        return avarageMonthlySalaries;
    }

    public List printHourlyRateEmployeeList(int numberOfEmployee) {
        if (numberOfEmployee > names.length) {
            System.out.println("out of bounds");
        }
        List<Employee> list = new ArrayList();
        double[] avarageMonthlySalaries = getAverageMonthlySalary(numberOfEmployee);
        for (int i = 0; i < numberOfEmployee; i++) {
            HourlyRateEmployee hourlyRateEmployee = new HourlyRateEmployee(names[i], surnames[i], ids[i], avarageMonthlySalaries[i]);
            list.add(hourlyRateEmployee);
        }
        System.out.println(list);
        list.toString();
        return list;
    }

}


