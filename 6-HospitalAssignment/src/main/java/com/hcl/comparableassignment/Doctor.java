package com.hcl.comparableassignment;

public class Doctor {
	private int gDoctorid;
	private String gDoctorName, gSpecialty;

	public Doctor(int doctorid, String doctorName, String specialty) {
		gDoctorid = doctorid;
		gDoctorName = doctorName;
		gSpecialty = specialty;
	}

	public int getID() {
		return gDoctorid;
	}

	public String getSpecialty() {
		return gSpecialty;
	}

	public String getName() {
		return gDoctorName;
	}

}
