import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Double> doubleList = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5));
        ArrayList<Character> charList = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("Alpha", "Beta", "Charlie"));

        GenericArrayList genericArrayList = new GenericArrayList();
        genericArrayList.printArrayList(intList);
        genericArrayList.printArrayList(doubleList);
        genericArrayList.printArrayList(charList);
        genericArrayList.printArrayList(stringList);

    }
}
