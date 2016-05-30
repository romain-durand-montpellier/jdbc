package toto.test.jdbc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClientTest {

	@Test
	public void GivenALastNameAndFirstNAmeCreateAClient() {
		//Given
		String lastname = "ALASTNAME";
		String firstname = "AFirstname";
		
		//When
		Client client = new Client(lastname, firstname);
		
		//Then
		assertEquals(client.lastname,lastname);
		assertEquals(client.firstname, firstname);
	}	
}
