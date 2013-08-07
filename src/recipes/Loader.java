package recipes;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;


public class Loader {
	
	//public MainInterface mainInterface = null;
	
	public static void main (String [] args) {
		JFrame appFrame = new JFrame();
		appFrame.setTitle("Recipes .1a");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		appFrame.setSize((int)screenSize.getWidth()/2, (int)screenSize.getHeight()/2);
		appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appFrame.show();
	}

}
