package com.hcl.comparableassignment;

import java.util.Comparator;

public class DNameCompare implements Comparator<Doctor> {
	public int compare(Doctor idx1, Doctor idx2) {
		return idx1.getName().compareTo(idx2.getName());
	}
}
