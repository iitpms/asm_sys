package org.iit.pms.abstractions;

import java.util.ArrayList;
import java.util.List;

public class PetStore implements Observable {
	private StoreName name;
	private String address;
	private double discount;
	private ArrayList<Subscriber> subscriberList;

	public PetStore() {
		subscriberList = new ArrayList<>();
	}

	public StoreName getName() {
		return name;
	}
public void setName(StoreName name) {
	this.name = name;
}
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
		notifySubscribers(subscriberList);

	}

	@Override
	public void subscribe(Subscriber subscriber) {
		if (!subscriberList.contains(subscriber)) {
			subscriberList.add(subscriber);
		} else {
			return;
		}
	}

	@Override
	public void unSubscribe(Subscriber subscriber) {
		if (subscriberList.contains(subscriber)) {
			subscriberList.remove(subscriber);
		} else {
			return;
		}

	}

	@Override
	public void notifySubscribers(List<Subscriber> subscriberList) {
		for (Subscriber subscriber : subscriberList) {
			subscriber.getDiscountMessage(getDiscount());
		}
	}
}