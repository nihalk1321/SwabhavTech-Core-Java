package com.monocept.test;

import com.monocept.model.Boy;
import com.monocept.model.IEmotionable;
import com.monocept.model.IMannerable;
import com.monocept.model.Man;

public class MainTest {
	public static void main(String[] args) {
		Man man = new Man();
		Boy boy = new Boy();

		atTheParty(man);
		atTheParty(boy);

//		atTheMovie(man);
		atTheMovie(boy);
	}

	private static void atTheParty(IMannerable obj) {
		System.out.println("at the party");
		obj.depart();
		obj.wish();
		System.out.println(" ");
	}

	private static void atTheMovie(IEmotionable obj) {
		System.out.println("at movie");
		obj.cry();
		obj.laugh();
		System.out.println(" ");
	}

}
