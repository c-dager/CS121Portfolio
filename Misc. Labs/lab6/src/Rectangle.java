import java.util.Scanner;

public class Rectangle {
    static Scanner scnr = new Scanner(System.in);
    public static void main(String[] args) {
        double len = getLength();
        double wid = getWidth();
        double area = getArea(len, wid);
        displayData(len, wid, area);




        scnr.close();
    }

    public static double getLength(){
        double length;
        System.out.println("Enter the length of the rectangle:");
        length = scnr.nextDouble();
        return length;
    }
    public static double getWidth(){
        double width;
        System.out.println("Enter the width of the rectangle:");
        width = scnr.nextDouble();
        return width;
    }

    public static double getArea(double length, double width){
        double area = length * width;
        return area;
    }

    public static void displayData(double length, double width, double area){
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
    }

}
