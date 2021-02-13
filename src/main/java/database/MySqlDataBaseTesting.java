package database;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class MySqlDataBaseTesting {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection con= (Connection) DriverManager.getConnection("");
		Statement s = (Statement) con.createStatement();
		ResultSet rs = s.executeQuery("");

		while(rs.next())
		{
			System.out.println(rs.getString("username"));
			System.out.println(rs.getString("password"));
		}
	}

}
