package com.hcl.stringassignment;

import java.util.StringTokenizer;

public class MainClass {

	public static void main(String[] args) {
		CallStringTokenizer();
		CallStringBuffer();
	}

	public static void CallStringTokenizer() {
		// StringTokenizer Function
		// separated by spaces
		String sR = "Dajun Alex Lin";
		System.out.print(sR + " -> ");
		StringTokenizer st = new StringTokenizer(sR, " ");
		String sN = "";
		while (st.hasMoreTokens()) {
			sN += st.nextToken() + ":";
		}
		sN = sN.substring(0, sN.length() - 1);

		System.out.println(sN);

		System.out.println();

		// separated by _
		sR = "Dajun_Alex_Lin";
		System.out.print(sR + " -> ");
		StringTokenizer sk = new StringTokenizer(sR, "_");
		while (sk.hasMoreTokens()) {
			System.out.print(sk.nextToken() + " ");
		}
		System.out.println();
		System.out.println();

		// separated by /
		sR = "10/12/2017";
		System.out.println(sR + " -> ");
		StringTokenizer sD = new StringTokenizer(sR, "/");
		while (sD.hasMoreTokens()) {
			System.out.println(sD.nextToken());
		}
		System.out.println();
	}

	public static void CallStringBuffer() {
		// StringBuffer function
		// Add something
		StringBuffer sbf = new StringBuffer("Dajun Alex Lin");
		System.out.println("Before : " + sbf);

		sbf.insert(sbf.length() - 1, " 123");
		sbf.append(" 3333");
		System.out.println("After insert: " + sbf);
	}

}
