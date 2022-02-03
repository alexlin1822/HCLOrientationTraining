package com.hcl.nameexception;

public class NameException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3224025638343359829L;

	public NameException() {
		System.out.println("NameException thrown");
	}

	public String toString() {
		return "Error : your enter should be  between 10-15 characters!" ;
	}
}