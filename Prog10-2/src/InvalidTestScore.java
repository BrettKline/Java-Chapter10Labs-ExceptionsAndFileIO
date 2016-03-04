
public class InvalidTestScore extends Exception {
	public InvalidTestScore() {
		super("A test score was below 0 or above 100.");
	}
}
