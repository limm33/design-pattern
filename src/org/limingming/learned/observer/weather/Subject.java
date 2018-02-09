package org.limingming.learned.observer.weather;

public interface Subject {
	 void registerObserver(Observer o);
	 void removeObserver(Observer o);
	 void notifyObservers();
}
