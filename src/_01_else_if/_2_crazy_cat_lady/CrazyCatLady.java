
package _01_else_if._2_crazy_cat_lady;

import java.net.URI;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		JFrame frame = new JFrame("");
		frame.setSize(0, 0);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		String prompt = "How many cats so you have";
		
		int answer = Integer.parseInt(JOptionPane.showInputDialog(prompt));
		
//		int cats = Integer.parseInt(answer);
		
		if (answer >= 4) {
			JOptionPane.showMessageDialog(null, "You Might Be A Crazy Cat Lady");
		} else if (answer <4 && answer > 0) {
			JOptionPane.showMessageDialog(null, "You Must Be A Cat Lover");
		} else {
			JOptionPane.showMessageDialog(null, "Cats Aren't Your Thing");
		}
		
		// 1. Ask the user how many cats they have
		// 2. Convert their answer into an int
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
		//    Hint: You can use the && operator 
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		
		
		
		
		
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

