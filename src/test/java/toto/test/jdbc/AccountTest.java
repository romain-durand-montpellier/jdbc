package toto.test.jdbc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AccountTest {
	@Test
	public void GivenAnInvalidIBANReturn99999() {
		//Given
		int iban = -85;
		
		//When
		Account an_account = new Account(iban, iban);
		//Bank bank = new Bank(name);
		
		//Then
		assertEquals(Account.getBalance(iban),-9999);
	}
}
