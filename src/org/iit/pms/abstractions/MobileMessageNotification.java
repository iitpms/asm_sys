package org.iit.pms.abstractions;

public class MobileMessageNotification implements INotifier {
	@Override
	public void receiveNotification(double discountedPrice) {
		System.out.println("sending mobile message notification "
				+ discountedPrice);
	}

}
