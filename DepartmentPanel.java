import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * The DepartmentPanel class allows the user to select what
 * department for the sale price
 * @author gnelson
 *
 */
public class DepartmentPanel extends JPanel
{
	
	// The following variables will reference radio
	// buttons for each department.
	private JRadioButton womenClothes;
	private JRadioButton menClothes;
	private JRadioButton kidClothes;
	private JRadioButton shoes;
	private JRadioButton intimates;
	
	// The following variable will reference a 
	// ButtonGroup object to group the radio buttons.
	private ButtonGroup bg;
	
	
	/**
	 * Constructor
	 */
	
	public DepartmentPanel()
	{
		// Create a GridLayout manager with
		//five rows and one column.
		setLayout(new GridLayout(5, 1));
		
		// Create the radio buttons
		womenClothes = new JRadioButton("Women's Clothes", true);
		menClothes = new JRadioButton("Men's Clothes");
		kidClothes = new JRadioButton("Kid's Clothes");
		shoes = new JRadioButton("Shoes");
		intimates = new JRadioButton("Intimates");
		
		// Group the radio buttons.
		bg = new ButtonGroup();
		bg.add(womenClothes);
		bg.add(menClothes);
		bg.add(kidClothes);
		bg.add(shoes);
		bg.add(intimates);
		
		// Add a border around the panel.
		setBorder(BorderFactory.createTitledBorder("Department"));
		
	
		
		// Add the radio buttons to this panel
		add(womenClothes);
		add(menClothes);
		add(kidClothes);
		add(shoes);
		add(intimates);

	}
	
		// Method to show what department has been selected
		public String getDepartmentLocation()
		{
			
			
			if(womenClothes.isSelected() )
			{
				return womenClothes.getText();
			}
			if(menClothes.isSelected() )
			{
				return menClothes.getText();
			}
			if (kidClothes.isSelected() )
			{
				return kidClothes.getText();
			}
			if (shoes.isSelected() )
			{
				return shoes.getText();
			}
		
			if (intimates.isSelected() )
			{
				return intimates.getText();
			}
	
				return null;
		}

		
		
	}


