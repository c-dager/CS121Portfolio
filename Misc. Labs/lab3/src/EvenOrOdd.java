import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Type an integer: ");

        int number = scnr.nextInt();

        if(number%2 == 0){
            System.out.println("Your number is even");

        }
        else{
            System.out.println("Your number is odd");

        }

    }
}
