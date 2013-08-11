package recipes;

import javax.swing.JCheckBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainInterface extends JPanel {
	JTextField textBox1;
	JButton button1;
	JTextField solidIngredientTextBox;
	JTextField solidQuantityTextBox;
	JTextField liquidIngredientTextBox;
	JTextField liquidQuantityTextBox;
	JLabel selectRecipeLabel = new JLabel("Select Recipe: ");
	String[] toBeDBisfied = {"one", "two", "three"};
	JComboBox recipeDropDown = new JComboBox(toBeDBisfied);
	JButton addRecipeButton = new JButton("+");
	
	
	public MainInterface() {
		this.add(selectRecipeLabel);
		recipeDropDown.addActionListener(new RecipeDropDownListener());
		this.add(recipeDropDown);
		addRecipeButton.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				System.out.println("Plus Recipe Clicked");
			}
		});
		this.add(addRecipeButton);
		button1 = new JButton("Save Recipe");
        button1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				System.out.println("You clicked the button");
				
			}
        });      

		this.add(button1);
	}
	
	public class RecipeDropDownListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//will eventually return the name of the recipe and populate the recipe interface
			System.out.println(e.getSource().toString());
		}
	}
//	public class CheckBoxListener implements ItemListener  {
//		
//		   public void itemStateChanged(ItemEvent e) {
//			   System.out.println("Changed");
//		   }
//		
//	}
}
