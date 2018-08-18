package com.purbarun.dp.subject;
import java.util.ArrayList;
import java.util.List;
import com.purbarun.dp.observer.Observer;

public class Subject implements ISubject {

	List<Observer> observerList = new ArrayList<Observer>();
	private int flag;

	int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
		notifyObservers();
	}

	@Override
	public void register(Observer ob) {
		observerList.add(ob);
	}

	@Override
	public void unregister(Observer ob) {
		observerList.remove(ob);
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observerList.size(); i++) {
			observerList.get(i).update();
		}
	}
}
