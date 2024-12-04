package in.aqheel.beans;

public class CreditCardPayment implements IPayment{
	
	public CreditCardPayment() {
		System.out.println("Credit Card :: Contructor");
	}
	
public boolean processPayment(double billAmt) {
	System.out.println("Credit Card Payment successful...");
	return true;
}
}
