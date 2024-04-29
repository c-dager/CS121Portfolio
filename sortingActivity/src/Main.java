import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        int[] unsorted = sorting.getArray();
        System.out.println("Unsorted array: " + Arrays.toString(unsorted));
        int[] sorted = sorting.sortArray(unsorted);
        System.out.println("Sorted array: " + Arrays.toString(sorted));
    }
}
