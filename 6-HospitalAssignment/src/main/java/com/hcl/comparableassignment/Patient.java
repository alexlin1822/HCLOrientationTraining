package com.hcl.comparableassignment;

public class Patient {
	private int gPatientid, gAge;
	private String gPatientName;

	public Patient(int patientid, String patientName, int age) {
		gPatientid = patientid;
		gPatientName = patientName;
		gAge = age;
	}

	public int getID() {
		return gPatientid;
	}

	public int getAge() {
		return gAge;
	}

	public String getName() {
		return gPatientName;
	}

}
