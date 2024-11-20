package com.java.dsa;

public class SettingDevEnvironment {

	private static final String url = "jdbc:mysql://localhost:3306/db_zabala";
	private static final String user = "root";
	private static final String password = "";

	public static void main(String[] args) {
		
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			
			System.out.println("Connection Successful!");
			
			connection.close();
		
		} catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
