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
	
	public void receiveMailNotification(double discountPrice){
		System.out.println("Mail Notification :" + discountPrice);
	}
	
	public void receiveEmailNotification(double discountPrice){
		System.out.println("Email Notification :" + discountPrice);
	}
	
	public void receiveWebNotification(double discountPrice){
		System.out.println("Web Notification :" + discountPrice);
	}
	
	public void receiveSMSNotification(double discountPrice){
		System.out.println("SMS Notification :" + discountPrice);
	}
}
