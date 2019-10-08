package Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee a = new Employee(1, "Dan", "Jones", 50);
        System.out.println(a);
        System.out.println(a.getAnnualSalary());
        a.raiseSalary(100);
        System.out.println(a.getAnnualSalary());
        System.out.println(a.getName());
        System.out.println(a.getId());
        System.out.println(a.getSalary());
    }
}
