import javax.swing.*;
import java.util.*;

public class ESPGame {
    public static void main(String[] args) {

        String[] colors = {"Red", "Green", "Blue", "Orange", "Yellow"};
        Random rand = new Random();

        int correct = 0;

        for (int i = 1; i <= 10; i++) {

            int randomNumber = rand.nextInt(5);
            String selectedColor = colors[randomNumber];

            String guess = JOptionPane.showInputDialog(
                    "Round " + i + ": Guess the color (Red, Green, Blue, Orange, Yellow)");

            if (guess != null && guess.equalsIgnoreCase(selectedColor)) {
                correct++;
            }

            JOptionPane.showMessageDialog(null, "Computer selected: " + selectedColor);
        }

        JOptionPane.showMessageDialog(null,
                "Game Over!\nYou guessed correctly " + correct + " out of 10 times.");

        System.exit(0);
    }
}
