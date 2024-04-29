import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int side1;
        int side2;
        int side3;

        System.out.println("Input length of side 1:");
        side1 = scnr.nextInt();
        System.out.println("Input length of side 2:");
        side2 = scnr.nextInt();
        System.out.println("Input length of side 3:");
        side3 = scnr.nextInt();

        if(side1 == side2 && side2 == side3){
            System.out.println("Equilateral triangle");
        }
        else if(side1 != side2 && side2!=side3 && side3!=side1){
            System.out.println("Scalene triangle");
        }
        else{
            System.out.println("Isosceles triangle");
        }

    }
}
