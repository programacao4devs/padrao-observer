package com.programacao4devs.observer.interfaces;


public interface Subject {

	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
	
}
