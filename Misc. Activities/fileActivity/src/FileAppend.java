import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileAppend {
    public static void main(String[] args) throws IOException{
        try{
            FileWriter fileWriter = new FileWriter("C:/Users/Charlie/Documents/CS121/fileActivity/courses.txt", true);
            PrintWriter output = new PrintWriter(fileWriter);
            Scanner scnr = new Scanner(System.in);
            String name;
            String letterGrade;
            System.out.println("Enter course name: ");
            name = scnr.next();
            System.out.println("Enter letter grade: ");
            letterGrade = scnr.next();
            output.println(name + " - " + letterGrade);
            output.close();
        }
        catch (FileNotFoundException e){
            System.err.println("File not found");
        }

    }
}
