import javax.swing.*;
import java.util.*;

public class SlotMachine {
    public static void main(String[] args) {

        Random rand = new Random();

        String[] words = {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"};

        double totalEntered = 0;
        double totalWon = 0;

        int play = JOptionPane.YES_OPTION;

        while (play == JOptionPane.YES_OPTION) {

            double money = Double.parseDouble(
                    JOptionPane.showInputDialog("Enter amount of money to play:")
            );

            totalEntered += money;

            String word1 = words[rand.nextInt(6)];
            String word2 = words[rand.nextInt(6)];
            String word3 = words[rand.nextInt(6)];

            JOptionPane.showMessageDialog(null,
                    "Results:\n" + word1 + " | " + word2 + " | " + word3);

            double winnings = 0;

            if (word1.equals(word2) && word2.equals(word3)) {
                winnings = money * 3;
            }
            else if (word1.equals(word2) || word1.equals(word3) || word2.equals(word3)) {
                winnings = money * 2;
            }
            else {
                winnings = 0;
            }

            totalWon += winnings;

            JOptionPane.showMessageDialog(null,
                    "You won: $" + winnings);

            play = JOptionPane.showConfirmDialog(null, "Do you want to play again?");
        }

        JOptionPane.showMessageDialog(null,
                "Game Over\nTotal Entered: $" + totalEntered +
                        "\nTotal Won: $" + totalWon);

        System.exit(0);
    }
}
