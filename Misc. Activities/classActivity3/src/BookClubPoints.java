import java.util.Scanner;

public class BookClubPoints {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numBooks;
        int numPoints;
        System.out.println("Enter number of books bought: ");
        numBooks = scnr.nextInt();

        if (numBooks == 0){
            numPoints = 0;
        }
        else if (numBooks == 1){
            numPoints = 5;
        }
        else if (numBooks == 2){
            numPoints = 15;
        }
        else if (numBooks == 3){
            numPoints = 30;
        }
        else if (numBooks > 3){
            numPoints = 60;
        }
        else{
            numPoints = -1;
        }

        System.out.println("Your points: " +  numPoints);

    }
}
