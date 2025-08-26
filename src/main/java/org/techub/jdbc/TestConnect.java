package org.techub.jdbc;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TestConnect {

	public static void main(String[] args) {
		DriverManagerDataSource d= new DriverManagerDataSource();
		d.setDriverClassName("com.mysql.cj.jdbc.Driver");
		d.setUsername("root");
		d.setPassword("root");
		d.setUrl("jdbc:mysql://localhost:3306/mysql");
		if(d!=null) {
			System.out.println("Database is connected");
		}
		else
		{
			System.out.println("Database is not connected");
		}
	}

	

}
