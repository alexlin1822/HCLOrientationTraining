package com.hcl.comparableassignment;

import java.util.Comparator;

public class PAgeCompare implements Comparator<Patient> {
	public int compare(Patient idx1, Patient idx2) {
		return Integer.compare(idx1.getAge(), idx2.getAge());
	}
}
