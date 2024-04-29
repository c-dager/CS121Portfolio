import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        File outputFile = new File("C:/Users/Charlie/Documents/CS121/fileActivity/courses.txt");
        PrintWriter output  = new PrintWriter(outputFile);
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter course name:");
        String name = scnr.next();
        System.out.println("Enter letter grade:");
        String letterGrade = scnr.next();
        output.println("Course - Grade");
        output.println(name + " - " + letterGrade);

        output.close();
    }
}
