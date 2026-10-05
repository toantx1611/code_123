package kethua;

public class Intern extends Employee {
    private String school;

    public Intern(int id, String name, double baseSalary, String school) {
        super(id, name, baseSalary);
        this.school = school;
    }

    @Override
    public double salary() {
        return baseSalary * 0.7;
    }
}