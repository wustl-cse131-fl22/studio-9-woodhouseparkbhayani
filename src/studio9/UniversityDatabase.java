package studio9;

import java.util.HashMap;
import java.util.Map;

import assignment7.Student;

public class UniversityDatabase {
	//TODO: Complete this class according to the studio instructions
	private final Map<String,Student> database;
	
	public UniversityDatabase()
	{
		database = new HashMap<>();
	}
	
	public void addStudent(String accountName, Student student) {
		database.put(accountName, student);
	}

	public int getStudentCount() {
		return database.size();
	}

	public String lookupFullName(String accountName) {
		Student student = database.get(accountName);
		if (student == null)
		{
			return null;
		}
		String full = student.getFullName();
		return full;
	}

	public double getTotalBearBucks() {
		double total = 0;
		for (String a: database.keySet())
		{
			Student s = database.get(a);
			total += s.getBearBucksBalance();
		}
		return total;
	}
}
