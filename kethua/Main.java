package kethua;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
                new FullTimeEmployee(1, "An", 10000000, 2000000),
                new Intern(2, "Bình", 5000000, "PTIT")
        };

        double totalSalary = 0;

        for (Employee employee : employees) {
            System.out.printf(
                    "%s: %,.0f đ%n",
                    employee.getName(),
                    employee.salary());

            totalSalary += employee.salary();
        }

        System.out.println("Tổng quỹ lương: " + totalSalary + " đ");
        ;
    }
}