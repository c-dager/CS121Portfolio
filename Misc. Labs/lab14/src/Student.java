import java.util.LinkedList;

public class Student {
    private String name;
    private String id;
    private LinkedList<Course> courseLinkedList = new LinkedList<>();

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // methods
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\n" +
                        "ID: %s\n\n",
                name, id);
    }

    public void addCourse(Course course) {
        courseLinkedList.add(course);
    }

    public void removeCourse(Course course) {
        courseLinkedList.remove(course);
    }

    public Course getCourse(String courseName) {
        Course foundCourse = null;
        for (Course course: courseLinkedList) {
            if (course.getCourseName().equals(courseName)) {
                foundCourse = course;
                break;
            }
        }
        return foundCourse;
    }

    public StringBuilder getAllCourses() {
        StringBuilder courseStringBuilder = new StringBuilder();
        for (Course course: courseLinkedList) {
            courseStringBuilder.append(course.toString() + "\n");
        }
        return courseStringBuilder;
    }

    public void sortCourseList(){
        Course temp;
        for(int i = 0; i < courseLinkedList.size() -1; ++i){
            int minIndex = i;
            for(int j = i+1; j < courseLinkedList.size(); ++j){
                if(courseLinkedList.get(j).getCourseName().compareTo(courseLinkedList.get(minIndex).getCourseName()) < 0){
                    temp = courseLinkedList.get(j);
                    courseLinkedList.set(j, courseLinkedList.get(j-1));
                    courseLinkedList.set(j-1, temp);
                }
            }
        }
    }
}
