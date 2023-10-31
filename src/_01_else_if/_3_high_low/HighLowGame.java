
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(1, 100+1);
		int trys = 0;
		System.out.println(random);
		
		// 2. Print out the random variable above
		
		// 11. Repeat steps 1 to 10 ten times
		int guess = 0;
		while (guess != random) {
			guess = Integer.parseInt(JOptionPane.showInputDialog("Enter you numeric guess from 1-100, you have " + (10 - trys) + " left"));
			trys += 1;
			if (guess == random) {
				JOptionPane.showMessageDialog(null, "Correct!");
				System.exit(0);
			} else if (guess > random) {
				JOptionPane.showMessageDialog(null, "High");
			} else {
				JOptionPane.showMessageDialog(null, "Low");
			}
			
		}
			// 1. Ask the user for a guess using a pop-up window, and save their response 

			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			
			// 5. if the guess is correct
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low

		// 13. Tell them they lose
		
	}

}


