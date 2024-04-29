import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        final int numElements = scnr.nextInt();
        int[] array1 = new int[numElements];
        int[] array2 = new int[numElements];
        int[] array3 = new int[numElements];
        int[] array4 = new int[numElements];

        for(int i = 0; i < array1.length; i++){
            System.out.println("Enter number for element " + i + ":");
            array1[i] = scnr.nextInt();
        }
        System.out.println("Array 1: ");
        for (int j : array1) {
            System.out.print(j + " ");
        }


        for(int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        System.out.println();
        System.out.println("Array 2 - copy");
        for(int j : array2){
            System.out.print(j +" ");
        }


        for(int i = 0; i < array1.length; i++) {
            array3[i] = array1[i] * array1[i];
        }
        System.out.println();
        System.out.println("Array 3 - squared");
        for(int j : array3){
            System.out.print(j + " ");
        }

        for(int i = 0; i < array1.length; i++) {
            array4[i] = array1[array1.length - 1 - i];
        }
        System.out.println();
        System.out.println("Array 4 - reversed");
        for(int j : array4){
            System.out.print(j + " ");
        }

    }
}
