import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numStudents;
        System.out.println("Enter number of students: ");
        numStudents = scnr.nextInt();
        int numTests;
        System.out.println("Enter number of tests per student:");
        numTests = scnr.nextInt();
        for(int i = 1; i <= numStudents; i++){
            float totalScore = 0;
            System.out.println("Student number " + i);
            System.out.println("------------------");
            for(int j = 1; j <= numTests; j++){
                System.out.println("Enter score " + j + ":");
                int score = scnr.nextInt();
                totalScore += score;
            }
            System.out.print("The Average for student " + i + " is ");
            System.out.printf("%.2f", totalScore/numTests);
            System.out.println();
            System.out.println();
        }


    }
}
