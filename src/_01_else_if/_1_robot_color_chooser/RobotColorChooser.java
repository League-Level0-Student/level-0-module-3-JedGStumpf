
package _01_else_if._1_robot_color_chooser;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("");
		frame.setSize(0, 0);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		String prompt = "Would you like to change the pen color?";
		int penW = 10;
		Robot rob = new Robot();
		
		Boolean keepColoring = true;
		
		String colorX = JOptionPane.showInputDialog(null, prompt);
		if (colorX.equals("yes")) {
			while (keepColoring) {

				
				rob.setPenWidth(penW);
				String promptR =  "What Color Would You Like the Robot to Color R?";
				String promptG =  "What Color Would You Like the Robot to Color G?";
				String promptB =  "What Color Would You Like the Robot to Color B?";
				
				
				String colorR = JOptionPane.showInputDialog(null, promptR);
				int intColorR = Integer.parseInt(colorR);
				
				String colorG = JOptionPane.showInputDialog(null, promptG);
				int intColorG = Integer.parseInt(colorG);
				
				String colorB = JOptionPane.showInputDialog(null, promptB);
				int intColorB = Integer.parseInt(colorB);

				rob.setPenColor(intColorR, intColorG, intColorB);
				rob.setSpeed(50);
				rob.penDown();
				
				for (int x = 0; x < 4; x++) {
					rob.move(50);
					rob.turn(90);			
				}
				
				prompt = "Would you like to change the pen color Again?";
				String colorY = JOptionPane.showInputDialog(null, prompt);
				if (colorY.equals("yes")) {
					penW += 10;
				} else {
					keepColoring = false;
				}
				
			}
		}
		
		//1. Create a new Robot
		
	    //2. Make the robot draw a shape (this will take more than one line of code)

		}
		
		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them

	
}
