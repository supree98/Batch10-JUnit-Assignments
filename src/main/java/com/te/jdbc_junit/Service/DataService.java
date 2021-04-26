package com.te.jdbc_junit.Service;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataService implements Service {

	Statement statement = null;
	PreparedStatement ps = null;
	Connection con = null;
	ResultSet rs = null;
	int result = 0;

	public void setup() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db?user=root&password=root");
	}

	@Override
	public boolean insert(Employee employee) throws SQLException, ClassNotFoundException {
		setup();
		String sql = "insert into employee values(?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setInt(1, employee.getEid());
		ps.setString(2, employee.getName());
		ps.setInt(3, employee.getAge());
		result = ps.executeUpdate();
		if (result == 1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean delete(int eid) throws SQLException, ClassNotFoundException {
		setup();
		String sql = "delete from employee where eid = ?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, eid);
		result = ps.executeUpdate();
		if (result == 1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean updateAge(int eid, int age) throws SQLException, ClassNotFoundException {
		setup();
		String sql = "update employee set age = ? where eid = ?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, age);
		ps.setInt(2, eid);
		result = ps.executeUpdate();
		if (result == 1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean select(int eid) throws SQLException, ClassNotFoundException {
		setup();
		String sql = "select * from employee where eid = ?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, eid);
		rs = ps.executeQuery();
		return rs.next();
	}

}
