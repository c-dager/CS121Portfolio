import java.util.HashMap;
import java.util.Map;

public class StudentRecord {
    private Map<String, Student> studentMap = new HashMap<>();


    public void addStudent(String id, Student student){
        studentMap.put(id, student);
    }

    public void removeStudent(String id){
        studentMap.remove(id);
    }


    public Map<String, Student> getStudentMap(){
        return studentMap;
    }
    public Student getStudent(String studentId){
        Student foundStudent = null;
        foundStudent = studentMap.get(studentId);
        return foundStudent;
    }

    public StringBuilder getAllStudentsInfo(){
        StringBuilder allInfo = new StringBuilder();
        studentMap.forEach((id, student) -> {
            allInfo.append(student.toString());
        });
        return allInfo;
    }
}
