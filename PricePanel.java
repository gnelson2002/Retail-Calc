import java.awt.GridLayout;

import javax.swing.*;

/**
 * PricePanel class allows the user to input the items price
 * @author gnelson
 *
 */
public class PricePanel extends JPanel
{
	
	private JLabel messagePriceLabel; // A message to enter price
	private JTextField priceTextField; // To hold user input for the price
	private JLabel messageSaleLabel; // A message to enter sales
	private JTextField saleTextField; // To hold user input for sale discount
	
	/**
	 * Constructor
	 */
	
	public PricePanel()
	{
		
		// Create a GridLayout manager with
				//five rows and one column.
				setLayout(new GridLayout(4, 1));
				
		// Creates label and text field
		messagePriceLabel = new JLabel("Enter Item Price");
		priceTextField = new JTextField(10);
		
		// Creates label and text field
		messageSaleLabel = new JLabel("Enter Sale % With Decimal");
		saleTextField = new JTextField(10);
				
			
				// Add a border around the panel.
			    setBorder(BorderFactory.createTitledBorder("Sale Discount"));
			
				// Adds message and text field to this panel
				add(messagePriceLabel);
				add(priceTextField);
			
			    // Adds message and text field to this panel
				add(messageSaleLabel);
				add(saleTextField);
	}
	
	public Double getTotal()
	{
		double salePrice;
		double total;
		Double p  = Double.parseDouble(priceTextField.getText());
		Double s = Double.parseDouble(saleTextField.getText());
		
		salePrice =  p *s ;
		
		return total = p - salePrice;
		
		
	}
}
