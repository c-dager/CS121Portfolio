import java.util.Scanner;


public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Type one of the four fruits: apple, banana, orange, kiwi");
        String fruit = scnr.next();
        switch(fruit){
            case "apple":
                System.out.println("red");
                break;
            case "banana":
                System.out.println("yellow");
                break;
            case "orange":
                System.out.println("orange");
                break;
            case "kiwi":
                System.out.println("green and brown");
                break;
            default:
                System.out.println("Not an option");
                break;



        }
    }
}
