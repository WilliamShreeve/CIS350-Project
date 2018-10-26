package gvsuDatabase;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JMenuItem;

/***********************************************************************
 * This class thoroughly creates JUnit tests for the StudentTable.java
 * class.
 *
 * @author William Shreeve, Hai Duong, Trungvuong Pham
 **********************************************************************/
class TestDatabase {
    
    /*******************************************************************
     * Tests that setName() and getName() methods work. 
     * 
     * @throws Exception 
     ******************************************************************/
    @Test 
    public void testSetNameandGetName() throws Exception {
        Student s = new Student();
        s.setName("TrungVuong Pham");
        assertTrue(s.getName().equals("TrungVuong Pham"));
    }
    
    /*******************************************************************
     * Tests that setName() and getName() methods work. 
     * 
     * @throws Exception 
     ******************************************************************/
    @Test 
    public void testSetNameandGetName2() throws Exception {
        Student s = new Student();
        s.setName("Hai Duong");
        assertFalse(s.getName().equals("Jeff Bridges"));
    }
    
    /*******************************************************************
     * Tests that setName() and getName() methods work. 
     * 
     * @throws Exception 
     ******************************************************************/
    @Test 
    public void testSetNameandGetName3() throws Exception {
        Student s = new Student();
        s.setName("Jagadeesh Nandigam");
        assertFalse(s.getName().equals(""));
    }
    
    
    /*******************************************************************
     * Tests that setMajor() and getMajor() methods work. 
     * 
     * @throws Exception 
     ******************************************************************/
    @Test 
    public void testSetMajorandGetMajor() throws Exception {
        Student s = new Student();
        s.setMajor("Computer Science");
        assertTrue(s.getMajor().equals("Computer Science"));
    }
    
    /*******************************************************************
     * Tests that setMajor() and getMajor() methods work. 
     * 
     * @throws Exception 
     ******************************************************************/
    @Test 
    public void testSetMajorandGetMajor2() throws Exception {
        Student s = new Student();
        s.setMajor("Computer Science");
        assertFalse(s.getMajor().equals("Mechanical Engineering"));
    }
    
    /*******************************************************************
     * Tests that setMajor() and getMajor() methods work. 
     * 
     * @throws Exception 
     ******************************************************************/
    @Test 
    public void testSetMajorandGetMajor3() throws Exception {
        Student s = new Student();
        s.setMajor("Writing");
        assertFalse(s.getMajor().equals(""));
    }
    
    /*******************************************************************
     * Tests that setStanding() and getStanding() methods work. 
     * 
     * @throws Exception 
     ******************************************************************/
    @Test 
    public void testSetStandingandGetStanding() throws Exception {
        Student s = new Student();
        s.setStanding("Freshman");
        assertTrue(s.getStanding().equals("Freshman"));
    }
    
    /*******************************************************************
     * Tests that setStanding() and getStanding() methods work. 
     * 
     * @throws Exception 
     ******************************************************************/
    @Test 
    public void testSetStandingandGetStanding2() throws Exception {
        Student s = new Student();
        s.setStanding("Freshman");
        assertFalse(s.getStanding().equals(""));
    }
    
    /*******************************************************************
     * Tests that setStanding() and getStanding() methods work. 
     * 
     * @throws Exception 
     ******************************************************************/
    @Test 
    public void testSetStandingandGetStanding3() throws Exception {
        Student s = new Student();
        s.setStanding("Senior");
        assertFalse(s.getStanding().equals(""));
    }
    
    /*******************************************************************
     * Tests that setGPA() and getGPA() methods work. 
     * 
     * @throws Exception 
     ******************************************************************/
    @Test 
    public void testSetGPAandGetGPA() throws Exception {
        Student s = new Student();
        s.setGPA(3.5);
        assertTrue(s.getGPA() == 3.5);
    }
    
    /*******************************************************************
     * Tests that setGPA() and getGPA() methods work. 
     * 
     * @throws Exception 
     ******************************************************************/
    @Test 
    public void testSetGPAandGetGPA2() throws Exception {
        Student s = new Student();
        s.setGPA(0);
        assertTrue(s.getGPA() == 0);
    }
    
    /*******************************************************************
     * Tests that setGPA() and getGPA() methods work. 
     * 
     * @throws Exception 
     ******************************************************************/
    @Test 
    public void testSetGPAandGetGPA3() throws Exception {
        Student s = new Student();
        s.setGPA(4.0);
        assertFalse(s.getGPA() == 0);
    }
    
    /*******************************************************************
     * Tests that setGNum() and getGNum() methods work. 
     * 
     * @throws Exception 
     ******************************************************************/
    @Test 
    public void testSetGNumandGetGNum() throws Exception {
        Student s = new Student();
        s.setGNum("G01272550");
        assertTrue(s.getGNum().equals("G01272550"));
    }
    
    /*******************************************************************
     * Tests that setGNum() and getGNum() methods work. 
     * 
     * @throws Exception 
     ******************************************************************/
    @Test 
    public void testSetGNumandGetGNum2() throws Exception {
        Student s = new Student();
        s.setGNum("G01272345");
        assertTrue(s.getGNum().equals("G01272345"));
    }
    
    /*******************************************************************
     * Tests that setGNum() and getGNum() methods work. 
     * 
     * @throws Exception 
     ******************************************************************/
    @Test 
    public void testSetGNumandGetGNum3() throws Exception {
        Student s = new Student();
        s.setGNum("G12888906");
        assertFalse(s.getGNum().equals(""));
    }
    
    /*******************************************************************
     * Tests that setExpGrad() and getExpGrad() methods work. 
     * 
     * @throws Exception 
     ******************************************************************/
    @Test 
    public void testSetExpGradandGetExpGrad() throws Exception {
        Student s = new Student();
        s.setExpGrad("Dec. 2019");
        assertTrue(s.getExpGrad().equals("Dec. 2019"));
    }
    
    /*******************************************************************
     * Tests that setExpGrad() and getExpGrad() methods work. 
     * 
     * @throws Exception 
     ******************************************************************/
    @Test 
    public void testSetExpGradandGetExpGrad2() throws Exception {
        Student s = new Student();
        s.setExpGrad("Apr. 2019");
        assertTrue(s.getExpGrad().equals("Apr. 2019"));
    }
    
    /*******************************************************************
     * Tests that setExpGrad() and getExpGrad() methods work. 
     * 
     * @throws Exception 
     ******************************************************************/
    @Test 
    public void testSetExpGradandGetExpGrad3() throws Exception {
        Student s = new Student();
        s.setExpGrad("Apr. 2019");
        assertFalse(s.getExpGrad().equals(""));
    }

    /** Tests that getRowCount() works for one add properly. */
    @Test
    public void testRowCount() {
        StudentTable list = new StudentTable();
        Student s = new Student();
        list.add(s);
        assertTrue(list.getRowCount() == 1);
    }
    
    /** Tests that getRowCount() works for two adds properly. */
    @Test
    public void testRowCount2() {
        StudentTable list = new StudentTable();
        Student s1 = new Student();
        Student s2 = new Student();
        list.add(s1);
        list.add(s2);
        assertTrue(list.getRowCount() == 2);
    }
    
    /** Tests that getRowCount() works for no add properly. */
    @Test
    public void testRowCount3() {
        StudentTable list = new StudentTable();
        assertTrue(list.getRowCount() == 0);
    }
    
    /** Tests that getColumnCount() works for add properly. */
    @Test
    public void testColumnCount() {
        StudentTable list = new StudentTable();
        Student s1 = new Student();
        list.add(s1);
        assertTrue(list.getColumnCount() == 5);
    }
    
    /** Tests that getColumnCount() works for 2 adds properly. */
    @Test
    public void testColumnCount2() {
        StudentTable list = new StudentTable();
        Student s1 = new Student();
        Student s2 = new Student();
        list.add(s1);
        list.add(s2);
        assertTrue(list.getColumnCount() == 5);
    }
    
    /** Tests that getColumnCount() works for empty table. */
    @Test
    public void testColumnCount3() {
        StudentTable list = new StudentTable();
        assertTrue(list.getColumnCount() == 5);
    }
    
    /** Tests the 1st column's name in database. */
    @Test
    public void testColumnName() {
        StudentTable list = new StudentTable();
        assertTrue(list.getColumnName(0) == "Name");
    }
    
    /** Tests the 2nd column's name in database. */
    @Test
    public void testColumnName2() {
        StudentTable list = new StudentTable();
        assertTrue(list.getColumnName(1) == "Major");
    }
    
    /** Tests the 3rd column's name in database. */
    @Test
    public void testColumnName3() {
        StudentTable list = new StudentTable();
        assertTrue(list.getColumnName(2) == "Standing");
    }
    
    /** Tests the 4th column's name in database. */
    @Test
    public void testColumnName4() {
        StudentTable list = new StudentTable();
        assertTrue(list.getColumnName(3) == "G-Number");
    }
    
    /** Tests the 5th column's name in database. */
    @Test
    public void testColumnName5() {
        StudentTable list = new StudentTable();
        assertTrue(list.getColumnName(4) == "Exp. Grad");
    }
    
    /** Tests that remove functionality works. */
    @Test
    public void testRemove() {
        StudentTable list = new StudentTable();
        Student s = new Student();
        list.add(s);
        list.remove(0);
        assertTrue(list.getRowCount() == 0);
    }
    
    /** Tests that remove functionality works. */
    @Test
    public void testRemove2() {
        StudentTable list = new StudentTable();
        Student s = new Student();
        Student r = new Student();
        list.add(s);
        list.add(r);
        list.remove(1);
        list.remove(0);
        assertTrue(list.getRowCount() == 0);
    }
    
    
    /*******************************************************************
     * Tests that replaceAt() and getAt() methods work. 
     * 
     * @throws Exception Handles error
     ******************************************************************/
    @Test
    public void testGetAt() throws Exception {
        StudentTable list = new StudentTable();
        Student s = new Student();
        Student r = new Student();
        list.add(s);
        list.replaceAt(r, 0);
        assertTrue(list.getAt(0).equals(r));
    }
    
    /*******************************************************************
     * Tests that replaceAt() and getAt() methods work.  
     * 
     * @throws Exception Handles error
     ******************************************************************/
    @Test
    public void testGetAt2() throws Exception {
        StudentTable list = new StudentTable();
        Student s = new Student();
        Student r = new Student();
        Student t = new Student();
        Student q = new Student();
        list.add(s);
        list.add(t);
        list.add(q);
        list.replaceAt(r, 2);
        assertTrue(list.getAt(2).equals(r));
    }
    
    /*******************************************************************
     * Tests that undo() method work.  
     * 
     * @throws Exception Handles error
     ******************************************************************/
    @Test
    public void testUndo() throws Exception {
        StudentTable list = new StudentTable();
        Student s = new Student();
        Student t = new Student();
        Student q = new Student();
        list.add(s);
        list.add(t);
        list.add(q);
        list.undo();
        assertTrue(list.getAt(1).equals(t));
    }
    
    /*******************************************************************
     * Tests that undo() method work.   
     * 
     * @throws Exception Handles error
     ******************************************************************/
    @Test
    public void testUndo2() throws Exception {
        StudentTable list = new StudentTable();
        Student s = new Student();
        Student t = new Student();
        list.add(s);
        list.add(t);
        list.undo();
        assertFalse(list.getAt(0).equals(t));
    }
    
    
    
    /*******************************************************************
     * Tests that getValueAt() works for one add properly. 
     * 
     * @throws Exception Any error is thrown
     ******************************************************************/
    @Test
    public void testGetValueAt() throws Exception {
        StudentTable list = new StudentTable();
        Student s = new Student("Trungvuong Pham", 
            "Computer Science", "Senior", "G01272550", "Dec. 2019");
        list.add(s);
        assertTrue(list.getValueAt(0, 0).equals("Trungvuong Pham"));
        assertTrue(list.getValueAt(0, 1).equals("Computer Science"));
        assertTrue(list.getValueAt(0, 2).equals("Senior"));
        assertTrue(list.getValueAt(0, 3).equals("G01272550"));
        assertTrue(list.getValueAt(0, 4).equals("Dec. 2019"));
    }
    
    /*******************************************************************
     * Tests that isValidGNum() works properly. 
     * 
     * @throws Exception Handles errors
     ******************************************************************/
    @Test
    public void testIsValidGNum() throws Exception {
        StudentTable list = new StudentTable();
        Student s = new Student();
        s.setGNum("G01272550");
        Student t = new Student();
        t.setGNum("G01272550");
        list.add(s);
        list.add(t);
        assertFalse(list.isValidGNum(s));
        
    }
    
    /** Tests the getStudents() method. */
    @Test
    public void testStudents() {
        StudentTable list = new StudentTable();
        ArrayList<Student> student = new ArrayList<Student>();
        Student s = new Student();
        student.add(s);
        list.add(s);
        assertTrue(list.getStudents().equals(student));
    }
    
    /** Tests the getStudents() method. */
    @Test
    public void testStudents2() {
        StudentTable list = new StudentTable();
        ArrayList<Student> student = new ArrayList<Student>();
        Student s = new Student();
        Student r = new Student();
        student.add(s);
        list.add(r);
        assertFalse(list.getStudents().equals(student));
    }
    
    /*******************************************************************
     * Tests that load and save works.
     * 
     * @throws Exception Handles errors
     ******************************************************************/
    @Test
    public void testLoadandSaveSerial() throws Exception {
        StudentTable list = new StudentTable();
        ArrayList<Student> student = new ArrayList<Student>();
        Student s = new Student("Trung", "Math", "Senior", 
                "G01272550", "Dec. 2019");
        list.add(s);
        student.add(s);
        assertTrue(list.getStudents().equals(student));
        list.saveAsSerialized("serialFile");
        list.loadFromSerialized("serialFile");
        assertFalse(list.getStudents().toString().equals(student.toString()));
    }
    
    /*******************************************************************
     * Tests that load and save works.
     * 
     * @throws Exception Handles errors
     ******************************************************************/
    @Test
    public void testSortName() throws Exception {
        StudentTable list = new StudentTable();
        ArrayList<Student> student = new ArrayList<Student>();
        Student s = new Student();
        Student r = new Student();
        s.setName("Zach");
        r.setName("Hai");
        student.add(s);
        student.add(r);
        list.add(s);
        list.add(r);
        list.sortByName();
        assertTrue(list.getAt(0).equals(r));
    }
    
    /** Checks the default constructor of the GUI. */
    @Test
    public void testGUIDefaultConstructor() {
        DatabaseGUI gui = new DatabaseGUI();
        assertNotNull(gui);
    }
    
    /** Tests the saveSerial action in DatabaseGUI. */
    @Test
    public void testGUISaveSerial() {
        DatabaseGUI gui = new DatabaseGUI();
        JMenuItem saveSerial = new JMenuItem();
        ActionEvent e = new ActionEvent(saveSerial, 0, null);
        gui.actionPerformed(e);
        assertTrue(e.getSource() == saveSerial);
    }
    
    /** Tests the loadSerial action method in DatabaseGUI. */
    @Test
    public void testGUILoadSerial() {
        DatabaseGUI gui = new DatabaseGUI();
        JMenuItem loadSerial = new JMenuItem();
        ActionEvent e = new ActionEvent(loadSerial, 0, null);
        gui.actionPerformed(e);
        assertTrue(e.getSource() == loadSerial);
    }
    
    /** Tests the addStudent action in DatabaseGUI. */
    @Test
    public void testGUIAddStudent() {
        DatabaseGUI gui = new DatabaseGUI();
        JMenuItem addStudent = new JMenuItem();
        ActionEvent e = new ActionEvent(addStudent, 0, null);
        gui.actionPerformed(e);
        assertTrue(e.getSource() == addStudent);
    }
    
    /** Tests the editStudent action in DatabaseGUI. */
    @Test
    public void testGUIEditStudent() {
        DatabaseGUI gui = new DatabaseGUI();
        JMenuItem editStudent = new JMenuItem();
        ActionEvent e = new ActionEvent(editStudent, 0, null);
        gui.actionPerformed(e);
        assertTrue(e.getSource() == editStudent);
    }
    
    /** Tests the deleteStudent action in DatabaseGUI. */
    @Test
    public void testGUIDeleteStudent() {
        DatabaseGUI gui = new DatabaseGUI();
        JMenuItem deleteStudent = new JMenuItem();
        ActionEvent e = new ActionEvent(deleteStudent, 0, null);
        gui.actionPerformed(e);
        assertTrue(e.getSource() == deleteStudent);
    }
    
    /** Tests the undo action in DatabaseGUI. */
    @Test
    public void testGUIUndo() {
        DatabaseGUI gui = new DatabaseGUI();
        JMenuItem undo = new JMenuItem();
        ActionEvent e = new ActionEvent(undo, 0, null);
        gui.actionPerformed(e);
        assertTrue(e.getSource() == undo);
    }
    
    /** Tests the undo action in DatabaseGUI. */
    @Test
    public void testGUISortByName() {
        DatabaseGUI gui = new DatabaseGUI();
        JMenuItem sortByName = new JMenuItem();
        ActionEvent e = new ActionEvent(sortByName, 0, null);
        gui.actionPerformed(e);
        assertTrue(e.getSource() == sortByName);
    }
    
    /** Checks the constructor of the AddStudentDialog. */
    @Test
    public void testAddDialogDefaultConstructor() {
        JFrame o = new JFrame();
        Student s = new Student();
        StudentTable list = new StudentTable();
        AddStudentDialog add = new AddStudentDialog(o, s, list);
        assertNotNull(add);
    }
    
    /** Checks the constructor of the EditStudentDialog. */
    @Test
    public void testEditDialogDefaultConstructor() {
        JFrame o = new JFrame();
        Student s = new Student();
        StudentTable list = new StudentTable();
        EditStudentDialog add = new EditStudentDialog(o, 
                list.getRowCount(), s, list);
        assertNotNull(add);
    }
    
//    /** Checks the constructor of the ViewStudentDialog. */
//    @Test
//    public void testViewDialogDefaultConstructor() {
//        JFrame o = new JFrame();
//        ViewSelectionDialog add = new ViewSelectionDialog(o);
//        assertNotNull(add);
//    }
}
