package recipes;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainInterface extends JPanel {
	String title;
	
	public MainInterface(String title) {
		this.title = title;
		JLabel label = new JLabel(title);
		this.add(label);
	}

}
