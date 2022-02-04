package com.hcl.comparableassignment;

import java.util.*;

public class Hospital {
	public static void main(String[] args) {
		List<Patient> arrPatients = new ArrayList<Patient>();
		arrPatients.add(new Patient(1, "John", 20));
		arrPatients.add(new Patient(3, "James", 23));
		arrPatients.add(new Patient(2, "Robert", 26));
		arrPatients.add(new Patient(5, "Thomas", 22));
		arrPatients.add(new Patient(4, "Daniel", 21));
		arrPatients.add(new Patient(6, "Steven", 19));

		System.out.println("--- Patients data before sort by Comparator ---");
		for (Patient p : arrPatients) {
			System.out.println(p.getID() + " " + p.getName() + " " + p.getAge());
		}

		// Sort by Patient ID
		Collections.sort(arrPatients, new PIDCompare());

		System.out.println("--- After sorted by ID ---");
		for (Patient p : arrPatients) {
			System.out.println(p.getID() + " " + p.getName() + " " + p.getAge());
		}

		// Sort by Patient Name
		Collections.sort(arrPatients, new PNameCompare());

		System.out.println("--- After sorted by Name ---");
		for (Patient p : arrPatients) {
			System.out.println(p.getID() + " " + p.getName() + " " + p.getAge());
		}

		// Sort by Patient Age
		Collections.sort(arrPatients, new PAgeCompare());

		System.out.println("--- After sorted by Age ---");
		for (Patient p : arrPatients) {
			System.out.println(p.getID() + " " + p.getName() + " " + p.getAge());
		}

		// Doctor

		List<Doctor> arrDoctors = new ArrayList<Doctor>();
		arrDoctors.add(new Doctor(1, "John", "Anesthesiology"));
		arrDoctors.add(new Doctor(3, "James", "Medicine"));
		arrDoctors.add(new Doctor(2, "Robert", "Diagnostic"));
		arrDoctors.add(new Doctor(5, "Thomas", "Radiation"));
		arrDoctors.add(new Doctor(4, "Daniel", "Pediatrics"));
		arrDoctors.add(new Doctor(6, "Steven", "Urology"));

		System.out.println("--- Doctors data before sort by Comparator ---");
		for (Doctor p : arrDoctors) {
			System.out.println(p.getID() + " " + p.getName() + " " + p.getSpecialty());
		}

		// Sort by Doctor ID
		Collections.sort(arrDoctors, new DIDCompare());

		System.out.println("--- After sorted by ID ---");
		for (Doctor p : arrDoctors) {
			System.out.println(p.getID() + " " + p.getName() + " " + p.getSpecialty());
		}

		// Sort by Doctor Name
		Collections.sort(arrDoctors, new DNameCompare());

		System.out.println("--- After sorted by Name ---");
		for (Doctor p : arrDoctors) {
			System.out.println(p.getID() + " " + p.getName() + " " + p.getSpecialty());
		}

		// Sort by Doctor Specialty
		Collections.sort(arrDoctors, new DSpecialtyCompare());

		System.out.println("--- After sorted by Age ---");
		for (Doctor p : arrDoctors) {
			System.out.println(p.getID() + " " + p.getName() + " " + p.getSpecialty());
		}

	}
}
