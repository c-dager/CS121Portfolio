import java.util.Random;
import java.util.Scanner;

public class MovieSim4{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        // 3 Arrays  containing specific movie Details
        String [] movieNames = {"ExMachina","Matrix","Otherlife","Oppenheimer"};
        String [] movieTypes= {"2D","3D","2D","Drama/Historical"};
        double [] moviePrice = {15.25,20.15,18.11,14.14};

        //Constants
        final int ROWS = 5;
        final int COLUMNS = 10;

        //Convert to a 2D array [][]
        int [][] movieAvailability = new int [ROWS][COLUMNS];


        //METHOD CALLS
        displayMovieDetails(movieNames,movieTypes,moviePrice);  // Calls displayMovieDetails passing in the 3 arrays.
        int index = selectMovie(movieNames);                    // Calls the selectMovie method passing in movieNames array.
        displaySelectedMovie(movieNames[index],movieTypes[index],moviePrice[index]); //calls the displaySelectMovie passing the specific item picked by user in previous method call.
        randomizeAvailability(movieAvailability);      // sets seats to be either available or not available using random instance.
        displaySeatAvailability(movieAvailability);
        selectSeats(movieAvailability);// display the newly generated seats
        scanner.close();
    }
    // Method : displaySelectedMovie()
    //          Displays the move that the user selected.
    //        Visualized Example:
    //       -------------------- MOVIE SELECTIONS --------------------
    //        Movie Name           Movie Type          Movie Price
    //        ExMachina                  2D                  $15.25
    // Method header:
    // access modifier ('static') , return type('void')  method name ('displaySelectedMovie()')
    // and parameter(s) (String movieNames,String movieTypes,double moviePrice)
    static void selectSeats(int[][] movieAvailability){
        System.out.println("How many tickets?");
        int numTickets = scanner.nextInt();
        for(int i = 0; i < numTickets; ++i){
            System.out.println("Please pick an available seat (e.g. A2) for ticket " + (i+1) +":");
            while(true){
                String seat = scanner.next();
                if(seat.length() != 2){
                    System.out.println("You didn't type a valid seat number, try again:");
                    continue;
                }
                int rowNum = (seat.charAt(0) - 65);
                String seatNum = String.valueOf(seat.charAt(1));
                int seatIndex = Integer.parseInt(seatNum)- 1;

                if(movieAvailability[rowNum][seatIndex] == 1){
                    System.out.println("This seat is taken, try another: ");
                }
                else{
                    System.out.println("Seat booked successfully.");
                    movieAvailability[rowNum][seatIndex] = 1;
                    break;
                }
            }
        }
    }

    static void displaySelectedMovie(String movieNames,String movieTypes,double moviePrice)
    {
        System.out.printf("\n%s MOVIE SELECTIONS %s\n","-".repeat(20),"-".repeat(20));
        //System.out.println("--------------------------------- MOVIE SELECTION ---------------------------");
        System.out.printf("%-20s %-20s%-20s\n","Movie Name","Movie Type","Movie Price");
        System.out.printf("%-25s%-20s$%.2f\n",movieNames,movieTypes,moviePrice);

    }
    // Method : selectMovie()
    //          visualize below:
    //          if user typed 'matrix' this method will return '1' as the index in the array.
    //
    //          0         1          2          3
    //       "ExMachina","Matrix","Otherlife","Oppenheimer";
    // Method header:
    // access modifier ('static') , return type('int')  method name ('selectMovie()')
    // and parameter(s) (String movieNames[])
    static int selectMovie(String movieNames[])
    {
        Scanner scn = new Scanner(System.in);
        String selectedMovie;
        while(true)
        {
            //Prompts user:
            System.out.println("\nEnter the movie name you are purchasing tickets for:");
            //Input from user:
            selectedMovie = scn.nextLine();

            // using a for loop to iterate through the movieNames array to check if user input is
            // equal to another the movie that is in the array.
            for(int i = 0; i< movieNames.length;i++)
            {
                //     0         1          2          3
                //  "Jumanji","Matrix","Star Wars","Oppenheimer";
                if(selectedMovie.equalsIgnoreCase(movieNames[i])){
                    //returns the index of the movie that the user selected.
                    return i;
                }
            }
            System.out.println("Movie not found. Please try again.\n");
        }
    }

    // Method : displaySeatAvailability()
    //          Takes in a 2D - 2 Dimensional array as a parameter.
    //          Array size is 5 by 10 --> 5 Rows 10 Columns
    //          Uses a nested for loop to display the content in the movieAvailability.
    //          This method also simulates a theater by using  an array of characters.
    //          Visualized Below:
    //              1 2 3 4 5 6 7 8 9 10
    //              --------------------
    //            A |1 1 0 1 1 1 1 1 0 0
    //            B |0 0 1 1 1 1 1 0 1 1
    //            C |0 0 0 1 0 1 1 0 1 1
    //            D |1 1 0 0 0 0 1 1 0 0
    //            E |0 0 0 0 0 0 0 0 1 1
    //
    // Method header:
    // access modifier ('static') , return type('void')  method name ('displaySeatAvailability()')
    // and parameter(s) (int [][] movieAvailability)
    static void displaySeatAvailability(int [][] movieAvailability){
        System.out.println("\nSeating Availability: [ 1 = unavailable ; 0 = available ]\n");
        char[] rowLabel = {'A','B','C','D','E'};   // Array of character A through E  because ROW is SIZE 5
        for(int c = 1; c <= movieAvailability[0].length;c++){
            System.out.printf(" %d",c);                        // is the COLUMNS 1 through 10
        }
        System.out.printf("\n  %s\n","-".repeat(20));     // prints a formatted line ---
        // for(initialize; condition; increment/decrement)
        for(int i = 0 ; i <movieAvailability.length ; i++ )
        {
            System.out.printf("%c |",rowLabel[i]);                   // Starts displaying the characters A |  then new line.
            for(int j = 0 ; j < movieAvailability[i].length ; j++)
            {
                System.out.print(movieAvailability[i][j] + " " );
            }
            System.out.println();
        }
    }


    // Method : randomizeAvailability()
    //          Takes in a 2D - 2 Dimensional array as a parameter.
    //          Array size is 5 by 10 --> 5 Rows 10 Columns
    //          Uses a nested for loop to assign each seat a randomly a 1 or a 0.
    //          Visualized Below:
    //          1 1 0 1 1 1 1 1 0 0
    //          0 0 1 1 1 1 1 0 1 1
    //          0 0 0 1 0 1 1 0 1 1
    //          1 1 0 0 0 0 1 1 0 0
    //          0 0 0 0 0 0 0 0 1 1
    //          1 = taken      0 = available
    // Method header:
    // access modifier ('static') , return type('void')  method name ('randomizeAvailability()')
    // and parameter(s) (int [][] movieAvailability)
    static void randomizeAvailability(int [][] movieAvailability){
        System.out.println("\n------------ RANDOMIZED SEATS -----------\n");
        Random rand = new Random();
        // for(initialize; condition; increment/decrement)
        for(int i = 0 ; i <movieAvailability.length ; i++ )
        {
            for(int j = 0 ; j < movieAvailability[i].length ; j++)
            {
                movieAvailability[i][j] = rand.nextInt(2);
            }
        }
    }


    // Method : setSeatAvailability()
    //          Takes in a 2D - 2 Dimensional array as a parameter.
    //          Array size is 5 by 10 --> 5 Rows 10 Columns
    //          Uses a nested for loop to assign each seat to 0
    //          Visualized Below:
    //          0 0 0 0 0 0 0 0 0 0
    //          0 0 0 0 0 0 0 0 0 0
    //          0 0 0 0 0 0 0 0 0 0
    //          0 0 0 0 0 0 0 0 0 0
    //          0 0 0 0 0 0 0 0 0 0
    //
    // Method header:
    // access modifier ('static') , return type('void')  method name 'setSeatAvailability()'
    // and parameter(s) (int [][] movieAvailability)
    static void setSeatAvailability(int [][] movieAvailability){
        System.out.println("\n------------ INITIAL SEATS -----------\n");
        // for(initialize; condition; increment/decrement)
        for(int i = 0 ; i <movieAvailability.length ; i++ )
        {
            for(int j = 0 ; j < movieAvailability[i].length ; j++)
            {
                movieAvailability[i][j] = 0;
            }
        }
    }

    // Method : displayMovieDetails()
    //          Displays the movie information that are available for the user to choose from.
    // Method header:
    // access modifier ('static') , return type('void')  method name 'displayMovieDetails()'
    // and parameter(s) (String [] mNames,String [] mTypes, double [] mPrice)
    static void displayMovieDetails(String [] mNames,String [] mTypes, double [] mPrice)
    {

        //%s --> String
        //%d --> integers
        //%f --> doubles floating point
        //%c --> characters
        // -  |--> Flag
        // %-10s --> Left aligned  10 spaces
        // %10s  --> Right aligned 10 spaces
        String header = String.format("\n --------------------------- Movie Details --------------------------\n" +
                "%-20s %-20s%-20s\n","Movie Name","Movie Type","Movie Price");
        System.out.println(header);
        for(int i = 0; i < mNames.length; i++) {
            System.out.printf("Movie %d : %-16s %-16s $%-16.2f\n",(i+1),mNames[i],mTypes[i],mPrice[i]);
        }
    }

}