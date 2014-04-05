package org.iit.pms.abstractions;

import java.util.List;

public interface Observable {
	void subscribe(Subscriber subscriber);

	void unSubscribe(Subscriber subscriber);

	void notifySubscribers(List<Subscriber> subscribers);
}
