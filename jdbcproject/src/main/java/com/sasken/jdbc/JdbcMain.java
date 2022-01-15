package com.sasken.jdbc;



public class JdbcMain {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			System.out.println("JDBC driver loaded");
			
			
			
		}
			
			
		 catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
	


