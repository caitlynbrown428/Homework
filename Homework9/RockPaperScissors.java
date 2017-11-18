/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Caitlyn Brown
   Date Due:   11/10/17
 ******************************************************************************/

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String tryAgain;
        String userChoice;
        String computerChoice;
        
        printInstructions();
        
        // Keep playing the game as many times as the user wants
        do
        {
            userChoice = getUsersChoice();
            computerChoice = getComputersChoice();
            
            System.out.printf("%s vs. %s\n", userChoice, computerChoice);
            System.out.printf("Outcome: %s\n\n", getOutcome(userChoice, computerChoice));            
            
            System.out.print("Do you want to play again? (Yes/No): ");
            tryAgain = keyboard.next();
        } while (tryAgain.equals("Yes"));
    }
    
    
    // Prints the instructions for the program
    static void printInstructions()
    {
        System.out.println("\n");
        System.out.println("------------------ Rock, Paper, Scissors ------------------");
        System.out.println("|                                                         |");
        System.out.println("Rock beats Scissors, Paper beats Rock, Scissors beats Paper");
        System.out.println("|                                                         |");
        System.out.println("-----------------------------------------------------------");
        System.out.println("\n");
    }
    
    // Forces the user to pick either Rock, Paper, or Scissors
    static String getUsersChoice()
    {
       System.out.print("What is your choice? (Rock/Paper/Scissors): ");
       Scanner keyboard = new Scanner(System.in);
       String userChoice = keyboard.next();
       return userChoice;
    }
    
    // Picks either Rock, Paper, or Scissors for the computer
    static String getComputersChoice()
    {
        String[] computerChoice = {"Rock", "Paper", "Scissors"};
        Random rand = new Random();
        return computerChoice[rand.nextInt(computerChoice.length)];
    }
    
    // Figures out if the user won, lost, or tied a round of rock/paper/scissors
    static String getOutcome(String user, String computer)
    {
        if (user.equals(computer))
        {
            return "Draw.";
        }
        else if (user.equals("Rock") && computer.equals("Scissors"))
        {
            return "Win!";
        }
        else if (user.equals("Paper") && computer.equals("Rock"))
        {
            return "Win!";
        }
        else if (user.equals("Scissors") && computer.equals("Paper"))
        {
            return "Win!";
        }
        else
        {
            return "Lose...";
        }
    }
}