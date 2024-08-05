package com.java.practiceEx1;

public class Empolyee {
	
	public Empolyee(String emailID, String firstName, String lastName, String designation, String mob_no,
			double salary) {
		super();
		this.emailID = emailID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
		this.mob_no = mob_no;
		this.salary = salary;
	}

	private String emailID;
	private String firstName;
	private String lastName;
	private String designation;
	private String mob_no;
	private double salary;
	
	
	 
	 public String getFirstName() {
		return firstName;
	}

	
	public String getLastName() {
		return lastName;
	}

	

	public String getDesignation() {
		return designation;
	}

	

	public String getMob_no() {
		return mob_no;
	}

	

	public double getSalary() {
		return salary;
	}

	

	public String getEmailID() {
		 return emailID;
	 }
	 
	 
	public String toString() {
		return "Email ID :" + emailID + ", name :" + firstName + " " + lastName + ", designation : " + designation + ", Mobile number :" + mob_no + ", salary :" + salary ;
	}
	 
}