package com.hcl.comparableassignment;

import java.util.Comparator;

public class DSpecialtyCompare implements Comparator<Doctor> {
	public int compare(Doctor idx1, Doctor idx2) {
		return idx1.getSpecialty().compareTo(idx2.getSpecialty());
	}
}
