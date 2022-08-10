package entities;

public class emplo {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return (grossSalary - tax);
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += (grossSalary/100) * percentage;
	}
	
	public String ToString() {
		return name 
		+ ", " + "$ " + String.format("%.2f", netSalary());
	}
}
