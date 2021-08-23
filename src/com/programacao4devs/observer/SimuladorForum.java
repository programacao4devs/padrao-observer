package com.programacao4devs.observer;

import com.programacao4devs.observer.impl.User;
import com.programacao4devs.observer.subject.impl.Forum;

public class SimuladorForum {

	public static void main(String[] args) {
		
		Forum forum = new Forum();
		
		User user1 = new User("Ana", forum);
		User user2 = new User("Pedro", forum);
		
		forum.setMessage("Estamos analisando o tema da próxima palestra...");
		forum.setMessage("O tema da palestra será sobre microserviços");
		
		System.out.println();
		user2.unsubscribe();
		System.out.println("Usuário: " + user2.getName() + " se desinscreveu do forum");
		
		System.out.println("Novos usuários entrando no fórum...");
		User user3 = new User("Bob", forum);
		User user4 = new User("Viviane", forum);
		System.out.println();
		
		forum.setMessage("Palestra agendada sobre microserviços no dia 23/11/21 às 19:00");
		
	}

}
