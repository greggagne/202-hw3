/**
 * Add comments at the heading describing what the program does
 * as well as who authored it.
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Snowman {
	List<String> wordList = new ArrayList<String>();

	/**
	 * Read in the list of words
	 */
	public void readWords(String fileName) throws FileNotFoundException {
		Scanner s = new Scanner(new File(fileName));

		while (s.hasNext())
			wordList.add(s.next());

		s.close();
	}

	/**
	 * Selects a random word from the list
	 * and returns it.
	 */
	public String getWord() {
		// returns a random word from wordList

		Random r = new Random();

		return wordList.get(r.nextInt(wordList.size()));
	}
	

	/**
	 * Plays the game. Currently very limited functionality.
	 */
	public void playGame(String word) {
		char nextChoice;
		
		// an array of characters representing
		// the guessed word.
		char[] guess = new char[word.length()];
		
		for (int i = 0; i < guess.length; i++) {
			guess[i] = '_';
		}
		
		
		Scanner reader = new Scanner(System.in);
		
		while (true) {
			for (int i = 0; i < guess.length; i++) {
				System.out.print(" " + guess[i] + " ");
			}
			System.out.println();

			System.out.print("Your choice: ");
			nextChoice = reader.next().charAt(0);

			System.out.println("you entered " + nextChoice);
		}
		
		// Report whether the player won or lost
		
	}

	public static void main(String[] args) {
		Snowman game = new Snowman();

		try {
			game.readWords("words.txt");
			String word = game.getWord();
			
			// use this for testing the program
			// 	DELETE THIS LINE WHEN COMPLETED
			System.out.println("The word is '" + word + "'");
			
			game.playGame(word);
		} catch (FileNotFoundException fnf) {
			System.err.println("words.txt file Not Found");
		}

		
	}

}
