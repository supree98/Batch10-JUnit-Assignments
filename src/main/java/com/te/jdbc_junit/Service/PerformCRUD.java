package com.te.jdbc_junit.Service;

import java.sql.SQLException;

public class PerformCRUD {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DataService service = new DataService();
		service.setup();
		Employee employee = new Employee();
		employee.setEid(10);
		employee.setName("Messi");
		employee.setAge(32);

		System.out.println(service.delete(employee.getEid()));
		;

	}

}
