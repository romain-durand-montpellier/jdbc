package toto.test.jdbc;

import static org.junit.Assert.assertEquals;

//import java.util.List;

import org.junit.Test;

import toto.test.jdbc.Bank;


public class BankTest {
	@Test
	public void GivenANameCreateABank() {
		//Given
		String name = "AName";
		
		//When
		Bank bank = new Bank(name);
		
		//Then
		assertEquals(bank.getName(),(name));
	}
	

//3eme test
//	@Test
//	public void ShouldPopulateClientList() {
//		//Given
//		Bank bank = new Bank("bankname");
//		//Client client = new Client("ALastName", "AFirstName");
//		
//		//When
//		bank.addClient();
//		
//		//Then
//		AssertTrue(bank.clientlist, bank.getClients());
//		
//	}
}
