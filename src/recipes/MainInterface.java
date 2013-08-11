package recipes;

import javax.swing.JCheckBox;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

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
	JPanel recipePanel = new JPanel();
	
	public MainInterface() {
		this.add(selectRecipeLabel);
		recipeDropDown.addActionListener(new RecipeDropDownListener());
		this.add(recipeDropDown);
		addRecipeButton.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				final JFrame junk = new JFrame("Add a new recipe");
				junk.setSize(MainInterface.this.getWidth()/4, MainInterface.this.getHeight()/4);
				final JTextField newRecipeTextBox = new JTextField(10);
				JPanel region = new JPanel();
				JLabel newRecipeLabel = new JLabel("Name: ");
				region.add(newRecipeLabel);
				region.add(newRecipeTextBox);
				JButton cancel = new JButton("Cancel");
				cancel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//TODO - make better memory management
						junk.setVisible(false);
					}
				});
				JButton okay = new JButton("Save");
				okay.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//TODO - memory mgmt as well as dB interaction needs
						//to be implement
						System.out.println("Closed with a save of: " + newRecipeTextBox.getText());
						junk.setVisible(false);
					}
				});
				region.add(cancel);
				region.add(okay);
				junk.add(region);
				junk.setVisible(true);
				
			}
		});
		this.add(addRecipeButton);
		button1 = new JButton("Save Recipe");
        button1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

				
			}
        });      

		this.add(button1);
		
		recipePanel.setBorder(new TitledBorder("Recipe"));
		recipePanel.setSize(500, 500);
		this.add(recipePanel);
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
