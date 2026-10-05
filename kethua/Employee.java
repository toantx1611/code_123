package kethua;

public class Employee {
    protected int id;
    protected String name;
    protected double baseSalary;

    public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double salary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }
}