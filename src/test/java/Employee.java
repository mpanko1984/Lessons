

public abstract class Employee {
    private String name;
    private String surname;
    private int id;
    public double salary;

    public Employee() {
    }

    ;

    public Employee(String name, String surname, int id, double salary) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.salary = salary;
    }

    public abstract double[] getAverageMonthlySalary(int i);

    @Override
    public String toString() {
        return name + " " + surname + " " + id + " " + salary;
    }
}
