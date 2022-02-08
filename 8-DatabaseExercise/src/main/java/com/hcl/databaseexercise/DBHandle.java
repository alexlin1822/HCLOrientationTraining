package com.hcl.databaseexercise;

import java.sql.*;

public class DBHandle {

	// DB connection and main @param
	Connection con;

	private static final String url = "jdbc:mysql://localhost:3306/EmployeeDB?useSSL=false";
	private static final String user = "root";
	private static final String password = "";

	private static final String createTableSQL = "CREATE TABLE IF NOT EXISTS Employee("
			+ "EmpID INT NOT NULL AUTO_INCREMENT," + "EmpName VARCHAR(100) NOT NULL," + "DOB DATE,"
			+ "Salary decimal(10,2)," + "Age INT," + "PRIMARY KEY (EmpID)" + ");";

	private static final String INSERT_SQL = "INSERT INTO Employee (EmpName, DOB, Salary, Age) VALUES "
			+ " (?, ?, ?, ?);";

	private static final String UPDATE_SQL = "UPDATE Employee SET ";

	private static final String DELETE_SQL = "DELETE FROM Employee WHERE ";

	private static final String QUERY_SQL = "SELECT * FROM Employee WHERE ";

	public DBHandle() {

	}

	public boolean ConnectDB() {
		try {
			con = DriverManager.getConnection(url, user, password);
			return true;
		} catch (SQLException ex) {
			return false;
		}
	}

	// Create Table and add some data
	public String InitTable() {
		try {
			// Create Employee Table
			Statement statement = con.createStatement();
			statement.execute(createTableSQL);

			return "OK";
		} catch (SQLException e) {
			// print SQL exception information
			return e.toString();
		}
	}

	// SQL Insert function
	public void insertRecord(Employee rc) {
		try {
			PreparedStatement preparedStatement = con.prepareStatement(INSERT_SQL);
			preparedStatement.setString(1, rc.getEmpName());
			preparedStatement.setDate(2, (Date) rc.getDOB());
			preparedStatement.setDouble(3, rc.getSalary());
			preparedStatement.setInt(4, rc.getAge());
			preparedStatement.executeUpdate();
			System.out.println("-- Record inserted! --");
		} catch (SQLException e) {
			System.out.println("-- Record insert failed! --");
		}
	}

	// SQL update function
	public void updateRecord(String sValue, String sCondition) {
		try {
			PreparedStatement preparedStatement = con.prepareStatement(UPDATE_SQL + sValue + " WHERE " + sCondition);
			preparedStatement.executeUpdate();

			System.out.println("-- Record updated! --");
		} catch (SQLException e) {
			System.out.println("-- Record update failed! --");
		}
	}

	// SQL delete function
	public void deleteRecord(String sCondition) {
		try {
			PreparedStatement preparedStatement = con.prepareStatement(DELETE_SQL + sCondition);
			preparedStatement.executeUpdate();
			System.out.println("-- Record deleted! --");
		} catch (SQLException e) {
			System.out.println("-- Record deleted failed! --");
		}
	}

	public void selectRecord(String sSt) {
		try {
			// if no where statement, add a default statement
			if (sSt.equals(""))
				sSt = "EmpID>0";

			PreparedStatement preparedStatement = con.prepareStatement(QUERY_SQL + sSt);
			ResultSet rs = preparedStatement.executeQuery();

			// Print result
			System.out.println("------------------- Your Result -------------------");
			System.out.println("EmpID   EmpName     DOB         Salary    	Age");

			while (rs.next()) {
				int id = rs.getInt("EmpID");
				String name = rs.getString("EmpName");
				String dob = rs.getDate("DOB").toLocalDate().toString();
				String Salary = Double.toString(rs.getDouble("Salary"));
				String Age = rs.getString("Age");
				System.out.println(id + "	" + name + "	" + dob + "	" + Salary + "		" + Age);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		System.out.println("----------------------- End -----------------------");
		System.out.println();
	}

}
