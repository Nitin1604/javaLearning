import java.util.Random;
import java.util.Scanner;

public class Lec20_Rock_Paper_Scissors_Game {
    public static void main(String[] args) {

        //Declare variables of type integer
        int playerChoice, computerChoice, rock, paper, scissors;

        //create input object so as to use it's methods for geting use input
        Scanner input = new Scanner (System.in);

        //create random input for the computer
        Random rnd = new Random();

        //Assigning values to the following variables:
        rock = 0;
        paper = 1;
        scissors = 2;


        //display the game name
        System.out.println("ROCK - PAPER - SCISSORRS GAME");
        System.out.println("Enter your choice (0=rock, 1=paper, 2=scissors)");
        
        //User input
        playerChoice = input.nextInt();
        
        //if user chooses above 2
        while (playerChoice > 2) {
            System.out.println("Enter your number between 0 to 2 only.");
            playerChoice = input.nextInt();
        }
        
        //user selections
        if (playerChoice == rock)
        {
            System.out.println("Player choose ROCK");
        }
        else
        {
            if(playerChoice== paper)
            {
                System.out.println("Player choose PAPER");
            }
            else
            {
                System.out.println("Player choose SCISSORS");
            }
        }
        //computer input (random)
        computerChoice = rnd.nextInt(3);

        //computer selection
        if(computerChoice == rock)
        {
            System.out.println("Computer chose ROCK");
        }
        else
        {
            if(computerChoice == paper)
            {
                System.out.println("Computer chose PAPER");
            }
            else
            {
                System.out.println("Computer chose SCISSORS");
            }
        }

        //Results section

        //Draw
        while (playerChoice == computerChoice) {
            System.out.println("draw try again");

            // if user chooses above 2
            playerChoice = input.nextInt();
            while (playerChoice > 2) {
                System.out.println("Enter your number between 0 to 2 only.");
                playerChoice = input.nextInt();
            }
            computerChoice = rnd.nextInt(3);
            // DRAW user selections
            if (playerChoice == rock)
            {
                System.out.println("Player choose ROCK");
            }
            else
            {
                if(playerChoice== paper)
                {
                    System.out.println("Player choose PAPER");
                }
                else
                {
                    System.out.println("Player choose SCISSORS");
                }
            }
            //DRAW computer selection
            if(computerChoice == rock)
            {
                System.out.println("Computer chose ROCK");
            }
            else
            {
                if(computerChoice == paper)
                {
                    System.out.println("Computer chose PAPER");
                }
                else
                {
                    System.out.println("Computer chose SCISSORS");
                }
            }
        }


        if (computerChoice==rock)
        {
            if (playerChoice==paper)
            {
                System.out.println("User wins!");
            }
            else
            {
                System.out.println("Computer Wins");
            }
        }
        else if (computerChoice==paper)
        {
            if (playerChoice==rock)
            {
                System.out.println("Computer wins");
            }
            else
            {
                System.out.println("User Wins!");
            }
        }
        else if (playerChoice==rock)
        {
            System.out.println("User Wins");
        }
        else
        {
            System.out.println("Computer Wins");
        }
    }

}
