package com.converter.dboperations;
import java.sql.*;
import java.util.ArrayList;
import com.converter.db.*;

public class GetUsers {
	private String connectionUrl = "jdbc:sqlserver://localhost;database=converter";
	private String connectionLogin = "xoBot";
	private String connectionPassword = "1234qwer";
	public ArrayList<Users> getUserByUserID(int insertedUserID){
		ArrayList<Users> usersList = new ArrayList<Users>();
		String query = "SELECT * FROM Users WHERE UserID = ?";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
			Connection connection = DriverManager.getConnection(connectionUrl, connectionLogin, connectionPassword);
			try {
				PreparedStatement statement = connection.prepareStatement(query);
				statement.setInt(1, insertedUserID);
				ResultSet queryResult = statement.executeQuery();
				while(queryResult.next()) {
					int userID = queryResult.getInt(1);
					String login = queryResult.getString(2);
					String password = queryResult.getString(3);
					Users users = new Users(userID, login, password);
					usersList.add(users);
				}
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
			System.out.println("-_- Successfuly got users list by id -_-");
		}
		return usersList;
	}
	
	public ArrayList<Users> getUserByLogin(String insertedLogin){
		ArrayList<Users> usersList = new ArrayList<Users>();
		String query = "SELECT * FROM Users WHERE Login = ?";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
			Connection connection = DriverManager.getConnection(connectionUrl, connectionLogin, connectionPassword);
			try {
				PreparedStatement statement = connection.prepareStatement(query);
				statement.setString(1, insertedLogin);
				ResultSet queryResult = statement.executeQuery();
				while(queryResult.next()) {
					int userID = queryResult.getInt(1);
					String login = queryResult.getString(2);
					String password = queryResult.getString(3);
					Users users = new Users(userID, login, password);
					usersList.add(users);
				}
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
			System.out.println("-_- Successfuly got users list by login -_-");
		}
		return usersList;
	}
}