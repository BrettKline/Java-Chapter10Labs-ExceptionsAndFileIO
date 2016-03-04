import java.util.Scanner;
public class Prog10_5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Enter a name, then ID number for an employee.");
			String inputName = input.nextLine();
			int inputIDnumber = input.nextInt();
			Payroll employee1 = new Payroll(inputName, inputIDnumber);
			System.out.println("Enter their hourly rate, then hours worked.");
			employee1.setHourlyRate(input.nextDouble());
			employee1.setHoursWorked(input.nextDouble());
			System.out.println("The employee " + employee1.getName() + " earned $" + employee1.GrossPay() + " this pay cycle.");
		}
		catch(BlankNameException | InvalidIDException | InvalidTimeException | InvalidPayRateException e) {
			System.out.println(e.getMessage());
		}
		input.close();
	}

}
