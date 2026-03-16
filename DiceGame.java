import javax.swing.*;
import java.util.*;

public class DiceGame {
    public static void main(String[] args) {

        Random rand = new Random();

        int computerWins = 0;
        int userWins = 0;

        for (int i = 1; i <= 10; i++) {

            int computerDie = rand.nextInt(6) + 1;
            int userDie = rand.nextInt(6) + 1;

            String message = "Round " + i +
                    "\nComputer rolled: " + computerDie +
                    "\nUser rolled: " + userDie;

            if (computerDie > userDie) {
                computerWins++;
                message += "\nComputer wins this round!";
            }
            else if (userDie > computerDie) {
                userWins++;
                message += "\nUser wins this round!";
            }
            else {
                message += "\nIt's a tie!";
            }

            JOptionPane.showMessageDialog(null, message);
        }

        String result;

        if (computerWins > userWins) {
            result = "Computer is the grand winner!";
        }
        else if (userWins > computerWins) {
            result = "User is the grand winner!";
        }
        else {
            result = "The game is a tie!";
        }

        JOptionPane.showMessageDialog(null,
                "Final Results:\nComputer wins: " + computerWins +
                        "\nUser wins: " + userWins +
                        "\n\n" + result);

        System.exit(0);
    }
}
