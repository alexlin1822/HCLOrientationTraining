package com.hcl.exceptionassignment;

public class MyException extends Exception {
	/**
 * 
 */
private static final long serialVersionUID = 1L;

public MyException() {
	System.out.println("My Exception thrown");
}

public String toString() {
	return "MyException Object : Marks can not > 100 or < 0 " ;
}

}

