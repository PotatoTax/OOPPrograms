package SuperclassPerson42;

public class Tester {
    public static void main(String[] args) {
        Student student = new Student("Dave", "100 Street W", "Underwater Basket Weaving", 2016, 10000);
        System.out.println(student);
        student.setFee(20000);
        student.setProgram("Meat Testing");
        student.setYear(1976);
        System.out.println(student);

        Staff staff = new Staff("Jon", "359 West Street", "Marshland", 85000);
        System.out.println(staff);
        staff.setPay(60000);
        staff.setSchool("Oakland");
        staff.setAddress("100 South Lane");
        System.out.println(staff);
    }
}
