package gvsuDatabase;

import java.io.Serializable;

/***********************************************************************
 * Student class keeps track of the student's information such as 
 * what their name is, their major and class standing, the courses they
 * are taking, and their current ID.
 **********************************************************************/
public class Student implements Serializable{

	/** default serial ID */
	private static final long serialVersionUID = 1L;

	/** name of the Student */
	protected String name;
	
	/** name of the major student is pursuing */
	protected String major;
	
	/** the student's class standing */
	protected String standing;
	
	/** student ID number (GNumber) */
	protected String gNum;
	
	/** expected graduation date */
	protected String expGrad;
	
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
			String gNum, String expGrad) throws Exception{
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
	public Student(){
		
	}
	
	/*******************************************************************
	 * Getter method for the name of the student.
	 * 
	 * @return name The student's name
	 ******************************************************************/
	public String getName(){
		return name;
	}
	
	/*******************************************************************
	 * Setter method for name of a student
	 * 
	 * @param name The student's name
	 * @throws Exception when any data entered is invalid
	 ******************************************************************/
	public void setName(String name)throws Exception{
		if (name.equals(""))
			throw new Exception("Name cannot be empty");
		this.name = name;
	}
	
	/*******************************************************************
	 * Getter method for the student's major.
	 * 
	 * @return major The student's major
	 ******************************************************************/
	public String getMajor(){
		return major;
	}
	/*******************************************************************
	 * Setter method for major of a student.
	 * 
	 * @param name The student's name
	 * @throws Exception Any data entered is invalid
	 ******************************************************************/
	public void setMajor(String major)throws Exception{
		if (major.equals(""))
			throw new Exception("Major cannot be empty");
		this.major = major;
	}
	
	/*******************************************************************
	 * Getter method for the student's class standing.
	 * 
	 * @return standing The student's class standing
	 ******************************************************************/
	public String getStanding(){
		return standing;
	}
	
	/*******************************************************************
	 * Setter method for the student's class standing.
	 * 
	 * @param standing The student's class standing
	 * @throws Exception Any data entered is invalid
	 ******************************************************************/
	public void setStanding(String standing)throws Exception{
		if (standing.equals(""))
			throw new Exception("Standing cannot be empty");
		this.standing = standing;
	}
	
	/*******************************************************************
	 * Getter method for the student's G Number.
	 * 
	 * @return gNum The student's G Number
	 ******************************************************************/
	public String getGNum(){
		return gNum;
	}
	
	/*******************************************************************
	 * Setter method for the student's G Number.
	 * 
	 * @param gNum The student's G Number
	 * @throws Exception Any data entered is invalid
	 ******************************************************************/
	public void setGNum(String gNum)throws Exception{
		if (gNum.equals(""))
			throw new Exception("G Number cannot be empty");
		this.gNum = gNum;
	
	}
	
	/*******************************************************************
	 * Getter method for the student's graduation date.
	 * 
	 * @return expGrad The student's expected graduation date.
	 ******************************************************************/
	public String getExpGrad(){
		return expGrad;
	}
	
	/*******************************************************************
	 * Setter method for the expected graduation date.
	 * 
	 * @param standing The student's class standing
	 * @throws Exception Any data entered is invalid
	 ******************************************************************/
	public void setExpGrad(String expGrad)throws Exception{
		if (expGrad.equals(""))
			throw new Exception("Standing cannot be empty");
		this.expGrad = expGrad;
	}
}