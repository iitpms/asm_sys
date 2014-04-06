package org.iit.pms.abstractions;

public class EmailNotification implements INotifier {

	@Override
	public void receiveNotification(double discountedPrice) {
		System.out.println("sending email notification " + discountedPrice);
	}

}
