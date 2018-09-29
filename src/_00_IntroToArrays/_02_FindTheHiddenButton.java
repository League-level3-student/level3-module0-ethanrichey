package _00_IntroToArrays;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* Run the FindHiddenButton.jar to see the finished product. */

public class _02_FindTheHiddenButton implements ActionListener {
	JFrame window;
	JPanel panel;
	Random rand = new Random();
	// 1. create an array of JButtons. Don't initialize it yet.
	JButton[] butt;
	// 2 create an integer variable called hiddenButton
	int hiddenButton;

	public static void main(String[] args) throws InterruptedException {
		new _02_FindTheHiddenButton().start();
	}

	public void start() throws InterruptedException {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 3. Ask the user to enter a positive number and convert it to an int
		String dialogue = JOptionPane.showInputDialog(panel, "Input a positive integer");
		int dialog = Integer.parseInt(dialogue);
		// 4. Initialize the array of JButtons to be the size of the int created in step
		JButton[] butt = new JButton[dialog];
		// 5. Make a for loop to iterate through the JButton array
		for (int i = 0; i < butt.length; i++) {
			butt[i] = new JButton();
			butt[i].addActionListener(this);
			panel.add(butt[i]);
			

		}

		// 6. initialize each JButton in the array
		
		
		// 7. add the ActionListener to each JButton
		
		// 8. add each JButton to the panel
		
		// 9 add the panel to the window
		window.add(panel);
		// 10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setExtendedState(Frame.MAXIMIZED_BOTH);
		// 11. set the JFrame to visible.
		window.setVisible(true);
		// 12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(window, "Your job is to locate the hidden button somewhere on the screen");
		// 13. initialize the hiddenButton variable to a random number less than the int created in step 3\
		hiddenButton = rand.nextInt(dialog);
		// 14. Set the text of the JButton located at hiddenButton to read "ME" butt[dialog].setText();
		butt[dialog].setText("ME");
		// 15. Use Thread.sleep(100); to pause the program.
		Thread.sleep(100);
		// 16. Set the text of the JButton located at hiddenButton to be blank.
		//butt[]
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();

		// 17. if the hiddenButton is clicked, tell the user that they win.
		if() {
			
	
}
		// 18. else tell them to try again
	}
}
