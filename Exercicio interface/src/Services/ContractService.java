package Services;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installment;

public class ContractService {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private OnlinePayments onlinepayments;
		
	public ContractService(OnlinePayments onlinepayments) {
		this.onlinepayments = onlinepayments;
	}

	public void processContract(Contract contract, Integer months) {
		Double total = contract.getTotalValue() / months;
		
		for (int i = 1; i <= months; i++) {
			Date date = addMonths(contract.getDate(), i);
			Double interest = total + onlinepayments.interest(total, i);
			Double full = interest + onlinepayments.paymentFee(interest);
			contract.getInstallment().add(new Installment(date, full));
		}
	}
		private Date addMonths(Date date , int m) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.MONTH, m);
			return cal.getTime();
		}
}