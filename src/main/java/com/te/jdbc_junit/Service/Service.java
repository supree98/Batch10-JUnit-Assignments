package com.te.jdbc_junit.Service;

import java.sql.SQLException;

public interface Service {
	public boolean insert(Employee employee) throws SQLException, ClassNotFoundException;

	public boolean delete(int eid) throws SQLException, ClassNotFoundException;

	public boolean updateAge(int eid, int age) throws SQLException, ClassNotFoundException;

	public boolean select(int eid) throws SQLException, ClassNotFoundException;
}
