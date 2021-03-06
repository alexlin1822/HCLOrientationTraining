package com.hcl.webjava.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Alex
 *
 */
public class DBHandling {

	/**
	 * @param sUser
	 * @param sPw
	 * @param sEmail
	 * @return
	 * @throws ClassNotFoundException
	 */
	public static int signupUser(String sUser, String sPw, String sEmail) throws ClassNotFoundException {
		String INSERT_USERS_SQL = "INSERT INTO LoginTB (username, password, email) VALUES (?,?,?);";

		int result = 0;

		Class.forName("com.mysql.jdbc.Driver");

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LoginDB?useSSL=false",
				"root", ""); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
			preparedStatement.setString(1, sUser);
			preparedStatement.setString(2, sPw);
			preparedStatement.setString(3, sEmail);
			// System.out.println(preparedStatement);
			result = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e);
		}
		return result;
	}

	/**
	 * @param sUser
	 * @param sPw
	 * @return
	 * @throws ClassNotFoundException
	 */
	public static int checkUser(String sUser, String sPw) throws ClassNotFoundException {
		String QUERY_USERS_SQL = "SELECT id FROM LOGINTB WHERE username=? and password=?";

		int id = 0;

		Class.forName("com.mysql.jdbc.Driver");

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LoginDB?useSSL=false",
				"root", ""); PreparedStatement preparedStatement = connection.prepareStatement(QUERY_USERS_SQL)) {

			preparedStatement.setString(1, sUser);
			preparedStatement.setString(2, sPw);

			System.out.println(preparedStatement);
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
