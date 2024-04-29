import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] testScores = new int[3];
        String[] nflTeams = new String[3];
        boolean[] trueOrFalse = new boolean[3];

        for(int i = 0; i < 3; i++){
            System.out.println("Enter a score: ");
            testScores[i] = scnr.nextInt();
            System.out.println("Enter an nfl mascot: ");
            nflTeams[i] = scnr.next();
            System.out.println("Enter true or false");
            trueOrFalse[i] = scnr.nextBoolean();
        }
        System.out.println("Test scores: ");
        for(int score : testScores){
            System.out.println(score);
        }
        System.out.println("NFL team names: ");
        for(String teamName : nflTeams){
            System.out.println(teamName);
        }
        System.out.println("List of boolean values: ");
        for(boolean x : trueOrFalse){
            System.out.println(x);
        }
    }
}
