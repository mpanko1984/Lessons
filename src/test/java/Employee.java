import java.util.Scanner;

public abstract class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private String surname;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Employee () {
        Scanner scan = new Scanner(System.in);
        System.out.println("input name - ");
        String name = scan.nextLine();
        System.out.println("input surname - ");
        scan = new Scanner(System.in);
        String surname = scan.nextLine();
        System.out.println("input id - ");
        scan = new Scanner(System.in);
        String id = scan.nextLine();
        this.setName(name);
        this.setSurname(surname);
        this.setId(id);
    }

    public abstract double doSalaryCalculation();
}

