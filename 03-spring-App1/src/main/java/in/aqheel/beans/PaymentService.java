package in.aqheel.beans;

public class PaymentService {

	private IPayment payment;
	
	public PaymentService() {
		System.out.println("paymentservice :: 0-param contructor");
	}
	public PaymentService(IPayment payment) {
		System.out.println("paymentservice :: param-contructor");
		this.payment=payment;
	}
	
	public void setpayment(IPayment payment) {
		System.out.println("setter method called..");
		this.payment=payment;
	}
	
	public void dopayment(double billAmt) {
		boolean status=payment.processPayment(billAmt);
		if(status) {
			System.out.println("Receipt Printing...");
		}else {
			System.out.println("Payment declined...");
		}
	}
}
