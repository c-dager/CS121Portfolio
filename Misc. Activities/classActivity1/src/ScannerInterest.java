import java.util.Scanner;

public class ScannerInterest {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double totalMoney;
        int principal;
        double interestRate;
        int timesCompounded;
        int years;
        System.out.println("Enter the original deposit amount");
        principal = scnr.nextInt();
        System.out.println("Enter the interest rate");
        interestRate = scnr.nextInt();
        interestRate = interestRate / 100;
        System.out.println("Enter the amount of times compounded in a year");
        timesCompounded = scnr.nextInt();
        System.out.println("Enter the number of years deposited");
        years = scnr.nextInt();

        totalMoney = principal * (Math.pow((1 + (interestRate)/timesCompounded), timesCompounded * years));

        System.out.print("You will have: $");
        System.out.printf("%.2f", totalMoney);

    }
}
