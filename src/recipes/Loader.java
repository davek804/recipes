package recipes;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;


public class Loader {
	
	public static MainInterface mainInterface = null;
	
	public static void main (String [] args) {
		JFrame appFrame = new JFrame();
		appFrame.setTitle("Recipes");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		appFrame.setSize((int)screenSize.getWidth()/2, (int)screenSize.getHeight()/2);
		appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Show center screen Jpanel
		mainInterface = new MainInterface();
		appFrame.add(mainInterface);
		
		appFrame.show();
	}

}
