import java.util.Scanner;

public class Menu {
    Scanner scnr = new Scanner(System.in);
    StudentRecord studentRecord = new StudentRecord();

    public void displayMenu(){
        while(true){
            System.out.println("***** MENU *****");
            System.out.println("Please make a selection: ");
            System.out.println("1) Add student");
            System.out.println("2) Remove student");
            System.out.println("3) Display student info");
            System.out.println("4) Display all student info");
            System.out.println("5) Exit");
            int choice = scnr.nextInt();
            if(choice ==1){
                createStudent();
            }
            else if (choice ==2) {
                deleteStudent();
            }
            else if(choice == 3){
                displayStudent();
            }
            else if (choice ==4) {
                displayAllStudents();
            }
            else if(choice ==5){
                break;
            }
            else{
                System.out.println("Invalid entry");
            }
        }
    }

    private void createStudent(){
        System.out.println("Enter student name: ");
        String name = scnr.next();
        System.out.println("Enter age");
        int age = scnr.nextInt();
        Student student = new Student(name, age);
        System.out.println("Enter id: ");
        String id = scnr.next();
        studentRecord.addStudent(id, student);
        while(true){
            System.out.println("Enter course name, or q to quit");
            String courseName = scnr.next();
            if(courseName.equals("q")){
                break;
            }
            else{
                System.out.println("Enter class size: ");
                int size = scnr.nextInt();
                System.out.println("Enter meeting day");
                String day = scnr.next();
                Course course1 = new Course(courseName, size, day);
                student.addCourse(courseName, course1);
            }
        }
        System.out.println("Student has been added to student record");
    }
    private void deleteStudent(){
        System.out.println("Enter id of student to delete: ");
        String studentId = scnr.next();
        if(studentRecord.getStudent(studentId) != null){
            studentRecord.removeStudent(studentId);
            System.out.println("Student removed");
        }
        else{
            System.out.println("Student not found");
        }

    }
    private void displayStudent(){
        System.out.println("Enter id of student: ");
        String studentName = scnr.next();
        if(studentRecord.getStudent(studentName) == null){
            System.out.println("Student not found");
        }
        else{
            System.out.println(studentRecord.getStudent(studentName).toString());
        }
    }
    private void displayAllStudents(){
        StringBuilder allInfo = studentRecord.getAllStudentsInfo();
        System.out.println(allInfo);
    }
}
