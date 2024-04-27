import java.util.Scanner;
import java.util.Random;


public class CharacterBattle {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();
        int oneWins = 0;
        int twoWins = 0;

        int numRounds;
        System.out.println("How many rounds would you like to play (it must be an odd #, and greater than 0): ");
        numRounds = scnr.nextInt();

        //doesn't allow game to play unless valid number given
        while (numRounds % 2 == 0 || numRounds < 0) {
            System.out.println("Invalid number of rounds. Try a new number: ");
            numRounds = scnr.nextInt();
        }
        //plays through specified num of rounds
        for (int i = 0; i < numRounds; i++) {
            //initializes variables
            String oneName;
            String twoName;
            int oneHP;
            int twoHP;
            String oneMove;
            String twoMove;
            int oneDamage;
            int twoDamage;
            int oneSpeed;
            int twoSpeed;
            System.out.println("Type player one's character name and hit enter, then type player two's character name.");
            oneName = scnr.next();
            twoName = scnr.next();
            System.out.println("Type player 1's HP, hit enter, and type player 2's: ");
            oneHP = scnr.nextInt();
            twoHP = scnr.nextInt();
            System.out.println("Type player 1's move name, hit enter, and type player 2's: ");
            oneMove = scnr.next();
            twoMove = scnr.next();
            System.out.println("Type player 1's damage per move, hit enter, and type player 2's: ");
            oneDamage = scnr.nextInt();
            twoDamage = scnr.nextInt();
            System.out.println("Type player 1's attack speed, hit enter, and type player 2's: ");
            oneSpeed = scnr.nextInt();
            twoSpeed = scnr.nextInt();

            //find out who goes first
            int attackFirst;
            if(oneSpeed == twoSpeed){
                attackFirst = rand.nextInt(2) + 1;
            }
            else if(oneSpeed > twoSpeed){
                attackFirst = 1;
            }
            else{
                attackFirst = 2;
            }

            if(attackFirst == 1){
                while(oneHP > 0 && twoHP > 0){

                    twoHP = twoHP - oneDamage;
                    if(twoHP < 1){
                        System.out.println("Player one " + oneName+ " is the round winner");
                        oneWins++;
                    }

                    oneHP = oneHP - twoDamage;
                    if(oneHP < 1 && twoHP > 0){
                        System.out.println("Player two " + twoName + "is the round winner");
                        twoWins++;
                    }
                }
            }
            else{
                while(oneHP > 0 && twoHP > 0){

                    oneHP = oneHP - twoDamage;
                    if(oneHP < 1){
                        System.out.println("Player two " + twoName + " is the round winner");
                        twoWins++;
                    }

                    twoHP = twoHP - oneDamage;
                    if(twoHP < 1 && oneHP > 0){
                        System.out.println("Player one " + oneName + " is the round winner");
                        oneWins++;
                    }
                }


            }
            System.out.println("Player 1 wins: " + oneWins);
            System.out.println("Player 2 wins: " + twoWins);

        }
        System.out.println("\n------------------------------------" + "\nPlayer 1 final number of wins: " + oneWins + "\nPlayer 2 final number of wins: " + twoWins);
        if(oneWins > twoWins){
            System.out.println("THE BATTLE OVERALL WINNER: PLAYER 1" );
        }
        else{
            System.out.println("THE BATTLE OVERALL WINNER: PLAYER 2");
        }
    }

}
