package in.aqheel.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String args[]) {
	ApplicationContext cxt = new ClassPathXmlApplicationContext("Beans.xml");
	PaymentService service = cxt.getBean(PaymentService.class);
	service.dopayment(200.00);
}
}
