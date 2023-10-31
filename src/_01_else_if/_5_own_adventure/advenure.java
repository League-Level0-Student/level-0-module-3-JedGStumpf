package _01_else_if._5_own_adventure;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class advenure {

	public static void main(String[] args) {
		JFrame frame = new JFrame("");
		frame.setSize(0, 0);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		String prompt = "Would You like to read a choose your adventure story? y/n";
		
		String play = JOptionPane.showInputDialog(null, prompt);
		
		if (play.equals("n")) {
			JOptionPane.showMessageDialog(null, "Too Bad, Good Bye.");
			System.exit(0);
		} else {
			story();
		}
		

	}
	
	public static void story() {

		boolean keepPlaying = true;
		
		while (keepPlaying) {
			String enter = JOptionPane.showInputDialog(null, "You enter a cave, there are 3 routes:'/n' Left, Right, Center./n Which direction would you like to go?" + "\n" + "Or Enter Walk to walk away.");
			String enterUpper = enter.toUpperCase();
			if (enterUpper.startsWith("L")) {
//				System.out.println("yes"); // Testing Sys.out
				String chest = JOptionPane.showInputDialog(null, "You find a treasure chest, do you open it y/n?");
				String chestUpper = chest.toUpperCase();
				if (chestUpper.startsWith("Y")) {
					JOptionPane.showMessageDialog(null, "An Evil Spell is released and you vanish" + "\n" + "Good Bye.");
					keepPlaying = false;
					System.exit(0);
				} else if (chestUpper.startsWith("N")) {
					JOptionPane.showMessageDialog(null, "There is nothing else here, go back to the main entrance");
				} else {
					JOptionPane.showMessageDialog(null, "That didn't make sense, you have been magically thrown back to the entrance of the cave.");
				}
			} else if (enterUpper.startsWith("R")) {
				String dragon = JOptionPane.showInputDialog(null, "There is a large dragon at the end of the room" + "\n"+ 
						"Do you wish to take some dragon treasure or sneak back out?" + "\n" + "Choose Treasure/Out");
				String dragonUpper = dragon.toUpperCase();
				if (dragonUpper.startsWith("O")) {
					JOptionPane.showMessageDialog(null, "Too Bad, but the risk was just too much for you I see" + "\n" + "You made it back to the entrance.");
				} else if (dragonUpper.startsWith("T")) {
					JOptionPane.showMessageDialog(null, "You succesfully took 80 pieces of gold and a large Ruby" + "\n" + "You can leave rich or keep playing");
				} else {
					JOptionPane.showMessageDialog(null, "THat response was not an option, you woke the dragon and now you are lunch.");
					keepPlaying = false;
					System.exit(0);
				}
			} else if (enterUpper.startsWith("C")) {
				JOptionPane.showMessageDialog(null, "It's A Trap!!!  You fall to your death in a pit of spikes.");
				keepPlaying = false;
				System.exit(0);
			} else if (enterUpper.startsWith("W")) {
				JOptionPane.showMessageDialog(null, "OK, Good Bye.");
				keepPlaying = false;
				System.exit(0);
			}
			
			else {
				JOptionPane.showMessageDialog(null, "Invalid choice, please enter: Left, Right, or Center");
			}
		}

	
	}

}
