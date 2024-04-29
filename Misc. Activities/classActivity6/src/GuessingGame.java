import javax.swing.JOptionPane;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();

        int numGuesses = 0;
        int ranNumber = rand.nextInt(99) + 1;
        String guess = JOptionPane.showInputDialog("Enter in a number between 0 and 100, or type 'q' to quit");
        numGuesses++;
        int numGuess;
        while(true){

            if(guess.equals("q")){
                JOptionPane.showMessageDialog(null, "You quit. The number was: " + ranNumber);
                break;
            }
            else{
                numGuess = Integer.parseInt(guess);
            }
            if (numGuess > ranNumber){
                guess = JOptionPane.showInputDialog("Too high. Guess again.");
                numGuesses++;
            }
            else if(numGuess < ranNumber){
                guess = JOptionPane.showInputDialog("Too low. Guess again.");
                numGuesses++;
            }
            else{
                 JOptionPane.showMessageDialog(null, "Correct. You took " + numGuesses + " guesses");
                 break;
            }
        }


    }
}
