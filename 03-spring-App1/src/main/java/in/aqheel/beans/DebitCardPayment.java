package in.aqheel.beans;

public class DebitCardPayment implements IPayment {
	
	public DebitCardPayment() {
		System.out.println("Debit Card :: Contructor");
	}
public boolean processPayment(double billAmt) {
	System.out.println("Debit Card Payment successful...");
	return true;
}
}
