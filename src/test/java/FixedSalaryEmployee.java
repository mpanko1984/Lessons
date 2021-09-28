import java.util.ArrayList;
import java.util.List;

public class FixedSalaryEmployee extends Employee {
    private static String[] names = {"Mykola", "Petro", "Ivan", "Vasyl", "Nazar", "Olena", "Svitlana", "Ann", "Olya", "Nastya"};
    private static String[] surnames = {"Panko", "Petrov", "Ivanov", "Gak", "Bakh", "Hak", "Gol", "Sol", "Mykh", "Shmykh"};
    private static int[] ids = {2, 6, 9, 6, 7, 89, 0, 1, 2, 99, 0};
    private int[] fixedSalary;// = {1000, 900, 789, 456, 999, 345, 765, 876, 876, 888};

    public void setFixedSalary(int[] fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public FixedSalaryEmployee(String name, String surname, int id, double salary) {
        super(name, surname, id, salary);
    }

    public FixedSalaryEmployee() {
    }

    @Override
    public double[] getAverageMonthlySalary(int i) {
        int[] averageMonthlySalary = new int[10];
        for (i = 0; i < 10; i++) {
            averageMonthlySalary[i] = fixedSalary[i];
        }
        return null;
    }

    public List printFixedSalaryEmployeeList(int numberOfEmployee) {
        if (numberOfEmployee > names.length) {
            System.out.println("out of bounds");
        }
        List<Employee> list = new ArrayList();
        for (int i = 0; i < numberOfEmployee; i++) {
            FixedSalaryEmployee fixedSalaryEmployee = new FixedSalaryEmployee(names[i], surnames[i], ids[i], fixedSalary[i]);
            list.add(fixedSalaryEmployee);
        }
        System.out.println(list);
        list.toString();
        return list;
    }
}
