import javax.swing.*;

/**
 * ItemPanel class allows the user to input an item
 * @author gnelson
 *
 */
public class ItemPanel extends JPanel
{
	
	private JLabel messageItemLabel; // A message to enter item
	private JTextField itemTextField; // To hold user input for the item
	
	public ItemPanel()
	{
		// Creates label and text field
		messageItemLabel = new JLabel("Enter Sale Item");
		itemTextField = new JTextField(10);
		
		// Add a border around the panel.
		setBorder(BorderFactory.createTitledBorder("Item"));
		
		
		// Adds message and text field to this panel
		add(messageItemLabel);
		add(itemTextField);

	}
	
	// Method to get the users input
	public String getItem()
	{
		
		 // Get the item for the sale
			return	itemTextField.getText();
	}
}
