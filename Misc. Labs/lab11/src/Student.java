import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private int age;
    private Map<String, Course> courseMap = new HashMap<>();
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void addCourse(String name, Course course){
        courseMap.put(name, course);
    }
    public void removeCourse(String name){
        courseMap.remove(name);
    }

    public String getName(){
        return name;
    }
    public Course getCourse(String courseName){
        Course foundCourse = null;
        //enhanced for loop
        foundCourse = courseMap.get(courseName);
        return foundCourse;
    }

    public StringBuilder getAllCourseInfo(){
        StringBuilder allInfo = new StringBuilder();
        courseMap.forEach((name, course) -> {
            allInfo.append(course.toString());
        });
        return allInfo;
    }
    @Override
    public String toString(){
        return String.format("Name: %s | Age: %d\n",name,age);
    }

}
