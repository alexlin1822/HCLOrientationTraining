package com.hcl.comparableassignment;

import java.util.Comparator;

public class PIDCompare implements Comparator<Patient> {
	public int compare(Patient idx1, Patient idx2) {
		return Integer.compare(idx1.getID(), idx2.getID());
	}
}
