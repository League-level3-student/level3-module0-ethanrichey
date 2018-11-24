package _02_Firework_Display;

import java.awt.Color;
import java.awt.Graphics;
import java.lang.reflect.Array;
import java.util.Random;

/*
 * 
 * You can think of a fire work as an array of sparks. Run the demo jar to see the finished product
 * then complete the steps. 
 *
 */

public class Firework{
	public static final int GRAVITY = 1;
	
	//1. Create an array of Spark objects called sparks. Don't initialize it.
	
	Spark[] sp;
	public boolean dead = false;
	
	public Firework() {
		//2. Initialize the Spark array to contain 100 Sparks. 
Spark[] sp = new Spark[100];
		
		//3. Iterate through the sparks and initialize each one to a new Spark.
		//   Make each spark start at the middle bottom of the screen.
	
for(int i = 0; i < sp.length; i ++) {
	
	sp[i].x = 50;
	sp[i].y = 200;

	}
}
	
	
	public void launch() {
		//4. Iterate through the sparks and reset their x and y location
		//   to their original starting point.
		for (int i = 0; i < sp.length; i++) {
			sp[i].x = 100;
			sp[i].y = 200;
		}
		
	}
	
	public void updateSparks() {
		//8. Uncomment this code. See if you can understand what it is doing.
		
	for(int i = 0; i < sp.length; i++) {

		Spark s = sp[i];
		s.x += s.xVelocity;
			s.y += s.yVelocity;
			s.yVelocity += GRAVITY;
			
			if(s.yVelocity >= 0 && !s.fire) {
				Random r = new Random();
				s.xVelocity = r.nextInt(40) - 20;
				s.yVelocity += -r.nextInt(10) - 5;
				s.size = r.nextInt(7) + 2;
				s.fire = true;
			}
			
			if(s.y >= FireworkDisplay.HEIGHT) {
				s.dead = true;
			}
		}
		
		for(int i = 0; i < sp.length; i++) {
			if(!sp[i].dead) {
				dead = false;
				break;
			}
			dead = true;
		}
	}
	
	public void drawSparks(Graphics g) {
		//5. Iterate through each spark
		for (Spark s: sp) {
			g.setColor(Color.BLUE);
			//7. Fill in an oval using the spark's x, y, and size with g.fillOval()
		g.fillOval(s.x, s.y, s.size, s.size);
		}
			//6. Set the color to the spark's color with g.setColor()
		
	}
}
