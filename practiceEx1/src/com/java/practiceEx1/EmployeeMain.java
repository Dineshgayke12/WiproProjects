package com.java.practiceEx1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain {

	   private static List<Empolyee> employees = new ArrayList<>();
	private static double salary;
		   
		   public static void addEmployee() {
			   
			   Scanner sc = new Scanner(System.in);
			   
			   System.out.println("Enter EmailID :");
			   String emailID = sc.nextLine();
			   
			   System.out.println("Enter First name");
			   String firstName= sc.nextLine();
			   
			   System.out.println("Enter your last Name");
			   String lastName= sc.nextLine();
			   
			   System.out.println("Enter your designation");
			   String designation= sc.nextLine();
			   
			   System.out.println("Enter your mobile number");
			   String mob_no=sc.nextLine();
			   
			   System.out.println("Enter your salary");
			   double salary= sc.nextDouble();
			   
			   
			   
			   employees.add(new Empolyee(emailID, firstName,lastName,designation,mob_no,salary));
			   
			   
		   }
		   
		   public static void listEmployee() {
			   
			   if(employees.isEmpty()) {
				   
				   System.out.println("No of Employees in the list");
				   
			   }
			   
			   else {
				   for(int i =0; i<employees.size();i++) {
					   
					   System.out.println((i+1) + " , " + employees.get(i));
					   
				   }
				   System.out.println();
			   }
		   }
	   

		   public static void listManagers() {
			   
			   boolean found = false;
			   
			   for(Empolyee employee : employees) {
				   
				   if(employee.getDesignation().equalsIgnoreCase("manager")) {
					   System.out.println(employee);
					   found=true;
					   
				   }
				   
			   }
			   
			   if(!found) {
				   System.out.println("no Manager in list");
			   }
			   
			   System.out.println();
		   }
		   
		   public static void deleteEmploee() {
			   
			   Scanner sc= new Scanner(System.in);
			   System.out.println("Enter the Mail Id of Employee to Delete :");
			   
			   String emailID= sc.nextLine();
			   Iterator<Empolyee> iterator = employees.iterator();
			   while(iterator.hasNext()) {
				   
				   Empolyee employee= iterator.next();
				   
				   if(employee.getEmailID().equalsIgnoreCase(emailID)) {
					   
					   iterator.remove();
					   System.out.println("Employee with email ID " + emailID + " deleted Successfully. \n");
					   return;
				   }
				   
				  
			   }
			   
			   System.out.println("Employee with mail ID " + emailID + "Not found \n");
		   }
		   
		   
		   
		public static void main(String[] args) {
			
			Scanner sc= new Scanner(System.in);
			
			while(true) {
				
				System.out.println("1. Add an Employee");
				System.out.println("2.List of all employees");
				System.out.println("3.List of Employees who are managers");
				System.out.println("4. Delete Employees");
				System.out.println("5. Exit");
				
				System.out.println("Enter your choice : ");
				int choice=sc.nextInt();
				sc.nextLine();
				
	switch(choice) {
				
				case 1 :
					addEmployee();
					break;
				case 2 :
					listEmployee();
					break;
					
				case 3 :	
					listManagers();
				     break;
				     
				case 4 :
					deleteEmploee();
					break;
				
					
				case 5 :
					System.out.println("Exit");
					
					default:
						System.out.println("Invalid choice");
					
				}

                  
			}
			
			

		}

	}


