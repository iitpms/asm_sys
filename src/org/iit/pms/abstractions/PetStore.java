package org.iit.pms.abstractions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.iit.pms.builder.AnimalBuilder;
import org.iit.pms.helper.AnimalType;

public class PetStore implements Observable {
	private String name;
	private String address;
	private double discount;
	private HashMap<AnimalType, Integer> animalCountMap;
	private List<Animal> animals;
	private ArrayList<Subscriber> subscriberList;

	public PetStore(String address, String name) {
		this.address = address;
		this.name = name;
		animalCountMap = new HashMap<>();
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
		if(!animalCountMap.containsKey(animal.type))
			animalCountMap.put(animal.type, 1);
		else {
			int current_count = animalCountMap.get(animal.type);
			animalCountMap.put(animal.type, current_count + 1);
		}
	}

	public Animal search(String name) throws NullPointerException {
		for (Animal animal : animals) {
			if (animal.name.equals(name))
				return animal;
		}
		return null;
	}
	
	public void printCount() {
		for(AnimalType animType : animalCountMap.keySet()) {
			System.out.println(animType.toString() + ":" + animalCountMap.get(animType));
		}
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
	
//	public static void main(String[] args) {
//		PetStore ps = new PetStore("Dhaka", "MyPetty");
//		Animal hati = new Animal(new AnimalBuilder("Hati", 10, AnimalType.EarthAnimal, 1000f, true, false, true));
//		ps.addAnimal(hati);
//		Animal tortoise = new Animal(new AnimalBuilder("Tortoise", 10, AnimalType.WaterAnimal, 1000f, true, false, true));
//		ps.addAnimal(tortoise);
//		ps.addAnimal(tortoise);
//		ps.printCount();
//	}
}