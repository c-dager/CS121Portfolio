import java.util.Scanner;

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Type in score of test 1: ");
        int test1 = scnr.nextInt();
        System.out.println("Type in score of test 2: ");
        int test2 = scnr.nextInt();
        System.out.println("Type in score of test 3: ");
        int test3 = scnr.nextInt();

        double avgScore = ((double)test1 + test2 + test3) / 3;
        char avgLetter;

        if (avgScore >= 90){
            avgLetter = 'A';
        }
        else if (avgScore >= 80){
            avgLetter = 'B';
        }
        else if (avgScore >= 70){
            avgLetter = 'C';
        }
        else if (avgScore >=60){
            avgLetter = 'D';
        }
        else{
            avgLetter = 'F';
        }

        System.out.println("Avg score: " + avgScore);
        System.out.println("Avg letter grade: " + avgLetter);
    }
}
