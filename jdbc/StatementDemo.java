package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {
	Connection connection;
	java.sql.Statement statement;
	ResultSet resultSet;

	public StatementDemo() throws ClassNotFoundException, SQLException {
		connection = MyConnection.getMyConnection();
		System.out.println("connect is establish.");
	}

	public void getAllRecords() throws SQLException {
		// create statement
		statement = connection.createStatement();
		// execute query
		resultSet = statement.executeQuery("select * from customer");
		// retrieve result
		while (resultSet.next()) {
			System.out.print(resultSet.getInt("cust_id") + "\t");
			System.out.print(resultSet.getString("cname") + "\t");
			System.out.print(resultSet.getString("c_addr") + "\t");
			System.out.print(resultSet.getString("PhoneNo") + "\t");
			System.out.println();
		}
		// close connection
		connection.close();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		StatementDemo statementDemo = new StatementDemo();
		statementDemo.getAllRecords();
	}
}
