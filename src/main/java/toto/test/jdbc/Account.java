package toto.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Account {

	private int iban;
	private int balance;

	public Account(int iban, int balance) {
		this.iban = iban;
		this.balance = balance;
	}

	public static int getBalance(int theiban) {
		int balance = 0;
		System.out.println("Connecting to database:");
		try (Connection connection = DriverManager.getConnection(App.url, App.user, App.passwd)) {
			// Code using the connection
			System.out.println("Connection seems to be OK");
			String request = "SELECT * FROM account WHERE id=" + theiban;
			try {
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(request);
				if (!resultSet.isBeforeFirst()) {
					throw new NonExistingIbanException("IBAN not found: " + theiban);
				}

				while (resultSet.next()) {
					return (resultSet.getInt("balance"));
					// int bank_id = resultSet.getInt("bank_id");
					// int id = resultSet.getInt("id");
					// System.out.println( "Balance: " + balance + ", bank: " +
					// bank_id + ", account id:" + id );
					// String name = resultSet.getString("name");
					// System.out.println( name );
					// int id = resultSet.getInt("id");
					// System.out.println( id );
					// byte[] b = resultSet.getBytes("c");

				}

			} catch (SQLException e) {
				// traitement de l'exception
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return balance;
	}

}
