package entities;

public class PJ extends tax {
	private Integer employeeNumber;

	public PJ(String name, Double annualIncome, Integer employeeNumber) {
		super(name, annualIncome);
		this.employeeNumber = employeeNumber;
	}

	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	@Override
	public double Tax() {
		double imp = 0;
		if (getEmployeeNumber() > 10) {
			imp = getAnnualIncome() * 0.14;
		}
		else {
			imp = getAnnualIncome() * 0.16;
		}
		return imp;
	}
	
	
}
