package org.iit.pms.abstractions;

public class Client implements Subscriber {
	private String name;

	public Client(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void getDiscountMessage(double discountPrice) {
		System.out
				.println("Hello Mr."
						+ getName()
						+ " valued client.You are getting German Shepherd at a price of "
						+ discountPrice);
	}
}
