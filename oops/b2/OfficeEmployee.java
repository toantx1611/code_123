package b2;

public class OfficeEmployee extends Employee {
    public OfficeEmployee(String name, int salary) {
        super(name, salary);
    }

    @Override
    public int calculateSalary() {
        return salary + 1000000;
    }
}