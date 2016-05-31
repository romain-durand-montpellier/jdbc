package toto.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	static String url = "jdbc:postgresql://localhost:5433/nubank";
	static String user = "romain";
	static String passwd = "st";
    public static void main( String[] args )
    {

		
    	int choice = -1;
		while (choice != 0) {
			System.out.println( "\nSelect an operation: \n1: Balance inquiry\n2: Money transfer\n0: Exit" );
			choice = inputNumber();
			if (choice == 1) {
				System.out.println( "\nEnter an IBAN (0 to exit): " );
				choice = inputNumber();
				if (choice != 0) { 
					System.out.println( "Balance: " + Account.getBalance(choice) );
				}
				else choice = -1;
			}
			if (choice == 2) {
				
			}
			
		}
        
    }
    private static int inputNumber() {
		Integer number = null;
		
		Scanner reader = new Scanner(System.in);
		System.out.println ("Entrez un nombre: ");

		while (number==null)
		{
		try {
			number = reader.nextInt();
		  }
		catch (java.util.InputMismatchException e) {
			reader.nextLine();
		    System.out.println("Entrée non valide !");
		  }
		catch (java.util.NoSuchElementException e) {
			System.exit(0);
//			reader.nextLine();
//		    System.out.println("Entrée non valide !");
		  }		
		}
		return (number);
	}
}
