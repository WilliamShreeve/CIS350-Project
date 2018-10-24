package gvsuDatabase;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*************************************************************************
 * EditStudentDialog creates a JDialog to allow users to select and 
 * edit a specific student, allowing them to change all values, so long 
 * as they follow the rules of the object.
 * @author William Shreeve, Hai Duong, Trungvuong Pham
 *
 ************************************************************************/
public class EditStudentDialog extends JDialog implements ActionListener{
	
	/* Default serialID */
	private static final long serialVersionUID = 1L;

	/* Label for student name*/
	private JLabel nameLabel;
	
	/* Label for major */
	private JLabel majorLabel;
	
	/* Label for G-Number */
	private JLabel gNumLabel;
	
	/* Label for Exp. Grad */
	private JLabel expGradLabel;
	
	/* Label for standing */
	private JLabel standingLabel;
	
	/* Text field for student name */
	private JTextField nameText;
	
	/* Text field for major */
	private JTextField majorText;
	
	/* Text field for G-Number */
	private JTextField gNumText;
	
	/* Text field for expected graduation */
	private JComboBox<String> gradSelection;
	
	/* Combo box for standing selection */
	private JComboBox<String> standingSelection;
	
	/* List of valid standings for combo box */
	private final String[] STANDING_LIST = {"Freshman",
			"Sophomore",
			"Junior",
			"Senior",
			"Graduate"};
	
	/* List of valid graduation dates */
	private final String[] GRAD_DATES = {"Dec. 2018",
			"April 2019",
			"Dec. 2019",
			"April 2020",
			"Dec. 2020",
			"April 2021",
			"Dec. 2021",
			"April 2022",
			"Dec. 2022",
			"April 2023"};
			
	
	/* A panel holding the box */
	private JPanel panel;
	
	/* Student variable to hold information */
	private Student student;
	
	/* Button to confirm student values */
	private JButton okButton;
	
	/* Button to cancel student values */
	private JButton cancelButton;
	
	/* List of students */
	private StudentTable studentList;
	
	/* Temporary Student to use to assign values */
	private Student temp;
	
	private int i;
	
	public EditStudentDialog(JFrame occupy, int index, Student s, StudentTable students) {
		super(occupy);
		student = s;
		studentList = students;
		temp = new Student();
		i = index;
		
		/* Instantiate panel */
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		
		panel.setPreferredSize(new Dimension(1,2));
		
		/* Create boxes to aid layout */
		Box nameBox = new Box(BoxLayout.X_AXIS);
		Box majorBox = new Box(BoxLayout.X_AXIS);
		Box gNumBox = new Box(BoxLayout.X_AXIS);
		Box expGradBox = new Box(BoxLayout.X_AXIS);
		Box standingBox = new Box(BoxLayout.X_AXIS);
		Box buttonBox = new Box(BoxLayout.X_AXIS);
		
		nameText = new JTextField(student.getName());
		nameLabel = new JLabel("Student Name");
		nameText.setColumns(25);
		nameText.setSize(30,1);
		
		nameBox.add(nameLabel);
		nameBox.add(Box.createHorizontalStrut(76));
		nameBox.add(nameText);
		panel.add(nameBox);
		
		majorText = new JTextField(student.getMajor());
		majorLabel = new JLabel("Major of Study");
		majorText.setColumns(25);
		
		majorBox.add(majorLabel);
		majorBox.add(Box.createHorizontalStrut(100));
		majorBox.add(majorText);
		panel.add(majorBox);
			
		gNumText = new JTextField(student.getGNum());
		gNumLabel = new JLabel("G-Number");
		gNumText.setColumns(25);
		
		gNumBox.add(gNumLabel);
		gNumBox.add(Box.createHorizontalStrut(100));
		gNumBox.add(gNumText);
		panel.add(gNumBox);
		
		gradSelection = new JComboBox<String>(GRAD_DATES);
		expGradLabel = new JLabel("Exp. Grad");
		
		
		expGradBox.add(expGradLabel);
		expGradBox.add(Box.createHorizontalStrut(100));
		expGradBox.add(gradSelection);
		panel.add(expGradBox);
		gradSelection.setSelectedItem(student.getExpGrad());
		
		
		standingSelection = new JComboBox<String>(STANDING_LIST);
		standingLabel = new JLabel("Class Standing");
		
		
		standingBox.add(standingLabel);
		standingBox.add(Box.createHorizontalStrut(20));
		standingBox.add(standingSelection);
		panel.add(standingBox);
		standingSelection.setSelectedItem(student.getStanding());
		
		okButton = new JButton("OK");
		cancelButton = new JButton("Cancel");
		ButtonListener listener = new ButtonListener();
		okButton.addActionListener(listener);
		cancelButton.addActionListener(listener);
		
		buttonBox.add(okButton);
		buttonBox.add(Box.createHorizontalStrut(20));
		buttonBox.add(cancelButton);
		
		panel.add(Box.createVerticalStrut(20));
		
		panel.add(buttonBox);
		
		panel.add(Box.createVerticalStrut(20));
		
		panel.setVisible(true);
		
		add(panel);
	}
	
	private class ButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(okButton == e.getSource()) {
				try {
					temp.setName(nameText.getText());
					temp.setMajor(majorText.getText());
					temp.setGNum(gNumText.getText());
					temp.setStanding(standingSelection.getSelectedItem().toString());
					temp.setExpGrad(gradSelection.getSelectedItem().toString());
					
					if(studentList.isValidGNum(temp)) {
						studentList.replaceAt(temp, i);
					}
					
					else
						JOptionPane.showMessageDialog(null, "Invalid G-Number");
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Invalid Value(s)!");
				}
				
			}
			
			dispose();
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}