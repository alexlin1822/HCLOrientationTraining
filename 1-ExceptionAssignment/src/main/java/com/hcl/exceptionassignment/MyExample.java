package com.hcl.exceptionassignment;
import java.util.*;

public class MyExample{

	public static void main(String[] args)  {
		Student aa =new Student();
		boolean isRunning=true;
		
		Scanner myObj = new Scanner(System.in); 
		
		while (isRunning) {
		    //User input		    
		    System.out.println("Enter Student ID: ");
		    aa.studentid = myObj.nextLine();
		    
		    System.out.println("Enter Student Name: ");
		    aa.StudentName = myObj.nextLine();
		    
		    System.out.println("Enter Marks: ");
		    int iMarks = myObj.nextInt();
		    myObj.nextLine();
		    

		    //Check if 0<marks<100
		    try {
		    	if ((iMarks>100) || (iMarks<0)) throw new MyException();
		    	else {
		    		System.out.println("---------------------");
		    		System.out.println("Student ID: "+aa.studentid);
		    		System.out.println("Student Name: "+aa.StudentName);
		    		System.out.println("Marks: "+aa.marks);
		    		System.out.println("---------------------");
		    	}
		    }catch (MyException e) {
		    	System.out.println (e);
		    }

		    //Check if user want to continues
		    System.out.println("Do you want to enter next student: (y/n): ");
		    isRunning = (myObj.nextLine().toString().equals("y"));
		}
		
	    myObj.close();
	}
}
