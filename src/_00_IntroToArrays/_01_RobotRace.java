package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Random rand = new Random();
		//2. create an array of 5 robots.
		Robot[]rob = new Robot[5];
		//3. use a for loop to initialize the robots.
		for (int i = 0; i < rob.length; i++) {
		rob[i] = new Robot();
		//4. make each robot start at the bottom of the screen, side by side, facing up
		rob[i].setX(i * 100 + 100);
		rob[i].setY(550);
		}
		
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
		
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
  
		while (rob[0].getY() < 0 || rob[1].getY()  < 0  || rob[2].getY()  < 0 || rob[3].getY() < 0 || rob[4].getY() < 0 || rob[5].getY() < 0) {
			 for (int i = 0; i < rob.length; i++) {
					rob[i].move(rand.nextInt(1000));
					rob[i].setSpeed(1000);
					
		}
	 
		
}

		//7. declare that robot the winner and throw it a party!
    		if(rob[5].getY() == 0) {
    			rob[5].sparkle();
    		}
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	}

}