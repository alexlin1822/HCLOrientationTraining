package com.hcl.nameexception;

import java.lang.reflect.Array;
import java.util.Scanner;

public class NameMain {

	public static void main(String[] args) {
		boolean isRunning=true;

		//Capture user input
		Scanner myObj = new Scanner(System.in); 
		
		while (isRunning) {
		    //User input		    
			System.out.println("-------------Enter 0 for exit-----------------");
			System.out.println("Enter your name: ");

			String sName= myObj.nextLine();
			
			
			if (sName.equals("0")) break;	//Enter 0 for exit
		    
			try {
				// be sure the length of name is between 10-15 characters 
				if (sName.length()>=10 && sName.length()<=15) {
					String[] arrName = sName.split(" ", 0);
					int iArr=Array.getLength(arrName);
					if (iArr>0) {
						//Print out First name
						System.out.println("First Name :"+arrName[0]);
						
						//User does not have middle name
						if (iArr==2) {	
							System.out.println("Last Name :"+arrName[1]);
						}
						//User have middle name
						else if (iArr==3) {
							System.out.println("Middle Name :"+arrName[1]);
							System.out.println("Last Name :"+arrName[2]);
						}
					}
			    }else {
			    	throw new NameException();
			    }
			}
			catch (NameException e) {
				System.out.println(e);
			    System.out.println("Please enter again!");
			}
		}
	    System.out.println("");
	    myObj.close();
	}

}
