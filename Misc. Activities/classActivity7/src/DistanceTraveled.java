import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter speed in mph: ");
        int speed = scnr.nextInt();
        System.out.println("Enter num of hrs spent travelling: ");
        int hours = scnr.nextInt();
        System.out.println();
        System.out.println("Hour\t\t\tDistance Traveled");

        for(int i = 1; i<=hours; i++){
            int distance = i * speed;
            System.out.println(i + "\t\t\t\t" + distance);
        }
    }
}
