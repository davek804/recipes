package recipes;

import javax.swing.JCheckBox;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class MainInterface extends JPanel {
	JButton recipeSaveButton = new JButton("Save Recipe");
	JTextField solidIngredientTextBox;
	JTextField solidQuantityTextBox;
	JTextField liquidIngredientTextBox;
	JTextField liquidQuantityTextBox;
	JLabel selectRecipeLabel = new JLabel("Select Recipe: ");
	String[] toBeDBisfied = {"one", "two", "three"};
	JComboBox recipeDropDown = new JComboBox(toBeDBisfied);
	JButton addRecipeButton = new JButton("+");
	JPanel recipePanel = new JPanel();
	JTable recipesContainer;
	
	public MainInterface() {
		this.add(selectRecipeLabel);
		recipeDropDown.addActionListener(new RecipeDropDownListener());
		this.add(recipeDropDown);
		addRecipeButton.addActionListener(new AddRecipeListener());
		this.add(addRecipeButton);
        recipeSaveButton.addActionListener(new SaveRecipeListener());   

		this.add(recipeSaveButton);
		
		recipePanel.setBorder(new TitledBorder("Recipe"));
		recipePanel.setSize(500, 500);
		this.add(recipePanel);
	}
	
	public class RecipeDropDownListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//TODO - will eventually return the name of the recipe and populate the recipe interface
			System.out.println(e.getSource().toString());
		}
	}
	
	public class AddRecipeListener implements ActionListener {
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
					if (newRecipeTextBox.getText().length() >= 1){
						
						//TODO - memory mgmt as well as dB interaction needs
						//to be implement
						System.out.println("Closed with a save of: " + newRecipeTextBox.getText());
						junk.setVisible(false);
					}
					else {
						return;
					}
					}
				
			});
			region.add(cancel);
			region.add(okay);
			junk.add(region);
			junk.setVisible(true);
			
		}
	}
	
	public class SaveRecipeListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			System.out.println("Save Recipe button clicked");
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
