package com.test.util;


	
	
	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	public class ConnectionUtil {
		public static Connection openConnection() {
			Connection connection = null;
			System.out.println("Before try In Connection Util Database Connection Class ");
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("Driver is Loaded In Try Block");
				connection = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:XE", "test","test");
				System.out.println("Connection Established");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return connection;
		}
		public static void closeConnection(ResultSet resultSet,Statement statement, Connection connection) {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
			public static void main(String[] args) {
				//testing connection
				System.out.println(ConnectionUtil.openConnection());
				
			}
	}



