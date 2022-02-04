package com.hcl.comparableassignment;

import java.util.Comparator;

public class PNameCompare implements Comparator<Patient> {
	public int compare(Patient idx1, Patient idx2) {
		return idx1.getName().compareTo(idx2.getName());
	}
}
