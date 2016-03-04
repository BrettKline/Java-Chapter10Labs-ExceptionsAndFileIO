
public class TestScores {
	private double testAvg;
	private double testTotal;
	
	TestScores(double[] testScores) throws InvalidTestScore {
		testTotal = 0;
		testAvg = 0;
		for (int counter = 0; counter < testScores.length; counter++) {
			if (testScores[counter] < 0 || testScores[counter] > 100) {
				throw new InvalidTestScore();
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
