import java.util.ArrayList;
public class GenericArrayList {

    public <E> void printArrayList(ArrayList<E> theList){
        for (E item : theList){
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
