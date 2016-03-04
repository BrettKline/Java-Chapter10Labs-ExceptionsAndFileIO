
public class InvalidPayRateException extends Exception {
	InvalidPayRateException() {
		super("The pay rate was invalid. It must be a non-negative number less than 25.");
	}

}
