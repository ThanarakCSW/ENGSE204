import java.util.Scanner;

/*
 * Class Player
 * This class represents a player whose score can be safely updated.
 * Encapsulation is applied to protect the score from invalid modification.
 */
class Player {

    // The score is kept private to prevent direct access
    private int score;

    /*
     * Constructor
     * Initializes the player with an initial score.
     * Ensures the object starts in a valid state.
     */
    public Player(int initialScore) {
        this.score = initialScore;
    }

    /*
     * Getter method
     * Returns the current score of the player.
     */
    public int getScore() {
        return score;
    }

    /*
     * Setter method with validation
     * Updates the score only if the new value is valid.
     * Validation is used to prevent the score from becoming negative.
     */
    public void setScore(int newScore) {

        // Check if the new score is negative
        // This prevents an invalid game state
        if (newScore < 0) {
            // Keep the old score if the input is invalid
            return;
        }

        // Update the score when the input is valid
        this.score = newScore;
    }
}

public class PlayerScore {

    public static void main(String[] args) {

        // Scanner is used to read input from standard input
        Scanner sc = new Scanner(System.in);

        // Read the initial score
        int initialScore = sc.nextInt();

        // Read the updated score
        int updatedScore = sc.nextInt();

        // Create a Player object with the initial score
        Player player = new Player(initialScore);

        // Attempt to update the score
        player.setScore(updatedScore);

        // Display the final score
        System.out.println(player.getScore());

        // Close the scanner to release system resources
        sc.close();
    }
}
