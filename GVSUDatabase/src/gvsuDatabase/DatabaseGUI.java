package gvsuDatabase;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.*;

public class DatabaseGUI extends JFrame implements ActionListener{

	/* Holds JMenus.*/
	private JMenuBar menus;
	
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
	
	
	public DatabaseGUI() {
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		viewMenu = new JMenu("View");
		
		saveSerial = new JMenuItem("Save");
		loadSerial = new JMenuItem("Load");
		addStudent = new JMenuItem("Add Student");
		editStudent = new JMenuItem("Edit Student");
		viewStudent = new JMenuItem("View Stuent");
		
		fileMenu.add(saveSerial);
		fileMenu.add(loadSerial);
		
		editMenu.add(addStudent);
		editMenu.add(editStudent);
		
		viewMenu.add(viewStudent);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
