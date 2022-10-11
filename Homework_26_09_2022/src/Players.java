import java.util.Random;
import java.util.Scanner;

public class Players {
    final int cardsForPlayer = 5;
    int players;

    final Scanner sc = new Scanner(System.in);
    final Random random = new Random();



  public  static void play() {
    }
      while(true)

    {
        System.out.println("Enter the number of players: ");

        if (sc.hasNextInt()) {
            players = sc.nextInt();
            if (cardsForPlayer * players <= numberOfCards) {
                break;
            } else {
                if (players == 0) {
                    System.out.println("The game has been terminated.");
                    break;
                } else if (players < 0) {
                    System.out.println("The number of players cannot be less than 0");
                } else {
                    System.out.println("Too many players!");
                }
            }
        } else {
            System.out.println("You have not entered a number, or your number is too large!");
        }
    }
}

}
