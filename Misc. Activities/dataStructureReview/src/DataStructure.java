import java.util.*;
public class DataStructure {
    private ArrayList<String> studentList = new ArrayList<>();
    private int[] ageList = new int[3];
    private HashMap<String, Double> majorGpaMap = new HashMap<>();
    private LinkedList<String> nationalityList = new LinkedList<>();
    private Stack<String> hometownStack = new Stack<>();
    private Queue<String> homeStateQueue = new LinkedList<>();

    public void addStudent(String name){
        studentList.add(name);
    }
    public void removeStudent(String name){
        studentList.remove(name);
    }
    public void printStudent(){
        for(String student : studentList){
            System.out.print(student + " ");
        }
        System.out.println();
    }

    public void addAge(int age, int slot){
        ageList[slot] = age;
    }
    public void removeAge(int slot){
       ageList[slot] = -1;
       // System.arraycopy(ageList, slot +1, ageList, slot, ageList.length-slot-1);
    }

    public void printAge(){
        for(int i = 0; i < ageList.length; ++i){
            System.out.print(ageList[i] + " ");
        }
        System.out.println();
    }
    public void addMajorGpa(String major, Double gpa){
        majorGpaMap.put(major, gpa);
    }
    public void removeMajorGpa(String major){
        majorGpaMap.remove(major);
    }

    public void printMajorGpa(){
        majorGpaMap.forEach((key, value) -> {
                System.out.printf("Major: %s - GPA: %f\n", key, value);
        });
    }
    public void addNationality(String nation){
        nationalityList.add(nation);
    }
    public void removeNationality(String nation){
        nationalityList.remove(nation);
    }

    public void printNationality(){
        for(String nation : nationalityList){
            System.out.print(nation + " ");
        }
        System.out.println();
    }
    public void addHometown(String hometown){
        hometownStack.add(hometown);
    }
    public void removeHometown(){
        hometownStack.pop();
    }

    public void printHometown(){
        String values = Arrays.toString(hometownStack.toArray());
        System.out.println(values);
    }
    public void addHomeState(String state){
        homeStateQueue.add(state);
    }
    public void removeHomeState(){
        homeStateQueue.remove();
    }

    public void printHomeStates(){
        for(String s: homeStateQueue){
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
