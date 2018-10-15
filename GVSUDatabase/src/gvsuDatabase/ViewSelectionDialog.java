package gvsuDatabase;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ViewSelectionDialog extends JDialog implements ActionListener{

	/** default serial ID */
	private static final long serialVersionUID = 1L;
	
	/** JButtons for the JDialog*/
	private JButton okButton, cancelButton;

	/** Close Status */
	private boolean closeStatus;
	
	/** JDialog */
	private JDialog dialog;

	/** JFrame */
	private JFrame parentFrame;

	/** JPanel */
	private JPanel panel;
	
	
	/*******************************************************************
	 * A constructor method that creates the JDialogBox 
	 * with the input of a JFrame.
	 * 
	 * @param parent The JFrame that holds the JDialogBox
	 ******************************************************************/
	public ViewSelectionDialog(JFrame parent) {
		
		/** sets up the parent Frame */
		parentFrame = parent;

		/** creates the JDialog */
		dialog = new JDialog();

		/** creates the JButtons */
		okButton = new JButton("OK");
		cancelButton = new JButton("Cancel");
		
		/** sets the flag to false for when JDialog opens */
		closeStatus = false;

		/** Instantiates the buttons of JDialog */
		okButton.addActionListener(this);
		cancelButton.addActionListener(this);

		/** Creates JPanel and adds on items */
		panel = new JPanel();
		panel.add(Box.createVerticalStrut(5));
		panel.add(Box.createVerticalStrut(5));
		panel.add(okButton);
		panel.add(cancelButton);
		

		/** Sets the layout of panel */
		panel.setLayout(new GridLayout(4, 2));

		/** Adds the panel to the JDialog */
		dialog.add(panel);

		/** Sets specifics for JDialog */
		dialog.setLocationRelativeTo(parentFrame);
		dialog.setModal(true);
		dialog.setTitle("Check Out");
		dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		dialog.setSize(400, 300);
		dialog.setVisible(true);
	}
	
	/*******************************************************************
	 * Handles the actions of the buttons for dialog box.
	 * 
	 * @param e The ActionEvent that determines the action
	 ******************************************************************/
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == okButton){
				closeStatus = true;
				dialog.dispose();
		}
		if (e.getSource() == cancelButton)
			dialog.dispose();
	}	
	
	/*******************************************************************
	 * Getter method for closeStatus
	 * 
	 * @return closeStatus Status of JDialog when user exits it
	 ******************************************************************/
	public boolean getCloseStatus() {
		return closeStatus;
	}
}
