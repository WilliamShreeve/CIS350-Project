package gvsuDatabase;

import java.io.Serializable;

/***********************************************************************
 * Student class keeps track of the student's information such as
 * what their name is, their major and class standing, the courses they
 * are taking, and their current ID.
 * 
 * @author William Shreeve, Hai Duong, Trunvuong Pham
 **********************************************************************/
public class Student implements Serializable {

    /** Default serial ID. */
    private static final long serialVersionUID = 1L;

    /** Name of the Student. */
    private String name;

    /** Name of the major student is pursuing. */
    private String major;

    /** The student's class standing. */
    private String standing;

    /** Student ID number (GNumber). */
    private String gNum;

    /** Expected graduation date. */
    private String expGrad;

    /** Student's gpa.**/
    private double gpa;

    /*******************************************************************
     * Constructor that sets up the student information with given
     * parameters.
     *
     * @param name The name of the student
     * @param major The student's area of study
     * @param standing The student's current status as a student
     * @param gNum The student's G number at Grand Valley
     * @param expGrad The expected graduation date of the student
     *
     * @throws Exception Any set methods receive bad data
     ******************************************************************/
    public Student(String name, String major, String standing,
            String gNum, String expGrad) throws Exception {
        /** sets the name of the student */
        setName(name);

        /** sets the major of the student */
        setMajor(major);

        /** sets the class standing of the student */
        setStanding(standing);

        /** sets the G Number of the student */
        setGNum(gNum);

        /** sets the expected graduation date of the student */
        setExpGrad(expGrad);

    }

    /*******************************************************************
     * Default constructor for Student class that takes in no values.
     ******************************************************************/
    public Student() {

    }

    /*******************************************************************
     * Getter method for the name of the student.
     *
     * @return name The student's name
     ******************************************************************/
    public String getName() {
        return name;
    }

    /*******************************************************************
     * Setter method for name of a student.
     *
     * @param name The student's name
     * @throws Exception when any data entered is invalid
     ******************************************************************/
    public void setName(String name)throws Exception {
        if (name.equals("")) {
            throw new Exception("Name cannot be empty");
        } else {
            this.name = name;
        }
    }

    /*******************************************************************
     * Getter method for the student's major.
     *
     * @return major The student's major
     ******************************************************************/
    public String getMajor() {
        return major;
    }
    /*******************************************************************
     * Setter method for major of a student.
     *
     * @param major The student's name
     * @throws Exception Any data entered is invalid
     ******************************************************************/
    public void setMajor(String major)throws Exception {
        if (major.equals("")) {
            throw new Exception("Major cannot be empty");
        }
        this.major = major;
    }

    /*******************************************************************
     * Getter method for the student's class standing.
     *
     * @return standing The student's class standing
     ******************************************************************/
    public String getStanding() {
        return standing;
    }

    /******************************************************************
     * Getter method for student's GPA.
     *
     * @return student's GPA as a float
     *****************************************************************/
    public double getGPA() {
        return gpa;
    }

    /*******************************************************************
     * Setter method for the student's GPA.
     *
     * @param g The student's GPA
     * @throws Exception A value less than 0 or higher than 4
     ******************************************************************/
    public void setGPA(double g) throws Exception {
        if (g > 4.0 || g < 0) {
            throw new Exception("Invalid GPA");
        }
        this.gpa = g;
    }
    /*******************************************************************
     * Setter method for the student's class standing.
     *
     * @param standing The student's class standing
     * @throws Exception Any data entered is invalid
     ******************************************************************/
    public void setStanding(String standing) throws Exception {
        if (standing.equals("")) {
            throw new Exception("Standing cannot be empty");
        }
        this.standing = standing;
    }

    /*******************************************************************
     * Getter method for the student's G Number.
     *
     * @return gNum The student's G Number
     ******************************************************************/
    public String getGNum() {
        return gNum;
    }

    /*******************************************************************
     * Setter method for the student's G Number.
     *
     * @param gNum The student's G Number
     * @throws Exception Any data entered is invalid
     ******************************************************************/
    public void setGNum(String gNum) throws Exception {
        if (gNum.equals("")) {
            throw new Exception("G Number cannot be empty");
        }
        this.gNum = gNum;

    }

    /*******************************************************************
     * Getter method for the student's graduation date.
     *
     * @return expGrad The student's expected graduation date.
     ******************************************************************/
    public String getExpGrad() {
        return expGrad;
    }

    /*******************************************************************
     * Setter method for the expected graduation date.
     *
     * @param expGrad The student's class standing
     * @throws Exception Any data entered is invalid
     ******************************************************************/
    public void setExpGrad(String expGrad)throws Exception {
        if (expGrad.equals("")) {
            throw new Exception("Standing cannot be empty");
        }
        this.expGrad = expGrad;
    }
}

