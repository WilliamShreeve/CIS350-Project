package gvsuDatabase;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*************************************************************************
 * DatabaseGUI is the main GUI and controller for functions of the 
 * student database. It creates a JFrame to hold the JTable of students,
 * as well as create JMenuItems to perform various tasks such as 
 * saving, loading, adding, deletion, and editing.
 * @author William Shreeve, Hai Duong, Trungvuong Pham
 *
 ************************************************************************/
public class DatabaseGUI extends JFrame implements ActionListener{

	/* Holds JMenus.*/
	private JMenuBar menu;
	
	/* JMenu for file options */
	private JMenu fileMenu;
	
	/* JMenu for editing options. */
	private JMenu editMenu;
	
	/* JMenu for different views. */
	private JMenu viewMenu;
	
	/* JMenu for sorting student list. */
	private JMenu sortMenu;
	
	/*JMenu Items*/
	private JMenuItem saveSerial;
	private JMenuItem loadSerial;
	private JMenuItem addStudent;
	private JMenuItem editStudent;
	private JMenuItem deleteStudent;
	private JMenuItem viewStudent;
	private JMenuItem sortByName;
	private JMenuItem sortByGPA;
	private JMenuItem undo;
	
	/* Student Table View */
	private StudentTable studentList;
	
	/*JFrame*/
	private JPanel window;
	
	/* J Table */
	private JTable jtable;
	
	/*Key listener*/
	//private Key keyPressedListener;
	
	/******************************************************************
	 * Constructor method for DatabaseGUI. Creates the GUI, instantiates
	 * the table view class, menu items and bars, and adds scroll pane.
	 *****************************************************************/
	public DatabaseGUI() {
		window = new JPanel(new BorderLayout());
		menu = new JMenuBar();
		studentList = new StudentTable();
		
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		viewMenu = new JMenu("View");
		sortMenu = new JMenu("Sort");
		
		saveSerial = new JMenuItem("Save");
		loadSerial = new JMenuItem("Load");
		
		undo = new JMenuItem("Undo");
		
		addStudent = new JMenuItem("Add Student");
		editStudent = new JMenuItem("Edit Student");
		deleteStudent = new JMenuItem("Delete Student");
		
		viewStudent = new JMenuItem("View Student");	
		
		sortByName = new JMenuItem("Sort By Name");
		sortByGPA = new JMenuItem("Sort By GPA");
		
		jtable = new JTable(studentList);
		add(new JScrollPane(jtable));
	}
	
	/******************************************************************
	 * Method that runs the GUI program. Sets up menu and menu items,
	 * table view, and layout of the GUI.
	 *****************************************************************/
	public void run() {
		
		this.setUpMenus();
		
		setUpActionListeners();
		
		window.add(menu, BorderLayout.NORTH);
		window.add(new JScrollPane(jtable), BorderLayout.CENTER);
		this.add(window);
		
		this.setSize(1000,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Student Database");
		this.setVisible(true);
	}
	
	/******************************************************************
	 * This method adds all the required menu items to the menu choices,
	 * then adds the menu choices to the menu bar.
	 *****************************************************************/
	private void setUpMenus() {
		
		fileMenu.add(saveSerial);
		fileMenu.add(loadSerial);
		fileMenu.add(undo);
		
		editMenu.add(addStudent);
		editMenu.add(editStudent);
		editMenu.add(deleteStudent);
		
		viewMenu.add(viewStudent);
		
		sortMenu.add(sortByName);
		//sortMenu.add(sortByGPA);
		
		menu.add(fileMenu);
		menu.add(editMenu);
		//menu.add(viewMenu);
		menu.add(sortMenu);
	}
	
	/******************************************************************
	 * Sets up action listener for JMenu Items
	 *****************************************************************/
	private void setUpActionListeners() {
		saveSerial.addActionListener(this);
		loadSerial.addActionListener(this);
		addStudent.addActionListener(this);
		editStudent.addActionListener(this);
		viewStudent.addActionListener(this);
		deleteStudent.addActionListener(this);
		sortByName.addActionListener(this);
		sortByGPA.addActionListener(this);
		undo.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == saveSerial) {
			JFileChooser chooser = new JFileChooser();
			int status = chooser.showSaveDialog(null);
			if(status == JFileChooser.APPROVE_OPTION) {
				String filename = chooser.getSelectedFile().
						getAbsolutePath();
				studentList.saveAsSerialized(filename);
			}
		}
		
		else if(e.getSource() == loadSerial){
			JFileChooser chooser = new JFileChooser();
			int status = chooser.showSaveDialog(null);
			if(status == JFileChooser.APPROVE_OPTION) {
				String filename = chooser.getSelectedFile().
						getAbsolutePath();
				studentList.loadFromSerialized(filename);
			}
		}
		
		else if(e.getSource() == addStudent) {
			Student s = new Student();
			AddStudentDialog dialog = new AddStudentDialog(this, s, studentList);
			dialog.setModal(true);
			dialog.setSize(300,300);
			dialog.setVisible(true);
		}
		
		else if(e.getSource() == editStudent) {
			try {
				Student s = studentList.getAt(jtable.getSelectedRow());
				EditStudentDialog dialog = new EditStudentDialog(this, jtable.getSelectedRow(), s, studentList);
				dialog.setModal(true);
				dialog.setSize(300,300);
				dialog.setVisible(true);
			}
			catch (Exception e1){
				JOptionPane.showMessageDialog(null, "No Student Selected!");
			}

		}
		
		else if(e.getSource() == deleteStudent) {
			try {
				studentList.remove(jtable.getSelectedRow());
			}
			catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "No Student Selected!");
			}
		}
		
		else if(e.getSource() == undo) {
			studentList.undo();
		}
		
		else if(e.getSource() == sortByName) {
			studentList.sortByName();
		}
		
		else if(e.getSource() == sortByGPA) {
			
		}
	}
}
