package com.converter.dboperations;
import java.sql.*;

public class SetConv {
	private String connectionUrl = "jdbc:sqlserver://localhost;database=converter";
	private String connectionLogin = "xoBot";
	private String connectionPassword = "1234qwer";
	public void create(int insertedUserID, String insertedFParametr, String insertedSParametr, double insertedFValue, double insertedSValue) {
		String query = "INSERT INTO Conv(UserID, FParametr, SParametr, FValue, SValue) VALUES (?,?,?,?,?)";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
			Connection connection = DriverManager.getConnection(connectionUrl, connectionLogin, connectionPassword);
			try {
				PreparedStatement statement = connection.prepareStatement(query);
				statement.setInt(1, insertedUserID);
				statement.setString(2, insertedFParametr);
				statement.setString(3, insertedSParametr);
				statement.setDouble(4, insertedFValue);
				statement.setDouble(5, insertedSValue);
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
			System.out.println("-_- Successfuly created convert operation -_-");
		}
	}
}
