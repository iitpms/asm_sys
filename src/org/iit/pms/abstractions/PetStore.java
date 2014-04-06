package org.iit.pms.abstractions;

import java.util.ArrayList;
import java.util.List;

public class PetStore implements Observable {
	private String name;
	private String address;
	private double discount;
	private List<Animal> animals;
	private ArrayList<Subscriber> subscriberList;

	public PetStore(String address, String name) {
		this.address = address;
		this.name = name;
		subscriberList = new ArrayList<>();
		animals = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
		notifySubscribers(subscriberList);
	}

	public void addAnimal(Animal animal) {
		this.animals.add(animal);
	}

	public Animal search(String name) throws NullPointerException {
		for (Animal animal : animals) {
			if (animal.name.equals(name))
				return animal;
		}
		return null;
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