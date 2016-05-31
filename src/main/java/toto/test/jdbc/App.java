package toto.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Hello world!
 *
 */
public class App {
	static String url = "jdbc:postgresql://localhost:5433/nubank";
	static String user = "romain";
	static String passwd = "st";

	public static void main(String[] args) {
		int choice = -1;
		String choicestr = null;
		while (choice != 0) {
			System.out.println("\nSelect an operation: \n1: Balance inquiry\n2: Money transfer\n0: Exit");
			choice = inputNumber();
			if (choice == 1) {
				System.out.println("\nEnter an IBAN (XXX-XXXX or 0 to exit): ");
				choicestr = inputString();
				if (choice >= 0) {
					// compilation de la regex
					Pattern p = Pattern.compile("(a((b)(c)))");
					// création d'un moteur de recherche
					Matcher m = p.matcher("abc");
					// lancement de la recherche de toutes les occurrences
					boolean b = m.matches();
					if (choice == 0)
						choice = -1;
					else
						System.out.println("Balance: " + Account.getBalance(choice));
				} else
					throw new InvalidIbanException("Invalid IBAN: " + choice);
			}
			if (choice == 2) {
			}
		}
	}

	private static int inputNumber() {
		Integer number = null;

		Scanner reader = new Scanner(System.in);
		System.out.println("Entrez un nombre: ");

		while (number == null) {
			try {
				number = reader.nextInt();
			} catch (java.util.InputMismatchException e) {
				reader.nextLine();
				System.out.println("Entrée non valide !");
			} catch (java.util.NoSuchElementException e) {
				System.exit(0);
				// reader.nextLine();
				// System.out.println("Entrée non valide !");
			}
		}
		return (number);
	}
	private static String inputString() {
		String yourstring = null;

		Scanner reader = new Scanner(System.in);
		System.out.println("Entrez une chaine: ");

		while (yourstring == null) {
			try {
				yourstring = reader.next();
			} catch (java.util.InputMismatchException e) {
				reader.nextLine();
				System.out.println("Entrée non valide !");
			} catch (java.util.NoSuchElementException e) {
				System.exit(0);
				// reader.nextLine();
				// System.out.println("Entrée non valide !");
			}
		}
		return (yourstring);
	}
}
