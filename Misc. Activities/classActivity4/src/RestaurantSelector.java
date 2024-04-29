import java.util.Scanner;

public class RestaurantSelector {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String isVegetarian;
        String isVegan;
        String isGlutenFree;
        System.out.println("Is anyone vegetarian? (Yes or no)");
        isVegetarian = scnr.next();
        System.out.println("Is anyone vegan? (Yes or no)");
        isVegan = scnr.next();
        System.out.println("Does anyone need a gluten-free menu? (Yes or no)");
        isGlutenFree = scnr.next();

        isVegan = isVegan.toUpperCase();
        isVegetarian = isVegetarian.toUpperCase();
        isGlutenFree = isGlutenFree.toUpperCase();

        if (isVegan.equals("NO") && isVegetarian.equals("NO") && isGlutenFree.equals("NO")){
            System.out.println("Here are your choices:\nJoe's Burgers\nMain St. Pizza\nCorner Cafe\nMama's Fine Italian\nChef's Kitchen");
        }
        else if(isVegan.equals("YES")) {
            System.out.println("Here are your choices:\nCorner Cafe\nChef's Kitchen");
        }
        else if(isVegetarian.equals("YES") && isVegan.equals("NO") && isGlutenFree.equals("NO")) {
                System.out.println("Here are your choices:\nMain St. Pizza\nCorner Cafe\nMama's Fine Italian\nChef's Kitchen");
        }
        else if(isVegetarian.equals("YES") && isVegan.equals("NO") && isGlutenFree.equals("YES")){
            System.out.println("Here are your choices:\nMain St. Pizza\nCorner Cafe\nChef's Kitchen");
        }
        else if(isVegetarian.equals("NO") && isVegan.equals("NO") && isGlutenFree.equals("YES")){
            System.out.println("Here are your choices:\nMain St. Pizza\nCorner Cafe\nChef's Kitchen");
        }

    }
}
