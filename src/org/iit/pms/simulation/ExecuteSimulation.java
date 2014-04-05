package org.iit.pms.simulation;

import org.iit.pms.abstractions.Client;
import org.iit.pms.abstractions.PetStore;
import org.iit.pms.abstractions.Subscriber;

public class ExecuteSimulation {

	public static void main(String[] args) {
		PetStore store = new PetStore();
		Subscriber subscriber1 = new Client("Amit");
		Subscriber subscriber2 = new Client("Forhad");
		store.subscribe(subscriber1);
		store.unSubscribe(subscriber2);

		store.setAddress("Vuter Goli");
		store.setName("HoiChoi Pet Store");
		store.setDiscount(12.12);
		store.setDiscount(12.12);

	}

}
