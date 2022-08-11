package entities;

public abstract class tax {
	private String name;
	private Double annualIncome;
	
	public tax() {
		
	}
	public tax(String name, Double annualIncome) {
		super();
		this.name = name;
		this.annualIncome = annualIncome;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public abstract double Tax();
}
