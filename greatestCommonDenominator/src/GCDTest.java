import java.util.Scanner;

public class GCDTest {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = scnr.nextInt();
        System.out.println("Enter another number: ");
        int num2 = scnr.nextInt();
        System.out.println("For loop gcd: " + GCD.forLoop(num1, num2));
        System.out.println("While loop: " + GCD.whileLoop(num1, num2));
        System.out.println("Recursive: " + GCD.recursion(num1, num2));

        System.out.println("Bonus with negative number: ");
        System.out.println("Enter positive number: ");
        num1 = scnr.nextInt();
        System.out.println("Enter negative number: ");
        num2 = scnr.nextInt();
        System.out.println("Negative gcd: " + GCD.forLoop(num1,num2));
    }
}
