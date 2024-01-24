import java.util.Random;
import java.util.Scanner;

public class ProjectRockPaperScissors {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            final String ROCK = "Rock";
            final String PAPER = "Paper";
            final String SCISSORS = "Scissors";

            System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");
            String playerMove = scanner.nextLine();

            if (playerMove.equals("r")|| playerMove.equals("rock")) {
                playerMove = ROCK;
            } else if (playerMove.equals("p")|| playerMove.equals("paper")) {
                playerMove = PAPER;
            } else if (playerMove.equals("s")|| playerMove.equals("scissors")) {
                playerMove = SCISSORS;
            } else {
                System.out.println("Invalid Input. Try again...");
                return;
            }
            Random random = new Random();
            int computerRandomNumber = random.nextInt(3);
            String computerMove = "";
            switch (computerRandomNumber) {
                case 0:computerMove = ROCK;
                    break;
                case 1:computerMove = PAPER;
                    break;
                case 2:computerMove = SCISSORS;
                    break;
            }
            System.out.printf("The computer chose %s.%n",computerMove);

            boolean hasPlayerWon = playerMove.equals(ROCK) && computerMove.equals(SCISSORS) ||
                    playerMove.equals(PAPER) && computerMove.equals(ROCK) ||
                    playerMove.equals(SCISSORS) && computerMove.equals(PAPER);
            boolean hasPlayerLost = playerMove.equals(ROCK) && computerMove.equals(PAPER) ||
                    playerMove.equals(PAPER) && computerMove.equals(SCISSORS)||
                    playerMove.equals(SCISSORS) && computerMove.equals(ROCK);

            if (hasPlayerWon){
                System.out.println("You win");
            } else if (hasPlayerLost) {
                System.out.println("You lose.");
            } else {
                System.out.println("This game was a draw");
            }
        }
}