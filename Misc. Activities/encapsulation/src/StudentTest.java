public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Joe", 3.6, 12, "Johnson");
        System.out.println("name: " +student1.getName());
        System.out.println("ID: " + student1.getId());
        System.out.println("GPA: " + student1.getGpa());
        System.out.println("Grade: " + student1.getGrade());
        System.out.println("Teacher: " + student1.getTeacher());

        student1.setName("Not joe");
        System.out.println("New name: " +student1.getName());

        student1.setId(2);
        System.out.println("new id: " +student1.getId());

        student1.setGpa(3.2);
        System.out.println("new gpa: " + student1.getGpa());

        student1.setGrade(13);
        System.out.println("new grade: " + student1.getGrade());

        student1.setTeacher("Ronald");
        System.out.println("new teacher: " + student1.getTeacher());
    }

}
