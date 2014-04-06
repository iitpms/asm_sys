package org.iit.pms.abstractions;

public class MailNotification implements INotifier {
	@Override
	public void receiveNotification(double discountedPrice) {
		System.out.println("sending mail notification " + discountedPrice);
	}

}
