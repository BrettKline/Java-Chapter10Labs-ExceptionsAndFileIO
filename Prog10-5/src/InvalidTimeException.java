
public class InvalidTimeException extends Exception {
	InvalidTimeException() {
		super("The number of hours worked was invalid; it must be non-negative and less than 84.");
	}

}
