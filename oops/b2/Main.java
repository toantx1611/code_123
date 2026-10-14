package b2;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new OfficeEmployee("An", 10000000),
                new TechnicalEmployee("Binh", 10000000)
        };

        for (Employee emp : employees) {
            System.out.println(emp.getName() + " - Luong: " + emp.calculateSalary());
        }
    }
}