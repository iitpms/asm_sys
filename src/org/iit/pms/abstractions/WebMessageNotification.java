package org.iit.pms.abstractions;

public class WebMessageNotification implements INotifier {
	@Override
	public void receiveNotification(double discountedPrice) {
		System.out.println("sending web message notification "
				+ discountedPrice);
	}

}
