package gvsuDatabase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Comparator;
import java.util.LinkedList;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/***********************************************************************
 * The StudentTable class is the structure that all rows in the JTable 
 * will follow.
 **********************************************************************/
public class StudentTable extends AbstractTableModel{
	
	/** default serial ID */
	private static final long serialVersionUID = 1L;
	
	/** array of the column names */
	private final String[] COL_NAMES = {"Name",
            "Major",
            "Standing",
            "G-Number",
            "Exp. Grad"};;
	
	/** ArrayList of students */
	private ArrayList<Student> students;
	
	/** ArrayList of past edits */
	private ArrayList<String> edits;

	/*******************************************************************
	 * The default constructor that initializes the list of students
	 * and sets the column names.
	 ******************************************************************/
	public StudentTable(){
		students = new ArrayList<Student>();

		edits = new ArrayList<String>();
	}
	
	/*******************************************************************
	 * Gets the row count
	 * 
	 * @return Returns the number of students
	 ******************************************************************/
	public int getRowCount() {
		// TODO Auto-generated method stub
		return students.size();
	}

	/*******************************************************************
	 * Gets the column count
	 * 
	 * @return Returns the number of columns
	 ******************************************************************/
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return COL_NAMES.length;
	}
	
	/*******************************************************************
	 * Gets the column name at a specific index
	 * 
	 * @param col the column index you want the name of
	 * @return returns the name of the specified column
	 ******************************************************************/
	@Override
	public String getColumnName(int col) {
		return COL_NAMES[col];
	}

	/*******************************************************************
	 * Gets the value at a specific row and column
	 * 
	 * @param rowIndex the specified row
	 * @param columnIndex the specified column
	 * @return returns the object at the specified row and column
	 ******************************************************************/
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		switch (columnIndex) {
		case 0:
			return students.get(rowIndex).getName();
		case 1:
			return students.get(rowIndex).getMajor();
		case 2:
			return students.get(rowIndex).getStanding();
		case 3:
			return students.get(rowIndex).getGNum();
		case 4:
			return students.get(rowIndex).getExpGrad();
		}
	return null;
	}
	
	/*******************************************************************
	 * Gets the list of students
	 * 
	 * @return An ArrayList of all students
	 ******************************************************************/
	public ArrayList<Student> getStudents(){
		return students;
	}
	
	/*******************************************************************
	 * Private helper method that calls fireTableRowsInserted which
	 * refreshes the table
	 ******************************************************************/
	private void refresh() {
		fireTableRowsInserted(0, getRowCount() - 1);
	}
	
	/*******************************************************************
	 * Gets the site at the requested index
	 * 
	 * @param index the index of the requested site
	 * @return the site at the specified index
	 ******************************************************************/
	public Student getAtIndex(int index) {
		return students.get(index);
	}
	/*******************************************************************
	 * Adds a site to the list (and updates the view)
	 * 
	 * @param site the site to be added to the list (and view)
	 ******************************************************************/
	public void add(Student student) {
		students.add(student);
		refresh();
		edits.add("D," + (getRowCount() - 1));
	}

	/*******************************************************************
	 * Removes a site from the list (and updates the view)
	 * 
	 * @param index the index in the list to be removed
	 ******************************************************************/
	public void remove(int index) {
		edits.add("I," + getAtIndex(index));
		students.remove(index);
		refresh();
	}
	
	/*******************************************************************
	 * Helper method that undo's previous operations
	 ******************************************************************/
	public void undo() {
		if (edits.size() > 0) {
			String execute = edits.get(edits.size() - 1);
			String[] items = execute.split(",");
			
			switch (items[0]) {
				case "D":
					remove(Integer.parseInt(items[1]));
					edits.remove(edits.size() - 1);
					break;
				case "I":
					String input = "";
					for (int i = 1; i < items.length; i++) 
						input += (items[i] + ",");
					try {
						Student retVal = stringToStudent(input);
						add(retVal);
						edits.remove(edits.size() - 1);
					}
					catch (Exception ex) {
						JOptionPane.showMessageDialog(null, 
								ex.getMessage());
					}
					break;
			}
		}
		refresh();
	}
	
	/*******************************************************************
	 * Converts a string input into a Student object
	 * 
	 * @param input The values to be converted into a Student object
	 * @return Student object that holds the same information as the 
	 * passed in values
	 * 
	 * @throws Exception When there are incorrect values
	 ******************************************************************/
	public Student stringToStudent(String input) throws Exception {
		String[] items = input.split(",");
		
		if (items.length == 6) {
			GregorianCalendar date = new GregorianCalendar();
			String[] parsedDate = items[2].split("/");
			date.set(GregorianCalendar.MONTH, Integer.parseInt
					(parsedDate[0]) - 1);
			date.set(GregorianCalendar.DAY_OF_MONTH, Integer.parseInt
					(parsedDate[1]));
			date.set(GregorianCalendar.YEAR, Integer.parseInt
					(parsedDate[2]));
			
		}
		else {
			throw new Exception("File is corrupted");
		}
		return null;
	}
	
	/******************************************************************
	 * This method checks that there is no duplicate G-Numbers and that
	 * it starts with a G.
	 * @param s Student to check G-number
	 * @return True if valid, false if invalid.
	 ******************************************************************/
	public boolean isValidGNum(Student s) {
		for(Student s1: students) {
			if(s1.getGNum() == s.getGNum())
				return false;
		}
		return true;
	}
	
	/*******************************************************************
	 * This method sorts the students by name using a sort class called 
	 * SortByName().
	 ******************************************************************/
	public void sortByName(){
		Collections.sort(getStudents(), new SortByName());
		refresh();
	}
	
	/*******************************************************************
	 * This method sorts the students by name.
	 * 
	 * @return The alphabetical order between two  names
	 ******************************************************************/
	private class SortByName implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
		 return o1.getName().compareTo(o2.getName());
		}
	}
	
	/*******************************************************************
	 * This method sorts the standings of the students, 
	 * using an anonymous class in Java.
	 * 
	 * @return The order in which the standings are
	 ******************************************************************/
	public void sortByStanding(){
		Collections.sort(getStudents(), new Comparator<Student>() {
			   public int compare (Student o1, Student o2) {
				   return o1.getStanding().compareTo(o2.getStanding());
			   }});
		refresh();
	}
}
