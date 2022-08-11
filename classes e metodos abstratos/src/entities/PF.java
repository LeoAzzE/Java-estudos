package entities;

public class PF extends tax {
	private Double healthExpenses;

	public PF() {
		
	}
	public PF(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public double Tax() {
		double imp = 0;
		if (getAnnualIncome() < 20.000) {
			imp = getAnnualIncome() * 0.15;
			if (getHealthExpenses() > 0) {
				imp -= (getHealthExpenses() * 0.5);
			}
		}
		if (getAnnualIncome() >= 20.000) {
			imp = getAnnualIncome() * 0.25;
			if (getHealthExpenses() > 0) {
				imp -= (getHealthExpenses() * 0.5);
			}
		}
		return imp;
	}
}
