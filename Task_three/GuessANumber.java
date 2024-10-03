import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int rnd_number;
	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
	System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){
	// Create a Scanner object   	 

        Scanner scanner = new Scanner (System.in);
        System.out.println("enter your guess");

        // use hasNextDouble to check if input is numeric, 

        if(!scanner.hasNextDouble()){
            String invalidInput = scanner.next();
            System.out.println( invalidInput + "You have entered an UNvalid number");
            makeAGuess();
            return;
        }

        // if so...
        int userGuess = scanner.nextInt();
	   // Read user input
        // Compare it with the random number
        if (userGuess == rnd_number){
            System.out.println( "Congratulation. You have guessed the number :P");
        }
        else if  (userGuess < rnd_number){
            System.out.println("You have guessed tooooooo LOW ! try again");
            makeAGuess();
        }
        else {
            System.out.println("your guess is TOOO HIGHT - try again");
            makeAGuess();
        }
        scanner.close();

        }

        // all the below 
        // Let the user know the result of the comparison
        // Let the user try again by calling this method recursively
        // Help the user by revealing wether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively
    }
