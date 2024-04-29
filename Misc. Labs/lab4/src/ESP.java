import java.util.Random;
import java.util.Scanner;

public class ESP {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scnr = new Scanner(System.in);
        int correctChoices = 0;
        for(int i = 0; i < 10; i++){
            int num = rand.nextInt(5);
            String userColor;
            String color = "";

            switch(num){
                case 0:
                    color = "red";
                    break;
                case 1:
                    color = "green";
                    break;
                case 2:
                    color = "blue";
                    break;
                case 3:
                    color = "orange";
                    break;
                case 4:
                    color = "yellow";
                    break;
            }
            System.out.println(i + 1 + ". What color has the computer chosen?");
            userColor = scnr.next();
            if(userColor.equals(color)){
                correctChoices++;
            }
            System.out.println(">The computer chose " + color);
        }

        System.out.println("You got " + correctChoices + " out of 10 correct");


    }
}
