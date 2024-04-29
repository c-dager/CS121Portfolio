public class Main {
    public static void main(String[] args) {
        DataStructure dataStructure = new DataStructure();

        dataStructure.addStudent("Charlie");
        dataStructure.addStudent("Bob");
        dataStructure.addStudent("Joe");
        dataStructure.printStudent();

        dataStructure.addAge(12, 0);
        dataStructure.addAge(15, 1);
        dataStructure.addAge(177, 2);
        dataStructure.printAge();

        dataStructure.addMajorGpa("CS", 4.2);
        dataStructure.addMajorGpa("Nursing", 2.7);
        dataStructure.addMajorGpa("Teaching", 4.1);
        dataStructure.printMajorGpa();

        dataStructure.addNationality("Japanese");
        dataStructure.addNationality("American");
        dataStructure.addNationality("Canadian");
        dataStructure.printNationality();

        dataStructure.addHometown("Indy");
        dataStructure.addHometown("Chicago");
        dataStructure.addHometown("Fort Wayne");
        dataStructure.printHometown();

        dataStructure.addHomeState("Indiana");
        dataStructure.addHomeState("Illinois");
        dataStructure.addHomeState("Indiana");
        dataStructure.printHomeStates();

        dataStructure.removeStudent("Charlie");
        dataStructure.removeAge(0);
        dataStructure.removeMajorGpa("CS");
        dataStructure.removeNationality("Japanese");
        dataStructure.removeHometown();
        dataStructure.removeHomeState();

        System.out.println();
        dataStructure.printStudent();
        dataStructure.printAge();
        dataStructure.printMajorGpa();
        dataStructure.printNationality();
        dataStructure.printHometown();
        dataStructure.printHomeStates();
    }
}
