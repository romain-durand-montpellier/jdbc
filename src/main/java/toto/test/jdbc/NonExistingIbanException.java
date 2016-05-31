package toto.test.jdbc;

public class NonExistingIbanException extends RuntimeException {

	public NonExistingIbanException(String message) {
		super(message);
	}
}
