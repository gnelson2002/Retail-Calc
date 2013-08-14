import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

import java.awt.event.ActionEvent;





/**
 * The SalesConverter class takes the users item input and calculates the sale
 * cost for the item. It will display the item and the discounted price.
 * @author gnelson
 *
 */
public class SalesConverter extends JFrame
{
	// The following variables will reference the
	// custom panel objects
	private DepartmentPanel deparment; // Department Panel
	private GreetingPanel greeting; // To display a greeting
	private ItemPanel item;  // Item Panel
	private PricePanel price; // Price Panel
	private JTextField itemTextField; // To hold user input for the item
	private JTextField priceTextField; // To hold user input for the price
	private JTextField saleTextField; // To hold user input for sale discount
	
	

	// The following variables will reference objects 
	// needed to add the Calculate and Exit button.
	private JPanel buttonPanel; // To hold the buttons
	private JButton calcButton; // To Calculate the cost
	private JButton exitButton; // To exit the application
	
	/**
	 * Constructor
	 */
	
	public SalesConverter()
	{
		// Display a title
		super("Sale Calculator");
		
	
		// Specify an action for  the close button
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Create a BorderLayout manager for
		// the content pane.
		setLayout(new BorderLayout());
		
		
		// Create the custom panels
		greeting = new GreetingPanel();
		deparment = new DepartmentPanel();
		item = new ItemPanel();
		price = new PricePanel();
	
		
		// Call the buildButtonPanel method to
		// create the button panel.
		buildButtonPanel();
		
		//Add the components to the content pane.
		add(greeting, BorderLayout.NORTH);
		add(deparment, BorderLayout.WEST);
		add(item, BorderLayout.CENTER);
		add(price, BorderLayout.EAST);
		add(buttonPanel, BorderLayout.SOUTH);
		
		
		// Pack the contents of the window and display it
		pack();
		setVisible(true);
	

	}
	


	private void buildButtonPanel() 
	{
		
		// Create a panel for buttons.
		buttonPanel = new JPanel();
		
		// Create the buttons.
		calcButton = new JButton("Calculate");
		exitButton = new JButton("Exit");
		
	
		exitButton.addActionListener(new ExitButtonListener());
		calcButton.addActionListener(new CalcButtonListener());
		
		// Add the buttons to the button panel
		buttonPanel.add(calcButton);
		buttonPanel.add(exitButton);
	
	}
	
	
	// Calc button function
	private class CalcButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			
			// Shows the user the entered information
			JOptionPane.showMessageDialog(null, "The Deparment: " + deparment.getDepartmentLocation()
					+ "\n" + "The Item On Sale Is: " + item.getItem() 
					+ "\n" + "The Sale Price is $" + price.getTotal());
			
		}
	}
	
	// Exit button function
	private class ExitButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		System.exit(0);
		}
	}
	
	
}
