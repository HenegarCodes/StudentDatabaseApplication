package StudentDatabaseApp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private String gradeYear;
	private String studentID;
	private String courses = null;
	private int tuitionBalance = 0;
	private int costOfCourse = 600;
	private static int ID = 1000;
	
	
	//constructor prompts to enter name and year of student
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter Student last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1. Freshman\n2. Sophomore\n3. Junior\n4. Senior \nEnter Student grade level: ");
		this.gradeYear = in.nextLine();
		
		setStudentID();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
	
		
	}
	
	//generate an ID
	
	private void setStudentID() {
		///grade level + ID
		this.studentID = gradeYear + "" + ID;
		ID++;
		
	}
	
	
	//enroll in courses
	public void enroll() {
		//utilize loop user will hit 0 when done enrolling
		do {	
			System.out.println("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (course != "Q"); {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
	
	System.out.println("Enrolled in: " + courses);
	System.out.println("TuitionBalance: " + tuitionBalance);
	
		}}
	//view balance
	
	//pay tuition
	
	//shows status
	
	
}
