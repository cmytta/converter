package com.converter.dboperations;
import java.sql.*;

public class SetUsers {
	private String connectionUrl = "jdbc:sqlserver://localhost;database=converter";
	private String connectionLogin = "xoBot";
	private String connectionPassword = "1234qwer";
	public void create(String insertedLogin, String insertedPassword) {
		String query = "INSERT INTO Users(Login, Password) VALUES (?,?)";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
			Connection connection = DriverManager.getConnection(connectionUrl, connectionLogin, connectionPassword);
			try {
				PreparedStatement statement = connection.prepareStatement(query);
				statement.setString(1, insertedLogin);
				statement.setString(2, insertedPassword);
				statement.executeUpdate();
			}
			catch(Exception exception) {
				System.out.println(exception);
			} finally {
				connection.close();
			}
		}
		catch(Exception exception) {
			System.out.println(exception);
		} finally {
			System.out.println("-_- Successfuly created user -_-");
		}
	}
}
