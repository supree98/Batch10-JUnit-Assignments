package com.te.jdbc_junit.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class DataServiceTest {

	DataService service = new DataService();

	@Test
	@Disabled
	void testInsert() throws SQLException, ClassNotFoundException {
		Employee employee = new Employee();
		employee.setEid(20);
		employee.setName("Ronaldo");
		employee.setAge(34);
		assertEquals(true, service.insert(employee), " test for insert method ");
	}

	@Test
	@Disabled
	void testDelete() throws ClassNotFoundException, SQLException {
		assertEquals(true, service.delete(20), " test for delete method ");
	}

	@Test
	@Disabled
	void tesetUpdate() throws ClassNotFoundException, SQLException {
		assertEquals(true, service.updateAge(10, 33), "test for update method");

	}

	@Test
	void testSelect() throws ClassNotFoundException, SQLException {
		assertEquals(false, service.select(20), "test for select method");
	}
}
