import java.awt.print.Paper;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Declare variables
        Scanner in = new Scanner(System.in);
        String ROCK_WINS = "Rock breaks Scissors";
        String PAPER_WINS = "Paper covers Rock";
        String SCISSORS_WINS = "Scissors cuts Paper";
        String playerA = ""; // player A move
        String playerB = ""; // player B move
        String playAgain = "Y";
        boolean done = false; // false until user enters valid input



        do
        {
            // Player A input
            do {
                System.out.println("Player A make your selection: \nR \nP \nS \n");
                playerA = in.nextLine();

                if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")) {
                    // valid input so done is true
                    done = true;
                } else {
                    // non valid input. keep done false
                    System.out.println(playerA + " is not a valid selection. Try again");
                }
            }
            while (!done);

            // Reset done value
            done = false;

            // Player B input
            do {
                System.out.println("Player B make your selection: \nR \nP \nS \n");
                playerB = in.nextLine();

                if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")) {
                    // valid input so done is true
                    done = true;
                } else {
                    // non valid input. keep done false
                    System.out.println(playerB + " is not a valid selection. Try again");
                }
            }
            while (!done);

            // Reset done value
            done = false;

            // Determine a winner
            if (playerA.equalsIgnoreCase("R")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("You both chose Rock. Its a draw!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println(PAPER_WINS + ". Player B Wins!");
                } else if (playerB.equalsIgnoreCase("S")) {
                    System.out.println(ROCK_WINS + ". Player A Wins!");
                }
            } else if (playerA.equalsIgnoreCase("P")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println(PAPER_WINS + ". Player A Wins!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("You both chose Paper. Its a draw!");
                } else if (playerB.equalsIgnoreCase("S")) {
                    System.out.println(SCISSORS_WINS + ". Player B Wins!");
                }
            } else if (playerA.equalsIgnoreCase("S")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println(ROCK_WINS + ". Player B Wins!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println(SCISSORS_WINS + ". Player A Wins!");
                } else if (playerB.equalsIgnoreCase("S")) {
                    System.out.println("You both chose Scissors. Its a draw!");
                }
            }

            // Ask if they want to play again.
            while (!done)
            {
                System.out.println("Do you want to play again?[Y/N]: ");
                playAgain = in.nextLine();

                if (playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N"))
                {
                    // valid input
                    done = true;
                }
                else
                {
                    // not valid input
                    System.out.println("Please answer with Y or N");
                }
            }
        }
        while (playAgain.equalsIgnoreCase("Y"));
    }
}