package labcodeinspection;

import java.util.Locale;

public class Email {

	final transient private String firstName;
	final transient private String lastName;
	transient private String password = "";
	transient private String department;
	final transient private int defaultpassLength = 8;
	transient private String email;
	
	/**
	 * This is the constructor method for the email  
	 *@param firstName, lastName
	 */
	public Email(final String firstName,final String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = "";
		this.email = "";
	}
	
	/**
	 * This is the showInfo method for the email  
	 */
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + firstName + "\nLAST NAME= " + lastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}
	
	/**
	 * This is the setDeparment method for the email  
	 *@param depChoice
	 */
	public void setDeparment(final int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
			System.out.println("this is default");
		}
	}

	private String randomPassword(final int length) {
		final String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			final int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}
	
	/**
	 * This is the generateEmail method for the email  
	 */
	public void generateEmail() {
		this.password = this.randomPassword(this.defaultpassLength);
		final String lower=this.firstName.toLowerCase(Locale.ENGLISH) + this.lastName.toLowerCase(Locale.ENGLISH) + "@" + this.department+ ".espol.edu.ec";
		this.email = lower;
				
	}
}
