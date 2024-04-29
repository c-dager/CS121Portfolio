public class Pet {
    private String type;
    private int age;

    private String name;

    public Pet(){
        this.type = "null";
        this.age = -1;
        this.name = "null";
    }

    public void setName(String newName){
        this.name = newName;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public int getAge(){
        return age;
    }


}
