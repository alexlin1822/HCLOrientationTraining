package com.hcl.databaseexercise.utility;

import java.sql.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DBHandling {

	private static final String url = "jdbc:mysql://localhost:3306/EmployeeDB?useSSL=false";
	private static final String user = "root";
	private static final String password = "";

	private static final String CREATE_TABLE_SQL = "CREATE TABLE IF NOT EXISTS Employee("
			+ "EmpID INT NOT NULL AUTO_INCREMENT," + "EmpName VARCHAR(100) NOT NULL," + "DOB DATE,"
			+ "Salary decimal(10,2)," + "Age INT," + "PRIMARY KEY (EmpID)" + ");";

	private static final String INSERT_SQL = "INSERT INTO Employee (EmpName, DOB, Salary, Age) VALUES "
			+ " (?, ?, ?, ?);";
	private static final String UPDATE_SQL = "UPDATE Employee SET ";
	private static final String DELETE_SQL = "DELETE FROM Employee WHERE ";
	private static final String QUERY_SQL = "SELECT * FROM Employee WHERE ";

	private static final Logger logger = LogManager.getLogger(DBHandling.class);

	// Create Table and add some data
	public String initTable() {
		try (Connection con = DriverManager.getConnection(url, user, password);
				PreparedStatement preparedStatement = con.prepareStatement(CREATE_TABLE_SQL)) {
			logger.info("initial table");
			return "OK";
		} catch (SQLException e) {
			// print SQL exception information
			logger.warn(e.toString());
			return e.toString();
		}
	}

	// SQL Insert function
	public void insertRecord(Employee rc) {

		try (Connection con = DriverManager.getConnection(url, user, password);
				PreparedStatement preparedStatement = con.prepareStatement(INSERT_SQL)) {

			logger.info("insert a new record.");

			preparedStatement.setString(1, rc.getEmpName());
			preparedStatement.setDate(2, (Date) rc.getDOB());
			preparedStatement.setDouble(3, rc.getSalary());
			preparedStatement.setInt(4, rc.getAge());
			preparedStatement.executeUpdate();
			logger.info("Record inserted!");
			System.out.println("-- Record inserted! --");
		} catch (SQLException e) {
			logger.error(e.toString());
			System.out.println("-- Record insert failed! --");
		}
	}

	// SQL update function
	public void updateRecord(String sValue, String sCondition) {
		try (Connection con = DriverManager.getConnection(url, user, password);
				PreparedStatement preparedStatement = con
						.prepareStatement(UPDATE_SQL + sValue + " WHERE " + sCondition)) {
			logger.info("Update record.");
			preparedStatement.executeUpdate();

			logger.info("-- Record updated! --");
			System.out.println("-- Record updated! --");
		} catch (SQLException e) {
			System.out.println("-- Record update failed! --");
			logger.error(e.toString());
		}
	}

	// SQL delete function
	public void deleteRecord(String sCondition) {
		try (Connection con = DriverManager.getConnection(url, user, password);
				PreparedStatement preparedStatement = con.prepareStatement(DELETE_SQL + sCondition)) {
			preparedStatement.executeUpdate();

			logger.info("-- Record deleted! --");
			System.out.println("-- Record deleted! --");
		} catch (SQLException e) {
			logger.error(e.toString());
			System.out.println("-- Record deleted failed! --");
		}
	}

	public void selectRecord(String sSt) {
		// if no where statement, add a default statement
		if (sSt.equals(""))
			sSt = "EmpID>0";

		try (Connection con = DriverManager.getConnection(url, user, password);
				PreparedStatement preparedStatement = con.prepareStatement(QUERY_SQL + sSt)) {
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
			logger.info("-- Query done! --");
		} catch (SQLException e) {
			logger.error(e.toString());
			System.out.println(e);
		}
		System.out.println("----------------------- End -----------------------");
		System.out.println();
	}

}
