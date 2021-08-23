package com.programacao4devs.observer.subject.impl;

import java.util.ArrayList;
import java.util.List;

import com.programacao4devs.observer.interfaces.Observer;
import com.programacao4devs.observer.interfaces.Subject;

public class Forum implements Subject {
	
	private List<Observer> observers;
	private String message;
	
	public Forum() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int index = observers.indexOf(observer);
		if (index >= 0) {
			observers.remove(index);
		}
	}

	@Override
	public void notifyObservers() {
		for (int index = 0; index < observers.size(); index++) {
			Observer observer = (Observer)observers.get(index);
			observer.update(message);
		}
		
	}
	
	public void messageChanged() {
		 notifyObservers();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		messageChanged();
	}

}
