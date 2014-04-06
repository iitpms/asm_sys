package org.iit.pms.simulation;

import org.iit.pms.abstractions.Client;
import org.iit.pms.abstractions.PetStore;
import org.iit.pms.abstractions.StoreName;
import org.iit.pms.abstractions.Subscriber;

public class ExecuteSimulation {

	public static void main(String[] args) {
		PetStore store = new PetStore("Vuter Goli", "Forid Animal Store");
		Subscriber subscriber1 = new Client("Amit");
		Subscriber subscriber2 = new Client("Forhad");
		store.subscribe(subscriber1);
		store.unSubscribe(subscriber2);

		store.setDiscount(12.12);
		store.setDiscount(12.12);

	}

}
