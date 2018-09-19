package gvsuDatabase;

import javax.swing.table.AbstractTableModel;


public class StudentTable extends AbstractTableModel{
	
	
	private static final long serialVersionUID = 1L;
	
	
	private String[] columnNames = {"Name",
	                                "Major",
	                                "Standing",
	                                "G-Number",
	                                "Exp. Grad"}; 

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columnNames.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
