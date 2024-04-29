public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Joe", "12", 50, 4, .05);

        System.out.println(employee1.getName());
        employee1.setName("Not joe");
        System.out.println(employee1.getName());


    }
}
