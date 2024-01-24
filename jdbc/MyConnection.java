package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	static Connection connection;

	public static Connection getMyConnection() throws ClassNotFoundException, SQLException {
		if (connection == null) {
			// register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// EStablish connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch10742", "root", "Ashu@23$28#");
			return connection;
		} else {
			return connection;

		}
	}
}
