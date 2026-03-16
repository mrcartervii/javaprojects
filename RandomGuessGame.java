import javax.swing.JOptionPane;
import java.util.Random;

public class RandomGuessGame {
    public static void main(String[] args) {

        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1; // number between 1 and 100

        int guess = 0;
        int count = 0;

        while (guess != randomNumber) {

            String input = JOptionPane.showInputDialog("Guess a number between 1 and 100:");
            guess = Integer.parseInt(input);

            count++;

            if (guess < randomNumber) {
                JOptionPane.showMessageDialog(null, "Too low! Try again.");
            }
            else if (guess > randomNumber) {
                JOptionPane.showMessageDialog(null, "Too high! Try again.");
            }
            else {
                JOptionPane.showMessageDialog(null,
                        "Correct! The number was " + randomNumber +
                                "\nNumber of guesses: " + count);
            }
        }

        System.exit(0);
    }
}
