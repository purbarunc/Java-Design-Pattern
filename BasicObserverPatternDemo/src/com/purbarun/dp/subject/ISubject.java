package com.purbarun.dp.subject;

import com.purbarun.dp.observer.Observer;

public interface ISubject {
	void register(Observer ob);

	void unregister(Observer ob);

	void notifyObservers();
}
