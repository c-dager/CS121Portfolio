import java.util.Scanner;
public class Sorting {
    Scanner scnr = new Scanner(System.in);
    public int[] getArray(){
        int[] array = new int[5];
        for(int i = 0; i < array.length; ++i){
            System.out.println("Enter integer " + (i+1) + ": ");
            int num = scnr.nextInt();
            array[i] = num;
        }
        return array;
    }

    public int[] sortArray(int[] unsortedArray){
        for(int i = 0; i < unsortedArray.length -1; ++i){
            int indexSmallest = i;
            for(int j = i+1; j < unsortedArray.length; ++j){
                if(unsortedArray[j] < unsortedArray[indexSmallest]){
                    indexSmallest = j;
                }
            }
            int temp = unsortedArray[i];
            unsortedArray[i] = unsortedArray[indexSmallest];
            unsortedArray[indexSmallest] = temp;
        }

        return unsortedArray;


    }
}
