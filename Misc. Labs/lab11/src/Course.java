public class Course {
    private String name;
    private int classSize;
    private String dayOfMeeting;

    public Course(String name, int classSize, String dayOfMeeting){
        this.name = name;
        this.classSize = classSize;
        this.dayOfMeeting = dayOfMeeting;
    }

    public String getCourseName()
    {
        return name;
    }


    @Override
    public String toString(){
        return String.format("Course name: %s\nClass size: %d\nMeeting day: %s\n", name, classSize, dayOfMeeting);
    }
}
