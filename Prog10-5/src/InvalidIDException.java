
public class InvalidIDException extends Exception {
	InvalidIDException() {
		super("The Employee ID entered was invalid. It should not be blank or negative.");
	}
 
}
