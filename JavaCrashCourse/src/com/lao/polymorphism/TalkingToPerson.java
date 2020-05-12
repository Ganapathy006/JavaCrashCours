package com.lao.polymorphism;

public class TalkingToPerson {  //Overloading otherwise called as compile polymorphism,static polymorphism and earlybinding

	public void talk(Parents talkingstyle){
		System.out.println("Polite...Respectful!!!");
	}
	
	public void talk(Partner talkingstyle){
		System.out.println("Love...Romantic!!!");
	}
	
	public void talk(Boss talkingstyle){
		System.out.println("Nothing Personal!!!");
	}
	
	public static void main(String[] args) {
		
		TalkingToPerson talking = new TalkingToPerson();
		Parents parents = new Parents();
		talking.talk(parents);
		
		Boss boss = new Boss();
		talking.talk(boss);
		
		Partner partner = new Partner();
		talking.talk(partner);

	}

}
