public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        //menu.displayMenu();
        Student student = new Student("Charlie", "7");
        Course course = new Course("Math", 3);
        student.addCourse(course);
        Course course1 = new Course("English", 2);
        student.addCourse(course1);
        Course course2 = new Course("CS", 3);
        student.addCourse(course2);
        System.out.println("Unsorted:\n" + student.getAllCourses());
        student.sortCourseList();
        System.out.println("Sorted:\n" + student.getAllCourses());
        student.removeCourse(course1);
        System.out.println("After deleting course:\n" + student.getAllCourses());
    }
}
