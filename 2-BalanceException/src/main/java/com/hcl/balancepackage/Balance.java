package com.hcl.balancepackage;

import java.util.Scanner;

public class Balance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isRunning=true;
		double iTotal=0;	//Balance
		
		//Capture user input
		Scanner myObj = new Scanner(System.in); 
		
		while (isRunning) {
		    //User input		    
			System.out.println("------------------------------------");
			System.out.println("1 - Deposit");
			System.out.println("2 - Withdraw");
			System.out.println("0 - Exit");
			System.out.println("Enter 1, 2 or 0.");
		    int iStatus= myObj.nextInt();
		    myObj.nextLine();
		    
		    if (iStatus!=1 && iStatus!=2) {
		    	System.out.println("Thank you for using! Bye!");
		    	break;
		    }
		    
		    System.out.println("Enter amounts: ");
		    double iAmount= myObj.nextDouble();
		    myObj.nextLine();
		    
	    	if (iAmount<=0) {
	    		System.out.println("Amounts must be > 0!");
	    		continue;
	    	}
	    	
	    	// Handle deposit 
		    if (iStatus==1) {
	    		iTotal+=iAmount;
	    		System.out.println("Your balance is $"+iTotal);
		    }//Handle withdraw
		    else {
		    	try	{
		    		//Check balance 
		    		//if enough, it can withdrew. Otherwise, throw a exception 
		    		if (iTotal<iAmount) {
		    			throw new InSufficentBalance(iTotal);
		    		}
		    		else {
		    			iTotal-=iAmount;}
		    		System.out.println("Your balance is $"+iTotal);
		    	}
		    	catch (InSufficentBalance e) {
		    		System.out.println(e);
		    	}
		    }
		}
	    myObj.close();
	}

}
