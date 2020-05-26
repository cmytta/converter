package com.converter.dboperations;
import java.sql.*;
import java.util.ArrayList;
import com.converter.db.*;

public class GetConv {
	private String connectionUrl = "jdbc:sqlserver://localhost;database=converter";
	private String connectionLogin = "xoBot";
	private String connectionPassword = "1234qwer";
	public ArrayList<Conv> getConvByConvertID(int insertedConvertID){
		ArrayList<Conv> convList = new ArrayList<Conv>();
		String query = "SELECT * FROM Conv WHERE ConvertID = ?";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
			Connection connection = DriverManager.getConnection(connectionUrl, connectionLogin, connectionPassword);
			try {
				PreparedStatement statement = connection.prepareStatement(query);
				statement.setInt(1, insertedConvertID);
				ResultSet queryResult = statement.executeQuery();
				while(queryResult.next()) {
					int convertID = queryResult.getInt(1);
					int userID = queryResult.getInt(2);
					String fParametr = queryResult.getString(3);
					String sParametr = queryResult.getString(4);
					double fValue = queryResult.getDouble(5);
					double sValue = queryResult.getDouble(6);
					Conv conv = new Conv(convertID, userID, fParametr, sParametr, fValue, sValue);
					convList.add(conv);
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
			System.out.println("-_- Successfuly got convert operation list by convert id -_-");
		}
		return convList;
	}
	
	public ArrayList<Conv> getConvByUserID(int insertedUserID){
		ArrayList<Conv> convList = new ArrayList<Conv>();
		String query = "SELECT * FROM Conv WHERE UserID = ?";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
			Connection connection = DriverManager.getConnection(connectionUrl, connectionLogin, connectionPassword);
			try {
				PreparedStatement statement = connection.prepareStatement(query);
				statement.setInt(1, insertedUserID);
				ResultSet queryResult = statement.executeQuery();
				while(queryResult.next()) {
					int convertID = queryResult.getInt(1);
					int userID = queryResult.getInt(2);
					String fParametr = queryResult.getString(3);
					String sParametr = queryResult.getString(4);
					double fValue = queryResult.getDouble(5);
					double sValue = queryResult.getDouble(6);
					Conv conv = new Conv(convertID, userID, fParametr, sParametr, fValue, sValue);
					convList.add(conv);
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
			System.out.println("-_- Successfuly got convert operation list by user id -_-");
		}
		return convList;
	}

	public ArrayList<Conv> getConvByFParametr(int insertedFParametr){
		ArrayList<Conv> convList = new ArrayList<Conv>();
		String query = "SELECT * FROM Conv WHERE FParametr = ?";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getDeclaredConstructor().newInstance();
			Connection connection = DriverManager.getConnection(connectionUrl, connectionLogin, connectionPassword);
			try {
				PreparedStatement statement = connection.prepareStatement(query);
				statement.setInt(1, insertedFParametr);
				ResultSet queryResult = statement.executeQuery();
				while(queryResult.next()) {
					int convertID = queryResult.getInt(1);
					int userID = queryResult.getInt(2);
					String fParametr = queryResult.getString(3);
					String sParametr = queryResult.getString(4);
					double fValue = queryResult.getDouble(5);
					double sValue = queryResult.getDouble(6);
					Conv conv = new Conv(convertID, userID, fParametr, sParametr, fValue, sValue);
					convList.add(conv);
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
			System.out.println("-_- Successfuly got convert operation list by firs parametr -_-");
		}
		return convList;
	}

}
