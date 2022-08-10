package entities;

public class currencyConverter {
	
	public static double IOF = 0.06;
			
	public static double dollarTotal(double dollarPrice, double dollarBought) {
		return dollarPrice * dollarBought * (1 + IOF);
	}
}
