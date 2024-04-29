import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileRead {

    public static void main(String[] args) {
        try  {
            File inputFile = new File("C:/Users/Charlie/Documents/CS121/fileActivity/courses.txt");
            Scanner input = new Scanner(inputFile);
            while (input.hasNextLine()){
                String line = input.nextLine();
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Something went wrong");
        }
    }

}
