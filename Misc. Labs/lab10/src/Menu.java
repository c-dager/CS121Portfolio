import java.util.Scanner;
import java.util.ArrayList;
public class Menu {
   Scanner scnr = new Scanner(System.in);
   Pokedex pokedex = new Pokedex();

   public void displayMenu(){
       while(true){
           System.out.println("***** MENU *****");
           System.out.println("Please make a selection: ");
           System.out.println("1) Add pokemon");
           System.out.println("2) Remove pokemon");
           System.out.println("3) Display pokemon info");
           System.out.println("4) Display all pokemon info");
           System.out.println("5) Exit");
           int choice = scnr.nextInt();
           if(choice ==1){
               createPokemon();
           }
           else if (choice ==2) {
               deletePokemon();
           }
           else if(choice == 3){
               displayPokemon();
           }
           else if (choice ==4) {
               displayAllPokemon();
           }
           else if(choice ==5){
               break;
           }
           else{
               System.out.println("Invalid entry");
           }
       }
   }

   private void createPokemon(){
       System.out.println("Enter pokemon name: ");
       String name = scnr.next();
       System.out.println("Enter hp");
       int hp = scnr.nextInt();
       Pokemon pokemon = new Pokemon(name, hp);
       pokedex.addPokemon(pokemon);
       while(true){
           System.out.println("Enter move name, or q to quit");
           String move = scnr.next();
           if(move.equals("q")){
               break;
           }
           else{
               System.out.println("Enter power: ");
               int power = scnr.nextInt();
               System.out.println("Enter speed");
               int speed = scnr.nextInt();
               Move move1 = new Move(move, power, speed);
               pokemon.addMove(move1);
           }
       }
       System.out.println("Pokemon has been added to pokedex");
   }

   private void deletePokemon(){
       System.out.println("Enter name of pokemon to delete: ");
       String pokemonName = scnr.next();
       if(pokedex.getPokemon(pokemonName) == null){
           System.out.println("Pokemon not found");
       }
       else{
           pokedex.removePokemon(pokedex.getPokemon(pokemonName));
           System.out.println("Pokemon removed");
       }
   }

   private void displayPokemon(){
       System.out.println("Enter name of pokemon: ");
       String pokemonName = scnr.next();
       if(pokedex.getPokemon(pokemonName) == null){
           System.out.println("Pokemon not found");
       }
       else{
          System.out.println(pokedex.getPokemon(pokemonName).toString());
       }
   }
   private void displayAllPokemon(){
       ArrayList<Pokemon> pokemonArrayList= pokedex.getPokemonArrayList();
       for(Pokemon pokemon : pokemonArrayList){
           System.out.println(pokemon.toString());
       }

   }

}
