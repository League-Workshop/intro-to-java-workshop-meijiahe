package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot rob=new Robot();

	void go() {
rob.penDown();
		// 4. Make the robot move as fast as possible

		// 5. Set the pen width to 5

		// 6. Use a for loop to repeat steps #7 to #8, four times...

			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method
for(int i=0;1<10;i++){
	drawSquare();
			// 8. Turn the robot 90 degrees to the right
}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
rob.move(120);
rob.turn(90);
rob.move(120);
rob.turn(90);
rob.move(120);
rob.turn(90);
rob.move(120);

		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



