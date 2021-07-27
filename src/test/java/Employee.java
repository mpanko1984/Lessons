import java.util.Scanner;

public abstract class Employee {
    private String name;
    private String surname;
    private int id;

    public Employee() {
        Scanner scan = new Scanner(System.in);
        System.out.println("input name - ");
        String name = scan.nextLine();
        System.out.println("input surname - ");
        scan = new Scanner(System.in);
        String surname = scan.nextLine();
        System.out.println("input id - ");
        scan = new Scanner(System.in);
        int id = scan.nextInt();
        this.setName(name);
        this.setSurname(surname);
        this.setId(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract double doSalaryCalculation();
}

