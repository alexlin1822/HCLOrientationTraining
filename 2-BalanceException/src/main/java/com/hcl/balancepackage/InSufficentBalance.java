package com.hcl.balancepackage;

public class InSufficentBalance extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4221362197003377983L;

	double igTotal;
	public InSufficentBalance(double iTotal) {
		igTotal=iTotal;
		System.out.println("InSufficentBalance thrown");
	}

	public String toString() {
		return "Error : your current balance is $"+igTotal+" It is not enough to withdraw!" ;
	}
}
