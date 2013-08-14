import javax.swing.*;

/**
 * The GreetingPanel class is a specialized JPanel class.
 * It displays a greeting for the application window.
 * @author gnelson
 *
 */

public class GreetingPanel extends JPanel
{
	/**
	 * Constructor
	 */
	
	public GreetingPanel()
	{
		// Create the label
		JLabel greeting = new JLabel("Retail Calculator");
		
		// Add the label to this panel
		add(greeting);
	}
}
