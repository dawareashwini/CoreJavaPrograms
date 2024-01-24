package jdbc;
//created by ashwini daware
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {
	Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;

	public PreparedStatementDemo() throws ClassNotFoundException, SQLException {
		connection = MyConnection.getMyConnection();
		System.out.println("Connect is established.");
	}

	public void insertRecord(int cust_id, String cname, String c_addr, String phoneNo) throws SQLException {
		preparedStatement = connection.prepareStatement("insert into customer values(?,?,?,?) ");
		preparedStatement.setInt(1, cust_id);
		preparedStatement.setString(2, cname);
		preparedStatement.setString(3, c_addr);
		preparedStatement.setString(4, phoneNo);

		int n = preparedStatement.executeUpdate();
		System.out.println(n + " Record is inserted");
	}

	public void searchByAddress(String c_addr) throws SQLException {
		preparedStatement = connection.prepareStatement("select * from customer where c_addr=?");
		preparedStatement.setString(1, c_addr);
		resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1) + "\t");
			System.out.println(resultSet.getString(2) + "\t");
			System.out.println(resultSet.getString(3) + "\t");
			System.out.println(resultSet.getString(4) + "\t");
			System.out.println();
		}
	}

	public void updateRecord(String phoneNo, int cust_id) throws SQLException {
		preparedStatement = connection.prepareStatement("update customer set phoneNo= ? where cust_id = ?");
		preparedStatement.setString(1, phoneNo);
		preparedStatement.setInt(2, cust_id);

		int n = preparedStatement.executeUpdate();
		System.out.println(n + " Record is updated");
	}

	public void getAllRecords() throws SQLException {
		// excute query
		preparedStatement = connection.prepareStatement("select * from customer");
		resultSet = preparedStatement.executeQuery();

		// retriving result
		System.out.println("Id\tName\tAddress\t\t\tPhoneNo");
		while (resultSet.next()) {
			System.out.print(resultSet.getInt(1) + "\t");
			System.out.print(resultSet.getString(2) + "\t");
			System.out.print(resultSet.getString(3) + "\t");
			System.out.print(resultSet.getString(4) + "\t");
			System.out.println();
		}
	}

	public void deleteRecord(int cust_id) throws SQLException {
		preparedStatement = connection.prepareStatement("delete from customer where cust_id=?");
		preparedStatement.setInt(1, cust_id);

		int n = preparedStatement.executeUpdate();
		System.out.println(n + "Record is deleted.");
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		PreparedStatementDemo demo = new PreparedStatementDemo();
		int cust_id;
		String cname, c_addr, phoneNo;
		int choice;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println(
					"\nEnter your choice.\n 1. Insert new record\n 2. Update Records\n 3. Search by city\n 4. Delete by id\n 5. Display records\n 6. Exit\n");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("--------------------------Insert Data-------------------");
				System.out.println("Enter id:");
				cust_id = sc.nextInt();
				System.out.println("Enter name:");
				cname = sc.next();
				System.out.println("Enter address:");
				c_addr = sc.next();
				System.out.println("Enter Phone No:");
				phoneNo = sc.next();

				demo.insertRecord(cust_id, cname, c_addr, phoneNo);
				break;

			case 2:
				System.out.println("-----------------Update Data----------------------");
				System.out.println("Enter Id : ");
				cust_id = sc.nextInt();
				System.out.println("Enter Phone No : ");
				phoneNo = sc.next();

				demo.updateRecord(phoneNo, cust_id);
				break;

			case 3:
				System.out.println("----------------Search Data-----------------------");
				System.out.println("Enter  Phone No : ");
				phoneNo = sc.next();
				System.out.println("Search by phoneNo : " + phoneNo);

				demo.searchByAddress(phoneNo);
				break;
			case 4:
				System.out.println("-----------------Delete Data----------------------");
				System.out.println("Enter Id : ");
				cust_id = sc.nextInt();

				demo.deleteRecord(cust_id);
				break;

			case 5:
				System.out.println("-----------------Display Records----------------------\n");
				demo.getAllRecords();
				break;

			default:
				System.out.println("Invalid Choice");
			}
		} while (choice != 6);

	}

}
