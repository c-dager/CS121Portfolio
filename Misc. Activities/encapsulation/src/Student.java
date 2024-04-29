public class Student {
    private int id;
    private String name;
    private double gpa;
    private int grade;
    private String teacher;

    public Student(int id, String name, double gpa, int grade, String teacher){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.grade = grade;
        this.teacher = teacher;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public double getGpa() {
        return gpa;
    }

    public int getGrade() {
        return grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTeacher() {
        return teacher;
    }
}
