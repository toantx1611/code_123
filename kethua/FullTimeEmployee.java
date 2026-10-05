package kethua;

public class FullTimeEmployee extends Employee {
    private double allowance;

    public FullTimeEmployee(int id, String name, double baseSalary, double allowance) {
        super(id, name, baseSalary);
        this.allowance = allowance;
    }

    @Override
    public double salary() {
        return baseSalary + allowance;
    }
}