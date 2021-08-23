package com.programacao4devs.observer.impl;

import com.programacao4devs.observer.interfaces.Display;
import com.programacao4devs.observer.interfaces.Observer;
import com.programacao4devs.observer.interfaces.Subject;

public class User implements Observer, Display {
	
	private String name;
	private Subject forum;
	
	public User(String name, Subject forum) {
		this.name = name;
		this.forum = forum;
		forum.registerObserver(this);
	}

	@Override
	public void display(String message) {
		System.out.format("Usuário(a): %s, recebeu a seguinte mensagem do forum: %s", name, message );
		System.out.println();
	}

	@Override
	public void update(String message) {
		display(message);
	}
	
	public void unsubscribe() {
		this.forum.removeObserver(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
