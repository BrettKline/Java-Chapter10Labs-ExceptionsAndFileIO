
public class TestScores {
	private double testAvg;
	private double testTotal;
	
	TestScores(double[] testScores) {
		testTotal = 0;
		testAvg = 0;
		for (int counter = 0; counter < testScores.length; counter++) {
			if (testScores[counter] < 0 || testScores[counter] > 100) {
				throw new IllegalArgumentException("Test score cannot be " + ((testScores[counter] > 100) ? "above 100." : "below 0."));
			}
			testTotal += testScores[counter];
		}
		testAvg = (testTotal / testScores.length);
	}

	@Override
	public String toString() {
		return "TestScores [testAvg=" + testAvg + ", testTotal="
				+ testTotal + "]";
	}
}
