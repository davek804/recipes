package recipes;

import javax.swing.JCheckBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainInterface extends JPanel {
	String title;
	JCheckBox checkBox1;
	JTextField textBox1;
	JButton button1;
	
	public MainInterface(String title) {
		this.title = title;
		checkBox1 = new JCheckBox(title);
		checkBox1.addItemListener(new CheckBoxListener());
		this.add(checkBox1);
		
		button1 = new JButton("Button 1");
        button1.addActionListener(new ActionListener() {
        	 
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
                System.out.println("You clicked the button");
            }
        });      
 
		
		
		this.add(button1);
		
		
	}
	
	public class CheckBoxListener implements ItemListener  {
		
		   public void itemStateChanged(ItemEvent e) {
	            if(e.getStateChange() == 0){
	                System.out.println("0 has been selected");
	                }
	            if (e.getStateChange() == 1) {
	            	System.out.println("1");
	            }
	        }
		
	}
}
