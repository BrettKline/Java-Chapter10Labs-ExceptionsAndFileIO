
public class Payroll {
	private String name;
	private int idNumber;
	private double hourlyRate;
	private double hoursWorked;
	
	public Payroll(String name, int idNumber) throws BlankNameException, InvalidIDException {
		if (name.equals("")) {
			throw new BlankNameException();
		}
		this.name = name;
		if (idNumber < 0) {
			throw new InvalidIDException();
		}
		this.idNumber = idNumber;
	}
	public double GrossPay() {
		return hourlyRate * hoursWorked;
	}
	public String getName() {
		return name;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setName(String name) throws BlankNameException {
		if (name.equals(" ")) {
			throw new BlankNameException();
		}
		this.name = name;
	}
	public void setIdNumber(int idNumber) throws InvalidIDException {
		if (idNumber < 0) {
			throw new InvalidIDException();
		}
		this.idNumber = idNumber;
	}
	public void setHourlyRate(double hourlyRate) throws InvalidPayRateException {
		if (hourlyRate < 0 || hourlyRate > 25) {
			throw new InvalidPayRateException();
		}
		this.hourlyRate = hourlyRate;
	}
	public void setHoursWorked(double hoursWorked) throws InvalidTimeException {
		if (hoursWorked < 0 || hoursWorked > 84) {
			throw new InvalidTimeException();
		}
		this.hoursWorked = hoursWorked;
	}
	
}
