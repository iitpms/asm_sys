package org.iit.pms.abstractions;

public class Client implements Subscriber {
	private String name;
	private INotifier inotifier;

	public Client(INotifier inotifier, String name) {
		this.name = name;
		this.inotifier = inotifier;
	}

	public String getName() {
		return name;
	}

	@Override
	public void getDiscountMessage(double discountPrice) {
		inotifier.receiveNotification(discountPrice);
	}

}
