package com.hcl.webjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.mysql.cj.Query;

public class DBHandle {

	public int signupUser(String sUser, String sPw, String sEmail) throws ClassNotFoundException {
		String INSERT_USERS_SQL = "INSERT INTO LoginTB (username, password, email) VALUES (?,?,?);";

		int result = 0;

		Class.forName("com.mysql.jdbc.Driver");

		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/mysql_database?useSSL=false", "root", "root");

				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
			preparedStatement.setString(1, sUser);
			preparedStatement.setString(2, sPw);
			preparedStatement.setString(3, sEmail);

			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			result = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e);
		}
		return result;
	}

	public int checkUser(String sUser, String sPw) throws ClassNotFoundException {
		String QUERY_USERS_SQL = "SELECT id FROM LOGINTB WHERE username=? and password=?";

		int id = 0;

		Class.forName("com.mysql.jdbc.Driver");

		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/mysql_database?useSSL=false", "root", "root");

				PreparedStatement preparedStatement = connection.prepareStatement(QUERY_USERS_SQL)) {
			preparedStatement.setString(1, sUser);
			preparedStatement.setString(2, sPw);

			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				id = rs.getInt("id");
			}

		} catch (SQLException e) {
			System.out.println(e);
		}

		return id;
	}
}
