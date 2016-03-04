import java.util.Scanner;
public class prog10_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] sampleTestScores = {0, 78, 89, 90, 100, 69, 77, 88, 94, 93};
		System.out.println("Input a test score to fit into the array of default scores. Input >100 or <0 to cause an exception.");
		sampleTestScores[0] = input.nextDouble();
		try {
			TestScores myTestScores = new TestScores(sampleTestScores);
			System.out.println(myTestScores);
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		input.close();
	}

}
