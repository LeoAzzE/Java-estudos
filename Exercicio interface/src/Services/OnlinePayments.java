package Services;

public interface OnlinePayments {
	
	Double paymentFee(Double amount) ;	
	Double interest(Double amount, Integer months) ;
		
	
}
