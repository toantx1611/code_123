package b2;

public class Employee {
    protected String name;
    protected int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int calculateSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
