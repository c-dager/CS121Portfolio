import java.util.Scanner;
import java.util.Random;
public class TestScores {
    //calls all other methods to have complete output
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();
        final int SIZE = rand.nextInt(6) + 4;
        int[] testScores = new int[SIZE];
        char[] letterGrades = new char[SIZE];
        System.out.println("Enter the " + SIZE + " test scores: ");
        for(int i = 0; i < SIZE; ++i){
            System.out.print("Enter test " + (i+1) + " score: ");
            testScores[i] = scnr.nextInt();
            //makes sure test is a score from 0 to 100
            while(testScores[i] < 0 || testScores[i] > 100){
                System.out.println("That is not a viable score, try again: ");
                testScores[i] = scnr.nextInt();
            }
        }
        for(int i = 0; i < SIZE; ++i){
            letterGrades[i] = getLetterGrad(testScores[i]);
        }
        printGrades(testScores, letterGrades);
        printHighestScore(testScores);
        printLowestScore(testScores);
        printAvgScore(testScores);
        scnr.close();
    }

    //gets score int and returns letter grade
    public static char getLetterGrad(int testScore) {
        if(testScore > 89){
            return 'A';
        }
        else if (testScore > 79) {
            return 'B';
        }
        else if (testScore > 69) {
            return 'C';
        }
        else if (testScore > 59){
            return 'D';
        }
        else{
            return 'F';
        }
    }

    //prints out columns of score and letter grade
    public static void printGrades(int[] scoresArray, char[] letters){
        System.out.println();
        System.out.println("Score\t\tGrade");
        for (int i = 0; i < scoresArray.length; ++i){
            System.out.println(scoresArray[i] + "\t\t\t" + letters[i]);
        }
    }

    //prints highest score int
    public static void printHighestScore(int[] testScores){
        int highestScore = testScores[0];
        for (int grade:testScores){
            if (grade > highestScore){
                highestScore = grade;
            }
        }
        System.out.println("The high score was: " + highestScore);
    }

    //prints lowest score int
    public static void printLowestScore(int[] testScores){
        int lowestScore = testScores[0];
        for (int grade:testScores){
            if (grade < lowestScore){
                lowestScore = grade;
            }
        }
        System.out.println("The low score was: " + lowestScore);
    }

    //prints avg score int
    public static void printAvgScore(int[] testScores){
        double totalScores = 0;
        double avgScore;
        for(int score: testScores){
            totalScores += score;
        }
        avgScore = totalScores / testScores.length;
        System.out.print("The average score was: " );
        System.out.printf("%.2f", avgScore);
    }
}
