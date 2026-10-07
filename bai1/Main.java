package bai1;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[4];

        employees[0] = new OfficeEmployee("An", 20, 25);
        employees[1] = new TechnicalEmployee("Binh", 22, 160, 50);
        employees[2] = new OfficeEmployee("Cuong", 21, 26);
        employees[3] = new TechnicalEmployee("Dung", 23, 180, 60);

        for (Employee e : employees) {
            System.out.println(
                e.name + " - Luong: " + e.calculateSalary()
            );
        }
    }
}
