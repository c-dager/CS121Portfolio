import java.util.ArrayList;

public class StudentRecord {
    private ArrayList<Student> studentArrayList = new ArrayList<>();

    public void addStudent(Student student) {
        studentArrayList.add(student);
    }

    public void removeStudent(Student student) {
        studentArrayList.remove(student);
    }

    public Student getStudent(String name) {
        Student foundStudent = null;
        for (Student student: studentArrayList) {
            if (student.getName().equals(name)) {
                foundStudent = student;
                break;
            }
        }
        return foundStudent;
    }

    public StringBuilder getAllStudents() {
        StringBuilder studentStringBuilder = new StringBuilder();
        for (Student student: studentArrayList) {
            studentStringBuilder.append(student.toString());
        }
        return studentStringBuilder;
    }
}

