package toto.test.jdbc;

public class InvalidIbanException extends RuntimeException {

	public InvalidIbanException(String message) {
		super(message);
	}
}