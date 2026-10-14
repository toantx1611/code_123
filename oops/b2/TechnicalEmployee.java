package b2;

public class TechnicalEmployee extends Employee {
    public TechnicalEmployee(String name, int salary) {
        super(name, salary);
    }

    @Override
    public int calculateSalary() {
        return salary + 2000000;
    }
}