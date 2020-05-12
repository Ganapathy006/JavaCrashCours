package com.lao.conditionalExample;

import java.lang.invoke.SwitchPoint;

public class MyHero {

	String hero = "Captain America";

	public void heroOrNot(){

		switch (hero) {
		case "Captain America":
			System.out.println("Captain America is a super hero");			
			break;

		case "Iron Man":
			System.out.println("Iron Man is a super hero");
			break;
			
		case "Spider Man":
			System.out.println("Spider Man is a super hero");
			break;
			
		default:
			System.out.println(hero + " Sorry i don't know about this person!!!");

		}
	}

	public static void main(String[] args) {

		MyHero myhero = new MyHero();
		myhero.heroOrNot();

	}

}
