package gvsuDatabase;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DatabaseGUI extends JFrame implements ActionListener{

	/* Holds JMenus.*/
	private JMenuBar menu;
	
	/* JMenu for file options */
	private JMenu fileMenu;
	
	/* JMenu for editing options. */
	private JMenu editMenu;
	
	/* JMenu for different views. */
	private JMenu viewMenu;
	
	/*JMenu Items*/
	private JMenuItem saveSerial;
	private JMenuItem loadSerial;
	private JMenuItem addStudent;
	private JMenuItem editStudent;
	private JMenuItem viewStudent;
	
	/* Student Table View */
	private StudentTable studentList;
	
	/*JFrame*/
	private JPanel window;
	
	/* J Table */
	private JTable jtable;
	
	/*Key listener*/
	//private Key keyPressedListener;
	
	
	public DatabaseGUI() {
		window = new JPanel(new BorderLayout());
		menu = new JMenuBar();
		studentList = new StudentTable();
		
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		viewMenu = new JMenu("View");
		
		saveSerial = new JMenuItem("Save");
		loadSerial = new JMenuItem("Load");
		
		addStudent = new JMenuItem("Add Student");
		editStudent = new JMenuItem("Edit Student");
		viewStudent = new JMenuItem("View Stuent");		
		
		jtable = new JTable(studentList);
		add(new JScrollPane(jtable));
	}
	
	public void run() {
		
		this.setUpMenus();
		
		setUpActionListeners();
		
		window.add(menu, BorderLayout.NORTH);
		window.add(jtable, BorderLayout.CENTER);
		this.add(window);
		
		this.setSize(1000,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Student Database");
		this.setVisible(true);
	}
	
	public void setUpMenus() {
		

		fileMenu.add(saveSerial);
		fileMenu.add(loadSerial);
		
		editMenu.add(addStudent);
		editMenu.add(editStudent);
		
		viewMenu.add(viewStudent);
		
		menu.add(fileMenu);
		menu.add(editMenu);
		menu.add(viewMenu);
	}
	
	private void setUpActionListeners() {
		saveSerial.addActionListener(this);
		loadSerial.addActionListener(this);
		addStudent.addActionListener(this);
		editStudent.addActionListener(this);
		viewStudent.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == saveSerial) {
			JFileChooser chooser = new JFileChooser();
			int status = chooser.showSaveDialog(null);
			if(status == JFileChooser.APPROVE_OPTION) {
				String filename = chooser.getSelectedFile().
						getAbsolutePath();
			}
		}
		else if(e.getSource() == loadSerial){
			JFileChooser chooser = new JFileChooser();
			int status = chooser.showSaveDialog(null);
			if(status == JFileChooser.APPROVE_OPTION) {
				String filename = chooser.getSelectedFile().
						getAbsolutePath();
			}
		}
		else if(e.getSource() == addStudent) {
			Student s = new Student();
			AddStudentDialog dialog = new AddStudentDialog(this, s, studentList);
			dialog.setModal(true);
			dialog.setSize(300,300);
			dialog.setVisible(true);
			}
		}
		
	
	
}
