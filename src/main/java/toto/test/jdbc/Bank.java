package toto.test.jdbc;

import java.util.List;

public class Bank {
private String name;
List<Client> clientlist;
private List<Account> accountlist;

	public Bank(String newName) {
	this.name = newName;
}

	public List<Client> getClients() {
		return null;
	}
	
	public List<Account> getAccounts() {
		return null;
	}
	
	public Client getClients (String lastname, String firstname) {
		return null;
	}
	
	public Account getAccount (String lastname) {
		return null;
	}
	
	public Client addClient (Client client) {
		return null;
	}
	
	public Client addClient (String name, String firstname) {
		return null;
	}

	public String getName() {
		return this.name;
	}
}
