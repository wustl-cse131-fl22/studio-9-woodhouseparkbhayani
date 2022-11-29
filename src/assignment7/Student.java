package assignment7;

//TODO: Copy a working Student class from Assignment 7 over this file.
public class Student {
	private String firstName;
	private String lastName;
	private int id;
	private int attemptedCredits;
	private int passingCredits;
	private double gradeQualityPoints;
	private double bearBucks;
	
	public Student() {
		firstName = "";
		lastName = "";
		id = 1;
		attemptedCredits = 0;
		passingCredits = 0;
		gradeQualityPoints = 0;
		bearBucks = 0;
	}

	/**
	 * @param String initfirstName: the student's first name
	 * @param String initLastName: the student's last name
	 * @param int    initStudentID: the student's ID number
	 */

	public Student(String initFirstName, String initLastName, int initStudentID) {
		firstName = initFirstName;
		lastName = initLastName;
		id = initStudentID;
	}


	public String getFullName() {
		return firstName + " " + lastName;
	}

	public int getId() {
		return id;
	}
	
	public void depositBearBucks(double amount) {
			bearBucks = bearBucks + amount;
		}

	public double getBearBucksBalance() {
				return bearBucks;
	}
}
