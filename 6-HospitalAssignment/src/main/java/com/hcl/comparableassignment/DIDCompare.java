package com.hcl.comparableassignment;

import java.util.Comparator;

public class DIDCompare implements Comparator<Doctor> {
	public int compare(Doctor idx1, Doctor idx2) {
		return Integer.compare(idx1.getID(), idx2.getID());
	}
}
